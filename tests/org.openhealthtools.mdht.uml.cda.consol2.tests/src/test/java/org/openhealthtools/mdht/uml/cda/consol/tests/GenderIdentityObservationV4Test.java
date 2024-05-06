
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.GenderIdentityObservationV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Gender Identity Observation V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateGenderIdentityObservationV4Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateGenderIdentityObservationV4ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4 Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateGenderIdentityObservationV4IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateGenderIdentityObservationV4IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V4IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateSocialHistoryObservationV4TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV4#validateSocialHistoryObservationV4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation V4 Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GenderIdentityObservationV4Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV4Value() {
		OperationsTestCase<GenderIdentityObservationV4> validateGenderIdentityObservationV4ValueTestCase = new OperationsTestCase<GenderIdentityObservationV4>(
			"validateGenderIdentityObservationV4Value", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV4 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV4 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("407376001", "2.16.840.1.113883.6.96");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV4Operations.validateGenderIdentityObservationV4Value(
					(GenderIdentityObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV4ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV4ValueP() {
		OperationsTestCase<GenderIdentityObservationV4> validateGenderIdentityObservationV4ValuePTestCase = new OperationsTestCase<GenderIdentityObservationV4>(
			"validateGenderIdentityObservationV4ValueP", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V4_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV4 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV4 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV4Operations.validateGenderIdentityObservationV4ValueP(
					(GenderIdentityObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV4ValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV4IVLTSLow() {
		OperationsTestCase<GenderIdentityObservationV4> validateGenderIdentityObservationV4IVLTSLowTestCase = new OperationsTestCase<GenderIdentityObservationV4>(
			"validateGenderIdentityObservationV4IVLTSLow", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV4 target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(GenderIdentityObservationV4 target) {
				target.init();
				IVL_TS efftime = DatatypesFactory.eINSTANCE.createIVL_TS("2020", "2023");
				target.setEffectiveTime(efftime);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV4Operations.validateGenderIdentityObservationV4IVLTSLow(
					(GenderIdentityObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV4IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV4IVLTSHigh() {
		OperationsTestCase<GenderIdentityObservationV4> validateGenderIdentityObservationV4IVLTSHighTestCase = new OperationsTestCase<GenderIdentityObservationV4>(
			"validateGenderIdentityObservationV4IVLTSHigh", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V4IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV4 target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(GenderIdentityObservationV4 target) {
				target.init();
				IVL_TS efftime = DatatypesFactory.eINSTANCE.createIVL_TS("2020", "2023");
				target.setEffectiveTime(efftime);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV4Operations.validateGenderIdentityObservationV4IVLTSHigh(
					(GenderIdentityObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV4IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4TemplateId() {
		OperationsTestCase<GenderIdentityObservationV4> validateSocialHistoryObservationV4TemplateIdTestCase = new OperationsTestCase<GenderIdentityObservationV4>(
			"validateSocialHistoryObservationV4TemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV4 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV4Operations.validateSocialHistoryObservationV4TemplateId(
					(GenderIdentityObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSocialHistoryObservationV4EffectiveTime() {
		OperationsTestCase<GenderIdentityObservationV4> validateSocialHistoryObservationV4EffectiveTimeTestCase = new OperationsTestCase<GenderIdentityObservationV4>(
			"validateSocialHistoryObservationV4EffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_SOCIAL_HISTORY_OBSERVATION_V4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV4 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV4 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV4Operations.validateSocialHistoryObservationV4EffectiveTime(
					(GenderIdentityObservationV4) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationV4EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GenderIdentityObservationV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<GenderIdentityObservationV4> {
		public GenderIdentityObservationV4 create() {
			return ConsolFactory.eINSTANCE.createGenderIdentityObservationV4();
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
	private static class ConstructorTestClass extends GenderIdentityObservationV4Operations {
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

} // GenderIdentityObservationV4Operations
