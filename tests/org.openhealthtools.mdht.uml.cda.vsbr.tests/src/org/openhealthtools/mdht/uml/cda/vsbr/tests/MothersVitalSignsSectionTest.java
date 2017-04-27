
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.MothersVitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mothers Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#validateMothersVitalSignsSectionMothersVitalSignsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mothers Vital Signs Section Mothers Vital Signs Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection#getMothersVitalSignsObservations() <em>Get Mothers Vital Signs Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MothersVitalSignsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsSectionTemplateId() {
		OperationsTestCase<MothersVitalSignsSection> validateMothersVitalSignsSectionTemplateIdTestCase = new OperationsTestCase<MothersVitalSignsSection>(
			"validateMothersVitalSignsSectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionTemplateId(
					(MothersVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsSectionClassCode() {
		OperationsTestCase<MothersVitalSignsSection> validateMothersVitalSignsSectionClassCodeTestCase = new OperationsTestCase<MothersVitalSignsSection>(
			"validateMothersVitalSignsSectionClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionClassCode(
					(MothersVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsSectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsSectionMoodCode() {
		OperationsTestCase<MothersVitalSignsSection> validateMothersVitalSignsSectionMoodCodeTestCase = new OperationsTestCase<MothersVitalSignsSection>(
			"validateMothersVitalSignsSectionMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionMoodCode(
					(MothersVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsSectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsSectionCode() {
		OperationsTestCase<MothersVitalSignsSection> validateMothersVitalSignsSectionCodeTestCase = new OperationsTestCase<MothersVitalSignsSection>(
			"validateMothersVitalSignsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionCode(
					(MothersVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsSectionCodeP() {
		OperationsTestCase<MothersVitalSignsSection> validateMothersVitalSignsSectionCodePTestCase = new OperationsTestCase<MothersVitalSignsSection>(
			"validateMothersVitalSignsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionCodeP(
					(MothersVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsSectionText() {
		OperationsTestCase<MothersVitalSignsSection> validateMothersVitalSignsSectionTextTestCase = new OperationsTestCase<MothersVitalSignsSection>(
			"validateMothersVitalSignsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionText(
					(MothersVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateMothersVitalSignsSectionMothersVitalSignsObservation() {
		OperationsTestCase<MothersVitalSignsSection> validateMothersVitalSignsSectionMothersVitalSignsObservationTestCase = new OperationsTestCase<MothersVitalSignsSection>(
			"validateMothersVitalSignsSectionMothersVitalSignsObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_MOTHERS_VITAL_SIGNS_SECTION_MOTHERS_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MothersVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(MothersVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MothersVitalSignsSectionOperations.validateMothersVitalSignsSectionMothersVitalSignsObservation(
					(MothersVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateMothersVitalSignsSectionMothersVitalSignsObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetMothersVitalSignsObservations() {

		MothersVitalSignsSection target = objectFactory.create();
		target.getMothersVitalSignsObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MothersVitalSignsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MothersVitalSignsSection> {
		public MothersVitalSignsSection create() {
			return VsbrFactory.eINSTANCE.createMothersVitalSignsSection();
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
	private static class ConstructorTestClass extends MothersVitalSignsSectionOperations {
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

} // MothersVitalSignsSectionOperations
