/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PatientConditionAliveObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Condition Alive Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientConditionAliveObservationImpl extends ObservationImpl implements PatientConditionAliveObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientConditionAliveObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.PATIENT_CONDITION_ALIVE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionAliveObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionAliveObservationOperations.validatePatientConditionAliveObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionAliveObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PatientConditionAliveObservationImpl
