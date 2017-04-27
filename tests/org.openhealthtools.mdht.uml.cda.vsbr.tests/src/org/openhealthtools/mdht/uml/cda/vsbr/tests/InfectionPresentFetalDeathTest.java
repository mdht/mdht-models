
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

import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfectionPresentFetalDeathOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infection Present Fetal Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath#validateInfectionPresentFetalDeathValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Fetal Death Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InfectionPresentFetalDeathTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentFetalDeathTemplateId() {
		OperationsTestCase<InfectionPresentFetalDeath> validateInfectionPresentFetalDeathTemplateIdTestCase = new OperationsTestCase<InfectionPresentFetalDeath>(
			"validateInfectionPresentFetalDeathTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_FETAL_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentFetalDeath target) {

			}

			@Override
			protected void updateToPass(InfectionPresentFetalDeath target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathTemplateId(
					(InfectionPresentFetalDeath) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentFetalDeathTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentFetalDeathClassCode() {
		OperationsTestCase<InfectionPresentFetalDeath> validateInfectionPresentFetalDeathClassCodeTestCase = new OperationsTestCase<InfectionPresentFetalDeath>(
			"validateInfectionPresentFetalDeathClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentFetalDeath target) {

			}

			@Override
			protected void updateToPass(InfectionPresentFetalDeath target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathClassCode(
					(InfectionPresentFetalDeath) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentFetalDeathClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentFetalDeathMoodCode() {
		OperationsTestCase<InfectionPresentFetalDeath> validateInfectionPresentFetalDeathMoodCodeTestCase = new OperationsTestCase<InfectionPresentFetalDeath>(
			"validateInfectionPresentFetalDeathMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_FETAL_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentFetalDeath target) {

			}

			@Override
			protected void updateToPass(InfectionPresentFetalDeath target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathMoodCode(
					(InfectionPresentFetalDeath) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentFetalDeathMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentFetalDeathCodeP() {
		OperationsTestCase<InfectionPresentFetalDeath> validateInfectionPresentFetalDeathCodePTestCase = new OperationsTestCase<InfectionPresentFetalDeath>(
			"validateInfectionPresentFetalDeathCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentFetalDeath target) {

			}

			@Override
			protected void updateToPass(InfectionPresentFetalDeath target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathCodeP(
					(InfectionPresentFetalDeath) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentFetalDeathCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentFetalDeathCode() {
		OperationsTestCase<InfectionPresentFetalDeath> validateInfectionPresentFetalDeathCodeTestCase = new OperationsTestCase<InfectionPresentFetalDeath>(
			"validateInfectionPresentFetalDeathCode",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentFetalDeath target) {

			}

			@Override
			protected void updateToPass(InfectionPresentFetalDeath target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathCode(
					(InfectionPresentFetalDeath) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentFetalDeathCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentFetalDeathCodeVS() {
		OperationsTestCase<InfectionPresentFetalDeath> validateInfectionPresentFetalDeathCodeVSTestCase = new OperationsTestCase<InfectionPresentFetalDeath>(
			"validateInfectionPresentFetalDeathCodeVS", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_FETAL_DEATH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentFetalDeath target) {

			}

			@Override
			protected void updateToPass(InfectionPresentFetalDeath target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathCodeVS(
					(InfectionPresentFetalDeath) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentFetalDeathCodeVSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentFetalDeathValue() {
		OperationsTestCase<InfectionPresentFetalDeath> validateInfectionPresentFetalDeathValueTestCase = new OperationsTestCase<InfectionPresentFetalDeath>(
			"validateInfectionPresentFetalDeathValue", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentFetalDeath target) {

			}

			@Override
			protected void updateToPass(InfectionPresentFetalDeath target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathValue(
					(InfectionPresentFetalDeath) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentFetalDeathValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentFetalDeathValueP() {
		OperationsTestCase<InfectionPresentFetalDeath> validateInfectionPresentFetalDeathValuePTestCase = new OperationsTestCase<InfectionPresentFetalDeath>(
			"validateInfectionPresentFetalDeathValueP", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_FETAL_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentFetalDeath target) {

			}

			@Override
			protected void updateToPass(InfectionPresentFetalDeath target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentFetalDeathOperations.validateInfectionPresentFetalDeathValueP(
					(InfectionPresentFetalDeath) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentFetalDeathValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InfectionPresentFetalDeathOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InfectionPresentFetalDeath> {
		public InfectionPresentFetalDeath create() {
			return VsbrFactory.eINSTANCE.createInfectionPresentFetalDeath();
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
	private static class ConstructorTestClass extends InfectionPresentFetalDeathOperations {
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

} // InfectionPresentFetalDeathOperations
