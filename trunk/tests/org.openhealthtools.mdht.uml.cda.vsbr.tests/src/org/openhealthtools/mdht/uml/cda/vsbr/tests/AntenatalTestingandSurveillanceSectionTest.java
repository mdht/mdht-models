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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.AntenatalTestingandSurveillanceSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Antenatal Testingand Surveillance Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#validateAntenatalTestingandSurveillanceSectionPreNatalCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Antenatal Testingand Surveillance Section Pre Natal Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.AntenatalTestingandSurveillanceSection#getPreNatalCare() <em>Get Pre Natal Care</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AntenatalTestingandSurveillanceSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAntenatalTestingandSurveillanceSectionTemplateId() {
		OperationsTestCase<AntenatalTestingandSurveillanceSection> validateAntenatalTestingandSurveillanceSectionTemplateIdTestCase = new OperationsTestCase<AntenatalTestingandSurveillanceSection>(
			"validateAntenatalTestingandSurveillanceSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AntenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(AntenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionTemplateId(
					(AntenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validateAntenatalTestingandSurveillanceSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAntenatalTestingandSurveillanceSectionClassCode() {
		OperationsTestCase<AntenatalTestingandSurveillanceSection> validateAntenatalTestingandSurveillanceSectionClassCodeTestCase = new OperationsTestCase<AntenatalTestingandSurveillanceSection>(
			"validateAntenatalTestingandSurveillanceSectionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AntenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(AntenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionClassCode(
					(AntenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validateAntenatalTestingandSurveillanceSectionClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAntenatalTestingandSurveillanceSectionMoodCode() {
		OperationsTestCase<AntenatalTestingandSurveillanceSection> validateAntenatalTestingandSurveillanceSectionMoodCodeTestCase = new OperationsTestCase<AntenatalTestingandSurveillanceSection>(
			"validateAntenatalTestingandSurveillanceSectionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AntenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(AntenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionMoodCode(
					(AntenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validateAntenatalTestingandSurveillanceSectionMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAntenatalTestingandSurveillanceSectionCode() {
		OperationsTestCase<AntenatalTestingandSurveillanceSection> validateAntenatalTestingandSurveillanceSectionCodeTestCase = new OperationsTestCase<AntenatalTestingandSurveillanceSection>(
			"validateAntenatalTestingandSurveillanceSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AntenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(AntenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionCode(
					(AntenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validateAntenatalTestingandSurveillanceSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAntenatalTestingandSurveillanceSectionText() {
		OperationsTestCase<AntenatalTestingandSurveillanceSection> validateAntenatalTestingandSurveillanceSectionTextTestCase = new OperationsTestCase<AntenatalTestingandSurveillanceSection>(
			"validateAntenatalTestingandSurveillanceSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AntenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(AntenatalTestingandSurveillanceSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionText(
					(AntenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validateAntenatalTestingandSurveillanceSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAntenatalTestingandSurveillanceSectionPreNatalCare() {
		OperationsTestCase<AntenatalTestingandSurveillanceSection> validateAntenatalTestingandSurveillanceSectionPreNatalCareTestCase = new OperationsTestCase<AntenatalTestingandSurveillanceSection>(
			"validateAntenatalTestingandSurveillanceSectionPreNatalCare",
			operationsForOCL.getOCLValue("VALIDATE_ANTENATAL_TESTINGAND_SURVEILLANCE_SECTION_PRE_NATAL_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AntenatalTestingandSurveillanceSection target) {

			}

			@Override
			protected void updateToPass(AntenatalTestingandSurveillanceSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AntenatalTestingandSurveillanceSectionOperations.validateAntenatalTestingandSurveillanceSectionPreNatalCare(
					(AntenatalTestingandSurveillanceSection) objectToTest, diagnostician, map);
			}

		};

		validateAntenatalTestingandSurveillanceSectionPreNatalCareTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPreNatalCare() {

		AntenatalTestingandSurveillanceSection target = objectFactory.create();
		target.getPreNatalCare();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AntenatalTestingandSurveillanceSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AntenatalTestingandSurveillanceSection> {
		public AntenatalTestingandSurveillanceSection create() {
			return VsbrFactory.eINSTANCE.createAntenatalTestingandSurveillanceSection();
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
	private static class ConstructorTestClass extends AntenatalTestingandSurveillanceSectionOperations {
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

} // AntenatalTestingandSurveillanceSectionOperations
