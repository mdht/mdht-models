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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNutritionRecommendations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActActReferenceGoal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Act Reference Goal</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActAdvanceDirectiveObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Advance Directive Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActImmunizationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Immunization Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActEncounterActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Encounter Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActNonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedEncounter2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Encounter2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#validateInterventionActPlannedSupply2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intervention Act Planned Supply2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getNutritionRecommendationss() <em>Get Nutrition Recommendationss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getActReferences() <em>Get Act References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getActReferenceGoals() <em>Get Act Reference Goals</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getExternalDocumentReferences() <em>Get External Document References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getAdvanceDirectiveObservation2s() <em>Get Advance Directive Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getImmunizationActivity2s() <em>Get Immunization Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getMedicationActivity2s() <em>Get Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getProcedureActivityAct2s() <em>Get Procedure Activity Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getProcedureActivityObservation2s() <em>Get Procedure Activity Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getProcedureActivityProcedure2s() <em>Get Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getEncounterActivity2s() <em>Get Encounter Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getNonMedicinalSupplyActivity2s() <em>Get Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getPlannedAct2s() <em>Get Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getPlannedEncounter2s() <em>Get Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getPlannedObservation2s() <em>Get Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getPlannedProcedure2s() <em>Get Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getPlannedMedicationActivity2s() <em>Get Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InterventionAct#getPlannedSupply2s() <em>Get Planned Supply2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InterventionActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActTemplateId() {
		OperationsTestCase<InterventionAct> validateInterventionActTemplateIdTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActTemplateId(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActClassCode() {
		OperationsTestCase<InterventionAct> validateInterventionActClassCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActClassCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActMoodCodeP() {
		OperationsTestCase<InterventionAct> validateInterventionActMoodCodePTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActMoodCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.APT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActMoodCodeP(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActMoodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActMoodCode() {
		OperationsTestCase<InterventionAct> validateInterventionActMoodCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.DEF);
			}

			@Override
			protected void updateToPass(InterventionAct target) {

				target.setMoodCode(x_DocumentActMood.APT);
			}

			@Override
			protected void setDependency(InterventionAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.InterventionActMoodCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActMoodCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActId() {
		OperationsTestCase<InterventionAct> validateInterventionActIdTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActId",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActId(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActCodeP() {
		OperationsTestCase<InterventionAct> validateInterventionActCodePTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActCodeP(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActCode() {
		OperationsTestCase<InterventionAct> validateInterventionActCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

			}

			@Override
			protected void setDependency(InterventionAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.InterventionActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActStatusCode() {
		OperationsTestCase<InterventionAct> validateInterventionActStatusCodeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActStatusCode(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInterventionActEffectiveTime() {
		OperationsTestCase<InterventionAct> validateInterventionActEffectiveTimeTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEffectiveTime(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActGoalObservation() {
		OperationsTestCase<InterventionAct> validateInterventionActGoalObservationTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActGoalObservation",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createGoalObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActGoalObservation(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActGoalObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionAct() {
		OperationsTestCase<InterventionAct> validateInterventionActTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionAct",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createInterventionAct());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionAct(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActNutritionRecommendations() {
		OperationsTestCase<InterventionAct> validateInterventionActNutritionRecommendationsTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActNutritionRecommendations",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_NUTRITION_RECOMMENDATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createNutritionRecommendations());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActNutritionRecommendations(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActNutritionRecommendationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActActReference() {
		OperationsTestCase<InterventionAct> validateInterventionActActReferenceTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActActReference",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActActReference(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActActReferenceGoal() {
		OperationsTestCase<InterventionAct> validateInterventionActActReferenceGoalTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActActReferenceGoal",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ACT_REFERENCE_GOAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.GEVL);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActActReferenceGoal(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActActReferenceGoalTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActAuthorParticipation() {
		OperationsTestCase<InterventionAct> validateInterventionActAuthorParticipationTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActAuthorParticipation(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActExternalDocumentReference() {
		OperationsTestCase<InterventionAct> validateInterventionActExternalDocumentReferenceTestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActExternalDocumentReference",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(InterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createExternalDocumentReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActExternalDocumentReference(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActAdvanceDirectiveObservation2() {
		OperationsTestCase<InterventionAct> validateInterventionActAdvanceDirectiveObservation2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActAdvanceDirectiveObservation2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActAdvanceDirectiveObservation2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActAdvanceDirectiveObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActImmunizationActivity2() {
		OperationsTestCase<InterventionAct> validateInterventionActImmunizationActivity2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActImmunizationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createImmunizationActivity2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActImmunizationActivity2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActImmunizationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActMedicationActivity2() {
		OperationsTestCase<InterventionAct> validateInterventionActMedicationActivity2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActMedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActMedicationActivity2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActProcedureActivityAct2() {
		OperationsTestCase<InterventionAct> validateInterventionActProcedureActivityAct2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActProcedureActivityAct2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createProcedureActivityAct2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActProcedureActivityAct2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActProcedureActivityAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActProcedureActivityObservation2() {
		OperationsTestCase<InterventionAct> validateInterventionActProcedureActivityObservation2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActProcedureActivityObservation2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActProcedureActivityObservation2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActProcedureActivityObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActProcedureActivityProcedure2() {
		OperationsTestCase<InterventionAct> validateInterventionActProcedureActivityProcedure2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActProcedureActivityProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActProcedureActivityProcedure2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActProcedureActivityProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActEncounterActivity2() {
		OperationsTestCase<InterventionAct> validateInterventionActEncounterActivity2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActEncounterActivity2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setEncounter(ConsolFactory.eINSTANCE.createEncounterActivity2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActEncounterActivity2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActEncounterActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActNonMedicinalSupplyActivity2() {
		OperationsTestCase<InterventionAct> validateInterventionActNonMedicinalSupplyActivity2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActNonMedicinalSupplyActivity2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActNonMedicinalSupplyActivity2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActNonMedicinalSupplyActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActInstruction2() {
		OperationsTestCase<InterventionAct> validateInterventionActInstruction2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActInstruction2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActInstruction2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActInstruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActPlannedAct2() {
		OperationsTestCase<InterventionAct> validateInterventionActPlannedAct2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActPlannedAct2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createPlannedAct2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActPlannedAct2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActPlannedAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActPlannedEncounter2() {
		OperationsTestCase<InterventionAct> validateInterventionActPlannedEncounter2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActPlannedEncounter2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setEncounter(ConsolFactory.eINSTANCE.createPlannedEncounter2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActPlannedEncounter2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActPlannedEncounter2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActPlannedObservation2() {
		OperationsTestCase<InterventionAct> validateInterventionActPlannedObservation2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActPlannedObservation2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPlannedObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActPlannedObservation2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActPlannedObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActPlannedProcedure2() {
		OperationsTestCase<InterventionAct> validateInterventionActPlannedProcedure2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActPlannedProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setProcedure(ConsolFactory.eINSTANCE.createPlannedProcedure2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActPlannedProcedure2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActPlannedProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActPlannedMedicationActivity2() {
		OperationsTestCase<InterventionAct> validateInterventionActPlannedMedicationActivity2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActPlannedMedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createPlannedMedicationActivity2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActPlannedMedicationActivity2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActPlannedMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateInterventionActPlannedSupply2() {
		OperationsTestCase<InterventionAct> validateInterventionActPlannedSupply2TestCase = new OperationsTestCase<InterventionAct>(
			"validateInterventionActPlannedSupply2",
			operationsForOCL.getOCLValue("VALIDATE_INTERVENTION_ACT_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InterventionAct target) {

			}

			@Override
			protected void updateToPass(InterventionAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createPlannedSupply2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InterventionActOperations.validateInterventionActPlannedSupply2(
					(InterventionAct) objectToTest, diagnostician, map);
			}

		};

		validateInterventionActPlannedSupply2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGoalObservations() {

		InterventionAct target = objectFactory.create();
		target.getGoalObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInterventionActs() {

		InterventionAct target = objectFactory.create();
		target.getInterventionActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionRecommendationss() {

		InterventionAct target = objectFactory.create();
		target.getNutritionRecommendationss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReferences() {

		InterventionAct target = objectFactory.create();
		target.getActReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReferenceGoals() {

		InterventionAct target = objectFactory.create();
		target.getActReferenceGoals();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExternalDocumentReferences() {

		InterventionAct target = objectFactory.create();
		target.getExternalDocumentReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectiveObservation2s() {

		InterventionAct target = objectFactory.create();
		target.getAdvanceDirectiveObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationActivity2s() {

		InterventionAct target = objectFactory.create();
		target.getImmunizationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivity2s() {

		InterventionAct target = objectFactory.create();
		target.getMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityAct2s() {

		InterventionAct target = objectFactory.create();
		target.getProcedureActivityAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityObservation2s() {

		InterventionAct target = objectFactory.create();
		target.getProcedureActivityObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityProcedure2s() {

		InterventionAct target = objectFactory.create();
		target.getProcedureActivityProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncounterActivity2s() {

		InterventionAct target = objectFactory.create();
		target.getEncounterActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivity2s() {

		InterventionAct target = objectFactory.create();
		target.getNonMedicinalSupplyActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2s() {

		InterventionAct target = objectFactory.create();
		target.getInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedAct2s() {

		InterventionAct target = objectFactory.create();
		target.getPlannedAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedEncounter2s() {

		InterventionAct target = objectFactory.create();
		target.getPlannedEncounter2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedObservation2s() {

		InterventionAct target = objectFactory.create();
		target.getPlannedObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedure2s() {

		InterventionAct target = objectFactory.create();
		target.getPlannedProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedMedicationActivity2s() {

		InterventionAct target = objectFactory.create();
		target.getPlannedMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedSupply2s() {

		InterventionAct target = objectFactory.create();
		target.getPlannedSupply2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InterventionActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InterventionAct> {
		@Override
		public InterventionAct create() {
			return ConsolFactory.eINSTANCE.createInterventionAct();
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
	private static class ConstructorTestClass extends InterventionActOperations {
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

} // InterventionActOperations
