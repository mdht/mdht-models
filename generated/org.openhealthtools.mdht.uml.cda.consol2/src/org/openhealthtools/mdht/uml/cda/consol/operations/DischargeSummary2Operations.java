/*******************************************************************************
 * Copyright (c) 2015 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *     								 - modified VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP
 *     								 as it required the use of select instead of reject
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2AllergiesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2HospitalCourseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2NutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2FunctionalStatusSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2HistoryOfPastIllnessSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2HistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2HospitalConsultationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Consultations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2HospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2HospitalDischargePhysicalSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2HospitalDischargeStudiesSummarySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ImmunizationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Immunizations Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ProblemSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Problem Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ProceduresSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2SocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2VitalSignsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Vital Signs Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2DischargeDiagnosisSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2FamilyHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2AdmissionDiagnosisSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Admission Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Admission Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2DischargeMedicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2DischargeDietSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant If Par Type Code IND Then AE Class Code IND</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateDischargeSummary2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getAllergiesSectionEntriesOptional2() <em>Get Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getHospitalCourseSection() <em>Get Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getFunctionalStatusSection2() <em>Get Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getHistoryOfPastIllnessSection2() <em>Get History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getHospitalConsultationsSection() <em>Get Hospital Consultations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getHospitalDischargePhysicalSection() <em>Get Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getHospitalDischargeStudiesSummarySection() <em>Get Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getImmunizationsSectionEntriesOptional2() <em>Get Immunizations Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getProblemSectionEntriesOptional2() <em>Get Problem Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getProceduresSectionEntriesOptional2() <em>Get Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getVitalSignsSectionEntriesOptional2() <em>Get Vital Signs Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getDischargeDiagnosisSection2() <em>Get Discharge Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getDischargeMedicationsSectionEntriesOptional2() <em>Get Discharge Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getFamilyHistorySection2() <em>Get Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getAdmissionDiagnosisSection2() <em>Get Admission Diagnosis Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getAdmissionMedicationsSectionEntriesOptional2() <em>Get Admission Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getDischargeMedicationsSection2() <em>Get Discharge Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#getDischargeDietSection() <em>Get Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateUSRealmHeader2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummary2Operations extends USRealmHeader2Operations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummary2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "( self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection)) ) implies not ( self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection)) )";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DischargeSummary2DischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			"ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2CodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2CodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2CodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2CodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2CodeP(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2CodeP", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_CODE_P,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2CodeP"),
						new Object[] { dischargeSummary2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get(
					"org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2CodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2CodeP", passToken);
				}
				passToken.add(dischargeSummary2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2Code(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Code(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '18842-5' or value.code = '11490-0' or value.code = '28655-9' or value.code = '29761-4' or value.code = '34745-0' or value.code = '34105-7' or value.code = '34106-5'))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2Code(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Code(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2Code(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2CodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dischargeSummary2)) {
			// I have a free pass to short-circuit
			return true;
		}

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2Code", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_CODE,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2Code"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2Participant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Participant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2Participant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2Participant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2Participant(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2Participant", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2Participant"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOf(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOf(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOf(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOf(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ComponentOf(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2ComponentOf", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ComponentOf"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2AllergiesSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Allergies Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2AllergiesSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2AllergiesSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Allergies Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2AllergiesSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2AllergiesSectionEntriesOptional2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2AllergiesSectionEntriesOptional2", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2AllergiesSectionEntriesOptional2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2HospitalCourseSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Course Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalCourseSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2HospitalCourseSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Course Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalCourseSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2HospitalCourseSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2HospitalCourseSection", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_HOSPITAL_COURSE_SECTION,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2HospitalCourseSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2PlanOfTreatmentSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2PlanOfTreatmentSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2PlanOfTreatmentSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Plan Of Treatment Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2PlanOfTreatmentSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2PlanOfTreatmentSection2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2PlanOfTreatmentSection2", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_PLAN_OF_TREATMENT_SECTION2,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2PlanOfTreatmentSection2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ChiefComplaintSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ChiefComplaintSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ChiefComplaintSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Chief Complaint Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ChiefComplaintSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ChiefComplaintSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2ChiefComplaintSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_SECTION,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ChiefComplaintSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Chief Complaint And Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ChiefComplaintAndReasonForVisitSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2ChiefComplaintAndReasonForVisitSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2NutritionSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2NutritionSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2NutritionSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Nutrition Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2NutritionSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2NutritionSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2NutritionSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_NUTRITION_SECTION,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2NutritionSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2FunctionalStatusSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Functional Status Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2FunctionalStatusSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2FunctionalStatusSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Functional Status Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2FunctionalStatusSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2FunctionalStatusSection2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2FunctionalStatusSection2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_FUNCTIONAL_STATUS_SECTION2,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2FunctionalStatusSection2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2HistoryOfPastIllnessSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 History Of Past Illness Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HistoryOfPastIllnessSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2HistoryOfPastIllnessSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 History Of Past Illness Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HistoryOfPastIllnessSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2HistoryOfPastIllnessSection2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2HistoryOfPastIllnessSection2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_HISTORY_OF_PAST_ILLNESS_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2HistoryOfPastIllnessSection2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2HistoryOfPresentIllnessSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HistoryOfPresentIllnessSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2HistoryOfPresentIllnessSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 History Of Present Illness Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HistoryOfPresentIllnessSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2HistoryOfPresentIllnessSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2HistoryOfPresentIllnessSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_HISTORY_OF_PRESENT_ILLNESS_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2HistoryOfPresentIllnessSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2HospitalConsultationsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Consultations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalConsultationsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalConsultationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2HospitalConsultationsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Consultations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalConsultationsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2HospitalConsultationsSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2HospitalConsultationsSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_HOSPITAL_CONSULTATIONS_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2HospitalConsultationsSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2HospitalDischargeInstructionsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Instructions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalDischargeInstructionsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2HospitalDischargeInstructionsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Instructions Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalDischargeInstructionsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2HospitalDischargeInstructionsSection(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2HospitalDischargeInstructionsSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2HospitalDischargeInstructionsSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2HospitalDischargePhysicalSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Physical Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalDischargePhysicalSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2HospitalDischargePhysicalSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Physical Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalDischargePhysicalSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2HospitalDischargePhysicalSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2HospitalDischargePhysicalSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_PHYSICAL_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2HospitalDischargePhysicalSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2HospitalDischargeStudiesSummarySection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Studies Summary Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalDischargeStudiesSummarySection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2HospitalDischargeStudiesSummarySection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Hospital Discharge Studies Summary Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2HospitalDischargeStudiesSummarySection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2HospitalDischargeStudiesSummarySection(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2HospitalDischargeStudiesSummarySection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2HospitalDischargeStudiesSummarySection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ImmunizationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Immunizations Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ImmunizationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ImmunizationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Immunizations Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ImmunizationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ImmunizationsSectionEntriesOptional2(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ImmunizationsSectionEntriesOptional2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2ImmunizationsSectionEntriesOptional2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ProblemSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Problem Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ProblemSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ProblemSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Problem Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ProblemSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ProblemSectionEntriesOptional2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2ProblemSectionEntriesOptional2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_PROBLEM_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2ProblemSectionEntriesOptional2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ProceduresSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Procedures Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ProceduresSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ProceduresSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Procedures Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ProceduresSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ProceduresSectionEntriesOptional2(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2ProceduresSectionEntriesOptional2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2ProceduresSectionEntriesOptional2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ReasonForVisitSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ReasonForVisitSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ReasonForVisitSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Reason For Visit Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ReasonForVisitSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ReasonForVisitSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2ReasonForVisitSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_REASON_FOR_VISIT_SECTION,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ReasonForVisitSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ReviewOfSystemsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ReviewOfSystemsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ReviewOfSystemsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Review Of Systems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ReviewOfSystemsSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2ReviewOfSystemsSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2ReviewOfSystemsSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_REVIEW_OF_SYSTEMS_SECTION,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2ReviewOfSystemsSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2SocialHistorySection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2SocialHistorySection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2SocialHistorySection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Social History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2SocialHistorySection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2SocialHistorySection2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2SocialHistorySection2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_SOCIAL_HISTORY_SECTION2,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2SocialHistorySection2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2VitalSignsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Vital Signs Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2VitalSignsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2VitalSignsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Vital Signs Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2VitalSignsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2VitalSignsSectionEntriesOptional2(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2VitalSignsSectionEntriesOptional2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2VitalSignsSectionEntriesOptional2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2DischargeDiagnosisSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DischargeDiagnosisSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2DischargeDiagnosisSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Diagnosis Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DischargeDiagnosisSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2DischargeDiagnosisSection2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2DischargeDiagnosisSection2", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_DISCHARGE_DIAGNOSIS_SECTION2,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2DischargeDiagnosisSection2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeMedicationsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Medications Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2DischargeMedicationsSectionEntriesOptional2", "WARNING");

		if (VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2DischargeMedicationsSectionEntriesOptional2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2FamilyHistorySection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Family History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2FamilyHistorySection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2FamilyHistorySection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Family History Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2FamilyHistorySection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2FamilyHistorySection2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2FamilyHistorySection2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_FAMILY_HISTORY_SECTION2,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2FamilyHistorySection2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2AdmissionDiagnosisSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Admission Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2AdmissionDiagnosisSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionDiagnosisSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2AdmissionDiagnosisSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Admission Diagnosis Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2AdmissionDiagnosisSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2AdmissionDiagnosisSection2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2AdmissionDiagnosisSection2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_ADMISSION_DIAGNOSIS_SECTION2,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2AdmissionDiagnosisSection2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Admission Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationsSectionEntriesOptional2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Admission Medications Section Entries Optional2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2AdmissionMedicationsSectionEntriesOptional2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2AdmissionMedicationsSectionEntriesOptional2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2DischargeMedicationsSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Medications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DischargeMedicationsSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeMedicationsSection2))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2DischargeMedicationsSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Medications Section2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DischargeMedicationsSection2(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2DischargeMedicationsSection2(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2DischargeMedicationsSection2", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION2,
						ConsolPlugin.INSTANCE.getString(
							"DischargeSummary2DischargeSummary2DischargeMedicationsSection2"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2DischargeDietSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Diet Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DischargeDietSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2DischargeDietSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Discharge Diet Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2DischargeDietSection(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateDischargeSummary2DischargeDietSection(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2DischargeDietSection", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_DISCHARGE_DIET_SECTION,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2DischargeSummary2DischargeDietSection"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant If Par Type Code IND Then AE Class Code IND</em>}' operation.
	 * Note: OCL was modified post-generation as it required the use of select instead of reject.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select( p : cda::Participant1 | p.typeCode = vocab::ParticipationType::IND and not ( p.associatedEntity.classCode = vocab::RoleClassAssociative::PRS  or p.associatedEntity.classCode = vocab::RoleClassAssociative::NOK or p.associatedEntity.classCode = vocab::RoleClassAssociative::CAREGIVER or p.associatedEntity.classCode = vocab::RoleClassAssociative::AGNT or p.associatedEntity.classCode = vocab::RoleClassAssociative::GUAR or p.associatedEntity.classCode = vocab::RoleClassAssociative::ECON or p.associatedEntity.isNullFlavorDefined() ) or p.associatedEntity.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Participant If Par Type Code IND Then AE Class Code IND</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((low.oclIsUndefined() or low.isNullFlavorUndefined()) implies (not low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterIVLTSLow", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterIVLTSLow"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).effectiveTime->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies ((high.oclIsUndefined() or high.isNullFlavorUndefined()) implies (not high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter IVLTS High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson",
			"WARNING");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization",
			"WARNING");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization",
			"ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity",
			"ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null).assignedEntity->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson",
			"WARNING");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null).assignedEntity->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization",
			"WARNING");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context,
			"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization",
			"ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->one(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(cda::AssignedEntity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			"ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEffectiveTime", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEffectiveTime"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined()) implies (not dischargeDispositionCode.oclIsUndefined() and dischargeDispositionCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = dischargeDispositionCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.301.5' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode",
			"WARNING");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined()) implies (not dischargeDispositionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Discharge Disposition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP",
			"ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(
			DischargeSummary2 dischargeSummary2, DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(
			context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsibleParty", "INFO");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounterResponsibleParty"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary2 Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Query<?, ?, ?>> VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal<Query<?, ?, ?>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummary2ComponentOfEncompassingEncounter(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounter", "ERROR");

		if (VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(
					VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(
					EOCL_ENV.get().createQuery(oclExpression));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		Object oclResult = VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(
			dischargeSummary2);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(
						new BasicDiagnostic(
							Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
							ConsolValidator.DISCHARGE_SUMMARY2__DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
							ConsolPlugin.INSTANCE.getString(
								"DischargeSummary2DischargeSummary2ComponentOfEncompassingEncounter"),
							new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional2(DischargeSummary2) <em>Get Allergies Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional2(DischargeSummary2) <em>Get Allergies Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSectionEntriesOptional2(DischargeSummary2)
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
			DischargeSummary2 dischargeSummary2) {

		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(440));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (AllergiesSectionEntriesOptional2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalCourseSection(DischargeSummary2) <em>Get Hospital Course Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalCourseSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_COURSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))->asSequence()->any(true).oclAsType(consol::HospitalCourseSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalCourseSection(DischargeSummary2) <em>Get Hospital Course Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalCourseSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_COURSE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HospitalCourseSection getHospitalCourseSection(DischargeSummary2 dischargeSummary2) {

		if (GET_HOSPITAL_COURSE_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(441));
			try {
				GET_HOSPITAL_COURSE_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_QRY);
		return (HospitalCourseSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfTreatmentSection2(DischargeSummary2) <em>Get Plan Of Treatment Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfTreatmentSection2))->asSequence()->any(true).oclAsType(consol::PlanOfTreatmentSection2)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfTreatmentSection2(DischargeSummary2) <em>Get Plan Of Treatment Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfTreatmentSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static PlanOfTreatmentSection2 getPlanOfTreatmentSection2(DischargeSummary2 dischargeSummary2) {

		if (GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(442));
			try {
				GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY = helper.createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLAN_OF_TREATMENT_SECTION2__EOCL_QRY);
		return (PlanOfTreatmentSection2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(DischargeSummary2) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(DischargeSummary2) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ChiefComplaintSection getChiefComplaintSection(DischargeSummary2 dischargeSummary2) {

		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(443));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(DischargeSummary2) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(DischargeSummary2) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintAndReasonForVisitSection(DischargeSummary2)
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
			DischargeSummary2 dischargeSummary2) {

		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(444));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(
					GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNutritionSection(DischargeSummary2) <em>Get Nutrition Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUTRITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::NutritionSection))->asSequence()->any(true).oclAsType(consol::NutritionSection)";

	/**
	 * The cached OCL query for the '{@link #getNutritionSection(DischargeSummary2) <em>Get Nutrition Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUTRITION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NutritionSection getNutritionSection(DischargeSummary2 dischargeSummary2) {

		if (GET_NUTRITION_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(445));
			try {
				GET_NUTRITION_SECTION__EOCL_QRY = helper.createQuery(GET_NUTRITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUTRITION_SECTION__EOCL_QRY);
		return (NutritionSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatusSection2(DischargeSummary2) <em>Get Functional Status Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection2))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection2)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatusSection2(DischargeSummary2) <em>Get Functional Status Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatusSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FunctionalStatusSection2 getFunctionalStatusSection2(DischargeSummary2 dischargeSummary2) {

		if (GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(446));
			try {
				GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FUNCTIONAL_STATUS_SECTION2__EOCL_QRY);
		return (FunctionalStatusSection2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection2(DischargeSummary2) <em>Get History Of Past Illness Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection2))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection2)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPastIllnessSection2(DischargeSummary2) <em>Get History Of Past Illness Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPastIllnessSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2(DischargeSummary2 dischargeSummary2) {

		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(447));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY = helper.createQuery(
					GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION2__EOCL_QRY);
		return (HistoryOfPastIllnessSection2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(DischargeSummary2) <em>Get History Of Present Illness Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPresentIllnessSection)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(DischargeSummary2) <em>Get History Of Present Illness Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllnessSection(DischargeSummary2)
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
			DischargeSummary2 dischargeSummary2) {

		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(448));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(
					GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalConsultationsSection(DischargeSummary2) <em>Get Hospital Consultations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalConsultationsSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalConsultationsSection))->asSequence()->any(true).oclAsType(consol::HospitalConsultationsSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalConsultationsSection(DischargeSummary2) <em>Get Hospital Consultations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalConsultationsSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HospitalConsultationsSection getHospitalConsultationsSection(DischargeSummary2 dischargeSummary2) {

		if (GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(449));
			try {
				GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_QRY = helper.createQuery(
					GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_QRY);
		return (HospitalConsultationsSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeInstructionsSection(DischargeSummary2) <em>Get Hospital Discharge Instructions Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeInstructionsSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeInstructionsSection(DischargeSummary2) <em>Get Hospital Discharge Instructions Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeInstructionsSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection(
			DischargeSummary2 dischargeSummary2) {

		if (GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(450));
			try {
				GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(
					GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeInstructionsSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargePhysicalSection(DischargeSummary2) <em>Get Hospital Discharge Physical Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargePhysicalSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargePhysicalSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargePhysicalSection(DischargeSummary2) <em>Get Hospital Discharge Physical Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargePhysicalSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HospitalDischargePhysicalSection getHospitalDischargePhysicalSection(
			DischargeSummary2 dischargeSummary2) {

		if (GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(451));
			try {
				GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY = helper.createQuery(
					GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY);
		return (HospitalDischargePhysicalSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeStudiesSummarySection(DischargeSummary2) <em>Get Hospital Discharge Studies Summary Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeStudiesSummarySection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeStudiesSummarySection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeStudiesSummarySection(DischargeSummary2) <em>Get Hospital Discharge Studies Summary Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeStudiesSummarySection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HospitalDischargeStudiesSummarySection getHospitalDischargeStudiesSummarySection(
			DischargeSummary2 dischargeSummary2) {

		if (GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(452));
			try {
				GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY = helper.createQuery(
					GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY);
		return (HospitalDischargeStudiesSummarySection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional2(DischargeSummary2) <em>Get Immunizations Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ImmunizationsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional2(DischargeSummary2) <em>Get Immunizations Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSectionEntriesOptional2(DischargeSummary2)
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
			DischargeSummary2 dischargeSummary2) {

		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(453));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional2(DischargeSummary2) <em>Get Problem Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ProblemSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getProblemSectionEntriesOptional2(DischargeSummary2) <em>Get Problem Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSectionEntriesOptional2(DischargeSummary2)
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
			DischargeSummary2 dischargeSummary2) {

		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(454));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ProblemSectionEntriesOptional2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional2(DischargeSummary2) <em>Get Procedures Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::ProceduresSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSectionEntriesOptional2(DischargeSummary2) <em>Get Procedures Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSectionEntriesOptional2(DischargeSummary2)
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
			DischargeSummary2 dischargeSummary2) {

		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(455));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (ProceduresSectionEntriesOptional2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReasonForVisitSection(DischargeSummary2) <em>Get Reason For Visit Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	 * The cached OCL query for the '{@link #getReasonForVisitSection(DischargeSummary2) <em>Get Reason For Visit Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForVisitSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReasonForVisitSection getReasonForVisitSection(DischargeSummary2 dischargeSummary2) {

		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(456));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(DischargeSummary2) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(DischargeSummary2) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static ReviewOfSystemsSection getReviewOfSystemsSection(DischargeSummary2 dischargeSummary2) {

		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(457));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection2(DischargeSummary2) <em>Get Social History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection2))->asSequence()->any(true).oclAsType(consol::SocialHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection2(DischargeSummary2) <em>Get Social History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static SocialHistorySection2 getSocialHistorySection2(DischargeSummary2 dischargeSummary2) {

		if (GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(458));
			try {
				GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_SOCIAL_HISTORY_SECTION2__EOCL_QRY);
		return (SocialHistorySection2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional2(DischargeSummary2) <em>Get Vital Signs Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional2(DischargeSummary2) <em>Get Vital Signs Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSectionEntriesOptional2(DischargeSummary2)
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
			DischargeSummary2 dischargeSummary2) {

		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(459));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDiagnosisSection2(DischargeSummary2) <em>Get Discharge Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosisSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDiagnosisSection2))->asSequence()->any(true).oclAsType(consol::DischargeDiagnosisSection2)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDiagnosisSection2(DischargeSummary2) <em>Get Discharge Diagnosis Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosisSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DischargeDiagnosisSection2 getDischargeDiagnosisSection2(DischargeSummary2 dischargeSummary2) {

		if (GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(460));
			try {
				GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_QRY = helper.createQuery(
					GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISCHARGE_DIAGNOSIS_SECTION2__EOCL_QRY);
		return (DischargeDiagnosisSection2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeMedicationsSectionEntriesOptional2(DischargeSummary2) <em>Get Discharge Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeMedicationsSectionEntriesOptional2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeMedicationsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::DischargeMedicationsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getDischargeMedicationsSectionEntriesOptional2(DischargeSummary2) <em>Get Discharge Medications Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeMedicationsSectionEntriesOptional2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DischargeMedicationsSectionEntriesOptional2 getDischargeMedicationsSectionEntriesOptional2(
			DischargeSummary2 dischargeSummary2) {

		if (GET_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(461));
			try {
				GET_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (DischargeMedicationsSectionEntriesOptional2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection2(DischargeSummary2) <em>Get Family History Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection2))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection2)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection2(DischargeSummary2) <em>Get Family History Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FamilyHistorySection2 getFamilyHistorySection2(DischargeSummary2 dischargeSummary2) {

		if (GET_FAMILY_HISTORY_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(462));
			try {
				GET_FAMILY_HISTORY_SECTION2__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FAMILY_HISTORY_SECTION2__EOCL_QRY);
		return (FamilyHistorySection2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdmissionDiagnosisSection2(DischargeSummary2) <em>Get Admission Diagnosis Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionDiagnosisSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionDiagnosisSection2))->asSequence()->any(true).oclAsType(consol::AdmissionDiagnosisSection2)";

	/**
	 * The cached OCL query for the '{@link #getAdmissionDiagnosisSection2(DischargeSummary2) <em>Get Admission Diagnosis Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionDiagnosisSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AdmissionDiagnosisSection2 getAdmissionDiagnosisSection2(DischargeSummary2 dischargeSummary2) {

		if (GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(463));
			try {
				GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_QRY = helper.createQuery(
					GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ADMISSION_DIAGNOSIS_SECTION2__EOCL_QRY);
		return (AdmissionDiagnosisSection2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdmissionMedicationsSectionEntriesOptional2(DischargeSummary2) <em>Get Admission Medications Section Entries Optional2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionMedicationsSectionEntriesOptional2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AdmissionMedicationsSectionEntriesOptional2))->asSequence()->any(true).oclAsType(consol::AdmissionMedicationsSectionEntriesOptional2)";

	/**
	 * The cached OCL query for the '{@link #getAdmissionMedicationsSectionEntriesOptional2(DischargeSummary2) <em>Get Admission Medications Section Entries Optional2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmissionMedicationsSectionEntriesOptional2(DischargeSummary2)
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
			DischargeSummary2 dischargeSummary2) {

		if (GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(464));
			try {
				GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY = helper.createQuery(
					GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__EOCL_QRY);
		return (AdmissionMedicationsSectionEntriesOptional2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeMedicationsSection2(DischargeSummary2) <em>Get Discharge Medications Section2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeMedicationsSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_MEDICATIONS_SECTION2__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeMedicationsSection2))->asSequence()->any(true).oclAsType(consol::DischargeMedicationsSection2)";

	/**
	 * The cached OCL query for the '{@link #getDischargeMedicationsSection2(DischargeSummary2) <em>Get Discharge Medications Section2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeMedicationsSection2(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_MEDICATIONS_SECTION2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DischargeMedicationsSection2 getDischargeMedicationsSection2(DischargeSummary2 dischargeSummary2) {

		if (GET_DISCHARGE_MEDICATIONS_SECTION2__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(465));
			try {
				GET_DISCHARGE_MEDICATIONS_SECTION2__EOCL_QRY = helper.createQuery(
					GET_DISCHARGE_MEDICATIONS_SECTION2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISCHARGE_MEDICATIONS_SECTION2__EOCL_QRY);
		return (DischargeMedicationsSection2) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDietSection(DischargeSummary2) <em>Get Discharge Diet Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDietSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIET_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection))->asSequence()->any(true).oclAsType(consol::DischargeDietSection)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDietSection(DischargeSummary2) <em>Get Discharge Diet Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDietSection(DischargeSummary2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIET_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static DischargeDietSection getDischargeDietSection(DischargeSummary2 dischargeSummary2) {

		if (GET_DISCHARGE_DIET_SECTION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY2,
				ConsolPackage.Literals.DISCHARGE_SUMMARY2.getEAllOperations().get(466));
			try {
				GET_DISCHARGE_DIET_SECTION__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIET_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_DISCHARGE_DIET_SECTION__EOCL_QRY);
		return (DischargeDietSection) query.evaluate(dischargeSummary2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeader2TemplateId(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.8' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeader2TemplateId(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeader2TemplateId(DischargeSummary2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary2 The receiving '<em><b>Discharge Summary2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeader2TemplateId(DischargeSummary2 dischargeSummary2,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "DischargeSummary2USRealmHeader2TemplateId", "ERROR");

		if (VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY2);
			try {
				VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(dischargeSummary2)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY2__US_REALM_HEADER2_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("DischargeSummary2USRealmHeader2TemplateId"),
						new Object[] { dischargeSummary2 }));
			}

			return false;
		}
		return true;
	}

} // DischargeSummary2Operations
