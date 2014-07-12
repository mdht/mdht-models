/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.VitalSignsObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation#validateVitalSignsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation#validateVitalSignsObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation#validateVitalSignsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation#validateVitalSignsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation#validateVitalSignsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.VitalSignsObservation#validateVitalSignsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VitalSignsObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsObservationTemplateId() {
		OperationsTestCase<VitalSignsObservation> validateVitalSignsObservationTemplateIdTestCase = new OperationsTestCase<VitalSignsObservation>(
			"validateVitalSignsObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsObservationOperations.validateVitalSignsObservationTemplateId(
					(VitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsObservationClassCode() {
		OperationsTestCase<VitalSignsObservation> validateVitalSignsObservationClassCodeTestCase = new OperationsTestCase<VitalSignsObservation>(
			"validateVitalSignsObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsObservationOperations.validateVitalSignsObservationClassCode(
					(VitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsObservationMoodCode() {
		OperationsTestCase<VitalSignsObservation> validateVitalSignsObservationMoodCodeTestCase = new OperationsTestCase<VitalSignsObservation>(
			"validateVitalSignsObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsObservationOperations.validateVitalSignsObservationMoodCode(
					(VitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsObservationCodeP() {
		OperationsTestCase<VitalSignsObservation> validateVitalSignsObservationCodePTestCase = new OperationsTestCase<VitalSignsObservation>(
			"validateVitalSignsObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsObservationOperations.validateVitalSignsObservationCodeP(
					(VitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsObservationCode() {
		OperationsTestCase<VitalSignsObservation> validateVitalSignsObservationCodeTestCase = new OperationsTestCase<VitalSignsObservation>(
			"validateVitalSignsObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignsObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsObservationOperations.validateVitalSignsObservationCode(
					(VitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignsObservationValue() {
		OperationsTestCase<VitalSignsObservation> validateVitalSignsObservationValueTestCase = new OperationsTestCase<VitalSignsObservation>(
			"validateVitalSignsObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignsObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignsObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VitalSignsObservationOperations.validateVitalSignsObservationValue(
					(VitalSignsObservation) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignsObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VitalSignsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSignsObservation> {
		public VitalSignsObservation create() {
			return VsbrFactory.eINSTANCE.createVitalSignsObservation();
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
	private static class ConstructorTestClass extends VitalSignsObservationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // VitalSignsObservationOperations
