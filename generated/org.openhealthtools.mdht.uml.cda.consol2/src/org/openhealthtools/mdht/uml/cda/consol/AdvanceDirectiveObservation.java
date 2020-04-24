/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directive Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdvanceDirectiveObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdvanceDirectiveObservationTemplateId AdvanceDirectiveObservationHasStartingTime AdvanceDirectiveObservationHasEndingTime AdvanceDirectiveObservationClassCode AdvanceDirectiveObservationMoodCode AdvanceDirectiveObservationId AdvanceDirectiveObservationCodeP AdvanceDirectiveObservationStatusCode AdvanceDirectiveObservationEffectiveTime AdvanceDirectiveObservationVerifierTypeCode AdvanceDirectiveObservationVerifierParticipantRole AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName AdvanceDirectiveObservationCustodianCustodianRoleClassCode AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity AdvanceDirectiveObservationCustodianTypeCode AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole AdvanceDirectiveObservationReferenceExternalDocumentId AdvanceDirectiveObservationReferenceTypeCode AdvanceDirectiveObservationReferenceExternalDocument' templateId.root='2.16.840.1.113883.10.20.22.4.48' classCode='OBS' moodCode='EVN' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.warning='AdvanceDirectiveObservationCode AdvanceDirectiveObservationVerifier AdvanceDirectiveObservationCustodian AdvanceDirectiveObservationReference AdvanceDirectiveObservationVerifierTime AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleTelecom' constraints.validation.dependOn.AdvanceDirectiveObservationCode='AdvanceDirectiveObservationCodeP' statusCode.code='completed' constraints.validation.query='AdvanceDirectiveObservationVerifierTime AdvanceDirectiveObservationVerifierTypeCode AdvanceDirectiveObservationVerifierParticipantRole AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleClassCode AdvanceDirectiveObservationCustodianCustodianRoleTelecom AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity AdvanceDirectiveObservationCustodianTypeCode AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType AdvanceDirectiveObservationReferenceExternalDocumentTextReference AdvanceDirectiveObservationReferenceExternalDocumentId AdvanceDirectiveObservationReferenceExternalDocumentText AdvanceDirectiveObservationReferenceTypeCode AdvanceDirectiveObservationReferenceExternalDocument' constraints.validation.info='AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType AdvanceDirectiveObservationReferenceExternalDocumentTextReference AdvanceDirectiveObservationReferenceExternalDocumentText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationReference typeCode='REFR' constraints.validation.error='AdvanceDirectiveObservationReferenceTypeCode AdvanceDirectiveObservationReferenceExternalDocument'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationReferenceExternalDocument constraints.validation.info='AdvanceDirectiveObservationReferenceExternalDocumentTextMediaType AdvanceDirectiveObservationReferenceExternalDocumentTextReference AdvanceDirectiveObservationReferenceExternalDocumentText' constraints.validation.error='AdvanceDirectiveObservationReferenceExternalDocumentId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationCustodian typeCode='CST' constraints.validation.error='AdvanceDirectiveObservationCustodianTypeCode AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationCustodianCustodianRole constraints.validation.warning='AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleTelecom' classCode='AGNT' constraints.validation.error='AdvanceDirectiveObservationCustodianCustodianRoleClassCode AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntity constraints.validation.error='AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservationVerifier constraints.validation.warning='AdvanceDirectiveObservationVerifierTime' typeCode='VRF' constraints.validation.error='AdvanceDirectiveObservationVerifierTypeCode AdvanceDirectiveObservationVerifierParticipantRole'"
 * @generated
 */
public interface AdvanceDirectiveObservation extends Observation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime.low.hasContent()  or self.effectiveTime.low.isNullFlavorDefined()'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationHasStartingTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
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
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.48\')'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdvanceDirectiveObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdvanceDirectiveObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id-&gt;isEmpty() or self.id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not self.id-&gt;isEmpty()) )'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationId(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdvanceDirectiveObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'281789004\' or value.code = \'89666000\' or value.code = \'225204009\' or value.code = \'52765003\' or value.code = \'78823007\' or value.code = \'304251008\' or value.code = \'61420007\' or value.code = \'71388002\'))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdvanceDirectiveObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdvanceDirectiveObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))-&gt;select(typeCode=vocab::ParticipationType::VRF)-&gt;notEmpty()'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;select(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))-&gt;select(typeCode=vocab::ParticipationType::CST)-&gt;size() = 1'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference-&gt;exists(reference : cda::Reference | not reference.oclIsUndefined() and reference.oclIsKindOf(cda::Reference))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReference(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::VRF)-&gt;select(typeCode=vocab::ParticipationType::VRF)-&gt;reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::VRF)-&gt;select(typeCode=vocab::ParticipationType::VRF)-&gt;reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::VRF)-&gt;select(typeCode=vocab::ParticipationType::VRF)-&gt;reject(participantRole-&gt;one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(rim::Role)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationVerifierParticipantRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CST).participantRole-&gt;excluding(null).playingEntity-&gt;excluding(null)-&gt;reject((name-&gt;isEmpty() or name-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not name-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CST).participantRole-&gt;excluding(null)-&gt;reject((addr-&gt;isEmpty() or addr-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not addr-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CST).participantRole-&gt;excluding(null)-&gt;reject(isDefined(\'classCode\') and classCode=vocab::RoleClassRoot::AGNT)'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CST).participantRole-&gt;excluding(null)-&gt;reject((telecom-&gt;isEmpty() or telecom-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not telecom-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CST).participantRole-&gt;excluding(null)-&gt;reject(playingEntity-&gt;one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CST)-&gt;select(typeCode=vocab::ParticipationType::CST)-&gt;reject(typeCode=vocab::ParticipationType::CST)'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;select(typeCode=vocab::ParticipationType::CST)-&gt;select(typeCode=vocab::ParticipationType::CST)-&gt;reject(participantRole-&gt;one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference-&gt;excluding(null).externalDocument-&gt;excluding(null)-&gt;reject(not text.mediaType.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference-&gt;excluding(null).externalDocument-&gt;excluding(null)-&gt;reject(not text.oclIsUndefined() implies not text.reference.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference-&gt;excluding(null).externalDocument-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (( not id-&gt;isEmpty()) ))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocumentId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference-&gt;excluding(null).externalDocument-&gt;excluding(null)-&gt;reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceExternalDocumentText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference-&gt;excluding(null)-&gt;reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::x_ActRelationshipExternalReference) and \r\nlet value : vocab::x_ActRelationshipExternalReference = typeCode.oclAsType(vocab::x_ActRelationshipExternalReference) in \r\nvalue = vocab::x_ActRelationshipExternalReference::REFR)'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservationReferenceTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference-&gt;excluding(null)-&gt;reject(externalDocument-&gt;one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument)))'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdvanceDirectiveObservation
