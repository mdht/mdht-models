
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.ProtectedProblem;
import org.hl7.security.ds4p.contentprofile.operations.ProtectedProblemOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protected Problem</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ProtectedProblem#validateProtectedProblemProblemProvenance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protected Problem Problem Provenance</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ProtectedProblem#validateProtectedProblemPrivacyAnnotations(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protected Problem Privacy Annotations</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ProtectedProblem#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProtectedProblemTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProtectedProblemProblemProvenance() {
		OperationsTestCase<ProtectedProblem> validateProtectedProblemProblemProvenanceTestCase = new OperationsTestCase<ProtectedProblem>(
			"validateProtectedProblemProblemProvenance", operationsForOCL.getOCLValue(
				"VALIDATE_PROTECTED_PROBLEM_PROBLEM_PROVENANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtectedProblem target) {

			}

			@Override
			protected void updateToPass(ProtectedProblem target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtectedProblemOperations.validateProtectedProblemProblemProvenance(
					(ProtectedProblem) objectToTest, diagnostician, map);
			}

		};

		validateProtectedProblemProblemProvenanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProtectedProblemPrivacyAnnotations() {
		OperationsTestCase<ProtectedProblem> validateProtectedProblemPrivacyAnnotationsTestCase = new OperationsTestCase<ProtectedProblem>(
			"validateProtectedProblemPrivacyAnnotations", operationsForOCL.getOCLValue(
				"VALIDATE_PROTECTED_PROBLEM_PRIVACY_ANNOTATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtectedProblem target) {

			}

			@Override
			protected void updateToPass(ProtectedProblem target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtectedProblemOperations.validateProtectedProblemPrivacyAnnotations(
					(ProtectedProblem) objectToTest, diagnostician, map);
			}

		};

		validateProtectedProblemPrivacyAnnotationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<ProtectedProblem> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<ProtectedProblem>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtectedProblem target) {

			}

			@Override
			protected void updateToPass(ProtectedProblem target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtectedProblemOperations.validateProblemObservationTemplateId(
					(ProtectedProblem) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProtectedProblemOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProtectedProblem> {
		public ProtectedProblem create() {
			return CONTENTPROFILEFactory.eINSTANCE.createProtectedProblem();
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
	private static class ConstructorTestClass extends ProtectedProblemOperations {
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

} // ProtectedProblemOperations
