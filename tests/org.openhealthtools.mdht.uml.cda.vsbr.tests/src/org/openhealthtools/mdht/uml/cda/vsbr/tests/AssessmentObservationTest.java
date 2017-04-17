
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

import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AssessmentObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation#validateAssessmentObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation#validateAssessmentObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation#validateAssessmentObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation#validateAssessmentObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation#validateAssessmentObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentObservation#validateAssessmentObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentObservationTemplateId() {
		OperationsTestCase<AssessmentObservation> validateAssessmentObservationTemplateIdTestCase = new OperationsTestCase<AssessmentObservation>(
			"validateAssessmentObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentObservationOperations.validateAssessmentObservationTemplateId(
					(AssessmentObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentObservationClassCode() {
		OperationsTestCase<AssessmentObservation> validateAssessmentObservationClassCodeTestCase = new OperationsTestCase<AssessmentObservation>(
			"validateAssessmentObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentObservationOperations.validateAssessmentObservationClassCode(
					(AssessmentObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentObservationMoodCode() {
		OperationsTestCase<AssessmentObservation> validateAssessmentObservationMoodCodeTestCase = new OperationsTestCase<AssessmentObservation>(
			"validateAssessmentObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentObservationOperations.validateAssessmentObservationMoodCode(
					(AssessmentObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentObservationCodeP() {
		OperationsTestCase<AssessmentObservation> validateAssessmentObservationCodePTestCase = new OperationsTestCase<AssessmentObservation>(
			"validateAssessmentObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentObservationOperations.validateAssessmentObservationCodeP(
					(AssessmentObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentObservationCode() {
		OperationsTestCase<AssessmentObservation> validateAssessmentObservationCodeTestCase = new OperationsTestCase<AssessmentObservation>(
			"validateAssessmentObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentObservationOperations.validateAssessmentObservationCode(
					(AssessmentObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentObservationValue() {
		OperationsTestCase<AssessmentObservation> validateAssessmentObservationValueTestCase = new OperationsTestCase<AssessmentObservation>(
			"validateAssessmentObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentObservationOperations.validateAssessmentObservationValue(
					(AssessmentObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentObservation> {
		public AssessmentObservation create() {
			return VsbrFactory.eINSTANCE.createAssessmentObservation();
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
	private static class ConstructorTestClass extends AssessmentObservationOperations {
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

} // AssessmentObservationOperations
