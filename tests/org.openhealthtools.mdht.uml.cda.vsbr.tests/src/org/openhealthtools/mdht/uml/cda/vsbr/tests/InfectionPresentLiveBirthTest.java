
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

import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfectionPresentLiveBirthOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infection Present Live Birth</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthCodeVS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Code VS</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentLiveBirth#validateInfectionPresentLiveBirthValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infection Present Live Birth Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InfectionPresentLiveBirthTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentLiveBirthTemplateId() {
		OperationsTestCase<InfectionPresentLiveBirth> validateInfectionPresentLiveBirthTemplateIdTestCase = new OperationsTestCase<InfectionPresentLiveBirth>(
			"validateInfectionPresentLiveBirthTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentLiveBirth target) {

			}

			@Override
			protected void updateToPass(InfectionPresentLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthTemplateId(
					(InfectionPresentLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentLiveBirthTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentLiveBirthClassCode() {
		OperationsTestCase<InfectionPresentLiveBirth> validateInfectionPresentLiveBirthClassCodeTestCase = new OperationsTestCase<InfectionPresentLiveBirth>(
			"validateInfectionPresentLiveBirthClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentLiveBirth target) {

			}

			@Override
			protected void updateToPass(InfectionPresentLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthClassCode(
					(InfectionPresentLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentLiveBirthClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentLiveBirthMoodCode() {
		OperationsTestCase<InfectionPresentLiveBirth> validateInfectionPresentLiveBirthMoodCodeTestCase = new OperationsTestCase<InfectionPresentLiveBirth>(
			"validateInfectionPresentLiveBirthMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentLiveBirth target) {

			}

			@Override
			protected void updateToPass(InfectionPresentLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthMoodCode(
					(InfectionPresentLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentLiveBirthMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentLiveBirthCodeP() {
		OperationsTestCase<InfectionPresentLiveBirth> validateInfectionPresentLiveBirthCodePTestCase = new OperationsTestCase<InfectionPresentLiveBirth>(
			"validateInfectionPresentLiveBirthCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentLiveBirth target) {

			}

			@Override
			protected void updateToPass(InfectionPresentLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthCodeP(
					(InfectionPresentLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentLiveBirthCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentLiveBirthCode() {
		OperationsTestCase<InfectionPresentLiveBirth> validateInfectionPresentLiveBirthCodeTestCase = new OperationsTestCase<InfectionPresentLiveBirth>(
			"validateInfectionPresentLiveBirthCode",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentLiveBirth target) {

			}

			@Override
			protected void updateToPass(InfectionPresentLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthCode(
					(InfectionPresentLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentLiveBirthCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentLiveBirthCodeVS() {
		OperationsTestCase<InfectionPresentLiveBirth> validateInfectionPresentLiveBirthCodeVSTestCase = new OperationsTestCase<InfectionPresentLiveBirth>(
			"validateInfectionPresentLiveBirthCodeVS", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_CODE_VS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentLiveBirth target) {

			}

			@Override
			protected void updateToPass(InfectionPresentLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthCodeVS(
					(InfectionPresentLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentLiveBirthCodeVSTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentLiveBirthValue() {
		OperationsTestCase<InfectionPresentLiveBirth> validateInfectionPresentLiveBirthValueTestCase = new OperationsTestCase<InfectionPresentLiveBirth>(
			"validateInfectionPresentLiveBirthValue",
			operationsForOCL.getOCLValue("VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentLiveBirth target) {

			}

			@Override
			protected void updateToPass(InfectionPresentLiveBirth target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthValue(
					(InfectionPresentLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentLiveBirthValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfectionPresentLiveBirthValueP() {
		OperationsTestCase<InfectionPresentLiveBirth> validateInfectionPresentLiveBirthValuePTestCase = new OperationsTestCase<InfectionPresentLiveBirth>(
			"validateInfectionPresentLiveBirthValueP", operationsForOCL.getOCLValue(
				"VALIDATE_INFECTION_PRESENT_LIVE_BIRTH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfectionPresentLiveBirth target) {

			}

			@Override
			protected void updateToPass(InfectionPresentLiveBirth target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfectionPresentLiveBirthOperations.validateInfectionPresentLiveBirthValueP(
					(InfectionPresentLiveBirth) objectToTest, diagnostician, map);
			}

		};

		validateInfectionPresentLiveBirthValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InfectionPresentLiveBirthOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InfectionPresentLiveBirth> {
		public InfectionPresentLiveBirth create() {
			return VsbrFactory.eINSTANCE.createInfectionPresentLiveBirth();
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
	private static class ConstructorTestClass extends InfectionPresentLiveBirthOperations {
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

} // InfectionPresentLiveBirthOperations
