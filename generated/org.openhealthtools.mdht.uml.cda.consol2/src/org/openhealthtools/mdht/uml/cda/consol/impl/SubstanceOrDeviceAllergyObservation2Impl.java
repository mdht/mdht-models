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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SubstanceOrDeviceAllergyObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Or Device Allergy Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SubstanceOrDeviceAllergyObservation2Impl extends SubstanceOrDeviceAllergyObservationImpl
		implements SubstanceOrDeviceAllergyObservation2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceOrDeviceAllergyObservation2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2IVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2IVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReactionObservation2> getConsolReactionObservation2s() {
		return SubstanceOrDeviceAllergyObservation2Operations.getConsolReactionObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation2 getConsolSeverityObservation2() {
		return SubstanceOrDeviceAllergyObservation2Operations.getConsolSeverityObservation2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(
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
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(
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
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationValueP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationReactionObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationSeverityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationSeverityObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceOrDeviceAllergyObservation2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceOrDeviceAllergyObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SubstanceOrDeviceAllergyObservation2Impl
