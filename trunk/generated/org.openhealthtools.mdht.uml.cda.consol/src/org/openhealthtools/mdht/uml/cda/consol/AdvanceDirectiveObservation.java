/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directive Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdvanceDirectiveObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation moodCode='EVN' classCode='OBS' code.codeSystemName='SNOMEDCT' templateId.root='2.16.840.1.113883.10.20.22.4.48' constraints.validation.error='AdvanceDirectiveObservationTemplateId AdvanceDirectiveObservationHasStartingTime AdvanceDirectiveObservationHasEndingTime AdvanceDirectiveObservationClassCode AdvanceDirectiveObservationMoodCode AdvanceDirectiveObservationId AdvanceDirectiveObservationCode AdvanceDirectiveObservationStatusCode AdvanceDirectiveObservationEffectiveTime AdvanceDirectiveObservationVerifierTime AdvanceDirectiveObservationVerifierTypeCode AdvanceDirectiveObservationVerifierParticipantRole AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName AdvanceDirectiveObservationCustodianCustodianRoleClassCode AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity AdvanceDirectiveObservationCustodianTypeCode AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole AdvanceDirectiveObservationReferenceExternalDocumentId AdvanceDirectiveObservationReferenceExternalDocument' constraints.validation.info='AdvanceDirectiveObservationReferenceExternalDocumentText' statusCode.code='completed' code.codeSystem='2.16.840.1.113883.6.96' constraints.validation.warning='AdvanceDirectiveObservationVerifier AdvanceDirectiveObservationCustodian AdvanceDirectiveObservationReference AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleTelecom'"
 * @generated
 */
public interface AdvanceDirectiveObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.low.hasContent()  or self.effectiveTime.low.isNullFlavorDefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime.low.hasContent()  or self.effectiveTime.low.isNullFlavorDefined()'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationHasStartingTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.effectiveTime.high.hasContent() or self.effectiveTime.high.isNullFlavorDefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime.high.hasContent() or self.effectiveTime.high.isNullFlavorDefined()'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationHasEndingTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.48')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.48\')'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classCode=vocab::ActClassObservation::OBS'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.moodCode=vocab::x_ActMoodDocumentObservation::EVN'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '281789004' or value.code = '89666000' or value.code = '225204009' or value.code = '52765003' or value.code = '78823007' or value.code = '304251008')))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (\r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'281789004\' or value.code = \'89666000\' or value.code = \'225204009\' or value.code = \'52765003\' or value.code = \'78823007\' or value.code = \'304251008\')))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (\r\nvalue.code = \'completed\'))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(isDefined('typeCode')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(isDefined(\'typeCode\')) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::VRF)->forAll(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role))) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) and self.participant.participantRole.playingEntity->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole.playingEntity->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) and self.participant.participantRole.playingEntity->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole.playingEntity->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll(classCode=vocab::RoleClassRoot::ROL) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll(classCode=vocab::RoleClassRoot::ROL) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) and self.participant.participantRole->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST).participantRole->forAll(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity))) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST)->forAll(typeCode=vocab::ParticipationType::CST) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST)->forAll(typeCode=vocab::ParticipationType::CST) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST)->forAll(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) then self.participant->select(typeCode=vocab::ParticipationType::CST)->forAll(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.reference->exists(not oclIsUndefined()) and self.reference.externalDocument->exists(not oclIsUndefined()) then self.reference.externalDocument->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.reference->exists(not oclIsUndefined()) and self.reference.externalDocument->exists(not oclIsUndefined()) then self.reference.externalDocument->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.reference->exists(not oclIsUndefined()) and self.reference.externalDocument->exists(not oclIsUndefined()) then self.reference.externalDocument->forAll((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.reference->exists(not oclIsUndefined()) and self.reference.externalDocument->exists(not oclIsUndefined()) then self.reference.externalDocument->forAll((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocumentText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.reference->exists(not oclIsUndefined()) then self.reference->forAll(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.reference->exists(not oclIsUndefined()) then self.reference->forAll(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument))) else true endif'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation init();
} // AdvanceDirectiveObservation
