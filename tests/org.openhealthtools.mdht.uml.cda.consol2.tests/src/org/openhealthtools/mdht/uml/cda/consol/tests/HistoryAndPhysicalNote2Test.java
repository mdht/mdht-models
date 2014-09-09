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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNote2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Information Recipient Intended Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Responsible Party Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Encounter Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Note2 Component Of Encompassing Encounter If More Precise Than Day Include Time Zone Offset</em>}</li>
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryAndPhysicalNote2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisitTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_CHIEF_COMPLAINT_OR_REASON_FOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
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
					public void updateToPass(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisitTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
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
					public void updateToPass(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_AND_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
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
					public void updateToPass(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_DOES_NOT_HAVE_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_WITH_CHIEF_COMPLAINT_SECTION_OR_REASON_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(HistoryAndPhysicalNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2CodeP() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2CodePTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2CodeP(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2Code() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2CodeTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				CE code = target.getCode();
				code.setCode("34117-2");
				code.setCodeSystem("2.16.840.1.113883.6.1");
			}

			@Override
			protected void setDependency(HistoryAndPhysicalNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Code(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2InformationRecipient() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2InformationRecipientTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2InformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InformationRecipient(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2InformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2Participant() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ParticipantTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2Participant",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				Participant1 par = CDAFactory.eINSTANCE.createParticipant1();
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Participant(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2InFulfillmentOf() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2InFulfillmentOfTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2InFulfillmentOf",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IN_FULFILLMENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.getInFulfillmentOfs().add(CDAFactory.eINSTANCE.createInFulfillmentOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InFulfillmentOf(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2InFulfillmentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOf() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOf(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2AssessmentSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2AssessmentSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2AssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

				ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2AssessmentSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2AssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2PlanOfTreatmentSection2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2PlanOfTreatmentSection2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2PlanOfTreatmentSection2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2PlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2AssessmentAndPlanSection2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2AssessmentAndPlanSection2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2AssessmentAndPlanSection2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2AssessmentAndPlanSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ChiefComplaintSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ChiefComplaintSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ChiefComplaintSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ChiefComplaintSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_CHIEF_COMPLAINT_AND_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				/* ChiefComplaintAndReasonForVisitSection */
				ChiefComplaintAndReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2GeneralStatusSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2GeneralStatusSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2GeneralStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

				ConsolFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2GeneralStatusSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2GeneralStatusSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PAST_ILLNESS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createHistoryOfPastIllnessSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_HISTORY_OF_PRESENT_ILLNESS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				/* HistoryOfPresentIllnessSection */
				HistoryOfPresentIllnessSection section =

				ConsolFactory.eINSTANCE.createHistoryOfPresentIllnessSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createImmunizationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2InstructionsSection2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2InstructionsSection2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2InstructionsSection2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createInstructionsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InstructionsSection2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2InstructionsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2PhysicalExamSection2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2PhysicalExamSection2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2PhysicalExamSection2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPhysicalExamSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2PhysicalExamSection2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2PhysicalExamSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_PROCEDURES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProceduresSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ReasonForVisitSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ReasonForVisitSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ReasonForVisitSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REASON_FOR_VISIT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				/* ReasonForVisitSection */
				ReasonForVisitSection section =

				ConsolFactory.eINSTANCE.createReasonForVisitSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ReasonForVisitSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ReasonForVisitSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createResultsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ReviewOfSystemsSection() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ReviewOfSystemsSectionTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ReviewOfSystemsSection(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2SocialHistorySection2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2SocialHistorySection2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2SocialHistorySection2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_SOCIAL_HISTORY_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createSocialHistorySection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2SocialHistorySection2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2SocialHistorySection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2TestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipientTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_INFORMATION_RECIPIENT_INTENDED_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				InformationRecipient ir = CDAFactory.eINSTANCE.createInformationRecipient();
				target.getInformationRecipients().add(ir);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				for (InformationRecipient ir : target.getInformationRecipients()) {
					ir.setIntendedRecipient(CDAFactory.eINSTANCE.createIntendedRecipient());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
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
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				Person person = CDAFactory.eINSTANCE.createPerson();

				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().getAssignedEntity().setAssignedPerson(
					person);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();
				ee.setResponsibleParty(rp);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getResponsibleParty().setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
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
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
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

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				ee.getEncounterParticipants().add(ep);

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().clear();

				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

				ep.setAssignedEntity(ae);

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheDay() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheDayTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheDay",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_DAY);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheDay(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheMinute() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheMinuteTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheMinute",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_MINUTE);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheMinute(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheSecond() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheSecondTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheSecond",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE);
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_SECOND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheSecond(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterPreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 component = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				component.setEncompassingEncounter(ee);
				target.setComponentOf(component);

				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
				ee.setEffectiveTime(ivlts);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(
					PRECISE_TO_MINUTE_WITH_TIMEZONE);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);

				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(ts);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

				target.getComponentOf().getEncompassingEncounter().setResponsibleParty(rp);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

				target.getComponentOf().getEncompassingEncounter().getEncounterParticipants().add(ep);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocationTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				cof.setEncompassingEncounter(ee);

				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();

				target.setComponentOf(cof);

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();

				target.getComponentOf().setEncompassingEncounter(ee);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getAssessmentAndPlanSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintAndReasonForVisitSection() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getChiefComplaintAndReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPastIllnessSection2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getHistoryOfPastIllnessSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllnessSection() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getHistoryOfPresentIllnessSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSectionEntriesOptional2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getImmunizationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructionsSection2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getInstructionsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSectionEntriesOptional2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getPhysicalExamSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSectionEntriesOptional2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getProblemSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSectionEntriesOptional2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getProceduresSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReasonForVisitSection() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getReasonForVisitSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSectionEntriesOptional2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getResultsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getSocialHistorySection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSectionEntriesOptional2() {

		HistoryAndPhysicalNote2 target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<HistoryAndPhysicalNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<HistoryAndPhysicalNote2>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote2 target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(HistoryAndPhysicalNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryAndPhysicalNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryAndPhysicalNote2> {
		public HistoryAndPhysicalNote2 create() {
			return ConsolFactory.eINSTANCE.createHistoryAndPhysicalNote2();
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
	private static class ConstructorTestClass extends HistoryAndPhysicalNote2Operations {
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

} // HistoryAndPhysicalNote2Operations
