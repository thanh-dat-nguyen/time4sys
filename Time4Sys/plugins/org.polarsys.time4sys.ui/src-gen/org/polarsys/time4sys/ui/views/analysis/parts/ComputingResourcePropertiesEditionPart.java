/*******************************************************************************
 * Copyright (c) 2016, 2017 Artal Technologies and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Aurelien Didier (Artal Technologies) - initial API and implementation
 *******************************************************************************/
/**
 * Generated with Acceleo
 */
package org.polarsys.time4sys.ui.views.analysis.parts;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


/**
 * 
 * @generated
 */
public interface ComputingResourcePropertiesEditionPart {

	/**
	 * @return the name
	 * @generated
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * @generated
	 */
	public void setName(String newValue);


	/**
	 * @return the scheduler
	 * @generated
	 */
	public EObject getScheduler();

	/**
	 * Init the scheduler
	 * @param settings the combo setting
	 */
	public void initScheduler(EObjectFlatComboSettings settings);

	/**
	 * Defines a new scheduler
	 * @param newValue the new scheduler to set
	 * @generated
	 */
	public void setScheduler(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setSchedulerButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the scheduler edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToScheduler(ViewerFilter filter);

	/**
	 * Adds the given filter to the scheduler edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToScheduler(ViewerFilter filter);


	/**
	 * @return the parent
	 * @generated
	 */
	public EObject getParent_();

	/**
	 * Init the parent
	 * @param settings the combo setting
	 */
	public void initParent_(EObjectFlatComboSettings settings);

	/**
	 * Defines a new parent
	 * @param newValue the new parent to set
	 * @generated
	 */
	public void setParent_(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * @generated
	 */
	public void setParent_ButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the parent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToParent_(ViewerFilter filter);

	/**
	 * Adds the given filter to the parent edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToParent_(ViewerFilter filter);


	/**
	 * @return the speedFactor
	 * @generated
	 */
	public String getSpeedFactor();

	/**
	 * Defines a new speedFactor
	 * @param newValue the new speedFactor to set
	 * @generated
	 */
	public void setSpeedFactor(String newValue);


	/**
	 * @return the delay
	 * @generated
	 */
	public String getDelay();

	/**
	 * Defines a new delay
	 * @param newValue the new delay to set
	 * @generated
	 */
	public void setDelay(String newValue);




	/**
	 * Init the tasksAffectedOn
	 * @param settings settings for the tasksAffectedOn ReferencesTable 
	 */
	public void initTasksAffectedOn(ReferencesTableSettings settings);

	/**
	 * Update the tasksAffectedOn
	 * @param newValue the tasksAffectedOn to update
	 * @generated
	 */
	public void updateTasksAffectedOn();

	/**
	 * Adds the given filter to the tasksAffectedOn edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToTasksAffectedOn(ViewerFilter filter);

	/**
	 * Adds the given filter to the tasksAffectedOn edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToTasksAffectedOn(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the tasksAffectedOn table
	 * @generated
	 */
	public boolean isContainedInTasksAffectedOnTable(EObject element);




	/**
	 * Init the linkedBy
	 * @param settings settings for the linkedBy ReferencesTable 
	 */
	public void initLinkedBy(ReferencesTableSettings settings);

	/**
	 * Update the linkedBy
	 * @param newValue the linkedBy to update
	 * @generated
	 */
	public void updateLinkedBy();

	/**
	 * Adds the given filter to the linkedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addFilterToLinkedBy(ViewerFilter filter);

	/**
	 * Adds the given filter to the linkedBy edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * @generated
	 */
	public void addBusinessFilterToLinkedBy(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the linkedBy table
	 * @generated
	 */
	public boolean isContainedInLinkedByTable(EObject element);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * @generated
	 */
	public String getTitle();


}
