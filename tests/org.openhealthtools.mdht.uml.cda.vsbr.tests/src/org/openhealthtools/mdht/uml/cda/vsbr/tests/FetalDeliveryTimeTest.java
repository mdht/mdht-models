
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

import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeliveryTimeOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Delivery Time</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime#validateFetalDeliveryTimeParticipatingLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Time Participating Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FetalDeliveryTimeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliveryTimeTemplateId() {
		OperationsTestCase<FetalDeliveryTime> validateFetalDeliveryTimeTemplateIdTestCase = new OperationsTestCase<FetalDeliveryTime>(
			"validateFetalDeliveryTimeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_TIME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliveryTime target) {

			}

			@Override
			protected void updateToPass(FetalDeliveryTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliveryTimeOperations.validateFetalDeliveryTimeTemplateId(
					(FetalDeliveryTime) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliveryTimeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliveryTimeMoodCode() {
		OperationsTestCase<FetalDeliveryTime> validateFetalDeliveryTimeMoodCodeTestCase = new OperationsTestCase<FetalDeliveryTime>(
			"validateFetalDeliveryTimeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_TIME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliveryTime target) {

			}

			@Override
			protected void updateToPass(FetalDeliveryTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliveryTimeOperations.validateFetalDeliveryTimeMoodCode(
					(FetalDeliveryTime) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliveryTimeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliveryTimeCodeP() {
		OperationsTestCase<FetalDeliveryTime> validateFetalDeliveryTimeCodePTestCase = new OperationsTestCase<FetalDeliveryTime>(
			"validateFetalDeliveryTimeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_TIME_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliveryTime target) {

			}

			@Override
			protected void updateToPass(FetalDeliveryTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliveryTimeOperations.validateFetalDeliveryTimeCodeP(
					(FetalDeliveryTime) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliveryTimeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliveryTimeCode() {
		OperationsTestCase<FetalDeliveryTime> validateFetalDeliveryTimeCodeTestCase = new OperationsTestCase<FetalDeliveryTime>(
			"validateFetalDeliveryTimeCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_TIME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliveryTime target) {

			}

			@Override
			protected void updateToPass(FetalDeliveryTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliveryTimeOperations.validateFetalDeliveryTimeCode(
					(FetalDeliveryTime) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliveryTimeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliveryTimeValue() {
		OperationsTestCase<FetalDeliveryTime> validateFetalDeliveryTimeValueTestCase = new OperationsTestCase<FetalDeliveryTime>(
			"validateFetalDeliveryTimeValue",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_DELIVERY_TIME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliveryTime target) {

			}

			@Override
			protected void updateToPass(FetalDeliveryTime target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliveryTimeOperations.validateFetalDeliveryTimeValue(
					(FetalDeliveryTime) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliveryTimeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateFetalDeliveryTimeParticipatingLocation() {
		OperationsTestCase<FetalDeliveryTime> validateFetalDeliveryTimeParticipatingLocationTestCase = new OperationsTestCase<FetalDeliveryTime>(
			"validateFetalDeliveryTimeParticipatingLocation", operationsForOCL.getOCLValue(
				"VALIDATE_FETAL_DELIVERY_TIME_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FetalDeliveryTime target) {

			}

			@Override
			protected void updateToPass(FetalDeliveryTime target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FetalDeliveryTimeOperations.validateFetalDeliveryTimeParticipatingLocation(
					(FetalDeliveryTime) objectToTest, diagnostician, map);
			}

		};

		validateFetalDeliveryTimeParticipatingLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FetalDeliveryTimeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FetalDeliveryTime> {
		public FetalDeliveryTime create() {
			return VsbrFactory.eINSTANCE.createFetalDeliveryTime();
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
	private static class ConstructorTestClass extends FetalDeliveryTimeOperations {
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

} // FetalDeliveryTimeOperations
