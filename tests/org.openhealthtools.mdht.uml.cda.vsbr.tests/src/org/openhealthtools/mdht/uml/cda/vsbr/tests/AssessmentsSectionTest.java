
/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ST;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.AssessmentsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessments Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#validateAssessmentsSectionAssessmentObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessments Section Assessment Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AssessmentsSection#getAssessmentObservations() <em>Get Assessment Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentsSectionTemplateId() {
		OperationsTestCase<AssessmentsSection> validateAssessmentsSectionTemplateIdTestCase = new OperationsTestCase<AssessmentsSection>(
			"validateAssessmentsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentsSection target) {

			}

			@Override
			protected void updateToPass(AssessmentsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentsSectionOperations.validateAssessmentsSectionTemplateId(
					(AssessmentsSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentsSectionClassCode() {
		OperationsTestCase<AssessmentsSection> validateAssessmentsSectionClassCodeTestCase = new OperationsTestCase<AssessmentsSection>(
			"validateAssessmentsSectionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENTS_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentsSection target) {

			}

			@Override
			protected void updateToPass(AssessmentsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentsSectionOperations.validateAssessmentsSectionClassCode(
					(AssessmentsSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentsSectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentsSectionMoodCode() {
		OperationsTestCase<AssessmentsSection> validateAssessmentsSectionMoodCodeTestCase = new OperationsTestCase<AssessmentsSection>(
			"validateAssessmentsSectionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENTS_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentsSection target) {

			}

			@Override
			protected void updateToPass(AssessmentsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentsSectionOperations.validateAssessmentsSectionMoodCode(
					(AssessmentsSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentsSectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentsSectionCode() {
		OperationsTestCase<AssessmentsSection> validateAssessmentsSectionCodeTestCase = new OperationsTestCase<AssessmentsSection>(
			"validateAssessmentsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENTS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentsSection target) {

			}

			@Override
			protected void updateToPass(AssessmentsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentsSectionOperations.validateAssessmentsSectionCode(
					(AssessmentsSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentsSectionCodeP() {
		OperationsTestCase<AssessmentsSection> validateAssessmentsSectionCodePTestCase = new OperationsTestCase<AssessmentsSection>(
			"validateAssessmentsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENTS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentsSection target) {

			}

			@Override
			protected void updateToPass(AssessmentsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentsSectionOperations.validateAssessmentsSectionCodeP(
					(AssessmentsSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentsSectionText() {
		OperationsTestCase<AssessmentsSection> validateAssessmentsSectionTextTestCase = new OperationsTestCase<AssessmentsSection>(
			"validateAssessmentsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENTS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentsSection target) {

			}

			@Override
			protected void updateToPass(AssessmentsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentsSectionOperations.validateAssessmentsSectionText(
					(AssessmentsSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentsSectionTitle() {
		OperationsTestCase<AssessmentsSection> validateAssessmentsSectionTitleTestCase = new OperationsTestCase<AssessmentsSection>(
			"validateAssessmentsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENTS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentsSection target) {

			}

			@Override
			protected void updateToPass(AssessmentsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentsSectionOperations.validateAssessmentsSectionTitle(
					(AssessmentsSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateAssessmentsSectionAssessmentObservation() {
		OperationsTestCase<AssessmentsSection> validateAssessmentsSectionAssessmentObservationTestCase = new OperationsTestCase<AssessmentsSection>(
			"validateAssessmentsSectionAssessmentObservation", operationsForOCL.getOCLValue(
				"VALIDATE_ASSESSMENTS_SECTION_ASSESSMENT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentsSection target) {

			}

			@Override
			protected void updateToPass(AssessmentsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentsSectionOperations.validateAssessmentsSectionAssessmentObservation(
					(AssessmentsSection) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentsSectionAssessmentObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetAssessmentObservations() {

		AssessmentsSection target = objectFactory.create();
		target.getAssessmentObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentsSection> {
		public AssessmentsSection create() {
			return VsbrFactory.eINSTANCE.createAssessmentsSection();
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
	private static class ConstructorTestClass extends AssessmentsSectionOperations {
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

} // AssessmentsSectionOperations
