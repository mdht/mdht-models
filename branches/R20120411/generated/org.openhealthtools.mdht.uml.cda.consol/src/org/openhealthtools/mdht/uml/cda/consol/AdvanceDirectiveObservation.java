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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation statusCode.code='completed' code.codeSystem='2.16.840.1.113883.6.96' templateId.root='2.16.840.1.113883.10.20.22.4.48' constraints.validation.error='AdvanceDirectiveObservationTemplateId AdvanceDirectiveObservationHasStartingTime AdvanceDirectiveObservationHasEndingTime AdvanceDirectiveObservationClassCode AdvanceDirectiveObservationMoodCode AdvanceDirectiveObservationId AdvanceDirectiveObservationCode AdvanceDirectiveObservationStatusCode AdvanceDirectiveObservationEffectiveTime AdvanceDirectiveObservationVerifierTime AdvanceDirectiveObservationVerifierTypeCode AdvanceDirectiveObservationVerifierParticipantRole AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName AdvanceDirectiveObservationCustodianCustodianRoleClassCode AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity AdvanceDirectiveObservationCustodianTypeCode AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole AdvanceDirectiveObservationReferenceExternalDocumentId AdvanceDirectiveObservationReferenceTypeCode AdvanceDirectiveObservationReferenceExternalDocument' code.codeSystemName='SNOMEDCT' constraints.validation.warning='AdvanceDirectiveObservationVerifier AdvanceDirectiveObservationCustodian AdvanceDirectiveObservationReference AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleTelecom' classCode='OBS' constraints.validation.query='AdvanceDirectiveObservationVerifierTime AdvanceDirectiveObservationVerifierTypeCode AdvanceDirectiveObservationVerifierParticipantRole AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleClassCode AdvanceDirectiveObservationCustodianCustodianRoleTelecom AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity AdvanceDirectiveObservationCustodianTypeCode AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole AdvanceDirectiveObservationReferenceExternalDocumentId AdvanceDirectiveObservationReferenceExternalDocumentText AdvanceDirectiveObservationReferenceTypeCode AdvanceDirectiveObservationReferenceExternalDocument' moodCode='EVN' constraints.validation.info='AdvanceDirectiveObservationReferenceExternalDocumentText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationReference constraints.validation.error='ReferenceTypeCode ReferenceExternalDocument' typeCode='REFR'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationReferenceExternalDocument constraints.validation.error='ExternalDocumentId' constraints.validation.info='ExternalDocumentText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationCustodian constraints.validation.error='CustodianTypeCode CustodianAdvanceDirectiveObservationCustodianRole' typeCode='CST'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationCustodianCustodianRole constraints.validation.error='CustodianRoleClassCode CustodianRolePlayingEntity' constraints.validation.warning='CustodianRoleAddr CustodianRoleTelecom' classCode='ROL'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntity constraints.validation.error='CustodianEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationVerifier constraints.validation.error='VerifierTime VerifierTypeCode VerifierParticipantRole' typeCode='VRF'"
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
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '281789004' or value.code = '89666000' or value.code = '225204009' or value.code = '52765003' or value.code = '78823007' or value.code = '304251008'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'281789004\' or value.code = \'89666000\' or value.code = \'225204009\' or value.code = \'52765003\' or value.code = \'78823007\' or value.code = \'304251008\'))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in 
	 * value.code = 'completed')
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and \r\nlet value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in \r\nvalue.code = \'completed\')'"
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
	 * self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::VRF)->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::VRF)->notEmpty()'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::CST)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))->select(typeCode=vocab::ParticipationType::CST)->size() = 1'"
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
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->reject(isDefined('typeCode'))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (addr->size() = 1))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject(isDefined('classCode') and classCode=vocab::RoleClassRoot::ROL)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::RoleClassRoot::ROL)'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() = 1))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (telecom->size() = 1))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST)->reject(typeCode=vocab::ParticipationType::CST)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST)->reject(typeCode=vocab::ParticipationType::CST)'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST)->reject(participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->excluding(null).externalDocument->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->excluding(null).externalDocument->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocumentText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::x_ActRelationshipExternalReference) and 
	 * let value : vocab::x_ActRelationshipExternalReference = typeCode.oclAsType(vocab::x_ActRelationshipExternalReference) in 
	 * value = vocab::x_ActRelationshipExternalReference::REFR)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::x_ActRelationshipExternalReference) and \r\nlet value : vocab::x_ActRelationshipExternalReference = typeCode.oclAsType(vocab::x_ActRelationshipExternalReference) in \r\nvalue = vocab::x_ActRelationshipExternalReference::REFR)'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument)))'"
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