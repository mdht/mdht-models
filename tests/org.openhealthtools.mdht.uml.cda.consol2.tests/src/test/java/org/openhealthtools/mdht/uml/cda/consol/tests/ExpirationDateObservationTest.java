
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
import org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ExpirationDateObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Expiration Date Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservation#validateExpirationDateObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Expiration Date Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExpirationDateObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateExpirationDateObservationTemplateId() {
		OperationsTestCase<ExpirationDateObservation> validateExpirationDateObservationTemplateIdTestCase = new OperationsTestCase<ExpirationDateObservation>(
			"validateExpirationDateObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_EXPIRATION_DATE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExpirationDateObservation target) {

			}

			@Override
			protected void updateToPass(ExpirationDateObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExpirationDateObservationOperations.validateExpirationDateObservationTemplateId(
					(ExpirationDateObservation) objectToTest, diagnostician, map);
			}

		};

		validateExpirationDateObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateExpirationDateObservationCodeP() {
		OperationsTestCase<ExpirationDateObservation> validateExpirationDateObservationCodePTestCase = new OperationsTestCase<ExpirationDateObservation>(
			"validateExpirationDateObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExpirationDateObservation target) {

			}

			@Override
			protected void updateToPass(ExpirationDateObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExpirationDateObservationOperations.validateExpirationDateObservationCodeP(
					(ExpirationDateObservation) objectToTest, diagnostician, map);
			}

		};

		validateExpirationDateObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateExpirationDateObservationCode() {
		OperationsTestCase<ExpirationDateObservation> validateExpirationDateObservationCodeTestCase = new OperationsTestCase<ExpirationDateObservation>(
			"validateExpirationDateObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_EXPIRATION_DATE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExpirationDateObservation target) {

			}

			@Override
			protected void updateToPass(ExpirationDateObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("C160939", "2.16.840.1.113883.3.26.1.1");
				target.getValues().add(value);
			}

			@Override
			protected void setDependency(ExpirationDateObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ExpirationDateObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExpirationDateObservationOperations.validateExpirationDateObservationCode(
					(ExpirationDateObservation) objectToTest, diagnostician, map);
			}

		};

		validateExpirationDateObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateExpirationDateObservationValue() {
		OperationsTestCase<ExpirationDateObservation> validateExpirationDateObservationValueTestCase = new OperationsTestCase<ExpirationDateObservation>(
			"validateExpirationDateObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_EXPIRATION_DATE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExpirationDateObservation target) {

			}

			@Override
			protected void updateToPass(ExpirationDateObservation target) {
				target.init();

				target.getValues().add(DatatypesFactory.eINSTANCE.createTS("2020"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExpirationDateObservationOperations.validateExpirationDateObservationValue(
					(ExpirationDateObservation) objectToTest, diagnostician, map);
			}

		};

		validateExpirationDateObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExpirationDateObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExpirationDateObservation> {
		public ExpirationDateObservation create() {
			return ConsolFactory.eINSTANCE.createExpirationDateObservation();
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
	private static class ConstructorTestClass extends ExpirationDateObservationOperations {
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

} // ExpirationDateObservationOperations
