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
import org.eclipse.mdht.uml.cda.AssociatedEntity;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.InformationRecipient;
import org.eclipse.mdht.uml.cda.IntendedRecipient;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Participant1;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.ReferralNote;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReferralNoteOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Referral Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Does Not Have Assement And Plan Section2 When Assement And Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiver(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNotePlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteHistoryOfPresentIllnessSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteImmunizationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Immunizations Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteProblemSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteProceduresSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteResultsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteSocialHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteVitalSignsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteFunctionalStatusSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNotePhysicalExamSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Advance Directives Section Entries Optional2b</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteNutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteMentalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteMedicalEquipmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAllergiesSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteAssessmentAndPlanSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteHistoryOfPastIllnessSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteMedicationsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteReasonForReferralSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Reason For Referral Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteFamilyHistorySection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteInformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCaregiverAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Caregiver Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateReferralNoteParticipantCallbackContactAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Referral Note Participant Callback Contact Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAdvanceDirectivesSectionEntriesOptional2() <em>Get Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getHistoryOfPresentIllnessSection() <em>Get History Of Present Illness Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getImmunizationsSection2() <em>Get Immunizations Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getProblemSection2() <em>Get Problem Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getProceduresSectionEntriesOptional2() <em>Get Procedures Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getResultsSection2() <em>Get Results Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getSocialHistorySection2() <em>Get Social History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getVitalSignsSection2() <em>Get Vital Signs Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getFunctionalStatusSection2() <em>Get Functional Status Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getPhysicalExamSection2() <em>Get Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAdvanceDirectivesSectionEntriesOptional2b() <em>Get Advance Directives Section Entries Optional2b</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getMentalStatusSection() <em>Get Mental Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getMedicalEquipmentSection2() <em>Get Medical Equipment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAllergiesSection2() <em>Get Allergies Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getAssessmentAndPlanSection2() <em>Get Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getHistoryOfPastIllnessSection2() <em>Get History Of Past Illness Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getMedicationsSection2() <em>Get Medications Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getReasonForReferralSection2() <em>Get Reason For Referral Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#getFamilyHistorySection2() <em>Get Family History Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReferralNote#validateUSRealmHeader2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReferralNoteTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReferralNote target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReferralNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReferralNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ReferralNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ReferralNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent() {
		OperationsTestCase<ReferralNote> validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReferralNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReferralNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ReferralNote target) {
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
					public void updateToPass(ReferralNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ReferralNote target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteCodeP() {
		OperationsTestCase<ReferralNote> validateReferralNoteCodePTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteCodeP(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteCode",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("NotCurrentlyChecked", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected void setDependency(ReferralNote target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ReferralNoteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteCode((ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteInformationRecipient() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipient", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.getInformationRecipients().add(CDAFactory.eINSTANCE.createInformationRecipient());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipient(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiver() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiver", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiver(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContact() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContact", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContact(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNotePlanOfTreatmentSection2() {
		OperationsTestCase<ReferralNote> validateReferralNotePlanOfTreatmentSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNotePlanOfTreatmentSection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNotePlanOfTreatmentSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNotePlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteAdvanceDirectivesSectionEntriesOptional2() {
		OperationsTestCase<ReferralNote> validateReferralNoteAdvanceDirectivesSectionEntriesOptional2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteAdvanceDirectivesSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteAdvanceDirectivesSectionEntriesOptional2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteAdvanceDirectivesSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteHistoryOfPresentIllnessSection() {
		OperationsTestCase<ReferralNote> validateReferralNoteHistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteHistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

						ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteHistoryOfPresentIllnessSection(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteHistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteImmunizationsSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteImmunizationsSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteImmunizationsSection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_IMMUNIZATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createImmunizationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteImmunizationsSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteImmunizationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteProblemSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteProblemSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteProblemSection2",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_PROBLEM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProblemSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteProblemSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteProblemSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteProceduresSectionEntriesOptional2() {
		OperationsTestCase<ReferralNote> validateReferralNoteProceduresSectionEntriesOptional2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteProceduresSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteProceduresSectionEntriesOptional2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteProceduresSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteResultsSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteResultsSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteResultsSection2",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_RESULTS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createResultsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteResultsSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteResultsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteReviewOfSystemsSection() {
		OperationsTestCase<ReferralNote> validateReferralNoteReviewOfSystemsSectionTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteReviewOfSystemsSection", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

						ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteReviewOfSystemsSection(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteSocialHistorySection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteSocialHistorySection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteSocialHistorySection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createSocialHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteSocialHistorySection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteSocialHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteVitalSignsSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteVitalSignsSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteVitalSignsSection2",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_VITAL_SIGNS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteVitalSignsSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteVitalSignsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteFunctionalStatusSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteFunctionalStatusSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteFunctionalStatusSection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_FUNCTIONAL_STATUS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFunctionalStatusSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteFunctionalStatusSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteFunctionalStatusSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNotePhysicalExamSection2() {
		OperationsTestCase<ReferralNote> validateReferralNotePhysicalExamSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNotePhysicalExamSection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPhysicalExamSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNotePhysicalExamSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNotePhysicalExamSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteAdvanceDirectivesSectionEntriesOptional2b() {
		OperationsTestCase<ReferralNote> validateReferralNoteAdvanceDirectivesSectionEntriesOptional2bTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_ADVANCE_DIRECTIVES_SECTION_ENTRIES_OPTIONAL2B__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAdvanceDirectivesSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteAdvanceDirectivesSectionEntriesOptional2b(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteAdvanceDirectivesSectionEntriesOptional2bTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteNutritionSection() {
		OperationsTestCase<ReferralNote> validateReferralNoteNutritionSectionTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteNutritionSection",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

				/* NutritionSection */
				NutritionSection section =

						ConsolFactory.eINSTANCE.createNutritionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteNutritionSection(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteNutritionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteMentalStatusSection() {
		OperationsTestCase<ReferralNote> validateReferralNoteMentalStatusSectionTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteMentalStatusSection", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_MENTAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

				/* MentalStatusSection */
				MentalStatusSection section =

						ConsolFactory.eINSTANCE.createMentalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteMentalStatusSection(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteMentalStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteMedicalEquipmentSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteMedicalEquipmentSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteMedicalEquipmentSection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_MEDICAL_EQUIPMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicalEquipmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteMedicalEquipmentSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteMedicalEquipmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteAllergiesSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteAllergiesSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteAllergiesSection2",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_ALLERGIES_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteAllergiesSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteAllergiesSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteAssessmentSection() {
		OperationsTestCase<ReferralNote> validateReferralNoteAssessmentSectionTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteAssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

						ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteAssessmentSection(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteAssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteAssessmentAndPlanSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteAssessmentAndPlanSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteAssessmentAndPlanSection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteAssessmentAndPlanSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteAssessmentAndPlanSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteHistoryOfPastIllnessSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteHistoryOfPastIllnessSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteHistoryOfPastIllnessSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteHistoryOfPastIllnessSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteHistoryOfPastIllnessSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReferralNoteGeneralStatusSection() {
		OperationsTestCase<ReferralNote> validateReferralNoteGeneralStatusSectionTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteGeneralStatusSection", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

						ConsolFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteGeneralStatusSection(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteGeneralStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteMedicationsSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteMedicationsSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteMedicationsSection2",
			operationsForOCL.getOCLValue("VALIDATE_REFERRAL_NOTE_MEDICATIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicationsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteMedicationsSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteMedicationsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteReasonForReferralSection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteReasonForReferralSection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteReasonForReferralSection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_REASON_FOR_REFERRAL_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createReasonForReferralSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteReasonForReferralSection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteReasonForReferralSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteFamilyHistorySection2() {
		OperationsTestCase<ReferralNote> validateReferralNoteFamilyHistorySection2TestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteFamilyHistorySection2", operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_FAMILY_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createFamilyHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteFamilyHistorySection2(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteFamilyHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipientPersonName() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientPersonNameTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipientPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				InformationRecipient infoRec = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(infoRec);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				infoRec.setIntendedRecipient(intendedRec);
				Person infoRecPerson = CDAFactory.eINSTANCE.createPerson();
				intendedRec.setInformationRecipient(infoRecPerson);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getInformationRecipients().get(
					0).getIntendedRecipient().getInformationRecipient().getNames().add(
						DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientPersonName(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipientAddr() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientAddrTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipientAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				InformationRecipient infoRec = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(infoRec);
				IntendedRecipient intRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				infoRec.setIntendedRecipient(intRec);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				IntendedRecipient intRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				intRec.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				target.getInformationRecipients().get(0).setIntendedRecipient(intRec);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientAddr(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipientTelecom() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientTelecomTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipientTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				InformationRecipient infoRec = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(infoRec);
				IntendedRecipient intRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				infoRec.setIntendedRecipient(intRec);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				IntendedRecipient intRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				intRec.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				target.getInformationRecipients().get(0).getIntendedRecipient().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientTelecom(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipientInformationRecipient() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientInformationRecipientTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				InformationRecipient infoRec = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(infoRec);
				IntendedRecipient intendedRec = CDAFactory.eINSTANCE.createIntendedRecipient();
				infoRec.setIntendedRecipient(intendedRec);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				Person infoRecPerson = CDAFactory.eINSTANCE.createPerson();
				target.getInformationRecipients().get(0).getIntendedRecipient().setInformationRecipient(infoRecPerson);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipientInformationRecipient(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteInformationRecipientIntendedRecipient() {
		OperationsTestCase<ReferralNote> validateReferralNoteInformationRecipientIntendedRecipientTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteInformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				target.getInformationRecipients().add(CDAFactory.eINSTANCE.createInformationRecipient());
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				IntendedRecipient ir = CDAFactory.eINSTANCE.createIntendedRecipient();
				target.getInformationRecipients().get(0).setIntendedRecipient(ir);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteInformationRecipientIntendedRecipient(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteInformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
				Person aPer = CDAFactory.eINSTANCE.createPerson();
				ae.setAssociatedPerson(aPer);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonName(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityClassCodePTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				for (Participant1 par : target.getParticipants()) {
					par.setTypeCode(ParticipationType.IND);
					par.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				}
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.PRS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeP(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntityClassCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				for (Participant1 par : target.getParticipants()) {
					par.setTypeCode(ParticipationType.IND);
					par.setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				}
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				// incorrect value but only checking for classCode element
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.PRS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityClassCode(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPerson(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverTypeCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverTypeCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific Participation type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.ADM);
				target.getParticipants().add(par);

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().clear();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverTypeCode(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCaregiverAssociatedEntity() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCaregiverAssociatedEntityTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCaregiverAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CAREGIVER_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.IND);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCaregiverAssociatedEntity(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCaregiverAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
				Person p = CDAFactory.eINSTANCE.createPerson();
				ae.setAssociatedPerson(p);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonName(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityId() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityIdTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).getAssociatedEntity().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityId(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityAddr() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityAddrTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).getAssociatedEntity().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAddr(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityTelecom() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityTelecomTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).getAssociatedEntity().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityTelecom(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityClassCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityClassCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				target.getParticipants().get(0).setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.ASSIGNED);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityClassCode(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				Person p = CDAFactory.eINSTANCE.createPerson();
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPerson(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				par.setAssociatedEntity(ae);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				Organization so = CDAFactory.eINSTANCE.createOrganization();
				target.getParticipants().get(0).getAssociatedEntity().setScopingOrganization(so);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganization(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactTypeCode() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactTypeCodeTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// It is not possible for this test to fail since @typeCode is used for identification of the specific Participation type and sub
				// requirements. Without a unique @typeCode no sub rules are enforced in the first place.
				skipFailsTest();
			}

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.ADM);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.getParticipants().clear();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactTypeCode(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReferralNoteParticipantCallbackContactAssociatedEntity() {
		OperationsTestCase<ReferralNote> validateReferralNoteParticipantCallbackContactAssociatedEntityTestCase = new OperationsTestCase<ReferralNote>(
			"validateReferralNoteParticipantCallbackContactAssociatedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFERRAL_NOTE_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				par.setTypeCode(ParticipationType.CALLBCK);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(ReferralNote target) {
				AssociatedEntity ae = CDAFactory.eINSTANCE.createAssociatedEntity();
				target.getParticipants().get(0).setAssociatedEntity(ae);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateReferralNoteParticipantCallbackContactAssociatedEntity(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateReferralNoteParticipantCallbackContactAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		ReferralNote target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSectionEntriesOptional2() {

		ReferralNote target = objectFactory.create();
		target.getAdvanceDirectivesSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		ReferralNote target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection2() {

		ReferralNote target = objectFactory.create();
		target.getImmunizationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection2() {

		ReferralNote target = objectFactory.create();
		target.getProblemSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional2() {

		ReferralNote target = objectFactory.create();
		target.getProceduresSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSection2() {

		ReferralNote target = objectFactory.create();
		target.getResultsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ReferralNote target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection2() {

		ReferralNote target = objectFactory.create();
		target.getSocialHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection2() {

		ReferralNote target = objectFactory.create();
		target.getVitalSignsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusSection2() {

		ReferralNote target = objectFactory.create();
		target.getFunctionalStatusSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection2() {

		ReferralNote target = objectFactory.create();
		target.getPhysicalExamSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectivesSectionEntriesOptional2b() {

		ReferralNote target = objectFactory.create();
		target.getAdvanceDirectivesSectionEntriesOptional2b();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionSection() {

		ReferralNote target = objectFactory.create();
		target.getNutritionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMentalStatusSection() {

		ReferralNote target = objectFactory.create();
		target.getMentalStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicalEquipmentSection2() {

		ReferralNote target = objectFactory.create();
		target.getMedicalEquipmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSection2() {

		ReferralNote target = objectFactory.create();
		target.getAllergiesSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		ReferralNote target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection2() {

		ReferralNote target = objectFactory.create();
		target.getAssessmentAndPlanSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection2() {

		ReferralNote target = objectFactory.create();
		target.getHistoryOfPastIllnessSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		ReferralNote target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection2() {

		ReferralNote target = objectFactory.create();
		target.getMedicationsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForReferralSection2() {

		ReferralNote target = objectFactory.create();
		target.getReasonForReferralSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection2() {

		ReferralNote target = objectFactory.create();
		target.getFamilyHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateUSRealmHeader2TemplateId() {
		OperationsTestCase<ReferralNote> validateUSRealmHeader2TemplateIdTestCase = new OperationsTestCase<ReferralNote>(
			"validateUSRealmHeader2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_US_REALM_HEADER2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReferralNote target) {

			}

			@Override
			protected void updateToPass(ReferralNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReferralNoteOperations.validateUSRealmHeader2TemplateId(
					(ReferralNote) objectToTest, diagnostician, map);
			}

		};

		validateUSRealmHeader2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReferralNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReferralNote> {
		@Override
		public ReferralNote create() {
			return ConsolFactory.eINSTANCE.createReferralNote();
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
	private static class ConstructorTestClass extends ReferralNoteOperations {
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

} // ReferralNoteOperations
