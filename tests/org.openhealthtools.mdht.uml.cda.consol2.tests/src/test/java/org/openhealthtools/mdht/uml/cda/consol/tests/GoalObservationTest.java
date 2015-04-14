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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.GoalObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Goal Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPatientPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationHealthConcernAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Health Concern Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationProviderPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Provider Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPlannedEncounter2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned Encounter2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPlannedObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPlannedProcedure2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned Procedure2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPlannedMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPlannedSupply2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned Supply2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPlannedAct2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned Act2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPatientPriorityPreference() <em>Get Patient Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getActReferences() <em>Get Act References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getHealthConcernActs() <em>Get Health Concern Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getProviderPriorityPreferences() <em>Get Provider Priority Preferences</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getExternalDocumentReferences() <em>Get External Document References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPlannedEncounter2s() <em>Get Planned Encounter2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPlannedObservation2s() <em>Get Planned Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPlannedProcedure2s() <em>Get Planned Procedure2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPlannedMedicationActivity2s() <em>Get Planned Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPlannedSupply2s() <em>Get Planned Supply2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPlannedAct2s() <em>Get Planned Act2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validatePlanOfCareActivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GoalObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationClassCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationClassCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationClassCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationMoodCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationMoodCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationMoodCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPatientPriorityPreference() {
		OperationsTestCase<GoalObservation> validateGoalObservationPatientPriorityPreferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPatientPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PATIENT_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createPatientPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPatientPriorityPreference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPatientPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservation() {
		OperationsTestCase<GoalObservation> validateGoalObservationTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservation",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createGoalObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservation(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationActReference() {
		OperationsTestCase<GoalObservation> validateGoalObservationActReferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationActReference",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationActReference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationAuthorParticipation() {
		OperationsTestCase<GoalObservation> validateGoalObservationAuthorParticipationTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				AuthorParticipation ap = ConsolFactory.eINSTANCE.createAuthorParticipation().init();
				target.getAuthors().add(ap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationAuthorParticipation(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationHealthConcernAct() {
		OperationsTestCase<GoalObservation> validateGoalObservationHealthConcernActTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationHealthConcernAct",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_HEALTH_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createHealthConcernAct().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationHealthConcernAct(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationHealthConcernActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationProviderPriorityPreference() {
		OperationsTestCase<GoalObservation> validateGoalObservationProviderPriorityPreferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationProviderPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PROVIDER_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createProviderPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationProviderPriorityPreference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationProviderPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationExternalDocumentReference() {
		OperationsTestCase<GoalObservation> validateGoalObservationExternalDocumentReferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationExternalDocumentReference",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createExternalDocumentReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationExternalDocumentReference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPlannedEncounter2() {
		OperationsTestCase<GoalObservation> validateGoalObservationPlannedEncounter2TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPlannedEncounter2",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PLANNED_ENCOUNTER2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setEncounter(ConsolFactory.eINSTANCE.createPlannedEncounter2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPlannedEncounter2(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPlannedEncounter2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPlannedObservation2() {
		OperationsTestCase<GoalObservation> validateGoalObservationPlannedObservation2TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPlannedObservation2",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PLANNED_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createPlannedObservation2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPlannedObservation2(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPlannedObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPlannedProcedure2() {
		OperationsTestCase<GoalObservation> validateGoalObservationPlannedProcedure2TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPlannedProcedure2",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PLANNED_PROCEDURE2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setProcedure(ConsolFactory.eINSTANCE.createPlannedProcedure2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPlannedProcedure2(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPlannedProcedure2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPlannedMedicationActivity2() {
		OperationsTestCase<GoalObservation> validateGoalObservationPlannedMedicationActivity2TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPlannedMedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PLANNED_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createPlannedMedicationActivity2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPlannedMedicationActivity2(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPlannedMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPlannedSupply2() {
		OperationsTestCase<GoalObservation> validateGoalObservationPlannedSupply2TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPlannedSupply2",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PLANNED_SUPPLY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setSupply(ConsolFactory.eINSTANCE.createPlannedSupply2().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPlannedSupply2(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPlannedSupply2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPlannedAct2() {
		OperationsTestCase<GoalObservation> validateGoalObservationPlannedAct2TestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPlannedAct2",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PLANNED_ACT2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createPlannedAct2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPlannedAct2(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPlannedAct2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPriorityPreference() {

		GoalObservation target = objectFactory.create();
		target.getPatientPriorityPreference();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGoalObservations() {

		GoalObservation target = objectFactory.create();
		target.getGoalObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReferences() {

		GoalObservation target = objectFactory.create();
		target.getActReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthConcernActs() {

		GoalObservation target = objectFactory.create();
		target.getHealthConcernActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProviderPriorityPreferences() {

		GoalObservation target = objectFactory.create();
		target.getProviderPriorityPreferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExternalDocumentReferences() {

		GoalObservation target = objectFactory.create();
		target.getExternalDocumentReferences();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedEncounter2s() {

		GoalObservation target = objectFactory.create();
		target.getPlannedEncounter2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedObservation2s() {

		GoalObservation target = objectFactory.create();
		target.getPlannedObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedure2s() {

		GoalObservation target = objectFactory.create();
		target.getPlannedProcedure2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedMedicationActivity2s() {

		GoalObservation target = objectFactory.create();
		target.getPlannedMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedSupply2s() {

		GoalObservation target = objectFactory.create();
		target.getPlannedSupply2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedAct2s() {

		GoalObservation target = objectFactory.create();
		target.getPlannedAct2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityObservationTemplateId() {
		OperationsTestCase<GoalObservation> validatePlanOfCareActivityObservationTemplateIdTestCase = new OperationsTestCase<GoalObservation>(
			"validatePlanOfCareActivityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validatePlanOfCareActivityObservationTemplateId(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GoalObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GoalObservation> {
		@Override
		public GoalObservation create() {
			return ConsolFactory.eINSTANCE.createGoalObservation();
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
	private static class ConstructorTestClass extends GoalObservationOperations {
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

} // GoalObservationOperations
