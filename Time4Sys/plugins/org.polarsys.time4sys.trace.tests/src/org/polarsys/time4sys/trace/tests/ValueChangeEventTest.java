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
package org.polarsys.time4sys.trace.tests;

import junit.textui.TestRunner;

import org.polarsys.time4sys.trace.TraceFactory;
import org.polarsys.time4sys.trace.ValueChangeEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Value Change Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValueChangeEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ValueChangeEventTest.class);
	}

	/**
	 * Constructs a new Value Change Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueChangeEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Value Change Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ValueChangeEvent getFixture() {
		return (ValueChangeEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TraceFactory.eINSTANCE.createValueChangeEvent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ValueChangeEventTest
