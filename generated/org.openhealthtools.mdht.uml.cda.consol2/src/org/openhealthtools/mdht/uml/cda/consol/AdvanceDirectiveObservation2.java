/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advance Directive Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getAdvanceDirectiveObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AdvanceDirectiveObservationTemplateId AdvanceDirectiveObservationHasEndingTime AdvanceDirectiveObservationCodeP AdvanceDirectiveObservationEffectiveTime AdvanceDirectiveObservation2Value AdvanceDirectiveObservation2CDTranslation AdvanceDirectiveObservation2CDTranslationP AdvanceDirectiveObservation2IVLTSLow AdvanceDirectiveObservation2IVLTSHigh AdvanceDirectiveObservation2VerifierTemplateId AdvanceDirectiveObservationVerifierParticipantRole AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole AdvanceDirectiveObservationReferenceExternalDocumentId AdvanceDirectiveObservationReferenceTypeCode AdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument' templateId.root='2.16.840.1.113883.10.20.22.4.48' templateId.extension='2015-08-01' constraints.validation.info='AdvanceDirectiveObservationHasStartingTime AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName AdvanceDirectiveObservation2VerifierParticipantRoleAddr AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity AdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType AdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference AdvanceDirectiveObservationReferenceExternalDocumentText' code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.warning='AdvanceDirectiveObservationCode AdvanceDirectiveObservationVerifier AdvanceDirectiveObservationCustodian AdvanceDirectiveObservationReference AdvanceDirectiveObservation2AuthorParticipation AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode AdvanceDirectiveObservation2VerifierParticipantRoleCodeP AdvanceDirectiveObservation2VerifierParticipantRoleCode AdvanceDirectiveObservationVerifierTime AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode AdvanceDirectiveObservation2CustodianCustodianRoleCodeP AdvanceDirectiveObservation2CustodianCustodianRoleCode AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleTelecom' constraints.validation.dependOn.AdvanceDirectiveObservationCode='AdvanceDirectiveObservationCodeP' constraints.validation.query='AdvanceDirectiveObservation2CDTranslation AdvanceDirectiveObservation2CDTranslationP AdvanceDirectiveObservation2IVLTSLow AdvanceDirectiveObservation2IVLTSHigh AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName AdvanceDirectiveObservation2VerifierParticipantRoleCodeP AdvanceDirectiveObservation2VerifierParticipantRoleCode AdvanceDirectiveObservation2VerifierParticipantRoleAddr AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity AdvanceDirectiveObservation2VerifierTemplateId AdvanceDirectiveObservationVerifierTime AdvanceDirectiveObservationVerifierParticipantRole AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName AdvanceDirectiveObservation2CustodianCustodianRoleCodeP AdvanceDirectiveObservation2CustodianCustodianRoleCode AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleTelecom AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole AdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType AdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference AdvanceDirectiveObservationReferenceExternalDocumentId AdvanceDirectiveObservationReferenceExternalDocumentText AdvanceDirectiveObservationReferenceTypeCode AdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument' constraints.validation.dependOn.AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode='AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP' constraints.validation.dependOn.AdvanceDirectiveObservation2VerifierParticipantRoleCode='AdvanceDirectiveObservation2VerifierParticipantRoleCodeP' constraints.validation.dependOn.AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode='AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP' constraints.validation.dependOn.AdvanceDirectiveObservation2CustodianCustodianRoleCode='AdvanceDirectiveObservation2CustodianCustodianRoleCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservation2IVLTS constraints.validation.error='AdvanceDirectiveObservation2IVLTSLow AdvanceDirectiveObservation2IVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservation2Custodian constraints.validation.error='AdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservation2CustodianCustodianRole code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='AdvanceDirectiveObservation2CustodianCustodianRoleCode AdvanceDirectiveObservation2CustodianCustodianRoleCodeP AdvanceDirectiveObservationCustodianCustodianRoleAddr AdvanceDirectiveObservationCustodianCustodianRoleTelecom' constraints.validation.dependOn.AdvanceDirectiveObservation2CustodianCustodianRoleCode='AdvanceDirectiveObservation2CustodianCustodianRoleCodeP' constraints.validation.error='AdvanceDirectiveObservationCustodianCustodianRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntity code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.warning='AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP' constraints.validation.dependOn.AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode='AdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP' constraints.validation.error='AdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservation2Verifier constraints.validation.error='AdvanceDirectiveObservation2VerifierTemplateId AdvanceDirectiveObservationVerifierParticipantRole' templateId.root='2.16.840.1.113883.10.20.1.58' constraints.validation.warning='AdvanceDirectiveObservationVerifierTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservation2VerifierParticipantRole code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AdvanceDirectiveObservation2VerifierParticipantRoleCode AdvanceDirectiveObservation2VerifierParticipantRoleCodeP' constraints.validation.dependOn.AdvanceDirectiveObservation2VerifierParticipantRoleCode='AdvanceDirectiveObservation2VerifierParticipantRoleCodeP' constraints.validation.info='AdvanceDirectiveObservation2VerifierParticipantRoleAddr AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity code.codeSystem='2.16.840.1.113883.6.96' code.codeSystemName='SNOMEDCT' constraints.validation.warning='AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP' constraints.validation.dependOn.AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode='AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP' constraints.validation.info='AdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolAdvanceDirectiveObservation2CD translation.code='75320-2' translation.codeSystem='2.16.840.1.113883.6.1' translation.codeSystemName='LOINC' translation.displayName='Advance directive' constraints.validation.error='AdvanceDirectiveObservation2CDTranslation AdvanceDirectiveObservation2CDTranslationP'"
 * @generated
 */
public interface AdvanceDirectiveObservation2 extends AdvanceDirectiveObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2Value(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdvanceDirectiveObservation2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1 and translation->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and \r\nlet value : datatypes::CD = element.oclAsType(datatypes::CD) in \r\nvalue.code = \'75320-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')) )))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2CDTranslation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((translation->isEmpty() or translation->exists(element | element.isNullFlavorUndefined())) implies (translation->size() = 1) )))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2CDTranslationP(DiagnosticChain diagnostics,
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
	boolean validateAdvanceDirectiveObservation2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateAdvanceDirectiveObservation2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'63161005\' or value.code = \'2603003\')))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null).playingEntity->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF).participantRole->excluding(null)->reject(playingEntity->one(playingEntity : cda::PlayingEntity | not playingEntity.oclIsUndefined() and playingEntity.oclIsKindOf(cda::PlayingEntity)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::VRF)->select(typeCode=vocab::ParticipationType::VRF)->reject(templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.1.58\'))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2VerifierTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null).playingEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.96\' and (value.code = \'63161005\' or value.code = \'2603003\')))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::CST).participantRole->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject(not text.mediaType.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null).externalDocument->excluding(null)->reject(not text.oclIsUndefined() implies not text.reference.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2ReferenceAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.reference->excluding(null)->reject(externalDocument->one(externalDocument : cda::ExternalDocument | not externalDocument.oclIsUndefined() and externalDocument.oclIsKindOf(cda::ExternalDocument)))'"
	 * @generated
	 */
	boolean validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // AdvanceDirectiveObservation2
