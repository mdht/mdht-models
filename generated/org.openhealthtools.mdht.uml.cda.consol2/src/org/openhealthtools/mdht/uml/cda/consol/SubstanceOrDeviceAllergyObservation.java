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

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Or Device Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSubstanceOrDeviceAllergyObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SubstanceOrDeviceAllergyObservationTemplateId SubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator SubstanceOrDeviceAllergyObservationReactionInversionIndicator SubstanceOrDeviceAllergyObservationSeverityInversionIndicator SubstanceOrDeviceAllergyObservationClassCode SubstanceOrDeviceAllergyObservationMoodCode SubstanceOrDeviceAllergyObservationId SubstanceOrDeviceAllergyObservationCode SubstanceOrDeviceAllergyObservationCodeP SubstanceOrDeviceAllergyObservationStatusCode SubstanceOrDeviceAllergyObservationStatusCodeP SubstanceOrDeviceAllergyObservationEffectiveTime SubstanceOrDeviceAllergyObservationValue SubstanceOrDeviceAllergyObservationValueP SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity SubstanceOrDeviceAllergyObservationParticipantTypeCode SubstanceOrDeviceAllergyObservationParticipantParticipantRole' templateId.root='2.16.840.1.113883.10.20.24.3.90' classCode='OBS' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Assertion' constraints.validation.dependOn.SubstanceOrDeviceAllergyObservationCode='SubstanceOrDeviceAllergyObservationCodeP' statusCode.code='completed' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.info='SubstanceOrDeviceAllergyObservationAllergyStatusObservation SubstanceOrDeviceAllergyObservationSeverityObservation SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI' constraints.validation.warning='SubstanceOrDeviceAllergyObservationReactionObservation SubstanceOrDeviceAllergyObservationParticipant SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference' constraints.validation.query='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode SubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity SubstanceOrDeviceAllergyObservationParticipantTypeCode SubstanceOrDeviceAllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservationParticipant typeCode='CSM' constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantTypeCode SubstanceOrDeviceAllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservationParticipantParticipantRole classCode='MANU' constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity constraints.validation.error='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode' constraints.validation.warning='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText' constraints.validation.info='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation' classCode='MMAT' constraints.validation.query='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCE constraints.validation.warning='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText' constraints.validation.info='SubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 * @generated
 */
public interface SubstanceOrDeviceAllergyObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::AllergyStatusObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::ReactionObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->select(er : cda::EntryRelationship | er.observation.oclIsTypeOf(consol::SeverityObservation))->forAll(ent : cda::EntryRelationship | ent.inversionInd=true)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.24.3.90\')'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.code = \'ASSERTION\' and value.codeSystem = \'2.16.840.1.113883.5.4\')'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'completed\')'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservationStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'420134006\' or value.code = \'418038007\' or value.code = \'419511003\' or value.code = \'418471000\' or value.code = \'419199007\' or value.code = \'416098002\' or value.code = \'414285001\' or value.code = \'59037007\' or value.code = \'235719002\' or value.code = \'232347008\' or value.code = \'426232007\')))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationValueP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationReactionObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationSeverityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((originalText.oclIsUndefined() or originalText.isNullFlavorUndefined()) implies (not originalText.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (not translation->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.value.oclIsUndefined() implies not getSection().text.getText(code.originalText.reference.value.substring(2, code.originalText.reference.value.size())).oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.reference.oclIsUndefined() implies code.originalText.reference.value->size() = 1)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(not code.originalText.oclIsUndefined() implies not code.originalText.reference.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(( code.oclIsUndefined() or code.isNullFlavorUndefined() ) implies ( not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and ( ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.3.26.1.5\' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.6.88\' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.4.9\' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined() ) ) ))'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null).playingEntity->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::EntityClassRoot::MMAT)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
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
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).participantRole->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassRoot::MANU)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::CSM)'"
	 * @generated
	 */
	boolean validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation))->asSequence()->any(true).oclAsType(consol::AllergyStatusObservation)'"
	 * @generated
	 */
	AllergyStatusObservation getAllergyStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)'"
	 * @generated
	 */
	EList<ReactionObservation> getReactionObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))->asSequence()->any(true).oclAsType(consol::SeverityObservation)'"
	 * @generated
	 */
	SeverityObservation getSeverityObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceOrDeviceAllergyObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceOrDeviceAllergyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SubstanceOrDeviceAllergyObservation
