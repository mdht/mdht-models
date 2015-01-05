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
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='GeneralHeaderConstraintsTemplateId GeneralHeaderConstraintsRealmCode GeneralHeaderConstraintsTitle GeneralHeaderConstraintsRecordTarget GeneralHeaderConstraintsAuthor GeneralHeaderConstraintsCustodian USRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication USRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient USRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole USRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode USRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity USRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor USRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine USRealmHeader2InformantHasAssignedEntityOrRelatedEntity USRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter USRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity USRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent' templateId.root='2.16.840.1.113883.10.20.22.1.1' templateId.extension='2014-06-09' realmCode.code='US' constraints.validation.info='GeneralHeaderConstraintsDataEnterer GeneralHeaderConstraintsInformationRecipient GeneralHeaderConstraintsAuthenticator GeneralHeaderConstraintsInformant GeneralHeaderConstraintsInFulfillmentOf GeneralHeaderConstraintsComponentOf GeneralHeaderConstraintsSupportParticipant GeneralHeaderConstraintsDocumentationOf GeneralHeaderConstraintsAuthorization USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian USRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP USRealmHeader2InformationRecipientIntendedRecipientId USRealmHeader2LegalAuthenticatorSDTCSignatureText USRealmHeader2AuthenticatorSDTCSignatureText USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP' constraints.validation.warning='GeneralHeaderConstraintsLegalAuthenticator USRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode USRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP USRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode USRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer' constraints.validation.query='USRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse USRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication USRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient USRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole USRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP USRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode USRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology USRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor USRealmHeader2InformationRecipientIntendedRecipientId USRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient USRealmHeader2LegalAuthenticatorSDTCSignatureText USRealmHeader2AuthenticatorSDTCSignatureText USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine USRealmHeader2InformantHasAssignedEntityOrRelatedEntity USRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter USRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization USRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP USRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity USRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer USRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent' constraints.validation.dependOn.USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.dependOn.USRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP' constraints.validation.dependOn.USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.dependOn.USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP' constraints.validation.dependOn.USRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP' constraints.validation.dependOn.USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode='GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTarget constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRole'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRole constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatient raceCode.codeSystem='2.16.840.1.113883.6.238' raceCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode GeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode GeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear' ethnicGroupCode.codeSystem='2.16.840.1.113883.6.238' ethnicGroupCode.codeSystemName='Race and Ethnicity - CDC' constraints.validation.info='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute' constraints.validation.query='USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute' constraints.validation.warning='USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientGuardian code.codeSystem='2.16.840.1.113883.5.111' code.codeSystemName='RoleCode' constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom USRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse' constraints.validation.dependOn.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode='GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP' constraints.validation.query='USRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientLanguageCommunication constraints.validation.error='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode' constraints.validation.warning='GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2RecordTargetPatientRolePatientTS constraints.validation.error='USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear' constraints.validation.warning='USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay' constraints.validation.info='USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DataEnterer constraints.validation.error='GeneralHeaderConstraintsDataEntererAssignedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2DataEntererAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='GeneralHeaderConstraintsDataEntererAssignedEntityCode' constraints.validation.info='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsDataEntererAssignedEntityCode='GeneralHeaderConstraintsDataEntererAssignedEntityCodeP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Author constraints.validation.error='GeneralHeaderConstraintsAuthorAssignedAuthor'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2AuthorAssignedAuthor constraints.validation.warning='USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode USRealmHeader2AuthorAssignedAuthorCodeTerminology'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformationRecipient constraints.validation.error='GeneralHeaderConstraintsInformationRecipientIntendedRecipient'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformationRecipientIntendedRecipient constraints.validation.info='USRealmHeader2InformationRecipientIntendedRecipientId'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2LegalAuthenticator constraints.validation.info='USRealmHeader2LegalAuthenticatorSDTCSignatureText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Authenticator constraints.validation.info='USRealmHeader2AuthenticatorSDTCSignatureText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2Informant constraints.validation.error='USRealmHeader2InformantHasAssignedEntityOrRelatedEntity'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformantAssignedEntity code.codeSystem='2.16.840.1.113883.6.101' code.codeSystemName='NUCC Health Care Provider Taxonomy' constraints.validation.error='GeneralHeaderConstraintsInformantAssignedEntityCode GeneralHeaderConstraintsInformantAssignedEntityAddr USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.info='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.dependOn.GeneralHeaderConstraintsInformantAssignedEntityCode='GeneralHeaderConstraintsInformantAssignedEntityCodeP' constraints.validation.query='USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.dependOn.USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2InformantRelatedEntity constraints.validation.error='USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.query='USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine' constraints.validation.warning='USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode' constraints.validation.dependOn.USRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse='GeneralHeaderConstraintsUSRealmAddressUseP'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2ComponentOf constraints.validation.error='GeneralHeaderConstraintsComponentOfEncompassingEncounter'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolUSRealmHeader2ParticipantSupport constraints.validation.error='USRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject(true)'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(
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
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = code.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.5.111\' and not value.code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
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
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() >= 4)'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() >= 8)'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay(DiagnosticChain diagnostics,
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (not raceCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (not raceCode.oclIsUndefined() and raceCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.238\' and (value.code = \'1002-5\' or value.code = \'2028-9\' or value.code = \'2054-5\' or value.code = \'2076-8\' or value.code = \'2106-3\')))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined() and ethnicGroupCode.oclIsKindOf(datatypes::CE) and \r\nlet value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in \r\nvalue.codeSystem = \'2.16.840.1.113883.6.238\' and (value.code = \'2135-2\' or value.code = \'2186-5\')))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
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
	boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
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
	boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient(
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
	boolean validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole(DiagnosticChain diagnostics,
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
	boolean validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity(DiagnosticChain diagnostics,
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor(DiagnosticChain diagnostics,
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()) )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()) )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1) )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()) )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()) )))'"
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
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP(
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
	boolean validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and \r\nlet value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in \r\nvalue = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressState(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null).relatedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()) )))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantRelatedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.informant->excluding(null)->reject(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity(DiagnosticChain diagnostics,
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
	boolean validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participant->excluding(null)->reject((not associatedEntity.associatedPerson.oclIsUndefined()) or (not associatedEntity.scopingOrganization.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
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
	boolean validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
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
	boolean validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
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
	boolean validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
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
	boolean validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context);

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
	boolean validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
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
	boolean validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context);

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
