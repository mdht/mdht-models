
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.PrivacyAnnotation;
import org.hl7.security.ds4p.contentprofile.operations.PrivacyAnnotationOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Annotation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Class Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Mood Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Status Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Status Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationObligationPolicySecurityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Obligation Policy Security Observation</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationRefrainPolicySecurityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Refrain Policy Security Observation</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationPurposeOfUseSecurityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Purpose Of Use Security Observation</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#validatePrivacyAnnotationConfidentialityCodeSecurityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Annotation Confidentiality Code Security Observation</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#getObligationPolicySecurityObservations() <em>Get Obligation Policy Security Observations</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#getRefrainPolicySecurityObservations() <em>Get Refrain Policy Security Observations</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#getPurposeOfUseSecurityObservations() <em>Get Purpose Of Use Security Observations</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyAnnotation#getConfidentialityCodeSecurityObservation() <em>Get Confidentiality Code Security Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrivacyAnnotationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyAnnotationTemplateId() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationTemplateIdTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_ANNOTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationTemplateId(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyAnnotationClassCode() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationClassCodeTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_ANNOTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationClassCode(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyAnnotationMoodCode() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationMoodCodeTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_ANNOTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationMoodCode(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyAnnotationStatusCodeP() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationStatusCodePTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationStatusCodeP(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePrivacyAnnotationStatusCode() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationStatusCodeTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_ANNOTATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(PrivacyAnnotation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.hl7.security.ds4p.contentprofile.PrivacyAnnotationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationStatusCode(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePrivacyAnnotationObligationPolicySecurityObservation() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationObligationPolicySecurityObservationTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationObligationPolicySecurityObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_ANNOTATION_OBLIGATION_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.init();
				target.addObservation(
					CONTENTPROFILEFactory.eINSTANCE.createObligationPolicySecurityObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationObligationPolicySecurityObservation(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationObligationPolicySecurityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePrivacyAnnotationRefrainPolicySecurityObservation() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationRefrainPolicySecurityObservationTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationRefrainPolicySecurityObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_ANNOTATION_REFRAIN_POLICY_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.init();
				target.addObservation(CONTENTPROFILEFactory.eINSTANCE.createRefrainPolicySecurityObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationRefrainPolicySecurityObservation(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationRefrainPolicySecurityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePrivacyAnnotationPurposeOfUseSecurityObservation() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationPurposeOfUseSecurityObservationTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationPurposeOfUseSecurityObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_ANNOTATION_PURPOSE_OF_USE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.init();
				target.addObservation(CONTENTPROFILEFactory.eINSTANCE.createPurposeOfUseSecurityObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationPurposeOfUseSecurityObservation(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationPurposeOfUseSecurityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePrivacyAnnotationConfidentialityCodeSecurityObservation() {
		OperationsTestCase<PrivacyAnnotation> validatePrivacyAnnotationConfidentialityCodeSecurityObservationTestCase = new OperationsTestCase<PrivacyAnnotation>(
			"validatePrivacyAnnotationConfidentialityCodeSecurityObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_ANNOTATION_CONFIDENTIALITY_CODE_SECURITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyAnnotation target) {

			}

			@Override
			protected void updateToPass(PrivacyAnnotation target) {
				target.addObservation(
					CONTENTPROFILEFactory.eINSTANCE.createConfidentialitySecurityObservation().init());
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyAnnotationOperations.validatePrivacyAnnotationConfidentialityCodeSecurityObservation(
					(PrivacyAnnotation) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyAnnotationConfidentialityCodeSecurityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetObligationPolicySecurityObservations() {

		PrivacyAnnotation target = objectFactory.create();
		target.getObligationPolicySecurityObservations();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetRefrainPolicySecurityObservations() {

		PrivacyAnnotation target = objectFactory.create();
		target.getRefrainPolicySecurityObservations();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetPurposeOfUseSecurityObservations() {

		PrivacyAnnotation target = objectFactory.create();
		target.getPurposeOfUseSecurityObservations();

	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetConfidentialityCodeSecurityObservation() {

		PrivacyAnnotation target = objectFactory.create();
		target.getConfidentialityCodeSecurityObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrivacyAnnotationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrivacyAnnotation> {
		public PrivacyAnnotation create() {
			return CONTENTPROFILEFactory.eINSTANCE.createPrivacyAnnotation();
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
	private static class ConstructorTestClass extends PrivacyAnnotationOperations {
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

} // PrivacyAnnotationOperations
