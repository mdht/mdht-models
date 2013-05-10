/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.math.BigDecimal;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.MO;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.MOOperations;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>MO</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.MO#validateMO(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MO</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.MO#setValue(java.lang.Double) <em>Set Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MOTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMO() {
		OperationsTestCase<MO> validateMOTestCase = new OperationsTestCase<MO>(
			"validateMO", operationsForOCL.getOCLValue("VALIDATE_MO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(MO target) {
				target.setValue(new BigDecimal(0));
				target.setCurrency("currency");
				target.setNullFlavor(NullFlavor.ASKU);
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(MO target) {

					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MOOperations.validateMO((MO) objectToTest, diagnostician, map);
			}

		};

		validateMOTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MOOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MO> {

		public MO create() {
			return DatatypesFactory.eINSTANCE.createMO();
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
	private static class ConstructorTestClass extends MOOperations {
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

} // MOOperations
