
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

import org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.InfantLivingOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infant Living</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving#validateInfantLivingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Infant Living Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InfantLivingTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantLivingTemplateId() {
		OperationsTestCase<InfantLiving> validateInfantLivingTemplateIdTestCase = new OperationsTestCase<InfantLiving>(
			"validateInfantLivingTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_LIVING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantLiving target) {

			}

			@Override
			protected void updateToPass(InfantLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantLivingOperations.validateInfantLivingTemplateId(
					(InfantLiving) objectToTest, diagnostician, map);
			}

		};

		validateInfantLivingTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantLivingClassCode() {
		OperationsTestCase<InfantLiving> validateInfantLivingClassCodeTestCase = new OperationsTestCase<InfantLiving>(
			"validateInfantLivingClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_LIVING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantLiving target) {

			}

			@Override
			protected void updateToPass(InfantLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantLivingOperations.validateInfantLivingClassCode(
					(InfantLiving) objectToTest, diagnostician, map);
			}

		};

		validateInfantLivingClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantLivingMoodCode() {
		OperationsTestCase<InfantLiving> validateInfantLivingMoodCodeTestCase = new OperationsTestCase<InfantLiving>(
			"validateInfantLivingMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_LIVING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantLiving target) {

			}

			@Override
			protected void updateToPass(InfantLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantLivingOperations.validateInfantLivingMoodCode(
					(InfantLiving) objectToTest, diagnostician, map);
			}

		};

		validateInfantLivingMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantLivingCodeP() {
		OperationsTestCase<InfantLiving> validateInfantLivingCodePTestCase = new OperationsTestCase<InfantLiving>(
			"validateInfantLivingCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_LIVING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantLiving target) {

			}

			@Override
			protected void updateToPass(InfantLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantLivingOperations.validateInfantLivingCodeP(
					(InfantLiving) objectToTest, diagnostician, map);
			}

		};

		validateInfantLivingCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantLivingCode() {
		OperationsTestCase<InfantLiving> validateInfantLivingCodeTestCase = new OperationsTestCase<InfantLiving>(
			"validateInfantLivingCode",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_LIVING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantLiving target) {

			}

			@Override
			protected void updateToPass(InfantLiving target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantLivingOperations.validateInfantLivingCode((InfantLiving) objectToTest, diagnostician, map);
			}

		};

		validateInfantLivingCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateInfantLivingValue() {
		OperationsTestCase<InfantLiving> validateInfantLivingValueTestCase = new OperationsTestCase<InfantLiving>(
			"validateInfantLivingValue",
			operationsForOCL.getOCLValue("VALIDATE_INFANT_LIVING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InfantLiving target) {

			}

			@Override
			protected void updateToPass(InfantLiving target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InfantLivingOperations.validateInfantLivingValue(
					(InfantLiving) objectToTest, diagnostician, map);
			}

		};

		validateInfantLivingValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InfantLivingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InfantLiving> {
		public InfantLiving create() {
			return VsbrFactory.eINSTANCE.createInfantLiving();
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
	private static class ConstructorTestClass extends InfantLivingOperations {
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

} // InfantLivingOperations
