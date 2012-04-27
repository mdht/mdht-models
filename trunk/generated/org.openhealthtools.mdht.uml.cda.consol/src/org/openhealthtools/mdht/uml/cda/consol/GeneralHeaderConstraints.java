/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Header Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This section describes constraints that apply to the header for all documents within the scope of this implementation guide. Header constraints specific to each document type are described in the appropriate document-specific section below
 * 
 * Document Type Codes
 * CDA R2 states that LOINC is the preferred vocabulary for document type codes, which specify the type of document being exchanged (e.g., History and Physical). Each document type in this guide recommends a single preferred clinicalDocument/code, with further specification provided by author or performer, setting, or specialty
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getGeneralHeaderConstraints()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP' templateId.root='2.16.840.1.113883.10.20.22.1.1' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP' constraints.validation.error='GeneralHeaderConstraintsTemplateId GeneralHeaderConstraintsUSRealmAddress GeneralHeaderConstraintsUSRealmPatientName GeneralHeaderConstraintsRealmCode GeneralHeaderConstraintsTypeId GeneralHeaderConstraintsId GeneralHeaderConstraintsCode GeneralHeaderConstraintsTitle GeneralHeaderConstraintsEffectiveTime GeneralHeaderConstraintsConfidentialityCode GeneralHeaderConstraintsLanguageCode GeneralHeaderConstraintsAuthor GeneralHeaderConstraintsCustodian GeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName GeneralHeaderConstraintsAuthorAssignedAuthorPersonName GeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice GeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier GeneralHeaderConstraintsAuthorAssignedAuthorAddr GeneralHeaderConstraintsAuthorAssignedAuthorId GeneralHeaderConstraintsAuthorAssignedAuthorTelecom GeneralHeaderConstraintsAuthorAssignedAuthor GeneralHeaderConstraintsDataEntererAssignedEntityPersonName GeneralHeaderConstraintsDataEntererAssignedEntityAddr GeneralHeaderConstraintsDataEntererAssignedEntityId GeneralHeaderConstraintsDataEntererAssignedEntityTelecom GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson GeneralHeaderConstraintsDataEntererAssignedEntity GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization GeneralHeaderConstraintsCustodianAssignedCustodian GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName GeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName GeneralHeaderConstraintsInformationRecipientIntendedRecipient GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson GeneralHeaderConstraintsLegalAuthenticatorTime GeneralHeaderConstraintsLegalAuthenticatorSignatureCode GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName GeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr GeneralHeaderConstraintsAuthenticatorAssignedEntityId GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom GeneralHeaderConstraintsAuthenticatorTime GeneralHeaderConstraintsAuthenticatorSignatureCode GeneralHeaderConstraintsAuthenticatorAssignedEntity GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientName GeneralHeaderConstraintsRecordTargetPatientRoleAddr GeneralHeaderConstraintsRecordTargetPatientRoleId GeneralHeaderConstraintsRecordTargetPatientRoleTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime GeneralHeaderConstraintsComponentOfEncompassingEncounterId GeneralHeaderConstraintsComponentOfEncompassingEncounter GeneralHeaderConstraintsInformantRelatedEntityPersonName GeneralHeaderConstraintsInformantRelatedEntityPerson GeneralHeaderConstraintsInformantAssignedEntityPersonName GeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsInformantAssignedEntityPerson GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization GeneralHeaderConstraintsInFulfillmentOfOrderId GeneralHeaderConstraintsInFulfillmentOfOrder' confidentialityCode.codeSystemName='ConfidentialityCode' constraints.validation.dependOn.GeneralHeaderConstraintsDataEntererAssignedEntityCode='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsAuthenticatorAssignedEntityCode='GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP' realmCode.code='US' constraints.validation.query='GeneralHeaderConstraintsUSRealmAddress GeneralHeaderConstraintsUSRealmPatientName GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName GeneralHeaderConstraintsAuthorAssignedAuthorPersonName GeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice GeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier GeneralHeaderConstraintsAuthorAssignedAuthorAddr GeneralHeaderConstraintsAuthorAssignedAuthorCodeP GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsAuthorAssignedAuthorId GeneralHeaderConstraintsAuthorAssignedAuthorTelecom GeneralHeaderConstraintsAuthorAssignedAuthor GeneralHeaderConstraintsDataEntererAssignedEntityPersonName GeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsDataEntererAssignedEntityAddr GeneralHeaderConstraintsDataEntererAssignedEntityCodeP GeneralHeaderConstraintsDataEntererAssignedEntityCode GeneralHeaderConstraintsDataEntererAssignedEntityId GeneralHeaderConstraintsDataEntererAssignedEntityTelecom GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson GeneralHeaderConstraintsDataEntererAssignedEntity GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization GeneralHeaderConstraintsCustodianAssignedCustodian GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName GeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient GeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization GeneralHeaderConstraintsInformationRecipientIntendedRecipient GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson GeneralHeaderConstraintsLegalAuthenticatorTime GeneralHeaderConstraintsLegalAuthenticatorSignatureCode GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName GeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP GeneralHeaderConstraintsAuthenticatorAssignedEntityCode GeneralHeaderConstraintsAuthenticatorAssignedEntityId GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom GeneralHeaderConstraintsAuthenticatorTime GeneralHeaderConstraintsAuthenticatorSignatureCode GeneralHeaderConstraintsAuthenticatorAssignedEntity GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode GeneralHeaderConstraintsRecordTargetPatientRolePatientName GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRoleAddr GeneralHeaderConstraintsRecordTargetPatientRoleId GeneralHeaderConstraintsRecordTargetPatientRoleTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime GeneralHeaderConstraintsComponentOfEncompassingEncounterId GeneralHeaderConstraintsComponentOfEncompassingEncounter GeneralHeaderConstraintsInformantRelatedEntityPersonName GeneralHeaderConstraintsInformantRelatedEntityAddr GeneralHeaderConstraintsInformantRelatedEntityPerson GeneralHeaderConstraintsInformantAssignedEntityPersonName GeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsInformantAssignedEntityAddr GeneralHeaderConstraintsInformantAssignedEntityCodeP GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityId GeneralHeaderConstraintsInformantAssignedEntityPerson GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization GeneralHeaderConstraintsParticipantSupportTime GeneralHeaderConstraintsInFulfillmentOfOrderId GeneralHeaderConstraintsInFulfillmentOfOrder' confidentialityCode.codeSystem='2.16.840.1.113883.5.25' constraints.validation.info='GeneralHeaderConstraintsSetId GeneralHeaderConstraintsVersionNumber GeneralHeaderConstraintsDataEnterer GeneralHeaderConstraintsInformationRecipient GeneralHeaderConstraintsAuthenticator GeneralHeaderConstraintsComponentOf GeneralHeaderConstraintsInformant GeneralHeaderConstraintsSupportParticipant GeneralHeaderConstraintsInFulfillmentOf GeneralHeaderConstraintsDataEntererAssignedEntityCodeP GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient GeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP GeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace GeneralHeaderConstraintsInformantAssignedEntityCodeP GeneralHeaderConstraintsParticipantSupportTime' constraints.validation.dependOn.GeneralHeaderConstraintsAuthorAssignedAuthorCode='GeneralHeaderConstraintsAuthorAssignedAuthorCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode='GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsInformantAssignedEntityCode='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.warning='GeneralHeaderConstraintsLegalAuthenticator GeneralHeaderConstraintsAuthorAssignedAuthorCodeP GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsDataEntererAssignedEntityCode GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode GeneralHeaderConstraintsAuthenticatorAssignedEntityCode GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsInformantRelatedEntityAddr GeneralHeaderConstraintsInformantAssignedEntityAddr GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityId' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTarget constraints.validation.error='RecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRole constraints.validation.error='PatientRoleAddr PatientRoleId PatientRoleTelecom PatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatient administrativeGenderCode.codeSystemName='AdministrativeGenderCode' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' maritalStatusCode.codeSystemName='MaritalStatus' constraints.validation.error='PatientBirthTimePreciseToYear PatientAdministrativeGenderCode PatientBirthTime PatientEthnicGroupCode PatientName' constraints.validation.dependOn.PatientEthnicGroupCode='PatientEthnicGroupCodeP' constraints.validation.warning='PatientBirthTimePreciseToDay PatientMaritalStatusCode PatientLanguageCommunication' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' maritalStatusCode.codeSystem='2.16.840.1.113883.5.2' constraints.validation.info='PatientEthnicGroupCodeP PatientRaceCode PatientReligiousAffiliationCode PatientGuardian PatientBirthplace'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian constraints.validation.dependOn.GuardianCode='GuardianCodeP' code.codeSystem='2.16.840.1.113883.5.111' constraints.validation.error='GuardianCode GuardianGuardianPerson' code.codeSystemName='RoleCode' constraints.validation.warning='GuardianAddr GuardianCodeP' constraints.validation.info='GuardianTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication proficiencyLevelCode.codeSystem='2.16.840.1.113883.5.61' constraints.validation.error='LanguageCommunicationLanguageCode LanguageCommunicationProficiencyLevelCode LanguageCommunicationModeCode' constraints.validation.dependOn.LanguageCommunicationModeCode='LanguageCommunicationModeCodeP' constraints.validation.warning='LanguageCommunicationProficiencyLevelCodeP' modeCode.codeSystem='2.16.840.1.113883.5.60' proficiencyLevelCode.codeSystemName='LanguageAbilityProficiency' constraints.validation.info='LanguageCommunicationPreferenceInd LanguageCommunicationModeCodeP' constraints.validation.dependOn.LanguageCommunicationProficiencyLevelCode='LanguageCommunicationProficiencyLevelCodeP' modeCode.codeSystemName='LanguageAbilityMode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace constraints.validation.error='BirthplacePlace'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace constraints.validation.error='PlaceAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization constraints.validation.error='ProviderOrganizationAddr ProviderOrganizationId ProviderOrganizationName ProviderOrganizationTelecom' constraints.validation.warning='ProviderOrganizationHasNationalProviderIdentifier'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsComponentOf constraints.validation.error='ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsComponentOfEncompassingEncounter constraints.validation.error='EncompassingEncounterEffectiveTime EncompassingEncounterId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthor constraints.validation.error='AuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthorAssignedAuthor code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.dependOn.AssignedAuthorCode='AssignedAuthorCodeP' constraints.validation.error='AssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice AssignedAuthorHasNationalProviderIdentifier AssignedAuthorAddr AssignedAuthorId AssignedAuthorTelecom' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedAuthorCode AssignedAuthorCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDevice constraints.validation.error='AuthoringDeviceManufacturerModelName AuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsPerson constraints.validation.error='PersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsDataEnterer constraints.validation.error='DataEntererAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsDataEntererAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedEntityAddr AssignedEntityId AssignedEntityTelecom AssignedEntityAssignedPerson' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedEntityHasNationalProviderIdentifier AssignedEntityCode' constraints.validation.dependOn.AssignedEntityCode='AssignedEntityCodeP' constraints.validation.info='AssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsCustodian constraints.validation.error='CustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsCustodianAssignedCustodian constraints.validation.error='AssignedCustodianRepresentedCustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganization constraints.validation.error='CustodianOrganizationHasNationalProviderIdentifier CustodianOrganizationAddr CustodianOrganizationId CustodianOrganizationName CustodianOrganizationTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformationRecipient constraints.validation.error='InformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformationRecipientIntendedRecipient constraints.validation.info='IntendedRecipientInformationRecipient IntendedRecipientRecievedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganization constraints.validation.error='OrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsLegalAuthenticator constraints.validation.error='LegalAuthenticatorTime LegalAuthenticatorSignatureCode' signatureCode.code='S'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedEntityHasNationalProviderIdentifier AssignedEntityAddr AssignedEntityId AssignedEntityTelecom AssignedEntityAssignedPerson' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedEntityCode' constraints.validation.dependOn.AssignedEntityCode='AssignedEntityCodeP' constraints.validation.info='AssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthenticator constraints.validation.error='AuthenticatorTime AuthenticatorSignatureCode AuthenticatorAssignedEntity' signatureCode.code='S'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthenticatorAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedEntityHasNationalProviderIdentifier AssignedEntityAddr AssignedEntityId AssignedEntityTelecom' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedEntityCode' constraints.validation.dependOn.AssignedEntityCode='AssignedEntityCodeP' constraints.validation.info='AssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformant constraints.validation.error='InformantHasAssignedEntityOrRelatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformantAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedEntityHasNationalProviderIdentifier AssignedEntityPerson' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedEntityAddr AssignedEntityCode AssignedEntityId' constraints.validation.dependOn.AssignedEntityCode='AssignedEntityCodeP' constraints.validation.info='AssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformantRelatedEntity constraints.validation.error='RelatedEntityPerson' constraints.validation.warning='RelatedEntityAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsParticipantSupport constraints.validation.error='ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization' constraints.validation.info='ParticipantSupportTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInFulfillmentOf constraints.validation.error='InFulfillmentOfOrder'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInFulfillmentOfOrder constraints.validation.error='OrderId'"
 * @generated
 */
