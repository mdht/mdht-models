/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>US Realm Header2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient Guardian General Header Constraints Record Target Patient Role Patient Guardian TEL Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient Guardian Code From Personal Relationship Or Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Language Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Race Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target General Header Constraints Record Target Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Data Enterer General Header Constraints Data Enterer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Data Enterer General Header Constraints Data Enterer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Data Enterer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Author Assigned Author If Assigned Person Then Contains Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Author Assigned Author Code Terminology</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformationRecipientIntendedRecipientId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Information Recipient Intended Recipient Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Legal Authenticator SDTC Signature Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2AuthenticatorSDTCSignatureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Authenticator SDTC Signature Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Has Assigned Entity Or Related Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event Performer1 General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event Performer1 General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of General Header Constraints Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsDataEnterer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsLegalAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsAuthenticator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsInFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsSupportParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2#validateGeneralHeaderConstraintsAuthorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class USRealmHeader2Operations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected USRealmHeader2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient Guardian General Header Constraints Record Target Patient Role Patient Guardian TEL Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null).telecom->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient Guardian General Header Constraints Record Target Patient Role Patient Guardian TEL Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient Guardian Code From Personal Relationship Or Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject(true)";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient Guardian Code From Personal Relationship Or Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.111' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).guardian->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Guardian Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Language Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Language Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((languageCode.oclIsUndefined() or languageCode.isNullFlavorUndefined()) implies (not languageCode.oclIsUndefined() and languageCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = languageCode.oclAsType(datatypes::CS) in "
			+ "not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).languageCommunication->excluding(null)->reject((preferenceInd.oclIsUndefined() or preferenceInd.isNullFlavorUndefined()) implies (not preferenceInd.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient General Header Constraints Record Target Patient Role Patient Language Communication Preference Ind</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Year</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() >= 4)";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Year</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() >= 8)";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Minute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null).birthTime->excluding(null)->select(isNullFlavorUndefined())->reject(not value.oclIsUndefined() and value.size() >= 10)";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role Patient TS Birth Time Precise To Minute</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_MINUTE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Race Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (not raceCode.oclIsUndefined() and raceCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = raceCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '1002-5' or value.code = '2028-9' or value.code = '2054-5' or value.code = '2076-8' or value.code = '2106-3')))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Race Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Race Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((raceCode.oclIsUndefined() or raceCode.isNullFlavorUndefined()) implies (not raceCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Race Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined() and ethnicGroupCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = ethnicGroupCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.238' and (value.code = '2135-2' or value.code = '2186-5')))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Ethnic Group Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((ethnicGroupCode.oclIsUndefined() or ethnicGroupCode.isNullFlavorUndefined()) implies (not ethnicGroupCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Ethnic Group Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Guardian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(guardian->exists(guardian : cda::Guardian | not guardian.oclIsUndefined() and guardian.oclIsKindOf(cda::Guardian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Guardian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Language Communication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).patient->excluding(null)->reject(languageCommunication->exists(languageCommunication : cda::LanguageCommunication | not languageCommunication.oclIsUndefined() and languageCommunication.oclIsKindOf(cda::LanguageCommunication)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target Patient Role General Header Constraints Record Target Patient Role Patient Language Communication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target General Header Constraints Record Target Patient Role Patient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_RECORD_TARGET_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject(patient->one(patient : cda::Patient | not patient.oclIsUndefined() and patient.oclIsKindOf(cda::Patient)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Record Target General Header Constraints Record Target Patient Role Patient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_RECORD_TARGET_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_RECORD_TARGET_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_RECORD_TARGET_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_RECORD_TARGET_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_RECORD_TARGET_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_RECORD_TARGET_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Data Enterer General Header Constraints Data Enterer Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Data Enterer General Header Constraints Data Enterer Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Data Enterer General Header Constraints Data Enterer Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Data Enterer General Header Constraints Data Enterer Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDataEntererAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Data Enterer Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Data Enterer Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Author Assigned Author If Assigned Person Then Contains Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_IF_ASSIGNED_PERSON_THEN_CONTAINS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(not assignedPerson.oclIsUndefined() and (code.oclIsUndefined() or code.isNullFlavorUndefined()) implies not code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Author Assigned Author If Assigned Person Then Contains Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_IF_ASSIGNED_PERSON_THEN_CONTAINS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_IF_ASSIGNED_PERSON_THEN_CONTAINS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_IF_ASSIGNED_PERSON_THEN_CONTAINS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_IF_ASSIGNED_PERSON_THEN_CONTAINS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_IF_ASSIGNED_PERSON_THEN_CONTAINS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_IF_ASSIGNED_PERSON_THEN_CONTAINS_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Author Assigned Author Code Terminology</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_CODE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(not assignedPerson.oclIsUndefined() and (code.oclIsUndefined() or code.isNullFlavorUndefined()) implies not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and let value : datatypes::CE = code.oclAsType(datatypes::CE) in value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Author Assigned Author Code Terminology</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_CODE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_CODE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_CODE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_CODE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_CODE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_CODE_TERMINOLOGY,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2AuthorAssignedAuthorCodeTerminology"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Author Assigned Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Author Assigned Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformationRecipientIntendedRecipientId(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Information Recipient Intended Recipient Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformationRecipientIntendedRecipientId(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null).intendedRecipient->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformationRecipientIntendedRecipientId(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Information Recipient Intended Recipient Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformationRecipientIntendedRecipientId(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformationRecipientIntendedRecipientId(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformationRecipientIntendedRecipientId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Information Recipient Intended Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(cda::IntendedRecipient)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Information Recipient Intended Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Legal Authenticator SDTC Signature Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_LEGAL_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->excluding(null)->reject((sDTCSignatureText.oclIsUndefined() or sDTCSignatureText.isNullFlavorUndefined()) implies (not sDTCSignatureText.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Legal Authenticator SDTC Signature Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_LEGAL_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_LEGAL_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_LEGAL_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_LEGAL_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_LEGAL_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_LEGAL_AUTHENTICATOR_SDTC_SIGNATURE_TEXT,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2LegalAuthenticatorSDTCSignatureText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2AuthenticatorSDTCSignatureText(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Authenticator SDTC Signature Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2AuthenticatorSDTCSignatureText(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->excluding(null)->reject((sDTCSignatureText.oclIsUndefined() or sDTCSignatureText.isNullFlavorUndefined()) implies (not sDTCSignatureText.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2AuthenticatorSDTCSignatureText(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Authenticator SDTC Signature Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2AuthenticatorSDTCSignatureText(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2AuthenticatorSDTCSignatureText(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_AUTHENTICATOR_SDTC_SIGNATURE_TEXT,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2AuthenticatorSDTCSignatureText"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ( streetAddressLine->size() >=1 and streetAddressLine->size() <=4))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Use P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not use->isEmpty() )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Use P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Use</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (use->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(vocab::PostalAddressUse) and "
			+ "let value : vocab::PostalAddressUse = element.oclAsType(vocab::PostalAddressUse) in "
			+ "value = vocab::PostalAddressUse::BAD or value = vocab::PostalAddressUse::DIR or value = vocab::PostalAddressUse::H or value = vocab::PostalAddressUse::HP or value = vocab::PostalAddressUse::HV or value = vocab::PostalAddressUse::PHYS or value = vocab::PostalAddressUse::PST or value = vocab::PostalAddressUse::PUB or value = vocab::PostalAddressUse::TMP or value = vocab::PostalAddressUse::WP) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Use</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsUSRealmAddressUseP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Country</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((country->isEmpty() or country->exists(element | element.isNullFlavorUndefined())) implies (not country->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((state->isEmpty() or state->exists(element | element.isNullFlavorUndefined())) implies (not state->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address State</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address City</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((city->isEmpty() or city->exists(element | element.isNullFlavorUndefined())) implies (city->size() = 1) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address City</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Postal Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((postalCode->isEmpty() or postalCode->exists(element | element.isNullFlavorUndefined())) implies (not postalCode->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Postal Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null).addr->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((streetAddressLine->isEmpty() or streetAddressLine->exists(element | element.isNullFlavorUndefined())) implies (not streetAddressLine->isEmpty()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsInformantAssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null).assignedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant General Header Constraints Informant Assigned Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Has Assigned Entity Or Related Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->excluding(null)->reject(assignedEntity.oclIsUndefined() xor relatedEntity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Informant Has Assigned Entity Or Related Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2InformantHasAssignedEntityOrRelatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject((not associatedEntity.associatedPerson.oclIsUndefined()) or (not associatedEntity.scopingOrganization.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Participant Support Associated Entity Has Associated Person Or Scoping Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event Performer1 General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event Performer1 General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event Performer1 General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null).assignedEntity->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event Performer1 General Header Constraints Documentation Of Service Event Performer1 Assigned Entity Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.88' and (value.code = 'ADMPHYS' or value.code = 'ANEST' or value.code = 'ANRS' or value.code = 'ATTPHYS' or value.code = 'DISPHYS' or value.code = 'FASST' or value.code = 'MDWF' or value.code = 'NASST' or value.code = 'PCP' or value.code = 'PRISURG' or value.code = 'RNDPHYS' or value.code = 'SASST' or value.code = 'SNRS' or value.code = 'TASST')))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of Service Event General Header Constraints Documentation Of Service Event Performer1 Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of General Header Constraints Documentation Of Service Event Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Documentation Of General Header Constraints Documentation Of Service Event Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_DOCUMENTATION_OF_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 General Header Constraints Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent(
			USRealmHeader2 usRealmHeader2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(usRealmHeader2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER2__US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT,
						ConsolPlugin.INSTANCE.getString("USRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.1' and id.extension = '2014-06-09')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTemplateId"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTitle(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_TITLE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsTitle"), new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRealmCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = element.oclAsType(datatypes::CS) in " + "value.code = 'US'))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRealmCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRealmCode(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTitle(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTitle(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTitle(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsRealmCode(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_REALM_CODE,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRealmCode"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsRecordTarget(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTarget(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->exists(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsRecordTarget(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsRecordTarget(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsRecordTarget(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsRecordTarget"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDataEnterer(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEnterer(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.dataEnterer->one(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDataEnterer(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Data Enterer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDataEnterer(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsDataEnterer(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDataEnterer"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthor(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthor(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthor(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthor(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsAuthor(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_AUTHOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthor"), new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCustodian(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodian(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCustodian(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCustodian(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsCustodian(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_CUSTODIAN,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsCustodian"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformationRecipient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformationRecipient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformationRecipient(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsInformationRecipient(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformationRecipient"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticator(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticator(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.legalAuthenticator->one(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsLegalAuthenticator(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsLegalAuthenticator(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsLegalAuthenticator(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsLegalAuthenticator"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthenticator(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticator(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authenticator->exists(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthenticator(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthenticator(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsAuthenticator(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthenticator"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInformant(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformant(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informant->exists(informant : cda::Informant12 | not informant.oclIsUndefined() and informant.oclIsKindOf(cda::Informant12))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInformant(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Informant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInformant(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsInformant(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_INFORMANT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInformant"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInFulfillmentOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(cda::InFulfillmentOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsInFulfillmentOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsInFulfillmentOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsInFulfillmentOf(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsInFulfillmentOf"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsComponentOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsComponentOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsComponentOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsComponentOf(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsComponentOf"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsSupportParticipant(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSupportParticipant(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsSupportParticipant(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Support Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsSupportParticipant(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsSupportParticipant(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsSupportParticipant"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsDocumentationOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsDocumentationOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsDocumentationOf(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsDocumentationOf(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsDocumentationOf"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsAuthorization(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorization(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.authorization->exists(authorization : cda::Authorization | not authorization.oclIsUndefined() and authorization.oclIsKindOf(cda::Authorization))";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsAuthorization(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authorization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsAuthorization(USRealmHeader2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeader2 The receiving '<em><b>US Realm Header2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsAuthorization(USRealmHeader2 usRealmHeader2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			usRealmHeader2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.US_REALM_HEADER2__GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION,
					ConsolPlugin.INSTANCE.getString("GeneralHeaderConstraintsAuthorization"),
					new Object[] { usRealmHeader2 }));
			}

			return false;
		}
		return true;
	}

} // USRealmHeader2Operations
