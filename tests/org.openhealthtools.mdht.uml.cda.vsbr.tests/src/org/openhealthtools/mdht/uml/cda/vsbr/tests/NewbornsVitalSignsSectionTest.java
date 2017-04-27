
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

import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.NewbornsVitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Newborns Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborns Vital Signs Section Newborns Vital Signs Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection#getNewbornsVitalSignsObservation() <em>Get Newborns Vital Signs Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NewbornsVitalSignsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsSectionTemplateId() {
		OperationsTestCase<NewbornsVitalSignsSection> validateNewbornsVitalSignsSectionTemplateIdTestCase = new OperationsTestCase<NewbornsVitalSignsSection>(
			"validateNewbornsVitalSignsSectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionTemplateId(
					(NewbornsVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsSectionClassCode() {
		OperationsTestCase<NewbornsVitalSignsSection> validateNewbornsVitalSignsSectionClassCodeTestCase = new OperationsTestCase<NewbornsVitalSignsSection>(
			"validateNewbornsVitalSignsSectionClassCode", operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionClassCode(
					(NewbornsVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsSectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsSectionMoodCode() {
		OperationsTestCase<NewbornsVitalSignsSection> validateNewbornsVitalSignsSectionMoodCodeTestCase = new OperationsTestCase<NewbornsVitalSignsSection>(
			"validateNewbornsVitalSignsSectionMoodCode", operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionMoodCode(
					(NewbornsVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsSectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsSectionCode() {
		OperationsTestCase<NewbornsVitalSignsSection> validateNewbornsVitalSignsSectionCodeTestCase = new OperationsTestCase<NewbornsVitalSignsSection>(
			"validateNewbornsVitalSignsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionCode(
					(NewbornsVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsSectionCodeP() {
		OperationsTestCase<NewbornsVitalSignsSection> validateNewbornsVitalSignsSectionCodePTestCase = new OperationsTestCase<NewbornsVitalSignsSection>(
			"validateNewbornsVitalSignsSectionCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionCodeP(
					(NewbornsVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsSectionText() {
		OperationsTestCase<NewbornsVitalSignsSection> validateNewbornsVitalSignsSectionTextTestCase = new OperationsTestCase<NewbornsVitalSignsSection>(
			"validateNewbornsVitalSignsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionText(
					(NewbornsVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateNewbornsVitalSignsSectionNewbornsVitalSignsObservation() {
		OperationsTestCase<NewbornsVitalSignsSection> validateNewbornsVitalSignsSectionNewbornsVitalSignsObservationTestCase = new OperationsTestCase<NewbornsVitalSignsSection>(
			"validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_NEWBORNS_VITAL_SIGNS_SECTION_NEWBORNS_VITAL_SIGNS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NewbornsVitalSignsSection target) {

			}

			@Override
			protected void updateToPass(NewbornsVitalSignsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NewbornsVitalSignsSectionOperations.validateNewbornsVitalSignsSectionNewbornsVitalSignsObservation(
					(NewbornsVitalSignsSection) objectToTest, diagnostician, map);
			}

		};

		validateNewbornsVitalSignsSectionNewbornsVitalSignsObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetNewbornsVitalSignsObservation() {

		NewbornsVitalSignsSection target = objectFactory.create();
		target.getNewbornsVitalSignsObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NewbornsVitalSignsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NewbornsVitalSignsSection> {
		public NewbornsVitalSignsSection create() {
			return VsbrFactory.eINSTANCE.createNewbornsVitalSignsSection();
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
	private static class ConstructorTestClass extends NewbornsVitalSignsSectionOperations {
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

} // NewbornsVitalSignsSectionOperations
