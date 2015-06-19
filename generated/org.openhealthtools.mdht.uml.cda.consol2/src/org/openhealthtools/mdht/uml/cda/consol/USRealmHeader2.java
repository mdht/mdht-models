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
 * A representation of the model object '<em><b>US Realm Header2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getUSRealmHeader2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId GeneralHeaderConstraintsRealmCode GeneralHeaderConstraintsRealmCodeP GeneralHeaderConstraintsTitle GeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsAuthor GeneralHeaderConstraintsCustodian GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDataEntererAssignedEntityCode GeneralHeaderConstraintsDataEntererAssignedEntityCodeVS GeneralHeaderConstraintsDataEntererAssignedEntity GeneralHeaderConstraintsAuthorAssignedAuthorCodeP GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsAuthorAssignedAuthor GeneralHeaderConstraintsInformationRecipientIntendedRecipient USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressStreetAddressLine GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityCodeVS GeneralHeaderConstraintsInformantAssignedEntityAddr GeneralHeaderConstraintsInformantRelatedEntityAddr GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity GeneralHeaderConstraintsComponentOfEncompassingEncounter GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEvent' templateId.root='2.16.840.1.113883.10.20.22.1.1' templateId.extension='2014-06-09' realmCode.code='US' constraints.validation.dependOn.GeneralHeaderConstraintsRealmCode='GeneralHeaderConstraintsRealmCodeP' constraints.validation.info='GeneralHeaderConstraintsDataEnterer GeneralHeaderConstraintsInformationRecipient GeneralHeaderConstraintsAuthenticator GeneralHeaderConstraintsInformant GeneralHeaderConstraintsInFulfillmentOf GeneralHeaderConstraintsComponentOf GeneralHeaderConstraintsSupportParticipant GeneralHeaderConstraintsDocumentationOf GeneralHeaderConstraintsAuthorization GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian GeneralHeaderConstraintsDataEntererAssignedEntityCodeP USRealmHeader2InformationRecipientIntendedRecipientId USRealmHeader2LegalAuthenticatorSDTCSignatureText USRealmHeader2AuthenticatorSDTCSignatureText GeneralHeaderConstraintsInformantAssignedEntityCodeP GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP' constraints.validation.warning='GeneralHeaderConstraintsLegalAuthenticator GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressPostalCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeVS GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeVS GeneralHeaderConstraintsDocumentationOfServiceEventPerformer' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatient GeneralHeaderConstraintsRecordTargetPatientRole GeneralHeaderConstraintsDataEntererAssignedEntityCodeP GeneralHeaderConstraintsDataEntererAssignedEntityCode GeneralHeaderConstraintsDataEntererAssignedEntityCodeVS GeneralHeaderConstraintsDataEntererAssignedEntity USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology GeneralHeaderConstraintsAuthorAssignedAuthorCodeP GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsAuthorAssignedAuthor USRealmHeader2InformationRecipientIntendedRecipientId GeneralHeaderConstraintsInformationRecipientIntendedRecipient USRealmHeader2LegalAuthenticatorSDTCSignatureText USRealmHeader2AuthenticatorSDTCSignatureText USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressPostalCode GeneralHeaderConstraintsUSRealmAddressStreetAddressLine GeneralHeaderConstraintsInformantAssignedEntityCodeP GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityCodeVS GeneralHeaderConstraintsInformantAssignedEntityAddr GeneralHeaderConstraintsInformantRelatedEntityAddr GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity GeneralHeaderConstraintsComponentOfEncompassingEncounter GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeVS GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeVS GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity GeneralHeaderConstraintsDocumentationOfServiceEventPerformer GeneralHeaderConstraintsDocumentationOfServiceEvent' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDataEntererAssignedEntityCode='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDataEntererAssignedEntityCodeVS='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsAuthorAssignedAuthorCode='GeneralHeaderConstraintsAuthorAssignedAuthorCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP' constraints.validation.dependOn.GeneralHeaderConstraintsInformantAssignedEntityCode='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsInformantAssignedEntityCodeVS='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeVS='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeVS='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTarget constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRole constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatient raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.info='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian PatientUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay PatientUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientGuardian constraints.validation.info='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty' code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.query='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientTS constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToYear GeneralHeaderConstraintsRecordTargetPatientRolePatientTSValue' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientTSBirthTimePreciseToDay' constraints.validation.info='USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DataEnterer constraints.validation.error='GeneralHeaderConstraintsDataEntererAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DataEntererAssignedEntity constraints.validation.error='GeneralHeaderConstraintsDataEntererAssignedEntityCode GeneralHeaderConstraintsDataEntererAssignedEntityCodeVS' code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.info='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDataEntererAssignedEntityCode='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDataEntererAssignedEntityCodeVS='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Author constraints.validation.error='GeneralHeaderConstraintsAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2AuthorAssignedAuthor constraints.validation.warning='USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology' constraints.validation.error='GeneralHeaderConstraintsAuthorAssignedAuthorCode GeneralHeaderConstraintsAuthorAssignedAuthorCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsAuthorAssignedAuthorCode='GeneralHeaderConstraintsAuthorAssignedAuthorCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformationRecipient constraints.validation.error='GeneralHeaderConstraintsInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformationRecipientIntendedRecipient constraints.validation.info='USRealmHeader2InformationRecipientIntendedRecipientId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2LegalAuthenticator constraints.validation.info='USRealmHeader2LegalAuthenticatorSDTCSignatureText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Authenticator constraints.validation.info='USRealmHeader2AuthenticatorSDTCSignatureText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Informant constraints.validation.error='GeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformantAssignedEntity constraints.validation.error='GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityCodeVS GeneralHeaderConstraintsInformantAssignedEntityAddr AssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressStreetAddressLine' code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.info='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsInformantAssignedEntityCode='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsInformantAssignedEntityCodeVS='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.query='AssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressUse GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressCity GeneralHeaderConstraintsUSRealmAddressPostalCode GeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='GeneralHeaderConstraintsUSRealmAddressUseP GeneralHeaderConstraintsUSRealmAddressCountry GeneralHeaderConstraintsUSRealmAddressState GeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.dependOn.GeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformantRelatedEntity constraints.validation.error='GeneralHeaderConstraintsInformantRelatedEntityAddr'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2ComponentOf constraints.validation.error='GeneralHeaderConstraintsComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2ParticipantSupport constraints.validation.error='GeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DocumentationOf constraints.validation.error='GeneralHeaderConstraintsDocumentationOfServiceEvent'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DocumentationOfServiceEvent constraints.validation.warning='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DocumentationOfServiceEventPerformer1 constraints.validation.error='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity' functionCode.codeSystem='2.16.840.1.113883.5.88' functionCode.codeSystemName='ParticipationFunction' constraints.validation.warning='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeVS' constraints.validation.info='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeVS='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DocumentationOfServiceEventPerformer1AssignedEntity constraints.validation.error='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode' code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.warning='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeVS GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeVS='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeVS(DiagnosticChain diagnostics,
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsInformantAssignedEntityCodeVS(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.101\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeVS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.88\' and (value.code = \'ADMPHYS\' or value.code = \'ANEST\' or value.code = \'ANRS\' or value.code = \'ATTPHYS\' or value.code = \'DISPHYS\' or value.code = \'FASST\' or value.code = \'MDWF\' or value.code = \'NASST\' or value.code = \'PCP\' or value.code = \'PRISURG\' or value.code = \'RNDPHYS\' or value.code = \'SASST\' or value.code = \'SNRS\' or value.code = \'TASST\')))'"
	 * @generated
	 */
	boolean validateGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeVS(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeader2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public USRealmHeader2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // USRealmHeader2
