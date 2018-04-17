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
 * A representation of the model object '<em><b>US Realm Header2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getUSRealmHeader2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId USRealmHeader2DocCodesOnly GeneralHeaderConstraintsRealmCode GeneralHeaderConstraintsTitle GeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsAuthor GeneralHeaderConstraintsCustodian GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDataEntererAssignedEntityCode GeneralHeaderConstraintsDataEntererAssignedEntity GeneralHeaderConstraintsAuthorAssignedAuthorCodeP GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsAuthorAssignedAuthor GeneralHeaderConstraintsInformationRecipientIntendedRecipient USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityAddr GeneralHeaderConstraintsInformantRelatedEntityAddr GeneralHeaderConstraintsInformantRelatedEntityPerson GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity USRealmHeader2GeneralHeaderConstraintsInformantAssignedEntity USRealmHeader2GeneralHeaderConstraintsInformantRelatedEntity GeneralHeaderConstraintsComponentOfEncompassingEncounter GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEvent' templateId.root='2.16.840.1.113883.10.20.22.1.1' templateId.extension='2015-08-01' constraints.validation.info='GeneralHeaderConstraintsDataEnterer GeneralHeaderConstraintsInformationRecipient GeneralHeaderConstraintsAuthenticator GeneralHeaderConstraintsInformant GeneralHeaderConstraintsInFulfillmentOf GeneralHeaderConstraintsComponentOf GeneralHeaderConstraintsSupportParticipant GeneralHeaderConstraintsDocumentationOf GeneralHeaderConstraintsAuthorization GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace GeneralHeaderConstraintsDataEntererAssignedEntityCodeP USRealmHeader2InformationRecipientIntendedRecipientId USRealmHeader2LegalAuthenticatorSDTCSignatureText USRealmHeader2AuthenticatorSDTCSignatureText GeneralHeaderConstraintsInformantAssignedEntityCodeP GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP' constraints.validation.warning='GeneralHeaderConstraintsLegalAuthenticator GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCodeP USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDataEntererAssignedEntityCodeP GeneralHeaderConstraintsDataEntererAssignedEntityCode GeneralHeaderConstraintsDataEntererAssignedEntity USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology GeneralHeaderConstraintsAuthorAssignedAuthorCodeP GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsAuthorAssignedAuthor USRealmHeader2InformationRecipientIntendedRecipientId GeneralHeaderConstraintsInformationRecipientIntendedRecipient USRealmHeader2LegalAuthenticatorSDTCSignatureText USRealmHeader2AuthenticatorSDTCSignatureText USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine GeneralHeaderConstraintsInformantAssignedEntityCodeP GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityAddr GeneralHeaderConstraintsInformantRelatedEntityAddr GeneralHeaderConstraintsInformantRelatedEntityPerson GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity USRealmHeader2GeneralHeaderConstraintsInformantAssignedEntity USRealmHeader2GeneralHeaderConstraintsInformantRelatedEntity GeneralHeaderConstraintsComponentOfEncompassingEncounter GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.dependOn.USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCode='USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDataEntererAssignedEntityCode='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsAuthorAssignedAuthorCode='GeneralHeaderConstraintsAuthorAssignedAuthorCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsInformantAssignedEntityCode='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTarget constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRole constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatient raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' sDTCEthnicGroupCode.codeSystem='2.16.840.1.113883.6.238' sDTCEthnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.info='USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace PatientUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute' constraints.validation.dependOn.USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCode='USRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCodeP' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay PatientUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientGuardian constraints.validation.info='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientTS constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay' constraints.validation.info='USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientBirthplace constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientBirthplacePlace constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceHasState'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DataEnterer constraints.validation.error='GeneralHeaderConstraintsDataEntererAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DataEntererAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='GeneralHeaderConstraintsDataEntererAssignedEntityCode' constraints.validation.info='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDataEntererAssignedEntityCode='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Author constraints.validation.error='GeneralHeaderConstraintsAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2AuthorAssignedAuthor constraints.validation.warning='USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology' constraints.validation.error='GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsAuthorAssignedAuthorCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsAuthorAssignedAuthorCode='GeneralHeaderConstraintsAuthorAssignedAuthorCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformationRecipient constraints.validation.error='GeneralHeaderConstraintsInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformationRecipientIntendedRecipient constraints.validation.info='USRealmHeader2InformationRecipientIntendedRecipientId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2LegalAuthenticator constraints.validation.info='USRealmHeader2LegalAuthenticatorSDTCSignatureText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Authenticator constraints.validation.info='USRealmHeader2AuthenticatorSDTCSignatureText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Informant constraints.validation.error='GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity GeneralHeaderConstraintsInformantAssignedEntity GeneralHeaderConstraintsInformantRelatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformantAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityAddr AssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssignedEntityGeneralHeaderConstraintsUSRealmAddressUse AssignedEntityGeneralHeaderConstraintsUSRealmAddressCity AssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.info='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsInformantAssignedEntityCode='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.query='AssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet AssignedEntityGeneralHeaderConstraintsUSRealmAddressUse AssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP AssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry AssignedEntityGeneralHeaderConstraintsUSRealmAddressState AssignedEntityGeneralHeaderConstraintsUSRealmAddressCity AssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode AssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='AssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP AssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry AssignedEntityGeneralHeaderConstraintsUSRealmAddressState AssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformantRelatedEntity constraints.validation.error='GeneralHeaderConstraintsInformantRelatedEntityAddr GeneralHeaderConstraintsInformantRelatedEntityPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2ComponentOf constraints.validation.error='GeneralHeaderConstraintsComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2ParticipantSupport constraints.validation.error='GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DocumentationOf constraints.validation.error='GeneralHeaderConstraintsDocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DocumentationOfServiceEvent constraints.validation.warning='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DocumentationOfServiceEventPerformer1 functionCode.codeSystem='2.16.840.1.113883.5.88' functionCode.codeSystemName='ParticipationFunction' constraints.validation.warning='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode' constraints.validation.info='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP' constraints.validation.error='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DocumentationOfServiceEventPerformer1AssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP'"
 * @generated
 */
