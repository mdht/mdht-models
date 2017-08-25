
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation;
import org.hl7.security.ds4p.contentprofile.operations.ObligationPolicySecurityObservationOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Obligation Policy Security Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateObligationPolicySecurityObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obligation Policy Security Observation Value P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateObligationPolicySecurityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obligation Policy Security Observation Value</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateSecurityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateSecurityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservation#validateSecurityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ObligationPolicySecurityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateObligationPolicySecurityObservationValueP() {
		OperationsTestCase<ObligationPolicySecurityObservation> validateObligationPolicySecurityObservationValuePTestCase = new OperationsTestCase<ObligationPolicySecurityObservation>(
			"validateObligationPolicySecurityObservationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObligationPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ObligationPolicySecurityObservation target) {
				target.init();

				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObligationPolicySecurityObservationOperations.validateObligationPolicySecurityObservationValueP(
					(ObligationPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateObligationPolicySecurityObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateObligationPolicySecurityObservationValue() {
		OperationsTestCase<ObligationPolicySecurityObservation> validateObligationPolicySecurityObservationValueTestCase = new OperationsTestCase<ObligationPolicySecurityObservation>(
			"validateObligationPolicySecurityObservationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_OBLIGATION_POLICY_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObligationPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ObligationPolicySecurityObservation target) {
				target.init();

				// ' and (value.code = 'CPLYCD'
				CE value = DatatypesFactory.eINSTANCE.createCE("CPLYCD", "2.16.840.1.113883.1.11.20471");
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(ObligationPolicySecurityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.hl7.security.ds4p.contentprofile.ObligationPolicySecurityObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObligationPolicySecurityObservationOperations.validateObligationPolicySecurityObservationValue(
					(ObligationPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateObligationPolicySecurityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSecurityObservationTemplateId() {
		OperationsTestCase<ObligationPolicySecurityObservation> validateSecurityObservationTemplateIdTestCase = new OperationsTestCase<ObligationPolicySecurityObservation>(
			"validateSecurityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObligationPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ObligationPolicySecurityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObligationPolicySecurityObservationOperations.validateSecurityObservationTemplateId(
					(ObligationPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSecurityObservationCodeP() {
		OperationsTestCase<ObligationPolicySecurityObservation> validateSecurityObservationCodePTestCase = new OperationsTestCase<ObligationPolicySecurityObservation>(
			"validateSecurityObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObligationPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ObligationPolicySecurityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObligationPolicySecurityObservationOperations.validateSecurityObservationCodeP(
					(ObligationPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSecurityObservationCode() {
		OperationsTestCase<ObligationPolicySecurityObservation> validateSecurityObservationCodeTestCase = new OperationsTestCase<ObligationPolicySecurityObservation>(
			"validateSecurityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObligationPolicySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ObligationPolicySecurityObservation target) {
				target.init();
				// SECCONOBS' and value.codeSystem = '2.16.840.1.113883.1.11.20471'
				CD cd = DatatypesFactory.eINSTANCE.createCD("SECCONOBS", "2.16.840.1.113883.1.11.20471");
				target.setCode(cd);

			}

			@Override
			protected void setDependency(ObligationPolicySecurityObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.hl7.security.ds4p.contentprofile.SecurityObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObligationPolicySecurityObservationOperations.validateSecurityObservationCode(
					(ObligationPolicySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ObligationPolicySecurityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ObligationPolicySecurityObservation> {
		public ObligationPolicySecurityObservation create() {
			return CONTENTPROFILEFactory.eINSTANCE.createObligationPolicySecurityObservation();
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
	private static class ConstructorTestClass extends ObligationPolicySecurityObservationOperations {
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

} // ObligationPolicySecurityObservationOperations
