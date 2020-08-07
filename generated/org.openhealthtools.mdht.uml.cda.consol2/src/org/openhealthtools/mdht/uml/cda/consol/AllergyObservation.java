/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allergy Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This clinical statement represents that an allergy or adverse reaction exists or does not exist. The agent that is the cause of the allergy or adverse reaction is represented as a manufactured material participant playing entity in the allergy - intolerance observation. While the agent is often implicit in the alert observation (e.g. "allergy to penicillin"), it should also be asserted explicitly as an entity. The manufactured material participant is used to represent natural and non-natural occurring substances.
 * NOTE: The agent responsible for an allergy or adverse reaction is not always a manufactured material (for example, food allergies), nor is it necessarily consumed. The following constraints reflect limitations in the base CDA R2 specification, and should be used to represent any type of responsible agent.
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAllergyObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SubstanceOrDeviceAllergyObservationTemplateId AllergyObservationReferenceValue SubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator SubstanceOrDeviceAllergyObservationReactionInversionIndicator SubstanceOrDeviceAllergyObservationSeverityInversionIndicator AllergyObservationClassCode AllergyObservationMoodCode AllergyObservationId AllergyObservationCode AllergyObservationCodeP AllergyObservationStatusCode AllergyObservationEffectiveTime AllergyObservationValue AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI AllergyObservationParticipantParticipantRolePlayingEntityClassCode AllergyObservationParticipantParticipantRolePlayingEntityCode AllergyObservationParticipantParticipantRoleClassCode AllergyObservationParticipantParticipantRolePlayingEntity AllergyObservationParticipantTypeCode AllergyObservationParticipantParticipantRole' templateId.root='2.16.840.1.113883.10.20.22.4.7' constraints.validation.warning='AllergyObservationValueOriginalText AllergyObservationOriginalTextReference AllergyObservationOriginalTextReferenceValue AllergyObservationReactionObservation AllergyObservationParticipant AllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText AllergyObservationParticipantParticipantRolePlayingEntityReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference' classCode='OBS' moodCode='EVN' code.code='ASSERTION' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' constraints.validation.dependOn.AllergyObservationCode='AllergyObservationCodeP' statusCode.code='completed' value.codeSystem='2.16.840.1.113883.6.96' value.codeSystemName='SNOMEDCT' constraints.validation.info='AllergyObservationSeverityObservation AllergyObservationAllergyStatusObservation AllergyObservationParticipantParticipantRolePlayingEntityCETranslation' constraints.validation.query='AllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText AllergyObservationParticipantParticipantRolePlayingEntityCETranslation AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference AllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI AllergyObservationParticipantParticipantRolePlayingEntityClassCode AllergyObservationParticipantParticipantRolePlayingEntityCode AllergyObservationParticipantParticipantRoleClassCode AllergyObservationParticipantParticipantRolePlayingEntity AllergyObservationParticipantTypeCode AllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservationParticipant typeCode='CSM' constraints.validation.error='AllergyObservationParticipantTypeCode AllergyObservationParticipantParticipantRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservationParticipantParticipantRole classCode='MANU' constraints.validation.error='AllergyObservationParticipantParticipantRoleClassCode AllergyObservationParticipantParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservationParticipantParticipantRolePlayingEntity constraints.validation.error='AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI AllergyObservationParticipantParticipantRolePlayingEntityClassCode AllergyObservationParticipantParticipantRolePlayingEntityCode' constraints.validation.warning='AllergyObservationParticipantParticipantRolePlayingEntityReferenceValue AllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference PlayingEntityAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText' classCode='MMAT' constraints.validation.query='PlayingEntityAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText PlayingEntityAllergyObservationParticipantParticipantRolePlayingEntityCETranslation' constraints.validation.info='PlayingEntityAllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAllergyObservationParticipantParticipantRolePlayingEntityCE constraints.validation.warning='AllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText' constraints.validation.info='AllergyObservationParticipantParticipantRolePlayingEntityCETranslation'"
 *        annotation="uml2.alias Allergies\040and\040Intolerances='null'"
 * @generated
 */