public interface GeneralHeaderConstraints extends ClinicalDocument {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* datatypes::AD.allInstances()->reject(
	*     addr : datatypes::AD | 
	*     addr.isNullFlavorDefined() or ( 
	* 		not addr.use->isEmpty() and
	* 		addr.use->forAll(
	* 			use : vocab::PostalAddressUse |
	* 			use=vocab::PostalAddressUse::BAD or
	* 			use=vocab::PostalAddressUse::DIR or
	* 			use=vocab::PostalAddressUse::H or
	* 			use=vocab::PostalAddressUse::HP or
	* 			use=vocab::PostalAddressUse::HV or
	* 			use=vocab::PostalAddressUse::PHYS or
	* 			use=vocab::PostalAddressUse::PST or
	* 			use=vocab::PostalAddressUse::PUB or
	* 			use=vocab::PostalAddressUse::TMP or
	* 			use=vocab::PostalAddressUse::WP
	* 		) and
	* 		addr.streetAddressLine->size() >= 1 and
	* 		addr.streetAddressLine->size() <= 4 and
	* 		addr.city->size() = 1 and
	* 		addr.country->size() <= 1 and
	* 		(
	* 			(
	* 				addr.country->size() = 0 or
	* 				(
	* 					addr.country->size() = 1 and addr.country->asSequence()->first().getText()='US'
	* 				)
	* 			) implies addr.state->size() = 1 and addr.postalCode->size() = 1
	* 		)
	* 	)
	* )
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='datatypes::AD.allInstances()->reject(\r\n    addr : datatypes::AD | \r\n    addr.isNullFlavorDefined() or ( \r\n\t\tnot addr.use->isEmpty() and\r\n\t\taddr.use->forAll(\r\n\t\t\tuse : vocab::PostalAddressUse |\r\n\t\t\tuse=vocab::PostalAddressUse::BAD or\r\n\t\t\tuse=vocab::PostalAddressUse::DIR or\r\n\t\t\tuse=vocab::PostalAddressUse::H or\r\n\t\t\tuse=vocab::PostalAddressUse::HP or\r\n\t\t\tuse=vocab::PostalAddressUse::HV or\r\n\t\t\tuse=vocab::PostalAddressUse::PHYS or\r\n\t\t\tuse=vocab::PostalAddressUse::PST or\r\n\t\t\tuse=vocab::PostalAddressUse::PUB or\r\n\t\t\tuse=vocab::PostalAddressUse::TMP or\r\n\t\t\tuse=vocab::PostalAddressUse::WP\r\n\t\t) and\r\n\t\taddr.streetAddressLine->size() >= 1 and\r\n\t\taddr.streetAddressLine->size() <= 4 and\r\n\t\taddr.city->size() = 1 and\r\n\t\taddr.country->size() <= 1 and\r\n\t\t(\r\n\t\t\t(\r\n\t\t\t\taddr.country->size() = 0 or\r\n\t\t\t\t(\r\n\t\t\t\t\taddr.country->size() = 1 and addr.country->asSequence()->first().getText()=\'US\'\r\n\t\t\t\t)\r\n\t\t\t) implies addr.state->size() = 1 and addr.postalCode->size() = 1\r\n\t\t)\r\n\t)\r\n)'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsUSRealmAddress(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* datatypes::PN.allInstances()->reject(
	*     name : datatypes::PN |
	*     name.use->forAll(
	*         use : vocab::EntityNameUse |
	*         use=vocab::EntityNameUse::A or
	*         use=vocab::EntityNameUse::ABC or
	*         use=vocab::EntityNameUse::ASGN or
	*         use=vocab::EntityNameUse::C or
	*         use=vocab::EntityNameUse::I or
	*         use=vocab::EntityNameUse::IDE or
	*         use=vocab::EntityNameUse::L or
	*         use=vocab::EntityNameUse::P or
	*         use=vocab::EntityNameUse::PHON or
	*         use=vocab::EntityNameUse::R or
	*         use=vocab::EntityNameUse::SNDX or
	*         use=vocab::EntityNameUse::SRCH or
	*         use=vocab::EntityNameUse::SYL
	*     ) and
	*     name.prefix->forAll(
	*         prefix : datatypes::ENXP |
	*         prefix.qualifier->forAll(
	*             qualifier : vocab::EntityNamePartQualifier |
	*             qualifier=vocab::EntityNamePartQualifier::AC or
	*             qualifier=vocab::EntityNamePartQualifier::AD or
	*             qualifier=vocab::EntityNamePartQualifier::BR or
	*             qualifier=vocab::EntityNamePartQualifier::CL or
	*             qualifier=vocab::EntityNamePartQualifier::IN or
	*             qualifier=vocab::EntityNamePartQualifier::NB or
	*             qualifier=vocab::EntityNamePartQualifier::PR or
	*             qualifier=vocab::EntityNamePartQualifier::SP or
	*             qualifier=vocab::EntityNamePartQualifier::TITLE or
	*             qualifier=vocab::EntityNamePartQualifier::VV
	*         )
	*     ) and
	*     name.given->size() >= 1 and
	*     name.given->forAll(
	*         given : datatypes::ENXP |
	*         given.qualifier->forAll(
	*             qualifier : vocab::EntityNamePartQualifier |
	* 	    qualifier=vocab::EntityNamePartQualifier::AC or
	* 	    qualifier=vocab::EntityNamePartQualifier::AD or
	* 	    qualifier=vocab::EntityNamePartQualifier::BR or
	* 	    qualifier=vocab::EntityNamePartQualifier::CL or
	* 	    qualifier=vocab::EntityNamePartQualifier::IN or
	* 	    qualifier=vocab::EntityNamePartQualifier::NB or
	* 	    qualifier=vocab::EntityNamePartQualifier::PR or
	* 	    qualifier=vocab::EntityNamePartQualifier::SP or
	* 	    qualifier=vocab::EntityNamePartQualifier::TITLE or
	* 	    qualifier=vocab::EntityNamePartQualifier::VV
	*         )
	*     ) and
	*     name.family->size() = 1 and
	*     name.family->forAll(
	*         family : datatypes::ENXP |
	*         family.qualifier->forAll(
	*             qualifier : vocab::EntityNamePartQualifier |
	* 	    qualifier=vocab::EntityNamePartQualifier::AC or
	* 	    qualifier=vocab::EntityNamePartQualifier::AD or
	* 	    qualifier=vocab::EntityNamePartQualifier::BR or
	* 	    qualifier=vocab::EntityNamePartQualifier::CL or
	* 	    qualifier=vocab::EntityNamePartQualifier::IN or
	* 	    qualifier=vocab::EntityNamePartQualifier::NB or
	* 	    qualifier=vocab::EntityNamePartQualifier::PR or
	* 	    qualifier=vocab::EntityNamePartQualifier::SP or
	* 	    qualifier=vocab::EntityNamePartQualifier::TITLE or
	* 	    qualifier=vocab::EntityNamePartQualifier::VV
	*         )
	*     ) and
	*     name.suffix->size() <= 1 and
	*     name.suffix->forAll(
	*         suffix : datatypes::ENXP |
	*         suffix.qualifier->forAll(
	*             qualifier : vocab::EntityNamePartQualifier |
	* 	    qualifier=vocab::EntityNamePartQualifier::AC or
	* 	    qualifier=vocab::EntityNamePartQualifier::AD or
	* 	    qualifier=vocab::EntityNamePartQualifier::BR or
	* 	    qualifier=vocab::EntityNamePartQualifier::CL or
	* 	    qualifier=vocab::EntityNamePartQualifier::IN or
	* 	    qualifier=vocab::EntityNamePartQualifier::NB or
	* 	    qualifier=vocab::EntityNamePartQualifier::PR or
	* 	    qualifier=vocab::EntityNamePartQualifier::SP or
	* 	    qualifier=vocab::EntityNamePartQualifier::TITLE or
	* 	    qualifier=vocab::EntityNamePartQualifier::VV
	*         )
	*     )
	* )
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='datatypes::PN.allInstances()->reject(\r\n    name : datatypes::PN |\r\n    name.use->forAll(\r\n        use : vocab::EntityNameUse |\r\n        use=vocab::EntityNameUse::A or\r\n        use=vocab::EntityNameUse::ABC or\r\n        use=vocab::EntityNameUse::ASGN or\r\n        use=vocab::EntityNameUse::C or\r\n        use=vocab::EntityNameUse::I or\r\n        use=vocab::EntityNameUse::IDE or\r\n        use=vocab::EntityNameUse::L or\r\n        use=vocab::EntityNameUse::P or\r\n        use=vocab::EntityNameUse::PHON or\r\n        use=vocab::EntityNameUse::R or\r\n        use=vocab::EntityNameUse::SNDX or\r\n        use=vocab::EntityNameUse::SRCH or\r\n        use=vocab::EntityNameUse::SYL\r\n    ) and\r\n    name.prefix->forAll(\r\n        prefix : datatypes::ENXP |\r\n        prefix.qualifier->forAll(\r\n            qualifier : vocab::EntityNamePartQualifier |\r\n            qualifier=vocab::EntityNamePartQualifier::AC or\r\n            qualifier=vocab::EntityNamePartQualifier::AD or\r\n            qualifier=vocab::EntityNamePartQualifier::BR or\r\n            qualifier=vocab::EntityNamePartQualifier::CL or\r\n            qualifier=vocab::EntityNamePartQualifier::IN or\r\n            qualifier=vocab::EntityNamePartQualifier::NB or\r\n            qualifier=vocab::EntityNamePartQualifier::PR or\r\n            qualifier=vocab::EntityNamePartQualifier::SP or\r\n            qualifier=vocab::EntityNamePartQualifier::TITLE or\r\n            qualifier=vocab::EntityNamePartQualifier::VV\r\n        )\r\n    ) and\r\n    name.given->size() >= 1 and\r\n    name.given->forAll(\r\n        given : datatypes::ENXP |\r\n        given.qualifier->forAll(\r\n            qualifier : vocab::EntityNamePartQualifier |\r\n\t    qualifier=vocab::EntityNamePartQualifier::AC or\r\n\t    qualifier=vocab::EntityNamePartQualifier::AD or\r\n\t    qualifier=vocab::EntityNamePartQualifier::BR or\r\n\t    qualifier=vocab::EntityNamePartQualifier::CL or\r\n\t    qualifier=vocab::EntityNamePartQualifier::IN or\r\n\t    qualifier=vocab::EntityNamePartQualifier::NB or\r\n\t    qualifier=vocab::EntityNamePartQualifier::PR or\r\n\t    qualifier=vocab::EntityNamePartQualifier::SP or\r\n\t    qualifier=vocab::EntityNamePartQualifier::TITLE or\r\n\t    qualifier=vocab::EntityNamePartQualifier::VV\r\n        )\r\n    ) and\r\n    name.family->size() = 1 and\r\n    name.family->forAll(\r\n        family : datatypes::ENXP |\r\n        family.qualifier->forAll(\r\n            qualifier : vocab::EntityNamePartQualifier |\r\n\t    qualifier=vocab::EntityNamePartQualifier::AC or\r\n\t    qualifier=vocab::EntityNamePartQualifier::AD or\r\n\t    qualifier=vocab::EntityNamePartQualifier::BR or\r\n\t    qualifier=vocab::EntityNamePartQualifier::CL or\r\n\t    qualifier=vocab::EntityNamePartQualifier::IN or\r\n\t    qualifier=vocab::EntityNamePartQualifier::NB or\r\n\t    qualifier=vocab::EntityNamePartQualifier::PR or\r\n\t    qualifier=vocab::EntityNamePartQualifier::SP or\r\n\t    qualifier=vocab::EntityNamePartQualifier::TITLE or\r\n\t    qualifier=vocab::EntityNamePartQualifier::VV\r\n        )\r\n    ) and\r\n    name.suffix->size() <= 1 and\r\n    name.suffix->forAll(\r\n        suffix : datatypes::ENXP |\r\n        suffix.qualifier->forAll(\r\n            qualifier : vocab::EntityNamePartQualifier |\r\n\t    qualifier=vocab::EntityNamePartQualifier::AC or\r\n\t    qualifier=vocab::EntityNamePartQualifier::AD or\r\n\t    qualifier=vocab::EntityNamePartQualifier::BR or\r\n\t    qualifier=vocab::EntityNamePartQualifier::CL or\r\n\t    qualifier=vocab::EntityNamePartQualifier::IN or\r\n\t    qualifier=vocab::EntityNamePartQualifier::NB or\r\n\t    qualifier=vocab::EntityNamePartQualifier::PR or\r\n\t    qualifier=vocab::EntityNamePartQualifier::SP or\r\n\t    qualifier=vocab::EntityNamePartQualifier::TITLE or\r\n\t    qualifier=vocab::EntityNamePartQualifier::VV\r\n        )\r\n    )\r\n)'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsUSRealmPatientName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1')
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.1.1\')'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = element.oclAsType(datatypes::CS) in 
	* value.code = 'US'))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = element.oclAsType(datatypes::CS) in \nvalue.code = \'US\'))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsTypeId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateGeneralHeaderConstraintsEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.25' and not value.code.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.25\' and not value.code.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in 
	* not value.code.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in \nnot value.code.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsSetId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* (self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsVersionNumber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCustodian(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticator(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->one(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->one(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsSupportParticipant(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((softwareName.oclIsUndefined() or softwareName.isNullFlavorUndefined()) implies (not softwareName.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((softwareName.oclIsUndefined() or softwareName.isNullFlavorUndefined()) implies (not softwareName.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson.oclIsUndefined() xor assignedAuthoringDevice.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson.oclIsUndefined() xor assignedAuthoringDevice.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\'))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null).assignedAuthor->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\'))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.dataEnterer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).receivedOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null).informationRecipient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\'))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.legalAuthenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in 
	* value.code = 'S'))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in \nvalue.code = \'S\'))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\'))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null).assignedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in 
	* value.code = 'S'))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null)->reject((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in \nvalue.code = \'S\'))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorSignatureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.authenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.authenticator->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject(guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject(guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(not birthTime.value.oclIsUndefined() and birthTime.value.size() >= 4)
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(not birthTime.value.oclIsUndefined() and birthTime.value.size() >= 4)'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(not birthTime.value.oclIsUndefined()  and birthTime.value.size() >= 6)
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(not birthTime.value.oclIsUndefined()  and birthTime.value.size() >= 6)'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN')))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.1\' and (value.code = \'F\' or value.code = \'M\' or value.code = \'UN\')))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null).place->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null).place->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null)->reject(place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthplace->excluding(null)->reject(place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).guardianPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).guardianPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = proficiencyLevelCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P')))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (proficiencyLevelCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = proficiencyLevelCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.61\' and (value.code = \'E\' or value.code = \'F\' or value.code = \'G\' or value.code = \'P\')))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (not proficiencyLevelCode.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (not proficiencyLevelCode.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (modeCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = modeCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.60' and (value.code = 'ESGN' or value.code = 'ESP' or value.code = 'EWR' or value.code = 'RSGN' or value.code = 'RSP' or value.code = 'RWR')))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (modeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = modeCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.60\' and (value.code = \'ESGN\' or value.code = \'ESP\' or value.code = \'EWR\' or value.code = \'RSGN\' or value.code = \'RSP\' or value.code = \'RWR\')))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (not modeCode.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (not modeCode.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (ethnicGroupCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (ethnicGroupCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.238\' and not value.code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((maritalStatusCode.oclIsUndefined() or maritalStatusCode.isNullFlavorUndefined()) implies (maritalStatusCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = maritalStatusCode.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'T' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'S' or value.code = 'P' or value.code = 'W')))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((maritalStatusCode.oclIsUndefined() or maritalStatusCode.isNullFlavorUndefined()) implies (maritalStatusCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = maritalStatusCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.2\' and (value.code = \'A\' or value.code = \'D\' or value.code = \'T\' or value.code = \'I\' or value.code = \'L\' or value.code = \'M\' or value.code = \'S\' or value.code = \'P\' or value.code = \'W\')))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (raceCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in 
	* not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (raceCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((religiousAffiliationCode.oclIsUndefined() or religiousAffiliationCode.isNullFlavorUndefined()) implies (religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = religiousAffiliationCode.oclAsType(datatypes::CE) in 
	* not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((religiousAffiliationCode.oclIsUndefined() or religiousAffiliationCode.isNullFlavorUndefined()) implies (religiousAffiliationCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = religiousAffiliationCode.oclAsType(datatypes::CE) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->one(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->one(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).providerOrganization->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS) and 
	* let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in 
	* not value.code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in \nnot value.code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).relatedEntity->excluding(null).relatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).relatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	* let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	* value.codeSystem = '2.16.840.1.113883.6.101'))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\'))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null)->reject(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null)->reject(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.participant->excluding(null)->reject(associatedEntity.associatedPerson.oclIsUndefined() xor associatedEntity.scopingOrganization.oclIsUndefined())
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject(associatedEntity.associatedPerson.oclIsUndefined() xor associatedEntity.scopingOrganization.oclIsUndefined())'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).relatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantRelatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).relatedEntity->excluding(null)->reject(relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null)->reject(relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantRelatedEntityPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.informant->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root='2.16.840.1.113883.4.6' ))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject(id->exists( root=\'2.16.840.1.113883.4.6\' ))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.participant->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsParticipantSupportTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->excluding(null).order->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.inFulfillmentOf->excluding(null)->reject(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order)))'"
	* @generated
	*/
	boolean validateGeneralHeaderConstraintsInFulfillmentOfOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public GeneralHeaderConstraints init();
} // GeneralHeaderConstraints
