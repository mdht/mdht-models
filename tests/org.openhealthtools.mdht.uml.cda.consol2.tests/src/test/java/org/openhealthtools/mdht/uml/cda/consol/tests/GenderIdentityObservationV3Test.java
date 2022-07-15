
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
import org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3;
import org.openhealthtools.mdht.uml.cda.consol.operations.GenderIdentityObservationV3Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Gender Identity Observation V3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3ClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3MoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservation2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateSocialHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GenderIdentityObservationV3Test extends CDAValidationTest {

	@Test
	public void testValidateGenderIdentityObservationV3EffectiveTime() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3EffectiveTimeTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3EffectiveTime(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV3Value() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3ValueTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3Value", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD("407376001", "2.16.840.1.113883.6.96");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3Value(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV3ValueP() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3ValuePTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3ValueP", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createTS());
			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {

				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3ValueP(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3ValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGenderIdentityObservationV3ClassCode() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3ClassCodeTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3ClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3ClassCode(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3ClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGenderIdentityObservationV3MoodCode() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3MoodCodeTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3MoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3MoodCode(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3MoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV3Id() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3IdTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3Id",
			operationsForOCL.getOCLValue("VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3Id(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV3IVLTSLow() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3IVLTSLowTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3IVLTSLow", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("2002", "20022"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3IVLTSLow(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV3IVLTSHigh() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3IVLTSHighTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3IVLTSHigh", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("2002", "20022"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3IVLTSHigh(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservation2TemplateId() {
		OperationsTestCase<GenderIdentityObservationV3> validateSocialHistoryObservation2TemplateIdTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateSocialHistoryObservation2TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateSocialHistoryObservation2TemplateId(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservation2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationCodeP() {
		OperationsTestCase<GenderIdentityObservationV3> validateSocialHistoryObservationCodePTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateSocialHistoryObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateSocialHistoryObservationCodeP(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSocialHistoryObservationCode() {
		OperationsTestCase<GenderIdentityObservationV3> validateSocialHistoryObservationCodeTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateSocialHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();

				// CD cd = DatatypesFactory.eINSTANCE.createCD();
				// target.setCode(cd);

			}

			@Override
			protected void setDependency(GenderIdentityObservationV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateSocialHistoryObservationCode(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationStatusCodeP() {
		OperationsTestCase<GenderIdentityObservationV3> validateSocialHistoryObservationStatusCodePTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateSocialHistoryObservationStatusCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateSocialHistoryObservationStatusCodeP(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationStatusCode() {
		OperationsTestCase<GenderIdentityObservationV3> validateSocialHistoryObservationStatusCodeTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateSocialHistoryObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(GenderIdentityObservationV3 target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateSocialHistoryObservationStatusCode(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GenderIdentityObservationV3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<GenderIdentityObservationV3> {
		public GenderIdentityObservationV3 create() {
			return ConsolFactory.eINSTANCE.createGenderIdentityObservationV3();
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
	private static class ConstructorTestClass extends GenderIdentityObservationV3Operations {
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

} // GenderIdentityObservationV3Operations
