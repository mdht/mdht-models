
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.CharacteristicofLaborandDeliveryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Characteristicof Laborand Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery#validateCharacteristicofLaborandDeliveryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Characteristicof Laborand Delivery Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CharacteristicofLaborandDeliveryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCharacteristicofLaborandDeliveryTemplateId() {
		OperationsTestCase<CharacteristicofLaborandDelivery> validateCharacteristicofLaborandDeliveryTemplateIdTestCase = new OperationsTestCase<CharacteristicofLaborandDelivery>(
			"validateCharacteristicofLaborandDeliveryTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicofLaborandDelivery target) {

			}

			@Override
			protected void updateToPass(CharacteristicofLaborandDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryTemplateId(
					(CharacteristicofLaborandDelivery) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicofLaborandDeliveryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCharacteristicofLaborandDeliveryClassCode() {
		OperationsTestCase<CharacteristicofLaborandDelivery> validateCharacteristicofLaborandDeliveryClassCodeTestCase = new OperationsTestCase<CharacteristicofLaborandDelivery>(
			"validateCharacteristicofLaborandDeliveryClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicofLaborandDelivery target) {

			}

			@Override
			protected void updateToPass(CharacteristicofLaborandDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryClassCode(
					(CharacteristicofLaborandDelivery) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicofLaborandDeliveryClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCharacteristicofLaborandDeliveryMoodCode() {
		OperationsTestCase<CharacteristicofLaborandDelivery> validateCharacteristicofLaborandDeliveryMoodCodeTestCase = new OperationsTestCase<CharacteristicofLaborandDelivery>(
			"validateCharacteristicofLaborandDeliveryMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicofLaborandDelivery target) {

			}

			@Override
			protected void updateToPass(CharacteristicofLaborandDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryMoodCode(
					(CharacteristicofLaborandDelivery) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicofLaborandDeliveryMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCharacteristicofLaborandDeliveryCodeP() {
		OperationsTestCase<CharacteristicofLaborandDelivery> validateCharacteristicofLaborandDeliveryCodePTestCase = new OperationsTestCase<CharacteristicofLaborandDelivery>(
			"validateCharacteristicofLaborandDeliveryCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicofLaborandDelivery target) {

			}

			@Override
			protected void updateToPass(CharacteristicofLaborandDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryCodeP(
					(CharacteristicofLaborandDelivery) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicofLaborandDeliveryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCharacteristicofLaborandDeliveryCode() {
		OperationsTestCase<CharacteristicofLaborandDelivery> validateCharacteristicofLaborandDeliveryCodeTestCase = new OperationsTestCase<CharacteristicofLaborandDelivery>(
			"validateCharacteristicofLaborandDeliveryCode", operationsForOCL.getOCLValue(
				"VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicofLaborandDelivery target) {

			}

			@Override
			protected void updateToPass(CharacteristicofLaborandDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryCode(
					(CharacteristicofLaborandDelivery) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicofLaborandDeliveryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCharacteristicofLaborandDeliveryCodeVS() {
		OperationsTestCase<CharacteristicofLaborandDelivery> validateCharacteristicofLaborandDeliveryCodeVSTestCase = new OperationsTestCase<CharacteristicofLaborandDelivery>(
			"validateCharacteristicofLaborandDeliveryCodeVS", operationsForOCL.getOCLValue(
				"VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicofLaborandDelivery target) {

			}

			@Override
			protected void updateToPass(CharacteristicofLaborandDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryCodeVS(
					(CharacteristicofLaborandDelivery) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicofLaborandDeliveryCodeVSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCharacteristicofLaborandDeliveryValue() {
		OperationsTestCase<CharacteristicofLaborandDelivery> validateCharacteristicofLaborandDeliveryValueTestCase = new OperationsTestCase<CharacteristicofLaborandDelivery>(
			"validateCharacteristicofLaborandDeliveryValue", operationsForOCL.getOCLValue(
				"VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicofLaborandDelivery target) {

			}

			@Override
			protected void updateToPass(CharacteristicofLaborandDelivery target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryValue(
					(CharacteristicofLaborandDelivery) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicofLaborandDeliveryValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateCharacteristicofLaborandDeliveryValueP() {
		OperationsTestCase<CharacteristicofLaborandDelivery> validateCharacteristicofLaborandDeliveryValuePTestCase = new OperationsTestCase<CharacteristicofLaborandDelivery>(
			"validateCharacteristicofLaborandDeliveryValueP", operationsForOCL.getOCLValue(
				"VALIDATE_CHARACTERISTICOF_LABORAND_DELIVERY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CharacteristicofLaborandDelivery target) {

			}

			@Override
			protected void updateToPass(CharacteristicofLaborandDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CharacteristicofLaborandDeliveryOperations.validateCharacteristicofLaborandDeliveryValueP(
					(CharacteristicofLaborandDelivery) objectToTest, diagnostician, map);
			}

		};

		validateCharacteristicofLaborandDeliveryValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CharacteristicofLaborandDeliveryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CharacteristicofLaborandDelivery> {
		public CharacteristicofLaborandDelivery create() {
			return VsbrFactory.eINSTANCE.createCharacteristicofLaborandDelivery();
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
	private static class ConstructorTestClass extends CharacteristicofLaborandDeliveryOperations {
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

} // CharacteristicofLaborandDeliveryOperations
