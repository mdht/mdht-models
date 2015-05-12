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

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Care Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCarePlan()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId CarePlanDoesNotHavePlanOfTreatmentSectionV2 CarePlanCode CarePlanCodeP CarePlanDocumentationOf CarePlanHealthConcernsSection CarePlanGoalsSection CarePlanInformationRecipientIntendedRecipientInformationRecipientName CarePlanInformationRecipientIntendedRecipientReceivedOrganizationName CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode CarePlanInformationRecipientIntendedRecipientId CarePlanInformationRecipientIntendedRecipient CarePlanAuthenticatorAssignedEntityId CarePlanAuthenticatorAssignedEntityCode CarePlanAuthenticatorAssignedEntityCodeP CarePlanAuthenticatorTime CarePlanAuthenticatorSignatureCode CarePlanAuthenticatorAssignedEntity CarePlanParticipantCarePlanReviewAssociatedEntityClassCode CarePlanParticipantCarePlanReviewAssociatedEntityId CarePlanParticipantCarePlanReviewAssociatedEntityCode CarePlanParticipantCarePlanReviewTypeCode CarePlanParticipantCarePlanReviewFunctionCode CarePlanParticipantCarePlanReviewFunctionCodeP CarePlanParticipantCarePlanReviewTime CarePlanParticipantCarePlanReviewAssociatedEntity CarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName CarePlanParticipantCaregiverAssociatedEntityClassCodeP CarePlanParticipantCaregiverAssociatedEntityClassCode CarePlanParticipantCaregiverAssociatedEntityAssociatedPerson CarePlanParticipantCaregiverTypeCode CarePlanParticipantCaregiverAssociatedEntity CarePlanDocumentationOfServiceEventIVLTSLow CarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName CarePlanDocumentationOfServiceEventPerformerAssignedEntityId CarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson CarePlanDocumentationOfServiceEventPerformerAssignedEntity CarePlanDocumentationOfServiceEventClassCode CarePlanDocumentationOfServiceEventEffectiveTime CarePlanDocumentationOfServiceEventPerformer1 CarePlanDocumentationOfServiceEvent CarePlanRelatedDocumentParentDocumentSetId CarePlanRelatedDocumentParentDocumentVersionNumber CarePlanRelatedDocumentTypeCodeP CarePlanRelatedDocumentTypeCode CarePlanRelatedDocumentParentDocument CarePlanComponentOfEncompassingEncounterEffectiveTime CarePlanComponentOfEncompassingEncounter' templateId.root='2.16.840.1.113883.10.20.22.1.15' code.code='52521-2' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' code.displayName='Overall Plan of Care/\u200bAdvance Care Directives' constraints.validation.dependOn.CarePlanCode='CarePlanCodeP' constraints.validation.warning='CarePlanSetId CarePlanVersionNumber CarePlanInformationRecipient CarePlanAuthenticator CarePlanParticipantCarePlanReview CarePlanParticipantCaregiver CarePlanComponentOf CarePlanHealthStatusEvaluationsOutcomesSection CarePlanInterventionsSection2 CarePlanInformationRecipientIntendedRecipientReceivedOrganizationId CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP CarePlanInformationRecipientIntendedRecipientAddr CarePlanInformationRecipientIntendedRecipientTelecom CarePlanInformationRecipientIntendedRecipientInformationRecipient CarePlanInformationRecipientIntendedRecipientReceivedOrganization CarePlanParticipantCarePlanReviewAssociatedEntityCodeP' constraints.validation.info='CarePlanRelatedDocument CarePlanAuthenticatorSDTCSignatureText CarePlanDocumentationOfServiceEventIVLTSHigh CarePlanDocumentationOfServiceEventPerformerAssignedEntityCode' constraints.validation.query='CarePlanInformationRecipientIntendedRecipientInformationRecipientName CarePlanInformationRecipientIntendedRecipientReceivedOrganizationId CarePlanInformationRecipientIntendedRecipientReceivedOrganizationName CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode CarePlanInformationRecipientIntendedRecipientId CarePlanInformationRecipientIntendedRecipientAddr CarePlanInformationRecipientIntendedRecipientTelecom CarePlanInformationRecipientIntendedRecipientInformationRecipient CarePlanInformationRecipientIntendedRecipientReceivedOrganization CarePlanInformationRecipientIntendedRecipient CarePlanAuthenticatorAssignedEntityId CarePlanAuthenticatorAssignedEntityCode CarePlanAuthenticatorAssignedEntityCodeP CarePlanAuthenticatorTime CarePlanAuthenticatorSignatureCode CarePlanAuthenticatorSDTCSignatureText CarePlanAuthenticatorAssignedEntity CarePlanParticipantCarePlanReviewAssociatedEntityClassCode CarePlanParticipantCarePlanReviewAssociatedEntityId CarePlanParticipantCarePlanReviewAssociatedEntityCodeP CarePlanParticipantCarePlanReviewAssociatedEntityCode CarePlanParticipantCarePlanReviewTypeCode CarePlanParticipantCarePlanReviewFunctionCode CarePlanParticipantCarePlanReviewFunctionCodeP CarePlanParticipantCarePlanReviewTime CarePlanParticipantCarePlanReviewAssociatedEntity CarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName CarePlanParticipantCaregiverAssociatedEntityClassCodeP CarePlanParticipantCaregiverAssociatedEntityClassCode CarePlanParticipantCaregiverAssociatedEntityAssociatedPerson CarePlanParticipantCaregiverTypeCode CarePlanParticipantCaregiverAssociatedEntity CarePlanDocumentationOfServiceEventIVLTSLow CarePlanDocumentationOfServiceEventIVLTSHigh CarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName CarePlanDocumentationOfServiceEventPerformerAssignedEntityId CarePlanDocumentationOfServiceEventPerformerAssignedEntityCode CarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson CarePlanDocumentationOfServiceEventPerformerAssignedEntity CarePlanDocumentationOfServiceEventClassCode CarePlanDocumentationOfServiceEventEffectiveTime CarePlanDocumentationOfServiceEventPerformer1 CarePlanDocumentationOfServiceEvent CarePlanRelatedDocumentParentDocumentSetId CarePlanRelatedDocumentParentDocumentVersionNumber CarePlanRelatedDocumentTypeCodeP CarePlanRelatedDocumentTypeCode CarePlanRelatedDocumentParentDocument CarePlanComponentOfEncompassingEncounterEffectiveTime CarePlanComponentOfEncompassingEncounter' constraints.validation.dependOn.CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode='CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP' constraints.validation.dependOn.CarePlanParticipantCarePlanReviewAssociatedEntityCode='CarePlanParticipantCarePlanReviewAssociatedEntityCodeP' constraints.validation.dependOn.CarePlanParticipantCaregiverAssociatedEntityClassCode='CarePlanParticipantCaregiverAssociatedEntityClassCodeP' constraints.validation.dependOn.CarePlanRelatedDocumentTypeCode='CarePlanRelatedDocumentTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanInformationRecipient constraints.validation.error='CarePlanInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanInformationRecipientIntendedRecipient constraints.validation.error='CarePlanInformationRecipientIntendedRecipientId' constraints.validation.warning='CarePlanInformationRecipientIntendedRecipientAddr CarePlanInformationRecipientIntendedRecipientTelecom CarePlanInformationRecipientIntendedRecipientInformationRecipient CarePlanInformationRecipientIntendedRecipientReceivedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanInformationRecipientIntendedRecipientInformationRecipient constraints.validation.error='CarePlanInformationRecipientIntendedRecipientInformationRecipientName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanInformationRecipientIntendedRecipientReceivedOrganization constraints.validation.warning='CarePlanInformationRecipientIntendedRecipientReceivedOrganizationId CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP' constraints.validation.error='CarePlanInformationRecipientIntendedRecipientReceivedOrganizationName CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode' standardIndustryClassCode.codeSystem='2.16.840.1.113883.6.101' standardIndustryClassCode.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.dependOn.CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode='CarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanAuthenticator constraints.validation.error='CarePlanAuthenticatorTime CarePlanAuthenticatorSignatureCode CarePlanAuthenticatorAssignedEntity' constraints.validation.info='CarePlanAuthenticatorSDTCSignatureText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanAuthenticatorAssignedEntity constraints.validation.error='CarePlanAuthenticatorAssignedEntityId CarePlanAuthenticatorAssignedEntityCode CarePlanAuthenticatorAssignedEntityCodeP' code.code='ONESELF' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' code.displayName='Self'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanParticipantCarePlanReview typeCode='VRF' constraints.validation.error='CarePlanParticipantCarePlanReviewTypeCode CarePlanParticipantCarePlanReviewFunctionCode CarePlanParticipantCarePlanReviewFunctionCodeP CarePlanParticipantCarePlanReviewTime CarePlanParticipantCarePlanReviewAssociatedEntity' functionCode.code='425268008' functionCode.codeSystem='2.16.840.1.113883.6.96' functionCode.codeSystemName='SNOMEDCT' functionCode.displayName='Review of Care Plan'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanParticipantCarePlanReviewAssociatedEntity classCode='ASSIGNED' constraints.validation.error='CarePlanParticipantCarePlanReviewAssociatedEntityClassCode CarePlanParticipantCarePlanReviewAssociatedEntityId CarePlanParticipantCarePlanReviewAssociatedEntityCode' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='CarePlanParticipantCarePlanReviewAssociatedEntityCodeP' constraints.validation.dependOn.CarePlanParticipantCarePlanReviewAssociatedEntityCode='CarePlanParticipantCarePlanReviewAssociatedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanParticipantCaregiver typeCode='IND' constraints.validation.error='CarePlanParticipantCaregiverTypeCode CarePlanParticipantCaregiverAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanParticipantCaregiverAssociatedEntity constraints.validation.error='CarePlanParticipantCaregiverAssociatedEntityClassCode CarePlanParticipantCaregiverAssociatedEntityClassCodeP CarePlanParticipantCaregiverAssociatedEntityAssociatedPerson' constraints.validation.dependOn.CarePlanParticipantCaregiverAssociatedEntityClassCode='CarePlanParticipantCaregiverAssociatedEntityClassCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson constraints.validation.error='CarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanDocumentationOf constraints.validation.error='CarePlanDocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanDocumentationOfServiceEvent classCode='PCPR' constraints.validation.error='CarePlanDocumentationOfServiceEventClassCode CarePlanDocumentationOfServiceEventEffectiveTime CarePlanDocumentationOfServiceEventPerformer1 CarePlanDocumentationOfServiceEventIVLTSLow' constraints.validation.query='CarePlanDocumentationOfServiceEventIVLTSLow CarePlanDocumentationOfServiceEventIVLTSHigh' constraints.validation.info='CarePlanDocumentationOfServiceEventIVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanDocumentationOfServiceEventPerformer constraints.validation.error='CarePlanDocumentationOfServiceEventPerformerAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanDocumentationOfServiceEventPerformerAssignedEntity constraints.validation.error='CarePlanDocumentationOfServiceEventPerformerAssignedEntityId CarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson' constraints.validation.info='CarePlanDocumentationOfServiceEventPerformerAssignedEntityCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson constraints.validation.error='CarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanDocumentationOfServiceEventIVLTS constraints.validation.error='CarePlanDocumentationOfServiceEventIVLTSLow' constraints.validation.info='CarePlanDocumentationOfServiceEventIVLTSHigh'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanRelatedDocument constraints.validation.error='CarePlanRelatedDocumentTypeCode CarePlanRelatedDocumentTypeCodeP CarePlanRelatedDocumentParentDocument' constraints.validation.dependOn.CarePlanRelatedDocumentTypeCode='CarePlanRelatedDocumentTypeCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanRelatedDocumentParentDocument constraints.validation.error='CarePlanRelatedDocumentParentDocumentSetId CarePlanRelatedDocumentParentDocumentVersionNumber'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanComponentOf constraints.validation.error='CarePlanComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCarePlanComponentOfEncompassingEncounter constraints.validation.error='CarePlanComponentOfEncompassingEncounterEffectiveTime'"
 * @generated
 */
