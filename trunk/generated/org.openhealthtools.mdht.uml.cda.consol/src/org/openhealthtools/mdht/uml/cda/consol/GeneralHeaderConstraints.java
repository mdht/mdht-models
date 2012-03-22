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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.22.1.1' constraints.validation.error='GeneralHeaderConstraintsTemplateId GeneralHeaderConstraintsUSRealmAddress GeneralHeaderConstraintsUSRealmPatientName GeneralHeaderConstraintsRealmCode GeneralHeaderConstraintsTypeId GeneralHeaderConstraintsId GeneralHeaderConstraintsCode GeneralHeaderConstraintsTitle GeneralHeaderConstraintsEffectiveTime GeneralHeaderConstraintsConfidentialityCode GeneralHeaderConstraintsLanguageCode GeneralHeaderConstraintsAuthor GeneralHeaderConstraintsCustodian GeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName GeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName GeneralHeaderConstraintsAuthorAssignedAuthorPersonName GeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice GeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier GeneralHeaderConstraintsAuthorAssignedAuthorAddr GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsAuthorAssignedAuthorId GeneralHeaderConstraintsAuthorAssignedAuthorTelecom GeneralHeaderConstraintsAuthorAssignedAuthor GeneralHeaderConstraintsDataEntererAssignedEntityPersonName GeneralHeaderConstraintsDataEntererAssignedEntityAddr GeneralHeaderConstraintsDataEntererAssignedEntityId GeneralHeaderConstraintsDataEntererAssignedEntityTelecom GeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson GeneralHeaderConstraintsDataEntererAssignedEntity GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName GeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom GeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization GeneralHeaderConstraintsCustodianAssignedCustodian GeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName GeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName GeneralHeaderConstraintsInformationRecipientIntendedRecipient GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson GeneralHeaderConstraintsLegalAuthenticatorTime GeneralHeaderConstraintsLegalAuthenticatorSignatureCode GeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName GeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsAuthenticatorAssignedEntityAddr GeneralHeaderConstraintsAuthenticatorAssignedEntityId GeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom GeneralHeaderConstraintsAuthenticatorTime GeneralHeaderConstraintsAuthenticatorSignatureCode GeneralHeaderConstraintsAuthenticatorAssignedEntity GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientName GeneralHeaderConstraintsRecordTargetPatientRoleAddr GeneralHeaderConstraintsRecordTargetPatientRoleId GeneralHeaderConstraintsRecordTargetPatientRoleTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime GeneralHeaderConstraintsComponentOfEncompassingEncounterId GeneralHeaderConstraintsComponentOfEncompassingEncounter GeneralHeaderConstraintsInformantRelatedEntityPersonName GeneralHeaderConstraintsInformantRelatedEntityPerson GeneralHeaderConstraintsInformantAssignedEntityPersonName GeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityPerson GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization GeneralHeaderConstraintsInFulfillmentOfOrderId GeneralHeaderConstraintsInFulfillmentOfOrder' constraints.validation.warning='GeneralHeaderConstraintsLegalAuthenticator GeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier GeneralHeaderConstraintsDataEntererAssignedEntityCode GeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode GeneralHeaderConstraintsAuthenticatorAssignedEntityCode GeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsInformantRelatedEntityAddr GeneralHeaderConstraintsInformantAssignedEntityAddr GeneralHeaderConstraintsInformantAssignedEntityId' confidentialityCode.codeSystemName='ConfidentialityCode' realmCode.code='US' constraints.validation.query='GeneralHeaderConstraintsUSRealmAddress GeneralHeaderConstraintsUSRealmPatientName' confidentialityCode.codeSystem='2.16.840.1.113883.5.25' constraints.validation.info='GeneralHeaderConstraintsSetId GeneralHeaderConstraintsVersionNumber GeneralHeaderConstraintsDataEnterer GeneralHeaderConstraintsInformationRecipient GeneralHeaderConstraintsAuthenticator GeneralHeaderConstraintsComponentOf GeneralHeaderConstraintsInformant GeneralHeaderConstraintsSupportParticipant GeneralHeaderConstraintsInFulfillmentOf GeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient GeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace GeneralHeaderConstraintsParticipantSupportTime'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTarget constraints.validation.error='RecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRole constraints.validation.error='PatientRoleAddr PatientRoleId PatientRoleTelecom PatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatient administrativeGenderCode.codeSystemName='AdministrativeGenderCode' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' maritalStatusCode.codeSystemName='MaritalStatus' constraints.validation.error='PatientBirthTimePreciseToYear PatientAdministrativeGenderCode PatientBirthTime PatientEthnicGroupCode PatientName' constraints.validation.warning='PatientBirthTimePreciseToDay PatientMaritalStatusCode PatientLanguageCommunication' administrativeGenderCode.codeSystem='2.16.840.1.113883.5.1' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' maritalStatusCode.codeSystem='2.16.840.1.113883.5.2' constraints.validation.info='PatientRaceCode PatientReligiousAffiliationCode PatientGuardian PatientBirthplace'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian code.codeSystem='2.16.840.1.113883.5.111' constraints.validation.error='GuardianGuardianPerson' code.codeSystemName='RoleCode' constraints.validation.warning='GuardianAddr GuardianCode' constraints.validation.info='GuardianTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication proficiencyLevelCode.codeSystem='2.16.840.1.113883.5.61' constraints.validation.error='LanguageCommunicationLanguageCode' constraints.validation.warning='LanguageCommunicationProficiencyLevelCode' proficiencyLevelCode.codeSystemName='LanguageAbilityProficiency' constraints.validation.info='LanguageCommunicationPreferenceInd LanguageCommunicationModeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace constraints.validation.error='BirthplacePlace'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace constraints.validation.error='PlaceAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganization constraints.validation.error='ProviderOrganizationAddr ProviderOrganizationId ProviderOrganizationName ProviderOrganizationTelecom' constraints.validation.warning='ProviderOrganizationHasNationalProviderIdentifier'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsComponentOf constraints.validation.error='ComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsComponentOfEncompassingEncounter constraints.validation.error='EncompassingEncounterEffectiveTime EncompassingEncounterId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthor constraints.validation.error='AuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthorAssignedAuthor code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice AssignedAuthorHasNationalProviderIdentifier AssignedAuthorAddr AssignedAuthorCode AssignedAuthorId AssignedAuthorTelecom' code.codeSystemName='NUCC Health Care Provider Taxonomy'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDevice constraints.validation.error='AuthoringDeviceManufacturerModelName AuthoringDeviceSoftwareName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsPerson constraints.validation.error='PersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsDataEnterer constraints.validation.error='DataEntererAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsDataEntererAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedEntityAddr AssignedEntityId AssignedEntityTelecom AssignedEntityAssignedPerson' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedEntityHasNationalProviderIdentifier AssignedEntityCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsCustodian constraints.validation.error='CustodianAssignedCustodian'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsCustodianAssignedCustodian constraints.validation.error='AssignedCustodianRepresentedCustodianOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganization constraints.validation.error='CustodianOrganizationHasNationalProviderIdentifier CustodianOrganizationAddr CustodianOrganizationId CustodianOrganizationName CustodianOrganizationTelecom'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformationRecipient constraints.validation.error='InformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformationRecipientIntendedRecipient constraints.validation.info='IntendedRecipientInformationRecipient IntendedRecipientRecievedOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganization constraints.validation.error='OrganizationName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsLegalAuthenticator constraints.validation.error='LegalAuthenticatorTime LegalAuthenticatorSignatureCode' signatureCode.code='S'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsLegalAuthenticatorAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedEntityHasNationalProviderIdentifier AssignedEntityAddr AssignedEntityId AssignedEntityTelecom AssignedEntityAssignedPerson' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedEntityCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthenticator constraints.validation.error='AuthenticatorTime AuthenticatorSignatureCode AuthenticatorAssignedEntity' signatureCode.code='S'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsAuthenticatorAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedEntityHasNationalProviderIdentifier AssignedEntityAddr AssignedEntityId AssignedEntityTelecom' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedEntityCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformant constraints.validation.error='InformantHasAssignedEntityOrRelatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolGeneralHeaderConstraintsInformantAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' constraints.validation.error='AssignedEntityHasNationalProviderIdentifier AssignedEntityCode AssignedEntityPerson' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='AssignedEntityAddr AssignedEntityId'"
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
	 *     not addr.use->isEmpty() and
	 *     addr.use->forAll(
	 *         use : vocab::PostalAddressUse |
	 *         use=vocab::PostalAddressUse::BAD or
	 *         use=vocab::PostalAddressUse::DIR or
	 *         use=vocab::PostalAddressUse::H or
	 *         use=vocab::PostalAddressUse::HP or
	 *         use=vocab::PostalAddressUse::HV or
	 *         use=vocab::PostalAddressUse::PHYS or
	 *         use=vocab::PostalAddressUse::PST or
	 *         use=vocab::PostalAddressUse::PUB or
	 *         use=vocab::PostalAddressUse::TMP or
	 *         use=vocab::PostalAddressUse::WP
	 *     ) and
	 *     addr.streetAddressLine->size() >= 1 and
	 *     addr.streetAddressLine->size() <= 4 and
	 *     addr.city->size() = 1 and
	 *     addr.country->size() <= 1 and
	 *     (
	 *         (
	 *             addr.country->size() = 0 or
	 *             (
	 *                 addr.country->size() = 1 and addr.country->asSequence()->first().getText()='US'
	 *             )
	 *         ) implies addr.state->size() = 1 and addr.postalCode->size() = 1
	 *     )
	 * )
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='datatypes::AD.allInstances()->reject(\r\n    addr : datatypes::AD | \r\n    not addr.use->isEmpty() and\r\n    addr.use->forAll(\r\n        use : vocab::PostalAddressUse |\r\n        use=vocab::PostalAddressUse::BAD or\r\n        use=vocab::PostalAddressUse::DIR or\r\n        use=vocab::PostalAddressUse::H or\r\n        use=vocab::PostalAddressUse::HP or\r\n        use=vocab::PostalAddressUse::HV or\r\n        use=vocab::PostalAddressUse::PHYS or\r\n        use=vocab::PostalAddressUse::PST or\r\n        use=vocab::PostalAddressUse::PUB or\r\n        use=vocab::PostalAddressUse::TMP or\r\n        use=vocab::PostalAddressUse::WP\r\n    ) and\r\n    addr.streetAddressLine->size() >= 1 and\r\n    addr.streetAddressLine->size() <= 4 and\r\n    addr.city->size() = 1 and\r\n    addr.country->size() <= 1 and\r\n    (\r\n        (\r\n            addr.country->size() = 0 or\r\n            (\r\n                addr.country->size() = 1 and addr.country->asSequence()->first().getText()=\'US\'\r\n            )\r\n        ) implies addr.state->size() = 1 and addr.postalCode->size() = 1\r\n    )\r\n)'"
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
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) and self.author.assignedAuthor.assignedAuthoringDevice->exists(not oclIsUndefined()) then self.author.assignedAuthor.assignedAuthoringDevice->forAll((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) and self.author.assignedAuthor.assignedAuthoringDevice->exists(not oclIsUndefined()) then self.author.assignedAuthor.assignedAuthoringDevice->forAll((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) and self.author.assignedAuthor.assignedAuthoringDevice->exists(not oclIsUndefined()) then self.author.assignedAuthor.assignedAuthoringDevice->forAll((softwareName.oclIsUndefined() or softwareName.isNullFlavorUndefined()) implies (not softwareName.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) and self.author.assignedAuthor.assignedAuthoringDevice->exists(not oclIsUndefined()) then self.author.assignedAuthor.assignedAuthoringDevice->forAll((softwareName.oclIsUndefined() or softwareName.isNullFlavorUndefined()) implies (not softwareName.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) and self.author.assignedAuthor.assignedPerson->exists(not oclIsUndefined()) then self.author.assignedAuthor.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) and self.author.assignedAuthor.assignedPerson->exists(not oclIsUndefined()) then self.author.assignedAuthor.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll(assignedPerson.oclIsUndefined() xor assignedAuthoringDevice.oclIsUndefined()) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll(assignedPerson.oclIsUndefined() xor assignedAuthoringDevice.oclIsUndefined()) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll(id->exists( root='2.16.840.1.113883.4.6' )) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll(id->exists( root=\'2.16.840.1.113883.4.6\' )) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.101')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\')) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) and self.author.assignedAuthor->exists(not oclIsUndefined()) then self.author.assignedAuthor->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.author->exists(not oclIsUndefined()) then self.author->forAll(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.author->exists(not oclIsUndefined()) then self.author->forAll(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthorAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity.assignedPerson->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity.assignedPerson->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll(id->exists( root='2.16.840.1.113883.4.6' )) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll(id->exists( root=\'2.16.840.1.113883.4.6\' )) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.101')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\')) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.dataEnterer->exists(not oclIsUndefined()) and self.dataEnterer.assignedEntity->exists(not oclIsUndefined()) then self.dataEnterer.assignedEntity->forAll(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.dataEnterer->exists(not oclIsUndefined()) then self.dataEnterer->forAll(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.dataEnterer->exists(not oclIsUndefined()) then self.dataEnterer->forAll(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll(id->exists( root='2.16.840.1.113883.4.6' )) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll(id->exists( root=\'2.16.840.1.113883.4.6\' )) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian.representedCustodianOrganization->exists(not oclIsUndefined()) then self.custodian.assignedCustodian.representedCustodianOrganization->forAll((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) then self.custodian.assignedCustodian->forAll(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) and self.custodian.assignedCustodian->exists(not oclIsUndefined()) then self.custodian.assignedCustodian->forAll(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.custodian->exists(not oclIsUndefined()) then self.custodian->forAll(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.custodian->exists(not oclIsUndefined()) then self.custodian->forAll(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsCustodianAssignedCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informationRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient.receivedOrganization->exists(not oclIsUndefined()) then self.informationRecipient.intendedRecipient.receivedOrganization->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informationRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient.receivedOrganization->exists(not oclIsUndefined()) then self.informationRecipient.intendedRecipient.receivedOrganization->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informationRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient.informationRecipient->exists(not oclIsUndefined()) then self.informationRecipient.intendedRecipient.informationRecipient->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informationRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient.informationRecipient->exists(not oclIsUndefined()) then self.informationRecipient.intendedRecipient.informationRecipient->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informationRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient->exists(not oclIsUndefined()) then self.informationRecipient.intendedRecipient->forAll(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informationRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient->exists(not oclIsUndefined()) then self.informationRecipient.intendedRecipient->forAll(informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informationRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient->exists(not oclIsUndefined()) then self.informationRecipient.intendedRecipient->forAll(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informationRecipient->exists(not oclIsUndefined()) and self.informationRecipient.intendedRecipient->exists(not oclIsUndefined()) then self.informationRecipient.intendedRecipient->forAll(receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informationRecipient->exists(not oclIsUndefined()) then self.informationRecipient->forAll(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informationRecipient->exists(not oclIsUndefined()) then self.informationRecipient->forAll(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity.assignedPerson->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity.assignedPerson->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll(id->exists( root='2.16.840.1.113883.4.6' )) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll(id->exists( root=\'2.16.840.1.113883.4.6\' )) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.101')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\')) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) and self.legalAuthenticator.assignedEntity->exists(not oclIsUndefined()) then self.legalAuthenticator.assignedEntity->forAll(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) then self.legalAuthenticator->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) then self.legalAuthenticator->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.legalAuthenticator->exists(not oclIsUndefined()) then self.legalAuthenticator->forAll((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in 
	 * value.code = 'S')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.legalAuthenticator->exists(not oclIsUndefined()) then self.legalAuthenticator->forAll((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in \nvalue.code = \'S\')) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) and self.authenticator.assignedEntity.assignedPerson->exists(not oclIsUndefined()) then self.authenticator.assignedEntity.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) and self.authenticator.assignedEntity.assignedPerson->exists(not oclIsUndefined()) then self.authenticator.assignedEntity.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll(id->exists( root='2.16.840.1.113883.4.6' )) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll(id->exists( root=\'2.16.840.1.113883.4.6\' )) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.101')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\')) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) and self.authenticator.assignedEntity->exists(not oclIsUndefined()) then self.authenticator.assignedEntity->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) then self.authenticator->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) then self.authenticator->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) then self.authenticator->forAll((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in 
	 * value.code = 'S')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) then self.authenticator->forAll((signatureCode.oclIsUndefined() or signatureCode.isNullFlavorUndefined()) implies (not signatureCode.oclIsUndefined() and signatureCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = signatureCode.oclAsType(datatypes::CS) in \nvalue.code = \'S\')) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorSignatureCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.authenticator->exists(not oclIsUndefined()) then self.authenticator->forAll(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.authenticator->exists(not oclIsUndefined()) then self.authenticator->forAll(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll(id->exists( root='2.16.840.1.113883.4.6' )) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll(id->exists( root=\'2.16.840.1.113883.4.6\' )) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian->forAll(guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian->forAll(guardianPerson->one(guardianPerson : cda::Person | not guardianPerson.oclIsUndefined() and guardianPerson.oclIsKindOf(cda::Person))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(birthTime.value.size() >= 4) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(birthTime.value.size() >= 4) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(birthTime.value.size() >= 6) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(birthTime.value.size() >= 6) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.5.1' and (value.code = 'F' or value.code = 'M' or value.code = 'UN'))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.1\' and (value.code = \'F\' or value.code = \'M\' or value.code = \'UN\'))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.birthplace->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.birthplace.place->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.birthplace.place->forAll((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.birthplace->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.birthplace.place->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.birthplace.place->forAll((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.birthplace->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.birthplace->forAll(place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.birthplace->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.birthplace->forAll(place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian.guardianPerson->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian.guardianPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.guardian.guardianPerson->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.guardian.guardianPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.languageCommunication->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.languageCommunication->forAll((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.languageCommunication->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.languageCommunication->forAll((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.languageCommunication->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.languageCommunication->forAll((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (proficiencyLevelCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = proficiencyLevelCode.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.5.61' and (value.code = 'E' or value.code = 'F' or value.code = 'G' or value.code = 'P'))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.languageCommunication->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.languageCommunication->forAll((proficiencyLevelCode.oclIsUndefined() or proficiencyLevelCode.isNullFlavorUndefined()) implies (proficiencyLevelCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = proficiencyLevelCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.61\' and (value.code = \'E\' or value.code = \'F\' or value.code = \'G\' or value.code = \'P\'))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.languageCommunication->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.languageCommunication->forAll((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (modeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = modeCode.oclAsType(datatypes::CE) in 
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.languageCommunication->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.languageCommunication->forAll((modeCode.oclIsUndefined() or modeCode.isNullFlavorUndefined()) implies (modeCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = modeCode.oclAsType(datatypes::CE) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (ethnicGroupCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.238' and not value.code.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (ethnicGroupCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.238\' and not value.code.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((maritalStatusCode.oclIsUndefined() or maritalStatusCode.isNullFlavorUndefined()) implies (maritalStatusCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = maritalStatusCode.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.5.2' and (value.code = 'A' or value.code = 'D' or value.code = 'T' or value.code = 'I' or value.code = 'L' or value.code = 'M' or value.code = 'S' or value.code = 'P' or value.code = 'W'))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((maritalStatusCode.oclIsUndefined() or maritalStatusCode.isNullFlavorUndefined()) implies (maritalStatusCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = maritalStatusCode.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.5.2\' and (value.code = \'A\' or value.code = \'D\' or value.code = \'T\' or value.code = \'I\' or value.code = \'L\' or value.code = \'M\' or value.code = \'S\' or value.code = \'P\' or value.code = \'W\'))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1)) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1)) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (raceCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in 
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (raceCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((religiousAffiliationCode.oclIsUndefined() or religiousAffiliationCode.isNullFlavorUndefined()) implies (religiousAffiliationCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = religiousAffiliationCode.oclAsType(datatypes::CE) in 
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll((religiousAffiliationCode.oclIsUndefined() or religiousAffiliationCode.isNullFlavorUndefined()) implies (religiousAffiliationCode.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = religiousAffiliationCode.oclAsType(datatypes::CE) in \nnot value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(birthplace->one(birthplace : cda::Birthplace | not birthplace.oclIsUndefined() and birthplace.oclIsKindOf(cda::Birthplace))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(languageCommunication->one(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient->forAll(languageCommunication->one(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.providerOrganization->exists(not oclIsUndefined()) then self.recordTarget.patientRole.providerOrganization->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.languageCommunication->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.languageCommunication->forAll((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in 
	 * not value.code.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient->exists(not oclIsUndefined()) and self.recordTarget.patientRole.patient.languageCommunication->exists(not oclIsUndefined()) then self.recordTarget.patientRole.patient.languageCommunication->forAll((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS) and \nlet value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in \nnot value.code.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) and self.recordTarget.patientRole->exists(not oclIsUndefined()) then self.recordTarget.patientRole->forAll(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.recordTarget->exists(not oclIsUndefined()) then self.recordTarget->forAll(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.recordTarget->exists(not oclIsUndefined()) then self.recordTarget->forAll(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.componentOf->exists(not oclIsUndefined()) and self.componentOf.encompassingEncounter->exists(not oclIsUndefined()) then self.componentOf.encompassingEncounter->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.componentOf->exists(not oclIsUndefined()) then self.componentOf->forAll(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.componentOf->exists(not oclIsUndefined()) then self.componentOf->forAll(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.relatedEntity->exists(not oclIsUndefined()) and self.informant.relatedEntity.relatedPerson->exists(not oclIsUndefined()) then self.informant.relatedEntity.relatedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.relatedEntity->exists(not oclIsUndefined()) and self.informant.relatedEntity.relatedPerson->exists(not oclIsUndefined()) then self.informant.relatedEntity.relatedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = code.oclAsType(datatypes::CE) in 
	 * value.codeSystem = '2.16.840.1.113883.6.101')) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (code.oclIsKindOf(datatypes::CE) and \nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \nvalue.codeSystem = \'2.16.840.1.113883.6.101\')) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) then self.informant->forAll(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined()) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) then self.informant->forAll(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined()) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) then self.participant->forAll(associatedEntity.associatedPerson.oclIsUndefined() xor associatedEntity.scopingOrganization.oclIsUndefined()) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) then self.participant->forAll(associatedEntity.associatedPerson.oclIsUndefined() xor associatedEntity.scopingOrganization.oclIsUndefined()) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.relatedEntity->exists(not oclIsUndefined()) then self.informant.relatedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.relatedEntity->exists(not oclIsUndefined()) then self.informant.relatedEntity->forAll((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantRelatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.relatedEntity->exists(not oclIsUndefined()) then self.informant.relatedEntity->forAll(relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.relatedEntity->exists(not oclIsUndefined()) then self.informant.relatedEntity->forAll(relatedPerson->one(relatedPerson : cda::Person | not relatedPerson.oclIsUndefined() and relatedPerson.oclIsKindOf(cda::Person))) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantRelatedEntityPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) and self.informant.assignedEntity.assignedPerson->exists(not oclIsUndefined()) then self.informant.assignedEntity.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) and self.informant.assignedEntity.assignedPerson->exists(not oclIsUndefined()) then self.informant.assignedEntity.assignedPerson->forAll((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll(id->exists( root='2.16.840.1.113883.4.6' )) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.informant->exists(not oclIsUndefined()) and self.informant.assignedEntity->exists(not oclIsUndefined()) then self.informant.assignedEntity->forAll(id->exists( root=\'2.16.840.1.113883.4.6\' )) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.participant->exists(not oclIsUndefined()) then self.participant->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.participant->exists(not oclIsUndefined()) then self.participant->forAll((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsParticipantSupportTime(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.inFulfillmentOf->exists(not oclIsUndefined()) and self.inFulfillmentOf.order->exists(not oclIsUndefined()) then self.inFulfillmentOf.order->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.inFulfillmentOf->exists(not oclIsUndefined()) and self.inFulfillmentOf.order->exists(not oclIsUndefined()) then self.inFulfillmentOf.order->forAll((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty())) else true endif'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if self.inFulfillmentOf->exists(not oclIsUndefined()) then self.inFulfillmentOf->forAll(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order))) else true endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='if self.inFulfillmentOf->exists(not oclIsUndefined()) then self.inFulfillmentOf->forAll(order->one(order : cda::Order | not order.oclIsUndefined() and order.oclIsKindOf(cda::Order))) else true endif'"
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
