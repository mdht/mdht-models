
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

import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NewbornsVitalSignsObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Newborns Vital Signs Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsObservation#validateNewbornsVitalSignsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NewbornsVitalSignsObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsObservationTemplateId() {
		OperationsTestCase<NewbornsVitalSignsObservation> validateNewbornsVitalSignsObservationTemplateIdTestCase = new OperationsTestCase<NewbornsVitalSignsObservation>(
			"validateNewbornsVitalSignsObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationTemplateId(
					(NewbornsVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsObservationClassCode() {
		OperationsTestCase<NewbornsVitalSignsObservation> validateNewbornsVitalSignsObservationClassCodeTestCase = new OperationsTestCase<NewbornsVitalSignsObservation>(
			"validateNewbornsVitalSignsObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationClassCode(
					(NewbornsVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsObservationMoodCode() {
		OperationsTestCase<NewbornsVitalSignsObservation> validateNewbornsVitalSignsObservationMoodCodeTestCase = new OperationsTestCase<NewbornsVitalSignsObservation>(
			"validateNewbornsVitalSignsObservationMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationMoodCode(
					(NewbornsVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsObservationCodeP() {
		OperationsTestCase<NewbornsVitalSignsObservation> validateNewbornsVitalSignsObservationCodePTestCase = new OperationsTestCase<NewbornsVitalSignsObservation>(
			"validateNewbornsVitalSignsObservationCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationCodeP(
					(NewbornsVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsObservationCode() {
		OperationsTestCase<NewbornsVitalSignsObservation> validateNewbornsVitalSignsObservationCodeTestCase = new OperationsTestCase<NewbornsVitalSignsObservation>(
			"validateNewbornsVitalSignsObservationCode", operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationCode(
					(NewbornsVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsObservationValue() {
		OperationsTestCase<NewbornsVitalSignsObservation> validateNewbornsVitalSignsObservationValueTestCase = new OperationsTestCase<NewbornsVitalSignsObservation>(
			"validateNewbornsVitalSignsObservationValue", operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsObservationOperations.validateNewbornsVitalSignsObservationValue(
					(NewbornsVitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NewbornsVitalSignsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NewbornsVitalSignsObservation> {
		public NewbornsVitalSignsObservation create() {
			return VsbrFactory.eINSTANCE.createNewbornsVitalSignsObservation();
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
	private static class ConstructorTestClass extends NewbornsVitalSignsObservationOperations {
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

} // NewbornsVitalSignsObservationOperations
