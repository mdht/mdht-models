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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Performer1;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;
import org.eclipse.mdht.uml.hl7.vocab.ActClassRoot;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.eclipse.mdht.uml.hl7.vocab.x_ServiceEventPerformer;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.CourseOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;
import org.openhealthtools.mdht.uml.cda.consol.operations.TransferSummaryOperations;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateUSRealmHeader2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransferSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransferSummary target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransferSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransferSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransferSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransferSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransferSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransferSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(TransferSummary target) {
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
					public void updateToPass(TransferSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(TransferSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryCodeP() {
		OperationsTestCase<TransferSummary> validateTransferSummaryCodePTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryCodeP(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("NotCurrentlyChecked", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected void setDependency(TransferSummary target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryTitle() {
		OperationsTestCase<TransferSummary> validateTransferSummaryTitleTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryTitle",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryTitle(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupport() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupport", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupport(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContact() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContact",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContact(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOf() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOf(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryAdvanceDirectivesSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryAdvanceDirectivesSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryAdvanceDirectivesSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_ADVANCE_DIRECTIVES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryAdvanceDirectivesSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryAdvanceDirectivesSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryAllergiesSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryAllergiesSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryAllergiesSection2", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryAllergiesSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryAllergiesSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryPhysicalExamSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryPhysicalExamSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryPhysicalExamSection2", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPhysicalExamSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryPhysicalExamSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryPhysicalExamSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryEncountersSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryEncountersSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryEncountersSection2", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_ENCOUNTERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createEncountersSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryEncountersSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryEncountersSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryFamilyHistorySection() {
		OperationsTestCase<TransferSummary> validateTransferSummaryFamilyHistorySectionTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryFamilyHistorySection", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

						ConsolFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryFamilyHistorySection(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryFunctionalStatusSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryFunctionalStatusSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryFunctionalStatusSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFunctionalStatusSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryFunctionalStatusSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryFunctionalStatusSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryImmunizationsSectionEntriesOptional2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryImmunizationsSectionEntriesOptional2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryImmunizationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryImmunizationsSectionEntriesOptional2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryImmunizationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryMedicalEquipmentSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryMedicalEquipmentSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryMedicalEquipmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicalEquipmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryMedicalEquipmentSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryMedicalEquipmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryMedicationsSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryMedicationsSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryMedicationsSection2", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryMedicationsSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryMedicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryPayersSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryPayersSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryPayersSection2",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PAYERS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPayersSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryPayersSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryPayersSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryPlanOfTreatmentSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryPlanOfTreatmentSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryPlanOfTreatmentSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryProblemSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryProblemSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryProblemSection2",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProblemSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryProblemSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryProblemSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryProceduresSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryProceduresSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryProceduresSection2", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PROCEDURES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProceduresSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryProceduresSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryProceduresSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryResultsSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryResultsSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryResultsSection2",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createResultsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryResultsSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryResultsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummarySocialHistorySection2() {
		OperationsTestCase<TransferSummary> validateTransferSummarySocialHistorySection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummarySocialHistorySection2", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createSocialHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummarySocialHistorySection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummarySocialHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryVitalSignsSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryVitalSignsSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryVitalSignsSection2", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryVitalSignsSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryVitalSignsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryMentalStatusSection() {
		OperationsTestCase<TransferSummary> validateTransferSummaryMentalStatusSectionTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryMentalStatusSection", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				/* MentalStatusSection */
				MentalStatusSection section =

						ConsolFactory.eINSTANCE.createMentalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryMentalStatusSection(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryMentalStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryGeneralStatusSection() {
		OperationsTestCase<TransferSummary> validateTransferSummaryGeneralStatusSectionTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryGeneralStatusSection", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

						ConsolFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryGeneralStatusSection(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryGeneralStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryReviewOfSystemsSection() {
		OperationsTestCase<TransferSummary> validateTransferSummaryReviewOfSystemsSectionTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryReviewOfSystemsSection", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

						ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryReviewOfSystemsSection(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryNutritionSection() {
		OperationsTestCase<TransferSummary> validateTransferSummaryNutritionSectionTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryNutritionSection",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				/* NutritionSection */
				NutritionSection section =

						ConsolFactory.eINSTANCE.createNutritionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryNutritionSection(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryNutritionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryReasonForReferralSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryReasonForReferralSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryReasonForReferralSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createReasonForReferralSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryReasonForReferralSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryReasonForReferralSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryHistoryOfPastIllnessSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryHistoryOfPastIllnessSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryHistoryOfPastIllnessSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryHistoryOfPastIllnessSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryHistoryOfPastIllnessSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryHistoryOfPresentIllnessSection() {
		OperationsTestCase<TransferSummary> validateTransferSummaryHistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryHistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

						ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryHistoryOfPresentIllnessSection(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryHistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryAssessmentAndPlanSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryAssessmentAndPlanSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryAssessmentAndPlanSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryAssessmentAndPlanSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryAssessmentAndPlanSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryAssessmentSection() {
		OperationsTestCase<TransferSummary> validateTransferSummaryAssessmentSectionTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryAssessmentSection", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

						ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryAssessmentSection(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDischargeDiagnosisSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDischargeDiagnosisSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDischargeDiagnosisSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DISCHARGE_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createDischargeDiagnosisSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDischargeDiagnosisSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDischargeDiagnosisSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryAdmissionMedicationsSectionEntriesOptional2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdmissionMedicationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryAdmissionMedicationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryAdmissionDiagnosisSection2() {
		OperationsTestCase<TransferSummary> validateTransferSummaryAdmissionDiagnosisSection2TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryAdmissionDiagnosisSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_ADMISSION_DIAGNOSIS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdmissionDiagnosisSection2().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryAdmissionDiagnosisSection2(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryAdmissionDiagnosisSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryCourseOfCareSection() {
		OperationsTestCase<TransferSummary> validateTransferSummaryCourseOfCareSectionTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryCourseOfCareSection", operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_COURSE_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				/* CourseOfCareSection */
				CourseOfCareSection section =

						ConsolFactory.eINSTANCE.createCourseOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryCourseOfCareSection(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryCourseOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityClassCodeP() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityClassCodePTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				// ACCESS is not in the valueSet but we are only checking that the code exists in this specific test
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.ACCESS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.PRS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific participant type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().clear();
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntity() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntity(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.ASSIGNED);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityId() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityIdTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityId(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAddr() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAddrTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecomTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setScopingOrganization(
					CDAFactory.eINSTANCE.createOrganization());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific participant type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().clear();
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntity() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntity(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific performer type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setTypeCode(
					x_ServiceEventPerformer.SPRF);
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().clear();
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setTypeCode(
					x_ServiceEventPerformer.PRF);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodePTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				ServiceEvent se = target.getDocumentationOfs().get(0).getServiceEvent();
				Performer1 p1 = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(p1);
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setFunctionCode(
					DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeP(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				ServiceEvent se = target.getDocumentationOfs().get(0).getServiceEvent();
				Performer1 p1 = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(p1);
				CE fcode = DatatypesFactory.eINSTANCE.createCE();
				p1.setFunctionCode(fcode);
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				CE fcode = DatatypesFactory.eINSTANCE.createCE("mustExistOnly", "2.16.840.1.113883.6.101");
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setFunctionCode(fcode);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().setClassCode(ActClassRoot.PCPR);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformer1() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformer1TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformer1",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformer1(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformer1TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEvent() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEvent(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSection2() {

		TransferSummary target = objectFactory.create();
		target.getAdvanceDirectivesSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSection2() {

		TransferSummary target = objectFactory.create();
		target.getAllergiesSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection2() {

		TransferSummary target = objectFactory.create();
		target.getPhysicalExamSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncountersSection2() {

		TransferSummary target = objectFactory.create();
		target.getEncountersSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		TransferSummary target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection2() {

		TransferSummary target = objectFactory.create();
		target.getFunctionalStatusSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSectionEntriesOptional2() {

		TransferSummary target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentSection2() {

		TransferSummary target = objectFactory.create();
		target.getMedicalEquipmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection2() {

		TransferSummary target = objectFactory.create();
		target.getMedicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPayersSection2() {

		TransferSummary target = objectFactory.create();
		target.getPayersSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		TransferSummary target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection2() {

		TransferSummary target = objectFactory.create();
		target.getProblemSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSection2() {

		TransferSummary target = objectFactory.create();
		target.getProceduresSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSection2() {

		TransferSummary target = objectFactory.create();
		target.getResultsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection2() {

		TransferSummary target = objectFactory.create();
		target.getSocialHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection2() {

		TransferSummary target = objectFactory.create();
		target.getVitalSignsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusSection() {

		TransferSummary target = objectFactory.create();
		target.getMentalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		TransferSummary target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		TransferSummary target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionSection() {

		TransferSummary target = objectFactory.create();
		target.getNutritionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForReferralSection2() {

		TransferSummary target = objectFactory.create();
		target.getReasonForReferralSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection2() {

		TransferSummary target = objectFactory.create();
		target.getHistoryOfPastIllnessSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		TransferSummary target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection2() {

		TransferSummary target = objectFactory.create();
		target.getAssessmentAndPlanSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		TransferSummary target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeDiagnosisSection2() {

		TransferSummary target = objectFactory.create();
		target.getDischargeDiagnosisSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdmissionMedicationsSectionEntriesOptional2() {

		TransferSummary target = objectFactory.create();
		target.getAdmissionMedicationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdmissionDiagnosisSection2() {

		TransferSummary target = objectFactory.create();
		target.getAdmissionDiagnosisSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCourseOfCareSection() {

		TransferSummary target = objectFactory.create();
		target.getCourseOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateUSRealmHeader2TemplateId() {
		OperationsTestCase<TransferSummary> validateUSRealmHeader2TemplateIdTestCase = new OperationsTestCase<TransferSummary>(
			"validateUSRealmHeader2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateUSRealmHeader2TemplateId(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TransferSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransferSummary> {
		@Override
		public TransferSummary create() {
			return ConsolFactory.eINSTANCE.createTransferSummary();
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
	private static class ConstructorTestClass extends TransferSummaryOperations {
	}

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

} // TransferSummaryOperations
