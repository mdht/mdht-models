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
import org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CharacteristicsOfHomeEnvironmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Characteristics Of Home Environment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironment#validateCharacteristicsOfHomeEnvironmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristics Of Home Environment Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CharacteristicsOfHomeEnvironmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentTemplateId() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentTemplateIdTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentTemplateId(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentClassCode() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentClassCodeTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentClassCode(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentMoodCode() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentMoodCodeTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentMoodCode(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentId() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentIdTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentId",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();
				II idII = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(idII);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentId(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentCodeP() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentCodePTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentCodeP(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentCode() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentCodeTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentCode",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();

			}

			@Override
			protected void setDependency(CharacteristicsOfHomeEnvironment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.CharacteristicsOfHomeEnvironmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentCode(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentStatusCode() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentStatusCodeTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentStatusCode(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentStatusCodeP() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentStatusCodePTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentStatusCodeP(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCharacteristicsOfHomeEnvironmentValue() {
		OperationsTestCase<CharacteristicsOfHomeEnvironment> validateCharacteristicsOfHomeEnvironmentValueTestCase = new OperationsTestCase<CharacteristicsOfHomeEnvironment>(
			"validateCharacteristicsOfHomeEnvironmentValue",
			operationsForOCL.getOCLValue("VALIDATE_CHARACTERISTICS_OF_HOME_ENVIRONMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicsOfHomeEnvironment target) {

			}

			@Override
			protected void updateToPass(CharacteristicsOfHomeEnvironment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicsOfHomeEnvironmentOperations.validateCharacteristicsOfHomeEnvironmentValue(
					(CharacteristicsOfHomeEnvironment) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicsOfHomeEnvironmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CharacteristicsOfHomeEnvironmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CharacteristicsOfHomeEnvironment> {
		public CharacteristicsOfHomeEnvironment create() {
			return ConsolFactory.eINSTANCE.createCharacteristicsOfHomeEnvironment();
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
	private static class ConstructorTestClass extends CharacteristicsOfHomeEnvironmentOperations {
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

} // CharacteristicsOfHomeEnvironmentOperations
