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
 * A representation of the model object '<em><b>US Realm Header Patient Generated Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getUSRealmHeaderPatientGeneratedDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId USRealmHeaderPatientGeneratedDocumentRecordTarget USRealmHeaderPatientGeneratedDocumentAuthor USRealmHeaderPatientGeneratedDocumentCustodian USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIRoot USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIRoot USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity USRealmHeaderPatientGeneratedDocumentInformantRelatedEntity USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationIIRoot USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity USRealmHeaderPatientGeneratedDocumentParticipantTypeCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent' templateId.root='2.16.840.1.113883.10.20.29.1' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentDataEnterer USRealmHeaderPatientGeneratedDocumentInformant USRealmHeaderPatientGeneratedDocumentInformationRecipient USRealmHeaderPatientGeneratedDocumentLegalAuthenticator USRealmHeaderPatientGeneratedDocumentAuthenticator USRealmHeaderPatientGeneratedDocumentParticipant USRealmHeaderPatientGeneratedDocumentInFulfillmentOf USRealmHeaderPatientGeneratedDocumentDocumentationOf USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIRoot USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIExtension USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIRoot USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIExtension USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorIIRoot USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode USRealmHeaderPatientGeneratedDocumentInformantRelatedEntity USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationIIRoot USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode USRealmHeaderPatientGeneratedDocumentParticipantTypeCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIExtension USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIExtension USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorIIRoot USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode='USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTarget constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIRoot' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIRoot USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIExtension' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIExtension'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleII constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIRoot' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIExtension'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient constraints.validation.info='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIExtension' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIRoot' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIRoot USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIExtension'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianII constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIRoot' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIExtension'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication constraints.validation.info='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthor constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorIIRoot' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorIIRoot USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorII constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorIIRoot'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCE constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentDataEnterer constraints.validation.error='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformant constraints.validation.error='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentCustodian constraints.validation.error='USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian constraints.validation.error='USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization constraints.validation.error='USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationIIRoot' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationIIRoot'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationII constraints.validation.error='USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationIIRoot'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformationRecipient constraints.validation.error='USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientII constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator constraints.validation.error='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity constraints.validation.error='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCE constraints.validation.info='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthenticator constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentParticipant constraints.validation.error='USRealmHeaderPatientGeneratedDocumentParticipantTypeCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode='USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf constraints.validation.error='USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder constraints.validation.error='USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentDocumentationOf constraints.validation.error='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer functionCode.codeSystem='2.16.840.1.113883.5.90' functionCode.codeSystemName='HL7ParticipationType' constraints.validation.error='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity constraints.validation.error='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP'"
 * @generated
 */
public interface USRealmHeaderPatientGeneratedDocument extends USRealmHeader2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentParticipant(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOf(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIRoot(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not extension.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleIIExtension(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIRoot(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not extension.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianIIExtension(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->exists(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject(providerOrganization->one(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(rim::Entity)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorIIRoot(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null)->reject(relatedEntity->one(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(cda::RelatedEntity)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationIIRoot(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot(
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
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).code->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity(DiagnosticChain diagnostics,
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
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity(DiagnosticChain diagnostics,
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
	boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null).associatedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(isDefined(\'typeCode\'))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.90\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode(
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
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode(DiagnosticChain diagnostics,
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
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeaderPatientGeneratedDocument init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeaderPatientGeneratedDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // USRealmHeaderPatientGeneratedDocument
