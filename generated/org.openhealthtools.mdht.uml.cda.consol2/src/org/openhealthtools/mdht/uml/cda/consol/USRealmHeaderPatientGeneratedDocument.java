/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>US Realm Header Patient Generated Document</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getUSRealmHeaderPatientGeneratedDocument()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='USRealmHeader2TemplateId USRealmHeaderPatientGeneratedDocumentRecordTarget USRealmHeaderPatientGeneratedDocumentAuthor USRealmHeaderPatientGeneratedDocumentCustodian USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity USRealmHeaderPatientGeneratedDocumentParticipantTypeCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent' templateId.root='2.16.840.1.113883.10.20.29.1' templateId.extension='2015-08-01' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentDataEnterer USRealmHeaderPatientGeneratedDocumentInformant USRealmHeaderPatientGeneratedDocumentInformationRecipient USRealmHeaderPatientGeneratedDocumentLegalAuthenticator USRealmHeaderPatientGeneratedDocumentAuthenticator USRealmHeaderPatientGeneratedDocumentParticipant USRealmHeaderPatientGeneratedDocumentInFulfillmentOf USRealmHeaderPatientGeneratedDocumentDocumentationOf USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP USRealmHeaderPatientGeneratedDocumentInformantRelatedEntity USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode USRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity USRealmHeaderPatientGeneratedDocumentInformantRelatedEntity USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode USRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes USRealmHeaderPatientGeneratedDocumentParticipantTypeCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrderId USRealmHeaderPatientGeneratedDocumentInFulfillmentOfOrder USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityId USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntity USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventCode USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformer USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCode='USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCode='USRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEventPerformerFunctionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTarget constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRole constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRoleProviderOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatient constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardian constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianId USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.error='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCode='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientGuardianCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunication constraints.validation.info='USRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthor constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthor constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorId AssignedAuthorUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCode AssignedAuthorUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology' constraints.validation.query='AssignedAuthorUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology AssignedAuthorUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCE constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology' constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentDataEnterer constraints.validation.error='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntity code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentDataEntererAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformant constraints.validation.error='USRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformantRelatedEntity code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCode='USRealmHeaderPatientGeneratedDocumentInformantRelatedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentCustodian constraints.validation.error='USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodian constraints.validation.error='USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganization constraints.validation.error='USRealmHeaderPatientGeneratedDocumentCustodianAssignedCustodianRepresentedCustodianOrganizationId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformationRecipient constraints.validation.error='USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipient constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientId USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot' constraints.validation.query='USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientII constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentInformationRecipientIntendedRecipientIIRoot'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentLegalAuthenticator constraints.validation.error='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntity constraints.validation.error='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCode AssignedEntityUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode' constraints.validation.warning='AssignedEntityUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology' constraints.validation.query='AssignedEntityUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology AssignedEntityUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCE constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology' constraints.validation.info='USRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthenticator constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntity constraints.validation.error='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityId' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCode='USRealmHeaderPatientGeneratedDocumentAuthenticatorAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeaderPatientGeneratedDocumentParticipant constraints.validation.warning='USRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes' constraints.validation.error='USRealmHeaderPatientGeneratedDocumentParticipantTypeCode USRealmHeaderPatientGeneratedDocumentParticipantAssociatedEntity'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer-&gt;one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant-&gt;exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian-&gt;one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator-&gt;one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator-&gt;exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf-&gt;exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null).patient-&gt;excluding(null).guardian-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null).patient-&gt;excluding(null).guardian-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null).patient-&gt;excluding(null).guardian-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null).patient-&gt;excluding(null).languageCommunication-&gt;excluding(null)-&gt;reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null).patient-&gt;excluding(null)-&gt;reject(languageCommunication-&gt;size() &gt; 1 implies languageCommunication-&gt;one( langCom : cda::LanguageCommunication | langCom.preferenceInd.value))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentRecordTargetPatientRolePatientIfMoreThanOneLangComm(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null).patient-&gt;excluding(null)-&gt;reject(guardian-&gt;exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null).patient-&gt;excluding(null)-&gt;reject(languageCommunication-&gt;exists(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null)-&gt;reject(patient-&gt;one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null).patientRole-&gt;excluding(null)-&gt;reject(providerOrganization-&gt;one(providerOrganization : cda::Organization | not providerOrganization.oclIsUndefined() and providerOrganization.oclIsKindOf(rim::Entity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget-&gt;excluding(null)-&gt;reject(patientRole-&gt;one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;excluding(null).assignedAuthor-&gt;excluding(null).code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies (codeSystem = \'2.16.840.1.113883.5.111\'))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentAuthorAssignedAuthorCECodeSystemAndTerminology(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;excluding(null).assignedAuthor-&gt;excluding(null).code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;excluding(null).assignedAuthor-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;excluding(null).assignedAuthor-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author-&gt;excluding(null)-&gt;reject(assignedAuthor-&gt;one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer-&gt;excluding(null)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant-&gt;excluding(null).relatedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant-&gt;excluding(null).relatedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant-&gt;excluding(null)-&gt;reject(relatedEntity-&gt;one(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(cda::RelatedEntity)) xor assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentInformantHasRelatedEntityOrAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant-&gt;excluding(null)-&gt;reject(relatedEntity-&gt;one(relatedEntity : cda::RelatedEntity | not relatedEntity.oclIsUndefined() and relatedEntity.oclIsKindOf(cda::RelatedEntity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian-&gt;excluding(null).assignedCustodian-&gt;excluding(null).representedCustodianOrganization-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian-&gt;excluding(null).assignedCustodian-&gt;excluding(null)-&gt;reject(representedCustodianOrganization-&gt;one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian-&gt;excluding(null)-&gt;reject(assignedCustodian-&gt;one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null).intendedRecipient-&gt;excluding(null).id-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null).intendedRecipient-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient-&gt;excluding(null)-&gt;reject(intendedRecipient-&gt;one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator-&gt;excluding(null).assignedEntity-&gt;excluding(null).code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject(isNullFlavorUndefined() implies (codeSystem = \'2.16.840.1.113883.5.111\'))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityCECodeSystemAndTerminology(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator-&gt;excluding(null).assignedEntity-&gt;excluding(null).code-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not code.oclIsUndefined() )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator-&gt;excluding(null)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator-&gt;excluding(null)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).associatedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null).associatedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(p : cda::Participant1 | p.typeCode = vocab::ParticipationType::IND and not ( p.associatedEntity.classCode = vocab::RoleClassAssociative::PRS  or p.associatedEntity.classCode = vocab::RoleClassAssociative::NOK or p.associatedEntity.classCode = vocab::RoleClassAssociative::CAREGIVER or p.associatedEntity.classCode = vocab::RoleClassAssociative::AGNT or p.associatedEntity.classCode = vocab::RoleClassAssociative::GUAR or p.associatedEntity.classCode = vocab::RoleClassAssociative::ECON or p.associatedEntity.isNullFlavorDefined() ) or p.associatedEntity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentParticipantIfTypeCodeINDThenAEClassCodeFromINDRoleclassCodes(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(isDefined(\'typeCode\'))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant-&gt;excluding(null)-&gt;reject(associatedEntity-&gt;one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf-&gt;excluding(null).order-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf-&gt;excluding(null)-&gt;reject(order-&gt;one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((id-&gt;isEmpty() or id-&gt;exists(element | element.isNullFlavorUndefined())) implies (not id-&gt;isEmpty()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null).assignedEntity-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.90\' and not value.code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null).performer-&gt;excluding(null)-&gt;reject(assignedEntity-&gt;one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null).serviceEvent-&gt;excluding(null)-&gt;reject(performer-&gt;exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf-&gt;excluding(null)-&gt;reject(serviceEvent-&gt;one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))'"
	 * @generated
	 */
	boolean validateUSRealmHeaderPatientGeneratedDocumentDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USRealmHeaderPatientGeneratedDocument init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USRealmHeaderPatientGeneratedDocument init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // USRealmHeaderPatientGeneratedDocument
