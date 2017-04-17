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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.operations.CSOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>CS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateCodeSystemName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateCodeSystemVersion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Version</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateDisplayName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Display Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CSTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOriginalText() {
		OperationsTestCase<CS> validateOriginalTextTestCase = new OperationsTestCase<CS>(
			"validateOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(CS target) {
				target.setCode("code");
				target.setOriginalText(DatatypesFactory.eINSTANCE.createED("ot"));

			}

			@Override
			protected void updateToPass(CS target) {
				target.setCode("code");
				target.setOriginalText(null);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CSOperations.validateOriginalText((CS) objectToTest, diagnostician, map);
			}

		};

		validateOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCodeSystem() {
		OperationsTestCase<CS> validateCodeSystemTestCase = new OperationsTestCase<CS>(
			"validateCodeSystem", operationsForOCL.getOCLValue("VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(CS target) {
				target.setCode("code");
				target.setCodeSystem("csn");
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(CS target) {
						target.setCode("code");

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CSOperations.validateCodeSystem((CS) objectToTest, diagnostician, map);
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
		OperationsTestCase<CS> validateCodeSystemNameTestCase = new OperationsTestCase<CS>(
			"validateCodeSystemName",
			operationsForOCL.getOCLValue("VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(CS target) {
				target.setCode("code");
				target.setCodeSystemName("csn");
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(CS target) {
						target.setCode("code");

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CSOperations.validateCodeSystemName((CS) objectToTest, diagnostician, map);
			}

		};

		validateCodeSystemNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCodeSystemVersion() {
		OperationsTestCase<CS> validateCodeSystemVersionTestCase = new OperationsTestCase<CS>(
			"validateCodeSystemVersion",
			operationsForOCL.getOCLValue("VALIDATE_CODE_SYSTEM_VERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(CS target) {
				target.setCode("code");
				target.setCodeSystemVersion("csn");
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(CS target) {
						target.setCode("code");

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CSOperations.validateCodeSystemVersion((CS) objectToTest, diagnostician, map);
			}

		};

		validateCodeSystemVersionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDisplayName() {
		OperationsTestCase<CS> validateDisplayNameTestCase = new OperationsTestCase<CS>(
			"validateDisplayName",
			operationsForOCL.getOCLValue("VALIDATE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(CS target) {
				target.setCode("code");
				target.setDisplayName("dn");
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(CS target) {
						target.setCode("code");

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CSOperations.validateDisplayName((CS) objectToTest, diagnostician, map);
			}

		};

		validateDisplayNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CSOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CS> {

		public CS create() {
			return DatatypesFactory.eINSTANCE.createCS();
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
	private static class ConstructorTestClass extends CSOperations {
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

} // CSOperations
