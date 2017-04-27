
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

import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.HistoryofInfectionLiveBirthSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Historyof Infection Live Birth Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#validateHistoryofInfectionLiveBirthSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#validateHistoryofInfectionLiveBirthSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#validateHistoryofInfectionLiveBirthSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Live Birth Section Infection Present Live Birth</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionLiveBirthSection#getInfectionPresentLiveBirths() <em>Get Infection Present Live Births</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryofInfectionLiveBirthSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryofInfectionLiveBirthSectionTemplateId() {
		OperationsTestCase<HistoryofInfectionLiveBirthSection> validateHistoryofInfectionLiveBirthSectionTemplateIdTestCase = new OperationsTestCase<HistoryofInfectionLiveBirthSection>(
			"validateHistoryofInfectionLiveBirthSectionTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionLiveBirthSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionLiveBirthSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionLiveBirthSectionOperations.validateHistoryofInfectionLiveBirthSectionTemplateId(
					(HistoryofInfectionLiveBirthSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionLiveBirthSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryofInfectionLiveBirthSectionCode() {
		OperationsTestCase<HistoryofInfectionLiveBirthSection> validateHistoryofInfectionLiveBirthSectionCodeTestCase = new OperationsTestCase<HistoryofInfectionLiveBirthSection>(
			"validateHistoryofInfectionLiveBirthSectionCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionLiveBirthSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionLiveBirthSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionLiveBirthSectionOperations.validateHistoryofInfectionLiveBirthSectionCode(
					(HistoryofInfectionLiveBirthSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionLiveBirthSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryofInfectionLiveBirthSectionText() {
		OperationsTestCase<HistoryofInfectionLiveBirthSection> validateHistoryofInfectionLiveBirthSectionTextTestCase = new OperationsTestCase<HistoryofInfectionLiveBirthSection>(
			"validateHistoryofInfectionLiveBirthSectionText",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionLiveBirthSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionLiveBirthSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionLiveBirthSectionOperations.validateHistoryofInfectionLiveBirthSectionText(
					(HistoryofInfectionLiveBirthSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionLiveBirthSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testValidateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth() {
		OperationsTestCase<HistoryofInfectionLiveBirthSection> validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirthTestCase = new OperationsTestCase<HistoryofInfectionLiveBirthSection>(
			"validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth",
			operationsForOCL.getOCLValue(
				"VALIDATE_HISTORYOF_INFECTION_LIVE_BIRTH_SECTION_INFECTION_PRESENT_LIVE_BIRTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryofInfectionLiveBirthSection target) {

			}

			@Override
			protected void updateToPass(HistoryofInfectionLiveBirthSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryofInfectionLiveBirthSectionOperations.validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirth(
					(HistoryofInfectionLiveBirthSection) objectToTest, diagnostician, map);
			}

		};

		validateHistoryofInfectionLiveBirthSectionInfectionPresentLiveBirthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test

	public void testGetInfectionPresentLiveBirths() {

		HistoryofInfectionLiveBirthSection target = objectFactory.create();
		target.getInfectionPresentLiveBirths();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryofInfectionLiveBirthSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryofInfectionLiveBirthSection> {
		public HistoryofInfectionLiveBirthSection create() {
			return VsbrFactory.eINSTANCE.createHistoryofInfectionLiveBirthSection();
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
	private static class ConstructorTestClass extends HistoryofInfectionLiveBirthSectionOperations {
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

} // HistoryofInfectionLiveBirthSectionOperations
