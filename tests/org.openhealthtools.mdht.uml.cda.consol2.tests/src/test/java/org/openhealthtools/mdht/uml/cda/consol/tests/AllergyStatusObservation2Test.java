/*******************************************************************************
 * Copyright (c) 2018 Dan Brown and others.
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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyStatusObservation2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Status Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation2#validateAllergyStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation2#validateAllergyStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation2#validateAllergyStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyStatusObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAllergyStatusObservationTemplateId() {
		OperationsTestCase<AllergyStatusObservation2> validateAllergyStatusObservationTemplateIdTestCase = new OperationsTestCase<AllergyStatusObservation2>(
			"validateAllergyStatusObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservation2Operations.validateAllergyStatusObservationTemplateId(
					(AllergyStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyStatusObservationCode() {
		OperationsTestCase<AllergyStatusObservation2> validateAllergyStatusObservationCodeTestCase = new OperationsTestCase<AllergyStatusObservation2>(
			"validateAllergyStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation2 target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservation2Operations.validateAllergyStatusObservationCode(
					(AllergyStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyStatusObservationValue() {
		OperationsTestCase<AllergyStatusObservation2> validateAllergyStatusObservationValueTestCase = new OperationsTestCase<AllergyStatusObservation2>(
			"validateAllergyStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation2 target) {
				target.init();
				CE value = DatatypesFactory.eINSTANCE.createCE();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("55561003");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservation2Operations.validateAllergyStatusObservationValue(
					(AllergyStatusObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyStatusObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyStatusObservation2> {
		public AllergyStatusObservation2 create() {
			return ConsolFactory.eINSTANCE.createAllergyStatusObservation2();
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
	private static class ConstructorTestClass extends AllergyStatusObservation2Operations {
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

} // AllergyStatusObservation2Operations
