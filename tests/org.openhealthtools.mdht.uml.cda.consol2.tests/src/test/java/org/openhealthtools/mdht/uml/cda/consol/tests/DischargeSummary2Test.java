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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Component1;
import org.eclipse.mdht.uml.cda.EncompassingEncounter;
import org.eclipse.mdht.uml.cda.EncounterParticipant;
import org.eclipse.mdht.uml.cda.Participant1;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.ResponsibleParty;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.NullFlavor;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummary2Operations;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeSummary2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary2 target) {
						target.init();
						target.addSection(
							ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary2 target) {
						target.init();
						target.addSection(
							ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary2 target) {
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
					public void updateToPass(DischargeSummary2 target) {
						target.init();
						target.addSection(
							ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DischargeSummary2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2CodeP() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2CodePTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2CodeP(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2Code() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2CodeTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2Code",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("11490-0", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected void setDependency(DischargeSummary2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2Code(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2Participant() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ParticipantTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2Participant",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2Participant(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOf() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOf(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2AllergiesSectionEntriesOptional2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2AllergiesSectionEntriesOptional2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2AllergiesSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2AllergiesSectionEntriesOptional2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2AllergiesSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2HospitalCourseSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2HospitalCourseSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2HospitalCourseSection", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_COURSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* HospitalCourseSection */
				HospitalCourseSection section =

				ConsolFactory.eINSTANCE.createHospitalCourseSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2HospitalCourseSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2HospitalCourseSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2PlanOfTreatmentSection2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2PlanOfTreatmentSection2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2PlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2PlanOfTreatmentSection2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2PlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ChiefComplaintSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ChiefComplaintSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ChiefComplaintSection", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ChiefComplaintSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2NutritionSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2NutritionSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2NutritionSection", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* NutritionSection */
				NutritionSection section =

				ConsolFactory.eINSTANCE.createNutritionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2NutritionSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2NutritionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2FunctionalStatusSection2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2FunctionalStatusSection2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2FunctionalStatusSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFunctionalStatusSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2FunctionalStatusSection2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2FunctionalStatusSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2HistoryOfPastIllnessSection2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2HistoryOfPastIllnessSection2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2HistoryOfPastIllnessSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2HistoryOfPastIllnessSection2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2HistoryOfPastIllnessSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2HistoryOfPresentIllnessSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2HistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2HistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2HistoryOfPresentIllnessSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2HistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2HospitalConsultationsSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2HospitalConsultationsSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2HospitalConsultationsSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_CONSULTATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* HospitalConsultationsSection */
				HospitalConsultationsSection section =

				ConsolFactory.eINSTANCE.createHospitalConsultationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2HospitalConsultationsSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2HospitalConsultationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2HospitalDischargeInstructionsSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2HospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2HospitalDischargeInstructionsSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2HospitalDischargeInstructionsSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2HospitalDischargeInstructionsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2HospitalDischargePhysicalSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2HospitalDischargePhysicalSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2HospitalDischargePhysicalSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_PHYSICAL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* HospitalDischargePhysicalSection */
				HospitalDischargePhysicalSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargePhysicalSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2HospitalDischargePhysicalSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2HospitalDischargePhysicalSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2HospitalDischargeStudiesSummarySection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2HospitalDischargeStudiesSummarySectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2HospitalDischargeStudiesSummarySection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* HospitalDischargeStudiesSummarySection */
				HospitalDischargeStudiesSummarySection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeStudiesSummarySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2HospitalDischargeStudiesSummarySection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2HospitalDischargeStudiesSummarySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ImmunizationsSectionEntriesOptional2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ImmunizationsSectionEntriesOptional2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ImmunizationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ImmunizationsSectionEntriesOptional2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ImmunizationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ProblemSectionEntriesOptional2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ProblemSectionEntriesOptional2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ProblemSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ProblemSectionEntriesOptional2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ProblemSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ProceduresSectionEntriesOptional2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ProceduresSectionEntriesOptional2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ProceduresSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ProceduresSectionEntriesOptional2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ProceduresSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ReasonForVisitSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ReasonForVisitSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ReasonForVisitSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ReasonForVisitSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeSummary2ReviewOfSystemsSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ReviewOfSystemsSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ReviewOfSystemsSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ReviewOfSystemsSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2SocialHistorySection2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2SocialHistorySection2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2SocialHistorySection2", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createSocialHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2SocialHistorySection2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2SocialHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2VitalSignsSectionEntriesOptional2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2VitalSignsSectionEntriesOptional2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2VitalSignsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2VitalSignsSectionEntriesOptional2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2VitalSignsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2DischargeDiagnosisSection2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2DischargeDiagnosisSection2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2DischargeDiagnosisSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createDischargeDiagnosisSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2DischargeDiagnosisSection2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2DischargeDiagnosisSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2DischargeMedicationsSectionEntriesOptional2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createDischargeMedicationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2DischargeMedicationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2FamilyHistorySection2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2FamilyHistorySection2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2FamilyHistorySection2", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFamilyHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2FamilyHistorySection2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2FamilyHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2AdmissionDiagnosisSection2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2AdmissionDiagnosisSection2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2AdmissionDiagnosisSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdmissionDiagnosisSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2AdmissionDiagnosisSection2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2AdmissionDiagnosisSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdmissionMedicationsSectionEntriesOptional2().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2AdmissionMedicationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2DischargeMedicationsSection2() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2DischargeMedicationsSection2TestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2DischargeMedicationsSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createDischargeMedicationsSection2().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2DischargeMedicationsSection2(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2DischargeMedicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2DischargeDietSection() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2DischargeDietSectionTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2DischargeDietSection", operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_DISCHARGE_DIET_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();
				DischargeDietSection section = ConsolFactory.eINSTANCE.createDischargeDietSection().init();
				target.addSection(section);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2DischargeDietSection(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2DischargeDietSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* Note: Modified OCL in operations.
	*/
	@Test
	public void testValidateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeINDTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_PARTICIPANT_IF_PAR_TYPE_CODE_IND_THEN_AE_CLASS_CODE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary2 target) {
						// <participant typeCode="IND"/>
						target.init();
						Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
						p.setTypeCode(ParticipationType.IND);
						target.getParticipants().add(p);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary2 target) {
						// <participant typeCode="IND">
						// <associatedEntity/>
						target.init();
						Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
						target.getParticipants().add(p);
						p.setTypeCode(ParticipationType.IND);
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						p.setAssociatedEntity(ae);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(DischargeSummary2 target) {
						// <participant typeCode="IND">
						// <associatedEntity classCode="ACCESS"/>
						target.init();
						Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
						target.getParticipants().add(p);
						p.setTypeCode(ParticipationType.IND);
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						p.setAssociatedEntity(ae);
						ae.setClassCode(RoleClassAssociative.ACCESS); // invalid code
					}
				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DischargeSummary2 target) {
						// correct value pass
						// <participant typeCode="IND" >
						// <associatedEntity classCode="SOME CODE FROM THE SET" />
						target.getParticipants().clear();
						target.init();
						Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
						target.getParticipants().add(p);
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						p.setAssociatedEntity(ae);
						p.getAssociatedEntity().setClassCode(RoleClassAssociative.PRS);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(DischargeSummary2 target) {
						// nullFlavor pass
						// has <participant typeCode="IND"> and has <associatedEntity nullFlavor=�NA� />
						target.getParticipants().clear();
						target.init();
						Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
						target.getParticipants().add(p);
						AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
						p.setAssociatedEntity(ae);
						p.getAssociatedEntity().setNullFlavor(NullFlavor.NA);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ParticipantIfParTypeCodeINDThenAEClassCodeINDTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLowTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ee.setEffectiveTime(ts);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setLow(
					DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHighTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ee.setEffectiveTime(ts);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setHigh(
					DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPersonTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				target.setComponentOf(cof);
				cof.setEncompassingEncounter(ee);
				ee.getEncounterParticipants().add(ep);
				ep.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				for (EncounterParticipant ep : target.getComponentOf().getEncompassingEncounter().getEncounterParticipants()) {
					ep.getAssignedEntity().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPerson(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				target.setComponentOf(cof);
				cof.setEncompassingEncounter(ee);
				ee.getEncounterParticipants().add(ep);
				ep.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				for (EncounterParticipant ep : target.getComponentOf().getEncompassingEncounter().getEncounterParticipants()) {
					ep.getAssignedEntity().getRepresentedOrganizations().add(CDAFactory.eINSTANCE.createOrganization());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganization(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ep.setAssignedEntity(ae);
				ee.getEncounterParticipants().add(ep);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				Person person = CDAFactory.eINSTANCE.createPerson();

				ae.setAssignedPerson(person);

				ep.setAssignedEntity(ae);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				ee.getEncounterParticipants().add(ep);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ep.setAssignedEntity(ae);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPersonTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				target.setComponentOf(cof);
				cof.setEncompassingEncounter(ee);
				ee.setResponsibleParty(rp);
				rp.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().getAssignedEntity().setAssignedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPerson(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				target.setComponentOf(cof);
				cof.setEncompassingEncounter(ee);
				ee.setResponsibleParty(rp);
				rp.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().getAssignedEntity().getRepresentedOrganizations().add(
					CDAFactory.eINSTANCE.createOrganization());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganization(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				rp.setAssignedEntity(ae);
				ee.setResponsibleParty(rp);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				Person person = CDAFactory.eINSTANCE.createPerson();

				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().getAssignedEntity().setAssignedPerson(
					person);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				ee.setResponsibleParty(rp);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().setAssignedEntity(ae);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(ts);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				// The following test fails because there is no dischargeDispositionCode element in encompassingEncounter
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				CE ddc = DatatypesFactory.eINSTANCE.createCE();

				ee.setDischargeDispositionCode(ddc);
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				// requires a dischargeDispositionCode element in encompassingEncounter
				// and the correct codeSystem for the NUBC UB-04 FL17-Patient Status valueSet
				target.getComponentOf().getEncompassingEncounter().setDischargeDispositionCode(
					DatatypesFactory.eINSTANCE.createCE("notChecked", "2.16.840.1.113883.6.301.5"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodePTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_DISCHARGE_DISPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				// The following test fails because there is no dischargeDispositionCode element in encompassingEncounter
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				// Simply requires a dischargeDispositionCode element in encompassingEncounter
				target.getComponentOf().getEncompassingEncounter().setDischargeDispositionCode(
					DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				target.getComponentOf().getEncompassingEncounter().setResponsibleParty(rp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeSummary2ComponentOfEncompassingEncounter() {
		OperationsTestCase<DischargeSummary2> validateDischargeSummary2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateDischargeSummary2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISCHARGE_SUMMARY2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				target.getComponentOf().setEncompassingEncounter(ee);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounter(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateDischargeSummary2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional2() {

		DischargeSummary2 target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalCourseSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getHospitalCourseSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		DischargeSummary2 target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getNutritionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection2() {

		DischargeSummary2 target = objectFactory.create();
		target.getFunctionalStatusSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection2() {

		DischargeSummary2 target = objectFactory.create();
		target.getHistoryOfPastIllnessSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalConsultationsSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getHospitalConsultationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeInstructionsSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getHospitalDischargeInstructionsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargePhysicalSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getHospitalDischargePhysicalSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHospitalDischargeStudiesSummarySection() {

		DischargeSummary2 target = objectFactory.create();
		target.getHospitalDischargeStudiesSummarySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSectionEntriesOptional2() {

		DischargeSummary2 target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSectionEntriesOptional2() {

		DischargeSummary2 target = objectFactory.create();
		target.getProblemSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional2() {

		DischargeSummary2 target = objectFactory.create();
		target.getProceduresSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection2() {

		DischargeSummary2 target = objectFactory.create();
		target.getSocialHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSectionEntriesOptional2() {

		DischargeSummary2 target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeDiagnosisSection2() {

		DischargeSummary2 target = objectFactory.create();
		target.getDischargeDiagnosisSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeMedicationsSectionEntriesOptional2() {

		DischargeSummary2 target = objectFactory.create();
		target.getDischargeMedicationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection2() {

		DischargeSummary2 target = objectFactory.create();
		target.getFamilyHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdmissionDiagnosisSection2() {

		DischargeSummary2 target = objectFactory.create();
		target.getAdmissionDiagnosisSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdmissionMedicationsSectionEntriesOptional2() {

		DischargeSummary2 target = objectFactory.create();
		target.getAdmissionMedicationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeMedicationsSection2() {

		DischargeSummary2 target = objectFactory.create();
		target.getDischargeMedicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeDietSection() {

		DischargeSummary2 target = objectFactory.create();
		target.getDischargeDietSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<DischargeSummary2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeSummary2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeSummary2 target) {

			}

			@Override
			protected void updateToPass(DischargeSummary2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeSummary2Operations.validateGeneralHeaderConstraintsTemplateId(
					(DischargeSummary2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeSummary2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeSummary2> {
		public DischargeSummary2 create() {
			return ConsolFactory.eINSTANCE.createDischargeSummary2();
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
	private static class ConstructorTestClass extends DischargeSummary2Operations {
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

} // DischargeSummary2Operations
