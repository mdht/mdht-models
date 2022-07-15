
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
import org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SexualOrientationObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Sexual Orientation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationIVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservation#validateSexualOrientationObservationIVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sexual Orientation Observation IVLTS High</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SexualOrientationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSexualOrientationObservationTemplateId() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationTemplateIdTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationTemplateId(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSexualOrientationObservationCodeP() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationCodePTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationCodeP(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSexualOrientationObservationCode() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationCodeTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.init();

				// CD cd = DatatypesFactory.eINSTANCE.createCD();
				// target.setCode(cd);

			}

			@Override
			protected void setDependency(SexualOrientationObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationCode(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSexualOrientationObservationStatusCodeP() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationStatusCodePTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationStatusCodeP(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSexualOrientationObservationStatusCode() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationStatusCodeTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(SexualOrientationObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SexualOrientationObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationStatusCode(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSexualOrientationObservationEffectiveTime() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationEffectiveTimeTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationEffectiveTime(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSexualOrientationObservationValue() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationValueTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createAD());

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {

				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD("20430005", "2.16.840.1.113883.6.96");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationValue(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSexualOrientationObservationValueP() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationValuePTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationValueP", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {

				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationValueP(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSexualOrientationObservationClassCode() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationClassCodeTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationClassCode(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateSexualOrientationObservationMoodCode() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationMoodCodeTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {

			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationMoodCode(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSexualOrientationObservationIVLTSLow() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationIVLTSLowTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationIVLTSLow", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("2021", "2022"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationIVLTSLow(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationIVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateSexualOrientationObservationIVLTSHigh() {
		OperationsTestCase<SexualOrientationObservation> validateSexualOrientationObservationIVLTSHighTestCase = new OperationsTestCase<SexualOrientationObservation>(
			"validateSexualOrientationObservationIVLTSHigh", operationsForOCL.getOCLValue(
				"VALIDATE_SEXUAL_ORIENTATION_OBSERVATION_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SexualOrientationObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(SexualOrientationObservation target) {
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("2021", "2022"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SexualOrientationObservationOperations.validateSexualOrientationObservationIVLTSHigh(
					(SexualOrientationObservation) objectToTest, diagnostician, map);
			}

		};

		validateSexualOrientationObservationIVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SexualOrientationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SexualOrientationObservation> {
		public SexualOrientationObservation create() {
			return ConsolFactory.eINSTANCE.createSexualOrientationObservation();
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
	private static class ConstructorTestClass extends SexualOrientationObservationOperations {
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

} // SexualOrientationObservationOperations
