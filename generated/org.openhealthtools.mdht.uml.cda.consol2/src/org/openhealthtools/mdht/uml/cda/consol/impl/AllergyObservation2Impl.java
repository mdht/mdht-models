/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allergy Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AllergyObservation2Impl extends AllergyObservationImpl implements AllergyObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllergyObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ALLERGY_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservation2NegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2NegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservation2SeverityObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2SeverityObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservation2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservation2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AllergyStatusObservation> getConsolAllergyStatusObservations() {
		return AllergyObservation2Operations.getConsolAllergyStatusObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReactionObservation2> getConsolReactionObservation2s() {
		return AllergyObservation2Operations.getConsolReactionObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation2 getSeverityObservation2() {
		return AllergyObservation2Operations.getSeverityObservation2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationValueOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationValueOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationOriginalTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationOriginalTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationOriginalTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyStatusObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationReactionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationParticipantParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergyObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // AllergyObservation2Impl
