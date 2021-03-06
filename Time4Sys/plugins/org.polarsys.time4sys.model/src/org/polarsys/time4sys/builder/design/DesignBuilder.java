/*******************************************************************************
 * Copyright (c) 2017 RealTime-at-Work and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Loïc Fejoz - initial API and implementation
 *******************************************************************************/
/**
 * 
 */
package org.polarsys.time4sys.builder.design;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.BehaviorScenario;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.PeriodicPattern;
import org.polarsys.time4sys.marte.gqam.PrecedenceRelation;
import org.polarsys.time4sys.marte.gqam.SlidingWindowPattern;
import org.polarsys.time4sys.marte.gqam.Step;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.gqam.WorkloadEvent;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.Resource;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.grm.ResourcePackageableElement;
import org.polarsys.time4sys.marte.hrm.HardwareProcessor;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.model.time4sys.Project;

/**
 * @author loic
 *
 */
public class DesignBuilder {
	
	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;

	private DesignModel design;

	/**
	 * 
	 */
	public DesignBuilder(final DesignModel model) {
		design = model;
		if (model == null) {
			design = df.createDesignModel();
			WorkloadBehavior behavior = gqamFactory.createWorkloadBehavior();
			design.setWorkloadBehavior(behavior);
			ResourcePackage resPkg = grmFactory.createResourcePackage();
			design.setResourcePackage(resPkg);
		}
	}

	public ProcessorBuilder hasAProcessor() {
		HardwareProcessor proc = hrmFactory.createHardwareProcessor();
		design.getResourcePackage().getOwnedElement().add(proc);
		return new ProcessorBuilder(this, proc);
	}

	public WorkloadEventBuilder hasAPeriodicEvent(final String periodValue) {
		final Duration period = nfpFactory.createDurationFromString(periodValue);
		final WorkloadEvent taskActivation = gqamFactory.createWorkloadEvent();
		design.getWorkloadBehavior().getDemand().add(taskActivation);
		PeriodicPattern pattern = gqamFactory.createPeriodicPattern();
		pattern.setPeriod(period);
		taskActivation.setPattern(pattern);
		return new WorkloadEventBuilder(this, taskActivation);
	}
	
	public WorkloadEventBuilder hasASlidingWindowEvent(int nbEvents, final String windowSizeValue) {
		final Duration windowSize = nfpFactory.createDurationFromString(windowSizeValue);
		final WorkloadEvent taskActivation = gqamFactory.createWorkloadEvent();
		design.getWorkloadBehavior().getDemand().add(taskActivation);
		final SlidingWindowPattern pattern = gqamFactory.createSlidingWindowPattern();
		pattern.setWindowSize(windowSize);
		pattern.setNbEvents(nbEvents);
		taskActivation.setPattern(pattern);
		return new WorkloadEventBuilder(this, taskActivation);
	}

	public DesignModel build() {
		return design;
	}

	public int countTasks() {
		return countTasks(design);
	}
	

	private static int countTasks(final DesignModel design) {
		assert(design != null);
		assert(design.getResourcePackage() != null);
		return countTasks(design.getResourcePackage().getOwnedElement());
	}

	private static  int countTasks(final List<? extends ResourcePackageableElement> elts) {
		int t = 0;
		for(ResourcePackageableElement elt: elts) {
			if (elt instanceof SoftwareSchedulableResource) {
				t++;
			}
			if (elt instanceof Resource) {
				t += countTasks(((Resource)elt).getOwnedResource());
			}
		}
		return t;
	}

	public TaskBuilder task(final String name) {
		final SoftwareSchedulableResource task = searchTask(design.getResourcePackage().getOwnedElement(), name);
		if (task == null) {
			return null;
		}
		return new TaskBuilder(this, task);
	}

	private static  SoftwareSchedulableResource searchTask(final List<? extends ResourcePackageableElement> elts, final String name) {
		for(ResourcePackageableElement elt: elts) {
			if (elt instanceof SoftwareSchedulableResource) {
				if (name.equals(((SoftwareSchedulableResource)elt).getName())) {
					return (SoftwareSchedulableResource)elt;
				}
			}
			if (elt instanceof Resource) {
				final SoftwareSchedulableResource sub = searchTask(((Resource)elt).getOwnedResource(), name);
				if (sub != null) {
					return sub;
				}
			}
		}
		return null;
	}

	public Collection<Step> allSteps() {
		final HashSet<Step> steps = new HashSet<>();
		for(BehaviorScenario behav: design.getWorkloadBehavior().getBehavior()) {
			if (behav instanceof Step) {
				steps.add((Step)behav);
			}
			steps.addAll(behav.getSteps());
		}
		return steps;
	}

	public int countSteps() {
		return allSteps().size();
	}

	public StepBuilder step(String name) {
		for(Step step: allSteps()) {
			if (name.equals(step.getName())) {
				return new StepBuilder(this, task(step.getConcurRes().getName()), step);
			}
		}
		throw new IllegalStateException("Step must have been already declared");
	}

	public StepBuilder aStep() {
		return new StepBuilder(this, null);
	}

	public int countPrecedenceRelations() {
		int c = 0;
		for(BehaviorScenario behav: design.getWorkloadBehavior().getBehavior()) {
			c += behav.getConnectors().size();
		}
		return c;
	}

	public PrecedenceRelationBuilder hasAPrecedenceRelation() {
		return new PrecedenceRelationBuilder(this);
	}

	public BehaviorScenario getMainScenario() {
		if (build().getWorkloadBehavior().getBehavior().isEmpty()) {
			final BehaviorScenario mainScenario = gqamFactory.createBehaviorScenario();
			mainScenario.setName("main");
			build().getWorkloadBehavior().getBehavior().add(mainScenario);
		}
		return build().getWorkloadBehavior().getBehavior().get(0);
	}

	public DesignBuilder called(String name) {
		design.setName(name);
		return this;
	}

	public List<PrecedenceRelation> allPrecedenceRelations() {
		final List<PrecedenceRelation> result = new LinkedList<>();
		for(BehaviorScenario behav: design.getWorkloadBehavior().getBehavior()) {
			result.addAll(behav.getConnectors());
		}
		return result;
	}

}
