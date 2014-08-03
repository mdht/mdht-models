/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Or Device Allergy Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSubstanceOrDeviceAllergyObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SubstanceOrDeviceAllergyObservationTemplateId SubstanceOrDeviceAllergyObservation2ReactionInversionIndicator SubstanceOrDeviceAllergyObservation2SeverityInversionIndicator SubstanceOrDeviceAllergyObservationEffectiveTime SubstanceOrDeviceAllergyObservationValue SubstanceOrDeviceAllergyObservationValueP SubstanceOrDeviceAllergyObservationCode SubstanceOrDeviceAllergyObservationCodeP SubstanceOrDeviceAllergyObservation2IVLTSLow SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance SubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP SubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole' templateId.root='2.16.840.1.113883.10.20.24.3.90.2' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservationValue='SubstanceOrDeviceAllergyObservationValueP' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservationCode='SubstanceOrDeviceAllergyObservationCodeP' constraints.validation.warning='SubstanceOrDeviceAllergyObservationParticipant SubstanceOrDeviceAllergyObservationReactionObservation2 SubstanceOrDeviceAllergyObservation2AuthorParticipation' constraints.validation.info='SubstanceOrDeviceAllergyObservationSeverityObservation2 SubstanceOrDeviceAllergyObservation2IVLTSHigh SubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode' constraints.validation.query='SubstanceOrDeviceAllergyObservation2IVLTSLow SubstanceOrDeviceAllergyObservation2IVLTSHigh SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication SubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance SubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP SubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity SubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2IVLTS constraints.validation.error='SubstanceOrDeviceAllergyObservation2IVLTSLow' constraints.validation.info='SubstanceOrDeviceAllergyObservation2IVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2Participant constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ParticipantParticipantRole constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntity code.codeSystem='2.16.840.1.113883.6.88' code.codeSystemName='RxNorm' constraints.validation.info='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode' constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP'"
 * @generated
 */
public interface SubstanceOrDeviceAllergyObservation2 extends SubstanceOrDeviceAllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation2))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation2) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationReactionObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservationSeverityObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservation2IVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(
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
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(
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
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(
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
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
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
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(
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
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	SeverityObservation2 getConsolSeverityObservation2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceOrDeviceAllergyObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceOrDeviceAllergyObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SubstanceOrDeviceAllergyObservation2
