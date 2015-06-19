/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
 *     								 - removed prior modification as root requirement (and entire id) was removed in the final draft 
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transfer Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryAdvanceDirectivesSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Advance Directives Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryAllergiesSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryPhysicalExamSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryEncountersSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Encounters Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryFunctionalStatusSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryImmunizationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Immunizations Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryMedicalEquipmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryMedicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryPayersSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Payers Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryProblemSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryProceduresSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Procedures Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryResultsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummarySocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryVitalSignsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryMentalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryNutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryReasonForReferralSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Reason For Referral Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryHistoryOfPastIllnessSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryAssessmentAndPlanSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDischargeDiagnosisSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Discharge Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Admission Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryAdmissionDiagnosisSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Admission Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCourseOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Course Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformer1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getAdvanceDirectivesSection2() <em>Get Advance Directives Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getAllergiesSection2() <em>Get Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getPhysicalExamSection2() <em>Get Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getEncountersSection2() <em>Get Encounters Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getFunctionalStatusSection2() <em>Get Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getImmunizationsSectionEntriesOptional2() <em>Get Immunizations Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getMedicalEquipmentSection2() <em>Get Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getMedicationsSection2() <em>Get Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getPayersSection2() <em>Get Payers Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getProblemSection2() <em>Get Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getProceduresSection2() <em>Get Procedures Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getResultsSection2() <em>Get Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getVitalSignsSection2() <em>Get Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getMentalStatusSection() <em>Get Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getReasonForReferralSection2() <em>Get Reason For Referral Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getHistoryOfPastIllnessSection2() <em>Get History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getAssessmentAndPlanSection2() <em>Get Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getDischargeDiagnosisSection2() <em>Get Discharge Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getAdmissionMedicationsSectionEntriesOptional2() <em>Get Admission Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getAdmissionDiagnosisSection2() <em>Get Admission Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#getCourseOfCareSection() <em>Get Course Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransferSummaryOperations extends USRealmHeader2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryCodeP(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_CODE_P,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryCodeP"),
					new Object[] { transferSummary }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP", passToken);
				}
				passToken.add(transferSummary);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryCode(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(transferSummary)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_CODE,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryCode"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryTitle(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryTitle(TransferSummary transferSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_TITLE,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryTitle"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupport(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryParticipantSupport(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupport"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContact(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryParticipantCallbackContact(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContact"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->one(documentationOf : cda::DocumentationOf | not documentationOf.oclIsUndefined() and documentationOf.oclIsKindOf(cda::DocumentationOf))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOf(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryDocumentationOf(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOf"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryAdvanceDirectivesSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Advance Directives Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAdvanceDirectivesSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_ADVANCE_DIRECTIVES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryAdvanceDirectivesSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Advance Directives Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAdvanceDirectivesSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_ADVANCE_DIRECTIVES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryAdvanceDirectivesSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_ADVANCE_DIRECTIVES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_ADVANCE_DIRECTIVES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_ADVANCE_DIRECTIVES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_ADVANCE_DIRECTIVES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_ADVANCE_DIRECTIVES_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryAdvanceDirectivesSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryAllergiesSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Allergies Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAllergiesSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryAllergiesSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Allergies Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAllergiesSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryAllergiesSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_ALLERGIES_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryAllergiesSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryPhysicalExamSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Physical Exam Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryPhysicalExamSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryPhysicalExamSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Physical Exam Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryPhysicalExamSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryPhysicalExamSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PHYSICAL_EXAM_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryPhysicalExamSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryEncountersSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Encounters Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryEncountersSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_ENCOUNTERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryEncountersSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Encounters Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryEncountersSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_ENCOUNTERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryEncountersSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_ENCOUNTERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_ENCOUNTERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_ENCOUNTERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_ENCOUNTERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_ENCOUNTERS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryEncountersSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryFamilyHistorySection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryFamilyHistorySection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryFamilyHistorySection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryFamilyHistorySection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryFamilyHistorySection(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryFamilyHistorySection"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryFunctionalStatusSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Functional Status Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryFunctionalStatusSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryFunctionalStatusSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Functional Status Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryFunctionalStatusSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryFunctionalStatusSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_FUNCTIONAL_STATUS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryFunctionalStatusSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryImmunizationsSectionEntriesOptional2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Immunizations Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryImmunizationsSectionEntriesOptional2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryImmunizationsSectionEntriesOptional2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Immunizations Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryImmunizationsSectionEntriesOptional2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryImmunizationsSectionEntriesOptional2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryImmunizationsSectionEntriesOptional2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryMedicalEquipmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Medical Equipment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryMedicalEquipmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryMedicalEquipmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Medical Equipment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryMedicalEquipmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryMedicalEquipmentSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_MEDICAL_EQUIPMENT_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryMedicalEquipmentSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryMedicationsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Medications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryMedicationsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryMedicationsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Medications Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryMedicationsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryMedicationsSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_MEDICATIONS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryMedicationsSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryPayersSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Payers Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryPayersSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryPayersSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Payers Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryPayersSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryPayersSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PAYERS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryPayersSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryPlanOfTreatmentSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryPlanOfTreatmentSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PLAN_OF_TREATMENT_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryPlanOfTreatmentSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryProblemSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Problem Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryProblemSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryProblemSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Problem Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryProblemSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryProblemSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PROBLEM_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryProblemSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryProceduresSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Procedures Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryProceduresSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryProceduresSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Procedures Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryProceduresSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryProceduresSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PROCEDURES_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryProceduresSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryResultsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Results Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryResultsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryResultsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Results Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryResultsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryResultsSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_RESULTS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryResultsSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummarySocialHistorySection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummarySocialHistorySection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummarySocialHistorySection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Social History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummarySocialHistorySection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummarySocialHistorySection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_SOCIAL_HISTORY_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummarySocialHistorySection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryVitalSignsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Vital Signs Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryVitalSignsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryVitalSignsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Vital Signs Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryVitalSignsSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryVitalSignsSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_VITAL_SIGNS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryVitalSignsSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryMentalStatusSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Mental Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryMentalStatusSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryMentalStatusSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Mental Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryMentalStatusSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryMentalStatusSection(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_MENTAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryMentalStatusSection"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryGeneralStatusSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryGeneralStatusSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryGeneralStatusSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryGeneralStatusSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryGeneralStatusSection(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_GENERAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryGeneralStatusSection"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryReviewOfSystemsSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryReviewOfSystemsSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryReviewOfSystemsSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryReviewOfSystemsSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryReviewOfSystemsSection(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryReviewOfSystemsSection"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryNutritionSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryNutritionSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryNutritionSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Nutrition Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryNutritionSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryNutritionSection(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_NUTRITION_SECTION,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryNutritionSection"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryReasonForReferralSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Reason For Referral Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryReasonForReferralSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryReasonForReferralSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Reason For Referral Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryReasonForReferralSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryReasonForReferralSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_REASON_FOR_REFERRAL_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryReasonForReferralSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryHistoryOfPastIllnessSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary History Of Past Illness Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryHistoryOfPastIllnessSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryHistoryOfPastIllnessSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary History Of Past Illness Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryHistoryOfPastIllnessSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryHistoryOfPastIllnessSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryHistoryOfPastIllnessSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryHistoryOfPresentIllnessSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryHistoryOfPresentIllnessSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryHistoryOfPresentIllnessSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary History Of Present Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryHistoryOfPresentIllnessSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryHistoryOfPresentIllnessSection(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryHistoryOfPresentIllnessSection"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryAssessmentAndPlanSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Assessment And Plan Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAssessmentAndPlanSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryAssessmentAndPlanSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Assessment And Plan Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAssessmentAndPlanSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryAssessmentAndPlanSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_ASSESSMENT_AND_PLAN_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryAssessmentAndPlanSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryAssessmentSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAssessmentSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryAssessmentSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Assessment Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAssessmentSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryAssessmentSection(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_ASSESSMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryAssessmentSection"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDischargeDiagnosisSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Discharge Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDischargeDiagnosisSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDischargeDiagnosisSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Discharge Diagnosis Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDischargeDiagnosisSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryDischargeDiagnosisSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDischargeDiagnosisSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Admission Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Admission Medications Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryAdmissionMedicationsSectionEntriesOptional2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryAdmissionDiagnosisSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Admission Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAdmissionDiagnosisSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionDiagnosisSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryAdmissionDiagnosisSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Admission Diagnosis Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryAdmissionDiagnosisSection2(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryAdmissionDiagnosisSection2(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_TRANSFER_SUMMARY_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_ADMISSION_DIAGNOSIS_SECTION2,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryAdmissionDiagnosisSection2"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryCourseOfCareSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Course Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCourseOfCareSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_COURSE_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CourseOfCareSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryCourseOfCareSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Course Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryCourseOfCareSection(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_TRANSFER_SUMMARY_COURSE_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateTransferSummaryCourseOfCareSection(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_COURSE_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_TRANSFER_SUMMARY_COURSE_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TRANSFER_SUMMARY_COURSE_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_TRANSFER_SUMMARY_COURSE_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_COURSE_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryCourseOfCareSection"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntityClassCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(not classCode.oclIsUndefined() and classCode.oclIsKindOf(vocab::RoleClassAssociative) and "
			+ "let value : vocab::RoleClassAssociative = classCode.oclAsType(vocab::RoleClassAssociative) in "
			+ "value = vocab::RoleClassAssociative::PRS or value = vocab::RoleClassAssociative::NOK or value = vocab::RoleClassAssociative::CAREGIVER or value = vocab::RoleClassAssociative::AGNT or value = vocab::RoleClassAssociative::GUAR or value = vocab::RoleClassAssociative::ECON)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryParticipantSupportAssociatedEntityClassCodeP");
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
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(typeCode=vocab::ParticipationType::IND)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportTypeCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantSupportAssociatedEntity(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantSupportAssociatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null).associatedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(classCode=vocab::RoleClassAssociative::ASSIGNED)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityId(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityAddr"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityTelecom"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null).associatedEntity->excluding(null)->reject(scopingOrganization->one(scopingOrganization : cda::Organization | not scopingOrganization.oclIsUndefined() and scopingOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactTypeCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->reject(associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryParticipantCallbackContactAssociatedEntity(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryParticipantCallbackContactAssociatedEntity(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryParticipantCallbackContactAssociatedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject(typeCode=vocab::x_ServiceEventPerformer::PRF)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventPerformerTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP"),
						new Object[] { eObject }));
				}

				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put(
							"org.openhealthtools.mdht.uml.cda.consol.TransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP",
							passToken);
					}
					passToken.addAll(oclResultSet);
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null).performer->excluding(null)->reject((functionCode.oclIsUndefined() or functionCode.isNullFlavorUndefined()) implies (not functionCode.oclIsUndefined() and functionCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = functionCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.101' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Function Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(
			TransferSummary transferSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			Object passFilter = (context == null)
					? null
					: context.get("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP");
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
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventPerformerFunctionCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(isDefined('classCode') and classCode=vocab::ActClassRoot::PCPR)";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventClassCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventCode(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null).serviceEvent->excluding(null)->reject(performer->exists(performer : cda::Performer1 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer1)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEventPerformer1(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEventPerformer1"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->excluding(null)->reject(serviceEvent->one(serviceEvent : cda::ServiceEvent | not serviceEvent.oclIsUndefined() and serviceEvent.oclIsKindOf(cda::ServiceEvent)))";

	/**
	 * The cached OCL invariant for the '{@link #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateTransferSummaryDocumentationOfServiceEvent(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateTransferSummaryDocumentationOfServiceEvent(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(transferSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.TRANSFER_SUMMARY__TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT,
						ConsolPlugin.INSTANCE.getString("TransferSummaryTransferSummaryDocumentationOfServiceEvent"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectivesSection2(TransferSummary) <em>Get Advance Directives Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdvanceDirectivesSection2))->asSequence()->any(true).oclAsType(consol::AdvanceDirectivesSection2)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectivesSection2(TransferSummary) <em>Get Advance Directives Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectivesSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdvanceDirectivesSection2 getAdvanceDirectivesSection2(TransferSummary transferSummary) {
		if (GET_ADVANCE_DIRECTIVES_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(299));
			try {
				GET_ADVANCE_DIRECTIVES_SECTION2__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES_SECTION2__EOCL_QRY);
		return (AdvanceDirectivesSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection2(TransferSummary) <em>Get Allergies Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection2))->asSequence()->any(true).oclAsType(consol::AllergiesSection2)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection2(TransferSummary) <em>Get Allergies Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AllergiesSection2 getAllergiesSection2(TransferSummary transferSummary) {
		if (GET_ALLERGIES_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(300));
			try {
				GET_ALLERGIES_SECTION2__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION2__EOCL_QRY);
		return (AllergiesSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExamSection2(TransferSummary) <em>Get Physical Exam Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAM_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection2))->asSequence()->any(true).oclAsType(consol::PhysicalExamSection2)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExamSection2(TransferSummary) <em>Get Physical Exam Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExamSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PhysicalExamSection2 getPhysicalExamSection2(TransferSummary transferSummary) {
		if (GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(301));
			try {
				GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION2__EOCL_QRY);
		return (PhysicalExamSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEncountersSection2(TransferSummary) <em>Get Encounters Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENCOUNTERS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::EncountersSection2))->asSequence()->any(true).oclAsType(consol::EncountersSection2)";

	/**
	 * The cached OCL query for the '{@link #getEncountersSection2(TransferSummary) <em>Get Encounters Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncountersSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENCOUNTERS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EncountersSection2 getEncountersSection2(TransferSummary transferSummary) {
		if (GET_ENCOUNTERS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(302));
			try {
				GET_ENCOUNTERS_SECTION2__EOCL_QRY = helper.createQuery(GET_ENCOUNTERS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENCOUNTERS_SECTION2__EOCL_QRY);
		return (EncountersSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(TransferSummary) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(TransferSummary) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySection getFamilyHistorySection(TransferSummary transferSummary) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(303));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection2(TransferSummary) <em>Get Functional Status Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection2)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection2(TransferSummary) <em>Get Functional Status Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FunctionalStatusSection2 getFunctionalStatusSection2(TransferSummary transferSummary) {
		if (GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(304));
			try {
				GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY);
		return (FunctionalStatusSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional2(TransferSummary) <em>Get Immunizations Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ImmunizationsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional2(TransferSummary) <em>Get Immunizations Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional2(TransferSummary)
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
			TransferSummary transferSummary) {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(305));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipmentSection2(TransferSummary) <em>Get Medical Equipment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalEquipmentSection2))->asSequence()->any(true).oclAsType(consol::MedicalEquipmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipmentSection2(TransferSummary) <em>Get Medical Equipment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipmentSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicalEquipmentSection2 getMedicalEquipmentSection2(TransferSummary transferSummary) {
		if (GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(306));
			try {
				GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT_SECTION2__EOCL_QRY);
		return (MedicalEquipmentSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection2(TransferSummary) <em>Get Medications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSection2))->asSequence()->any(true).oclAsType(consol::MedicationsSection2)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection2(TransferSummary) <em>Get Medications Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MedicationsSection2 getMedicationsSection2(TransferSummary transferSummary) {
		if (GET_MEDICATIONS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(307));
			try {
				GET_MEDICATIONS_SECTION2__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION2__EOCL_QRY);
		return (MedicationsSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayersSection2(TransferSummary) <em>Get Payers Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYERS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PayersSection2))->asSequence()->any(true).oclAsType(consol::PayersSection2)";

	/**
	 * The cached OCL query for the '{@link #getPayersSection2(TransferSummary) <em>Get Payers Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayersSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYERS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PayersSection2 getPayersSection2(TransferSummary transferSummary) {
		if (GET_PAYERS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(308));
			try {
				GET_PAYERS_SECTION2__EOCL_QRY = helper.createQuery(GET_PAYERS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYERS_SECTION2__EOCL_QRY);
		return (PayersSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfTreatmentSection2(TransferSummary) <em>Get Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))->asSequence()->any(true).oclAsType(consol::PlanOfTreatmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfTreatmentSection2(TransferSummary) <em>Get Plan Of Treatment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfTreatmentSection2 getPlanOfTreatmentSection2(TransferSummary transferSummary) {
		if (GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(309));
			try {
				GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY);
		return (PlanOfTreatmentSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection2(TransferSummary) <em>Get Problem Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection2))->asSequence()->any(true).oclAsType(consol::ProblemSection2)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection2(TransferSummary) <em>Get Problem Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProblemSection2 getProblemSection2(TransferSummary transferSummary) {
		if (GET_PROBLEM_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(310));
			try {
				GET_PROBLEM_SECTION2__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION2__EOCL_QRY);
		return (ProblemSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection2(TransferSummary) <em>Get Procedures Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSection2))->asSequence()->any(true).oclAsType(consol::ProceduresSection2)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection2(TransferSummary) <em>Get Procedures Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ProceduresSection2 getProceduresSection2(TransferSummary transferSummary) {
		if (GET_PROCEDURES_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(311));
			try {
				GET_PROCEDURES_SECTION2__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION2__EOCL_QRY);
		return (ProceduresSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection2(TransferSummary) <em>Get Results Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ResultsSection2))->asSequence()->any(true).oclAsType(consol::ResultsSection2)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection2(TransferSummary) <em>Get Results Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ResultsSection2 getResultsSection2(TransferSummary transferSummary) {
		if (GET_RESULTS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(312));
			try {
				GET_RESULTS_SECTION2__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION2__EOCL_QRY);
		return (ResultsSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection2(TransferSummary) <em>Get Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))->asSequence()->any(true).oclAsType(consol::SocialHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection2(TransferSummary) <em>Get Social History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SocialHistorySection2 getSocialHistorySection2(TransferSummary transferSummary) {
		if (GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(313));
			try {
				GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY);
		return (SocialHistorySection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection2(TransferSummary) <em>Get Vital Signs Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSection2))->asSequence()->any(true).oclAsType(consol::VitalSignsSection2)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection2(TransferSummary) <em>Get Vital Signs Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static VitalSignsSection2 getVitalSignsSection2(TransferSummary transferSummary) {
		if (GET_VITAL_SIGNS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(314));
			try {
				GET_VITAL_SIGNS_SECTION2__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION2__EOCL_QRY);
		return (VitalSignsSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMentalStatusSection(TransferSummary) <em>Get Mental Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENTAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MentalStatusSection))->asSequence()->any(true).oclAsType(consol::MentalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getMentalStatusSection(TransferSummary) <em>Get Mental Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMentalStatusSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENTAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MentalStatusSection getMentalStatusSection(TransferSummary transferSummary) {
		if (GET_MENTAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(315));
			try {
				GET_MENTAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_MENTAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENTAL_STATUS_SECTION__EOCL_QRY);
		return (MentalStatusSection) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(TransferSummary) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::GeneralStatusSection))->asSequence()->any(true).oclAsType(consol::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(TransferSummary) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static GeneralStatusSection getGeneralStatusSection(TransferSummary transferSummary) {
		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(316));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(TransferSummary) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(TransferSummary) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReviewOfSystemsSection getReviewOfSystemsSection(TransferSummary transferSummary) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(317));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionSection(TransferSummary) <em>Get Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))->asSequence()->any(true).oclAsType(consol::NutritionSection)";

	/**
	 * The cached OCL query for the '{@link #getNutritionSection(TransferSummary) <em>Get Nutrition Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NutritionSection getNutritionSection(TransferSummary transferSummary) {
		if (GET_NUTRITION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(318));
			try {
				GET_NUTRITION_SECTION__EOCL_QRY = helper.createQuery(GET_NUTRITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUTRITION_SECTION__EOCL_QRY);
		return (NutritionSection) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForReferralSection2(TransferSummary) <em>Get Reason For Referral Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_REFERRAL_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForReferralSection2))->asSequence()->any(true).oclAsType(consol::ReasonForReferralSection2)";

	/**
	 * The cached OCL query for the '{@link #getReasonForReferralSection2(TransferSummary) <em>Get Reason For Referral Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForReferralSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_REFERRAL_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReasonForReferralSection2 getReasonForReferralSection2(TransferSummary transferSummary) {
		if (GET_REASON_FOR_REFERRAL_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(319));
			try {
				GET_REASON_FOR_REFERRAL_SECTION2__EOCL_QRY = helper.createQuery(GET_REASON_FOR_REFERRAL_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_REFERRAL_SECTION2__EOCL_QRY);
		return (ReasonForReferralSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection2(TransferSummary) <em>Get History Of Past Illness Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection2)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection2(TransferSummary) <em>Get History Of Past Illness Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2(TransferSummary transferSummary) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(320));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY);
		return (HistoryOfPastIllnessSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(TransferSummary) <em>Get History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPresentIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(TransferSummary) <em>Get History Of Present Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(TransferSummary transferSummary) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(321));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection2(TransferSummary) <em>Get Assessment And Plan Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection2))->asSequence()->any(true).oclAsType(consol::AssessmentAndPlanSection2)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection2(TransferSummary) <em>Get Assessment And Plan Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentAndPlanSection2 getAssessmentAndPlanSection2(TransferSummary transferSummary) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(322));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION2__EOCL_QRY);
		return (AssessmentAndPlanSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(TransferSummary) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->any(true).oclAsType(consol::AssessmentSection)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(TransferSummary) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AssessmentSection getAssessmentSection(TransferSummary transferSummary) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(323));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDiagnosisSection2(TransferSummary) <em>Get Discharge Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosisSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection2))->asSequence()->any(true).oclAsType(consol::DischargeDiagnosisSection2)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDiagnosisSection2(TransferSummary) <em>Get Discharge Diagnosis Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosisSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DischargeDiagnosisSection2 getDischargeDiagnosisSection2(TransferSummary transferSummary) {
		if (GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(324));
			try {
				GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_QRY);
		return (DischargeDiagnosisSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdmissionMedicationsSectionEntriesOptional2(TransferSummary) <em>Get Admission Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionMedicationsSectionEntriesOptional2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::AdmissionMedicationsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getAdmissionMedicationsSectionEntriesOptional2(TransferSummary) <em>Get Admission Medications Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionMedicationsSectionEntriesOptional2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdmissionMedicationsSectionEntriesOptional2 getAdmissionMedicationsSectionEntriesOptional2(
			TransferSummary transferSummary) {
		if (GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(325));
			try {
				GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (AdmissionMedicationsSectionEntriesOptional2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdmissionDiagnosisSection2(TransferSummary) <em>Get Admission Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionDiagnosisSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionDiagnosisSection2))->asSequence()->any(true).oclAsType(consol::AdmissionDiagnosisSection2)";

	/**
	 * The cached OCL query for the '{@link #getAdmissionDiagnosisSection2(TransferSummary) <em>Get Admission Diagnosis Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionDiagnosisSection2(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdmissionDiagnosisSection2 getAdmissionDiagnosisSection2(TransferSummary transferSummary) {
		if (GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(326));
			try {
				GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_QRY = helper.createQuery(GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_QRY);
		return (AdmissionDiagnosisSection2) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCourseOfCareSection(TransferSummary) <em>Get Course Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseOfCareSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COURSE_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::CourseOfCareSection))->asSequence()->any(true).oclAsType(consol::CourseOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getCourseOfCareSection(TransferSummary) <em>Get Course Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseOfCareSection(TransferSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COURSE_OF_CARE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static CourseOfCareSection getCourseOfCareSection(TransferSummary transferSummary) {
		if (GET_COURSE_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.TRANSFER_SUMMARY,
				ConsolPackage.Literals.TRANSFER_SUMMARY.getEAllOperations().get(327));
			try {
				GET_COURSE_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_COURSE_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COURSE_OF_CARE_SECTION__EOCL_QRY);
		return (CourseOfCareSection) query.evaluate(transferSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(TransferSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param transferSummary The receiving '<em><b>Transfer Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateGeneralHeaderConstraintsTemplateId(TransferSummary transferSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.TRANSFER_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			transferSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.TRANSFER_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("TransferSummaryGeneralHeaderConstraintsTemplateId"),
					new Object[] { transferSummary }));
			}

			return false;
		}
		return true;
	}

} // TransferSummaryOperations
