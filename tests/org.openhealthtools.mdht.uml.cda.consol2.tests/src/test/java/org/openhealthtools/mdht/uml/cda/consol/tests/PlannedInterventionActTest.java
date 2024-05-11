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
import org.eclipse.mdht.uml.cda.Reference;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;
import org.eclipse.mdht.uml.hl7.vocab.x_DocumentActMood;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlannedInterventionActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Intervention Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMoodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActAdvanceDirectiveObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Advance Directive Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActImmunizationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Immunization Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActProcedureActivityProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Procedure Activity Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEncounterActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Encounter Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActNonMedicinalSupplyActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Non Medicinal Supply Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedEncounter2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Encounter2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedSupply2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Supply2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActNutritionRecommendation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Nutrition Recommendation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryReferenceDocInstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Doc Instance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActEntryReferenceGoalObs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Entry Reference Goal Obs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActHandoffCommunicationParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Handoff Communication Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActPlannedImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Planned Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#validatePlannedInterventionActReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Intervention Act Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getAdvanceDirectiveObservation2s() <em>Get Advance Directive Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getImmunizationActivity2s() <em>Get Immunization Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getMedicationActivity2s() <em>Get Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getProcedureActivityAct2s() <em>Get Procedure Activity Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getInterventionActs() <em>Get Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getProcedureActivityObservation2s() <em>Get Procedure Activity Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getProcedureActivityProcedure2s() <em>Get Procedure Activity Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getEncounterActivity2s() <em>Get Encounter Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getInstruction2s() <em>Get Instruction2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getNonMedicinalSupplyActivity2s() <em>Get Non Medicinal Supply Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedAct2s() <em>Get Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedEncounter2s() <em>Get Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedObservation2s() <em>Get Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedProcedure2s() <em>Get Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedMedicationActivity2s() <em>Get Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedSupply2s() <em>Get Planned Supply2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getNutritionRecommendations() <em>Get Nutrition Recommendations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getEntryReferenceDocInstances() <em>Get Entry Reference Doc Instances</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getEntryReferenceGoalObss() <em>Get Entry Reference Goal Obss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getHandoffCommunicationParticipantss() <em>Get Handoff Communication Participantss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct#getPlannedImmunizationActivities() <em>Get Planned Immunization Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedInterventionActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActTemplateId() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActTemplateIdTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActTemplateId(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActClassCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActClassCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActClassCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActMoodCodeP() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActMoodCodePTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActMoodCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				// only checking attribute existence for this test not value
				target.setMoodCode(x_DocumentActMood.EVN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActMoodCodeP(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActMoodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActMoodCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActMoodCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
				target.setMoodCode(x_DocumentActMood.EVN);
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.setMoodCode(x_DocumentActMood.PRP);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActMoodCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActId() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActIdTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActId(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActCodeP() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActCodePTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActCodeP(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected void setDependency(PlannedInterventionAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActStatusCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActStatusCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("active"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActStatusCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActStatusCodeP() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActStatusCodePTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActStatusCodeP(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlannedInterventionActEffectiveTime() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEffectiveTimeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {

			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEffectiveTime(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActAuthorParticipation() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActAuthorParticipationTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActAuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActAuthorParticipation(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActAdvanceDirectiveObservation2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActAdvanceDirectiveObservation2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActAdvanceDirectiveObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ADVANCE_DIRECTIVE_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActAdvanceDirectiveObservation2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActAdvanceDirectiveObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActImmunizationActivity2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActImmunizationActivity2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActImmunizationActivity2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_IMMUNIZATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createImmunizationActivity2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActImmunizationActivity2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActImmunizationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActMedicationActivity2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActMedicationActivity2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActMedicationActivity2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActMedicationActivity2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActProcedureActivityAct2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActProcedureActivityAct2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActProcedureActivityAct2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createProcedureActivityAct2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityAct2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActProcedureActivityAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActInterventionAct() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActInterventionActTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActInterventionAct", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInterventionAct().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActInterventionAct(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActInterventionActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActProcedureActivityObservation2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActProcedureActivityObservation2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActProcedureActivityObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createProcedureActivityObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityObservation2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActProcedureActivityObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActProcedureActivityProcedure2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActProcedureActivityProcedure2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActProcedureActivityProcedure2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PROCEDURE_ACTIVITY_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setProcedure(ConsolFactory.eINSTANCE.createProcedureActivityProcedure2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActProcedureActivityProcedure2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActProcedureActivityProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActEncounterActivity2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEncounterActivity2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEncounterActivity2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENCOUNTER_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setEncounter(ConsolFactory.eINSTANCE.createEncounterActivity2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEncounterActivity2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEncounterActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActInstruction2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActInstruction2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActInstruction2", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActInstruction2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActInstruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActNonMedicinalSupplyActivity2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActNonMedicinalSupplyActivity2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActNonMedicinalSupplyActivity2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_NON_MEDICINAL_SUPPLY_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActNonMedicinalSupplyActivity2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActNonMedicinalSupplyActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActPlannedAct2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedAct2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedAct2", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createPlannedAct2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedAct2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActPlannedEncounter2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedEncounter2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedEncounter2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setEncounter(ConsolFactory.eINSTANCE.createPlannedEncounter2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedEncounter2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedEncounter2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActPlannedObservation2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedObservation2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedObservation2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createPlannedObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedObservation2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActPlannedProcedure2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedProcedure2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedProcedure2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setProcedure(ConsolFactory.eINSTANCE.createPlannedProcedure2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedProcedure2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActPlannedMedicationActivity2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedMedicationActivity2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedMedicationActivity2",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createPlannedMedicationActivity2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedMedicationActivity2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActPlannedSupply2() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedSupply2TestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedSupply2", operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSupply(ConsolFactory.eINSTANCE.createPlannedSupply2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedSupply2(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedSupply2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActNutritionRecommendation() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActNutritionRecommendationTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActNutritionRecommendation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_NUTRITION_RECOMMENDATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createNutritionRecommendation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActNutritionRecommendation(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActNutritionRecommendationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActEntryReferenceDocInstance() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryReferenceDocInstanceTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryReferenceDocInstance",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_DOC_INSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryReferenceDocInstance(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryReferenceDocInstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActEntryReferenceGoalObs() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActEntryReferenceGoalObsTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActEntryReferenceGoalObs",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActEntryReferenceGoalObs(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActEntryReferenceGoalObsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActHandoffCommunicationParticipants() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActHandoffCommunicationParticipantsTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActHandoffCommunicationParticipants",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_HANDOFF_COMMUNICATION_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createHandoffCommunicationParticipants().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActHandoffCommunicationParticipants(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActHandoffCommunicationParticipantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActPlannedImmunizationActivity() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActPlannedImmunizationActivityTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActPlannedImmunizationActivity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_PLANNED_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createPlannedImmunizationActivity().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActPlannedImmunizationActivity(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActPlannedImmunizationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActReference() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActReferenceTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActReference",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActReference(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActReferenceTypeCode() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActReferenceTypeCodeTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActReferenceTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				for (Reference r : target.getReferences()) {
					r.setTypeCode(x_ActRelationshipExternalReference.REFR);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActReferenceTypeCode(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlannedInterventionActReferenceExternalDocumentReference() {
		OperationsTestCase<PlannedInterventionAct> validatePlannedInterventionActReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<PlannedInterventionAct>(
			"validatePlannedInterventionActReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_PLANNED_INTERVENTION_ACT_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedInterventionAct target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(PlannedInterventionAct target) {
				for (Reference r : target.getReferences()) {
					r.setExternalDocument(ConsolFactory.eINSTANCE.createExternalDocumentReference().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedInterventionActOperations.validatePlannedInterventionActReferenceExternalDocumentReference(
					(PlannedInterventionAct) objectToTest, diagnostician, map);
			}

		};

		validatePlannedInterventionActReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdvanceDirectiveObservation2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getAdvanceDirectiveObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationActivity2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getImmunizationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivity2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityAct2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getProcedureActivityAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInterventionActs() {

		PlannedInterventionAct target = objectFactory.create();
		target.getInterventionActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityObservation2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getProcedureActivityObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityProcedure2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getProcedureActivityProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEncounterActivity2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getEncounterActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstruction2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getInstruction2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivity2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getNonMedicinalSupplyActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedAct2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getPlannedAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedEncounter2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getPlannedEncounter2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedObservation2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getPlannedObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedure2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getPlannedProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedMedicationActivity2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getPlannedMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedSupply2s() {

		PlannedInterventionAct target = objectFactory.create();
		target.getPlannedSupply2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNutritionRecommendations() {

		PlannedInterventionAct target = objectFactory.create();
		target.getNutritionRecommendations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEntryReferenceDocInstances() {

		PlannedInterventionAct target = objectFactory.create();
		target.getEntryReferenceDocInstances();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetEntryReferenceGoalObss() {

		PlannedInterventionAct target = objectFactory.create();
		target.getEntryReferenceGoalObss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHandoffCommunicationParticipantss() {

		PlannedInterventionAct target = objectFactory.create();
		target.getHandoffCommunicationParticipantss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedImmunizationActivities() {

		PlannedInterventionAct target = objectFactory.create();
		target.getPlannedImmunizationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedInterventionActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedInterventionAct> {
		public PlannedInterventionAct create() {
			return ConsolFactory.eINSTANCE.createPlannedInterventionAct();
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
	private static class ConstructorTestClass extends PlannedInterventionActOperations {
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

} // PlannedInterventionActOperations
