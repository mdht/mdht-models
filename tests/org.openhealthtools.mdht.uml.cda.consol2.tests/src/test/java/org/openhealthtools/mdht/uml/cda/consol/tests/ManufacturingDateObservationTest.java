
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ManufacturingDateObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Manufacturing Date Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation#validateManufacturingDateObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation#validateManufacturingDateObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ManufacturingDateObservation#validateManufacturingDateObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Manufacturing Date Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ManufacturingDateObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateManufacturingDateObservationTemplateId() {
		OperationsTestCase<ManufacturingDateObservation> validateManufacturingDateObservationTemplateIdTestCase = new OperationsTestCase<ManufacturingDateObservation>(
			"validateManufacturingDateObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MANUFACTURING_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ManufacturingDateObservation target) {

			}

			@Override
			protected void updateToPass(ManufacturingDateObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ManufacturingDateObservationOperations.validateManufacturingDateObservationTemplateId(
					(ManufacturingDateObservation) objectToTest, diagnostician, map);
			}

		};

		validateManufacturingDateObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateManufacturingDateObservationCode() {
		OperationsTestCase<ManufacturingDateObservation> validateManufacturingDateObservationCodeTestCase = new OperationsTestCase<ManufacturingDateObservation>(
			"validateManufacturingDateObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_MANUFACTURING_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ManufacturingDateObservation target) {

			}

			@Override
			protected void updateToPass(ManufacturingDateObservation target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ManufacturingDateObservationOperations.validateManufacturingDateObservationCode(
					(ManufacturingDateObservation) objectToTest, diagnostician, map);
			}

		};

		validateManufacturingDateObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateManufacturingDateObservationValue() {
		OperationsTestCase<ManufacturingDateObservation> validateManufacturingDateObservationValueTestCase = new OperationsTestCase<ManufacturingDateObservation>(
			"validateManufacturingDateObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_MANUFACTURING_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ManufacturingDateObservation target) {

			}

			@Override
			protected void updateToPass(ManufacturingDateObservation target) {
				target.init();

				// CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(DatatypesFactory.eINSTANCE.createTS("2020"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ManufacturingDateObservationOperations.validateManufacturingDateObservationValue(
					(ManufacturingDateObservation) objectToTest, diagnostician, map);
			}

		};

		validateManufacturingDateObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ManufacturingDateObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ManufacturingDateObservation> {
		public ManufacturingDateObservation create() {
			return ConsolFactory.eINSTANCE.createManufacturingDateObservation();
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
	private static class ConstructorTestClass extends ManufacturingDateObservationOperations {
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

} // ManufacturingDateObservationOperations
