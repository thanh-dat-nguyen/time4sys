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
package org.polarsys.time4sys.marte.nfp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.time4sys.marte.nfp.Duration;
import org.polarsys.time4sys.marte.nfp.NfpFactory;
import org.polarsys.time4sys.marte.nfp.NfpPackage;
import org.polarsys.time4sys.marte.nfp.TimeInterval;
import org.polarsys.time4sys.marte.nfp.TimeUnitKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NfpPackageImpl extends EPackageImpl implements NfpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.polarsys.time4sys.marte.nfp.NfpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NfpPackageImpl() {
		super(eNS_URI, NfpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NfpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NfpPackage init() {
		if (isInited) return (NfpPackage)EPackage.Registry.INSTANCE.getEPackage(NfpPackage.eNS_URI);

		// Obtain or create and register package
		NfpPackageImpl theNfpPackage = (NfpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NfpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NfpPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNfpPackage.createPackageContents();

		// Initialize created meta-data
		theNfpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNfpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NfpPackage.eNS_URI, theNfpPackage);
		return theNfpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Value() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Unit() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Best() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Worst() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Clock() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDuration_Precision() {
		return (EAttribute)durationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Add__Duration() {
		return durationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__ConvertToUnit__TimeUnitKind() {
		return durationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Simplify() {
		return durationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Sub__Duration() {
		return durationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__CompareTo__Duration() {
		return durationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__IsZero() {
		return durationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__NotZero() {
		return durationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Max__Duration() {
		return durationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Min__Duration() {
		return durationEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Mul__long() {
		return durationEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Lcm__Duration() {
		return durationEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDuration__Div__Duration() {
		return durationEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_Min() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeInterval_Max() {
		return (EReference)timeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInterval_MinOpen() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeInterval_MaxOpen() {
		return (EAttribute)timeIntervalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeInterval__ComputeLength() {
		return timeIntervalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnitKind() {
		return timeUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfpFactory getNfpFactory() {
		return (NfpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		durationEClass = createEClass(DURATION);
		createEAttribute(durationEClass, DURATION__VALUE);
		createEAttribute(durationEClass, DURATION__UNIT);
		createEAttribute(durationEClass, DURATION__BEST);
		createEAttribute(durationEClass, DURATION__WORST);
		createEAttribute(durationEClass, DURATION__CLOCK);
		createEAttribute(durationEClass, DURATION__PRECISION);
		createEOperation(durationEClass, DURATION___ADD__DURATION);
		createEOperation(durationEClass, DURATION___CONVERT_TO_UNIT__TIMEUNITKIND);
		createEOperation(durationEClass, DURATION___SIMPLIFY);
		createEOperation(durationEClass, DURATION___SUB__DURATION);
		createEOperation(durationEClass, DURATION___COMPARE_TO__DURATION);
		createEOperation(durationEClass, DURATION___IS_ZERO);
		createEOperation(durationEClass, DURATION___NOT_ZERO);
		createEOperation(durationEClass, DURATION___MAX__DURATION);
		createEOperation(durationEClass, DURATION___MIN__DURATION);
		createEOperation(durationEClass, DURATION___MUL__LONG);
		createEOperation(durationEClass, DURATION___LCM__DURATION);
		createEOperation(durationEClass, DURATION___DIV__DURATION);

		timeIntervalEClass = createEClass(TIME_INTERVAL);
		createEReference(timeIntervalEClass, TIME_INTERVAL__MIN);
		createEReference(timeIntervalEClass, TIME_INTERVAL__MAX);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__MIN_OPEN);
		createEAttribute(timeIntervalEClass, TIME_INTERVAL__MAX_OPEN);
		createEOperation(timeIntervalEClass, TIME_INTERVAL___COMPUTE_LENGTH);

		// Create enums
		timeUnitKindEEnum = createEEnum(TIME_UNIT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDuration_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Unit(), this.getTimeUnitKind(), "unit", "millisecond", 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Best(), ecorePackage.getEDouble(), "best", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Worst(), ecorePackage.getEDouble(), "worst", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Clock(), ecorePackage.getEString(), "clock", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDuration_Precision(), ecorePackage.getEDouble(), "precision", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDuration__Add__Duration(), this.getDuration(), "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__ConvertToUnit__TimeUnitKind(), this.getDuration(), "convertToUnit", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTimeUnitKind(), "unit", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDuration__Simplify(), this.getDuration(), "simplify", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Sub__Duration(), this.getDuration(), "sub", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__CompareTo__Duration(), ecorePackage.getEInt(), "compareTo", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "anotherDuration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDuration__IsZero(), ecorePackage.getEBoolean(), "isZero", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDuration__NotZero(), ecorePackage.getEBoolean(), "notZero", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Max__Duration(), this.getDuration(), "max", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Min__Duration(), this.getDuration(), "min", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Mul__long(), this.getDuration(), "mul", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Lcm__Duration(), this.getDuration(), "lcm", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDuration__Div__Duration(), ecorePackage.getEDouble(), "div", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDuration(), "v", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeInterval_Min(), this.getDuration(), null, "min", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeInterval_Max(), this.getDuration(), null, "max", null, 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInterval_MinOpen(), ecorePackage.getEBoolean(), "minOpen", "false", 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeInterval_MaxOpen(), ecorePackage.getEBoolean(), "maxOpen", "false", 1, 1, TimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeInterval__ComputeLength(), this.getDuration(), "computeLength", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(timeUnitKindEEnum, TimeUnitKind.class, "TimeUnitKind");
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.PS);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.NS);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.US);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.MS);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.S);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.MN);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.H);
		addEEnumLiteral(timeUnitKindEEnum, TimeUnitKind.D);

		// Create resource
		createResource(eNS_URI);
	}

} //NfpPackageImpl
