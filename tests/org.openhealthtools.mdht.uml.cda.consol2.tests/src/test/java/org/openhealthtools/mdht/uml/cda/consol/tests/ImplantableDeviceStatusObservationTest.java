
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImplantableDeviceStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Implantable Device Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImplantableDeviceStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImplantableDeviceStatusObservationTemplateId() {
		OperationsTestCase<ImplantableDeviceStatusObservation> validateImplantableDeviceStatusObservationTemplateIdTestCase = new OperationsTestCase<ImplantableDeviceStatusObservation>(
			"validateImplantableDeviceStatusObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImplantableDeviceStatusObservation target) {

			}

			@Override
			protected void updateToPass(ImplantableDeviceStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationTemplateId(
					(ImplantableDeviceStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateImplantableDeviceStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImplantableDeviceStatusObservationCodeP() {
		OperationsTestCase<ImplantableDeviceStatusObservation> validateImplantableDeviceStatusObservationCodePTestCase = new OperationsTestCase<ImplantableDeviceStatusObservation>(
			"validateImplantableDeviceStatusObservationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImplantableDeviceStatusObservation target) {

			}

			@Override
			protected void updateToPass(ImplantableDeviceStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationCodeP(
					(ImplantableDeviceStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateImplantableDeviceStatusObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImplantableDeviceStatusObservationCode() {
		OperationsTestCase<ImplantableDeviceStatusObservation> validateImplantableDeviceStatusObservationCodeTestCase = new OperationsTestCase<ImplantableDeviceStatusObservation>(
			"validateImplantableDeviceStatusObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImplantableDeviceStatusObservation target) {

			}

			@Override
			protected void updateToPass(ImplantableDeviceStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				// target.setCode(cd);

			}

			@Override
			protected void setDependency(ImplantableDeviceStatusObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationCode(
					(ImplantableDeviceStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateImplantableDeviceStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImplantableDeviceStatusObservationValue() {
		OperationsTestCase<ImplantableDeviceStatusObservation> validateImplantableDeviceStatusObservationValueTestCase = new OperationsTestCase<ImplantableDeviceStatusObservation>(
			"validateImplantableDeviceStatusObservationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImplantableDeviceStatusObservation target) {

			}

			@Override
			protected void updateToPass(ImplantableDeviceStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationValue(
					(ImplantableDeviceStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateImplantableDeviceStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateImplantableDeviceStatusObservationValueP() {
		OperationsTestCase<ImplantableDeviceStatusObservation> validateImplantableDeviceStatusObservationValuePTestCase = new OperationsTestCase<ImplantableDeviceStatusObservation>(
			"validateImplantableDeviceStatusObservationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImplantableDeviceStatusObservation target) {

			}

			@Override
			protected void updateToPass(ImplantableDeviceStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImplantableDeviceStatusObservationOperations.validateImplantableDeviceStatusObservationValueP(
					(ImplantableDeviceStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateImplantableDeviceStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImplantableDeviceStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImplantableDeviceStatusObservation> {
		public ImplantableDeviceStatusObservation create() {
			return ConsolFactory.eINSTANCE.createImplantableDeviceStatusObservation();
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
	private static class ConstructorTestClass extends ImplantableDeviceStatusObservationOperations {
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

} // ImplantableDeviceStatusObservationOperations
