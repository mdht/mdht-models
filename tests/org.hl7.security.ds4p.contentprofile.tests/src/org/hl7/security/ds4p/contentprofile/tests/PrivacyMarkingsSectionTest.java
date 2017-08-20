
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.StrucDocText;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection;
import org.hl7.security.ds4p.contentprofile.operations.PrivacyMarkingsSectionOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Markings Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Text</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacyMarkingsSection#validatePrivacyMarkingsSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Markings Section Entry1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrivacyMarkingsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyMarkingsSectionTemplateId() {
		OperationsTestCase<PrivacyMarkingsSection> validatePrivacyMarkingsSectionTemplateIdTestCase = new OperationsTestCase<PrivacyMarkingsSection>(
			"validatePrivacyMarkingsSectionTemplateId", operationsForOCL.getOCLValue(
				"VALIDATE_PRIVACY_MARKINGS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyMarkingsSection target) {

			}

			@Override
			protected void updateToPass(PrivacyMarkingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionTemplateId(
					(PrivacyMarkingsSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyMarkingsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyMarkingsSectionCode() {
		OperationsTestCase<PrivacyMarkingsSection> validatePrivacyMarkingsSectionCodeTestCase = new OperationsTestCase<PrivacyMarkingsSection>(
			"validatePrivacyMarkingsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_MARKINGS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyMarkingsSection target) {

			}

			@Override
			protected void updateToPass(PrivacyMarkingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionCode(
					(PrivacyMarkingsSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyMarkingsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyMarkingsSectionCodeP() {
		OperationsTestCase<PrivacyMarkingsSection> validatePrivacyMarkingsSectionCodePTestCase = new OperationsTestCase<PrivacyMarkingsSection>(
			"validatePrivacyMarkingsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_MARKINGS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyMarkingsSection target) {

			}

			@Override
			protected void updateToPass(PrivacyMarkingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionCodeP(
					(PrivacyMarkingsSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyMarkingsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyMarkingsSectionText() {
		OperationsTestCase<PrivacyMarkingsSection> validatePrivacyMarkingsSectionTextTestCase = new OperationsTestCase<PrivacyMarkingsSection>(
			"validatePrivacyMarkingsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_MARKINGS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyMarkingsSection target) {

			}

			@Override
			protected void updateToPass(PrivacyMarkingsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionText(
					(PrivacyMarkingsSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyMarkingsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePrivacyMarkingsSectionEntry1() {
		OperationsTestCase<PrivacyMarkingsSection> validatePrivacyMarkingsSectionEntry1TestCase = new OperationsTestCase<PrivacyMarkingsSection>(
			"validatePrivacyMarkingsSectionEntry1",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_MARKINGS_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrivacyMarkingsSection target) {

			}

			@Override
			protected void updateToPass(PrivacyMarkingsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrivacyMarkingsSectionOperations.validatePrivacyMarkingsSectionEntry1(
					(PrivacyMarkingsSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacyMarkingsSectionEntry1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrivacyMarkingsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrivacyMarkingsSection> {
		public PrivacyMarkingsSection create() {
			return CONTENTPROFILEFactory.eINSTANCE.createPrivacyMarkingsSection();
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
	private static class ConstructorTestClass extends PrivacyMarkingsSectionOperations {
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

} // PrivacyMarkingsSectionOperations
