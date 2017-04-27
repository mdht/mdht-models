
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.OtherPregnancyOutcomeOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Other Pregnancy Outcome</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcome#validateOtherPregnancyOutcomeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcome Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OtherPregnancyOutcomeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOtherPregnancyOutcomeTemplateId() {
		OperationsTestCase<OtherPregnancyOutcome> validateOtherPregnancyOutcomeTemplateIdTestCase = new OperationsTestCase<OtherPregnancyOutcome>(
			"validateOtherPregnancyOutcomeTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_OTHER_PREGNANCY_OUTCOME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcome target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcome target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeTemplateId(
					(OtherPregnancyOutcome) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOtherPregnancyOutcomeClassCode() {
		OperationsTestCase<OtherPregnancyOutcome> validateOtherPregnancyOutcomeClassCodeTestCase = new OperationsTestCase<OtherPregnancyOutcome>(
			"validateOtherPregnancyOutcomeClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOME_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcome target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcome target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeClassCode(
					(OtherPregnancyOutcome) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomeClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOtherPregnancyOutcomeMoodCode() {
		OperationsTestCase<OtherPregnancyOutcome> validateOtherPregnancyOutcomeMoodCodeTestCase = new OperationsTestCase<OtherPregnancyOutcome>(
			"validateOtherPregnancyOutcomeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcome target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcome target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeMoodCode(
					(OtherPregnancyOutcome) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOtherPregnancyOutcomeCodeP() {
		OperationsTestCase<OtherPregnancyOutcome> validateOtherPregnancyOutcomeCodePTestCase = new OperationsTestCase<OtherPregnancyOutcome>(
			"validateOtherPregnancyOutcomeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcome target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcome target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeCodeP(
					(OtherPregnancyOutcome) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOtherPregnancyOutcomeCode() {
		OperationsTestCase<OtherPregnancyOutcome> validateOtherPregnancyOutcomeCodeTestCase = new OperationsTestCase<OtherPregnancyOutcome>(
			"validateOtherPregnancyOutcomeCode",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcome target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcome target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeCode(
					(OtherPregnancyOutcome) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOtherPregnancyOutcomeEffectiveTime() {
		OperationsTestCase<OtherPregnancyOutcome> validateOtherPregnancyOutcomeEffectiveTimeTestCase = new OperationsTestCase<OtherPregnancyOutcome>(
			"validateOtherPregnancyOutcomeEffectiveTime", operationsForOCL.getOCLValue(
				"VALIDATE_OTHER_PREGNANCY_OUTCOME_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcome target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcome target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeEffectiveTime(
					(OtherPregnancyOutcome) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomeEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateOtherPregnancyOutcomeValue() {
		OperationsTestCase<OtherPregnancyOutcome> validateOtherPregnancyOutcomeValueTestCase = new OperationsTestCase<OtherPregnancyOutcome>(
			"validateOtherPregnancyOutcomeValue",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcome target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcome target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherPregnancyOutcomeOperations.validateOtherPregnancyOutcomeValue(
					(OtherPregnancyOutcome) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OtherPregnancyOutcomeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OtherPregnancyOutcome> {
		public OtherPregnancyOutcome create() {
			return VsbrFactory.eINSTANCE.createOtherPregnancyOutcome();
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
	private static class ConstructorTestClass extends OtherPregnancyOutcomeOperations {
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

} // OtherPregnancyOutcomeOperations
