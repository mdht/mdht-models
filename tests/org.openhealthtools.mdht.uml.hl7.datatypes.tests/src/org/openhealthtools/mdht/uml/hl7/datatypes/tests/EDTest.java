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
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.operations.EDOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ED</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#validateThumbnailThumbnail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thumbnail Thumbnail</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#addText(java.lang.String) <em>Add Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#getText() <em>Get Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ED#matches(java.lang.String) <em>Matches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EDTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateThumbnailThumbnail() {
		OperationsTestCase<ED> validateThumbnailThumbnailTestCase = new OperationsTestCase<ED>(
			"validateThumbnailThumbnail",
			operationsForOCL.getOCLValue("VALIDATE_THUMBNAIL_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ED target) {

				ED value = DatatypesFactory.eINSTANCE.createED();
				ED value2 = DatatypesFactory.eINSTANCE.createED();
				value.setThumbnail(value2);
				target.setThumbnail(value);
			}

			@Override
			protected void updateToPass(ED target) {
				ED value = DatatypesFactory.eINSTANCE.createED();
				target.setThumbnail(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EDOperations.validateThumbnailThumbnail((ED) objectToTest, diagnostician, map);
			}

		};

		validateThumbnailThumbnailTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetText() {

		ED target = objectFactory.create();
		target.getText();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EDOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ED> {

		public ED create() {
			return DatatypesFactory.eINSTANCE.createED();
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
	private static class ConstructorTestClass extends EDOperations {
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

} // EDOperations
