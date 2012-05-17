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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantMedicalConditionHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relevant Medical Condition History Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhcrRelevantMedicalConditionHistoryObservationImpl extends ObservationImpl implements PhcrRelevantMedicalConditionHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrRelevantMedicalConditionHistoryObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemObservation> getProblemObservations() {
		return PhcrRelevantMedicalConditionHistoryObservationOperations.getProblemObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhcrRelevantMedicalConditionHistoryObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //PhcrRelevantMedicalConditionHistoryObservationImpl
