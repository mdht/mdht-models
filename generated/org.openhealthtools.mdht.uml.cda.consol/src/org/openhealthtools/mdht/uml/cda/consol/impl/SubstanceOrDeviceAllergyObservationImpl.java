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
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SubstanceOrDeviceAllergyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Or Device Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SubstanceOrDeviceAllergyObservationImpl extends ObservationImpl implements
		SubstanceOrDeviceAllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceOrDeviceAllergyObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationValueP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationReactionObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationSeverityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationSeverityObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyStatusObservation getAllergyStatusObservation() {
		return SubstanceOrDeviceAllergyObservationOperations.getAllergyStatusObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionObservation> getReactionObservations() {
		return SubstanceOrDeviceAllergyObservationOperations.getReactionObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityObservation getSeverityObservation() {
		return SubstanceOrDeviceAllergyObservationOperations.getSeverityObservation(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceOrDeviceAllergyObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubstanceOrDeviceAllergyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // SubstanceOrDeviceAllergyObservationImpl
