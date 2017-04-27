
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

import org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PlannedHomeBirthOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Home Birth</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth#validatePlannedHomeBirthValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Home Birth Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlannedHomeBirthTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedHomeBirthTemplateId() {
		OperationsTestCase<PlannedHomeBirth> validatePlannedHomeBirthTemplateIdTestCase = new OperationsTestCase<PlannedHomeBirth>(
			"validatePlannedHomeBirthTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_HOME_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedHomeBirth target) {

			}

			@Override
			protected void updateToPass(PlannedHomeBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedHomeBirthOperations.validatePlannedHomeBirthTemplateId(
					(PlannedHomeBirth) objectToTest, diagnostician, map);
			}

		};

		validatePlannedHomeBirthTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedHomeBirthClassCode() {
		OperationsTestCase<PlannedHomeBirth> validatePlannedHomeBirthClassCodeTestCase = new OperationsTestCase<PlannedHomeBirth>(
			"validatePlannedHomeBirthClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_HOME_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedHomeBirth target) {

			}

			@Override
			protected void updateToPass(PlannedHomeBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedHomeBirthOperations.validatePlannedHomeBirthClassCode(
					(PlannedHomeBirth) objectToTest, diagnostician, map);
			}

		};

		validatePlannedHomeBirthClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedHomeBirthMoodCode() {
		OperationsTestCase<PlannedHomeBirth> validatePlannedHomeBirthMoodCodeTestCase = new OperationsTestCase<PlannedHomeBirth>(
			"validatePlannedHomeBirthMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_HOME_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedHomeBirth target) {

			}

			@Override
			protected void updateToPass(PlannedHomeBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedHomeBirthOperations.validatePlannedHomeBirthMoodCode(
					(PlannedHomeBirth) objectToTest, diagnostician, map);
			}

		};

		validatePlannedHomeBirthMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedHomeBirthCodeP() {
		OperationsTestCase<PlannedHomeBirth> validatePlannedHomeBirthCodePTestCase = new OperationsTestCase<PlannedHomeBirth>(
			"validatePlannedHomeBirthCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_HOME_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedHomeBirth target) {

			}

			@Override
			protected void updateToPass(PlannedHomeBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedHomeBirthOperations.validatePlannedHomeBirthCodeP(
					(PlannedHomeBirth) objectToTest, diagnostician, map);
			}

		};

		validatePlannedHomeBirthCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedHomeBirthCode() {
		OperationsTestCase<PlannedHomeBirth> validatePlannedHomeBirthCodeTestCase = new OperationsTestCase<PlannedHomeBirth>(
			"validatePlannedHomeBirthCode",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_HOME_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedHomeBirth target) {

			}

			@Override
			protected void updateToPass(PlannedHomeBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedHomeBirthOperations.validatePlannedHomeBirthCode(
					(PlannedHomeBirth) objectToTest, diagnostician, map);
			}

		};

		validatePlannedHomeBirthCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePlannedHomeBirthValue() {
		OperationsTestCase<PlannedHomeBirth> validatePlannedHomeBirthValueTestCase = new OperationsTestCase<PlannedHomeBirth>(
			"validatePlannedHomeBirthValue",
			operationsForOCL.getOCLValue("VALIDATE_PLANNED_HOME_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlannedHomeBirth target) {

			}

			@Override
			protected void updateToPass(PlannedHomeBirth target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlannedHomeBirthOperations.validatePlannedHomeBirthValue(
					(PlannedHomeBirth) objectToTest, diagnostician, map);
			}

		};

		validatePlannedHomeBirthValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlannedHomeBirthOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedHomeBirth> {
		public PlannedHomeBirth create() {
			return VsbrFactory.eINSTANCE.createPlannedHomeBirth();
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
	private static class ConstructorTestClass extends PlannedHomeBirthOperations {
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

} // PlannedHomeBirthOperations
