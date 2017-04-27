
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MothersVitalSignsObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mothers Vital Signs Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsObservation#validateMothersVitalSignsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MothersVitalSignsObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsObservationTemplateId() {
		OperationsTestCase<MothersVitalSignsObservation> validateMothersVitalSignsObservationTemplateIdTestCase = new OperationsTestCase<MothersVitalSignsObservation>(
			"validateMothersVitalSignsObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationTemplateId(
					(MothersVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsObservationClassCode() {
		OperationsTestCase<MothersVitalSignsObservation> validateMothersVitalSignsObservationClassCodeTestCase = new OperationsTestCase<MothersVitalSignsObservation>(
			"validateMothersVitalSignsObservationClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationClassCode(
					(MothersVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsObservationMoodCode() {
		OperationsTestCase<MothersVitalSignsObservation> validateMothersVitalSignsObservationMoodCodeTestCase = new OperationsTestCase<MothersVitalSignsObservation>(
			"validateMothersVitalSignsObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationMoodCode(
					(MothersVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsObservationCodeP() {
		OperationsTestCase<MothersVitalSignsObservation> validateMothersVitalSignsObservationCodePTestCase = new OperationsTestCase<MothersVitalSignsObservation>(
			"validateMothersVitalSignsObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationCodeP(
					(MothersVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsObservationCode() {
		OperationsTestCase<MothersVitalSignsObservation> validateMothersVitalSignsObservationCodeTestCase = new OperationsTestCase<MothersVitalSignsObservation>(
			"validateMothersVitalSignsObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationCode(
					(MothersVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsObservationValue() {
		OperationsTestCase<MothersVitalSignsObservation> validateMothersVitalSignsObservationValueTestCase = new OperationsTestCase<MothersVitalSignsObservation>(
			"validateMothersVitalSignsObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsObservationOperations.validateMothersVitalSignsObservationValue(
					(MothersVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MothersVitalSignsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MothersVitalSignsObservation> {
		public MothersVitalSignsObservation create() {
			return VsbrFactory.eINSTANCE.createMothersVitalSignsObservation();
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
	private static class ConstructorTestClass extends MothersVitalSignsObservationOperations {
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

} // MothersVitalSignsObservationOperations
