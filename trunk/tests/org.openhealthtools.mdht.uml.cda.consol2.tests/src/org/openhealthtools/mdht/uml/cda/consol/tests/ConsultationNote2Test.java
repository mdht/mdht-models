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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssociatedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.InFulfillmentOf;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNote2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssociative;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consultation Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2HasReasonForReferral2OrReasonForVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Has Reason For Referral2 Or Reason For Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2Participant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2InFulfillmentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2AssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2AssessmentAndPlanSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ReasonForReferralSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Reason For Referral Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2HistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2PhysicalExamSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2AllergiesSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ChiefComplaintAndReasonForVisitSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2GeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2HistoryOfPastIllnessSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ImmunizationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Immunizations Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2MedicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ProblemSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ProceduresSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ResultsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2SocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2VitalSignsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2AdvanceDirectivesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2FunctionalStatusSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2MedicalEquipmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2MentalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2NutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Participant Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2InFulfillmentOfOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2InFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 In Fulfillment Of Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter Encounter Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateConsultationNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getAssessmentAndPlanSection2() <em>Get Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getReasonForReferralSection2() <em>Get Reason For Referral Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getReasonForVisitSection() <em>Get Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getPhysicalExamSection2() <em>Get Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getAllergiesSection2() <em>Get Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getChiefComplaintAndReasonForVisitSection() <em>Get Chief Complaint And Reason For Visit Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getHistoryOfPastIllnessSection2() <em>Get History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getImmunizationsSectionEntriesOptional2() <em>Get Immunizations Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getMedicationsSection2() <em>Get Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getProblemSection2() <em>Get Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getProceduresSectionEntriesOptional2() <em>Get Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getResultsSection2() <em>Get Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getVitalSignsSection2() <em>Get Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getAdvanceDirectivesSectionEntriesOptional2() <em>Get Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getFunctionalStatusSection2() <em>Get Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getMedicalEquipmentSection2() <em>Get Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getMentalStatusSection() <em>Get Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConsultationNote2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote2 target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ConsultationNote2 target) {
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
					public void updateToPass(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2HasReasonForReferral2OrReasonForVisit() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2HasReasonForReferral2OrReasonForVisitTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2HasReasonForReferral2OrReasonForVisit",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_HAS_REASON_FOR_REFERRAL2_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForReferralSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ConsultationNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2HasReasonForReferral2OrReasonForVisit(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2HasReasonForReferral2OrReasonForVisitTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2CodeP() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2CodePTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2CodeP(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2Code() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2CodeTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			private static final String code = "11488-4";

			private static final String codeSystem = "2.16.840.1.113883.6.1";

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE(code, codeSystem));
			}

			@Override
			protected void setDependency(ConsultationNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2Code(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2Participant() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2Participant",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2Participant(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2InFulfillmentOf() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2InFulfillmentOfTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2InFulfillmentOf",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.getInFulfillmentOfs().add(CDAFactory.eINSTANCE.createInFulfillmentOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOf(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2InFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOf() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOf(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2AssessmentSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2AssessmentSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2AssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

				ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2AssessmentSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2AssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2AssessmentAndPlanSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2AssessmentAndPlanSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2AssessmentAndPlanSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2AssessmentAndPlanSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2AssessmentAndPlanSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2PlanOfTreatmentSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2PlanOfTreatmentSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2PlanOfTreatmentSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2PlanOfTreatmentSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2PlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ReasonForReferralSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ReasonForReferralSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ReasonForReferralSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createReasonForReferralSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ReasonForReferralSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ReasonForReferralSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ReasonForVisitSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ReasonForVisitSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ReasonForVisitSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2HistoryOfPresentIllnessSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2HistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2HistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2HistoryOfPresentIllnessSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2HistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2PhysicalExamSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2PhysicalExamSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2PhysicalExamSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPhysicalExamSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2PhysicalExamSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2PhysicalExamSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2AllergiesSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2AllergiesSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2AllergiesSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2AllergiesSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2AllergiesSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ChiefComplaintSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ChiefComplaintSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ChiefComplaintSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ChiefComplaintAndReasonForVisitSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2GeneralStatusSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2GeneralStatusSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2GeneralStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

				ConsolFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2GeneralStatusSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2GeneralStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2HistoryOfPastIllnessSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2HistoryOfPastIllnessSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2HistoryOfPastIllnessSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2HistoryOfPastIllnessSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2HistoryOfPastIllnessSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ImmunizationsSectionEntriesOptional2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ImmunizationsSectionEntriesOptional2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ImmunizationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ImmunizationsSectionEntriesOptional2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ImmunizationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2MedicationsSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2MedicationsSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2MedicationsSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2MedicationsSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2MedicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ProblemSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ProblemSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ProblemSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProblemSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ProblemSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ProblemSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ProceduresSectionEntriesOptional2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ProceduresSectionEntriesOptional2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ProceduresSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ProceduresSectionEntriesOptional2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ProceduresSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ResultsSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ResultsSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ResultsSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createResultsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ResultsSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ResultsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2SocialHistorySection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2SocialHistorySection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2SocialHistorySection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createSocialHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2SocialHistorySection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2SocialHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2VitalSignsSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2VitalSignsSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2VitalSignsSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2VitalSignsSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2VitalSignsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2AdvanceDirectivesSectionEntriesOptional2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2AdvanceDirectivesSectionEntriesOptional2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2AdvanceDirectivesSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2AdvanceDirectivesSectionEntriesOptional2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2AdvanceDirectivesSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2FunctionalStatusSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2FunctionalStatusSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2FunctionalStatusSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFunctionalStatusSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2FunctionalStatusSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2FunctionalStatusSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2ReviewOfSystemsSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ReviewOfSystemsSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ReviewOfSystemsSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2MedicalEquipmentSection2() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2MedicalEquipmentSection2TestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2MedicalEquipmentSection2",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicalEquipmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2MedicalEquipmentSection2(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2MedicalEquipmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2MentalStatusSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2MentalStatusSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2MentalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* MentalStatusSection */
				MentalStatusSection section =

				ConsolFactory.eINSTANCE.createMentalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2MentalStatusSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2MentalStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsultationNote2NutritionSection() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2NutritionSectionTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2NutritionSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				/* NutritionSection */
				NutritionSection section =

				ConsolFactory.eINSTANCE.createNutritionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2NutritionSection(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2NutritionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				p.setAssociatedEntity(ae);
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ae.setAssociatedPerson(ap);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().getAssociatedPerson().getNames().add(DatatypesFactory.eINSTANCE.createPN());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityClassCode() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityClassCodeTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				p.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().setClassCode(RoleClassAssociative.ASSIGNED);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityClassCode(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityId() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityIdTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				p.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().getIds().add(DatatypesFactory.eINSTANCE.createII());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityId(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityAddr() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityAddrTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				p.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAddr(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityTelecom() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityTelecomTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				p.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityTelecom(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				p.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				Person ap = CDAFactory.eINSTANCE.createPerson();
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().setAssociatedPerson(ap);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntityScopingOrganization() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityScopingOrganizationTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntityScopingOrganization",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				p.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.getAssociatedEntity().setScopingOrganization(CDAFactory.eINSTANCE.createOrganization());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantTypeCode() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantTypeCodeTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				for (Participant1 p : target.getParticipants()) {
					p.setTypeCode(ParticipationType.CALLBCK);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantTypeCode(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ParticipantAssociatedEntity() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ParticipantAssociatedEntityTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ParticipantAssociatedEntity",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Participant1 p = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(p);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				for (Participant1 p : target.getParticipants()) {
					p.setAssociatedEntity(ae);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntity(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ParticipantAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2InFulfillmentOfOrderId() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2InFulfillmentOfOrderIdTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2InFulfillmentOfOrderId",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				ifo.setOrder(CDAFactory.eINSTANCE.createOrder());
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.getInFulfillmentOfs().clear();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				ifo.setOrder(CDAFactory.eINSTANCE.createOrder());
				ifo.getOrder().getIds().add(DatatypesFactory.eINSTANCE.createII());
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOfOrderId(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2InFulfillmentOfOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2InFulfillmentOfOrder() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2InFulfillmentOfOrderTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2InFulfillmentOfOrder",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.getInFulfillmentOfs().clear();
				InFulfillmentOf ifo = CDAFactory.eINSTANCE.createInFulfillmentOf();
				ifo.setOrder(CDAFactory.eINSTANCE.createOrder());
				target.getInFulfillmentOfs().add(ifo);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOfOrder(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2InFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				rp.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());

				ee.setResponsibleParty(rp);

				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().getAssignedEntity().getRepresentedOrganizations().add(
					CDAFactory.eINSTANCE.createOrganization());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				ee.setResponsibleParty(rp);
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ep.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());

				ee.getEncounterParticipants().add(ep);
				component.setEncompassingEncounter(ee);

				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				ep.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				ep.getAssignedEntity().setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				ee.getEncounterParticipants().add(ep);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.getEncounterParticipants().add(ep);
				component.setEncompassingEncounter(ee);

				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				ep.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterId(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(ts);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				target.getComponentOf().getEncompassingEncounter().setResponsibleParty(rp);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateConsultationNote2ComponentOfEncompassingEncounter() {
		OperationsTestCase<ConsultationNote2> validateConsultationNote2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateConsultationNote2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {
				target.init();
				target.setComponentOf(CDAFactory.eINSTANCE.createComponent1());
			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.getComponentOf().setEncompassingEncounter(CDAFactory.eINSTANCE.createEncompassingEncounter());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounter(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNote2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getAssessmentAndPlanSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForReferralSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getReasonForReferralSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getPhysicalExamSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getAllergiesSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getHistoryOfPastIllnessSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSectionEntriesOptional2() {

		ConsultationNote2 target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getMedicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getProblemSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional2() {

		ConsultationNote2 target = objectFactory.create();
		target.getProceduresSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getResultsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getSocialHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getVitalSignsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSectionEntriesOptional2() {

		ConsultationNote2 target = objectFactory.create();
		target.getAdvanceDirectivesSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getFunctionalStatusSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentSection2() {

		ConsultationNote2 target = objectFactory.create();
		target.getMedicalEquipmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getMentalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionSection() {

		ConsultationNote2 target = objectFactory.create();
		target.getNutritionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ConsultationNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(ConsultationNote2) objectToTest, diagnostician, map);
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
		OperationsTestCase<ConsultationNote2> validateGeneralHeaderConstraintsTitleTestCase = new OperationsTestCase<ConsultationNote2>(
			"validateGeneralHeaderConstraintsTitle",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote2 target) {

			}

			@Override
			protected void updateToPass(ConsultationNote2 target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNote2Operations.validateGeneralHeaderConstraintsTitle(
					(ConsultationNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ConsultationNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ConsultationNote2> {
		public ConsultationNote2 create() {
			return ConsolFactory.eINSTANCE.createConsultationNote2();
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
	private static class ConstructorTestClass extends ConsultationNote2Operations {
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

} // ConsultationNote2Operations
