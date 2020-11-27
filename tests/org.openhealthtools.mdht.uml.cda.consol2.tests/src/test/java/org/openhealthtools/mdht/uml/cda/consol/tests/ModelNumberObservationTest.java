
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
import org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ModelNumberObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Model Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation#validateModelNumberObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation#validateModelNumberObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation#validateModelNumberObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservation#validateModelNumberObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Model Number Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ModelNumberObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateModelNumberObservationTemplateId() {
		OperationsTestCase<ModelNumberObservation> validateModelNumberObservationTemplateIdTestCase = new OperationsTestCase<ModelNumberObservation>(
			"validateModelNumberObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MODEL_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ModelNumberObservation target) {

			}

			@Override
			protected void updateToPass(ModelNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ModelNumberObservationOperations.validateModelNumberObservationTemplateId(
					(ModelNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateModelNumberObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateModelNumberObservationCodeP() {
		OperationsTestCase<ModelNumberObservation> validateModelNumberObservationCodePTestCase = new OperationsTestCase<ModelNumberObservation>(
			"validateModelNumberObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MODEL_NUMBER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ModelNumberObservation target) {

			}

			@Override
			protected void updateToPass(ModelNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ModelNumberObservationOperations.validateModelNumberObservationCodeP(
					(ModelNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateModelNumberObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateModelNumberObservationCode() {
		OperationsTestCase<ModelNumberObservation> validateModelNumberObservationCodeTestCase = new OperationsTestCase<ModelNumberObservation>(
			"validateModelNumberObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MODEL_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ModelNumberObservation target) {

			}

			@Override
			protected void updateToPass(ModelNumberObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("C160939", "2.16.840.1.113883.3.26.1.1");
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(ModelNumberObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ModelNumberObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ModelNumberObservationOperations.validateModelNumberObservationCode(
					(ModelNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateModelNumberObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateModelNumberObservationValue() {
		OperationsTestCase<ModelNumberObservation> validateModelNumberObservationValueTestCase = new OperationsTestCase<ModelNumberObservation>(
			"validateModelNumberObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MODEL_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ModelNumberObservation target) {

			}

			@Override
			protected void updateToPass(ModelNumberObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createED("SERIALNUMBER"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ModelNumberObservationOperations.validateModelNumberObservationValue(
					(ModelNumberObservation) objectToTest, diagnostician, map);
			}

		};

		validateModelNumberObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ModelNumberObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ModelNumberObservation> {
		public ModelNumberObservation create() {
			return ConsolFactory.eINSTANCE.createModelNumberObservation();
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
	private static class ConstructorTestClass extends ModelNumberObservationOperations {
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

} // ModelNumberObservationOperations
