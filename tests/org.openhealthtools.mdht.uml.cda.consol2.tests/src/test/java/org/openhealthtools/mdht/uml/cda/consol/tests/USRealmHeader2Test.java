/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Patient;
import org.openhealthtools.mdht.uml.cda.PatientRole;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.RelatedEntity;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.USRealmHeader2;
import org.openhealthtools.mdht.uml.cda.consol.operations.USRealmHeader2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.ADXP;
import org.openhealthtools.mdht.uml.hl7.datatypes.BL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;

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

public class USRealmHeader2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUseTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TEL_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				pat.getGuardians().add(guardian);
				guardian.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (RecordTarget rt : target.getRecordTargets()) {
					for (Guardian g : rt.getPatientRole().getPatient().getGuardians()) {
						for (TEL t : g.getTelecoms()) {
							t.getUses().add(TelecommunicationAddressUse.AS);
						}
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUse(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientGuardianGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTELUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsiblePartyTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_FROM_PERSONAL_RELATIONSHIP_OR_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {

			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsibleParty(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientGuardianCodeFromPersonalRelationshipOrResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				Guardian guard = CDAFactory.eINSTANCE.createGuardian();
				pat.getGuardians().add(guard);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				CE code = DatatypesFactory.eINSTANCE.createCE();
				for (RecordTarget rt : target.getRecordTargets()) {
					for (Guardian guard : rt.getPatientRole().getPatient().getGuardians()) {
						guard.setCode(code);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				Guardian guard = CDAFactory.eINSTANCE.createGuardian();
				pat.getGuardians().add(guard);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				CE code = DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.5.111");
				for (RecordTarget rt : target.getRecordTargets()) {
					for (Guardian guard : rt.getPatientRole().getPatient().getGuardians()) {
						guard.setCode(code);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecomTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				Guardian guardian = CDAFactory.eINSTANCE.createGuardian();
				pat.getGuardians().add(guardian);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (RecordTarget rt : target.getRecordTargets()) {
					for (Guardian g : rt.getPatientRole().getPatient().getGuardians()) {
						g.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				LanguageCommunication lcom = CDAFactory.eINSTANCE.createLanguageCommunication();
				pat.getLanguageCommunications().add(lcom);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				CS lanCode = DatatypesFactory.eINSTANCE.createCS();
				for (RecordTarget rt : target.getRecordTargets()) {
					for (LanguageCommunication lcom : rt.getPatientRole().getPatient().getLanguageCommunications()) {
						lcom.setLanguageCode(lanCode);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				LanguageCommunication lcom = CDAFactory.eINSTANCE.createLanguageCommunication();
				pat.getLanguageCommunications().add(lcom);
				lcom.setLanguageCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				CS lanCode = DatatypesFactory.eINSTANCE.createCS("mustExistOnly");
				for (RecordTarget rt : target.getRecordTargets()) {
					for (LanguageCommunication lcom : rt.getPatientRole().getPatient().getLanguageCommunications()) {
						lcom.setLanguageCode(lanCode);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceIndTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
				LanguageCommunication lcom = CDAFactory.eINSTANCE.createLanguageCommunication();
				pat.getLanguageCommunications().add(lcom);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				BL prefInd = DatatypesFactory.eINSTANCE.createBL();
				for (RecordTarget rt : target.getRecordTargets()) {
					for (LanguageCommunication lcom : rt.getPatientRole().getPatient().getLanguageCommunications()) {
						lcom.setPreferenceInd(prefInd);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYearTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				// fails if value is less than required number of digits (4)
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("123")); // fails as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				// passes if value is more than or equal to required number of digits (6)
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("1234")); // passes as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYear(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToYearTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDayTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				// fails if value is less than required number of digits (8)
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("1234567")); // fails as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				// passes if value is more than or equal to required number of digits (8)
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("12345678")); // passes as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDay(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinuteTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_PATIENT_TS_BIRTH_TIME_PRECISE_TO_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				// fails if value is less than required number of digits (10)
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("123456789")); // fails as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				// passes if value is more than or equal to required number of digits (10)
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS("1234567890")); // passes as intended
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinute(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRolePatientTSBirthTimePreciseToMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				CE raceCode = DatatypesFactory.eINSTANCE.createCE();
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.getPatientRole().getPatient().setRaceCode(raceCode);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				CE raceCode = DatatypesFactory.eINSTANCE.createCE("1002-5", "2.16.840.1.113883.6.238");
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.getPatientRole().getPatient().setRaceCode(raceCode);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				CE egCode = DatatypesFactory.eINSTANCE.createCE();
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.getPatientRole().getPatient().setEthnicGroupCode(egCode);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				// fails if no birthTime element exists
				target.init();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				// passes if a birthTime element exists
				TS btTS = DatatypesFactory.eINSTANCE.createTS();
				btTS.setNullFlavor(NullFlavor.NAV);
				target.getRecordTargets().clear();
				RecordTarget re = CDAFactory.eINSTANCE.createRecordTarget();
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				Patient patient = CDAFactory.eINSTANCE.createPatient();
				patient.setBirthTime(DatatypesFactory.eINSTANCE.createTS());
				pr.setPatient(patient);
				re.setPatientRole(pr);
				target.getRecordTargets().add(re);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				CE egCode = DatatypesFactory.eINSTANCE.createCE("2135-2", "2.16.840.1.113883.6.238");
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.getPatientRole().getPatient().setEthnicGroupCode(egCode);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				Guardian guard = CDAFactory.eINSTANCE.createGuardian();
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.getPatientRole().getPatient().getGuardians().add(guard);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_PATIENT_ROLE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				pr.setPatient(pat);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				LanguageCommunication lcom = CDAFactory.eINSTANCE.createLanguageCommunication();
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.getPatientRole().getPatient().getLanguageCommunications().add(lcom);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetPatientRoleGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_RECORD_TARGET_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				rt.setPatientRole(pr);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				Patient pat = CDAFactory.eINSTANCE.createPatient();
				for (RecordTarget rt : target.getRecordTargets()) {
					rt.getPatientRole().setPatient(pat);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2RecordTargetGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRoleTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				PatientRole pr = CDAFactory.eINSTANCE.createPatientRole();
				for (RecordTarget r : target.getRecordTargets()) {
					r.setPatientRole(pr);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRole(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2GeneralHeaderConstraintsRecordTargetPatientRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				target.setDataEnterer(de);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.getDataEnterer().getAssignedEntity().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_DATA_ENTERER_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				target.setDataEnterer(de);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				de.setAssignedEntity(ae);
				ae.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.getDataEnterer().getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.6.101"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2DataEntererGeneralHeaderConstraintsDataEntererAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntityTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				target.setDataEnterer(de);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.getDataEnterer().setAssignedEntity(ae);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntity(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2GeneralHeaderConstraintsDataEntererAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_IF_ASSIGNED_PERSON_THEN_CONTAINS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Author a = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(a);
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				a.setAssignedAuthor(aa);
				Person ap = CDAFactory.eINSTANCE.createPerson();
				aa.setAssignedPerson(ap);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (Author a : target.getAuthors()) {
					a.getAssignedAuthor().setCode(DatatypesFactory.eINSTANCE.createCE());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2AuthorAssignedAuthorIfAssignedPersonThenContainsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2AuthorAssignedAuthorCodeTerminology() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2AuthorAssignedAuthorCodeTerminologyTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_AUTHOR_ASSIGNED_AUTHOR_CODE_TERMINOLOGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Author a = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(a);
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				a.setAssignedAuthor(aa);
				Person ap = CDAFactory.eINSTANCE.createPerson();
				aa.setAssignedPerson(ap);
				aa.setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (Author a : target.getAuthors()) {
					a.getAssignedAuthor().setCode(
						DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.6.101"));
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2AuthorAssignedAuthorCodeTerminology(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2AuthorAssignedAuthorCodeTerminologyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthorTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Author a = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(a);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				for (Author a : target.getAuthors()) {
					a.setAssignedAuthor(aa);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthor(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2GeneralHeaderConstraintsAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformationRecipientIntendedRecipientId() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformationRecipientIntendedRecipientIdTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformationRecipientIntendedRecipientId",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				ir.setIntendedRecipient(intendedRec);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				II id = DatatypesFactory.eINSTANCE.createII();
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.getIntendedRecipient().getIds().add(id);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformationRecipientIntendedRecipientId(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformationRecipientIntendedRecipientIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipientTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.setIntendedRecipient(intendedRec);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipient(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2GeneralHeaderConstraintsInformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2LegalAuthenticatorSDTCSignatureText() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2LegalAuthenticatorSDTCSignatureTextTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_LEGAL_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.getLegalAuthenticator().setSDTCSignatureText(DatatypesFactory.eINSTANCE.createED("notEnforced"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2LegalAuthenticatorSDTCSignatureText(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2LegalAuthenticatorSDTCSignatureTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2AuthenticatorSDTCSignatureText() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2AuthenticatorSDTCSignatureTextTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2AuthenticatorSDTCSignatureText",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_AUTHENTICATOR_SDTC_SIGNATURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Authenticator a = CDAFactory.eINSTANCE.createAuthenticator();
				target.getAuthenticators().add(a);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (Authenticator a : target.getAuthenticators()) {
					a.setSDTCSignatureText(DatatypesFactory.eINSTANCE.createED("notEnforced"));
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2AuthenticatorSDTCSignatureText(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2AuthenticatorSDTCSignatureTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				ae.getAddrs().add(addr);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				ADXP sal = DatatypesFactory.eINSTANCE.createADXP();
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getStreetAddressLines().add(sal);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				ae.getAddrs().add(addr);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getUses().add(PostalAddressUse.ABC);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				ae.getAddrs().add(addr);
				addr.getUses().add(PostalAddressUse.ABC);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getUses().clear();
					}
				}
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getUses().add(PostalAddressUse.DIR);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				ae.getAddrs().add(addr);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				ADXP country = DatatypesFactory.eINSTANCE.createADXP();
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getCountries().add(country);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				ae.getAddrs().add(addr);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				ADXP state = DatatypesFactory.eINSTANCE.createADXP();
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getStates().add(state);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				ae.getAddrs().add(addr);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				ADXP city = DatatypesFactory.eINSTANCE.createADXP();
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getCities().add(city);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				ae.getAddrs().add(addr);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				ADXP postalCode = DatatypesFactory.eINSTANCE.createADXP();
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getPostalCodes().add(postalCode);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				ae.getAddrs().add(addr);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				ADXP sdl = DatatypesFactory.eINSTANCE.createADXP();
				for (Informant12 inf : target.getInformants()) {
					for (AD addr : inf.getAssignedEntity().getAddrs()) {
						addr.getStreetAddressLines().add(sdl);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (Informant12 inf : target.getInformants()) {
					inf.getAssignedEntity().setCode(DatatypesFactory.eINSTANCE.createCE());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (Informant12 inf : target.getInformants()) {
					inf.getAssignedEntity().setCode(
						DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.6.101"));
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddrTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_GENERAL_HEADER_CONSTRAINTS_INFORMANT_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				inf.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (Informant12 inf : target.getInformants()) {
					inf.getAssignedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddr(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantGeneralHeaderConstraintsInformantAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntityTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_INFORMANT_HAS_ASSIGNED_ENTITY_OR_RELATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(USRealmHeader2 target) {
						target.init();
						Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
						target.getInformants().add(informant);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(USRealmHeader2 target) {
						target.init();

						Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						informant.setAssignedEntity(ae);
						RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();

						informant.setRelatedEntity(re);

						target.getInformants().add(informant);

					}
				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(USRealmHeader2 target) {
						target.init();

						Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						informant.setAssignedEntity(ae);

						target.getInformants().add(informant);

					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(USRealmHeader2 target) {
						target.init();
						Informant12 informant = CDAFactory.eINSTANCE.createInformant12();
						RelatedEntity re = CDAFactory.eINSTANCE.createRelatedEntity();
						informant.setRelatedEntity(re);
						target.getInformants().add(informant);

					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntity(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2InformantHasAssignedEntityOrRelatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounterTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(comp);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.getComponentOf().setEncompassingEncounter(CDAFactory.eINSTANCE.createEncompassingEncounter());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounter(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2GeneralHeaderConstraintsComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganizationTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_HAS_ASSOCIATED_PERSON_OR_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(USRealmHeader2 target) {
						// Does not contain an associatedPerson element or a scopingOrganization element
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						participant.setAssociatedEntity(ae);
						target.getParticipants().add(participant);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(USRealmHeader2 target) {
						// associatedPerson element and scopingOrganization element
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						ae.setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
						ae.setScopingOrganization(CDAFactory.eINSTANCE.createOrganization());
						participant.setAssociatedEntity(ae);
						target.getParticipants().add(participant);
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(USRealmHeader2 target) {
						// scopingOrganization element only
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						ae.setScopingOrganization(CDAFactory.eINSTANCE.createOrganization());
						participant.setAssociatedEntity(ae);
						target.getParticipants().add(participant);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(USRealmHeader2 target) {
						// associatedPerson element only
						target.init();
						Participant1 participant = CDAFactory.eINSTANCE.createParticipant1();
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						ae.setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
						participant.setAssociatedEntity(ae);
						target.getParticipants().add(participant);

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2ParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docOf.setServiceEvent(se);
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);

			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					for (Performer1 perf : dof.getServiceEvent().getPerformers()) {
						perf.getAssignedEntity().setCode(DatatypesFactory.eINSTANCE.createCE());
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docOf.setServiceEvent(se);
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				ae.setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					for (Performer1 perf : dof.getServiceEvent().getPerformers()) {
						perf.getAssignedEntity().setCode(
							DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.6.101"));
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2DocumentationOfServiceEventPerformer1GeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodePTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docOf.setServiceEvent(se);
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					for (Performer1 perf : dof.getServiceEvent().getPerformers()) {
						perf.setFunctionCode(DatatypesFactory.eINSTANCE.createCE());
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeP(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docOf.setServiceEvent(se);
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
				perf.setFunctionCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					for (Performer1 perf : dof.getServiceEvent().getPerformers()) {
						perf.setFunctionCode(DatatypesFactory.eINSTANCE.createCE("ADMPHYS", "2.16.840.1.113883.5.88"));
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1FunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_SERVICE_EVENT_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docOf.setServiceEvent(se);
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					for (Performer1 perf : dof.getServiceEvent().getPerformers()) {
						perf.setAssignedEntity(ae);
					}
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntity(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2DocumentationOfServiceEventGeneralHeaderConstraintsDocumentationOfServiceEventPerformer1AssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_DOCUMENTATION_OF_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				docOf.setServiceEvent(se);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					dof.getServiceEvent().getPerformers().add(perf);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformer(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2DocumentationOfGeneralHeaderConstraintsDocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent() {
		OperationsTestCase<USRealmHeader2> validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEventTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					dof.setServiceEvent(se);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEvent(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2GeneralHeaderConstraintsDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {

			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsTemplateId(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTitle() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsTitleTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsTitle",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {

			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsTitle(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRealmCode() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsRealmCodeTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsRealmCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {

			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				// target.init() creates 2 realm codes in this case,
				// one for GeneralHeaderConstraints and one for USRealmHeade2
				// so we have to remove them first to meet the 1..1 multiplicity
				target.init();
				target.getRealmCodes().clear();
				CS rc = DatatypesFactory.eINSTANCE.createCS("US");
				target.getRealmCodes().add(rc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsRealmCode(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRealmCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTarget() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsRecordTargetTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				RecordTarget rt = CDAFactory.eINSTANCE.createRecordTarget();
				target.getRecordTargets().add(rt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsRecordTarget(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDataEnterer() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsDataEntererTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsDataEnterer",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DATA_ENTERER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				DataEnterer de = CDAFactory.eINSTANCE.createDataEnterer();
				target.setDataEnterer(de);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsDataEnterer(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDataEntererTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthor() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsAuthorTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsAuthor",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthor(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCustodian() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsCustodianTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsCustodian",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.setCustodian(CDAFactory.eINSTANCE.createCustodian());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsCustodian(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformationRecipient() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsInformationRecipientTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.getInformationRecipients().add(CDAFactory.eINSTANCE.createInformationRecipient());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformationRecipient(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsLegalAuthenticator() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsLegalAuthenticatorTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsLegalAuthenticator",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				LegalAuthenticator la = CDAFactory.eINSTANCE.createLegalAuthenticator();
				target.setLegalAuthenticator(la);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsLegalAuthenticator(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsLegalAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthenticator() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsAuthenticatorTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsAuthenticator",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				Authenticator a = CDAFactory.eINSTANCE.createAuthenticator();
				target.getAuthenticators().add(a);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthenticator(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthenticatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInformant() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsInformantTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsInformant",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsInformant(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInformantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsInFulfillmentOf() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsInFulfillmentOfTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsInFulfillmentOf",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.getInFulfillmentOfs().add(CDAFactory.eINSTANCE.createInFulfillmentOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsInFulfillmentOf(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsInFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsComponentOf() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsComponentOfTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				Component1 comp = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(comp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsComponentOf(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsSupportParticipant() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsSupportParticipantTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsSupportParticipant",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_SUPPORT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsSupportParticipant(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsSupportParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsDocumentationOf() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsDocumentationOfTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				DocumentationOf docOf = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(docOf);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsDocumentationOf(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsAuthorization() {
		OperationsTestCase<USRealmHeader2> validateGeneralHeaderConstraintsAuthorizationTestCase = new OperationsTestCase<USRealmHeader2>(
			"validateGeneralHeaderConstraintsAuthorization",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(USRealmHeader2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(USRealmHeader2 target) {
				target.getAuthorizations().add(CDAFactory.eINSTANCE.createAuthorization());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return USRealmHeader2Operations.validateGeneralHeaderConstraintsAuthorization(
					(USRealmHeader2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsAuthorizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends USRealmHeader2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<USRealmHeader2> {
		@Override
		public USRealmHeader2 create() {
			return ConsolFactory.eINSTANCE.createUSRealmHeader2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends USRealmHeader2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // USRealmHeader2Operations
