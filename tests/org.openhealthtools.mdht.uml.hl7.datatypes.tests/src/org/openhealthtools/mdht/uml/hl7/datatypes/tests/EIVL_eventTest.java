/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.EIVL_eventOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EIVL event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateCodeSystemName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#validateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event#init() <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EIVL_eventTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOriginalText() {
		OperationsTestCase<EIVL_event> validateOriginalTextTestCase = new OperationsTestCase<EIVL_event>(
			"validateOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EIVL_event target) {
				target.setOriginalText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(EIVL_event target) {
				target.setOriginalText(null);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EIVL_eventOperations.validateOriginalText((EIVL_event) objectToTest, diagnostician, map);
			}

		};

		validateOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTranslation() {
		OperationsTestCase<EIVL_event> validateTranslationTestCase = new OperationsTestCase<EIVL_event>(
			"validateTranslation",
			operationsForOCL.getOCLValue("VALIDATE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EIVL_event target) {

				target.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(EIVL_event target) {

				target.getTranslations().clear();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EIVL_eventOperations.validateTranslation((EIVL_event) objectToTest, diagnostician, map);
			}

		};

		validateTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCodeSystem() {
		OperationsTestCase<EIVL_event> validateCodeSystemTestCase = new OperationsTestCase<EIVL_event>(
			"validateCodeSystem", operationsForOCL.getOCLValue("VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EIVL_event target) {

				target.setCodeSystem("not2.16.840.1.113883.5.139");
			}

			@Override
			protected void updateToPass(EIVL_event target) {
				target.setCodeSystem("2.16.840.1.113883.5.139");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EIVL_eventOperations.validateCodeSystem((EIVL_event) objectToTest, diagnostician, map);
			}

		};

		validateCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCodeSystemName() {
		OperationsTestCase<EIVL_event> validateCodeSystemNameTestCase = new OperationsTestCase<EIVL_event>(
			"validateCodeSystemName",
			operationsForOCL.getOCLValue("VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EIVL_event target) {

				target.setCodeSystemName("noTimingEvent");
			}

			@Override
			protected void updateToPass(EIVL_event target) {
				target.setCodeSystemName("TimingEvent");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EIVL_eventOperations.validateCodeSystemName((EIVL_event) objectToTest, diagnostician, map);
			}

		};

		validateCodeSystemNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCode() {
		OperationsTestCase<EIVL_event> validateCodeTestCase = new OperationsTestCase<EIVL_event>(
			"validateCode", operationsForOCL.getOCLValue("VALIDATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EIVL_event target) {

				target.setCode("notACD");
			}

			@Override
			protected void updateToPass(EIVL_event target) {

				target.setCode("ACD");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EIVL_eventOperations.validateCode((EIVL_event) objectToTest, diagnostician, map);
			}

		};

		validateCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EIVL_eventOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EIVL_event> {

		public EIVL_event create() {
			return DatatypesFactory.eINSTANCE.createEIVL_event();
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
	private static class ConstructorTestClass extends EIVL_eventOperations {
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

} // EIVL_eventOperations
