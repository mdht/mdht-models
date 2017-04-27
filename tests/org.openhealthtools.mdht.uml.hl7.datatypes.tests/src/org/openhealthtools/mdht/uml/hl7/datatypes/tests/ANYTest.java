/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.ANY;
import org.eclipse.mdht.uml.hl7.datatypes.operations.ANYOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ANY</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ANY#isNullFlavorDefined() <em>Is Null Flavor Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ANY#isNullFlavorUndefined() <em>Is Null Flavor Undefined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ANY#hasContent() <em>Has Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ANY#isDefined(java.lang.String) <em>Is Defined</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ANY#matches(java.lang.String, java.lang.String) <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ANYTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ANYOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ANY> {

		public ANY create() {
			return null;
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
	private static class ConstructorTestClass extends ANYOperations {
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

} // ANYOperations
