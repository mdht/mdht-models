/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalAdmissionDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryDischargeDietSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalCourseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalConsultationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Consultations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargePhysicalSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryHospitalDischargeStudiesSummarySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryImmunizationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryProblemSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryVitalSignsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateDischargeSummaryComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalAdmissionMedicationsSectionEntriesOptional() <em>Get Hospital Admission Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalAdmissionDiagnosisSection() <em>Get Hospital Admission Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeDiagnosisSection() <em>Get Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getDischargeDietSection() <em>Get Discharge Diet Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeMedicationsSectionEntriesOptional() <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalCourseSection() <em>Get Hospital Course Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalConsultationsSection() <em>Get Hospital Consultations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargePhysicalSection() <em>Get Hospital Discharge Physical Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getHospitalDischargeStudiesSummarySection() <em>Get Hospital Discharge Studies Summary Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#getVitalSignsSectionEntriesOptional() <em>Get Vital Signs Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryOperations extends GeneralHeaderConstraintsOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected DischargeSummaryOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code P</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code P</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryCodeP(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CODE_P,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryCodeP"), new Object[] { dischargeSummary }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeSummaryCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DischargeSummaryCodeP", passToken);
				}
				passToken.add(dischargeSummary);
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '18842-5' or value.code = '11490-0' or value.code = '28655-9' or value.code = '29761-4' or value.code = '34745-0' or value.code = '34105-7' or value.code = '34106-5'))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryCode(DischargeSummary dischargeSummary, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.DischargeSummaryCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(dischargeSummary)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CODE,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryCode"), new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Medications Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Medications Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Diagnosis Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Admission Diagnosis Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalAdmissionDiagnosisSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalAdmissionDiagnosisSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Diagnosis Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Diagnosis Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalDischargeDiagnosisSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargeDiagnosisSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryDischargeDietSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryDischargeDietSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryDischargeDietSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Discharge Diet Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryDischargeDietSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryDischargeDietSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_DISCHARGE_DIET_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryDischargeDietSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Medications Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Functional Status Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryFunctionalStatusSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryFunctionalStatusSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FUNCTIONAL_STATUS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryFunctionalStatusSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Present Illness Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHistoryOfPresentIllnessSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHistoryOfPresentIllnessSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Course Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalCourseSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalCourseSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_COURSE_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalCourseSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Plan Of Care Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryPlanOfCareSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryPlanOfCareSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PLAN_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryPlanOfCareSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Past Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary History Of Past Illness Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHistoryOfPastIllnessSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHistoryOfPastIllnessSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOf(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryComponentOf(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOf(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryComponentOf(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryComponentOf(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOf"), new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint And Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint And Reason For Visit Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryChiefComplaintAndReasonForVisitSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryChiefComplaintAndReasonForVisitSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryChiefComplaintSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryChiefComplaintSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryChiefComplaintSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Chief Complaint Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryChiefComplaintSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryChiefComplaintSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_CHIEF_COMPLAINT_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryChiefComplaintSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryFamilyHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Family History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryFamilyHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryFamilyHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Family History Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryFamilyHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryFamilyHistorySection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryFamilyHistorySection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalConsultationsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Consultations Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalConsultationsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalConsultationsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalConsultationsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Consultations Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalConsultationsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalConsultationsSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_CONSULTATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalConsultationsSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargeInstructionsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Instructions Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargeInstructionsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargeInstructionsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Instructions Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargeInstructionsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalDischargeInstructionsSection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargeInstructionsSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Physical Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Physical Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalDischargePhysicalSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_PHYSICAL_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargePhysicalSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Studies Summary Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Hospital Discharge Studies Summary Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryHospitalDischargeStudiesSummarySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryHospitalDischargeStudiesSummarySection(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryHospitalDischargeStudiesSummarySection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Immunizations Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Immunizations Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryImmunizationsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryImmunizationsSectionEntriesOptional(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryImmunizationsSectionEntriesOptional"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Problem Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryProblemSectionEntriesOptional(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROBLEM_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryProblemSectionEntriesOptional"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Procedures Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Procedures Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryProceduresSectionEntriesOptional(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_PROCEDURES_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryProceduresSectionEntriesOptional"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Reason For Visit Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryReasonForVisitSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryReasonForVisitSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryReasonForVisitSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Review Of Systems Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryReviewOfSystemsSection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryReviewOfSystemsSection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryReviewOfSystemsSection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummarySocialHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Social History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummarySocialHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummarySocialHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Social History Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummarySocialHistorySection(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummarySocialHistorySection(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("DischargeSummarySocialHistorySection"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Allergies Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryAllergiesSectionEntriesOptional(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryAllergiesSectionEntriesOptional"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Vital Signs Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateDischargeSummaryVitalSignsSectionEntriesOptional(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("DischargeSummaryVitalSignsSectionEntriesOptional"),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity Has Person Or Organization</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).responsibleParty->excluding(null)->reject(assignedEntity->exists(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity Has Person Or Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(not assignedEntity.assignedPerson.oclIsUndefined() or not assignedEntity.representedOrganization->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity Has Person Or Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->reject(assignedEntity->exists(assignedEntity : cda::AssignedEntity | not assignedEntity.oclIsUndefined() and assignedEntity.oclIsKindOf(rim::Role)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant Assigned Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.low.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(not effectiveTime.high.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined()) implies (not dischargeDispositionCode.oclIsUndefined() and dischargeDispositionCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = dischargeDispositionCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.12.112' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((dischargeDispositionCode.oclIsUndefined() or dischargeDispositionCode.isNullFlavorUndefined()) implies (not dischargeDispositionCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Discharge Disposition Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeP(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeP(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_DISCHARGE_DISPOSITION_CODE_P,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeP"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((effectiveTime.oclIsUndefined() or effectiveTime.isNullFlavorUndefined()) implies (not effectiveTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3EffectiveTime"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter3 Encounter Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(
			DischargeSummary dischargeSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Summary Component Of Encompassing Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Query<?, ?, ?> VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDischargeSummaryComponentOfEncompassingEncounter(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		Object oclResult = VALIDATE_DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(dischargeSummary);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.DISCHARGE_SUMMARY__DISCHARGE_SUMMARY_COMPONENT_OF_ENCOMPASSING_ENCOUNTER,
						ConsolPlugin.INSTANCE.getString("DischargeSummaryComponentOfEncompassingEncounter"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalAdmissionMedicationsSectionEntriesOptional(DischargeSummary) <em>Get Hospital Admission Medications Section Entries Optional</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalAdmissionMedicationsSectionEntriesOptional(DischargeSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionMedicationsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getHospitalAdmissionMedicationsSectionEntriesOptional(DischargeSummary) <em>Get Hospital Admission Medications Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalAdmissionMedicationsSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional(
			DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(332));
			try {
				GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (HospitalAdmissionMedicationsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHospitalAdmissionDiagnosisSection(DischargeSummary) <em>Get Hospital Admission Diagnosis Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalAdmissionDiagnosisSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalAdmissionDiagnosisSection))->asSequence()->any(true).oclAsType(consol::HospitalAdmissionDiagnosisSection)";

	/**
	* The cached OCL query for the '{@link #getHospitalAdmissionDiagnosisSection(DischargeSummary) <em>Get Hospital Admission Diagnosis Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalAdmissionDiagnosisSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection(
			DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(333));
			try {
				GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalAdmissionDiagnosisSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHospitalDischargeDiagnosisSection(DischargeSummary) <em>Get Hospital Discharge Diagnosis Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargeDiagnosisSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeDiagnosisSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeDiagnosisSection)";

	/**
	* The cached OCL query for the '{@link #getHospitalDischargeDiagnosisSection(DischargeSummary) <em>Get Hospital Discharge Diagnosis Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargeDiagnosisSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection(
			DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(334));
			try {
				GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (HospitalDischargeDiagnosisSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getDischargeDietSection(DischargeSummary) <em>Get Discharge Diet Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getDischargeDietSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_DISCHARGE_DIET_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::DischargeDietSection))->asSequence()->any(true).oclAsType(consol::DischargeDietSection)";

	/**
	* The cached OCL query for the '{@link #getDischargeDietSection(DischargeSummary) <em>Get Discharge Diet Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getDischargeDietSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIET_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static DischargeDietSection getDischargeDietSection(DischargeSummary dischargeSummary) {
		if (GET_DISCHARGE_DIET_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(335));
			try {
				GET_DISCHARGE_DIET_SECTION__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIET_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIET_SECTION__EOCL_QRY);
		return (DischargeDietSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary) <em>Get Hospital Discharge Medications Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeMedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::HospitalDischargeMedicationsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary) <em>Get Hospital Discharge Medications Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargeMedicationsSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional(
			DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(336));
			try {
				GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (HospitalDischargeMedicationsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getFunctionalStatusSection(DischargeSummary) <em>Get Functional Status Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFunctionalStatusSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FunctionalStatusSection))->asSequence()->any(true).oclAsType(consol::FunctionalStatusSection)";

	/**
	* The cached OCL query for the '{@link #getFunctionalStatusSection(DischargeSummary) <em>Get Functional Status Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFunctionalStatusSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static FunctionalStatusSection getFunctionalStatusSection(DischargeSummary dischargeSummary) {
		if (GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(337));
			try {
				GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS_SECTION__EOCL_QRY);
		return (FunctionalStatusSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(DischargeSummary) <em>Get History Of Present Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPresentIllnessSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPresentIllnessSection)";

	/**
	* The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(DischargeSummary) <em>Get History Of Present Illness Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPresentIllnessSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(DischargeSummary dischargeSummary) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(338));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHospitalCourseSection(DischargeSummary) <em>Get Hospital Course Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalCourseSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HOSPITAL_COURSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalCourseSection))->asSequence()->any(true).oclAsType(consol::HospitalCourseSection)";

	/**
	* The cached OCL query for the '{@link #getHospitalCourseSection(DischargeSummary) <em>Get Hospital Course Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalCourseSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HOSPITAL_COURSE_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HospitalCourseSection getHospitalCourseSection(DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_COURSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(339));
			try {
				GET_HOSPITAL_COURSE_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_COURSE_SECTION__EOCL_QRY);
		return (HospitalCourseSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareSection(DischargeSummary) <em>Get Plan Of Care Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(consol::PlanOfCareSection)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareSection(DischargeSummary) <em>Get Plan Of Care Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static PlanOfCareSection getPlanOfCareSection(DischargeSummary dischargeSummary) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(340));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(DischargeSummary) <em>Get History Of Past Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPastIllnessSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection)";

	/**
	* The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(DischargeSummary) <em>Get History Of Past Illness Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPastIllnessSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(DischargeSummary dischargeSummary) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(341));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(DischargeSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintAndReasonForVisitSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
	* The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(DischargeSummary) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintAndReasonForVisitSection(DischargeSummary)
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
			DischargeSummary dischargeSummary) {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(342));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getChiefComplaintSection(DischargeSummary) <em>Get Chief Complaint Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	* The cached OCL query for the '{@link #getChiefComplaintSection(DischargeSummary) <em>Get Chief Complaint Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ChiefComplaintSection getChiefComplaintSection(DischargeSummary dischargeSummary) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(343));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getFamilyHistorySection(DischargeSummary) <em>Get Family History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFamilyHistorySection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection)";

	/**
	* The cached OCL query for the '{@link #getFamilyHistorySection(DischargeSummary) <em>Get Family History Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFamilyHistorySection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static FamilyHistorySection getFamilyHistorySection(DischargeSummary dischargeSummary) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(344));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHospitalConsultationsSection(DischargeSummary) <em>Get Hospital Consultations Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalConsultationsSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalConsultationsSection))->asSequence()->any(true).oclAsType(consol::HospitalConsultationsSection)";

	/**
	* The cached OCL query for the '{@link #getHospitalConsultationsSection(DischargeSummary) <em>Get Hospital Consultations Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalConsultationsSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HospitalConsultationsSection getHospitalConsultationsSection(DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(345));
			try {
				GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_CONSULTATIONS_SECTION__EOCL_QRY);
		return (HospitalConsultationsSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHospitalDischargeInstructionsSection(DischargeSummary) <em>Get Hospital Discharge Instructions Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargeInstructionsSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)";

	/**
	* The cached OCL query for the '{@link #getHospitalDischargeInstructionsSection(DischargeSummary) <em>Get Hospital Discharge Instructions Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargeInstructionsSection(DischargeSummary)
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
			DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(346));
			try {
				GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeInstructionsSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHospitalDischargePhysicalSection(DischargeSummary) <em>Get Hospital Discharge Physical Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargePhysicalSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargePhysicalSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargePhysicalSection)";

	/**
	* The cached OCL query for the '{@link #getHospitalDischargePhysicalSection(DischargeSummary) <em>Get Hospital Discharge Physical Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargePhysicalSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static HospitalDischargePhysicalSection getHospitalDischargePhysicalSection(DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(347));
			try {
				GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__EOCL_QRY);
		return (HospitalDischargePhysicalSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getHospitalDischargeStudiesSummarySection(DischargeSummary) <em>Get Hospital Discharge Studies Summary Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargeStudiesSummarySection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeStudiesSummarySection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeStudiesSummarySection)";

	/**
	* The cached OCL query for the '{@link #getHospitalDischargeStudiesSummarySection(DischargeSummary) <em>Get Hospital Discharge Studies Summary Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHospitalDischargeStudiesSummarySection(DischargeSummary)
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
			DischargeSummary dischargeSummary) {
		if (GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(348));
			try {
				GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__EOCL_QRY);
		return (HospitalDischargeStudiesSummarySection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getImmunizationsSectionEntriesOptional(DischargeSummary) <em>Get Immunizations Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getImmunizationsSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ImmunizationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ImmunizationsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getImmunizationsSectionEntriesOptional(DischargeSummary) <em>Get Immunizations Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getImmunizationsSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional(
			DischargeSummary dischargeSummary) {
		if (GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(349));
			try {
				GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ImmunizationsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getProblemSectionEntriesOptional(DischargeSummary) <em>Get Problem Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ProblemSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getProblemSectionEntriesOptional(DischargeSummary) <em>Get Problem Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProblemSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ProblemSectionEntriesOptional getProblemSectionEntriesOptional(DischargeSummary dischargeSummary) {
		if (GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(350));
			try {
				GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProblemSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional(DischargeSummary) <em>Get Procedures Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProceduresSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ProceduresSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getProceduresSectionEntriesOptional(DischargeSummary) <em>Get Procedures Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProceduresSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(DischargeSummary dischargeSummary) {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(351));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProceduresSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getReasonForVisitSection(DischargeSummary) <em>Get Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReasonForVisitSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	* The cached OCL query for the '{@link #getReasonForVisitSection(DischargeSummary) <em>Get Reason For Visit Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReasonForVisitSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ReasonForVisitSection getReasonForVisitSection(DischargeSummary dischargeSummary) {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(352));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getReviewOfSystemsSection(DischargeSummary) <em>Get Review Of Systems Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReviewOfSystemsSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	* The cached OCL query for the '{@link #getReviewOfSystemsSection(DischargeSummary) <em>Get Review Of Systems Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReviewOfSystemsSection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ReviewOfSystemsSection getReviewOfSystemsSection(DischargeSummary dischargeSummary) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(353));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getSocialHistorySection(DischargeSummary) <em>Get Social History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSocialHistorySection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->any(true).oclAsType(consol::SocialHistorySection)";

	/**
	* The cached OCL query for the '{@link #getSocialHistorySection(DischargeSummary) <em>Get Social History Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSocialHistorySection(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static SocialHistorySection getSocialHistorySection(DischargeSummary dischargeSummary) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(354));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(DischargeSummary) <em>Get Allergies Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergiesSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(DischargeSummary) <em>Get Allergies Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergiesSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(DischargeSummary dischargeSummary) {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(355));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #getVitalSignsSectionEntriesOptional(DischargeSummary) <em>Get Vital Signs Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getVitalSignsSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static final String GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::VitalSignsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::VitalSignsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getVitalSignsSectionEntriesOptional(DischargeSummary) <em>Get Vital Signs Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getVitalSignsSectionEntriesOptional(DischargeSummary)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional(DischargeSummary dischargeSummary) {
		if (GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.DISCHARGE_SUMMARY,
				ConsolPackage.Literals.DISCHARGE_SUMMARY.getEAllOperations().get(356));
			try {
				GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (VitalSignsSectionEntriesOptional) query.evaluate(dischargeSummary);
	}

	/**
	* The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.8')";

	/**
	* The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateGeneralHeaderConstraintsTemplateId(DischargeSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param dischargeSummary The receiving '<em><b>Discharge Summary</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateGeneralHeaderConstraintsTemplateId(DischargeSummary dischargeSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISCHARGE_SUMMARY);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			dischargeSummary)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DISCHARGE_SUMMARY__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"GeneralHeaderConstraintsTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dischargeSummary, context) }),
					new Object[] { dischargeSummary }));
			}

			return false;
		}
		return true;
	}

} // DischargeSummaryOperations
