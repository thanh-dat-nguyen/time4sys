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
package org.polarsys.time4sys.marte.gqam;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.polarsys.time4sys.marte.grm.GrmPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Same as the UML 2.5 Pin with isControl=true.
 * <!-- end-model-doc -->
 * @see org.polarsys.time4sys.marte.gqam.GqamFactory
 * @model kind="package"
 * @generated
 */
public interface GqamPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gqam";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.polarsys.org/time4sys/marte/gqam/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gqam";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GqamPackage eINSTANCE = org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl <em>Behavior Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getBehaviorScenario()
	 * @generated
	 */
	int BEHAVIOR_SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__NAME = GrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__STEPS = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__CAUSE = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__ROOT = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__PARENT_STEP = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__CONNECTORS = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__RESP_TIME = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__BEST_CET = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO__WORST_CET = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Behavior Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO_FEATURE_COUNT = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Behavior Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_SCENARIO_OPERATION_COUNT = GrmPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadEventImpl <em>Workload Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.WorkloadEventImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getWorkloadEvent()
	 * @generated
	 */
	int WORKLOAD_EVENT = 16;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.StepImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = BEHAVIOR_SCENARIO__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STEPS = BEHAVIOR_SCENARIO__STEPS;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CAUSE = BEHAVIOR_SCENARIO__CAUSE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ROOT = BEHAVIOR_SCENARIO__ROOT;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PARENT_STEP = BEHAVIOR_SCENARIO__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CONNECTORS = BEHAVIOR_SCENARIO__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RESP_TIME = BEHAVIOR_SCENARIO__RESP_TIME;

	/**
	 * The feature id for the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__BEST_CET = BEHAVIOR_SCENARIO__BEST_CET;

	/**
	 * The feature id for the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WORST_CET = BEHAVIOR_SCENARIO__WORST_CET;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IS_ATOMIC = BEHAVIOR_SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__BLOCKING_TIME = BEHAVIOR_SCENARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__REPETITIONS = BEHAVIOR_SCENARIO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PROBABILITY = BEHAVIOR_SCENARIO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PRIORITY = BEHAVIOR_SCENARIO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Service Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SERVICE_COUNT = BEHAVIOR_SCENARIO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SCENARIO = BEHAVIOR_SCENARIO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CHILD_SCENARIO = BEHAVIOR_SCENARIO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Input Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INPUT_REL = BEHAVIOR_SCENARIO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Output Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTPUT_REL = BEHAVIOR_SCENARIO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CONCUR_RES = BEHAVIOR_SCENARIO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__INPUTPIN = BEHAVIOR_SCENARIO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OUTPUTPIN = BEHAVIOR_SCENARIO_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = BEHAVIOR_SCENARIO_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = BEHAVIOR_SCENARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.PrecedenceRelationImpl <em>Precedence Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.PrecedenceRelationImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getPrecedenceRelation()
	 * @generated
	 */
	int PRECEDENCE_RELATION = 9;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadBehaviorImpl <em>Workload Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.WorkloadBehaviorImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getWorkloadBehavior()
	 * @generated
	 */
	int WORKLOAD_BEHAVIOR = 17;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.CommunicationStepImpl <em>Communication Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.CommunicationStepImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getCommunicationStep()
	 * @generated
	 */
	int COMMUNICATION_STEP = 5;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.AcquireStepImpl <em>Acquire Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.AcquireStepImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getAcquireStep()
	 * @generated
	 */
	int ACQUIRE_STEP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__STEPS = STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__CAUSE = STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__ROOT = STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__PARENT_STEP = STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__CONNECTORS = STEP__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__RESP_TIME = STEP__RESP_TIME;

	/**
	 * The feature id for the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__BEST_CET = STEP__BEST_CET;

	/**
	 * The feature id for the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__WORST_CET = STEP__WORST_CET;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__IS_ATOMIC = STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__BLOCKING_TIME = STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__REPETITIONS = STEP__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__PROBABILITY = STEP__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__PRIORITY = STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Service Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__SERVICE_COUNT = STEP__SERVICE_COUNT;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__SCENARIO = STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__CHILD_SCENARIO = STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Input Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__INPUT_REL = STEP__INPUT_REL;

	/**
	 * The feature id for the '<em><b>Output Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__OUTPUT_REL = STEP__OUTPUT_REL;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__CONCUR_RES = STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__INPUTPIN = STEP__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__OUTPUTPIN = STEP__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Acq Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__ACQ_RES = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP__RES_UNITS = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Acquire Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Acquire Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACQUIRE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.ReleaseStepImpl <em>Release Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.ReleaseStepImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getReleaseStep()
	 * @generated
	 */
	int RELEASE_STEP = 11;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.RequestedServiceImpl <em>Requested Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.RequestedServiceImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getRequestedService()
	 * @generated
	 */
	int REQUESTED_SERVICE = 12;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.ExecutionStepImpl <em>Execution Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.ExecutionStepImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getExecutionStep()
	 * @generated
	 */
	int EXECUTION_STEP = 7;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl <em>Arrival Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getArrivalPattern()
	 * @generated
	 */
	int ARRIVAL_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__PARENT = 0;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__JITTER = 1;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__PHASE = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN__REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>Arrival Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Arrival Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRIVAL_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl <em>Burst Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getBurstPattern()
	 * @generated
	 */
	int BURST_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__PARENT = ARRIVAL_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__JITTER = ARRIVAL_PATTERN__JITTER;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__PHASE = ARRIVAL_PATTERN__PHASE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__REFERENCE = ARRIVAL_PATTERN__REFERENCE;

	/**
	 * The feature id for the '<em><b>Min Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__MIN_INTERARRIVAL = ARRIVAL_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__MAX_INTERARRIVAL = ARRIVAL_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Event Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__MIN_EVENT_INTERVAL = ARRIVAL_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Event Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__MAX_EVENT_INTERVAL = ARRIVAL_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Burst Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN__BURST_SIZE = ARRIVAL_PATTERN_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Burst Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN_FEATURE_COUNT = ARRIVAL_PATTERN_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Set Outer Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN___SET_OUTER_PERIOD__DURATION = ARRIVAL_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Inner Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN___SET_INNER_PERIOD__DURATION = ARRIVAL_PATTERN_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Burst Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_PATTERN_OPERATION_COUNT = ARRIVAL_PATTERN_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.ClosedPatternImpl <em>Closed Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.ClosedPatternImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getClosedPattern()
	 * @generated
	 */
	int CLOSED_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN__PARENT = ARRIVAL_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN__JITTER = ARRIVAL_PATTERN__JITTER;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN__PHASE = ARRIVAL_PATTERN__PHASE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN__REFERENCE = ARRIVAL_PATTERN__REFERENCE;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN__POPULATION = ARRIVAL_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ext Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN__EXT_DELAY = ARRIVAL_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Closed Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN_FEATURE_COUNT = ARRIVAL_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Closed Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_PATTERN_OPERATION_COUNT = ARRIVAL_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__STEPS = STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__CAUSE = STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__ROOT = STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__PARENT_STEP = STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__CONNECTORS = STEP__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__RESP_TIME = STEP__RESP_TIME;

	/**
	 * The feature id for the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__BEST_CET = STEP__BEST_CET;

	/**
	 * The feature id for the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__WORST_CET = STEP__WORST_CET;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__IS_ATOMIC = STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__BLOCKING_TIME = STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__REPETITIONS = STEP__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__PROBABILITY = STEP__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__PRIORITY = STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Service Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__SERVICE_COUNT = STEP__SERVICE_COUNT;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__SCENARIO = STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__CHILD_SCENARIO = STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Input Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__INPUT_REL = STEP__INPUT_REL;

	/**
	 * The feature id for the '<em><b>Output Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__OUTPUT_REL = STEP__OUTPUT_REL;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__CONCUR_RES = STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__INPUTPIN = STEP__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__OUTPUTPIN = STEP__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__MSG_SIZE = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Com Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP__COM_RES = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Communication Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Communication Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.PeriodicPatternImpl <em>Periodic Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.PeriodicPatternImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getPeriodicPattern()
	 * @generated
	 */
	int PERIODIC_PATTERN = 8;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.SporadicPatternImpl <em>Sporadic Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.SporadicPatternImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getSporadicPattern()
	 * @generated
	 */
	int SPORADIC_PATTERN = 14;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl <em>End To End Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getEndToEndFlow()
	 * @generated
	 */
	int END_TO_END_FLOW = 6;

	/**
	 * The feature id for the '<em><b>End To End Stimuli</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__END_TO_END_STIMULI = 0;

	/**
	 * The feature id for the '<em><b>End To End Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__END_TO_END_SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Is Schedulable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__IS_SCHEDULABLE = 2;

	/**
	 * The feature id for the '<em><b>Schedulability Slack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__SCHEDULABILITY_SLACK = 3;

	/**
	 * The feature id for the '<em><b>End To End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__END_TO_END_TIME = 4;

	/**
	 * The feature id for the '<em><b>End To End Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW__END_TO_END_DEADLINE = 5;

	/**
	 * The number of structural features of the '<em>End To End Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>End To End Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TO_END_FLOW_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__STEPS = STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__CAUSE = STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__ROOT = STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__PARENT_STEP = STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__CONNECTORS = STEP__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__RESP_TIME = STEP__RESP_TIME;

	/**
	 * The feature id for the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__BEST_CET = STEP__BEST_CET;

	/**
	 * The feature id for the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__WORST_CET = STEP__WORST_CET;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__IS_ATOMIC = STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__BLOCKING_TIME = STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__REPETITIONS = STEP__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__PROBABILITY = STEP__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__PRIORITY = STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Service Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__SERVICE_COUNT = STEP__SERVICE_COUNT;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__SCENARIO = STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__CHILD_SCENARIO = STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Input Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__INPUT_REL = STEP__INPUT_REL;

	/**
	 * The feature id for the '<em><b>Output Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__OUTPUT_REL = STEP__OUTPUT_REL;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__CONCUR_RES = STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__INPUTPIN = STEP__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP__OUTPUTPIN = STEP__OUTPUTPIN;

	/**
	 * The number of structural features of the '<em>Execution Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Execution Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__PARENT = ARRIVAL_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__JITTER = ARRIVAL_PATTERN__JITTER;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__PHASE = ARRIVAL_PATTERN__PHASE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__REFERENCE = ARRIVAL_PATTERN__REFERENCE;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__PERIOD = ARRIVAL_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occurences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN__OCCURENCES = ARRIVAL_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Periodic Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN_FEATURE_COUNT = ARRIVAL_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Periodic Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_PATTERN_OPERATION_COUNT = ARRIVAL_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predec</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_RELATION__PREDEC = 0;

	/**
	 * The feature id for the '<em><b>Succes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_RELATION__SUCCES = 1;

	/**
	 * The feature id for the '<em><b>Connector Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_RELATION__CONNECTOR_KIND = 2;

	/**
	 * The number of structural features of the '<em>Precedence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Precedence Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.ReferenceImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 10;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__REFERENCE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__STEPS = STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__CAUSE = STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__ROOT = STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__PARENT_STEP = STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__CONNECTORS = STEP__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__RESP_TIME = STEP__RESP_TIME;

	/**
	 * The feature id for the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__BEST_CET = STEP__BEST_CET;

	/**
	 * The feature id for the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__WORST_CET = STEP__WORST_CET;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__IS_ATOMIC = STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__BLOCKING_TIME = STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__REPETITIONS = STEP__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__PROBABILITY = STEP__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__PRIORITY = STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Service Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__SERVICE_COUNT = STEP__SERVICE_COUNT;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__SCENARIO = STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__CHILD_SCENARIO = STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Input Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__INPUT_REL = STEP__INPUT_REL;

	/**
	 * The feature id for the '<em><b>Output Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__OUTPUT_REL = STEP__OUTPUT_REL;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__CONCUR_RES = STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__INPUTPIN = STEP__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__OUTPUTPIN = STEP__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Rel Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__REL_RES = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP__RES_UNITS = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Release Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Release Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_STEP_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__STEPS = STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__CAUSE = STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__ROOT = STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__PARENT_STEP = STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__CONNECTORS = STEP__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__RESP_TIME = STEP__RESP_TIME;

	/**
	 * The feature id for the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__BEST_CET = STEP__BEST_CET;

	/**
	 * The feature id for the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__WORST_CET = STEP__WORST_CET;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__IS_ATOMIC = STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__BLOCKING_TIME = STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__REPETITIONS = STEP__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__PROBABILITY = STEP__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__PRIORITY = STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Service Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__SERVICE_COUNT = STEP__SERVICE_COUNT;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__SCENARIO = STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__CHILD_SCENARIO = STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Input Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__INPUT_REL = STEP__INPUT_REL;

	/**
	 * The feature id for the '<em><b>Output Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__OUTPUT_REL = STEP__OUTPUT_REL;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__CONCUR_RES = STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__INPUTPIN = STEP__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE__OUTPUTPIN = STEP__OUTPUTPIN;

	/**
	 * The number of structural features of the '<em>Requested Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE_FEATURE_COUNT = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requested Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUESTED_SERVICE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.SlidingWindowPatternImpl <em>Sliding Window Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.SlidingWindowPatternImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getSlidingWindowPattern()
	 * @generated
	 */
	int SLIDING_WINDOW_PATTERN = 13;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_PATTERN__PARENT = ARRIVAL_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_PATTERN__JITTER = ARRIVAL_PATTERN__JITTER;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_PATTERN__PHASE = ARRIVAL_PATTERN__PHASE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_PATTERN__REFERENCE = ARRIVAL_PATTERN__REFERENCE;

	/**
	 * The feature id for the '<em><b>Window Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_PATTERN__WINDOW_SIZE = ARRIVAL_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nb Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_PATTERN__NB_EVENTS = ARRIVAL_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sliding Window Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_PATTERN_FEATURE_COUNT = ARRIVAL_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sliding Window Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDING_WINDOW_PATTERN_OPERATION_COUNT = ARRIVAL_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__PARENT = ARRIVAL_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__JITTER = ARRIVAL_PATTERN__JITTER;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__PHASE = ARRIVAL_PATTERN__PHASE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__REFERENCE = ARRIVAL_PATTERN__REFERENCE;

	/**
	 * The feature id for the '<em><b>Min Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__MIN_INTERARRIVAL = ARRIVAL_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN__MAX_INTERARRIVAL = ARRIVAL_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sporadic Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN_FEATURE_COUNT = ARRIVAL_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sporadic Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_PATTERN_OPERATION_COUNT = ARRIVAL_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_EVENT__NAME = GrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_EVENT__EFFECT = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_EVENT__PATTERN = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Workload Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_EVENT_FEATURE_COUNT = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Workload Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_EVENT_OPERATION_COUNT = GrmPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_BEHAVIOR__NAME = GrmPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_BEHAVIOR__BEHAVIOR = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Demand</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_BEHAVIOR__DEMAND = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_BEHAVIOR__REFERENCES = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workload Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_BEHAVIOR_FEATURE_COUNT = GrmPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workload Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_BEHAVIOR_OPERATION_COUNT = GrmPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.DelayImpl <em>Delay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.DelayImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getDelay()
	 * @generated
	 */
	int DELAY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__STEPS = STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CAUSE = STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__ROOT = STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__PARENT_STEP = STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONNECTORS = STEP__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Resp Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__RESP_TIME = STEP__RESP_TIME;

	/**
	 * The feature id for the '<em><b>Best CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__BEST_CET = STEP__BEST_CET;

	/**
	 * The feature id for the '<em><b>Worst CET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__WORST_CET = STEP__WORST_CET;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__IS_ATOMIC = STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Blocking Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__BLOCKING_TIME = STEP__BLOCKING_TIME;

	/**
	 * The feature id for the '<em><b>Repetitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__REPETITIONS = STEP__REPETITIONS;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__PROBABILITY = STEP__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__PRIORITY = STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Service Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__SERVICE_COUNT = STEP__SERVICE_COUNT;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__SCENARIO = STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CHILD_SCENARIO = STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Input Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__INPUT_REL = STEP__INPUT_REL;

	/**
	 * The feature id for the '<em><b>Output Rel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__OUTPUT_REL = STEP__OUTPUT_REL;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__CONCUR_RES = STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Inputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__INPUTPIN = STEP__INPUTPIN;

	/**
	 * The feature id for the '<em><b>Outputpin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__OUTPUTPIN = STEP__OUTPUTPIN;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY__DURATION = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAY_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.MultiplicityElementImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getMultiplicityElement()
	 * @generated
	 */
	int MULTIPLICITY_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Multiplicity Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.ControlPinImpl <em>Control Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.ControlPinImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getControlPin()
	 * @generated
	 */
	int CONTROL_PIN = 20;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PIN__LOWER_BOUND = MULTIPLICITY_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PIN__UPPER_BOUND = MULTIPLICITY_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PIN__PATTERN = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PIN_FEATURE_COUNT = MULTIPLICITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Control Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PIN_OPERATION_COUNT = MULTIPLICITY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.InputPinImpl <em>Input Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.InputPinImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getInputPin()
	 * @generated
	 */
	int INPUT_PIN = 21;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__LOWER_BOUND = CONTROL_PIN__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__UPPER_BOUND = CONTROL_PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__PATTERN = CONTROL_PIN__PATTERN;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN__PREDECESSORS = CONTROL_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_FEATURE_COUNT = CONTROL_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Input Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PIN_OPERATION_COUNT = CONTROL_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.OutputPinImpl <em>Output Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.OutputPinImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getOutputPin()
	 * @generated
	 */
	int OUTPUT_PIN = 22;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__LOWER_BOUND = CONTROL_PIN__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__UPPER_BOUND = CONTROL_PIN__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__PATTERN = CONTROL_PIN__PATTERN;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN__SUCCESSORS = CONTROL_PIN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_FEATURE_COUNT = CONTROL_PIN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PIN_OPERATION_COUNT = CONTROL_PIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.impl.OnceImpl <em>Once</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.impl.OnceImpl
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getOnce()
	 * @generated
	 */
	int ONCE = 23;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE__PARENT = ARRIVAL_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Jitter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE__JITTER = ARRIVAL_PATTERN__JITTER;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE__PHASE = ARRIVAL_PATTERN__PHASE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE__REFERENCE = ARRIVAL_PATTERN__REFERENCE;

	/**
	 * The number of structural features of the '<em>Once</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE_FEATURE_COUNT = ARRIVAL_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Once</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONCE_OPERATION_COUNT = ARRIVAL_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.polarsys.time4sys.marte.gqam.ConnectorKind <em>Connector Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.gqam.ConnectorKind
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getConnectorKind()
	 * @generated
	 */
	int CONNECTOR_KIND = 24;

	/**
	 * The meta object id for the '<em>NFP Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getNFP_Duration()
	 * @generated
	 */
	int NFP_DURATION = 25;


	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario <em>Behavior Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Scenario</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario
	 * @generated
	 */
	EClass getBehaviorScenario();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getSteps()
	 * @see #getBehaviorScenario()
	 * @generated
	 */
	EReference getBehaviorScenario_Steps();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cause</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getCause()
	 * @see #getBehaviorScenario()
	 * @generated
	 */
	EReference getBehaviorScenario_Cause();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getRoot()
	 * @see #getBehaviorScenario()
	 * @generated
	 */
	EReference getBehaviorScenario_Root();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getParentStep <em>Parent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Step</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getParentStep()
	 * @see #getBehaviorScenario()
	 * @generated
	 */
	EReference getBehaviorScenario_ParentStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getConnectors()
	 * @see #getBehaviorScenario()
	 * @generated
	 */
	EReference getBehaviorScenario_Connectors();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getRespTime <em>Resp Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resp Time</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getRespTime()
	 * @see #getBehaviorScenario()
	 * @generated
	 */
	EAttribute getBehaviorScenario_RespTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getBestCET <em>Best CET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Best CET</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getBestCET()
	 * @see #getBehaviorScenario()
	 * @generated
	 */
	EAttribute getBehaviorScenario_BestCET();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.BehaviorScenario#getWorstCET <em>Worst CET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worst CET</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BehaviorScenario#getWorstCET()
	 * @see #getBehaviorScenario()
	 * @generated
	 */
	EAttribute getBehaviorScenario_WorstCET();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.BurstPattern <em>Burst Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Burst Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern
	 * @generated
	 */
	EClass getBurstPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMinInterarrival <em>Min Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Interarrival</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#getMinInterarrival()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EAttribute getBurstPattern_MinInterarrival();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMaxInterarrival <em>Max Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interarrival</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#getMaxInterarrival()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EAttribute getBurstPattern_MaxInterarrival();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMinEventInterval <em>Min Event Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Event Interval</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#getMinEventInterval()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EAttribute getBurstPattern_MinEventInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getMaxEventInterval <em>Max Event Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Event Interval</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#getMaxEventInterval()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EAttribute getBurstPattern_MaxEventInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#getBurstSize <em>Burst Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Burst Size</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#getBurstSize()
	 * @see #getBurstPattern()
	 * @generated
	 */
	EAttribute getBurstPattern_BurstSize();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#setOuterPeriod(org.polarsys.time4sys.marte.nfp.Duration) <em>Set Outer Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Outer Period</em>' operation.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#setOuterPeriod(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getBurstPattern__SetOuterPeriod__Duration();

	/**
	 * Returns the meta object for the '{@link org.polarsys.time4sys.marte.gqam.BurstPattern#setInnerPeriod(org.polarsys.time4sys.marte.nfp.Duration) <em>Set Inner Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Inner Period</em>' operation.
	 * @see org.polarsys.time4sys.marte.gqam.BurstPattern#setInnerPeriod(org.polarsys.time4sys.marte.nfp.Duration)
	 * @generated
	 */
	EOperation getBurstPattern__SetInnerPeriod__Duration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.ClosedPattern <em>Closed Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ClosedPattern
	 * @generated
	 */
	EClass getClosedPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.ClosedPattern#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ClosedPattern#getPopulation()
	 * @see #getClosedPattern()
	 * @generated
	 */
	EAttribute getClosedPattern_Population();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.ClosedPattern#getExtDelay <em>Ext Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext Delay</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ClosedPattern#getExtDelay()
	 * @see #getClosedPattern()
	 * @generated
	 */
	EAttribute getClosedPattern_ExtDelay();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent <em>Workload Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Event</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadEvent
	 * @generated
	 */
	EClass getWorkloadEvent();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effect</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadEvent#getEffect()
	 * @see #getWorkloadEvent()
	 * @generated
	 */
	EReference getWorkloadEvent_Effect();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.marte.gqam.WorkloadEvent#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadEvent#getPattern()
	 * @see #getWorkloadEvent()
	 * @generated
	 */
	EReference getWorkloadEvent_Pattern();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.marte.gqam.Step#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Scenario</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getScenario()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Scenario();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.Step#getChildScenario <em>Child Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Scenario</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getChildScenario()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ChildScenario();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.Step#getOutputRel <em>Output Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Rel</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getOutputRel()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_OutputRel();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.Step#getConcurRes <em>Concur Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concur Res</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getConcurRes()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_ConcurRes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.gqam.Step#getInputpin <em>Inputpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputpin</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getInputpin()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Inputpin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.gqam.Step#getOutputpin <em>Outputpin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputpin</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getOutputpin()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Outputpin();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.Step#getInputRel <em>Input Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Rel</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getInputRel()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_InputRel();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.Step#isIsAtomic <em>Is Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Atomic</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#isIsAtomic()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_IsAtomic();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.Step#getBlockingTime <em>Blocking Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking Time</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getBlockingTime()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_BlockingTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.Step#getRepetitions <em>Repetitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetitions</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getRepetitions()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Repetitions();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.Step#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getProbability()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Probability();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.Step#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getPriority()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Priority();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.Step#getServiceCount <em>Service Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Count</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Step#getServiceCount()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_ServiceCount();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation <em>Precedence Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Relation</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.PrecedenceRelation
	 * @generated
	 */
	EClass getPrecedenceRelation();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getPredec <em>Predec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predec</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getPredec()
	 * @see #getPrecedenceRelation()
	 * @generated
	 */
	EReference getPrecedenceRelation_Predec();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getSucces <em>Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Succes</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getSucces()
	 * @see #getPrecedenceRelation()
	 * @generated
	 */
	EReference getPrecedenceRelation_Succes();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getConnectorKind <em>Connector Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connector Kind</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.PrecedenceRelation#getConnectorKind()
	 * @see #getPrecedenceRelation()
	 * @generated
	 */
	EAttribute getPrecedenceRelation_ConnectorKind();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior <em>Workload Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Behavior</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadBehavior
	 * @generated
	 */
	EClass getWorkloadBehavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getBehavior()
	 * @see #getWorkloadBehavior()
	 * @generated
	 */
	EReference getWorkloadBehavior_Behavior();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getDemand <em>Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Demand</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getDemand()
	 * @see #getWorkloadBehavior()
	 * @generated
	 */
	EReference getWorkloadBehavior_Demand();

	/**
	 * Returns the meta object for the containment reference list '{@link org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.WorkloadBehavior#getReferences()
	 * @see #getWorkloadBehavior()
	 * @generated
	 */
	EReference getWorkloadBehavior_References();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.Delay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delay</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Delay
	 * @generated
	 */
	EClass getDelay();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.Delay#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Delay#getDuration()
	 * @see #getDelay()
	 * @generated
	 */
	EAttribute getDelay_Duration();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Element</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.MultiplicityElement
	 * @generated
	 */
	EClass getMultiplicityElement();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.MultiplicityElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.MultiplicityElement#getLowerBound()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.MultiplicityElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.MultiplicityElement#getUpperBound()
	 * @see #getMultiplicityElement()
	 * @generated
	 */
	EAttribute getMultiplicityElement_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.ControlPin <em>Control Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Pin</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ControlPin
	 * @generated
	 */
	EClass getControlPin();

	/**
	 * Returns the meta object for the containment reference '{@link org.polarsys.time4sys.marte.gqam.ControlPin#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ControlPin#getPattern()
	 * @see #getControlPin()
	 * @generated
	 */
	EReference getControlPin_Pattern();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.InputPin <em>Input Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pin</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.InputPin
	 * @generated
	 */
	EClass getInputPin();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.gqam.InputPin#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.InputPin#getPredecessors()
	 * @see #getInputPin()
	 * @generated
	 */
	EReference getInputPin_Predecessors();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.OutputPin <em>Output Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pin</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.OutputPin
	 * @generated
	 */
	EClass getOutputPin();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.gqam.OutputPin#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.OutputPin#getSuccessors()
	 * @see #getOutputPin()
	 * @generated
	 */
	EReference getOutputPin_Successors();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.Once <em>Once</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Once</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Once
	 * @generated
	 */
	EClass getOnce();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.CommunicationStep <em>Communication Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Step</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.CommunicationStep
	 * @generated
	 */
	EClass getCommunicationStep();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.CommunicationStep#getMsgSize <em>Msg Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg Size</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.CommunicationStep#getMsgSize()
	 * @see #getCommunicationStep()
	 * @generated
	 */
	EAttribute getCommunicationStep_MsgSize();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.CommunicationStep#getComRes <em>Com Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Com Res</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.CommunicationStep#getComRes()
	 * @see #getCommunicationStep()
	 * @generated
	 */
	EReference getCommunicationStep_ComRes();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.AcquireStep <em>Acquire Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acquire Step</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.AcquireStep
	 * @generated
	 */
	EClass getAcquireStep();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.AcquireStep#getAcqRes <em>Acq Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acq Res</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.AcquireStep#getAcqRes()
	 * @see #getAcquireStep()
	 * @generated
	 */
	EReference getAcquireStep_AcqRes();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.AcquireStep#getResUnits <em>Res Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Units</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.AcquireStep#getResUnits()
	 * @see #getAcquireStep()
	 * @generated
	 */
	EAttribute getAcquireStep_ResUnits();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.ReleaseStep <em>Release Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release Step</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ReleaseStep
	 * @generated
	 */
	EClass getReleaseStep();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.ReleaseStep#getRelRes <em>Rel Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rel Res</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ReleaseStep#getRelRes()
	 * @see #getReleaseStep()
	 * @generated
	 */
	EReference getReleaseStep_RelRes();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.ReleaseStep#getResUnits <em>Res Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Units</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ReleaseStep#getResUnits()
	 * @see #getReleaseStep()
	 * @generated
	 */
	EAttribute getReleaseStep_ResUnits();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.RequestedService <em>Requested Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requested Service</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.RequestedService
	 * @generated
	 */
	EClass getRequestedService();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern <em>Sliding Window Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sliding Window Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.SlidingWindowPattern
	 * @generated
	 */
	EClass getSlidingWindowPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern#getWindowSize <em>Window Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Window Size</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.SlidingWindowPattern#getWindowSize()
	 * @see #getSlidingWindowPattern()
	 * @generated
	 */
	EAttribute getSlidingWindowPattern_WindowSize();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.SlidingWindowPattern#getNbEvents <em>Nb Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Events</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.SlidingWindowPattern#getNbEvents()
	 * @see #getSlidingWindowPattern()
	 * @generated
	 */
	EAttribute getSlidingWindowPattern_NbEvents();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.ExecutionStep <em>Execution Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Step</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ExecutionStep
	 * @generated
	 */
	EClass getExecutionStep();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern <em>Arrival Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arrival Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ArrivalPattern
	 * @generated
	 */
	EClass getArrivalPattern();

	/**
	 * Returns the meta object for the container reference '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ArrivalPattern#getParent()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Parent();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getJitter <em>Jitter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jitter</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ArrivalPattern#getJitter()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EAttribute getArrivalPattern_Jitter();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ArrivalPattern#getPhase()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EAttribute getArrivalPattern_Phase();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.ArrivalPattern#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ArrivalPattern#getReference()
	 * @see #getArrivalPattern()
	 * @generated
	 */
	EReference getArrivalPattern_Reference();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.PeriodicPattern <em>Periodic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.PeriodicPattern
	 * @generated
	 */
	EClass getPeriodicPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.PeriodicPattern#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.PeriodicPattern#getPeriod()
	 * @see #getPeriodicPattern()
	 * @generated
	 */
	EAttribute getPeriodicPattern_Period();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.PeriodicPattern#getOccurences <em>Occurences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurences</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.PeriodicPattern#getOccurences()
	 * @see #getPeriodicPattern()
	 * @generated
	 */
	EAttribute getPeriodicPattern_Occurences();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.SporadicPattern <em>Sporadic Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic Pattern</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.SporadicPattern
	 * @generated
	 */
	EClass getSporadicPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.SporadicPattern#getMinInterarrival <em>Min Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Interarrival</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.SporadicPattern#getMinInterarrival()
	 * @see #getSporadicPattern()
	 * @generated
	 */
	EAttribute getSporadicPattern_MinInterarrival();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.SporadicPattern#getMaxInterarrival <em>Max Interarrival</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interarrival</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.SporadicPattern#getMaxInterarrival()
	 * @see #getSporadicPattern()
	 * @generated
	 */
	EAttribute getSporadicPattern_MaxInterarrival();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.EndToEndFlow <em>End To End Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End To End Flow</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.EndToEndFlow
	 * @generated
	 */
	EClass getEndToEndFlow();

	/**
	 * Returns the meta object for the reference list '{@link org.polarsys.time4sys.marte.gqam.EndToEndFlow#getEndToEndStimuli <em>End To End Stimuli</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End To End Stimuli</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.EndToEndFlow#getEndToEndStimuli()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EReference getEndToEndFlow_EndToEndStimuli();

	/**
	 * Returns the meta object for the reference '{@link org.polarsys.time4sys.marte.gqam.EndToEndFlow#getEndToEndScenario <em>End To End Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End To End Scenario</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.EndToEndFlow#getEndToEndScenario()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EReference getEndToEndFlow_EndToEndScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.EndToEndFlow#isIsSchedulable <em>Is Schedulable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Schedulable</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.EndToEndFlow#isIsSchedulable()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EAttribute getEndToEndFlow_IsSchedulable();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.EndToEndFlow#getSchedulabilitySlack <em>Schedulability Slack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedulability Slack</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.EndToEndFlow#getSchedulabilitySlack()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EAttribute getEndToEndFlow_SchedulabilitySlack();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.EndToEndFlow#getEndToEndTime <em>End To End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End To End Time</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.EndToEndFlow#getEndToEndTime()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EAttribute getEndToEndFlow_EndToEndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.EndToEndFlow#getEndToEndDeadline <em>End To End Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End To End Deadline</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.EndToEndFlow#getEndToEndDeadline()
	 * @see #getEndToEndFlow()
	 * @generated
	 */
	EAttribute getEndToEndFlow_EndToEndDeadline();

	/**
	 * Returns the meta object for class '{@link org.polarsys.time4sys.marte.gqam.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link org.polarsys.time4sys.marte.gqam.Reference#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.Reference#getReferenceName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_ReferenceName();

	/**
	 * Returns the meta object for enum '{@link org.polarsys.time4sys.marte.gqam.ConnectorKind <em>Connector Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connector Kind</em>'.
	 * @see org.polarsys.time4sys.marte.gqam.ConnectorKind
	 * @generated
	 */
	EEnum getConnectorKind();

	/**
	 * Returns the meta object for data type '{@link org.polarsys.time4sys.marte.nfp.Duration <em>NFP Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>NFP Duration</em>'.
	 * @see org.polarsys.time4sys.marte.nfp.Duration
	 * @model instanceClass="org.polarsys.time4sys.marte.nfp.Duration"
	 * @generated
	 */
	EDataType getNFP_Duration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GqamFactory getGqamFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl <em>Behavior Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.BehaviorScenarioImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getBehaviorScenario()
		 * @generated
		 */
		EClass BEHAVIOR_SCENARIO = eINSTANCE.getBehaviorScenario();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SCENARIO__STEPS = eINSTANCE.getBehaviorScenario_Steps();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SCENARIO__CAUSE = eINSTANCE.getBehaviorScenario_Cause();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SCENARIO__ROOT = eINSTANCE.getBehaviorScenario_Root();

		/**
		 * The meta object literal for the '<em><b>Parent Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SCENARIO__PARENT_STEP = eINSTANCE.getBehaviorScenario_ParentStep();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_SCENARIO__CONNECTORS = eINSTANCE.getBehaviorScenario_Connectors();

		/**
		 * The meta object literal for the '<em><b>Resp Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_SCENARIO__RESP_TIME = eINSTANCE.getBehaviorScenario_RespTime();

		/**
		 * The meta object literal for the '<em><b>Best CET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_SCENARIO__BEST_CET = eINSTANCE.getBehaviorScenario_BestCET();

		/**
		 * The meta object literal for the '<em><b>Worst CET</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_SCENARIO__WORST_CET = eINSTANCE.getBehaviorScenario_WorstCET();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl <em>Burst Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.BurstPatternImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getBurstPattern()
		 * @generated
		 */
		EClass BURST_PATTERN = eINSTANCE.getBurstPattern();

		/**
		 * The meta object literal for the '<em><b>Min Interarrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST_PATTERN__MIN_INTERARRIVAL = eINSTANCE.getBurstPattern_MinInterarrival();

		/**
		 * The meta object literal for the '<em><b>Max Interarrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST_PATTERN__MAX_INTERARRIVAL = eINSTANCE.getBurstPattern_MaxInterarrival();

		/**
		 * The meta object literal for the '<em><b>Min Event Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST_PATTERN__MIN_EVENT_INTERVAL = eINSTANCE.getBurstPattern_MinEventInterval();

		/**
		 * The meta object literal for the '<em><b>Max Event Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST_PATTERN__MAX_EVENT_INTERVAL = eINSTANCE.getBurstPattern_MaxEventInterval();

		/**
		 * The meta object literal for the '<em><b>Burst Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BURST_PATTERN__BURST_SIZE = eINSTANCE.getBurstPattern_BurstSize();

		/**
		 * The meta object literal for the '<em><b>Set Outer Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BURST_PATTERN___SET_OUTER_PERIOD__DURATION = eINSTANCE.getBurstPattern__SetOuterPeriod__Duration();

		/**
		 * The meta object literal for the '<em><b>Set Inner Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BURST_PATTERN___SET_INNER_PERIOD__DURATION = eINSTANCE.getBurstPattern__SetInnerPeriod__Duration();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.ClosedPatternImpl <em>Closed Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.ClosedPatternImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getClosedPattern()
		 * @generated
		 */
		EClass CLOSED_PATTERN = eINSTANCE.getClosedPattern();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSED_PATTERN__POPULATION = eINSTANCE.getClosedPattern_Population();

		/**
		 * The meta object literal for the '<em><b>Ext Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSED_PATTERN__EXT_DELAY = eINSTANCE.getClosedPattern_ExtDelay();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadEventImpl <em>Workload Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.WorkloadEventImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getWorkloadEvent()
		 * @generated
		 */
		EClass WORKLOAD_EVENT = eINSTANCE.getWorkloadEvent();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_EVENT__EFFECT = eINSTANCE.getWorkloadEvent_Effect();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_EVENT__PATTERN = eINSTANCE.getWorkloadEvent_Pattern();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.StepImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__SCENARIO = eINSTANCE.getStep_Scenario();

		/**
		 * The meta object literal for the '<em><b>Child Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__CHILD_SCENARIO = eINSTANCE.getStep_ChildScenario();

		/**
		 * The meta object literal for the '<em><b>Output Rel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTPUT_REL = eINSTANCE.getStep_OutputRel();

		/**
		 * The meta object literal for the '<em><b>Concur Res</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__CONCUR_RES = eINSTANCE.getStep_ConcurRes();

		/**
		 * The meta object literal for the '<em><b>Inputpin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INPUTPIN = eINSTANCE.getStep_Inputpin();

		/**
		 * The meta object literal for the '<em><b>Outputpin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__OUTPUTPIN = eINSTANCE.getStep_Outputpin();

		/**
		 * The meta object literal for the '<em><b>Input Rel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__INPUT_REL = eINSTANCE.getStep_InputRel();

		/**
		 * The meta object literal for the '<em><b>Is Atomic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IS_ATOMIC = eINSTANCE.getStep_IsAtomic();

		/**
		 * The meta object literal for the '<em><b>Blocking Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__BLOCKING_TIME = eINSTANCE.getStep_BlockingTime();

		/**
		 * The meta object literal for the '<em><b>Repetitions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__REPETITIONS = eINSTANCE.getStep_Repetitions();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__PROBABILITY = eINSTANCE.getStep_Probability();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__PRIORITY = eINSTANCE.getStep_Priority();

		/**
		 * The meta object literal for the '<em><b>Service Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__SERVICE_COUNT = eINSTANCE.getStep_ServiceCount();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.PrecedenceRelationImpl <em>Precedence Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.PrecedenceRelationImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getPrecedenceRelation()
		 * @generated
		 */
		EClass PRECEDENCE_RELATION = eINSTANCE.getPrecedenceRelation();

		/**
		 * The meta object literal for the '<em><b>Predec</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_RELATION__PREDEC = eINSTANCE.getPrecedenceRelation_Predec();

		/**
		 * The meta object literal for the '<em><b>Succes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRECEDENCE_RELATION__SUCCES = eINSTANCE.getPrecedenceRelation_Succes();

		/**
		 * The meta object literal for the '<em><b>Connector Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRECEDENCE_RELATION__CONNECTOR_KIND = eINSTANCE.getPrecedenceRelation_ConnectorKind();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.WorkloadBehaviorImpl <em>Workload Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.WorkloadBehaviorImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getWorkloadBehavior()
		 * @generated
		 */
		EClass WORKLOAD_BEHAVIOR = eINSTANCE.getWorkloadBehavior();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_BEHAVIOR__BEHAVIOR = eINSTANCE.getWorkloadBehavior_Behavior();

		/**
		 * The meta object literal for the '<em><b>Demand</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_BEHAVIOR__DEMAND = eINSTANCE.getWorkloadBehavior_Demand();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_BEHAVIOR__REFERENCES = eINSTANCE.getWorkloadBehavior_References();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.DelayImpl <em>Delay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.DelayImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getDelay()
		 * @generated
		 */
		EClass DELAY = eINSTANCE.getDelay();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAY__DURATION = eINSTANCE.getDelay_Duration();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.MultiplicityElementImpl <em>Multiplicity Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.MultiplicityElementImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getMultiplicityElement()
		 * @generated
		 */
		EClass MULTIPLICITY_ELEMENT = eINSTANCE.getMultiplicityElement();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__LOWER_BOUND = eINSTANCE.getMultiplicityElement_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_ELEMENT__UPPER_BOUND = eINSTANCE.getMultiplicityElement_UpperBound();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.ControlPinImpl <em>Control Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.ControlPinImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getControlPin()
		 * @generated
		 */
		EClass CONTROL_PIN = eINSTANCE.getControlPin();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PIN__PATTERN = eINSTANCE.getControlPin_Pattern();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.InputPinImpl <em>Input Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.InputPinImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getInputPin()
		 * @generated
		 */
		EClass INPUT_PIN = eINSTANCE.getInputPin();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PIN__PREDECESSORS = eINSTANCE.getInputPin_Predecessors();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.OutputPinImpl <em>Output Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.OutputPinImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getOutputPin()
		 * @generated
		 */
		EClass OUTPUT_PIN = eINSTANCE.getOutputPin();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PIN__SUCCESSORS = eINSTANCE.getOutputPin_Successors();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.OnceImpl <em>Once</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.OnceImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getOnce()
		 * @generated
		 */
		EClass ONCE = eINSTANCE.getOnce();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.CommunicationStepImpl <em>Communication Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.CommunicationStepImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getCommunicationStep()
		 * @generated
		 */
		EClass COMMUNICATION_STEP = eINSTANCE.getCommunicationStep();

		/**
		 * The meta object literal for the '<em><b>Msg Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_STEP__MSG_SIZE = eINSTANCE.getCommunicationStep_MsgSize();

		/**
		 * The meta object literal for the '<em><b>Com Res</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_STEP__COM_RES = eINSTANCE.getCommunicationStep_ComRes();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.AcquireStepImpl <em>Acquire Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.AcquireStepImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getAcquireStep()
		 * @generated
		 */
		EClass ACQUIRE_STEP = eINSTANCE.getAcquireStep();

		/**
		 * The meta object literal for the '<em><b>Acq Res</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACQUIRE_STEP__ACQ_RES = eINSTANCE.getAcquireStep_AcqRes();

		/**
		 * The meta object literal for the '<em><b>Res Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACQUIRE_STEP__RES_UNITS = eINSTANCE.getAcquireStep_ResUnits();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.ReleaseStepImpl <em>Release Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.ReleaseStepImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getReleaseStep()
		 * @generated
		 */
		EClass RELEASE_STEP = eINSTANCE.getReleaseStep();

		/**
		 * The meta object literal for the '<em><b>Rel Res</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE_STEP__REL_RES = eINSTANCE.getReleaseStep_RelRes();

		/**
		 * The meta object literal for the '<em><b>Res Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE_STEP__RES_UNITS = eINSTANCE.getReleaseStep_ResUnits();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.RequestedServiceImpl <em>Requested Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.RequestedServiceImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getRequestedService()
		 * @generated
		 */
		EClass REQUESTED_SERVICE = eINSTANCE.getRequestedService();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.SlidingWindowPatternImpl <em>Sliding Window Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.SlidingWindowPatternImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getSlidingWindowPattern()
		 * @generated
		 */
		EClass SLIDING_WINDOW_PATTERN = eINSTANCE.getSlidingWindowPattern();

		/**
		 * The meta object literal for the '<em><b>Window Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDING_WINDOW_PATTERN__WINDOW_SIZE = eINSTANCE.getSlidingWindowPattern_WindowSize();

		/**
		 * The meta object literal for the '<em><b>Nb Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLIDING_WINDOW_PATTERN__NB_EVENTS = eINSTANCE.getSlidingWindowPattern_NbEvents();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.ExecutionStepImpl <em>Execution Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.ExecutionStepImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getExecutionStep()
		 * @generated
		 */
		EClass EXECUTION_STEP = eINSTANCE.getExecutionStep();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl <em>Arrival Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.ArrivalPatternImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getArrivalPattern()
		 * @generated
		 */
		EClass ARRIVAL_PATTERN = eINSTANCE.getArrivalPattern();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__PARENT = eINSTANCE.getArrivalPattern_Parent();

		/**
		 * The meta object literal for the '<em><b>Jitter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRIVAL_PATTERN__JITTER = eINSTANCE.getArrivalPattern_Jitter();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARRIVAL_PATTERN__PHASE = eINSTANCE.getArrivalPattern_Phase();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRIVAL_PATTERN__REFERENCE = eINSTANCE.getArrivalPattern_Reference();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.PeriodicPatternImpl <em>Periodic Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.PeriodicPatternImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getPeriodicPattern()
		 * @generated
		 */
		EClass PERIODIC_PATTERN = eINSTANCE.getPeriodicPattern();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_PATTERN__PERIOD = eINSTANCE.getPeriodicPattern_Period();

		/**
		 * The meta object literal for the '<em><b>Occurences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_PATTERN__OCCURENCES = eINSTANCE.getPeriodicPattern_Occurences();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.SporadicPatternImpl <em>Sporadic Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.SporadicPatternImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getSporadicPattern()
		 * @generated
		 */
		EClass SPORADIC_PATTERN = eINSTANCE.getSporadicPattern();

		/**
		 * The meta object literal for the '<em><b>Min Interarrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_PATTERN__MIN_INTERARRIVAL = eINSTANCE.getSporadicPattern_MinInterarrival();

		/**
		 * The meta object literal for the '<em><b>Max Interarrival</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC_PATTERN__MAX_INTERARRIVAL = eINSTANCE.getSporadicPattern_MaxInterarrival();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl <em>End To End Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.EndToEndFlowImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getEndToEndFlow()
		 * @generated
		 */
		EClass END_TO_END_FLOW = eINSTANCE.getEndToEndFlow();

		/**
		 * The meta object literal for the '<em><b>End To End Stimuli</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW__END_TO_END_STIMULI = eINSTANCE.getEndToEndFlow_EndToEndStimuli();

		/**
		 * The meta object literal for the '<em><b>End To End Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TO_END_FLOW__END_TO_END_SCENARIO = eINSTANCE.getEndToEndFlow_EndToEndScenario();

		/**
		 * The meta object literal for the '<em><b>Is Schedulable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_FLOW__IS_SCHEDULABLE = eINSTANCE.getEndToEndFlow_IsSchedulable();

		/**
		 * The meta object literal for the '<em><b>Schedulability Slack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_FLOW__SCHEDULABILITY_SLACK = eINSTANCE.getEndToEndFlow_SchedulabilitySlack();

		/**
		 * The meta object literal for the '<em><b>End To End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_FLOW__END_TO_END_TIME = eINSTANCE.getEndToEndFlow_EndToEndTime();

		/**
		 * The meta object literal for the '<em><b>End To End Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TO_END_FLOW__END_TO_END_DEADLINE = eINSTANCE.getEndToEndFlow_EndToEndDeadline();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.impl.ReferenceImpl
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__REFERENCE_NAME = eINSTANCE.getReference_ReferenceName();

		/**
		 * The meta object literal for the '{@link org.polarsys.time4sys.marte.gqam.ConnectorKind <em>Connector Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.gqam.ConnectorKind
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getConnectorKind()
		 * @generated
		 */
		EEnum CONNECTOR_KIND = eINSTANCE.getConnectorKind();

		/**
		 * The meta object literal for the '<em>NFP Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.polarsys.time4sys.marte.nfp.Duration
		 * @see org.polarsys.time4sys.marte.gqam.impl.GqamPackageImpl#getNFP_Duration()
		 * @generated
		 */
		EDataType NFP_DURATION = eINSTANCE.getNFP_Duration();

	}

} //GqamPackage
