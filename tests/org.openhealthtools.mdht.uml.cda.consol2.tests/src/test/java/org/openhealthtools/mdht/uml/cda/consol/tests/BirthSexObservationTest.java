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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.BirthSexObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birth Sex Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.BirthSexObservation#validateBirthSexObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Sex Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BirthSexObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBirthSexObservationTemplateId() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationTemplateIdTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_SEX_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {

			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationTemplateId(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBirthSexObservationClassCode() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationClassCodeTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_SEX_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {

			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationClassCode(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBirthSexObservationMoodCode() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationMoodCodeTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_SEX_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {

			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationMoodCode(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBirthSexObservationCodeP() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationCodePTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_SEX_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {

			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationCodeP(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateBirthSexObservationCode() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationCodeTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_SEX_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD(BAD_CODE_VALUE, BAD_CODESYSTEM_ID);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				final String sexAssignedAtBirthCode = "76689-9";
				target.getCode().setCode(sexAssignedAtBirthCode);
				target.getCode().setCodeSystem(LOINC_ID);
			}

			@Override
			protected void setDependency(BirthSexObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.BirthSexObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationCode(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBirthSexObservationStatusCode() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationStatusCodeTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_SEX_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {

			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationStatusCode(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBirthSexObservationStatusCodeP() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationStatusCodePTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_BIRTH_SEX_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {

			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationStatusCodeP(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateBirthSexObservationValue() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationValueTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_SEX_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				final String ADMINISTRATIVE_GENDER_CS = "2.16.840.1.113883.5.1";
				target.getValues().set(0, DatatypesFactory.eINSTANCE.createCD("F", ADMINISTRATIVE_GENDER_CS));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationValue(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateBirthSexObservationValueP() {
		OperationsTestCase<BirthSexObservation> validateBirthSexObservationValuePTestCase = new OperationsTestCase<BirthSexObservation>(
			"validateBirthSexObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_SEX_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BirthSexObservation target) {

			}

			@Override
			protected void updateToPass(BirthSexObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BirthSexObservationOperations.validateBirthSexObservationValueP(
					(BirthSexObservation) objectToTest, diagnostician, map);
			}

		};

		validateBirthSexObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BirthSexObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BirthSexObservation> {
		public BirthSexObservation create() {
			return ConsolFactory.eINSTANCE.createBirthSexObservation();
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
	private static class ConstructorTestClass extends BirthSexObservationOperations {
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

} // BirthSexObservationOperations
