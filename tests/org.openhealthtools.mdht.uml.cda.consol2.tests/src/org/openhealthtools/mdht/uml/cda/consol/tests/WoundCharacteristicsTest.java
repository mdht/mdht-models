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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.operations.WoundCharacteristicsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Wound Characteristics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristics#validateWoundCharacteristicsCDCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristics CD Code System</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class WoundCharacteristicsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicsTemplateId() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsTemplateIdTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsTemplateId(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicsClassCode() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsClassCodeTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsClassCode(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicsMoodCode() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsMoodCodeTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsMoodCode(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundCharacteristicsId() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsIdTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsId",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsId(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicsCodeP() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsCodePTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsCodeP(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicsCode() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsCodeTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();

			}

			@Override
			protected void setDependency(WoundCharacteristics target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristicsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsCode(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicsStatusCode() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsStatusCodeTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsStatusCode(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicsStatusCodeP() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsStatusCodePTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsStatusCodeP(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateWoundCharacteristicsEffectiveTime() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsEffectiveTimeTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsEffectiveTime(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundCharacteristicsValue() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsValueTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsValue",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("NotCurrentlyTested", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsValue(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundCharacteristicsValueP() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsValuePTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsValueP",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {

			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsValueP(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateWoundCharacteristicsCDCodeSystem() {
		OperationsTestCase<WoundCharacteristics> validateWoundCharacteristicsCDCodeSystemTestCase = new OperationsTestCase<WoundCharacteristics>(
			"validateWoundCharacteristicsCDCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_WOUND_CHARACTERISTICS_CD_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(WoundCharacteristics target) {
				target.init();
			}

			@Override
			protected void updateToPass(WoundCharacteristics target) {
				target.getCode().setCodeSystem("CodeHasACodeSystem");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return WoundCharacteristicsOperations.validateWoundCharacteristicsCDCodeSystem(
					(WoundCharacteristics) objectToTest, diagnostician, map);
			}

		};

		validateWoundCharacteristicsCDCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends WoundCharacteristicsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WoundCharacteristics> {
		public WoundCharacteristics create() {
			return ConsolFactory.eINSTANCE.createWoundCharacteristics();
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
	private static class ConstructorTestClass extends WoundCharacteristicsOperations {
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

} // WoundCharacteristicsOperations
