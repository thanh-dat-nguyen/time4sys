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
package org.polarsys.time4sys.ui.srm.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.jface.viewers.IFilter;

import org.polarsys.time4sys.marte.srm.SoftwareMutualExclusionResource;
import org.polarsys.time4sys.marte.srm.SrmPackage;

import org.polarsys.time4sys.ui.srm.components.SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SoftwareMutualExclusionResourceOtherPropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SoftwareMutualExclusionResourcePropertiesEditionComponent;
import org.polarsys.time4sys.ui.srm.components.SoftwareMutualExclusionResourceTimingPropertiesEditionComponent;

/**
 * 
 * 
 */
public class SoftwareMutualExclusionResourcePropertiesEditionProvider extends PropertiesEditingProviderImpl {

	/**
	 * Constructor without provider for super types.
	 */
	public SoftwareMutualExclusionResourcePropertiesEditionProvider() {
		super();
	}

	/**
	 * Constructor with providers for super types.
	 * @param superProviders providers to use for super types.
	 */
	public SoftwareMutualExclusionResourcePropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
		super(superProviders);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext) {
		return (editingContext.getEObject() instanceof SoftwareMutualExclusionResource) 
					&& (SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE == editingContext.getEObject().eClass());
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public boolean provides(PropertiesEditingContext editingContext, String part) {
		return (editingContext.getEObject() instanceof SoftwareMutualExclusionResource) && (SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) || SoftwareMutualExclusionResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part) || SoftwareMutualExclusionResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof SoftwareMutualExclusionResource) && (refinement == SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent.class || refinement == SoftwareMutualExclusionResourceTimingPropertiesEditionComponent.class || refinement == SoftwareMutualExclusionResourceOtherPropertiesEditionComponent.class);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.Class)
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
		return (editingContext.getEObject() instanceof SoftwareMutualExclusionResource) && ((SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part) && refinement == SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent.class) || (SoftwareMutualExclusionResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part) && refinement == SoftwareMutualExclusionResourceTimingPropertiesEditionComponent.class) || (SoftwareMutualExclusionResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part) && refinement == SoftwareMutualExclusionResourceOtherPropertiesEditionComponent.class));
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode) {
		if (editingContext.getEObject() instanceof SoftwareMutualExclusionResource) {
			return new SoftwareMutualExclusionResourcePropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String)
	 * 
	 */
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part) {
		if (editingContext.getEObject() instanceof SoftwareMutualExclusionResource) {
			if (SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part))
				return new SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SoftwareMutualExclusionResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part))
				return new SoftwareMutualExclusionResourceTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SoftwareMutualExclusionResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part))
				return new SoftwareMutualExclusionResourceOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext, java.lang.String, java.lang.String, java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext, String mode, String part, java.lang.Class refinement) {
		if (editingContext.getEObject() instanceof SoftwareMutualExclusionResource) {
			if (SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent.GENERAL_PART.equals(part)
				&& refinement == SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent.class)
				return new SoftwareMutualExclusionResourceGeneralPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SoftwareMutualExclusionResourceTimingPropertiesEditionComponent.TIMING_PART.equals(part)
				&& refinement == SoftwareMutualExclusionResourceTimingPropertiesEditionComponent.class)
				return new SoftwareMutualExclusionResourceTimingPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
			if (SoftwareMutualExclusionResourceOtherPropertiesEditionComponent.OTHER_PART.equals(part)
				&& refinement == SoftwareMutualExclusionResourceOtherPropertiesEditionComponent.class)
				return new SoftwareMutualExclusionResourceOtherPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
		}
		return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
	}

	/**
	 * Provides the filter used by the plugin.xml to assign part forms.
	 */
	public static class EditionFilter implements IFilter {
	
		/**
		 * {@inheritDoc}
		 * 
		 * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
		 */
		public boolean select(Object toTest) {
			EObject eObj = EEFUtils.resolveSemanticObject(toTest);
			return eObj != null && SrmPackage.Literals.SOFTWARE_MUTUAL_EXCLUSION_RESOURCE == eObj.eClass();
		}
		
	}

}
