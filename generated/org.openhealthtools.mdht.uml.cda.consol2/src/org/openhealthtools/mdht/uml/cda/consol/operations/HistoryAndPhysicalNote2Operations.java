/*******************************************************************************
 * Copyright (c) 2015 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								   as it required the use of select instead of reject 
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History And Physical Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2InformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2InFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2AssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2GeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Immunizations Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2InstructionsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Instructions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2PhysicalExamSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Problem Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Results Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2SocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Vital Signs Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2FamilyHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Participant If Par Type Code IND Then AE Class Code IND</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getAllergiesSectionEntriesOptional2() <em>Get Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getAssessmentAndPlanSection2() <em>Get Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getHistoryOfPastIllnessSection2() <em>Get History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getImmunizationsSectionEntriesOptional2() <em>Get Immunizations Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getInstructionsSection2() <em>Get Instructions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getMedicationsSectionEntriesOptional2() <em>Get Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getPhysicalExamSection2() <em>Get Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getProblemSectionEntriesOptional2() <em>Get Problem Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getProceduresSectionEntriesOptional2() <em>Get Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getResultsSectionEntriesOptional2() <em>Get Results Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getVitalSignsSectionEntriesOptional2() <em>Get Vital Signs Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#getFamilyHistorySection2() <em>Get Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalNote2Operations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalNote2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Has Chief Complaint And Reason For Visit Chief Complaint Or Reason For Visit</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2CodeP(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2CodeP(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2CodeP(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2CodeP(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2CodeP(HistoryAndPhysicalNote2 historyAndPhysicalNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_CODE_P,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2CodeP"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2CodeP", passToken);
				}
				passToken.add(historyAndPhysicalNote2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2Code(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2Code(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '34117-2' or value.code = '11492-6' or value.code = '28626-0' or value.code = '34774-0' or value.code = '34115-6' or value.code = '34116-4' or value.code = '34095-0' or value.code = '34096-8' or value.code = '51849-8' or value.code = '47039-3' or value.code = '34763-3' or value.code = '34094-3' or value.code = '34138-8'))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2Code(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2Code(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2Code(HistoryAndPhysicalNote2 historyAndPhysicalNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(historyAndPhysicalNote2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_CODE,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2Code"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2InformationRecipient(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2InformationRecipient(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->exists(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2InformationRecipient(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2InformationRecipient(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2InformationRecipient(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2InformationRecipient"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2Participant(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2Participant(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2Participant(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2Participant(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2Participant(HistoryAndPhysicalNote2 historyAndPhysicalNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2Participant"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2InFulfillmentOf(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 In Fulfillment Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2InFulfillmentOf(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.inFulfillmentOf->exists(inFulfillmentOf : cda::InFulfillmentOf | not inFulfillmentOf.oclIsUndefined() and inFulfillmentOf.oclIsKindOf(rim::ActRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2InFulfillmentOf(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 In Fulfillment Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2InFulfillmentOf(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2InFulfillmentOf(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2InFulfillmentOf"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOf(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOf(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOf(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOf(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ComponentOf(HistoryAndPhysicalNote2 historyAndPhysicalNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOf"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Allergies Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Allergies Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2AllergiesSectionEntriesOptional2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2AssessmentSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2AssessmentSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2AssessmentSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Assessment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2AssessmentSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2AssessmentSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2AssessmentSection"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_PLAN_OF_TREATMENT_SECTION2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2PlanOfTreatmentSection2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Assessment And Plan Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Assessment And Plan Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_AND_PLAN_SECTION2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2AssessmentAndPlanSection2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ChiefComplaintSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ChiefComplaintSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ChiefComplaintSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ChiefComplaintSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ChiefComplaintSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ChiefComplaintSection"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Chief Complaint And Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2GeneralStatusSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2GeneralStatusSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2GeneralStatusSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2GeneralStatusSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2GeneralStatusSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_GENERAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2GeneralStatusSection"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 History Of Past Illness Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 History Of Past Illness Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2HistoryOfPastIllnessSection2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 History Of Present Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2HistoryOfPresentIllnessSection"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Immunizations Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Immunizations Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2InstructionsSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Instructions Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2InstructionsSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2InstructionsSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Instructions Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2InstructionsSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2InstructionsSection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_INSTRUCTIONS_SECTION2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2InstructionsSection2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Medications Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2MedicationsSectionEntriesOptional2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2PhysicalExamSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Physical Exam Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2PhysicalExamSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2PhysicalExamSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Physical Exam Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2PhysicalExamSection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2PhysicalExamSection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_PHYSICAL_EXAM_SECTION2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2PhysicalExamSection2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Problem Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Problem Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ProblemSectionEntriesOptional2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Procedures Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Procedures Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ProceduresSectionEntriesOptional2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ReasonForVisitSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ReasonForVisitSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ReasonForVisitSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ReasonForVisitSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ReasonForVisitSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ReasonForVisitSection"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Results Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Results Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ResultsSectionEntriesOptional2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ReviewOfSystemsSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ReviewOfSystemsSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ReviewOfSystemsSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ReviewOfSystemsSection(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2ReviewOfSystemsSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ReviewOfSystemsSection"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2SocialHistorySection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2SocialHistorySection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2SocialHistorySection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Social History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2SocialHistorySection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2SocialHistorySection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_SOCIAL_HISTORY_SECTION2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2SocialHistorySection2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Vital Signs Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Vital Signs Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2FamilyHistorySection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Family History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2FamilyHistorySection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2FamilyHistorySection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Family History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2FamilyHistorySection2(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHistoryAndPhysicalNote2FamilyHistorySection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_FAMILY_HISTORY_SECTION2,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2FamilyHistorySection2"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient Intended Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->excluding(null)->reject(intendedRecipient->one(intendedRecipient : cda::IntendedRecipient | not intendedRecipient.oclIsUndefined() and intendedRecipient.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient Intended Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2InformationRecipientIntendedRecipient"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Participant If Par Type Code IND Then AE Class Code IND</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(p : cda::Participant1 | p.typeCode = vocab::ParticipationType::IND and not ( p.associatedEntity.classCode = vocab::RoleClassAssociative::PRS  or p.associatedEntity.classCode = vocab::RoleClassAssociative::NOK or p.associatedEntity.classCode = vocab::RoleClassAssociative::CAREGIVER or p.associatedEntity.classCode = vocab::RoleClassAssociative::AGNT or p.associatedEntity.classCode = vocab::RoleClassAssociative::GUAR or p.associatedEntity.classCode = vocab::RoleClassAssociative::ECON or p.associatedEntity.isNullFlavorDefined() ) or p.associatedEntity.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Participant If Par Type Code IND Then AE Class Code IND</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 8) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 8) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 8))))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Day IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_DAY_IVLTS,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 12) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 12) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 12))))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Minute IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_MINUTE_IVLTS,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject(isNullFlavorUndefined() implies ((not value.oclIsUndefined() implies value.size() >= 14) and ((not low.value.oclIsUndefined() and low.isNullFlavorUndefined() implies low.value.size() >= 14) and (not high.value.oclIsUndefined() and high.isNullFlavorUndefined() implies high.value.size() >= 14))))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT Precise To The Second IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_PRECISE_TO_THE_SECOND_IVLTS,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject((not value.oclIsUndefined() and value.size() > 8 implies value.size() >= 15) and ((not low.value.oclIsUndefined() and low.value.size() > 8 implies low.value.size() >= 15) and (not high.value.oclIsUndefined() and high.value.size() > 8 implies high.value.size() >= 15)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter General Header Constraints US Realm Date And Time DT If More Precise Than Day Include Time Zone Offset IVLTS</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_GENERAL_HEADER_CONSTRAINTS_US_REALM_DATE_AND_TIME_DT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET_IVLTS,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->exists(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->one(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(rim::Participation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(historyAndPhysicalNote2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2HistoryAndPhysicalNote2ComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Allergies Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Allergies Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSectionEntriesOptional2 getAllergiesSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(360));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (AllergiesSectionEntriesOptional2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(HistoryAndPhysicalNote2) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->any(true).oclAsType(consol::AssessmentSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(HistoryAndPhysicalNote2) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentSection getAssessmentSection(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(361));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfTreatmentSection2(HistoryAndPhysicalNote2) <em>Get Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))->asSequence()->any(true).oclAsType(consol::PlanOfTreatmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfTreatmentSection2(HistoryAndPhysicalNote2) <em>Get Plan Of Treatment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfTreatmentSection2 getPlanOfTreatmentSection2(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(362));
			try {
				GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY);
		return (PlanOfTreatmentSection2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection2(HistoryAndPhysicalNote2) <em>Get Assessment And Plan Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))->asSequence()->any(true).oclAsType(consol::AssessmentAndPlanSection2)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection2(HistoryAndPhysicalNote2) <em>Get Assessment And Plan Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection2 getAssessmentAndPlanSection2(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(363));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY);
		return (AssessmentAndPlanSection2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(HistoryAndPhysicalNote2) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(HistoryAndPhysicalNote2) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChiefComplaintSection getChiefComplaintSection(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(364));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote2) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote2) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(365));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(HistoryAndPhysicalNote2) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->any(true).oclAsType(consol::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(HistoryAndPhysicalNote2) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static GeneralStatusSection getGeneralStatusSection(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(366));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection2(HistoryAndPhysicalNote2) <em>Get History Of Past Illness Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection2)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection2(HistoryAndPhysicalNote2) <em>Get History Of Past Illness Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(367));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY);
		return (HistoryOfPastIllnessSection2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(HistoryAndPhysicalNote2) <em>Get History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPresentIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(HistoryAndPhysicalNote2) <em>Get History Of Present Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(368));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Immunizations Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ImmunizationsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Immunizations Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ImmunizationsSectionEntriesOptional2 getImmunizationsSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(369));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInstructionsSection2(HistoryAndPhysicalNote2) <em>Get Instructions Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSTRUCTIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::InstructionsSection2))->asSequence()->any(true).oclAsType(consol::InstructionsSection2)";

	/**
	 * The cached OCL query for the '{@link #getInstructionsSection2(HistoryAndPhysicalNote2) <em>Get Instructions Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionsSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSTRUCTIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InstructionsSection2 getInstructionsSection2(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_INSTRUCTIONS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(370));
			try {
				GET_INSTRUCTIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_INSTRUCTIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSTRUCTIONS_SECTION2__EOCL_QRY);
		return (InstructionsSection2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::MedicationsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Medications Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSectionEntriesOptional2 getMedicationsSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(371));
			try {
				GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (MedicationsSectionEntriesOptional2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection2(HistoryAndPhysicalNote2) <em>Get Physical Exam Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAM_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))->asSequence()->any(true).oclAsType(consol::PhysicalExamSection2)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamSection2(HistoryAndPhysicalNote2) <em>Get Physical Exam Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PhysicalExamSection2 getPhysicalExamSection2(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(372));
			try {
				GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY);
		return (PhysicalExamSection2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Problem Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ProblemSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Problem Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSectionEntriesOptional2 getProblemSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(373));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ProblemSectionEntriesOptional2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Procedures Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ProceduresSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Procedures Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProceduresSectionEntriesOptional2 getProceduresSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(374));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ProceduresSectionEntriesOptional2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForVisitSection(HistoryAndPhysicalNote2) <em>Get Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	 * The cached OCL query for the '{@link #getReasonForVisitSection(HistoryAndPhysicalNote2) <em>Get Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReasonForVisitSection getReasonForVisitSection(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(375));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Results Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ResultsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getResultsSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Results Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSectionEntriesOptional2 getResultsSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(376));
			try {
				GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ResultsSectionEntriesOptional2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(HistoryAndPhysicalNote2) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(HistoryAndPhysicalNote2) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReviewOfSystemsSection getReviewOfSystemsSection(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(377));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection2(HistoryAndPhysicalNote2) <em>Get Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))->asSequence()->any(true).oclAsType(consol::SocialHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection2(HistoryAndPhysicalNote2) <em>Get Social History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SocialHistorySection2 getSocialHistorySection2(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(378));
			try {
				GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY);
		return (SocialHistorySection2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Vital Signs Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional2(HistoryAndPhysicalNote2) <em>Get Vital Signs Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSectionEntriesOptional2 getVitalSignsSectionEntriesOptional2(
			HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(379));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection2(HistoryAndPhysicalNote2) <em>Get Family History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection2(HistoryAndPhysicalNote2) <em>Get Family History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection2(HistoryAndPhysicalNote2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySection2 getFamilyHistorySection2(HistoryAndPhysicalNote2 historyAndPhysicalNote2) {
		if (GET_FAMILY_HISTORY_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2,
				ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2.getEAllOperations().get(380));
			try {
				GET_FAMILY_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION2__EOCL_QRY);
		return (FamilyHistorySection2) query.evaluate(historyAndPhysicalNote2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.3' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param historyAndPhysicalNote2 The receiving '<em><b>History And Physical Note2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysicalNote2 historyAndPhysicalNote2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			historyAndPhysicalNote2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HISTORY_AND_PHYSICAL_NOTE2__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HistoryAndPhysicalNote2GeneralHeaderConstraintsTemplateId"),
					new Object[] { historyAndPhysicalNote2 }));
			}

			return false;
		}
		return true;
	}

} // HistoryAndPhysicalNote2Operations