public interface CarePlan extends USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.getAllSections()->exists(s : cda::Section | s.oclIsTypeOf(consol::PlanOfTreatmentSection2))'"
	 * @generated
	 */
	boolean validateCarePlanDoesNotHavePlanOfTreatmentSectionV2(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateCarePlanCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = self.code.oclAsType(datatypes::CE) in \r\nvalue.code = \'52521-2\' and value.codeSystem = \'2.16.840.1.113883.6.1\')'"
	 * @generated
	 */
	boolean validateCarePlanCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCarePlanSetId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCarePlanVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->one(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))'"
	 * @generated
	 */
	boolean validateCarePlanAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReview(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCaregiver(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->exists(relatedDocument : cda::RelatedDocument | not relatedDocument.oclIsUndefined() and relatedDocument.oclIsKindOf(cda::RelatedDocument))'"
	 * @generated
	 */
	boolean validateCarePlanRelatedDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	 * @generated
	 */
	boolean validateCarePlanComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthConcernsSection))'"
	 * @generated
	 */
	boolean validateCarePlanHealthConcernsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GoalsSection))'"
	 * @generated
	 */
	boolean validateCarePlanGoalsSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthStatusEvaluationsAndOutcomesSection))'"
	 * @generated
	 */
	boolean validateCarePlanHealthStatusEvaluationsOutcomesSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection2))'"
	 * @generated
	 */
	boolean validateCarePlanInterventionsSection2(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientInformationRecipientName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((standardIndustryClassCode.oclIsUndefined() or standardIndustryClassCode.isNullFlavorUndefined()) implies (not standardIndustryClassCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((standardIndustryClassCode.oclIsUndefined() or standardIndustryClassCode.isNullFlavorUndefined()) implies (not standardIndustryClassCode.oclIsUndefined() and standardIndustryClassCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = standardIndustryClassCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganizationStandardIndustryClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization)))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipientReceivedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))'"
	 * @generated
	 */
	boolean validateCarePlanInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanAuthenticatorAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.code = \'ONESELF\' and value.codeSystem = \'2.16.840.1.113883.5.111\'))'"
	 * @generated
	 */
	boolean validateCarePlanAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanAuthenticatorAssignedEntityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanAuthenticatorSignatureCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null)->reject((sDTCSignatureText.oclIsUndefined() or sDTCSignatureText.isNullFlavorUndefined()) implies (not sDTCSignatureText.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanAuthenticatorSDTCSignatureText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateCarePlanAuthenticatorAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewAssociatedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::VRF)'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in \r\nvalue.code = \'425268008\' and value.codeSystem = \'2.16.840.1.113883.6.96\'))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewFunctionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewFunctionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCarePlanReviewAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(isDefined(\'classCode\'))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCaregiverAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and \r\nlet value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in \r\nvalue = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCaregiverAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCaregiverAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IND)'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCaregiverTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
	 * @generated
	 */
	boolean validateCarePlanParticipantCaregiverAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntityAssignedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventPerformerAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined(\'classCode\') and classCode=vocab::ActClassRoot::PCPR)'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEventPerformer1(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
	 * @generated
	 */
	boolean validateCarePlanDocumentationOfServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->excluding(null).parentDocument->excluding(null)->reject((setId.oclIsUndefined() or setId.isNullFlavorUndefined()) implies (not setId.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanRelatedDocumentParentDocumentSetId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->excluding(null).parentDocument->excluding(null)->reject((versionNumber.oclIsUndefined() or versionNumber.isNullFlavorUndefined()) implies (not versionNumber.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanRelatedDocumentParentDocumentVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->excluding(null)->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateCarePlanRelatedDocumentTypeCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->excluding(null)->reject(not typeCode.oclIsUndefined() and typeCode.oclIsKindOf(vocab::x_ActRelationshipDocument) and \r\nlet value : vocab::x_ActRelationshipDocument = typeCode.oclAsType(vocab::x_ActRelationshipDocument) in \r\nvalue = vocab::x_ActRelationshipDocument::APND or value = vocab::x_ActRelationshipDocument::RPLC)'"
	 * @generated
	 */
	boolean validateCarePlanRelatedDocumentTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.relatedDocument->excluding(null)->reject(parentDocument->one(parentDocument : cda::ParentDocument | not parentDocument.oclIsUndefined() and parentDocument.oclIsKindOf(cda::ParentDocument)))'"
	 * @generated
	 */
	boolean validateCarePlanRelatedDocumentParentDocument(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCarePlanComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	 * @generated
	 */
	boolean validateCarePlanComponentOfEncompassingEncounter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthConcernsSection))->asSequence()->any(true).oclAsType(consol::HealthConcernsSection)'"
	 * @generated
	 */
	HealthConcernsSection getHealthConcernsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GoalsSection))->asSequence()->any(true).oclAsType(consol::GoalsSection)'"
	 * @generated
	 */
	GoalsSection getGoalsSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HealthStatusEvaluationsAndOutcomesSection))->asSequence()->any(true).oclAsType(consol::HealthStatusEvaluationsAndOutcomesSection)'"
	 * @generated
	 */
	HealthStatusEvaluationsAndOutcomesSection getHealthStatusEvaluationsOutcomesSection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InterventionsSection2))->asSequence()->any(true).oclAsType(consol::InterventionsSection2)'"
	 * @generated
	 */
	InterventionsSection2 getInterventionsSection2();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlan init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CarePlan init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CarePlan
