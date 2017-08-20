
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation;
import org.hl7.security.ds4p.contentprofile.operations.RefrainPolicySecurityObservationOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Refrain Policy Security Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateRefrainPolicySecurityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refrain Policy Security Observation Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateRefrainPolicySecurityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refrain Policy Security Observation Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateRefrainPolicySecurityObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refrain Policy Security Observation Value P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateRefrainPolicySecurityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Refrain Policy Security Observation Value</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservation#validateSecurityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RefrainPolicySecurityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRefrainPolicySecurityObservationCodeP() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateRefrainPolicySecurityObservationCodePTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateRefrainPolicySecurityObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_REFRAIN_POLICY_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateRefrainPolicySecurityObservationCodeP(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateRefrainPolicySecurityObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRefrainPolicySecurityObservationCode() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateRefrainPolicySecurityObservationCodeTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateRefrainPolicySecurityObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_REFRAIN_POLICY_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(RefrainPolicySecurityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateRefrainPolicySecurityObservationCode(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateRefrainPolicySecurityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRefrainPolicySecurityObservationValueP() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateRefrainPolicySecurityObservationValuePTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateRefrainPolicySecurityObservationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_REFRAIN_POLICY_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateRefrainPolicySecurityObservationValueP(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateRefrainPolicySecurityObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateRefrainPolicySecurityObservationValue() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateRefrainPolicySecurityObservationValueTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateRefrainPolicySecurityObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_REFRAIN_POLICY_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(RefrainPolicySecurityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.hl7.security.ds4p.contentprofile.RefrainPolicySecurityObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateRefrainPolicySecurityObservationValue(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateRefrainPolicySecurityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSecurityObservationTemplateId() {
		OperationsTestCase<RefrainPolicySecurityObservation> validateSecurityObservationTemplateIdTestCase = new OperationsTestCase<RefrainPolicySecurityObservation>(
			"validateSecurityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RefrainPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(RefrainPolicySecurityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RefrainPolicySecurityObservationOperations.validateSecurityObservationTemplateId(
					(RefrainPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RefrainPolicySecurityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RefrainPolicySecurityObservation> {
		public RefrainPolicySecurityObservation create() {
			return CONTENTPROFILEFactory.eINSTANCE.createRefrainPolicySecurityObservation();
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
	private static class ConstructorTestClass extends RefrainPolicySecurityObservationOperations {
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

} // RefrainPolicySecurityObservationOperations
