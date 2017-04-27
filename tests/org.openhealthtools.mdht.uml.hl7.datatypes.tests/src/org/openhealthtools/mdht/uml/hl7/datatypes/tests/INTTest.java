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
import org.eclipse.mdht.uml.hl7.datatypes.INT;
import org.eclipse.mdht.uml.hl7.datatypes.operations.INTOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>INT</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.INT#validateINT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate INT</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.INT#setValue(java.lang.Integer) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class INTTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateINT() {
		OperationsTestCase<INT> validateINTTestCase = new OperationsTestCase<INT>(
			"validateINT", operationsForOCL.getOCLValue("VALIDATE_INT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{

			}

			@Override
			protected void updateToFail(INT target) {

			}

			@Override
			protected void updateToPass(INT target) {
				target.setValue(new Integer(1));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return INTOperations.validateINT((INT) objectToTest, diagnostician, map);
			}

		};

		validateINTTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends INTOperations {
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
	private static class ObjectFactory implements TestObjectFactory<INT> {

		public INT create() {
			return DatatypesFactory.eINSTANCE.createINT();
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
	private static class ConstructorTestClass extends INTOperations {
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

} // INTOperations
