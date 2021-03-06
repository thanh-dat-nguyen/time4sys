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
package org.polarsys.time4sys.ui.srm.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import org.polarsys.time4sys.marte.grm.GrmPackage;
import org.polarsys.time4sys.marte.grm.ResourceService;

import org.polarsys.time4sys.marte.srm.NotificationResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import org.polarsys.time4sys.ui.views.srm.parts.OtherPropertiesEditionPart;
import org.polarsys.time4sys.ui.views.srm.parts.SrmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class NotificationResourceOtherPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String OTHER_PART = "Other"; //$NON-NLS-1$

	
	/**
	 * Settings for pServices ReferencesTable
	 */
	protected ReferencesTableSettings pServicesSettings;
	
	/**
	 * Settings for rServices ReferencesTable
	 */
	private ReferencesTableSettings rServicesSettings;
	
	/**
	 * Settings for createServices ReferencesTable
	 */
	private ReferencesTableSettings createServicesSettings;
	
	/**
	 * Settings for deleteServices ReferencesTable
	 */
	private ReferencesTableSettings deleteServicesSettings;
	
	/**
	 * Settings for initializeServices ReferencesTable
	 */
	private ReferencesTableSettings initializeServicesSettings;
	
	/**
	 * Settings for flushServices ReferencesTable
	 */
	private ReferencesTableSettings flushServicesSettings;
	
	/**
	 * Settings for signalServices ReferencesTable
	 */
	private ReferencesTableSettings signalServicesSettings;
	
	/**
	 * Settings for waitServices ReferencesTable
	 */
	private ReferencesTableSettings waitServicesSettings;
	
	/**
	 * Settings for clearServices ReferencesTable
	 */
	private ReferencesTableSettings clearServicesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public NotificationResourceOtherPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject notificationResource, String editing_mode) {
		super(editingContext, notificationResource, editing_mode);
		parts = new String[] { OTHER_PART };
		repositoryKey = SrmViewsRepository.class;
		partKey = SrmViewsRepository.Other.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final NotificationResource notificationResource = (NotificationResource)elt;
			final OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(SrmViewsRepository.Other.Properties.packetSize)) {
				otherPart.setPacketSize(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, notificationResource.getPacketSize()));
			}
			
			if (isAccessible(SrmViewsRepository.Other.Properties.pServices)) {
				pServicesSettings = new ReferencesTableSettings(notificationResource, GrmPackage.eINSTANCE.getResource_PServices());
				otherPart.initPServices(pServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.rServices)) {
				rServicesSettings = new ReferencesTableSettings(notificationResource, GrmPackage.eINSTANCE.getResource_RServices());
				otherPart.initRServices(rServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.createServices)) {
				createServicesSettings = new ReferencesTableSettings(notificationResource, SrmPackage.eINSTANCE.getSoftwareResource_CreateServices());
				otherPart.initCreateServices(createServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.deleteServices)) {
				deleteServicesSettings = new ReferencesTableSettings(notificationResource, SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices());
				otherPart.initDeleteServices(deleteServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.initializeServices)) {
				initializeServicesSettings = new ReferencesTableSettings(notificationResource, SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices());
				otherPart.initInitializeServices(initializeServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction)) {
				otherPart.setIsIntraMemoryPartitionInteraction(notificationResource.isIsIntraMemoryPartitionInteraction());
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.flushServices)) {
				flushServicesSettings = new ReferencesTableSettings(notificationResource, SrmPackage.eINSTANCE.getNotificationResource_FlushServices());
				otherPart.initFlushServices(flushServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.signalServices)) {
				signalServicesSettings = new ReferencesTableSettings(notificationResource, SrmPackage.eINSTANCE.getNotificationResource_SignalServices());
				otherPart.initSignalServices(signalServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.waitServices)) {
				waitServicesSettings = new ReferencesTableSettings(notificationResource, SrmPackage.eINSTANCE.getNotificationResource_WaitServices());
				otherPart.initWaitServices(waitServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.clearServices)) {
				clearServicesSettings = new ReferencesTableSettings(notificationResource, SrmPackage.eINSTANCE.getNotificationResource_ClearServices());
				otherPart.initClearServices(clearServicesSettings);
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.maskElements))
				otherPart.setMaskElements(notificationResource.getMaskElements());
			
			// init filters
			
			if (isAccessible(SrmViewsRepository.Other.Properties.pServices)) {
				otherPart.addFilterToPServices(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof ResourceService); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for pServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.rServices)) {
				otherPart.addFilterToRServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for rServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.createServices)) {
				otherPart.addFilterToCreateServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for createServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.deleteServices)) {
				otherPart.addFilterToDeleteServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for deleteServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.initializeServices)) {
				otherPart.addFilterToInitializeServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for initializeServices
				// End of user code
			}
			
			if (isAccessible(SrmViewsRepository.Other.Properties.flushServices)) {
				otherPart.addFilterToFlushServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for flushServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.signalServices)) {
				otherPart.addFilterToSignalServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for signalServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.waitServices)) {
				otherPart.addFilterToWaitServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for waitServices
				// End of user code
			}
			if (isAccessible(SrmViewsRepository.Other.Properties.clearServices)) {
				otherPart.addFilterToClearServices(new EObjectFilter(GrmPackage.Literals.RESOURCE_SERVICE));
				// Start of user code for additional businessfilters for clearServices
				// End of user code
			}
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}















	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == SrmViewsRepository.Other.Properties.packetSize) {
			return GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.pServices) {
			return GrmPackage.eINSTANCE.getResource_PServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.rServices) {
			return GrmPackage.eINSTANCE.getResource_RServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.createServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_CreateServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.deleteServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.initializeServices) {
			return SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction) {
			return SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.flushServices) {
			return SrmPackage.eINSTANCE.getNotificationResource_FlushServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.signalServices) {
			return SrmPackage.eINSTANCE.getNotificationResource_SignalServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.waitServices) {
			return SrmPackage.eINSTANCE.getNotificationResource_WaitServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.clearServices) {
			return SrmPackage.eINSTANCE.getNotificationResource_ClearServices();
		}
		if (editorKey == SrmViewsRepository.Other.Properties.maskElements) {
			return SrmPackage.eINSTANCE.getNotificationResource_MaskElements();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		NotificationResource notificationResource = (NotificationResource)semanticObject;
		if (SrmViewsRepository.Other.Properties.packetSize == event.getAffectedEditor()) {
			notificationResource.setPacketSize((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (SrmViewsRepository.Other.Properties.pServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, pServicesSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				pServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				pServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.rServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					rServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				rServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				rServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.createServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					createServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				createServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				createServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.deleteServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					deleteServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				deleteServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				deleteServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.initializeServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					initializeServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				initializeServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				initializeServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction == event.getAffectedEditor()) {
			notificationResource.setIsIntraMemoryPartitionInteraction((Boolean)event.getNewValue());
		}
		if (SrmViewsRepository.Other.Properties.flushServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					flushServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				flushServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				flushServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.signalServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					signalServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				signalServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				signalServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.waitServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					waitServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				waitServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				waitServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.clearServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ResourceService) {
					clearServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				clearServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				clearServicesSettings.move(event.getNewIndex(), (ResourceService) event.getNewValue());
			}
		}
		if (SrmViewsRepository.Other.Properties.maskElements == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				notificationResource.getMaskElements().clear();
				notificationResource.getMaskElements().addAll(((EList) event.getNewValue()));
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			OtherPropertiesEditionPart otherPart = (OtherPropertiesEditionPart)editingPart;
			if (GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.packetSize)) {
				if (msg.getNewValue() != null) {
					otherPart.setPacketSize(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					otherPart.setPacketSize("");
				}
			}
			if (GrmPackage.eINSTANCE.getResource_PServices().equals(msg.getFeature()) && isAccessible(SrmViewsRepository.Other.Properties.pServices))
				otherPart.updatePServices();
			if (GrmPackage.eINSTANCE.getResource_RServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.rServices))
				otherPart.updateRServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_CreateServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.createServices))
				otherPart.updateCreateServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.deleteServices))
				otherPart.updateDeleteServices();
			if (SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.initializeServices))
				otherPart.updateInitializeServices();
			if (SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction))
				otherPart.setIsIntraMemoryPartitionInteraction((Boolean)msg.getNewValue());
			
			if (SrmPackage.eINSTANCE.getNotificationResource_FlushServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.flushServices))
				otherPart.updateFlushServices();
			if (SrmPackage.eINSTANCE.getNotificationResource_SignalServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.signalServices))
				otherPart.updateSignalServices();
			if (SrmPackage.eINSTANCE.getNotificationResource_WaitServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.waitServices))
				otherPart.updateWaitServices();
			if (SrmPackage.eINSTANCE.getNotificationResource_ClearServices().equals(msg.getFeature())  && isAccessible(SrmViewsRepository.Other.Properties.clearServices))
				otherPart.updateClearServices();
			if (SrmPackage.eINSTANCE.getNotificationResource_MaskElements().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && otherPart != null && isAccessible(SrmViewsRepository.Other.Properties.maskElements)) {
				if (msg.getNewValue() instanceof EList<?>) {
					otherPart.setMaskElements((EList<?>)msg.getNewValue());
				} else if (msg.getNewValue() == null) {
					otherPart.setMaskElements(new BasicEList<Object>());
				} else {
					BasicEList<Object> newValueAsList = new BasicEList<Object>();
					newValueAsList.add(msg.getNewValue());
					otherPart.setMaskElements(newValueAsList);
				}
			}
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize(),
			GrmPackage.eINSTANCE.getResource_PServices(),
			GrmPackage.eINSTANCE.getResource_RServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_CreateServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_DeleteServices(),
			SrmPackage.eINSTANCE.getSoftwareResource_InitializeServices(),
			SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction(),
			SrmPackage.eINSTANCE.getNotificationResource_FlushServices(),
			SrmPackage.eINSTANCE.getNotificationResource_SignalServices(),
			SrmPackage.eINSTANCE.getNotificationResource_WaitServices(),
			SrmPackage.eINSTANCE.getNotificationResource_ClearServices(),
			SrmPackage.eINSTANCE.getNotificationResource_MaskElements()		);
		return new NotificationFilter[] {filter,};
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == SrmViewsRepository.Other.Properties.packetSize || key == SrmViewsRepository.Other.Properties.pServices || key == SrmViewsRepository.Other.Properties.rServices || key == SrmViewsRepository.Other.Properties.createServices || key == SrmViewsRepository.Other.Properties.deleteServices || key == SrmViewsRepository.Other.Properties.initializeServices || key == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction || key == SrmViewsRepository.Other.Properties.flushServices || key == SrmViewsRepository.Other.Properties.signalServices || key == SrmViewsRepository.Other.Properties.waitServices || key == SrmViewsRepository.Other.Properties.clearServices || key == SrmViewsRepository.Other.Properties.maskElements || key == SrmViewsRepository.Other.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == SrmViewsRepository.General.Properties.managedResource || key == SrmViewsRepository.Timing.Properties.resCtrlPolicy || key == SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction || key == SrmViewsRepository.Timing.Properties.policy || key == SrmViewsRepository.Timing.Properties.mechanism;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (SrmViewsRepository.Other.Properties.packetSize == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GrmPackage.eINSTANCE.getCommunicationEndPoint_PacketSize().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Other.Properties.isIntraMemoryPartitionInteraction == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getSoftwareInteractionResource_IsIntraMemoryPartitionInteraction().getEAttributeType(), newValue);
				}
				if (SrmViewsRepository.Other.Properties.maskElements == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(SrmPackage.eINSTANCE.getNotificationResource_MaskElements().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
