
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

import org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NumberofBirthsNowLivingOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numberof Births Now Living</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NumberofBirthsNowLiving#validateNumberofBirthsNowLivingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numberof Births Now Living Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NumberofBirthsNowLivingTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofBirthsNowLivingTemplateId() {
		OperationsTestCase<NumberofBirthsNowLiving> validateNumberofBirthsNowLivingTemplateIdTestCase = new OperationsTestCase<NumberofBirthsNowLiving>(
			"validateNumberofBirthsNowLivingTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofBirthsNowLiving target) {

			}

			@Override
			protected void updateToPass(NumberofBirthsNowLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingTemplateId(
					(NumberofBirthsNowLiving) objectToTest, diagnostician, map);
			}

		};

		validateNumberofBirthsNowLivingTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofBirthsNowLivingClassCode() {
		OperationsTestCase<NumberofBirthsNowLiving> validateNumberofBirthsNowLivingClassCodeTestCase = new OperationsTestCase<NumberofBirthsNowLiving>(
			"validateNumberofBirthsNowLivingClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofBirthsNowLiving target) {

			}

			@Override
			protected void updateToPass(NumberofBirthsNowLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingClassCode(
					(NumberofBirthsNowLiving) objectToTest, diagnostician, map);
			}

		};

		validateNumberofBirthsNowLivingClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofBirthsNowLivingMoodCode() {
		OperationsTestCase<NumberofBirthsNowLiving> validateNumberofBirthsNowLivingMoodCodeTestCase = new OperationsTestCase<NumberofBirthsNowLiving>(
			"validateNumberofBirthsNowLivingMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofBirthsNowLiving target) {

			}

			@Override
			protected void updateToPass(NumberofBirthsNowLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingMoodCode(
					(NumberofBirthsNowLiving) objectToTest, diagnostician, map);
			}

		};

		validateNumberofBirthsNowLivingMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofBirthsNowLivingCodeP() {
		OperationsTestCase<NumberofBirthsNowLiving> validateNumberofBirthsNowLivingCodePTestCase = new OperationsTestCase<NumberofBirthsNowLiving>(
			"validateNumberofBirthsNowLivingCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofBirthsNowLiving target) {

			}

			@Override
			protected void updateToPass(NumberofBirthsNowLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingCodeP(
					(NumberofBirthsNowLiving) objectToTest, diagnostician, map);
			}

		};

		validateNumberofBirthsNowLivingCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofBirthsNowLivingCode() {
		OperationsTestCase<NumberofBirthsNowLiving> validateNumberofBirthsNowLivingCodeTestCase = new OperationsTestCase<NumberofBirthsNowLiving>(
			"validateNumberofBirthsNowLivingCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofBirthsNowLiving target) {

			}

			@Override
			protected void updateToPass(NumberofBirthsNowLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingCode(
					(NumberofBirthsNowLiving) objectToTest, diagnostician, map);
			}

		};

		validateNumberofBirthsNowLivingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNumberofBirthsNowLivingValue() {
		OperationsTestCase<NumberofBirthsNowLiving> validateNumberofBirthsNowLivingValueTestCase = new OperationsTestCase<NumberofBirthsNowLiving>(
			"validateNumberofBirthsNowLivingValue",
			operationsForOCL.getOCLValue("VALIDATE_NUMBEROF_BIRTHS_NOW_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberofBirthsNowLiving target) {

			}

			@Override
			protected void updateToPass(NumberofBirthsNowLiving target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberofBirthsNowLivingOperations.validateNumberofBirthsNowLivingValue(
					(NumberofBirthsNowLiving) objectToTest, diagnostician, map);
			}

		};

		validateNumberofBirthsNowLivingValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NumberofBirthsNowLivingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NumberofBirthsNowLiving> {
		public NumberofBirthsNowLiving create() {
			return VsbrFactory.eINSTANCE.createNumberofBirthsNowLiving();
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
	private static class ConstructorTestClass extends NumberofBirthsNowLivingOperations {
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

} // NumberofBirthsNowLivingOperations
