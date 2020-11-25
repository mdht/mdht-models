
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
import org.openhealthtools.mdht.uml.cda.consol.MRISafetyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MRISafetyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>MRI Safety Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MRISafetyObservation#validateMRISafetyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MRI Safety Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MRISafetyObservation#validateMRISafetyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MRI Safety Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MRISafetyObservation#validateMRISafetyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MRI Safety Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MRISafetyObservation#validateMRISafetyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MRI Safety Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MRISafetyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMRISafetyObservationTemplateId() {
		OperationsTestCase<MRISafetyObservation> validateMRISafetyObservationTemplateIdTestCase = new OperationsTestCase<MRISafetyObservation>(
			"validateMRISafetyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MRI_SAFETY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MRISafetyObservation target) {

			}

			@Override
			protected void updateToPass(MRISafetyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MRISafetyObservationOperations.validateMRISafetyObservationTemplateId(
					(MRISafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateMRISafetyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMRISafetyObservationCode() {
		OperationsTestCase<MRISafetyObservation> validateMRISafetyObservationCodeTestCase = new OperationsTestCase<MRISafetyObservation>(
			"validateMRISafetyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MRI_SAFETY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MRISafetyObservation target) {

			}

			@Override
			protected void updateToPass(MRISafetyObservation target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCD();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MRISafetyObservationOperations.validateMRISafetyObservationCode(
					(MRISafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateMRISafetyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateMRISafetyObservationValue() {
		OperationsTestCase<MRISafetyObservation> validateMRISafetyObservationValueTestCase = new OperationsTestCase<MRISafetyObservation>(
			"validateMRISafetyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MRI_SAFETY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MRISafetyObservation target) {

			}

			@Override
			protected void updateToPass(MRISafetyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("C113844", "2.16.840.1.113883.3.26.1.1");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MRISafetyObservationOperations.validateMRISafetyObservationValue(
					(MRISafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateMRISafetyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateMRISafetyObservationValueP() {
		OperationsTestCase<MRISafetyObservation> validateMRISafetyObservationValuePTestCase = new OperationsTestCase<MRISafetyObservation>(
			"validateMRISafetyObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_MRI_SAFETY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MRISafetyObservation target) {

			}

			@Override
			protected void updateToPass(MRISafetyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MRISafetyObservationOperations.validateMRISafetyObservationValueP(
					(MRISafetyObservation) objectToTest, diagnostician, map);
			}

		};

		validateMRISafetyObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MRISafetyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MRISafetyObservation> {
		public MRISafetyObservation create() {
			return ConsolFactory.eINSTANCE.createMRISafetyObservation();
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
	private static class ConstructorTestClass extends MRISafetyObservationOperations {
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

} // MRISafetyObservationOperations
