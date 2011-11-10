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
import org.openhealthtools.mdht.uml.cda.consol.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.consol.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyDrugSensitivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Drug Sensitivity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyDrugSensitivityImpl extends ActImpl implements AllergyDrugSensitivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyDrugSensitivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_DRUG_SENSITIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityEntryRelationshipRequired(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityEntryRelationshipRequired(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivitySubjectOfTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySubjectOfTarget(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityContainsProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityContainsProblemObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityContainsAlertObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityContainsAlertObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityContainsPatientAwareness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityContainsPatientAwareness(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityEffectiveTimeLowHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityEffectiveTimeLowHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityHasRelatedObservations(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityHasRelatedObservations(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityRelatedObservationsTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityRelatedObservationsTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityHasRelatedReferencesTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAdvereEventDate(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdvereEventDate(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAdvereEventType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdvereEventType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAdvereEventTypeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAdvereEventTypeVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAllergyProduct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProduct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAllergyProductTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityProductDetailParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityProductDetailPlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailPlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailPlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityProductDetailName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductDetailName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityProductCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityProductCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAllergyProductFoodVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductFoodVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAllergyProductMedClassVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductMedClassVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyProductSpecificMedVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityReactionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityReactionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityReactionCodeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityReactionCodeVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivitySeverityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivitySeverityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivitySeverityCodeVocab(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivitySeverityCodeVocab(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityCodeNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityCodeNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityEpisodeObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityEpisodeObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyDrugSensitivityAllergyIntolerance(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityAllergyIntolerance(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation getEpisodeObservation() {
		return AllergyDrugSensitivityOperations.getEpisodeObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyIntolerance> getAllergyIntolerances() {
		return AllergyDrugSensitivityOperations.getAllergyIntolerances(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyDrugSensitivity init() {
		CDAUtil.init(this);
		return this;
	}
} // AllergyDrugSensitivityImpl
