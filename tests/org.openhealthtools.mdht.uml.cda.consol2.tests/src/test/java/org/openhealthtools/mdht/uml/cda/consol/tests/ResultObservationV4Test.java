
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservationV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4#validateResultObservationV4Specimen1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation V4 Specimen1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservationV4#validateResultObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultObservationV4Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateResultObservationV4Specimen1() {
		OperationsTestCase<ResultObservationV4> validateResultObservationV4Specimen1TestCase = new OperationsTestCase<ResultObservationV4>(
			"validateResultObservationV4Specimen1",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_V4_SPECIMEN1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservationV4 target) {

			}

			@Override
			protected void updateToPass(ResultObservationV4 target) {
				target.init();
				target.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationV4Operations.validateResultObservationV4Specimen1(
					(ResultObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationV4Specimen1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateResultObservation2TemplateId() {
		OperationsTestCase<ResultObservationV4> validateResultObservation2TemplateIdTestCase = new OperationsTestCase<ResultObservationV4>(
			"validateResultObservation2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservationV4 target) {

			}

			@Override
			protected void updateToPass(ResultObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationV4Operations.validateResultObservation2TemplateId(
					(ResultObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateResultObservation2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultObservationV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultObservationV4> {
		public ResultObservationV4 create() {
			return ConsolFactory.eINSTANCE.createResultObservationV4();
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
	private static class ConstructorTestClass extends ResultObservationV4Operations {
	}

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

} // ResultObservationV4Operations
