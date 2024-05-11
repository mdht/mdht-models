/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfTreatmentSection2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Treatment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2HandoffCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2NutritionRecommendation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2PlannedImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Planned Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2GoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedObservation2s() <em>Get Consol Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedEncounter2s() <em>Get Consol Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedAct2s() <em>Get Consol Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedProcedure2s() <em>Get Consol Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedMedicationActivity2s() <em>Get Consol Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedSupply2s() <em>Get Consol Planned Supply2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolInstruction2s() <em>Get Consol Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getHandoffCommunications() <em>Get Handoff Communications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getNutritionRecommendations() <em>Get Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getPlannedImmunizationActivities() <em>Get Planned Immunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivityEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlanOfCareActivitySupply(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Plan Of Care Activity Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfTreatmentSection2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlanOfTreatmentSection2TemplateId() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2TemplateIdTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2TemplateId(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfTreatmentSection2HandoffCommunication() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2HandoffCommunicationTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2HandoffCommunication",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createHandoffCommunicationParticipants().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2HandoffCommunication(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2HandoffCommunicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfTreatmentSection2NutritionRecommendation() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2NutritionRecommendationTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2NutritionRecommendation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createNutritionRecommendation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2NutritionRecommendation(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2NutritionRecommendationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfTreatmentSection2PlannedImmunizationActivity() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2PlannedImmunizationActivityTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2PlannedImmunizationActivity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createPlannedImmunizationActivity().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2PlannedImmunizationActivity(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2PlannedImmunizationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfTreatmentSection2GoalObservation() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2GoalObservationTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2GoalObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_TREATMENT_SECTION2_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createGoalObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2GoalObservation(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2GoalObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPlannedObservation2s() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getConsolPlannedObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPlannedEncounter2s() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getConsolPlannedEncounter2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPlannedAct2s() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getConsolPlannedAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPlannedProcedure2s() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getConsolPlannedProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPlannedMedicationActivity2s() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getConsolPlannedMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolPlannedSupply2s() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getConsolPlannedSupply2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolInstruction2s() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getConsolInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHandoffCommunications() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getHandoffCommunications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionRecommendations() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getNutritionRecommendations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedImmunizationActivities() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getPlannedImmunizationActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGoalObservations() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getGoalObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCodeP() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionCodePTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionCodeP(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionCode() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionCodeTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {

			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.init();

			}

			@Override
			protected void setDependency(PlanOfTreatmentSection2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSectionCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionCode(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlanOfCareActivityObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addObservation(ConsolFactory.eINSTANCE.createPlannedObservation2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlanOfCareActivityObservation(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityEncounter() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlanOfCareActivityEncounterTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlanOfCareActivityEncounter",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addEncounter(ConsolFactory.eINSTANCE.createPlannedEncounter2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlanOfCareActivityEncounter(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityAct() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlanOfCareActivityActTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlanOfCareActivityAct",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createPlannedAct2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlanOfCareActivityAct(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivityProcedure() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlanOfCareActivityProcedureTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlanOfCareActivityProcedure",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addProcedure(ConsolFactory.eINSTANCE.createPlannedProcedure2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlanOfCareActivityProcedure(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createPlannedMedicationActivity2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlanOfCareActivitySupply() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlanOfCareActivitySupplyTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlanOfCareActivitySupply",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addSupply(ConsolFactory.eINSTANCE.createPlannedSupply2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlanOfCareActivitySupply(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlanOfCareActivitySupplyTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionInstructions() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionInstructionsTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionInstructions",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createInstruction2().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionInstructions(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfTreatmentSection2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfTreatmentSection2> {
		@Override
		public PlanOfTreatmentSection2 create() {
			return ConsolFactory.eINSTANCE.createPlanOfTreatmentSection2();
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
	private static class ConstructorTestClass extends PlanOfTreatmentSection2Operations {
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

} // PlanOfTreatmentSection2Operations
