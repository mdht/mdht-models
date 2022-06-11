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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentActMood;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation;
import org.openhealthtools.mdht.uml.cda.consol.operations.NutritionRecommendationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nutrition Recommendation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedEncounter2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Encounter2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedSupply2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Supply2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#validateNutritionRecommendationPlannedAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nutrition Recommendation Planned Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#getPlannedEncounter2s() <em>Get Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#getPlannedMedicationActivity2s() <em>Get Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#getPlannedObservation2s() <em>Get Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#getPlannedProcedure2s() <em>Get Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#getPlannedSupply2s() <em>Get Planned Supply2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendation#getPlannedAct2s() <em>Get Planned Act2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NutritionRecommendationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationTemplateId() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationTemplateIdTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationTemplateId(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationClassCode() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationClassCodeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationClassCode(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationMoodCodeP() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationMoodCodePTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationMoodCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.INT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationMoodCodeP(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationMoodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationMoodCode() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationMoodCodeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				// skipping fail test as cannot create a moodCode w/o a value
				// and all possible values are part of the correct required valueSet
				skipFailsTest();
			}

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.INT);
			}

			@Override
			protected void setDependency(NutritionRecommendation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationMoodCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationMoodCode(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationCodeP() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationCodePTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationCodeP(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationCode() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationCodeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationCode",
			operationsForOCL.getOCLValue("VALIDATE_NUTRITION_RECOMMENDATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCode("61310001");
				code.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(code);
			}

			@Override
			protected void setDependency(NutritionRecommendation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.NutritionRecommendationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationCode(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationStatusCode() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationStatusCodeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationStatusCode(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationStatusCodeP() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationStatusCodePTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {
				target.init();
				target.setStatusCode(null);
			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				CS cs = DatatypesFactory.eINSTANCE.createCS();
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationStatusCodeP(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNutritionRecommendationEffectiveTime() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationEffectiveTimeTestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {

			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationEffectiveTime(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationPlannedEncounter2() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedEncounter2TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedEncounter2",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {
				target.init();
			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setEncounter(ConsolFactory.eINSTANCE.createPlannedEncounter2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedEncounter2(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedEncounter2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationPlannedMedicationActivity2() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedMedicationActivity2TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedMedicationActivity2",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {
				target.init();
			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createPlannedMedicationActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedMedicationActivity2(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationPlannedObservation2() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedObservation2TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {
				target.init();
			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createPlannedObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedObservation2(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationPlannedProcedure2() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedProcedure2TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedProcedure2",
			operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {
				target.init();
			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setProcedure(ConsolFactory.eINSTANCE.createPlannedProcedure2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedProcedure2(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationPlannedSupply2() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedSupply2TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedSupply2", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {
				target.init();
			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSupply(ConsolFactory.eINSTANCE.createPlannedSupply2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedSupply2(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedSupply2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateNutritionRecommendationPlannedAct2() {
		OperationsTestCase<NutritionRecommendation> validateNutritionRecommendationPlannedAct2TestCase = new OperationsTestCase<NutritionRecommendation>(
			"validateNutritionRecommendationPlannedAct2", operationsForOCL.getOCLValue(
				"VALIDATE_NUTRITION_RECOMMENDATION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NutritionRecommendation target) {
				target.init();
			}

			@Override
			protected void updateToPass(NutritionRecommendation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createPlannedAct2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NutritionRecommendationOperations.validateNutritionRecommendationPlannedAct2(
					(NutritionRecommendation) objectToTest, diagnostician, map);
			}

		};

		validateNutritionRecommendationPlannedAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedEncounter2s() {

		NutritionRecommendation target = objectFactory.create();
		target.getPlannedEncounter2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedMedicationActivity2s() {

		NutritionRecommendation target = objectFactory.create();
		target.getPlannedMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedObservation2s() {

		NutritionRecommendation target = objectFactory.create();
		target.getPlannedObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedure2s() {

		NutritionRecommendation target = objectFactory.create();
		target.getPlannedProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedSupply2s() {

		NutritionRecommendation target = objectFactory.create();
		target.getPlannedSupply2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedAct2s() {

		NutritionRecommendation target = objectFactory.create();
		target.getPlannedAct2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NutritionRecommendationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NutritionRecommendation> {
		public NutritionRecommendation create() {
			return ConsolFactory.eINSTANCE.createNutritionRecommendation();
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
	private static class ConstructorTestClass extends NutritionRecommendationOperations {
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

} // NutritionRecommendationOperations
