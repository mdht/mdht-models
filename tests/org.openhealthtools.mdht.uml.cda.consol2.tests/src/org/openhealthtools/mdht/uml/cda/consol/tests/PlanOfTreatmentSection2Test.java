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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfTreatmentSection2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Treatment Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedEncounter2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Encounter2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionPlannedSupply2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Planned Supply2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2HandoffCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Handoff Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfTreatmentSection2NutritionRecommendations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Treatment Section2 Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedObservation2s() <em>Get Consol Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedEncounter2s() <em>Get Consol Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedAct2s() <em>Get Consol Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedProcedure2s() <em>Get Consol Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedMedicationActivity2s() <em>Get Consol Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolPlannedSupply2s() <em>Get Consol Planned Supply2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getConsolInstruction2s() <em>Get Consol Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getHandoffCommunications() <em>Get Handoff Communications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#getNutritionRecommendationss() <em>Get Nutrition Recommendationss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2#validatePlanOfCareSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfTreatmentSection2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlannedObservation2() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlannedObservation2TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlannedObservation2",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedObservation2(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlannedObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlannedEncounter2() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlannedEncounter2TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlannedEncounter2",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedEncounter2(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlannedEncounter2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlannedAct2() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlannedAct2TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlannedAct2",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedAct2(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlannedAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlannedProcedure2() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlannedProcedure2TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlannedProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedProcedure2(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlannedProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlannedMedicationActivity2() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlannedMedicationActivity2TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlannedMedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedMedicationActivity2(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlannedMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionPlannedSupply2() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionPlannedSupply2TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionPlannedSupply2",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionPlannedSupply2(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionPlannedSupply2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareSectionInstruction2() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionInstruction2TestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionInstruction2",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionInstruction2(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionInstruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfTreatmentSection2HandoffCommunication() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2HandoffCommunicationTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2HandoffCommunication",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_TREATMENT_SECTION2_HANDOFF_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createHandoffCommunication().init());
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
	public void testValidatePlanOfTreatmentSection2NutritionRecommendations() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfTreatmentSection2NutritionRecommendationsTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfTreatmentSection2NutritionRecommendations",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_TREATMENT_SECTION2_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfTreatmentSection2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfTreatmentSection2 target) {
				target.addAct(ConsolFactory.eINSTANCE.createNutritionRecommendations().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfTreatmentSection2Operations.validatePlanOfTreatmentSection2NutritionRecommendations(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfTreatmentSection2NutritionRecommendationsTestCase.doValidationTest();
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
	public void testGetNutritionRecommendationss() {

		PlanOfTreatmentSection2 target = objectFactory.create();
		target.getNutritionRecommendationss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareSectionTemplateId() {
		OperationsTestCase<PlanOfTreatmentSection2> validatePlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<PlanOfTreatmentSection2>(
			"validatePlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PlanOfTreatmentSection2Operations.validatePlanOfCareSectionTemplateId(
					(PlanOfTreatmentSection2) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTemplateIdTestCase.doValidationTest();
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

} // PlanOfTreatmentSection2Operations
