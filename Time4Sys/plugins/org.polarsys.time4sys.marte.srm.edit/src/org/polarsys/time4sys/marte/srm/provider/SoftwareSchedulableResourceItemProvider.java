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
package org.polarsys.time4sys.marte.srm.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.polarsys.time4sys.marte.grm.GrmFactory;
import org.polarsys.time4sys.marte.grm.GrmPackage;

import org.polarsys.time4sys.marte.grm.provider.SchedulableResourceItemProvider;

import org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource;
import org.polarsys.time4sys.marte.srm.SrmFactory;
import org.polarsys.time4sys.marte.srm.SrmPackage;

/**
 * This is the item provider adapter for a {@link org.polarsys.time4sys.marte.srm.SoftwareSchedulableResource} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftwareSchedulableResourceItemProvider extends SchedulableResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSchedulableResourceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addManagedResourcePropertyDescriptor(object);
			addCreateServicesPropertyDescriptor(object);
			addDeleteServicesPropertyDescriptor(object);
			addInitializeServicesPropertyDescriptor(object);
			addMemorySizeFootprintPropertyDescriptor(object);
			addStateElementsPropertyDescriptor(object);
			addIdentifierElementsPropertyDescriptor(object);
			addActivateServicesPropertyDescriptor(object);
			addResumeServicesPropertyDescriptor(object);
			addSuspendServicesPropertyDescriptor(object);
			addEnableConcurrencyServicesPropertyDescriptor(object);
			addDisableConcurrencyServicesPropertyDescriptor(object);
			addTerminateServicesPropertyDescriptor(object);
			addPeriodElementsPropertyDescriptor(object);
			addActivationCapacityPropertyDescriptor(object);
			addPriorityElementsPropertyDescriptor(object);
			addStackSizeElementsPropertyDescriptor(object);
			addHeapSizeElementsPropertyDescriptor(object);
			addSharedDataResourcesPropertyDescriptor(object);
			addMessageResourcesPropertyDescriptor(object);
			addMutualExclusionResourcesPropertyDescriptor(object);
			addNotificationResourcesPropertyDescriptor(object);
			addEntryPointsPropertyDescriptor(object);
			addArrivalPatternPropertyDescriptor(object);
			addIsStaticSchedulingFeaturePropertyDescriptor(object);
			addIsPreemptablePropertyDescriptor(object);
			addDeadlineElementsPropertyDescriptor(object);
			addDeadlineTypeElementsPropertyDescriptor(object);
			addTimeSliceElementsPropertyDescriptor(object);
			addJoinServicesPropertyDescriptor(object);
			addYieldServicesPropertyDescriptor(object);
			addDelayServicesPropertyDescriptor(object);
			addSchedulerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Managed Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagedResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ResourceManager_managedResource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ResourceManager_managedResource_feature", "_UI_ResourceManager_type"),
				 GrmPackage.Literals.RESOURCE_MANAGER__MANAGED_RESOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_createServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_createServices_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__CREATE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeleteServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_deleteServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_deleteServices_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__DELETE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialize Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializeServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_initializeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_initializeServices_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__INITIALIZE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Size Footprint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemorySizeFootprintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_memorySizeFootprint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_memorySizeFootprint_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__MEMORY_SIZE_FOOTPRINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStateElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_stateElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_stateElements_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__STATE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Identifier Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentifierElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareResource_identifierElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareResource_identifierElements_feature", "_UI_SoftwareResource_type"),
				 SrmPackage.Literals.SOFTWARE_RESOURCE__IDENTIFIER_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activate Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivateServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_activateServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_activateServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resume Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResumeServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_resumeServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_resumeServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__RESUME_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Suspend Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuspendServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_suspendServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_suspendServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__SUSPEND_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Concurrency Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableConcurrencyServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_enableConcurrencyServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_enableConcurrencyServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ENABLE_CONCURRENCY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disable Concurrency Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisableConcurrencyServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_disableConcurrencyServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_disableConcurrencyServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__DISABLE_CONCURRENCY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Terminate Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTerminateServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_terminateServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_terminateServices_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__TERMINATE_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Period Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPeriodElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_periodElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_periodElements_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__PERIOD_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Activation Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivationCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_activationCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_activationCapacity_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ACTIVATION_CAPACITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_priorityElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_priorityElements_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__PRIORITY_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stack Size Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStackSizeElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_stackSizeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_stackSizeElements_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__STACK_SIZE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Heap Size Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeapSizeElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_heapSizeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_heapSizeElements_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__HEAP_SIZE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shared Data Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSharedDataResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_sharedDataResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_sharedDataResources_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__SHARED_DATA_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_messageResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_messageResources_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__MESSAGE_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mutual Exclusion Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutualExclusionResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_mutualExclusionResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_mutualExclusionResources_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__MUTUAL_EXCLUSION_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notification Resources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotificationResourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_notificationResources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_notificationResources_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__NOTIFICATION_RESOURCES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Entry Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEntryPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_entryPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_entryPoints_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ENTRY_POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arrival Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArrivalPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareConcurrentResource_arrivalPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareConcurrentResource_arrivalPattern_feature", "_UI_SoftwareConcurrentResource_type"),
				 SrmPackage.Literals.SOFTWARE_CONCURRENT_RESOURCE__ARRIVAL_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Static Scheduling Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsStaticSchedulingFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_isStaticSchedulingFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_isStaticSchedulingFeature_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Preemptable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPreemptablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_isPreemptable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_isPreemptable_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadline Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadlineElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_deadlineElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_deadlineElements_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deadline Type Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeadlineTypeElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_deadlineTypeElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_deadlineTypeElements_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Slice Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSliceElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_timeSliceElements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_timeSliceElements_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Join Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJoinServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_joinServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_joinServices_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__JOIN_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Yield Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYieldServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_yieldServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_yieldServices_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__YIELD_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delay Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelayServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_delayServices_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_delayServices_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__DELAY_SERVICES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scheduler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftwareSchedulableResource_scheduler_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftwareSchedulableResource_scheduler_feature", "_UI_SoftwareSchedulableResource_type"),
				 SrmPackage.Literals.SOFTWARE_SCHEDULABLE_RESOURCE__SCHEDULER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GrmPackage.Literals.RESOURCE_MANAGER__RES_CTRL_POLICY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SoftwareSchedulableResource.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SoftwareSchedulableResource"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoftwareSchedulableResource)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftwareSchedulableResource_type") :
			getString("_UI_SoftwareSchedulableResource_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SoftwareSchedulableResource.class)) {
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__MEMORY_SIZE_FOOTPRINT:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STATE_ELEMENTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IDENTIFIER_ELEMENTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PERIOD_ELEMENTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ACTIVATION_CAPACITY:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__PRIORITY_ELEMENTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__STACK_SIZE_ELEMENTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__HEAP_SIZE_ELEMENTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ENTRY_POINTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__ARRIVAL_PATTERN:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_STATIC_SCHEDULING_FEATURE:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__IS_PREEMPTABLE:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_ELEMENTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__DEADLINE_TYPE_ELEMENTS:
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__TIME_SLICE_ELEMENTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SrmPackage.SOFTWARE_SCHEDULABLE_RESOURCE__RES_CTRL_POLICY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createInterruptResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createAlarm()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createDeviceBroker()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createMemoryBroker()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createMemoryPartition()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createMessageComResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createNotificationResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSharedDataComResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareArchitecture()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareMutualExclusionResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareSchedulableResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareScheduler()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_RESOURCE,
				 SrmFactory.eINSTANCE.createSoftwareTimerResource()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 SrmFactory.eINSTANCE.createSoftwareAccessService()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__PSERVICES,
				 SrmFactory.eINSTANCE.createSoftwareService()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_PORT,
				 SrmFactory.eINSTANCE.createSoftwarePort()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE__OWNED_CONNECTOR,
				 SrmFactory.eINSTANCE.createSoftwareConnector()));

		newChildDescriptors.add
			(createChildParameter
				(GrmPackage.Literals.RESOURCE_MANAGER__RES_CTRL_POLICY,
				 GrmFactory.eINSTANCE.createResourceControlPolicy()));
	}

}