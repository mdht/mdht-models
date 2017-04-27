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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.REAL;
import org.eclipse.mdht.uml.hl7.datatypes.operations.REALOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>REAL</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.REAL#validateREAL(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate REAL</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.REAL#setValue(java.lang.Double) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class REALTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateREAL() {
		OperationsTestCase<REAL> validateREALTestCase = new OperationsTestCase<REAL>(
			"validateREAL", operationsForOCL.getOCLValue("VALIDATE_REAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{

			}

			@Override
			protected void updateToFail(REAL target) {

			}

			@Override
			protected void updateToPass(REAL target) {
				target.setValue(new Double(1.1));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return REALOperations.validateREAL((REAL) objectToTest, diagnostician, map);
			}

		};

		validateREALTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends REALOperations {
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
	private static class ObjectFactory implements TestObjectFactory<REAL> {

		public REAL create() {
			return DatatypesFactory.eINSTANCE.createREAL();
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
	private static class ConstructorTestClass extends REALOperations {
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

} // REALOperations
