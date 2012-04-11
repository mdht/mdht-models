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
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PatientConditionDeceasedObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Condition Deceased Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PatientConditionDeceasedObservationImpl extends ObservationImpl implements PatientConditionDeceasedObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientConditionDeceasedObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.PATIENT_CONDITION_DECEASED_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionDeceasedObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionDeceasedObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionDeceasedObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionDeceasedObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionDeceasedObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionDeceasedObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientConditionDeceasedObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PatientConditionDeceasedObservationOperations.validatePatientConditionDeceasedObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientConditionDeceasedObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PatientConditionDeceasedObservationImpl
