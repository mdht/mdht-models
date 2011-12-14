/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyProblemActOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Problem Act</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyProblemActImpl extends ActImpl implements AllergyProblemAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyProblemActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_PROBLEM_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActEntryRelationshipRequired(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActEntryRelationshipRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActSubjectOfTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActSubjectOfTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActContainsProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActContainsProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActContainsAlertObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActContainsAlertObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActContainsPatientAwareness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActContainsPatientAwareness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActEffectiveTimeLowHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActEffectiveTimeLowHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActHasRelatedObservations(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActHasRelatedObservations(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActRelatedObservationsTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActRelatedObservationsTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActHasRelatedReferencesTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActHasRelatedReferencesTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAdverseEventDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAdverseEventDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAdverseEventType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAdverseEventType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAdverseEventTypeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAdverseEventTypeVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAllergyProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAllergyProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAllergyProductTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAllergyProductTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActProductDetailParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActProductDetailParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActProductDetailParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActProductDetailParticipantRoleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActProductDetailPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActProductDetailPlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActProductDetailPlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActProductDetailPlayingEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActProductDetailName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActProductDetailName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActProductCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActProductCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAllergyProductFoodVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAllergyProductFoodVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAllergyProductMedClassVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAllergyProductMedClassVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAllergyProductSpecificMedVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAllergyProductSpecificMedVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActReactionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActReactionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActReactionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActReactionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActReactionCodeVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActReactionCodeVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActSeverityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActSeverityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActSeverityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActSeverityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActSeverityCodeVocab(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActSeverityCodeVocab(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyProblemActAllergyObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyProblemActOperations.validateAllergyProblemActAllergyObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyObservation> getAllergyObservations() {
		return AllergyProblemActOperations.getAllergyObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyProblemAct init() {
    	CDAUtil.init(this);
    	return this;
	}
} // AllergyProblemActImpl
