
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3Code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3StatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GenderIdentityObservationV3#validateGenderIdentityObservationV3ValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Gender Identity Observation V3 Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GenderIdentityObservationV3Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateGenderIdentityObservationV3Code() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3CodeTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3Code", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GenderIdentityObservationV3 target) {

			}

			@Override
			protected void updateToPass(GenderIdentityObservationV3 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3Code(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3CodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateGenderIdentityObservationV3StatusCode() {
		OperationsTestCase<GenderIdentityObservationV3> validateGenderIdentityObservationV3StatusCodeTestCase = new OperationsTestCase<GenderIdentityObservationV3>(
			"validateGenderIdentityObservationV3StatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_GENDER_IDENTITY_OBSERVATION_V3_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GenderIdentityObservationV3Operations.validateGenderIdentityObservationV3StatusCode(
					(GenderIdentityObservationV3) objectToTest, diagnostician, map);
			}

		};

		validateGenderIdentityObservationV3StatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
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
