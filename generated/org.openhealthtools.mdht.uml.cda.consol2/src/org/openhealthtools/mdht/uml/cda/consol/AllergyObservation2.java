/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergyObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SubstanceOrDeviceAllergyObservationTemplateId SubstanceOrDeviceAllergyObservationReactionInversionIndicator SubstanceOrDeviceAllergyObservationSeverityInversionIndicator AllergyObservationCode AllergyObservationCodeP AllergyObservationValue AllergyObservationValueP AllergyObservationStatusCode AllergyObservationStatusCodeP AllergyObservationEffectiveTime AllergyObservationAllergyStatusObservation AllergyObservationParticipant AllergyObservation2IVLTSLow AllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText AllergyObservationParticipantParticipantRolePlayingEntityCETranslation AllergyObservationParticipantParticipantRolePlayingEntityCode AllergyObservationParticipantParticipantRolePlayingEntity AllergyObservationParticipantParticipantRole' templateId.root='2.16.840.1.113883.10.20.22.4.7' templateId.extension='2014-06-09' constraints.validation.info='AllergyObservationValueOriginalText AllergyObservationOriginalTextReference AllergyObservationOriginalTextReferenceValue AllergyObservationReferenceValue SubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator AllergyObservation2NegationInd AllergyObservation2SeverityObservation2 AllergyObservation2IVLTSHigh AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication AllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication AllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance AllergyObservationParticipantParticipantRolePlayingEntityReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.dependOn.AllergyObservationCode='AllergyObservationCodeP' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.AllergyObservationValue='AllergyObservationValueP' statusCode.code='completed' constraints.validation.dependOn.AllergyObservationStatusCode='AllergyObservationStatusCodeP' constraints.validation.warning='AllergyObservation2AuthorParticipation AllergyObservationReactionObservation' constraints.validation.query='AllergyObservation2IVLTSLow AllergyObservation2IVLTSHigh AllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText AllergyObservationParticipantParticipantRolePlayingEntityCETranslation AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication AllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication AllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance AllergyObservationParticipantParticipantRolePlayingEntityReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference AllergyObservationParticipantParticipantRolePlayingEntityCode AllergyObservationParticipantParticipantRolePlayingEntity AllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservation2IVLTS constraints.validation.error='AllergyObservation2IVLTSLow' constraints.validation.info='AllergyObservation2IVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservation2Participant constraints.validation.error='AllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservation2ParticipantParticipantRole constraints.validation.error='AllergyObservationParticipantParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservation2ParticipantParticipantRolePlayingEntity constraints.validation.info='AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication AllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication AllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance AllergyObservationParticipantParticipantRolePlayingEntityReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference' constraints.validation.error='AllergyObservationParticipantParticipantRolePlayingEntityCode AllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText AllergyObservationParticipantParticipantRolePlayingEntityCETranslation' constraints.validation.query='AllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText AllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservation2ParticipantParticipantRolePlayingEntityCE constraints.validation.error='AllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText AllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 * @generated
 */
public interface AllergyObservation2 extends AllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.negationInd.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateAllergyObservation2NegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())'"
	 * @generated
	 */
	boolean validateAllergyObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyObservationStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))'"
	 * @generated
	 */
	boolean validateAllergyObservation2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateAllergyObservation2SeverityObservation2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateAllergyObservation2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateAllergyObservation2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityAllergySpecificMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityAllergyClassMedication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation)).oclAsType(consol::AllergyStatusObservation)'"
	 * @generated
	 */
	EList<AllergyStatusObservation> getConsolAllergyStatusObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation2)).oclAsType(consol::ReactionObservation2)'"
	 * @generated
	 */
	EList<ReactionObservation2> getConsolReactionObservation2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation2))->asSequence()->any(true).oclAsType(consol::SeverityObservation2)'"
	 * @generated
	 */
	SeverityObservation2 getSeverityObservation2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergyObservation2
