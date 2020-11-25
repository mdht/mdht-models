
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
import org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.DistinctIdentificationCodeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Distinct Identification Code Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation#validateDistinctIdentificationCodeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation#validateDistinctIdentificationCodeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation#validateDistinctIdentificationCodeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation#validateDistinctIdentificationCodeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DistinctIdentificationCodeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDistinctIdentificationCodeObservationTemplateId() {
		OperationsTestCase<DistinctIdentificationCodeObservation> validateDistinctIdentificationCodeObservationTemplateIdTestCase = new OperationsTestCase<DistinctIdentificationCodeObservation>(
			"validateDistinctIdentificationCodeObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DistinctIdentificationCodeObservation target) {

			}

			@Override
			protected void updateToPass(DistinctIdentificationCodeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DistinctIdentificationCodeObservationOperations.validateDistinctIdentificationCodeObservationTemplateId(
					(DistinctIdentificationCodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateDistinctIdentificationCodeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDistinctIdentificationCodeObservationCodeP() {
		OperationsTestCase<DistinctIdentificationCodeObservation> validateDistinctIdentificationCodeObservationCodePTestCase = new OperationsTestCase<DistinctIdentificationCodeObservation>(
			"validateDistinctIdentificationCodeObservationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DistinctIdentificationCodeObservation target) {

			}

			@Override
			protected void updateToPass(DistinctIdentificationCodeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DistinctIdentificationCodeObservationOperations.validateDistinctIdentificationCodeObservationCodeP(
					(DistinctIdentificationCodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateDistinctIdentificationCodeObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDistinctIdentificationCodeObservationCode() {
		OperationsTestCase<DistinctIdentificationCodeObservation> validateDistinctIdentificationCodeObservationCodeTestCase = new OperationsTestCase<DistinctIdentificationCodeObservation>(
			"validateDistinctIdentificationCodeObservationCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DistinctIdentificationCodeObservation target) {

			}

			@Override
			protected void updateToPass(DistinctIdentificationCodeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				// target.setCode(cd);

			}

			@Override
			protected void setDependency(DistinctIdentificationCodeObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DistinctIdentificationCodeObservationOperations.validateDistinctIdentificationCodeObservationCode(
					(DistinctIdentificationCodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateDistinctIdentificationCodeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDistinctIdentificationCodeObservationValue() {
		OperationsTestCase<DistinctIdentificationCodeObservation> validateDistinctIdentificationCodeObservationValueTestCase = new OperationsTestCase<DistinctIdentificationCodeObservation>(
			"validateDistinctIdentificationCodeObservationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DistinctIdentificationCodeObservation target) {

			}

			@Override
			protected void updateToPass(DistinctIdentificationCodeObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				// target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DistinctIdentificationCodeObservationOperations.validateDistinctIdentificationCodeObservationValue(
					(DistinctIdentificationCodeObservation) objectToTest, diagnostician, map);
			}

		};

		validateDistinctIdentificationCodeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DistinctIdentificationCodeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DistinctIdentificationCodeObservation> {
		public DistinctIdentificationCodeObservation create() {
			return ConsolFactory.eINSTANCE.createDistinctIdentificationCodeObservation();
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
	private static class ConstructorTestClass extends DistinctIdentificationCodeObservationOperations {
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

} // DistinctIdentificationCodeObservationOperations
