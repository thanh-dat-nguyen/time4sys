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
 */
package org.polarsys.time4sys.model.time4sys.tests;

import org.junit.Test;
import org.polarsys.time4sys.analysis.AnalysisFactory;
import org.polarsys.time4sys.analysis.AnalyzedSystem;
import org.polarsys.time4sys.design.DesignFactory;
import org.polarsys.time4sys.design.DesignModel;
import org.polarsys.time4sys.marte.gqam.GqamFactory;
import org.polarsys.time4sys.marte.gqam.WorkloadBehavior;
import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.ResourcePackage;
import org.polarsys.time4sys.marte.hrm.HrmFactory;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.model.time4sys.Project;
import org.polarsys.time4sys.model.time4sys.Time4sysFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Project</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.polarsys.time4sys.model.time4sys.Project#deriveAnalyzedSystem(boolean) <em>Derive Analyzed System</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ProjectTest extends TestCase {

	protected static DesignFactory df = DesignFactory.eINSTANCE;
	protected static GqamFactory gqamFactory = GqamFactory.eINSTANCE;
	protected static SrmFactory srmFactory = SrmFactory.eINSTANCE;
	protected static GrmFactory grmFactory = GrmFactory.eINSTANCE;
	protected static HrmFactory hrmFactory = HrmFactory.eINSTANCE;
	protected static NfpFactory nfpFactory = NfpFactory.eINSTANCE;

	/**
	 * The fixture for this Project test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected Project fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectTest.class);
	}

	/**
	 * Constructs a new Project test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ProjectTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Project test case.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Project fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Project test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Project getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Time4sysFactory.eINSTANCE.createProject());
		DesignModel model = df.createDesignModel();
		WorkloadBehavior behavior = gqamFactory.createWorkloadBehavior();
		model.setWorkloadBehavior(behavior);
		ResourcePackage resPkg = grmFactory.createResourcePackage();
		model.setResourcePackage(resPkg);
		fixture.setDesign(model);
		fixture.setAnalysis(AnalysisFactory.eINSTANCE.createAnalyzedSystem());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '
	 * {@link org.polarsys.time4sys.model.time4sys.Project#deriveAnalyzedSystem(boolean)
	 * <em>Derive Analyzed System</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see org.polarsys.time4sys.model.time4sys.Project#deriveAnalyzedSystem(boolean)
	 * @generated NOT
	 */
	@Test
	public void testDeriveAnalyzedSystem__boolean() {
		final AnalyzedSystem analysedSys = fixture.getAnalysis();
		assert (analysedSys != null);
		final AnalyzedSystem res1 = fixture.deriveAnalyzedSystem(false);
		assertEquals(analysedSys, res1);
		final AnalyzedSystem res2 = fixture.deriveAnalyzedSystem(true);
		assertNotSame(analysedSys, res2);
	}

} // ProjectTest