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
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.ENOperations;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EN</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validateDelimiter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validateFamily(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validateGiven(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validatePrefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#validateSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addDelimiter(java.lang.String) <em>Add Delimiter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addFamily(java.lang.String) <em>Add Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addGiven(java.lang.String) <em>Add Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addPrefix(java.lang.String) <em>Add Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addSuffix(java.lang.String) <em>Add Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#addText(java.lang.String) <em>Add Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getText() <em>Get Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.EN#getText(boolean) <em>Get Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ENTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDelimiter() {
		OperationsTestCase<EN> validateDelimiterTestCase = new OperationsTestCase<EN>(
			"validateDelimiter", operationsForOCL.getOCLValue("VALIDATE_DELIMITER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EN target) {
				target.getDelimiters().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, "asdf"));
			}

			@Override
			protected void updateToPass(EN target) {
				target.getDelimiters().clear();
				target.getDelimiters().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.DEL, "asdf"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ENOperations.validateDelimiter((EN) objectToTest, diagnostician, map);
			}

		};

		validateDelimiterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamily() {
		OperationsTestCase<EN> validateFamilyTestCase = new OperationsTestCase<EN>(
			"validateFamily", operationsForOCL.getOCLValue("VALIDATE_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EN target) {
				target.getFamilies().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.DEL, "asdf"));
			}

			@Override
			protected void updateToPass(EN target) {
				target.getFamilies().clear();
				target.getFamilies().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, "asdf"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ENOperations.validateFamily((EN) objectToTest, diagnostician, map);
			}

		};

		validateFamilyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGiven() {
		OperationsTestCase<EN> validateGivenTestCase = new OperationsTestCase<EN>(
			"validateGiven", operationsForOCL.getOCLValue("VALIDATE_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EN target) {
				target.getGivens().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, "asdf"));
			}

			@Override
			protected void updateToPass(EN target) {
				target.getGivens().clear();
				target.getGivens().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.GIV, "asdf"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ENOperations.validateGiven((EN) objectToTest, diagnostician, map);
			}

		};

		validateGivenTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrefix() {
		OperationsTestCase<EN> validatePrefixTestCase = new OperationsTestCase<EN>(
			"validatePrefix", operationsForOCL.getOCLValue("VALIDATE_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EN target) {
				target.getPrefixes().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, "asdf"));
			}

			@Override
			protected void updateToPass(EN target) {
				target.getPrefixes().clear();
				target.getPrefixes().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.PFX, "asdf"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ENOperations.validatePrefix((EN) objectToTest, diagnostician, map);
			}

		};

		validatePrefixTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSuffix() {
		OperationsTestCase<EN> validateSuffixTestCase = new OperationsTestCase<EN>(
			"validateSuffix", operationsForOCL.getOCLValue("VALIDATE_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(EN target) {
				target.getSuffixes().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.FAM, "asdf"));
			}

			@Override
			protected void updateToPass(EN target) {
				target.getSuffixes().clear();
				target.getSuffixes().add(DatatypesFactory.eINSTANCE.createENXP(EntityNamePartType.SFX, "asdf"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ENOperations.validateSuffix((EN) objectToTest, diagnostician, map);
			}

		};

		validateSuffixTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetText() {

		EN target = objectFactory.create();
		target.getText();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ENOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EN> {

		public EN create() {
			return DatatypesFactory.eINSTANCE.createEN();
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
	private static class ConstructorTestClass extends ENOperations {
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

} // ENOperations