public interface USRealmHeader2 extends GeneralHeaderConstraints {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='code.codeSystem = \'2.16.840.1.113883.6.1\''"
	 * @generated
	 */
	boolean validateUSRealmHeader2DocCodesOnly(DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() >= 10)'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((sDTCEthnicGroupCode->isEmpty() or sDTCEthnicGroupCode->exists(element | element.isNullFlavorUndefined())) implies (not sDTCEthnicGroupCode->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((sDTCEthnicGroupCode->isEmpty() or sDTCEthnicGroupCode->exists(element | element.isNullFlavorUndefined())) implies (sDTCEthnicGroupCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = element.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.238\' and not value.code.oclIsUndefined())))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientSDTCEthnicGroupCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(not assignedPerson.oclIsUndefined() and (code.oclIsUndefined() or code.isNullFlavorUndefined()) implies not code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(not assignedPerson.oclIsUndefined() and (code.oclIsUndefined() or code.isNullFlavorUndefined()) implies not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateUSRealmHeader2InformationRecipientIntendedRecipientId(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.legalAuthenticator->excluding(null)->reject((sDTCSignatureText.oclIsUndefined() or sDTCSignatureText.isNullFlavorUndefined()) implies (not sDTCSignatureText.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
	boolean validateUSRealmHeader2AuthenticatorSDTCSignatureText(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (( not use->isEmpty())  )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (( not country->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (( not state->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() =  1) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (( not postalCode->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (( not streetAddressLine->isEmpty()) ) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateUSRealmHeader2GeneralHeaderConstraintsInformantAssignedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateUSRealmHeader2GeneralHeaderConstraintsInformantRelatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USRealmHeader2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USRealmHeader2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // USRealmHeader2
