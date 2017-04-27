/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.math.BigInteger;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.INT;
import org.eclipse.mdht.uml.hl7.datatypes.REAL;
import org.eclipse.mdht.uml.hl7.datatypes.RTO_QTY_QTY;
import org.eclipse.mdht.uml.hl7.datatypes.operations.RTO_QTY_QTYOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>RTO QTY QTY</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#validateDenominator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RTO_QTY_QTYTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDenominator() {
		OperationsTestCase<RTO_QTY_QTY> validateDenominatorTestCase = new OperationsTestCase<RTO_QTY_QTY>(
			"validateDenominator", operationsForOCL.getOCLValue("VALIDATE_DENOMINATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(RTO_QTY_QTY target) {
						INT integer = DatatypesFactory.eINSTANCE.createINT();
						BigInteger xxx = new BigInteger("0");
						integer.setValue(xxx);

						target.setDenominator(integer);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(RTO_QTY_QTY target) {
						REAL real = DatatypesFactory.eINSTANCE.createREAL();
						real.setValue(new Double(0));
						target.setDenominator(real);

					}
				});

			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(RTO_QTY_QTY target) {
						INT integer = DatatypesFactory.eINSTANCE.createINT();
						BigInteger xxx = new BigInteger("1");
						integer.setValue(xxx);

						target.setDenominator(integer);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(RTO_QTY_QTY target) {
						REAL real = DatatypesFactory.eINSTANCE.createREAL();
						real.setValue(new Double(1));
						target.setDenominator(real);

					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RTO_QTY_QTYOperations.validateDenominator((RTO_QTY_QTY) objectToTest, diagnostician, map);
			}

		};

		validateDenominatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RTO_QTY_QTYOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RTO_QTY_QTY> {

		public RTO_QTY_QTY create() {
			return DatatypesFactory.eINSTANCE.createRTO_QTY_QTY();
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
	private static class ConstructorTestClass extends RTO_QTY_QTYOperations {
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

} // RTO_QTY_QTYOperations
