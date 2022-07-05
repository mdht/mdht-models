
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.DateOfDiagnosisActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Date Of Diagnosis Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActEffectiveTimehigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Effective Timehigh</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisAct#validateDateOfDiagnosisActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Date Of Diagnosis Act Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DateOfDiagnosisActTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDateOfDiagnosisActEffectiveTimeLow() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActEffectiveTimeLowTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActEffectiveTimeLow", operationsForOCL.getOCLValue(
				"VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActEffectiveTimeLow(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDateOfDiagnosisActEffectiveTimehigh() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActEffectiveTimehighTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActEffectiveTimehigh", operationsForOCL.getOCLValue(
				"VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIMEHIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActEffectiveTimehigh(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActEffectiveTimehighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDateOfDiagnosisActTemplateId() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActTemplateIdTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DATE_OF_DIAGNOSIS_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActTemplateId(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDateOfDiagnosisActCodeP() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActCodePTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActCodeP(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDateOfDiagnosisActCode() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActCodeTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActCode",
			operationsForOCL.getOCLValue("VALIDATE_DATE_OF_DIAGNOSIS_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.init();

			}

			@Override
			protected void setDependency(DateOfDiagnosisAct target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActCode(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDateOfDiagnosisActStatusCodeP() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActStatusCodePTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActStatusCodeP(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDateOfDiagnosisActStatusCode() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActStatusCodeTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_DATE_OF_DIAGNOSIS_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(DateOfDiagnosisAct target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DateOfDiagnosisActStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActStatusCode(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDateOfDiagnosisActEffectiveTime() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActEffectiveTimeTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_DATE_OF_DIAGNOSIS_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActEffectiveTime(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDateOfDiagnosisActClassCode() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActClassCodeTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DATE_OF_DIAGNOSIS_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActClassCode(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDateOfDiagnosisActMoodCode() {
		OperationsTestCase<DateOfDiagnosisAct> validateDateOfDiagnosisActMoodCodeTestCase = new OperationsTestCase<DateOfDiagnosisAct>(
			"validateDateOfDiagnosisActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DATE_OF_DIAGNOSIS_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DateOfDiagnosisAct target) {

			}

			@Override
			protected void updateToPass(DateOfDiagnosisAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DateOfDiagnosisActOperations.validateDateOfDiagnosisActMoodCode(
					(DateOfDiagnosisAct) objectToTest, diagnostician, map);
			}

		};

		validateDateOfDiagnosisActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DateOfDiagnosisActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DateOfDiagnosisAct> {
		public DateOfDiagnosisAct create() {
			return ConsolFactory.eINSTANCE.createDateOfDiagnosisAct();
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
	private static class ConstructorTestClass extends DateOfDiagnosisActOperations {
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

} // DateOfDiagnosisActOperations
