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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.PrognosisObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prognosis Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PrognosisObservation#validatePrognosisObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prognosis Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrognosisObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrognosisObservationTemplateId() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationTemplateIdTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {

			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationTemplateId(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrognosisObservationClassCode() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationClassCodeTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {

			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationClassCode(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrognosisObservationMoodCode() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationMoodCodeTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {

			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationMoodCode(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrognosisObservationCodeP() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationCodePTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {

			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationCodeP(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePrognosisObservationCode() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationCodeTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				CD code = DatatypesFactory.eINSTANCE.createCD("75328-5", LOINC_ID);
				target.setCode(code);
			}

			@Override
			protected void setDependency(PrognosisObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PrognosisObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationCode(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrognosisObservationStatusCode() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationStatusCodeTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {

			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationStatusCode(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrognosisObservationStatusCodeP() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationStatusCodePTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {

			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationStatusCodeP(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrognosisObservationEffectiveTime() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationEffectiveTimeTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {

			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationEffectiveTime(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrognosisObservationValue() {
		OperationsTestCase<PrognosisObservation> validatePrognosisObservationValueTestCase = new OperationsTestCase<PrognosisObservation>(
			"validatePrognosisObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROGNOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrognosisObservation target) {

			}

			@Override
			protected void updateToPass(PrognosisObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrognosisObservationOperations.validatePrognosisObservationValue(
					(PrognosisObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrognosisObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrognosisObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrognosisObservation> {
		@Override
		public PrognosisObservation create() {
			return ConsolFactory.eINSTANCE.createPrognosisObservation();
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
	private static class ConstructorTestClass extends PrognosisObservationOperations {
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

} // PrognosisObservationOperations
