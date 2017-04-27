
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

import org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.PrenatalTestingandSurveillanceSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prenatal Testingand Surveillance Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#validatePrenatalTestingandSurveillanceSectionPrenatalCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prenatal Testingand Surveillance Section Prenatal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrenatalTestingandSurveillanceSection#getPrenatalCare() <em>Get Prenatal Care</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrenatalTestingandSurveillanceSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalTestingandSurveillanceSectionTemplateId() {
		OperationsTestCase<PrenatalTestingandSurveillanceSection> validatePrenatalTestingandSurveillanceSectionTemplateIdTestCase = new OperationsTestCase<PrenatalTestingandSurveillanceSection>(
			"validatePrenatalTestingandSurveillanceSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(PrenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionTemplateId(
					(PrenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalTestingandSurveillanceSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalTestingandSurveillanceSectionClassCode() {
		OperationsTestCase<PrenatalTestingandSurveillanceSection> validatePrenatalTestingandSurveillanceSectionClassCodeTestCase = new OperationsTestCase<PrenatalTestingandSurveillanceSection>(
			"validatePrenatalTestingandSurveillanceSectionClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(PrenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionClassCode(
					(PrenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalTestingandSurveillanceSectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalTestingandSurveillanceSectionMoodCode() {
		OperationsTestCase<PrenatalTestingandSurveillanceSection> validatePrenatalTestingandSurveillanceSectionMoodCodeTestCase = new OperationsTestCase<PrenatalTestingandSurveillanceSection>(
			"validatePrenatalTestingandSurveillanceSectionMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(PrenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionMoodCode(
					(PrenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalTestingandSurveillanceSectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalTestingandSurveillanceSectionCode() {
		OperationsTestCase<PrenatalTestingandSurveillanceSection> validatePrenatalTestingandSurveillanceSectionCodeTestCase = new OperationsTestCase<PrenatalTestingandSurveillanceSection>(
			"validatePrenatalTestingandSurveillanceSectionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(PrenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionCode(
					(PrenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalTestingandSurveillanceSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalTestingandSurveillanceSectionText() {
		OperationsTestCase<PrenatalTestingandSurveillanceSection> validatePrenatalTestingandSurveillanceSectionTextTestCase = new OperationsTestCase<PrenatalTestingandSurveillanceSection>(
			"validatePrenatalTestingandSurveillanceSectionText",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(PrenatalTestingandSurveillanceSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionText(
					(PrenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalTestingandSurveillanceSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrenatalTestingandSurveillanceSectionPrenatalCare() {
		OperationsTestCase<PrenatalTestingandSurveillanceSection> validatePrenatalTestingandSurveillanceSectionPrenatalCareTestCase = new OperationsTestCase<PrenatalTestingandSurveillanceSection>(
			"validatePrenatalTestingandSurveillanceSectionPrenatalCare",
			operationsForOCL.getOCLValue(
				"VALIDATE_PRENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRENATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(PrenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrenatalTestingandSurveillanceSectionOperations.validatePrenatalTestingandSurveillanceSectionPrenatalCare(
					(PrenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validatePrenatalTestingandSurveillanceSectionPrenatalCareTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetPrenatalCare() {

		PrenatalTestingandSurveillanceSection target = objectFactory.create();
		target.getPrenatalCare();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrenatalTestingandSurveillanceSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrenatalTestingandSurveillanceSection> {
		public PrenatalTestingandSurveillanceSection create() {
			return VsbrFactory.eINSTANCE.createPrenatalTestingandSurveillanceSection();
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
	private static class ConstructorTestClass extends PrenatalTestingandSurveillanceSectionOperations {
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

} // PrenatalTestingandSurveillanceSectionOperations
