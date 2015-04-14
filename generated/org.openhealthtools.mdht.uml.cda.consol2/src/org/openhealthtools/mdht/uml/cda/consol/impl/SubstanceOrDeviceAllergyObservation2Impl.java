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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;

import org.openhealthtools.mdht.uml.cda.consol.operations.SubstanceOrDeviceAllergyObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Or Device Allergy Observation2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SubstanceOrDeviceAllergyObservation2Impl extends SubstanceOrDeviceAllergyObservationImpl implements
		SubstanceOrDeviceAllergyObservation2 {
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
	public boolean validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationReactionObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationReactionObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservationSeverityObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationSeverityObservation2(
			this, diagnostics, context);
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
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(
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
