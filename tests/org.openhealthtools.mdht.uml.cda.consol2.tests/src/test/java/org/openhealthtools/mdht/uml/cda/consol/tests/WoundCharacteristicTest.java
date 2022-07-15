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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic;
import org.openhealthtools.mdht.uml.cda.consol.operations.WoundCharacteristicOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Wound Characteristic</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class WoundCharacteristicTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicTemplateId() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicTemplateIdTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicTemplateId(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicClassCode() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicClassCodeTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicClassCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicClassCode(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicMoodCode() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicMoodCodeTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicMoodCode(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundCharacteristicId() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicIdTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicId",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {
				target.init();
			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicId(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicCodeP() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicCodePTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicCodeP(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundCharacteristicCode() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicCodeTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {
				target.init();
				target.setCode(null);
			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4"));
			}

			@Override
			protected void setDependency(WoundCharacteristic target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristicCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicCode(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicStatusCode() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicStatusCodeTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicStatusCode(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicStatusCodeP() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicStatusCodePTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicStatusCodeP(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicEffectiveTime() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicEffectiveTimeTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_WOUND_CHARACTERISTIC_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicEffectiveTime(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundCharacteristicValue() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicValueTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicValue",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("NotCurrentlyTested", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicValue(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundCharacteristicValueP() {
		OperationsTestCase<WoundCharacteristic> validateWoundCharacteristicValuePTestCase = new OperationsTestCase<WoundCharacteristic>(
			"validateWoundCharacteristicValueP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTIC_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristic target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristic target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicOperations.validateWoundCharacteristicValueP(
					(WoundCharacteristic) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends WoundCharacteristicOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WoundCharacteristic> {
		public WoundCharacteristic create() {
			return ConsolFactory.eINSTANCE.createWoundCharacteristic();
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
	private static class ConstructorTestClass extends WoundCharacteristicOperations {
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

} // WoundCharacteristicOperations
