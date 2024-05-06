
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
import org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.DisabilityStatusObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Disability Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#validateDisabilityStatusObservationAssessmentScaleObservationV2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disability Status Observation Assessment Scale Observation V2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservation#getAssessmentScaleObservationV2s() <em>Get Assessment Scale Observation V2s</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DisabilityStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDisabilityStatusObservationTemplateId() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationTemplateIdTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationTemplateId(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDisabilityStatusObservationCodeP() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationCodePTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationCodeP(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDisabilityStatusObservationCode() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationCodeTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_DISABILITY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

			}

			@Override
			protected void setDependency(DisabilityStatusObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationCode(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDisabilityStatusObservationStatusCodeP() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationStatusCodePTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationStatusCodeP(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDisabilityStatusObservationStatusCode() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationStatusCodeTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationStatusCode", operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(DisabilityStatusObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DisabilityStatusObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationStatusCode(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDisabilityStatusObservationEffectiveTime() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationEffectiveTimeTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationEffectiveTime(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDisabilityStatusObservationValue() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationValueTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();

				value.setCode("LA29240-1");
				value.setCodeSystem("2.16.840.1.113883.6.1");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationValue(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDisabilityStatusObservationValueP() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationValuePTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationValueP", operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();

				value.setCode("LA29240-1");
				value.setCodeSystem("2.16.840.1.113883.6.1");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationValueP(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDisabilityStatusObservationClassCode() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationClassCodeTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationClassCode(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateDisabilityStatusObservationMoodCode() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationMoodCodeTestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationMoodCode(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidateDisabilityStatusObservationAssessmentScaleObservationV2() {
		OperationsTestCase<DisabilityStatusObservation> validateDisabilityStatusObservationAssessmentScaleObservationV2TestCase = new OperationsTestCase<DisabilityStatusObservation>(
			"validateDisabilityStatusObservationAssessmentScaleObservationV2",
			operationsForOCL.getOCLValue(
				"VALIDATE_DISABILITY_STATUS_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION_V2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisabilityStatusObservation target) {

			}

			@Override
			protected void updateToPass(DisabilityStatusObservation target) {
				target.init();

				target.addObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservationV2().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisabilityStatusObservationOperations.validateDisabilityStatusObservationAssessmentScaleObservationV2(
					(DisabilityStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateDisabilityStatusObservationAssessmentScaleObservationV2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetAssessmentScaleObservationV2s() {

		DisabilityStatusObservation target = objectFactory.create();
		target.getAssessmentScaleObservationV2s();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DisabilityStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DisabilityStatusObservation> {
		public DisabilityStatusObservation create() {
			return ConsolFactory.eINSTANCE.createDisabilityStatusObservation();
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
	private static class ConstructorTestClass extends DisabilityStatusObservationOperations {
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

} // DisabilityStatusObservationOperations
