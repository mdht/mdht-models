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
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteIndividual(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Individual</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePrimaryCarePhysician(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Primary Care Physician</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAssessmentAndPlanSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComplicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePostprocedureDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Postprocedure Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureIndicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAllergiesSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteAnesthesiaSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHistoryOfPastIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicationsSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteMedicationsAdministeredSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePhysicalExamSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNotePlannedProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureEstimatedBloodLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureFindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureImplantsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProcedureSpecimensTakenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProceduresSectionEntriesOptional(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteIndividualTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Individual Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteComponentOfEncompassingEncounter5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProviderAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#validateProcedureNoteProviderAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getComplicationsSection() <em>Get Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPostprocedureDiagnosisSection() <em>Get Postprocedure Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureDescriptionSection() <em>Get Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureIndicationsSection() <em>Get Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getAnesthesiaSection() <em>Get Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getHistoryOfPastIllnessSection() <em>Get History Of Past Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicalHistorySection() <em>Get Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicationsSectionEntriesOptional() <em>Get Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPhysicalExamSection() <em>Get Physical Exam Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getPlannedProcedureSection() <em>Get Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureDispositionSection() <em>Get Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureEstimatedBloodLossSection() <em>Get Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureFindingsSection() <em>Get Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureImplantsSection() <em>Get Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProcedureSpecimensTakenSection() <em>Get Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getProceduresSectionEntriesOptional() <em>Get Procedures Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureNoteOperations extends GeneralHeaderConstraintsOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProcedureNoteOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) and  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Has An Assement And Plan Section Or Individual Assement And Plan Sections</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			ProcedureNote procedureNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION_OR_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Individual Assement And Plan Sections When Assement And Plan Section Present</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			ProcedureNote procedureNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_DOES_NOT_HAVE_INDIVIDUAL_ASSEMENT_AND_PLAN_SECTIONS_WHEN_ASSEMENT_AND_PLAN_SECTION_PRESENT,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or  self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Does Not Have Chief Complaint And Reason For Visit With Chief Complaint Section Or Reason Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			ProcedureNote procedureNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteTemplateId(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteTemplateId(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.1.6')";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteTemplateId(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteTemplateId(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteTemplateId(ProcedureNote procedureNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteTemplateId"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Code</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateProcedureNoteCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_PROCEDURE_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateProcedureNoteCode(ProcedureNote procedureNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_CODE,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteCode"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteIndividual(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Individual</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteIndividual(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_INDIVIDUAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode=vocab::ParticipationType::IND)->size() = 1";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteIndividual(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Individual</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteIndividual(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_INDIVIDUAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteIndividual(ProcedureNote procedureNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_INDIVIDUAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_INDIVIDUAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_INDIVIDUAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_INDIVIDUAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_INDIVIDUAL,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteIndividual"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComponentOf(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOf(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->one(componentOf : cda::Component1 | not componentOf.oclIsUndefined() and componentOf.oclIsKindOf(cda::Component1))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComponentOf(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOf(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteComponentOf(ProcedureNote procedureNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPONENT_OF,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteComponentOf"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNotePrimaryCarePhysician(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Primary Care Physician</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePrimaryCarePhysician(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode=vocab::ParticipationType::PRCP)->size() = 1";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNotePrimaryCarePhysician(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Primary Care Physician</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePrimaryCarePhysician(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNotePrimaryCarePhysician(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PRIMARY_CARE_PHYSICIAN,
					ConsolPlugin.INSTANCE.getString("ProcedureNotePrimaryCarePhysician"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProvider(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProvider(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant1))->select(typeCode<>vocab::ParticipationType::PRCP and typeCode<>vocab::ParticipationType::IND)->size() = 1";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProvider(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProvider(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProvider(ProcedureNote procedureNote, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROVIDER,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProvider"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteAssessmentSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteAssessmentSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteAssessmentSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteAssessmentSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteAssessmentSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_ASSESSMENT_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteAssessmentSection"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNotePlanOfCareSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Plan Of Care Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePlanOfCareSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNotePlanOfCareSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Plan Of Care Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePlanOfCareSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNotePlanOfCareSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PLAN_OF_CARE_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNotePlanOfCareSection"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteAssessmentAndPlanSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment And Plan Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteAssessmentAndPlanSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteAssessmentAndPlanSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Assessment And Plan Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteAssessmentAndPlanSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteAssessmentAndPlanSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_ASSESSMENT_AND_PLAN_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteAssessmentAndPlanSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComplicationsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Complications Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComplicationsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComplicationsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Complications Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComplicationsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteComplicationsSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPLICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteComplicationsSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNotePostprocedureDiagnosisSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Postprocedure Diagnosis Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePostprocedureDiagnosisSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostprocedureDiagnosisSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNotePostprocedureDiagnosisSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Postprocedure Diagnosis Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePostprocedureDiagnosisSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNotePostprocedureDiagnosisSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_POSTPROCEDURE_DIAGNOSIS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNotePostprocedureDiagnosisSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProcedureDescriptionSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Description Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureDescriptionSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProcedureDescriptionSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Description Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureDescriptionSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProcedureDescriptionSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROCEDURE_DESCRIPTION_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProcedureDescriptionSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProcedureIndicationsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Indications Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureIndicationsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProcedureIndicationsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Indications Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureIndicationsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProcedureIndicationsSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROCEDURE_INDICATIONS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProcedureIndicationsSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteAllergiesSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Allergies Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteAllergiesSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteAllergiesSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Allergies Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteAllergiesSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteAllergiesSectionEntriesOptional(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_ALLERGIES_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteAllergiesSectionEntriesOptional"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteAnesthesiaSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Anesthesia Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteAnesthesiaSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteAnesthesiaSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Anesthesia Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteAnesthesiaSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteAnesthesiaSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_ANESTHESIA_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteAnesthesiaSection"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteChiefComplaintSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteChiefComplaintSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteChiefComplaintSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteChiefComplaintSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteChiefComplaintSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_CHIEF_COMPLAINT_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteChiefComplaintSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteChiefComplaintAndReasonForVisitSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint And Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteChiefComplaintAndReasonForVisitSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteChiefComplaintAndReasonForVisitSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Chief Complaint And Reason For Visit Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteChiefComplaintAndReasonForVisitSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteChiefComplaintAndReasonForVisitSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteChiefComplaintAndReasonForVisitSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteFamilyHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Family History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteFamilyHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteFamilyHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Family History Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteFamilyHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteFamilyHistorySection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_FAMILY_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteFamilyHistorySection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteHistoryOfPastIllnessSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Past Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteHistoryOfPastIllnessSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteHistoryOfPastIllnessSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Past Illness Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteHistoryOfPastIllnessSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteHistoryOfPastIllnessSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteHistoryOfPastIllnessSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteHistoryOfPresentIllnessSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Present Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteHistoryOfPresentIllnessSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteHistoryOfPresentIllnessSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note History Of Present Illness Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteHistoryOfPresentIllnessSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteHistoryOfPresentIllnessSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteHistoryOfPresentIllnessSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteMedicalHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medical History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteMedicalHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteMedicalHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medical History Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteMedicalHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteMedicalHistorySection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_MEDICAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteMedicalHistorySection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteMedicationsSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteMedicationsSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteMedicationsSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteMedicationsSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteMedicationsSectionEntriesOptional(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteMedicationsSectionEntriesOptional"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteMedicationsAdministeredSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Administered Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteMedicationsAdministeredSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteMedicationsAdministeredSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Medications Administered Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteMedicationsAdministeredSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteMedicationsAdministeredSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_MEDICATIONS_ADMINISTERED_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteMedicationsAdministeredSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNotePhysicalExamSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Physical Exam Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePhysicalExamSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNotePhysicalExamSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Physical Exam Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePhysicalExamSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNotePhysicalExamSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PHYSICAL_EXAM_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNotePhysicalExamSection"), new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNotePlannedProcedureSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Planned Procedure Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePlannedProcedureSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNotePlannedProcedureSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Planned Procedure Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNotePlannedProcedureSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNotePlannedProcedureSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PLANNED_PROCEDURE_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNotePlannedProcedureSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProcedureDispositionSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Disposition Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureDispositionSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProcedureDispositionSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Disposition Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureDispositionSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProcedureDispositionSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROCEDURE_DISPOSITION_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProcedureDispositionSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProcedureEstimatedBloodLossSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Estimated Blood Loss Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureEstimatedBloodLossSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProcedureEstimatedBloodLossSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Estimated Blood Loss Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureEstimatedBloodLossSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProcedureEstimatedBloodLossSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProcedureEstimatedBloodLossSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProcedureFindingsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Findings Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureFindingsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProcedureFindingsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Findings Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureFindingsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProcedureFindingsSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROCEDURE_FINDINGS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProcedureFindingsSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProcedureImplantsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Implants Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureImplantsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProcedureImplantsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Implants Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureImplantsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProcedureImplantsSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROCEDURE_IMPLANTS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProcedureImplantsSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProcedureSpecimensTakenSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Specimens Taken Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureSpecimensTakenSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProcedureSpecimensTakenSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedure Specimens Taken Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProcedureSpecimensTakenSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProcedureSpecimensTakenSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProcedureSpecimensTakenSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProceduresSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedures Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProceduresSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProceduresSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Procedures Section Entries Optional</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProceduresSectionEntriesOptional(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteProceduresSectionEntriesOptional(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteProceduresSectionEntriesOptional"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteReasonForVisitSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteReasonForVisitSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteReasonForVisitSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Reason For Visit Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteReasonForVisitSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteReasonForVisitSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_REASON_FOR_VISIT_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteReasonForVisitSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteReviewOfSystemsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Review Of Systems Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteReviewOfSystemsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteReviewOfSystemsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Review Of Systems Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteReviewOfSystemsSection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteReviewOfSystemsSection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_REVIEW_OF_SYSTEMS_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteReviewOfSystemsSection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteSocialHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Social History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteSocialHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteSocialHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Social History Section</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteSocialHistorySection(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateProcedureNoteSocialHistorySection(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
			try {
				VALIDATE_PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			procedureNote)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_SOCIAL_HISTORY_SECTION,
					ConsolPlugin.INSTANCE.getString("ProcedureNoteSocialHistorySection"),
					new Object[] { procedureNote }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteIndividualTypeCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Individual Type Code</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateProcedureNoteIndividualTypeCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_INDIVIDUAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode=vocab::ParticipationType::IND)->reject(typeCode=vocab::ParticipationType::IND)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteIndividualTypeCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Individual Type Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteIndividualTypeCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_INDIVIDUAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteIndividualTypeCode(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_INDIVIDUAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_INDIVIDUAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_INDIVIDUAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_INDIVIDUAL_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteIndividualTypeCode"), new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null).healthCareFacility->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(
			ProcedureNote procedureNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY_ID,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).location->excluding(null)->reject(healthCareFacility->one(healthCareFacility : cda::HealthCareFacility | not healthCareFacility.oclIsUndefined() and healthCareFacility.oclIsKindOf(cda::HealthCareFacility)))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location Health Care Facility</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(
			ProcedureNote procedureNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION_HEALTH_CARE_FACILITY,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant Type Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null).encounterParticipant->excluding(null)->select(typeCode = vocab::x_EncounterParticipant::REF)->reject(typeCode=vocab::x_EncounterParticipant::REF)";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant Type Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(
			ProcedureNote procedureNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT_TYPE_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5Code(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5Code(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5Code(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5Code(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteComponentOfEncompassingEncounter5Code(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteComponentOfEncompassingEncounter5Code"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5Location(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5Location(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(location->exists(location : cda::Location | not location.oclIsUndefined() and location.oclIsKindOf(cda::Location)))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5Location(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Location</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5Location(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteComponentOfEncompassingEncounter5Location(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_LOCATION,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteComponentOfEncompassingEncounter5Location"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null).encompassingEncounter->excluding(null)->reject(encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(cda::EncounterParticipant)))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5 Encounter Participant</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(
			ProcedureNote procedureNote, DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.INFO,
						ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf->excluding(null)->reject(encompassingEncounter->one(encompassingEncounter : cda::EncompassingEncounter | not encompassingEncounter.oclIsUndefined() and encompassingEncounter.oclIsKindOf(cda::EncompassingEncounter)))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteComponentOfEncompassingEncounter5(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Component Of Encompassing Encounter5</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteComponentOfEncompassingEncounter5(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteComponentOfEncompassingEncounter5(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER5,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteComponentOfEncompassingEncounter5"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProviderAssociatedEntityClassCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider Associated Entity Class Code</em>}' operation.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #validateProcedureNoteProviderAssociatedEntityClassCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode<>vocab::ParticipationType::PRCP and typeCode<>vocab::ParticipationType::IND).associatedEntity->excluding(null)->reject(isDefined('classCode'))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProviderAssociatedEntityClassCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider Associated Entity Class Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProviderAssociatedEntityClassCode(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteProviderAssociatedEntityClassCode(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_CLASS_CODE,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteProviderAssociatedEntityClassCode"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateProcedureNoteProviderAssociatedEntityAssociatedPerson(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider Associated Entity Associated Person</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProviderAssociatedEntityAssociatedPerson(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->excluding(null)->select(typeCode<>vocab::ParticipationType::PRCP and typeCode<>vocab::ParticipationType::IND).associatedEntity->excluding(null)->reject(associatedPerson->one(associatedPerson : cda::Person | not associatedPerson.oclIsUndefined() and associatedPerson.oclIsKindOf(rim::Entity)))";

	/**
	* The cached OCL invariant for the '{@link #validateProcedureNoteProviderAssociatedEntityAssociatedPerson(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Note Provider Associated Entity Associated Person</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateProcedureNoteProviderAssociatedEntityAssociatedPerson(ProcedureNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Query<?, ?, ?> VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param procedureNote The receiving '<em><b>Procedure Note</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	@SuppressWarnings("unchecked")
	public static boolean validateProcedureNoteProviderAssociatedEntityAssociatedPerson(ProcedureNote procedureNote,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		OCL.Helper helper = EOCL_ENV.createOCLHelper();
		helper.setContext(ConsolPackage.Literals.PROCEDURE_NOTE);
		try {
			OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
		} catch (ParserException pe) {
			throw new UnsupportedOperationException(pe.getLocalizedMessage());
		}

		Object oclResult = VALIDATE_PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(procedureNote);
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;

			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
					diagnostics.add(new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.PROCEDURE_NOTE__PROCEDURE_NOTE_PROVIDER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON,
						ConsolPlugin.INSTANCE.getString("ProcedureNoteProviderAssociatedEntityAssociatedPerson"),
						new Object[] { eObject }));
				}

			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getAssessmentSection(ProcedureNote) <em>Get Assessment Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAssessmentSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentSection))->asSequence()->any(true).oclAsType(consol::AssessmentSection)";

	/**
	* The cached OCL query for the '{@link #getAssessmentSection(ProcedureNote) <em>Get Assessment Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAssessmentSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static AssessmentSection getAssessmentSection(ProcedureNote procedureNote) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(217));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlanOfCareSection(ProcedureNote) <em>Get Plan Of Care Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlanOfCareSection))->asSequence()->any(true).oclAsType(consol::PlanOfCareSection)";

	/**
	* The cached OCL query for the '{@link #getPlanOfCareSection(ProcedureNote) <em>Get Plan Of Care Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlanOfCareSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static PlanOfCareSection getPlanOfCareSection(ProcedureNote procedureNote) {
		if (GET_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(218));
			try {
				GET_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ProcedureNote) <em>Get Assessment And Plan Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAssessmentAndPlanSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AssessmentAndPlanSection))->asSequence()->any(true).oclAsType(consol::AssessmentAndPlanSection)";

	/**
	* The cached OCL query for the '{@link #getAssessmentAndPlanSection(ProcedureNote) <em>Get Assessment And Plan Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAssessmentAndPlanSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static AssessmentAndPlanSection getAssessmentAndPlanSection(ProcedureNote procedureNote) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(219));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getComplicationsSection(ProcedureNote) <em>Get Complications Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getComplicationsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_COMPLICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ComplicationsSection))->asSequence()->any(true).oclAsType(consol::ComplicationsSection)";

	/**
	* The cached OCL query for the '{@link #getComplicationsSection(ProcedureNote) <em>Get Complications Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getComplicationsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_COMPLICATIONS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ComplicationsSection getComplicationsSection(ProcedureNote procedureNote) {
		if (GET_COMPLICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(220));
			try {
				GET_COMPLICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_COMPLICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPLICATIONS_SECTION__EOCL_QRY);
		return (ComplicationsSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getPostprocedureDiagnosisSection(ProcedureNote) <em>Get Postprocedure Diagnosis Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPostprocedureDiagnosisSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PostprocedureDiagnosisSection))->asSequence()->any(true).oclAsType(consol::PostprocedureDiagnosisSection)";

	/**
	* The cached OCL query for the '{@link #getPostprocedureDiagnosisSection(ProcedureNote) <em>Get Postprocedure Diagnosis Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPostprocedureDiagnosisSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static PostprocedureDiagnosisSection getPostprocedureDiagnosisSection(ProcedureNote procedureNote) {
		if (GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(221));
			try {
				GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_POSTPROCEDURE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PostprocedureDiagnosisSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProcedureDescriptionSection(ProcedureNote) <em>Get Procedure Description Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureDescriptionSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDescriptionSection))->asSequence()->any(true).oclAsType(consol::ProcedureDescriptionSection)";

	/**
	* The cached OCL query for the '{@link #getProcedureDescriptionSection(ProcedureNote) <em>Get Procedure Description Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureDescriptionSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProcedureDescriptionSection getProcedureDescriptionSection(ProcedureNote procedureNote) {
		if (GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(222));
			try {
				GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_DESCRIPTION_SECTION__EOCL_QRY);
		return (ProcedureDescriptionSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProcedureIndicationsSection(ProcedureNote) <em>Get Procedure Indications Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureIndicationsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURE_INDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureIndicationsSection))->asSequence()->any(true).oclAsType(consol::ProcedureIndicationsSection)";

	/**
	* The cached OCL query for the '{@link #getProcedureIndicationsSection(ProcedureNote) <em>Get Procedure Indications Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureIndicationsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURE_INDICATIONS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProcedureIndicationsSection getProcedureIndicationsSection(ProcedureNote procedureNote) {
		if (GET_PROCEDURE_INDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(223));
			try {
				GET_PROCEDURE_INDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_INDICATIONS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_INDICATIONS_SECTION__EOCL_QRY);
		return (ProcedureIndicationsSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getAllergiesSectionEntriesOptional(ProcedureNote) <em>Get Allergies Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergiesSectionEntriesOptional(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::AllergiesSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getAllergiesSectionEntriesOptional(ProcedureNote) <em>Get Allergies Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAllergiesSectionEntriesOptional(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional(ProcedureNote procedureNote) {
		if (GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(224));
			try {
				GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (AllergiesSectionEntriesOptional) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getAnesthesiaSection(ProcedureNote) <em>Get Anesthesia Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAnesthesiaSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_ANESTHESIA_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AnesthesiaSection))->asSequence()->any(true).oclAsType(consol::AnesthesiaSection)";

	/**
	* The cached OCL query for the '{@link #getAnesthesiaSection(ProcedureNote) <em>Get Anesthesia Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getAnesthesiaSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_ANESTHESIA_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static AnesthesiaSection getAnesthesiaSection(ProcedureNote procedureNote) {
		if (GET_ANESTHESIA_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(225));
			try {
				GET_ANESTHESIA_SECTION__EOCL_QRY = helper.createQuery(GET_ANESTHESIA_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ANESTHESIA_SECTION__EOCL_QRY);
		return (AnesthesiaSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getChiefComplaintSection(ProcedureNote) <em>Get Chief Complaint Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintSection)";

	/**
	* The cached OCL query for the '{@link #getChiefComplaintSection(ProcedureNote) <em>Get Chief Complaint Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ChiefComplaintSection getChiefComplaintSection(ProcedureNote procedureNote) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(226));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getChiefComplaintAndReasonForVisitSection(ProcedureNote) <em>Get Chief Complaint And Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintAndReasonForVisitSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ChiefComplaintAndReasonForVisitSection)";

	/**
	* The cached OCL query for the '{@link #getChiefComplaintAndReasonForVisitSection(ProcedureNote) <em>Get Chief Complaint And Reason For Visit Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getChiefComplaintAndReasonForVisitSection(ProcedureNote)
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
			ProcedureNote procedureNote) {
		if (GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(227));
			try {
				GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ChiefComplaintAndReasonForVisitSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getFamilyHistorySection(ProcedureNote) <em>Get Family History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFamilyHistorySection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::FamilyHistorySection))->asSequence()->any(true).oclAsType(consol::FamilyHistorySection)";

	/**
	* The cached OCL query for the '{@link #getFamilyHistorySection(ProcedureNote) <em>Get Family History Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFamilyHistorySection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static FamilyHistorySection getFamilyHistorySection(ProcedureNote procedureNote) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(228));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getHistoryOfPastIllnessSection(ProcedureNote) <em>Get History Of Past Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPastIllnessSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPastIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPastIllnessSection)";

	/**
	* The cached OCL query for the '{@link #getHistoryOfPastIllnessSection(ProcedureNote) <em>Get History Of Past Illness Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPastIllnessSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static HistoryOfPastIllnessSection getHistoryOfPastIllnessSection(ProcedureNote procedureNote) {
		if (GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(229));
			try {
				GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PAST_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPastIllnessSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getHistoryOfPresentIllnessSection(ProcedureNote) <em>Get History Of Present Illness Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPresentIllnessSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HistoryOfPresentIllnessSection))->asSequence()->any(true).oclAsType(consol::HistoryOfPresentIllnessSection)";

	/**
	* The cached OCL query for the '{@link #getHistoryOfPresentIllnessSection(ProcedureNote) <em>Get History Of Present Illness Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getHistoryOfPresentIllnessSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection(ProcedureNote procedureNote) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(230));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS_SECTION__EOCL_QRY);
		return (HistoryOfPresentIllnessSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getMedicalHistorySection(ProcedureNote) <em>Get Medical History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicalHistorySection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicalHistorySection))->asSequence()->any(true).oclAsType(consol::MedicalHistorySection)";

	/**
	* The cached OCL query for the '{@link #getMedicalHistorySection(ProcedureNote) <em>Get Medical History Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicalHistorySection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICAL_HISTORY_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static MedicalHistorySection getMedicalHistorySection(ProcedureNote procedureNote) {
		if (GET_MEDICAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(231));
			try {
				GET_MEDICAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_HISTORY_SECTION__EOCL_QRY);
		return (MedicalHistorySection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getMedicationsSectionEntriesOptional(ProcedureNote) <em>Get Medications Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationsSectionEntriesOptional(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::MedicationsSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getMedicationsSectionEntriesOptional(ProcedureNote) <em>Get Medications Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationsSectionEntriesOptional(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional(ProcedureNote procedureNote) {
		if (GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(232));
			try {
				GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (MedicationsSectionEntriesOptional) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getMedicationsAdministeredSection(ProcedureNote) <em>Get Medications Administered Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationsAdministeredSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::MedicationsAdministeredSection))->asSequence()->any(true).oclAsType(consol::MedicationsAdministeredSection)";

	/**
	* The cached OCL query for the '{@link #getMedicationsAdministeredSection(ProcedureNote) <em>Get Medications Administered Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMedicationsAdministeredSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static MedicationsAdministeredSection getMedicationsAdministeredSection(ProcedureNote procedureNote) {
		if (GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(233));
			try {
				GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_ADMINISTERED_SECTION__EOCL_QRY);
		return (MedicationsAdministeredSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getPhysicalExamSection(ProcedureNote) <em>Get Physical Exam Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPhysicalExamSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PHYSICAL_EXAM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PhysicalExamSection))->asSequence()->any(true).oclAsType(consol::PhysicalExamSection)";

	/**
	* The cached OCL query for the '{@link #getPhysicalExamSection(ProcedureNote) <em>Get Physical Exam Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPhysicalExamSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAM_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static PhysicalExamSection getPhysicalExamSection(ProcedureNote procedureNote) {
		if (GET_PHYSICAL_EXAM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(234));
			try {
				GET_PHYSICAL_EXAM_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAM_SECTION__EOCL_QRY);
		return (PhysicalExamSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getPlannedProcedureSection(ProcedureNote) <em>Get Planned Procedure Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlannedProcedureSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PLANNED_PROCEDURE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PlannedProcedureSection))->asSequence()->any(true).oclAsType(consol::PlannedProcedureSection)";

	/**
	* The cached OCL query for the '{@link #getPlannedProcedureSection(ProcedureNote) <em>Get Planned Procedure Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getPlannedProcedureSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PLANNED_PROCEDURE_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static PlannedProcedureSection getPlannedProcedureSection(ProcedureNote procedureNote) {
		if (GET_PLANNED_PROCEDURE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(235));
			try {
				GET_PLANNED_PROCEDURE_SECTION__EOCL_QRY = helper.createQuery(GET_PLANNED_PROCEDURE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLANNED_PROCEDURE_SECTION__EOCL_QRY);
		return (PlannedProcedureSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProcedureDispositionSection(ProcedureNote) <em>Get Procedure Disposition Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureDispositionSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURE_DISPOSITION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureDispositionSection))->asSequence()->any(true).oclAsType(consol::ProcedureDispositionSection)";

	/**
	* The cached OCL query for the '{@link #getProcedureDispositionSection(ProcedureNote) <em>Get Procedure Disposition Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureDispositionSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProcedureDispositionSection getProcedureDispositionSection(ProcedureNote procedureNote) {
		if (GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(236));
			try {
				GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_DISPOSITION_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_DISPOSITION_SECTION__EOCL_QRY);
		return (ProcedureDispositionSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProcedureEstimatedBloodLossSection(ProcedureNote) <em>Get Procedure Estimated Blood Loss Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureEstimatedBloodLossSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureEstimatedBloodLossSection))->asSequence()->any(true).oclAsType(consol::ProcedureEstimatedBloodLossSection)";

	/**
	* The cached OCL query for the '{@link #getProcedureEstimatedBloodLossSection(ProcedureNote) <em>Get Procedure Estimated Blood Loss Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureEstimatedBloodLossSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection(ProcedureNote procedureNote) {
		if (GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(237));
			try {
				GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__EOCL_QRY);
		return (ProcedureEstimatedBloodLossSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProcedureFindingsSection(ProcedureNote) <em>Get Procedure Findings Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureFindingsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURE_FINDINGS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureFindingsSection))->asSequence()->any(true).oclAsType(consol::ProcedureFindingsSection)";

	/**
	* The cached OCL query for the '{@link #getProcedureFindingsSection(ProcedureNote) <em>Get Procedure Findings Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureFindingsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURE_FINDINGS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProcedureFindingsSection getProcedureFindingsSection(ProcedureNote procedureNote) {
		if (GET_PROCEDURE_FINDINGS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(238));
			try {
				GET_PROCEDURE_FINDINGS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_FINDINGS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_FINDINGS_SECTION__EOCL_QRY);
		return (ProcedureFindingsSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProcedureImplantsSection(ProcedureNote) <em>Get Procedure Implants Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureImplantsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURE_IMPLANTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureImplantsSection))->asSequence()->any(true).oclAsType(consol::ProcedureImplantsSection)";

	/**
	* The cached OCL query for the '{@link #getProcedureImplantsSection(ProcedureNote) <em>Get Procedure Implants Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureImplantsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProcedureImplantsSection getProcedureImplantsSection(ProcedureNote procedureNote) {
		if (GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(239));
			try {
				GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_IMPLANTS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_IMPLANTS_SECTION__EOCL_QRY);
		return (ProcedureImplantsSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProcedureSpecimensTakenSection(ProcedureNote) <em>Get Procedure Specimens Taken Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureSpecimensTakenSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProcedureSpecimensTakenSection))->asSequence()->any(true).oclAsType(consol::ProcedureSpecimensTakenSection)";

	/**
	* The cached OCL query for the '{@link #getProcedureSpecimensTakenSection(ProcedureNote) <em>Get Procedure Specimens Taken Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProcedureSpecimensTakenSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection(ProcedureNote procedureNote) {
		if (GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(240));
			try {
				GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURE_SPECIMENS_TAKEN_SECTION__EOCL_QRY);
		return (ProcedureSpecimensTakenSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getProceduresSectionEntriesOptional(ProcedureNote) <em>Get Procedures Section Entries Optional</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProceduresSectionEntriesOptional(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProceduresSectionEntriesOptional))->asSequence()->any(true).oclAsType(consol::ProceduresSectionEntriesOptional)";

	/**
	* The cached OCL query for the '{@link #getProceduresSectionEntriesOptional(ProcedureNote) <em>Get Procedures Section Entries Optional</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getProceduresSectionEntriesOptional(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional(ProcedureNote procedureNote) {
		if (GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(241));
			try {
				GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION_ENTRIES_OPTIONAL__EOCL_QRY);
		return (ProceduresSectionEntriesOptional) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getReasonForVisitSection(ProcedureNote) <em>Get Reason For Visit Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReasonForVisitSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_REASON_FOR_VISIT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))->asSequence()->any(true).oclAsType(consol::ReasonForVisitSection)";

	/**
	* The cached OCL query for the '{@link #getReasonForVisitSection(ProcedureNote) <em>Get Reason For Visit Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReasonForVisitSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_REASON_FOR_VISIT_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ReasonForVisitSection getReasonForVisitSection(ProcedureNote procedureNote) {
		if (GET_REASON_FOR_VISIT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(242));
			try {
				GET_REASON_FOR_VISIT_SECTION__EOCL_QRY = helper.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REASON_FOR_VISIT_SECTION__EOCL_QRY);
		return (ReasonForVisitSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ProcedureNote) <em>Get Review Of Systems Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReviewOfSystemsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReviewOfSystemsSection))->asSequence()->any(true).oclAsType(consol::ReviewOfSystemsSection)";

	/**
	* The cached OCL query for the '{@link #getReviewOfSystemsSection(ProcedureNote) <em>Get Review Of Systems Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getReviewOfSystemsSection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static ReviewOfSystemsSection getReviewOfSystemsSection(ProcedureNote procedureNote) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(243));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSection) query.evaluate(procedureNote);
	}

	/**
	* The cached OCL expression body for the '{@link #getSocialHistorySection(ProcedureNote) <em>Get Social History Section</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSocialHistorySection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::SocialHistorySection))->asSequence()->any(true).oclAsType(consol::SocialHistorySection)";

	/**
	* The cached OCL query for the '{@link #getSocialHistorySection(ProcedureNote) <em>Get Social History Section</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getSocialHistorySection(ProcedureNote)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public static SocialHistorySection getSocialHistorySection(ProcedureNote procedureNote) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.PROCEDURE_NOTE,
				ConsolPackage.Literals.PROCEDURE_NOTE.getEAllOperations().get(244));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(procedureNote);
	}

} // ProcedureNoteOperations