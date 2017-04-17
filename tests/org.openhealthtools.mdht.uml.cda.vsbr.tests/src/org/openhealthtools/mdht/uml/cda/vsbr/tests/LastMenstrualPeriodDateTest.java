
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

import org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.LastMenstrualPeriodDateOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Last Menstrual Period Date</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LastMenstrualPeriodDate#validateLastMenstrualPeriodDateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Menstrual Period Date Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LastMenstrualPeriodDateTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLastMenstrualPeriodDateTemplateId() {
		OperationsTestCase<LastMenstrualPeriodDate> validateLastMenstrualPeriodDateTemplateIdTestCase = new OperationsTestCase<LastMenstrualPeriodDate>(
			"validateLastMenstrualPeriodDateTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastMenstrualPeriodDate target) {

			}

			@Override
			protected void updateToPass(LastMenstrualPeriodDate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateTemplateId(
					(LastMenstrualPeriodDate) objectToTest, diagnostician, map);
			}

		};

		validateLastMenstrualPeriodDateTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLastMenstrualPeriodDateClassCode() {
		OperationsTestCase<LastMenstrualPeriodDate> validateLastMenstrualPeriodDateClassCodeTestCase = new OperationsTestCase<LastMenstrualPeriodDate>(
			"validateLastMenstrualPeriodDateClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastMenstrualPeriodDate target) {

			}

			@Override
			protected void updateToPass(LastMenstrualPeriodDate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateClassCode(
					(LastMenstrualPeriodDate) objectToTest, diagnostician, map);
			}

		};

		validateLastMenstrualPeriodDateClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLastMenstrualPeriodDateMoodCode() {
		OperationsTestCase<LastMenstrualPeriodDate> validateLastMenstrualPeriodDateMoodCodeTestCase = new OperationsTestCase<LastMenstrualPeriodDate>(
			"validateLastMenstrualPeriodDateMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastMenstrualPeriodDate target) {

			}

			@Override
			protected void updateToPass(LastMenstrualPeriodDate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateMoodCode(
					(LastMenstrualPeriodDate) objectToTest, diagnostician, map);
			}

		};

		validateLastMenstrualPeriodDateMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLastMenstrualPeriodDateCodeP() {
		OperationsTestCase<LastMenstrualPeriodDate> validateLastMenstrualPeriodDateCodePTestCase = new OperationsTestCase<LastMenstrualPeriodDate>(
			"validateLastMenstrualPeriodDateCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastMenstrualPeriodDate target) {

			}

			@Override
			protected void updateToPass(LastMenstrualPeriodDate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateCodeP(
					(LastMenstrualPeriodDate) objectToTest, diagnostician, map);
			}

		};

		validateLastMenstrualPeriodDateCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLastMenstrualPeriodDateCode() {
		OperationsTestCase<LastMenstrualPeriodDate> validateLastMenstrualPeriodDateCodeTestCase = new OperationsTestCase<LastMenstrualPeriodDate>(
			"validateLastMenstrualPeriodDateCode",
			operationsForOCL.getOCLValue("VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastMenstrualPeriodDate target) {

			}

			@Override
			protected void updateToPass(LastMenstrualPeriodDate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateCode(
					(LastMenstrualPeriodDate) objectToTest, diagnostician, map);
			}

		};

		validateLastMenstrualPeriodDateCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateLastMenstrualPeriodDateValue() {
		OperationsTestCase<LastMenstrualPeriodDate> validateLastMenstrualPeriodDateValueTestCase = new OperationsTestCase<LastMenstrualPeriodDate>(
			"validateLastMenstrualPeriodDateValue",
			operationsForOCL.getOCLValue("VALIDATE_LAST_MENSTRUAL_PERIOD_DATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastMenstrualPeriodDate target) {

			}

			@Override
			protected void updateToPass(LastMenstrualPeriodDate target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastMenstrualPeriodDateOperations.validateLastMenstrualPeriodDateValue(
					(LastMenstrualPeriodDate) objectToTest, diagnostician, map);
			}

		};

		validateLastMenstrualPeriodDateValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LastMenstrualPeriodDateOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LastMenstrualPeriodDate> {
		public LastMenstrualPeriodDate create() {
			return VsbrFactory.eINSTANCE.createLastMenstrualPeriodDate();
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
	private static class ConstructorTestClass extends LastMenstrualPeriodDateOperations {
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

} // LastMenstrualPeriodDateOperations
