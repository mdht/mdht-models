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
	public boolean validateAllergyObservation2ValueOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2ValueOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2OriginalTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2OriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2OriginalTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2OriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2ReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2ReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2NegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2NegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2Text(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2Text(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2EDTELValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2EDTELValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2EDReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2EDReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2AllergyObservationAllergyObservationParticipantTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservation2AllergyObservationAllergyObservationParticipantParticipantRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllergyStatusObservation> getConsolAllergyStatusObservations() {
		return AllergyObservation2Operations.getConsolAllergyStatusObservations(this);
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
	public boolean validateAllergyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationEffectiveTime(this, diagnostics, context);
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
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCEOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCEOriginalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCETranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCETranslation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AllergyObservation2Operations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(
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
