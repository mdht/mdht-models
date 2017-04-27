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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressTowardGoalObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Toward Goal Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservation#validateProgressTowardGoalObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Toward Goal Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProgressTowardGoalObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressTowardGoalObservationTemplateId() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationTemplateIdTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {

			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationTemplateId(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressTowardGoalObservationClassCode() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationClassCodeTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {

			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationClassCode(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressTowardGoalObservationMoodCode() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationMoodCodeTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {

			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationMoodCode(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressTowardGoalObservationId() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationIdTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationId", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {

			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationId(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressTowardGoalObservationCodeP() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationCodePTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {

			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationCodeP(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressTowardGoalObservationCode() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationCodeTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				CD code = DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4");
				target.setCode(code);
			}

			@Override
			protected void setDependency(ProgressTowardGoalObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProgressTowardGoalObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationCode(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressTowardGoalObservationStatusCode() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationStatusCodeTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {

			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationStatusCode(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProgressTowardGoalObservationStatusCodeP() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationStatusCodePTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {

			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationStatusCodeP(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressTowardGoalObservationValue() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationValueTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD("390802008", SNOMEDCT_ID);
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationValue(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProgressTowardGoalObservationValueP() {
		OperationsTestCase<ProgressTowardGoalObservation> validateProgressTowardGoalObservationValuePTestCase = new OperationsTestCase<ProgressTowardGoalObservation>(
			"validateProgressTowardGoalObservationValueP", operationsForOCL.getOCLValue(
				"VALIDATE_PROGRESS_TOWARD_GOAL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProgressTowardGoalObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProgressTowardGoalObservation target) {
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProgressTowardGoalObservationOperations.validateProgressTowardGoalObservationValueP(
					(ProgressTowardGoalObservation) objectToTest, diagnostician, map);
			}

		};

		validateProgressTowardGoalObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProgressTowardGoalObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProgressTowardGoalObservation> {
		@Override
		public ProgressTowardGoalObservation create() {
			return ConsolFactory.eINSTANCE.createProgressTowardGoalObservation();
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
	private static class ConstructorTestClass extends ProgressTowardGoalObservationOperations {
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

} // ProgressTowardGoalObservationOperations
