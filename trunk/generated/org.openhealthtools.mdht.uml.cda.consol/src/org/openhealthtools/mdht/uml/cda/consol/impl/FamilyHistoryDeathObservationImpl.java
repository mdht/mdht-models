/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AgeObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryDeathObservationOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family History Death Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FamilyHistoryDeathObservationImpl extends ObservationImpl implements FamilyHistoryDeathObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyHistoryDeathObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FAMILY_HISTORY_DEATH_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationHasSubjectPatientRelationship(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationHasSubjectPatientRelationship(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationRelationshipValueCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationRelationshipValueCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationHasRelatedSubjectCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationHasRelatedSubjectCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationRelatedSubjectCodeValueSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationRelatedSubjectCodeValueSet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationHasRelatedSubjectSubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationHasRelatedSubjectSubject(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationHasGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationHasGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationRelatedSubjectBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationRelatedSubjectBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationAgeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationAgeObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryDeathObservationProblemStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationProblemStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgeObservation getAgeObservation() {
		return FamilyHistoryDeathObservationOperations.getAgeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyStatusObservation getProblemStatusObservation() {
		return FamilyHistoryDeathObservationOperations.getProblemStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistoryDeathObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // FamilyHistoryDeathObservationImpl
