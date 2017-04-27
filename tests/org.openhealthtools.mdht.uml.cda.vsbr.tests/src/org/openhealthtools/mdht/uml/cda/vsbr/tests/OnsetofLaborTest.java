
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

import org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.OnsetofLaborOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Onsetof Labor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor#validateOnsetofLaborValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Onsetof Labor Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OnsetofLaborTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOnsetofLaborTemplateId() {
		OperationsTestCase<OnsetofLabor> validateOnsetofLaborTemplateIdTestCase = new OperationsTestCase<OnsetofLabor>(
			"validateOnsetofLaborTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ONSETOF_LABOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OnsetofLabor target) {

			}

			@Override
			protected void updateToPass(OnsetofLabor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OnsetofLaborOperations.validateOnsetofLaborTemplateId(
					(OnsetofLabor) objectToTest, diagnostician, map);
			}

		};

		validateOnsetofLaborTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOnsetofLaborClassCode() {
		OperationsTestCase<OnsetofLabor> validateOnsetofLaborClassCodeTestCase = new OperationsTestCase<OnsetofLabor>(
			"validateOnsetofLaborClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ONSETOF_LABOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OnsetofLabor target) {

			}

			@Override
			protected void updateToPass(OnsetofLabor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OnsetofLaborOperations.validateOnsetofLaborClassCode(
					(OnsetofLabor) objectToTest, diagnostician, map);
			}

		};

		validateOnsetofLaborClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOnsetofLaborMoodCode() {
		OperationsTestCase<OnsetofLabor> validateOnsetofLaborMoodCodeTestCase = new OperationsTestCase<OnsetofLabor>(
			"validateOnsetofLaborMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ONSETOF_LABOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OnsetofLabor target) {

			}

			@Override
			protected void updateToPass(OnsetofLabor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OnsetofLaborOperations.validateOnsetofLaborMoodCode(
					(OnsetofLabor) objectToTest, diagnostician, map);
			}

		};

		validateOnsetofLaborMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOnsetofLaborCodeP() {
		OperationsTestCase<OnsetofLabor> validateOnsetofLaborCodePTestCase = new OperationsTestCase<OnsetofLabor>(
			"validateOnsetofLaborCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ONSETOF_LABOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OnsetofLabor target) {

			}

			@Override
			protected void updateToPass(OnsetofLabor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OnsetofLaborOperations.validateOnsetofLaborCodeP(
					(OnsetofLabor) objectToTest, diagnostician, map);
			}

		};

		validateOnsetofLaborCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOnsetofLaborCode() {
		OperationsTestCase<OnsetofLabor> validateOnsetofLaborCodeTestCase = new OperationsTestCase<OnsetofLabor>(
			"validateOnsetofLaborCode",
			operationsForOCL.getOCLValue("VALIDATE_ONSETOF_LABOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OnsetofLabor target) {

			}

			@Override
			protected void updateToPass(OnsetofLabor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OnsetofLaborOperations.validateOnsetofLaborCode((OnsetofLabor) objectToTest, diagnostician, map);
			}

		};

		validateOnsetofLaborCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOnsetofLaborCodeVS() {
		OperationsTestCase<OnsetofLabor> validateOnsetofLaborCodeVSTestCase = new OperationsTestCase<OnsetofLabor>(
			"validateOnsetofLaborCodeVS",
			operationsForOCL.getOCLValue("VALIDATE_ONSETOF_LABOR_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OnsetofLabor target) {

			}

			@Override
			protected void updateToPass(OnsetofLabor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OnsetofLaborOperations.validateOnsetofLaborCodeVS(
					(OnsetofLabor) objectToTest, diagnostician, map);
			}

		};

		validateOnsetofLaborCodeVSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOnsetofLaborValue() {
		OperationsTestCase<OnsetofLabor> validateOnsetofLaborValueTestCase = new OperationsTestCase<OnsetofLabor>(
			"validateOnsetofLaborValue",
			operationsForOCL.getOCLValue("VALIDATE_ONSETOF_LABOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OnsetofLabor target) {

			}

			@Override
			protected void updateToPass(OnsetofLabor target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OnsetofLaborOperations.validateOnsetofLaborValue(
					(OnsetofLabor) objectToTest, diagnostician, map);
			}

		};

		validateOnsetofLaborValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOnsetofLaborValueP() {
		OperationsTestCase<OnsetofLabor> validateOnsetofLaborValuePTestCase = new OperationsTestCase<OnsetofLabor>(
			"validateOnsetofLaborValueP",
			operationsForOCL.getOCLValue("VALIDATE_ONSETOF_LABOR_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OnsetofLabor target) {

			}

			@Override
			protected void updateToPass(OnsetofLabor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OnsetofLaborOperations.validateOnsetofLaborValueP(
					(OnsetofLabor) objectToTest, diagnostician, map);
			}

		};

		validateOnsetofLaborValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OnsetofLaborOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OnsetofLabor> {
		public OnsetofLabor create() {
			return VsbrFactory.eINSTANCE.createOnsetofLabor();
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
	private static class ConstructorTestClass extends OnsetofLaborOperations {
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

} // OnsetofLaborOperations
