
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

import org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfantBreastfedOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infant Breastfed</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed#validateInfantBreastfedValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Breastfed Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InfantBreastfedTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantBreastfedTemplateId() {
		OperationsTestCase<InfantBreastfed> validateInfantBreastfedTemplateIdTestCase = new OperationsTestCase<InfantBreastfed>(
			"validateInfantBreastfedTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_BREASTFED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantBreastfed target) {

			}

			@Override
			protected void updateToPass(InfantBreastfed target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantBreastfedOperations.validateInfantBreastfedTemplateId(
					(InfantBreastfed) objectToTest, diagnostician, map);
			}

		};

		validateInfantBreastfedTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantBreastfedClassCode() {
		OperationsTestCase<InfantBreastfed> validateInfantBreastfedClassCodeTestCase = new OperationsTestCase<InfantBreastfed>(
			"validateInfantBreastfedClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_BREASTFED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantBreastfed target) {

			}

			@Override
			protected void updateToPass(InfantBreastfed target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantBreastfedOperations.validateInfantBreastfedClassCode(
					(InfantBreastfed) objectToTest, diagnostician, map);
			}

		};

		validateInfantBreastfedClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantBreastfedMoodCode() {
		OperationsTestCase<InfantBreastfed> validateInfantBreastfedMoodCodeTestCase = new OperationsTestCase<InfantBreastfed>(
			"validateInfantBreastfedMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_BREASTFED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantBreastfed target) {

			}

			@Override
			protected void updateToPass(InfantBreastfed target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantBreastfedOperations.validateInfantBreastfedMoodCode(
					(InfantBreastfed) objectToTest, diagnostician, map);
			}

		};

		validateInfantBreastfedMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantBreastfedCodeP() {
		OperationsTestCase<InfantBreastfed> validateInfantBreastfedCodePTestCase = new OperationsTestCase<InfantBreastfed>(
			"validateInfantBreastfedCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_BREASTFED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantBreastfed target) {

			}

			@Override
			protected void updateToPass(InfantBreastfed target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantBreastfedOperations.validateInfantBreastfedCodeP(
					(InfantBreastfed) objectToTest, diagnostician, map);
			}

		};

		validateInfantBreastfedCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantBreastfedCode() {
		OperationsTestCase<InfantBreastfed> validateInfantBreastfedCodeTestCase = new OperationsTestCase<InfantBreastfed>(
			"validateInfantBreastfedCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_BREASTFED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantBreastfed target) {

			}

			@Override
			protected void updateToPass(InfantBreastfed target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantBreastfedOperations.validateInfantBreastfedCode(
					(InfantBreastfed) objectToTest, diagnostician, map);
			}

		};

		validateInfantBreastfedCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantBreastfedValue() {
		OperationsTestCase<InfantBreastfed> validateInfantBreastfedValueTestCase = new OperationsTestCase<InfantBreastfed>(
			"validateInfantBreastfedValue",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_BREASTFED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantBreastfed target) {

			}

			@Override
			protected void updateToPass(InfantBreastfed target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantBreastfedOperations.validateInfantBreastfedValue(
					(InfantBreastfed) objectToTest, diagnostician, map);
			}

		};

		validateInfantBreastfedValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InfantBreastfedOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InfantBreastfed> {
		public InfantBreastfed create() {
			return VsbrFactory.eINSTANCE.createInfantBreastfed();
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
	private static class ConstructorTestClass extends InfantBreastfedOperations {
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

} // InfantBreastfedOperations
