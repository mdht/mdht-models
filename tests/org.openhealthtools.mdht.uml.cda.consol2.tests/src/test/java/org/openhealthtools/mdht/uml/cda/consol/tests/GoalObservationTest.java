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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.consol.AuthorParticipation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.GoalObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Goal Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationActReferenceER(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Act Reference ER</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationHealthConcernActER(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Health Concern Act ER</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPriorityPreference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationPlannedERs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Planned ERs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#validateGoalObservationReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Goal Observation Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getGoalObservations() <em>Get Goal Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getActReferenceERs() <em>Get Act Reference ERs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getHealthConcernActERs() <em>Get Health Concern Act ERs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPriorityPreference() <em>Get Priority Preference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GoalObservation#getPlannedERss() <em>Get Planned ERss</em>}</li>
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
	public void testValidateGoalObservationTemplateId() {
		OperationsTestCase<GoalObservation> validateGoalObservationTemplateIdTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GoalObservationOperations.validateGoalObservationTemplateId(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationTemplateIdTestCase.doValidationTest();
	}

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
	public void testValidateGoalObservationId() {
		OperationsTestCase<GoalObservation> validateGoalObservationIdTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationId",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationId(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationCodeP() {
		OperationsTestCase<GoalObservation> validateGoalObservationCodePTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GoalObservationOperations.validateGoalObservationCodeP(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("hasCode", LOINC_ID));
			}

			@Override
			protected void setDependency(GoalObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.GoalObservationCodeP", passToken);
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
	public void testValidateGoalObservationStatusCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationStatusCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS(BAD_CODE_VALUE));
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.getStatusCode().setCode("active");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationStatusCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationStatusCodeP() {
		OperationsTestCase<GoalObservation> validateGoalObservationStatusCodePTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return GoalObservationOperations.validateGoalObservationStatusCodeP(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationEffectiveTime() {
		OperationsTestCase<GoalObservation> validateGoalObservationEffectiveTimeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationEffectiveTime(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGoalObservationValue() {
		OperationsTestCase<GoalObservation> validateGoalObservationValueTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationValue(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationValueTestCase.doValidationTest();
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
	public void testValidateGoalObservationActReferenceER() {
		OperationsTestCase<GoalObservation> validateGoalObservationActReferenceERTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationActReferenceER",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_ACT_REFERENCE_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationActReferenceER(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationActReferenceERTestCase.doValidationTest();
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
	public void testValidateGoalObservationHealthConcernActER() {
		OperationsTestCase<GoalObservation> validateGoalObservationHealthConcernActERTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationHealthConcernActER",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_HEALTH_CONCERN_ACT_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationHealthConcernActER(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationHealthConcernActERTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPriorityPreference() {
		OperationsTestCase<GoalObservation> validateGoalObservationPriorityPreferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPriorityPreference",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PRIORITY_PREFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createPriorityPreference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPriorityPreference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPriorityPreferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationPlannedERs() {
		OperationsTestCase<GoalObservation> validateGoalObservationPlannedERsTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationPlannedERs",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_PLANNED_ERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {

			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationPlannedERs(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationPlannedERsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationReference() {
		OperationsTestCase<GoalObservation> validateGoalObservationReferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationReference",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				target.getReferences().add(CDAFactory.eINSTANCE.createReference());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationReference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationReferenceTypeCode() {
		OperationsTestCase<GoalObservation> validateGoalObservationReferenceTypeCodeTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationReferenceTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				for (Reference r : target.getReferences()) {
					r.setTypeCode(x_ActRelationshipExternalReference.REFR);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationReferenceTypeCode(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateGoalObservationReferenceExternalDocumentReference() {
		OperationsTestCase<GoalObservation> validateGoalObservationReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<GoalObservation>(
			"validateGoalObservationReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue("VALIDATE_GOAL_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GoalObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(GoalObservation target) {
				for (Reference r : target.getReferences()) {
					r.setExternalDocument(ConsolFactory.eINSTANCE.createExternalDocumentReference().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GoalObservationOperations.validateGoalObservationReferenceExternalDocumentReference(
					(GoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateGoalObservationReferenceExternalDocumentReferenceTestCase.doValidationTest();
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
	public void testGetActReferenceERs() {

		GoalObservation target = objectFactory.create();
		target.getActReferenceERs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthConcernActERs() {

		GoalObservation target = objectFactory.create();
		target.getHealthConcernActERs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPriorityPreference() {

		GoalObservation target = objectFactory.create();
		target.getPriorityPreference();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedERss() {

		GoalObservation target = objectFactory.create();
		target.getPlannedERss();

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
