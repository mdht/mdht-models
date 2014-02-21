/*******************************************************************************
 * Copyright (c) 2014 Sean Muir, Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) and Dan Brown (Audacious Inquiry) - initial API and implementation
 *     Dan Brown - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.WoundMeasurementObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Wound Measurement Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservation#validateWoundMeasurementObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Measurement Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class WoundMeasurementObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundMeasurementObservationTemplateId() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationTemplateIdTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationTemplateId(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundMeasurementObservationClassCode() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationClassCodeTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationClassCode(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundMeasurementObservationMoodCode() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationMoodCodeTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationMoodCode(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundMeasurementObservationId() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationIdTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationId",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationId(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundMeasurementObservationCodeP() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationCodePTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationCodeP(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundMeasurementObservationCode() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationCodeTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.getCode().setCode("401239006");
				target.getCode().setCodeSystem(SNOMEDCT_ID);
			}

			@Override
			protected void setDependency(WoundMeasurementObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.WoundMeasurementObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationCode(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundMeasurementObservationStatusCode() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationStatusCodeTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationStatusCode(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundMeasurementObservationStatusCodeP() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationStatusCodePTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationStatusCodeP(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundMeasurementObservationEffectiveTime() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationEffectiveTimeTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {

			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationEffectiveTime(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundMeasurementObservationValue() {
		OperationsTestCase<WoundMeasurementObservation> validateWoundMeasurementObservationValueTestCase = new OperationsTestCase<WoundMeasurementObservation>(
			"validateWoundMeasurementObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_MEASUREMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundMeasurementObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(WoundMeasurementObservation target) {
				target.getValues().clear();
				PQ val = DatatypesFactory.eINSTANCE.createPQ();
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundMeasurementObservationOperations.validateWoundMeasurementObservationValue(
					(WoundMeasurementObservation) objectToTest, diagnostician, map);
			}

		};

		validateWoundMeasurementObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends WoundMeasurementObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WoundMeasurementObservation> {
		public WoundMeasurementObservation create() {
			return ConsolFactory.eINSTANCE.createWoundMeasurementObservation();
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
	private static class ConstructorTestClass extends WoundMeasurementObservationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // WoundMeasurementObservationOperations
