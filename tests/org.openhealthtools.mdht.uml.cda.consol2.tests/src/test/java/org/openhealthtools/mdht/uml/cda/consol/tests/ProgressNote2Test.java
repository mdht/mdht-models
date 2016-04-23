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
import org.eclipse.mdht.uml.cda.Component1;
import org.eclipse.mdht.uml.cda.DocumentationOf;
import org.eclipse.mdht.uml.cda.EncompassingEncounter;
import org.eclipse.mdht.uml.cda.Location;
import org.eclipse.mdht.uml.cda.ServiceEvent;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.IVXB_TS;
import org.eclipse.mdht.uml.hl7.vocab.ActClassRoot;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNote2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Has An Assement And Plan Section2 Or Both Assement Section And Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Does Not Have Assement And Plan Section2 When Assement Or Plan Of Treatment2 Are Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2AssessmentSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2PlanOfTreatmentSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2AssessmentAndPlanSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2AllergiesSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ChiefComplaintSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2InterventionsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Interventions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2InstructionsSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Instructions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2MedicationsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ObjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2PhysicalExamSection2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ProblemSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Problem Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ResultsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Results Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2SubjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2VitalSignsSectionEntriesOptional2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Vital Signs Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2NutritionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2DocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter US Realm Date And Time DT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location Health Care Facility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounterLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateProgressNote2ComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note2 Component Of Encompassing Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getPlanOfTreatmentSection2() <em>Get Plan Of Treatment Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getAssessmentAndPlanSection2() <em>Get Assessment And Plan Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getAllergiesSectionEntriesOptional2() <em>Get Allergies Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getInterventionsSection2() <em>Get Interventions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getInstructionsSection2() <em>Get Instructions Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getMedicationsSectionEntriesOptional2() <em>Get Medications Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getObjectiveSection() <em>Get Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getPhysicalExamSection2() <em>Get Physical Exam Section2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getProblemSectionEntriesOptional2() <em>Get Problem Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getResultsSectionEntriesOptional2() <em>Get Results Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getSubjectiveSection() <em>Get Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getVitalSignsSectionEntriesOptional2() <em>Get Vital Signs Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#getNutritionSection() <em>Get Nutrition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressNote2#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProgressNote2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_HAS_AN_ASSEMENT_AND_PLAN_SECTION2_OR_BOTH_ASSEMENT_SECTION_AND_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote2 target) {
						target.init();
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote2 target) {
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
					public void updateToPass(ProgressNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProgressNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOES_NOT_HAVE_ASSEMENT_AND_PLAN_SECTION2_WHEN_ASSEMENT_OR_PLAN_OF_TREATMENT2_ARE_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
					public void updateToFail(ProgressNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
					}

				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProgressNote2 target) {
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
					public void updateToPass(ProgressNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());

					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProgressNote2 target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentSection().init());
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2CodeP() {
		OperationsTestCase<ProgressNote2> validateProgressNote2CodePTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2CodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2CodeP(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2Code() {
		OperationsTestCase<ProgressNote2> validateProgressNote2CodeTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2Code",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				CE code = target.getCode();
				code.setCode("11506-3");
				code.setCodeSystem("2.16.840.1.113883.6.1");
			}

			@Override
			protected void setDependency(ProgressNote2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProgressNote2CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2Code(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2DocumentationOf() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOf(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ComponentOf() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOf",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOf(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2AssessmentSection() {
		OperationsTestCase<ProgressNote2> validateProgressNote2AssessmentSectionTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2AssessmentSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_ASSESSMENT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

				/* AssessmentSection */
				AssessmentSection section =

						ConsolFactory.eINSTANCE.createAssessmentSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2AssessmentSection(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2AssessmentSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2PlanOfTreatmentSection2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2PlanOfTreatmentSection2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2PlanOfTreatmentSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_PLAN_OF_TREATMENT_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2PlanOfTreatmentSection2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2PlanOfTreatmentSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2AssessmentAndPlanSection2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2AssessmentAndPlanSection2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2AssessmentAndPlanSection2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_ASSESSMENT_AND_PLAN_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2AssessmentAndPlanSection2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2AssessmentAndPlanSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2AllergiesSectionEntriesOptional2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2AllergiesSectionEntriesOptional2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2AllergiesSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_ALLERGIES_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createAllergiesSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2AllergiesSectionEntriesOptional2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2AllergiesSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ChiefComplaintSection() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ChiefComplaintSectionTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ChiefComplaintSection", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_CHIEF_COMPLAINT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

				/* ChiefComplaintSection */
				ChiefComplaintSection section =

						ConsolFactory.eINSTANCE.createChiefComplaintSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ChiefComplaintSection(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ChiefComplaintSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2InterventionsSection2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2InterventionsSection2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2InterventionsSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_INTERVENTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createInterventionsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2InterventionsSection2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2InterventionsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2InstructionsSection2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2InstructionsSection2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2InstructionsSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_INSTRUCTIONS_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createInstructionsSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2InstructionsSection2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2InstructionsSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2MedicationsSectionEntriesOptional2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2MedicationsSectionEntriesOptional2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2MedicationsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_MEDICATIONS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createMedicationsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2MedicationsSectionEntriesOptional2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2MedicationsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ObjectiveSection() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ObjectiveSectionTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ObjectiveSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

				/* ObjectiveSection */
				ObjectiveSection section =

						ConsolFactory.eINSTANCE.createObjectiveSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ObjectiveSection(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ObjectiveSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2PhysicalExamSection2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2PhysicalExamSection2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2PhysicalExamSection2", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_PHYSICAL_EXAM_SECTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createPhysicalExamSection2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2PhysicalExamSection2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2PhysicalExamSection2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ProblemSectionEntriesOptional2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ProblemSectionEntriesOptional2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ProblemSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_PROBLEM_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createProblemSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ProblemSectionEntriesOptional2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ProblemSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ResultsSectionEntriesOptional2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ResultsSectionEntriesOptional2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ResultsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_RESULTS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createResultsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ResultsSectionEntriesOptional2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ResultsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2ReviewOfSystemsSection() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ReviewOfSystemsSectionTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ReviewOfSystemsSection", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

						ConsolFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ReviewOfSystemsSection(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressNote2SubjectiveSection() {
		OperationsTestCase<ProgressNote2> validateProgressNote2SubjectiveSectionTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2SubjectiveSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

				/* SubjectiveSection */
				SubjectiveSection section =

						ConsolFactory.eINSTANCE.createSubjectiveSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2SubjectiveSection(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2SubjectiveSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2VitalSignsSectionEntriesOptional2() {
		OperationsTestCase<ProgressNote2> validateProgressNote2VitalSignsSectionEntriesOptional2TestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2VitalSignsSectionEntriesOptional2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_VITAL_SIGNS_SECTION_ENTRIES_OPTIONAL2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();
				target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2VitalSignsSectionEntriesOptional2(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2VitalSignsSectionEntriesOptional2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2NutritionSection() {
		OperationsTestCase<ProgressNote2> validateProgressNote2NutritionSectionTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2NutritionSection",
			operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_NUTRITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

				/* NutritionSection */
				NutritionSection section =

						ConsolFactory.eINSTANCE.createNutritionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2NutritionSection(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2NutritionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();

				low.setValue("12345");
				ts.setLow(low);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLow(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventUSRealmDateAndTimeDTLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProgressNote2DocumentationOfServiceEventPreciseToTheDay() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventPreciseToTheDayTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2DocumentationOfServiceEventPreciseToTheDay",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_DAY);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventPreciseToTheDay(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2DocumentationOfServiceEventPreciseToTheDayTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProgressNote2DocumentationOfServiceEventPreciseToTheMinute() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2DocumentationOfServiceEventPreciseToTheMinute",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// low.setValue("2009121217");
	// ts.setLow(low);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventPreciseToTheMinute(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2DocumentationOfServiceEventPreciseToTheMinuteTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProgressNote2DocumentationOfServiceEventPreciseToTheSecond() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventPreciseToTheSecondTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2DocumentationOfServiceEventPreciseToTheSecond",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
	// IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
	// high.setValue(PRECISE_TO_MINUTE);
	// ts.setHigh(high);
	// se.setEffectiveTime(ts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_SECOND);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventPreciseToTheSecond(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2DocumentationOfServiceEventPreciseToTheSecondTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
	// ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
	// se.setEffectiveTime(ivlts);
	// dof.setServiceEvent(se);
	// target.getDocumentationOfs().add(dof);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
	// PRECISE_TO_MS_WITH_TIMEZONE);
	// target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
	// PRECISE_TO_HOUR_WITH_TIMEZONE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2DocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventTemplateId() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventTemplateIdTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				target.getDocumentationOfs().add(dof);
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				for (DocumentationOf dof : target.getDocumentationOfs()) {
					dof.getServiceEvent().getTemplateIds().add(
						DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.10.20.21.3.1"));
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventTemplateId(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventClassCode() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				se.setClassCode(ActClassRoot.PCPR);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventClassCode(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEventEffectiveTime(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2DocumentationOfServiceEvent() {
		OperationsTestCase<ProgressNote2> validateProgressNote2DocumentationOfServiceEventTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2DocumentationOfServiceEvent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();

				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2DocumentationOfServiceEvent(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2DocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLowTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_US_REALM_DATE_AND_TIME_DT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				ee.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setLow(
					DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLow(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterUSRealmDateAndTimeDTLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityIdTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());
				target.getComponentOf().getEncompassingEncounter().getLocation().setHealthCareFacility(
					CDAFactory.eINSTANCE.createHealthCareFacility());
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getLocation().getHealthCareFacility().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityId(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION_HEALTH_CARE_FACILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				ee.setLocation(CDAFactory.eINSTANCE.createLocation());
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				Location loc = CDAFactory.eINSTANCE.createLocation();
				loc.setHealthCareFacility(CDAFactory.eINSTANCE.createHealthCareFacility());
				ee.setLocation(loc);
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacility(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterLocationHealthCareFacilityTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDay() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDayTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDay",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// Component1 component = CDAFactory.eINSTANCE.createComponent1();
	// EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
	// component.setEncompassingEncounter(ee);
	// target.setComponentOf(component);
	//
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912");
	// ee.setEffectiveTime(ivlts);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_DAY);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDay(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheDayTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinute() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinuteTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinute",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// Component1 component = CDAFactory.eINSTANCE.createComponent1();
	// EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
	// component.setEncompassingEncounter(ee);
	// target.setComponentOf(component);
	//
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
	// ee.setEffectiveTime(ivlts);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_MINUTE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinute(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheMinuteTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecond() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecondTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecond",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// Component1 component = CDAFactory.eINSTANCE.createComponent1();
	// EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
	// component.setEncompassingEncounter(ee);
	// target.setComponentOf(component);
	//
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE);
	// ee.setEffectiveTime(ivlts);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(PRECISE_TO_SECOND);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecond(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2ComponentOfEncompassingEncounterPreciseToTheSecondTestCase.doValidationTest();
	// }
	//
	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset() {
	// OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new
	// OperationsTestCase<ProgressNote2>(
	// "validateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset",
	// operationsForOCL.getOCLValue("VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(ProgressNote2 target) {
	// target.init();
	// Component1 component = CDAFactory.eINSTANCE.createComponent1();
	// EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
	// component.setEncompassingEncounter(ee);
	// target.setComponentOf(component);
	//
	// IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("2009121217");
	// ee.setEffectiveTime(ivlts);
	// }
	//
	// @Override
	// protected void updateToPass(ProgressNote2 target) {
	// target.getComponentOf().getEncompassingEncounter().getEffectiveTime().setValue(
	// PRECISE_TO_HOUR_WITH_TIMEZONE);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffset(
	// (ProgressNote2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateProgressNote2ComponentOfEncompassingEncounterIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterId() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterIdTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getComponentOf().getEncompassingEncounter().getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterId(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterEffectiveTime() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getComponentOf().getEncompassingEncounter().setEffectiveTime(
					DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterEffectiveTime(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounterLocation() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterLocationTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounterLocation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
				cof.setEncompassingEncounter(ee);
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getComponentOf().getEncompassingEncounter().setLocation(CDAFactory.eINSTANCE.createLocation());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounterLocation(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressNote2ComponentOfEncompassingEncounter() {
		OperationsTestCase<ProgressNote2> validateProgressNote2ComponentOfEncompassingEncounterTestCase = new OperationsTestCase<ProgressNote2>(
			"validateProgressNote2ComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_NOTE2_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {
				target.init();
				Component1 cof = CDAFactory.eINSTANCE.createComponent1();
				target.setComponentOf(cof);
			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.getComponentOf().setEncompassingEncounter(CDAFactory.eINSTANCE.createEncompassingEncounter());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateProgressNote2ComponentOfEncompassingEncounter(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateProgressNote2ComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentSection() {

		ProgressNote2 target = objectFactory.create();
		target.getAssessmentSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfTreatmentSection2() {

		ProgressNote2 target = objectFactory.create();
		target.getPlanOfTreatmentSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentAndPlanSection2() {

		ProgressNote2 target = objectFactory.create();
		target.getAssessmentAndPlanSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergiesSectionEntriesOptional2() {

		ProgressNote2 target = objectFactory.create();
		target.getAllergiesSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChiefComplaintSection() {

		ProgressNote2 target = objectFactory.create();
		target.getChiefComplaintSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInterventionsSection2() {

		ProgressNote2 target = objectFactory.create();
		target.getInterventionsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructionsSection2() {

		ProgressNote2 target = objectFactory.create();
		target.getInstructionsSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSectionEntriesOptional2() {

		ProgressNote2 target = objectFactory.create();
		target.getMedicationsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetObjectiveSection() {

		ProgressNote2 target = objectFactory.create();
		target.getObjectiveSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamSection2() {

		ProgressNote2 target = objectFactory.create();
		target.getPhysicalExamSection2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSectionEntriesOptional2() {

		ProgressNote2 target = objectFactory.create();
		target.getProblemSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResultsSectionEntriesOptional2() {

		ProgressNote2 target = objectFactory.create();
		target.getResultsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ProgressNote2 target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSubjectiveSection() {

		ProgressNote2 target = objectFactory.create();
		target.getSubjectiveSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSectionEntriesOptional2() {

		ProgressNote2 target = objectFactory.create();
		target.getVitalSignsSectionEntriesOptional2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionSection() {

		ProgressNote2 target = objectFactory.create();
		target.getNutritionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ProgressNote2> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ProgressNote2>(
			"validateGeneralHeaderConstraintsTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressNote2 target) {

			}

			@Override
			protected void updateToPass(ProgressNote2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressNote2Operations.validateGeneralHeaderConstraintsTemplateId(
					(ProgressNote2) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProgressNote2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ProgressNote2> {
		public ProgressNote2 create() {
			return ConsolFactory.eINSTANCE.createProgressNote2();
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
	private static class ConstructorTestClass extends ProgressNote2Operations {
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

} // ProgressNote2Operations
