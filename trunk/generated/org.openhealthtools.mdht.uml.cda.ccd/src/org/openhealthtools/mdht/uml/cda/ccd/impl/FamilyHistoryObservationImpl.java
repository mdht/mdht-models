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
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FamilyHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryObservationImpl extends ObservationImpl implements FamilyHistoryObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.FAMILY_HISTORY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationHasSubjectPatientRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationHasSubjectPatientRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationRelationshipValueCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationRelationshipValueCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationHasRelatedSubjectCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationHasRelatedSubjectCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationRelatedSubjectCodeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationRelatedSubjectCodeValueSet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationHasRelatedSubjectSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationHasRelatedSubjectSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationHasGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationHasGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationRelatedSubjectBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationRelatedSubjectBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationAgeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationAgeObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservationProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryObservationOperations.validateFamilyHistoryObservationProblemStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return FamilyHistoryObservationOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation getProblemStatusObservation() {
		return FamilyHistoryObservationOperations.getProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // FamilyHistoryObservationImpl
