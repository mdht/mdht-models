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
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.ONOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ON</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ON#validateInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ONTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateInvariant() {
		OperationsTestCase<ON> validateInvariantTestCase = new OperationsTestCase<ON>(
			"validateInvariant", operationsForOCL.getOCLValue("VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ON target) {
						target.addText("ON Text");
						target.getFamilies().add(DatatypesFactory.eINSTANCE.createENXP());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ON target) {
						target.addText("ON Text");
						target.getGivens().add(DatatypesFactory.eINSTANCE.createENXP());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ON target) {
						target.addText("ON Text");
						target.getGivens().add(DatatypesFactory.eINSTANCE.createENXP());
						target.getFamilies().add(DatatypesFactory.eINSTANCE.createENXP());
					}
				});
			}

			@Override
			protected void updateToPass(ON target) {
				target.addText("ON Text");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ONOperations.validateInvariant((ON) objectToTest, diagnostician, map);
			}

		};

		validateInvariantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ONOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ON> {

		public ON create() {
			return DatatypesFactory.eINSTANCE.createON();
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
	private static class ConstructorTestClass extends ONOperations {
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

} // ONOperations
