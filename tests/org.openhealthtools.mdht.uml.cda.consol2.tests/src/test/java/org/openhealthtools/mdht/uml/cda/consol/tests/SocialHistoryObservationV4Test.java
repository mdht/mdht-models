
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryObservationV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Observation V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4CodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4StatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4#validateSocialHistoryObservationV4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistoryObservationV4Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4TemplateId() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4TemplateIdTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4TemplateId(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSocialHistoryObservationV4Id() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4IdTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4Id",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4Id(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4CodeP() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4CodePTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4CodeP", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4CodeP(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4CodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSocialHistoryObservationV4Code() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4CodeTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4Code",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD("229819007", "2.16.840.1.113883.6.96"));

			}

			@Override
			protected void setDependency(SocialHistoryObservationV4 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationV4CodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4Code(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4Value() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4ValueTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4Value", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4Value(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4ClassCode() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4ClassCodeTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4ClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4ClassCode(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4MoodCode() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4MoodCodeTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4MoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4MoodCode(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4StatusCodeP() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4StatusCodePTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4StatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4StatusCodeP(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4StatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4StatusCode() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4StatusCodeTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4StatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4StatusCode(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4EffectiveTime() {
		OperationsTestCase<SocialHistoryObservationV4> validateSocialHistoryObservationV4EffectiveTimeTestCase = new OperationsTestCase<SocialHistoryObservationV4>(
			"validateSocialHistoryObservationV4EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservationV4 target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservationV4 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationV4Operations.validateSocialHistoryObservationV4EffectiveTime(
					(SocialHistoryObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SocialHistoryObservationV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistoryObservationV4> {
		public SocialHistoryObservationV4 create() {
			return ConsolFactory.eINSTANCE.createSocialHistoryObservationV4();
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
	private static class ConstructorTestClass extends SocialHistoryObservationV4Operations {
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

} // SocialHistoryObservationV4Operations
