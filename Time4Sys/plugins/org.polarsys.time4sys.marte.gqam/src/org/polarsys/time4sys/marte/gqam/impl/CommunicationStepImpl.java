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
package org.polarsys.time4sys.marte.gqam.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.polarsys.time4sys.marte.gqam.CommunicationStep;
import org.polarsys.time4sys.marte.gqam.GqamPackage;

import org.polarsys.time4sys.marte.grm.CommunicationResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.CommunicationStepImpl#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link org.polarsys.time4sys.marte.gqam.impl.CommunicationStepImpl#getComRes <em>Com Res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationStepImpl extends StepImpl implements CommunicationStep {
	/**
	 * The default value of the '{@link #getMsgSize() <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MSG_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMsgSize() <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected int msgSize = MSG_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComRes() <em>Com Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComRes()
	 * @generated
	 * @ordered
	 */
	protected CommunicationResource comRes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GqamPackage.Literals.COMMUNICATION_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMsgSize() {
		return msgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgSize(int newMsgSize) {
		int oldMsgSize = msgSize;
		msgSize = newMsgSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.COMMUNICATION_STEP__MSG_SIZE, oldMsgSize, msgSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationResource getComRes() {
		if (comRes != null && comRes.eIsProxy()) {
			InternalEObject oldComRes = (InternalEObject)comRes;
			comRes = (CommunicationResource)eResolveProxy(oldComRes);
			if (comRes != oldComRes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GqamPackage.COMMUNICATION_STEP__COM_RES, oldComRes, comRes));
			}
		}
		return comRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationResource basicGetComRes() {
		return comRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComRes(CommunicationResource newComRes) {
		CommunicationResource oldComRes = comRes;
		comRes = newComRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GqamPackage.COMMUNICATION_STEP__COM_RES, oldComRes, comRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GqamPackage.COMMUNICATION_STEP__MSG_SIZE:
				return getMsgSize();
			case GqamPackage.COMMUNICATION_STEP__COM_RES:
				if (resolve) return getComRes();
				return basicGetComRes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GqamPackage.COMMUNICATION_STEP__MSG_SIZE:
				setMsgSize((Integer)newValue);
				return;
			case GqamPackage.COMMUNICATION_STEP__COM_RES:
				setComRes((CommunicationResource)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GqamPackage.COMMUNICATION_STEP__MSG_SIZE:
				setMsgSize(MSG_SIZE_EDEFAULT);
				return;
			case GqamPackage.COMMUNICATION_STEP__COM_RES:
				setComRes((CommunicationResource)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GqamPackage.COMMUNICATION_STEP__MSG_SIZE:
				return msgSize != MSG_SIZE_EDEFAULT;
			case GqamPackage.COMMUNICATION_STEP__COM_RES:
				return comRes != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (msgSize: ");
		result.append(msgSize);
		result.append(')');
		return result.toString();
	}

} //CommunicationStepImpl
