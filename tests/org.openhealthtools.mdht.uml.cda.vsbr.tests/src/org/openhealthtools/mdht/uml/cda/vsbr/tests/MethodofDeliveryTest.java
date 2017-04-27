
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MethodofDeliveryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Methodof Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryFinalRouteAndMethod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Final Route And Method</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryFetalPresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Fetal Presentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MethodofDelivery#validateMethodofDeliveryHysterotomyHysterectomyAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Methodof Delivery Hysterotomy Hysterectomy Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MethodofDeliveryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMethodofDeliveryTemplateId() {
		OperationsTestCase<MethodofDelivery> validateMethodofDeliveryTemplateIdTestCase = new OperationsTestCase<MethodofDelivery>(
			"validateMethodofDeliveryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_METHODOF_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MethodofDelivery target) {

			}

			@Override
			protected void updateToPass(MethodofDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MethodofDeliveryOperations.validateMethodofDeliveryTemplateId(
					(MethodofDelivery) objectToTest, diagnostician, map);
			}

		};

		validateMethodofDeliveryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMethodofDeliveryClassCode() {
		OperationsTestCase<MethodofDelivery> validateMethodofDeliveryClassCodeTestCase = new OperationsTestCase<MethodofDelivery>(
			"validateMethodofDeliveryClassCode",
			operationsForOCL.getOCLValue("VALIDATE_METHODOF_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MethodofDelivery target) {

			}

			@Override
			protected void updateToPass(MethodofDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MethodofDeliveryOperations.validateMethodofDeliveryClassCode(
					(MethodofDelivery) objectToTest, diagnostician, map);
			}

		};

		validateMethodofDeliveryClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMethodofDeliveryMoodCode() {
		OperationsTestCase<MethodofDelivery> validateMethodofDeliveryMoodCodeTestCase = new OperationsTestCase<MethodofDelivery>(
			"validateMethodofDeliveryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_METHODOF_DELIVERY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MethodofDelivery target) {

			}

			@Override
			protected void updateToPass(MethodofDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MethodofDeliveryOperations.validateMethodofDeliveryMoodCode(
					(MethodofDelivery) objectToTest, diagnostician, map);
			}

		};

		validateMethodofDeliveryMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMethodofDeliveryCode() {
		OperationsTestCase<MethodofDelivery> validateMethodofDeliveryCodeTestCase = new OperationsTestCase<MethodofDelivery>(
			"validateMethodofDeliveryCode",
			operationsForOCL.getOCLValue("VALIDATE_METHODOF_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MethodofDelivery target) {

			}

			@Override
			protected void updateToPass(MethodofDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MethodofDeliveryOperations.validateMethodofDeliveryCode(
					(MethodofDelivery) objectToTest, diagnostician, map);
			}

		};

		validateMethodofDeliveryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMethodofDeliveryCodeP() {
		OperationsTestCase<MethodofDelivery> validateMethodofDeliveryCodePTestCase = new OperationsTestCase<MethodofDelivery>(
			"validateMethodofDeliveryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_METHODOF_DELIVERY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MethodofDelivery target) {

			}

			@Override
			protected void updateToPass(MethodofDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MethodofDeliveryOperations.validateMethodofDeliveryCodeP(
					(MethodofDelivery) objectToTest, diagnostician, map);
			}

		};

		validateMethodofDeliveryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMethodofDeliveryFinalRouteAndMethod() {
		OperationsTestCase<MethodofDelivery> validateMethodofDeliveryFinalRouteAndMethodTestCase = new OperationsTestCase<MethodofDelivery>(
			"validateMethodofDeliveryFinalRouteAndMethod", operationsForOCL.getOCLValue(
				"VALIDATE_METHODOF_DELIVERY_FINAL_ROUTE_AND_METHOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MethodofDelivery target) {

			}

			@Override
			protected void updateToPass(MethodofDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MethodofDeliveryOperations.validateMethodofDeliveryFinalRouteAndMethod(
					(MethodofDelivery) objectToTest, diagnostician, map);
			}

		};

		validateMethodofDeliveryFinalRouteAndMethodTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMethodofDeliveryFetalPresentation() {
		OperationsTestCase<MethodofDelivery> validateMethodofDeliveryFetalPresentationTestCase = new OperationsTestCase<MethodofDelivery>(
			"validateMethodofDeliveryFetalPresentation", operationsForOCL.getOCLValue(
				"VALIDATE_METHODOF_DELIVERY_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MethodofDelivery target) {

			}

			@Override
			protected void updateToPass(MethodofDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MethodofDeliveryOperations.validateMethodofDeliveryFetalPresentation(
					(MethodofDelivery) objectToTest, diagnostician, map);
			}

		};

		validateMethodofDeliveryFetalPresentationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMethodofDeliveryHysterotomyHysterectomyAssociation() {
		OperationsTestCase<MethodofDelivery> validateMethodofDeliveryHysterotomyHysterectomyAssociationTestCase = new OperationsTestCase<MethodofDelivery>(
			"validateMethodofDeliveryHysterotomyHysterectomyAssociation",
			operationsForOCL.getOCLValue(
				"VALIDATE_METHODOF_DELIVERY_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MethodofDelivery target) {

			}

			@Override
			protected void updateToPass(MethodofDelivery target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MethodofDeliveryOperations.validateMethodofDeliveryHysterotomyHysterectomyAssociation(
					(MethodofDelivery) objectToTest, diagnostician, map);
			}

		};

		validateMethodofDeliveryHysterotomyHysterectomyAssociationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MethodofDeliveryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MethodofDelivery> {
		public MethodofDelivery create() {
			return VsbrFactory.eINSTANCE.createMethodofDelivery();
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
	private static class ConstructorTestClass extends MethodofDeliveryOperations {
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

} // MethodofDeliveryOperations
