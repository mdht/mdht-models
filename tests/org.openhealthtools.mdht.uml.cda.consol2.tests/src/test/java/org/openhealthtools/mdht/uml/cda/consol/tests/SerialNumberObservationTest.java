
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
import org.openhealthtools.mdht.uml.cda.consol.SerialNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SerialNumberObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Serial Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SerialNumberObservation#validateSerialNumberObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serial Number Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SerialNumberObservation#validateSerialNumberObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serial Number Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SerialNumberObservation#validateSerialNumberObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serial Number Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SerialNumberObservation#validateSerialNumberObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Serial Number Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SerialNumberObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSerialNumberObservationTemplateId() {
		OperationsTestCase<SerialNumberObservation> validateSerialNumberObservationTemplateIdTestCase = new OperationsTestCase<SerialNumberObservation>(
			"validateSerialNumberObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SERIAL_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SerialNumberObservation target) {

			}

			@Override
			protected void updateToPass(SerialNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SerialNumberObservationOperations.validateSerialNumberObservationTemplateId(
					(SerialNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateSerialNumberObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSerialNumberObservationCodeP() {
		OperationsTestCase<SerialNumberObservation> validateSerialNumberObservationCodePTestCase = new OperationsTestCase<SerialNumberObservation>(
			"validateSerialNumberObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SERIAL_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SerialNumberObservation target) {

			}

			@Override
			protected void updateToPass(SerialNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SerialNumberObservationOperations.validateSerialNumberObservationCodeP(
					(SerialNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateSerialNumberObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSerialNumberObservationCode() {
		OperationsTestCase<SerialNumberObservation> validateSerialNumberObservationCodeTestCase = new OperationsTestCase<SerialNumberObservation>(
			"validateSerialNumberObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SERIAL_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SerialNumberObservation target) {

			}

			@Override
			protected void updateToPass(SerialNumberObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				// target.setCode(cd);

			}

			@Override
			protected void setDependency(SerialNumberObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SerialNumberObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SerialNumberObservationOperations.validateSerialNumberObservationCode(
					(SerialNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateSerialNumberObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSerialNumberObservationValue() {
		OperationsTestCase<SerialNumberObservation> validateSerialNumberObservationValueTestCase = new OperationsTestCase<SerialNumberObservation>(
			"validateSerialNumberObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SERIAL_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SerialNumberObservation target) {

			}

			@Override
			protected void updateToPass(SerialNumberObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SerialNumberObservationOperations.validateSerialNumberObservationValue(
					(SerialNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateSerialNumberObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SerialNumberObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SerialNumberObservation> {
		public SerialNumberObservation create() {
			return ConsolFactory.eINSTANCE.createSerialNumberObservation();
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
	private static class ConstructorTestClass extends SerialNumberObservationOperations {
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

} // SerialNumberObservationOperations