public interface AllergyObservation extends SubstanceOrDeviceAllergyObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value.oclAsType(datatypes::CD).originalText-&gt;size() = 1'"
	 * @generated
	 */
	boolean validateAllergyObservationValueOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value.oclAsType(datatypes::CD).originalText-&gt;size() = 1 implies self.value.oclAsType(datatypes::CD).originalText-&gt;one(reference-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validateAllergyObservationOriginalTextReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.value.oclAsType(datatypes::CD).originalText.reference-&gt;size() = 1 implies self.value.oclAsType(datatypes::CD).originalText.reference.value-&gt;size() = 1'"
	 * @generated
	 */
	boolean validateAllergyObservationOriginalTextReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.code.originalText.reference.value.oclIsUndefined() implies not self.getSection().text.getText(self.code.originalText.reference.value.substring(2, self.code.originalText.reference.value.size())).oclIsUndefined()'"
	 * @generated
	 */
	boolean validateAllergyObservationReferenceValue(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not self.id-&gt;isEmpty())'"
	 * @generated
	 */
	boolean validateAllergyObservationId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAllergyObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value-&gt;isEmpty() or self.value-&gt;exists(element | element.isNullFlavorUndefined())) implies (self.value-&gt;size() = 1 and self.value-&gt;forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'420134006\' or value.code = \'418038007\' or value.code = \'419511003\' or value.code = \'418471000\' or value.code = \'419199007\' or value.code = \'416098002\' or value.code = \'414285001\' or value.code = \'59037007\' or value.code = \'235719002\' or value.code = \'232347008\' or value.code = \'426232007\')))'"
	 * @generated
	 */
	boolean validateAllergyObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)'"
	 * @generated
	 */
	boolean validateAllergyObservationReactionObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::SeverityObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateAllergyObservationSeverityObservation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::AllergyStatusObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
	 * @generated
	 */
	boolean validateAllergyObservationAllergyStatusObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null).code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((originalText.oclIsUndefined() or originalText.isNullFlavorUndefined()) implies (not originalText.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null).code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies ((translation-&gt;isEmpty() or translation-&gt;exists(element | element.isNullFlavorUndefined())) implies (not translation-&gt;isEmpty()) )))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject(not code.originalText.reference.value.oclIsUndefined() implies not getSection().text.getText(code.originalText.reference.value.substring(2, code.originalText.reference.value.size())).oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject(not code.originalText.reference.oclIsUndefined() implies code.originalText.reference.value-&gt;size() = 1)'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject(not code.originalText.oclIsUndefined() implies not code.originalText.reference.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject(( code.oclIsUndefined() or code.isNullFlavorUndefined() ) implies ( not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and ( ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.3.26.1.5\' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.6.88\' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.4.9\' and not value.code.oclIsUndefined() ) or ( let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.6.96\' and not value.code.oclIsUndefined() ) ) ))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null)-&gt;reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassRoot) and \r\nlet value : vocab::RoleClassRoot = classCode.oclAsType(vocab::RoleClassRoot) in \r\nvalue = vocab::RoleClassRoot::MANU)'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).participantRole-&gt;excluding(null)-&gt;reject(playingEntity-&gt;one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::ParticipationType) and \r\nlet value : vocab::ParticipationType = typeCode.oclAsType(vocab::ParticipationType) in \r\nvalue = vocab::ParticipationType::CSM)'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(participantRole-&gt;one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validateAllergyObservationParticipantParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ReactionObservation)).oclAsType(consol::ReactionObservation)'"
	 * @generated
	 */
	EList<ReactionObservation> getConsolReactionObservations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::SeverityObservation))-&gt;asSequence()-&gt;any(true).oclAsType(consol::SeverityObservation)'"
	 * @generated
	 */
	SeverityObservation getConsolSeverityObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()-&gt;select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::AllergyStatusObservation))-&gt;asSequence()-&gt;any(true).oclAsType(consol::AllergyStatusObservation)'"
	 * @generated
	 */
	AllergyStatusObservation getConsolAllergyStatusObservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AllergyObservation
