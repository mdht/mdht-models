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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.AssignedEntity;
import org.eclipse.mdht.uml.cda.AssociatedEntity;
import org.eclipse.mdht.uml.cda.Authorization;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Component1;
import org.eclipse.mdht.uml.cda.DocumentationOf;
import org.eclipse.mdht.uml.cda.EncompassingEncounter;
import org.eclipse.mdht.uml.cda.EncounterParticipant;
import org.eclipse.mdht.uml.cda.HealthCareFacility;
import org.eclipse.mdht.uml.cda.Participant1;
import org.eclipse.mdht.uml.cda.Performer1;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.IVXB_TS;
import org.eclipse.mdht.uml.hl7.vocab.ActClass;
import org.eclipse.mdht.uml.hl7.vocab.ActMood;
import org.eclipse.mdht.uml.hl7.vocab.ActRelationshipType;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.eclipse.mdht.uml.hl7.vocab.x_EncounterParticipant;
import org.eclipse.mdht.uml.hl7.vocab.x_ServiceEventPerformer;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNote2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Does Not Have Chief Complaint With Chief Complaint Or Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2Authorization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComplicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Complications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ProcedureDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ProcedureIndicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Procedure Indications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2PostprocedureDiagnosisSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Postprocedure Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AssessmentAndPlanSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AllergiesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AnesthesiaSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Anesthesia Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2FamilyHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2HistoryOfPastIllnessSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2HistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2MedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2MedicationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2MedicationsAdministeredSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Medications Administered Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2PhysicalExamSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2PlannedProcedureSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Planned Procedure Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ProcedureDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ProcedureEstimatedBloodLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ProcedureFindingsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Procedure Findings Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ProcedureImplantsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ProcedureSpecimensTakenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ProceduresSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2SocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event Performer Assistants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationConsentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationConsentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationConsentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2AuthorizationConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Authorization Consent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Encounter Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateProcedureNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getComplicationsSection2() <em>Get Complications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getProcedureDescriptionSection() <em>Get Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getProcedureIndicationsSection2() <em>Get Procedure Indications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getPostprocedureDiagnosisSection2() <em>Get Postprocedure Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getAssessmentAndPlanSection2() <em>Get Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getAllergiesSectionEntriesOptional2() <em>Get Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getAnesthesiaSection2() <em>Get Anesthesia Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getFamilyHistorySection2() <em>Get Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getHistoryOfPastIllnessSection2() <em>Get History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getMedicalHistorySection() <em>Get Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getMedicationsSectionEntriesOptional2() <em>Get Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getMedicationsAdministeredSection2() <em>Get Medications Administered Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getPhysicalExamSection2() <em>Get Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getPlannedProcedureSection2() <em>Get Planned Procedure Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getProcedureDispositionSection() <em>Get Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getProcedureEstimatedBloodLossSection() <em>Get Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getProcedureFindingsSection2() <em>Get Procedure Findings Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getProcedureImplantsSection() <em>Get Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getProcedureSpecimensTakenSection() <em>Get Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getProceduresSectionEntriesOptional2() <em>Get Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureNote2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_WITH_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
						target.addSection(
							ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
						target.addSection(
							ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureNote2 target) {
						target.init();
						target.addSection(
							ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.init();
						target.addSection(
							ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2CodeP() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2CodePTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2CodeP(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2Code() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2CodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
			}

			{
				final String[] availableCodes = new String[] { "28570-0", "11505-5", "18744-3" }; // ...
				for (int i = 0; i < availableCodes.length; i++) {
					final int j = i;
					addPassTest(new PassTest() {
						@Override
						public void updateToPass(ProcedureNote2 target) {
							target.init();
							CE code = target.getCode();
							code.setCodeSystem("2.16.840.1.113883.6.1");
							code.setCode(availableCodes[j]);
						}
					});
				}
			}

			@Override
			protected void setDependency(ProcedureNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2Code(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2Participant() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2Participant",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2Participant(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOf() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOf(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2Authorization() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2Authorization",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2Authorization(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOf() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOf(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComplicationsSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComplicationsSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComplicationsSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPLICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createComplicationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComplicationsSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComplicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ProcedureDescriptionSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ProcedureDescriptionSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ProcedureDescriptionSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ProcedureDescriptionSection */
				ProcedureDescriptionSection section =

				ConsolFactory.eINSTANCE.createProcedureDescriptionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ProcedureDescriptionSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ProcedureDescriptionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ProcedureIndicationsSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ProcedureIndicationsSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ProcedureIndicationsSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PROCEDURE_INDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProcedureIndicationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ProcedureIndicationsSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ProcedureIndicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2PostprocedureDiagnosisSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2PostprocedureDiagnosisSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2PostprocedureDiagnosisSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_POSTPROCEDURE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPostprocedureDiagnosisSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2PostprocedureDiagnosisSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2PostprocedureDiagnosisSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2AssessmentSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AssessmentSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

				ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AssessmentSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2AssessmentAndPlanSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AssessmentAndPlanSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AssessmentAndPlanSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AssessmentAndPlanSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AssessmentAndPlanSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2PlanOfTreatmentSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2PlanOfTreatmentSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2PlanOfTreatmentSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2PlanOfTreatmentSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2PlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2AllergiesSectionEntriesOptional2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AllergiesSectionEntriesOptional2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AllergiesSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AllergiesSectionEntriesOptional2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AllergiesSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2AnesthesiaSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AnesthesiaSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AnesthesiaSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_ANESTHESIA_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAnesthesiaSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AnesthesiaSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AnesthesiaSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ChiefComplaintSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ChiefComplaintSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ChiefComplaintSection", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ChiefComplaintSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ChiefComplaintAndReasonForVisitSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2FamilyHistorySection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2FamilyHistorySection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2FamilyHistorySection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFamilyHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2FamilyHistorySection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2FamilyHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2HistoryOfPastIllnessSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2HistoryOfPastIllnessSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2HistoryOfPastIllnessSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2HistoryOfPastIllnessSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2HistoryOfPastIllnessSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2HistoryOfPresentIllnessSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2HistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2HistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2HistoryOfPresentIllnessSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2HistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2MedicalHistorySection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2MedicalHistorySectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2MedicalHistorySection", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* MedicalHistorySection */
				MedicalHistorySection section =

				ConsolFactory.eINSTANCE.createMedicalHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2MedicalHistorySection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2MedicalHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2MedicationsSectionEntriesOptional2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2MedicationsSectionEntriesOptional2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2MedicationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2MedicationsSectionEntriesOptional2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2MedicationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2MedicationsAdministeredSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2MedicationsAdministeredSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2MedicationsAdministeredSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_MEDICATIONS_ADMINISTERED_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicationsAdministeredSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2MedicationsAdministeredSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2MedicationsAdministeredSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2PhysicalExamSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2PhysicalExamSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2PhysicalExamSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPhysicalExamSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2PhysicalExamSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2PhysicalExamSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2PlannedProcedureSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2PlannedProcedureSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2PlannedProcedureSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PLANNED_PROCEDURE_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlannedProcedureSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2PlannedProcedureSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2PlannedProcedureSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ProcedureDispositionSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ProcedureDispositionSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ProcedureDispositionSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ProcedureDispositionSection */
				ProcedureDispositionSection section =

				ConsolFactory.eINSTANCE.createProcedureDispositionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ProcedureDispositionSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ProcedureDispositionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ProcedureEstimatedBloodLossSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ProcedureEstimatedBloodLossSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ProcedureEstimatedBloodLossSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ProcedureEstimatedBloodLossSection */
				ProcedureEstimatedBloodLossSection section =

				ConsolFactory.eINSTANCE.createProcedureEstimatedBloodLossSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ProcedureEstimatedBloodLossSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ProcedureEstimatedBloodLossSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ProcedureFindingsSection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ProcedureFindingsSection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ProcedureFindingsSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PROCEDURE_FINDINGS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProcedureFindingsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ProcedureFindingsSection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ProcedureFindingsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ProcedureImplantsSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ProcedureImplantsSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ProcedureImplantsSection", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ProcedureImplantsSection */
				ProcedureImplantsSection section =

				ConsolFactory.eINSTANCE.createProcedureImplantsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ProcedureImplantsSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ProcedureImplantsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ProcedureSpecimensTakenSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ProcedureSpecimensTakenSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ProcedureSpecimensTakenSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ProcedureSpecimensTakenSection */
				ProcedureSpecimensTakenSection section =

				ConsolFactory.eINSTANCE.createProcedureSpecimensTakenSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ProcedureSpecimensTakenSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ProcedureSpecimensTakenSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ProceduresSectionEntriesOptional2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ProceduresSectionEntriesOptional2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ProceduresSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ProceduresSectionEntriesOptional2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ProceduresSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ReasonForVisitSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ReasonForVisitSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ReasonForVisitSection", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ReasonForVisitSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNote2ReviewOfSystemsSection() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ReviewOfSystemsSectionTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ReviewOfSystemsSection", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ReviewOfSystemsSection(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2SocialHistorySection2() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2SocialHistorySection2TestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2SocialHistorySection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createSocialHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2SocialHistorySection2(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2SocialHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ParticipantAssociatedEntityClassCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantAssociatedEntityClassCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().setClassCode(RoleClassAssociative.PROV);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntityClassCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ParticipantAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().setAssociatedPerson(CDAFactory.eINSTANCE.createPerson());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntityAssociatedPerson(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ParticipantTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific participant type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.setTypeCode(ParticipationType.IND);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ParticipantFunctionCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantFunctionCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantFunctionCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.setFunctionCode(DatatypesFactory.eINSTANCE.createCE("PCP", "2.16.840.1.113883.5.88"));
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantFunctionCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ParticipantFunctionCodeP() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantFunctionCodePTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantFunctionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.setFunctionCode(DatatypesFactory.eINSTANCE.createCE());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantFunctionCodeP(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantFunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ParticipantAssociatedEntity() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ParticipantAssociatedEntityTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ParticipantAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				for (Participant1 p : target.getParticipants()) {
					p.setAssociatedEntity(ae);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ParticipantAssociatedEntity(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();

				low.setValue("12345");
				ts.setLow(low);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodePTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE());
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeP(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific performer type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();

				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntity(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodePTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				ae.setCode(code);
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeP(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				ae.setCode(code);
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				CE code = DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.6.101");
				ae.setCode(code);
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific performer type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntity(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();

				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);

				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProcedureNote2DocumentationOfServiceEventPreciseToTheDay() {
	// OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPreciseToTheDayTestCase = new
	// OperationsTestCase<ProcedureNote2>(
	// "validateProcedureNote2DocumentationOfServiceEventPreciseToTheDay",
	// operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProcedureNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProcedureNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_DAY);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPreciseToTheDay(
	// (ProcedureNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProcedureNote2DocumentationOfServiceEventPreciseToTheDayTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProcedureNote2DocumentationOfServiceEventPreciseToTheMinute() {
	// OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase = new
	// OperationsTestCase<ProcedureNote2>(
	// "validateProcedureNote2DocumentationOfServiceEventPreciseToTheMinute",
	// operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProcedureNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// low.setValue("2009121217");
	// ts.setLow(low);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProcedureNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPreciseToTheMinute(
	// (ProcedureNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProcedureNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProcedureNote2DocumentationOfServiceEventPreciseToTheSecond() {
	// OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPreciseToTheSecondTestCase = new
	// OperationsTestCase<ProcedureNote2>(
	// "validateProcedureNote2DocumentationOfServiceEventPreciseToTheSecond",
	// operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProcedureNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// high.setValue(PRECISE_TO_MINUTE);
	// ts.setHigh(high);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProcedureNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_SECOND);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPreciseToTheSecond(
	// (ProcedureNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProcedureNote2DocumentationOfServiceEventPreciseToTheSecondTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset() {
	// OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new
	// OperationsTestCase<ProcedureNote2>(
	// "validateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset",
	// operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProcedureNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProcedureNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MS_WITH_TIMEZONE);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_SECOND_WITH_TIMEZONE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
	// (ProcedureNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProcedureNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventProcedureCodes() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventProcedureCodesTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventProcedureCodes",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "NOT2.16.840.1.113883.6.104"));
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.104"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.12"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProcedureNote2 target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.96"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventProcedureCodes(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);

				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventEffectiveTime(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				se.setCode(ce);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformer() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformer",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					Performer1 performer = CDAFactory.eINSTANCE.createPerformer1();
					performer.setTypeCode(x_ServiceEventPerformer.PPRF);
					dof.getServiceEvent().getPerformers().add(performer);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformer(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEventPerformerAssistants() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEventPerformerAssistants",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSISTANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEventPerformerAssistants(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventPerformerAssistantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2DocumentationOfServiceEvent() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2DocumentationOfServiceEventTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();

				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2DocumentationOfServiceEvent(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationConsentClassCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationConsentClassCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationConsentClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
				auth.setConsent(CDAFactory.eINSTANCE.createConsent());
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.getConsent().setClassCode(ActClass.CONS);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentClassCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationConsentClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationConsentMoodCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationConsentMoodCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationConsentMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
				auth.setConsent(CDAFactory.eINSTANCE.createConsent());
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.getConsent().setMoodCode(ActMood.EVN);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentMoodCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationConsentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationConsentStatusCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationConsentStatusCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationConsentStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
				auth.setConsent(CDAFactory.eINSTANCE.createConsent());
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.getConsent().setStatusCode(DatatypesFactory.eINSTANCE.createCS());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsentStatusCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationConsentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.setTypeCode(ActRelationshipType.AUTH);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2AuthorizationConsent() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2AuthorizationConsentTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2AuthorizationConsent", operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_AUTHORIZATION_CONSENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Authorization auth = CDAFactory.eINSTANCE.createAuthorization();
				target.getAuthorizations().add(auth);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				for (Authorization a : target.getAuthorizations()) {
					a.setConsent(CDAFactory.eINSTANCE.createConsent());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2AuthorizationConsent(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2AuthorizationConsentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				ep.setTypeCode(x_EncounterParticipant.REF);
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityIdTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());
				HealthCareFacility hcf = CDAFactory.eINSTANCE.createHealthCareFacility();
				target.getComponentOf().getEncompassingEncounter().getLocation().setHealthCareFacility(hcf);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getLocation().getHealthCareFacility().getIds().add(
					DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.setLocation(CDAFactory.eINSTANCE.createLocation());

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				HealthCareFacility hcf = CDAFactory.eINSTANCE.createHealthCareFacility();
				target.getComponentOf().getEncompassingEncounter().getLocation().setHealthCareFacility(hcf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterId(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterCode() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterCodeTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getComponentOf().getEncompassingEncounter().setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterCode(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				ee.getEncounterParticipants().add(ep);
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipant(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounterLocation() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterLocationTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounterLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounterLocation(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureNote2ComponentOfEncompassingEncounter() {
		OperationsTestCase<ProcedureNote2> validateProcedureNote2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateProcedureNote2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROCEDURE_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.getComponentOf().setEncompassingEncounter(CDAFactory.eINSTANCE.createEncompassingEncounter());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateProcedureNote2ComponentOfEncompassingEncounter(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNote2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComplicationsSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getComplicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDescriptionSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getProcedureDescriptionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureIndicationsSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getProcedureIndicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPostprocedureDiagnosisSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getPostprocedureDiagnosisSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getAssessmentAndPlanSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional2() {

		ProcedureNote2 target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAnesthesiaSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getAnesthesiaSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getFamilyHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getHistoryOfPastIllnessSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalHistorySection() {

		ProcedureNote2 target = objectFactory.create();
		target.getMedicalHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSectionEntriesOptional2() {

		ProcedureNote2 target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsAdministeredSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getMedicationsAdministeredSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getPhysicalExamSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedureSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getPlannedProcedureSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDispositionSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getProcedureDispositionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEstimatedBloodLossSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getProcedureEstimatedBloodLossSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureFindingsSection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getProcedureFindingsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureImplantsSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getProcedureImplantsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureSpecimensTakenSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getProcedureSpecimensTakenSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional2() {

		ProcedureNote2 target = objectFactory.create();
		target.getProceduresSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ProcedureNote2 target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection2() {

		ProcedureNote2 target = objectFactory.create();
		target.getSocialHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ProcedureNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ProcedureNote2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote2 target) {

			}

			@Override
			protected void updateToPass(ProcedureNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(ProcedureNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureNote2> {
		public ProcedureNote2 create() {
			return ConsolFactory.eINSTANCE.createProcedureNote2();
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
	private static class ConstructorTestClass extends ProcedureNote2Operations {
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

} // ProcedureNote2Operations
