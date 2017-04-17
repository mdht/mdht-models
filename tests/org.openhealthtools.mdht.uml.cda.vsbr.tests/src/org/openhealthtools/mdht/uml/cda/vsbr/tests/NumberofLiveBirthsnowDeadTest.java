
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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NumberofLiveBirthsNowDeadOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Live Births Now Dead</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofLiveBirthsNowDead#validateNumberofLiveBirthsNowDeadValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Live Births Now Dead Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NumberofLiveBirthsNowDeadTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofLiveBirthsNowDeadTemplateId() {
		OperationsTestCase<NumberofLiveBirthsNowDead> validateNumberofLiveBirthsNowDeadTemplateIdTestCase = new OperationsTestCase<NumberofLiveBirthsNowDead>(
			"validateNumberofLiveBirthsNowDeadTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofLiveBirthsNowDead target) {

			}

			@Override
			protected void updateToPass(NumberofLiveBirthsNowDead target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadTemplateId(
					(NumberofLiveBirthsNowDead) objectToTest, diagnostician, map);
			}

		};

		validateNumberofLiveBirthsNowDeadTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofLiveBirthsNowDeadClassCode() {
		OperationsTestCase<NumberofLiveBirthsNowDead> validateNumberofLiveBirthsNowDeadClassCodeTestCase = new OperationsTestCase<NumberofLiveBirthsNowDead>(
			"validateNumberofLiveBirthsNowDeadClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofLiveBirthsNowDead target) {

			}

			@Override
			protected void updateToPass(NumberofLiveBirthsNowDead target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadClassCode(
					(NumberofLiveBirthsNowDead) objectToTest, diagnostician, map);
			}

		};

		validateNumberofLiveBirthsNowDeadClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofLiveBirthsNowDeadMoodCode() {
		OperationsTestCase<NumberofLiveBirthsNowDead> validateNumberofLiveBirthsNowDeadMoodCodeTestCase = new OperationsTestCase<NumberofLiveBirthsNowDead>(
			"validateNumberofLiveBirthsNowDeadMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofLiveBirthsNowDead target) {

			}

			@Override
			protected void updateToPass(NumberofLiveBirthsNowDead target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadMoodCode(
					(NumberofLiveBirthsNowDead) objectToTest, diagnostician, map);
			}

		};

		validateNumberofLiveBirthsNowDeadMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofLiveBirthsNowDeadCodeP() {
		OperationsTestCase<NumberofLiveBirthsNowDead> validateNumberofLiveBirthsNowDeadCodePTestCase = new OperationsTestCase<NumberofLiveBirthsNowDead>(
			"validateNumberofLiveBirthsNowDeadCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofLiveBirthsNowDead target) {

			}

			@Override
			protected void updateToPass(NumberofLiveBirthsNowDead target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadCodeP(
					(NumberofLiveBirthsNowDead) objectToTest, diagnostician, map);
			}

		};

		validateNumberofLiveBirthsNowDeadCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofLiveBirthsNowDeadCode() {
		OperationsTestCase<NumberofLiveBirthsNowDead> validateNumberofLiveBirthsNowDeadCodeTestCase = new OperationsTestCase<NumberofLiveBirthsNowDead>(
			"validateNumberofLiveBirthsNowDeadCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofLiveBirthsNowDead target) {

			}

			@Override
			protected void updateToPass(NumberofLiveBirthsNowDead target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadCode(
					(NumberofLiveBirthsNowDead) objectToTest, diagnostician, map);
			}

		};

		validateNumberofLiveBirthsNowDeadCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofLiveBirthsNowDeadValue() {
		OperationsTestCase<NumberofLiveBirthsNowDead> validateNumberofLiveBirthsNowDeadValueTestCase = new OperationsTestCase<NumberofLiveBirthsNowDead>(
			"validateNumberofLiveBirthsNowDeadValue", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBEROF_LIVE_BIRTHS_NOW_DEAD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofLiveBirthsNowDead target) {

			}

			@Override
			protected void updateToPass(NumberofLiveBirthsNowDead target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofLiveBirthsNowDeadOperations.validateNumberofLiveBirthsNowDeadValue(
					(NumberofLiveBirthsNowDead) objectToTest, diagnostician, map);
			}

		};

		validateNumberofLiveBirthsNowDeadValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NumberofLiveBirthsNowDeadOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NumberofLiveBirthsNowDead> {
		public NumberofLiveBirthsNowDead create() {
			return VsbrFactory.eINSTANCE.createNumberofLiveBirthsNowDead();
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
	private static class ConstructorTestClass extends NumberofLiveBirthsNowDeadOperations {
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

} // NumberofLiveBirthsNowDeadOperations
