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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.PQ;
import org.eclipse.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.eclipse.mdht.uml.hl7.datatypes.operations.RTO_PQ_PQOperations;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>RTO PQ PQ</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ#validateDenominator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RTO_PQ_PQTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateDenominator() {
		OperationsTestCase<RTO_PQ_PQ> validateDenominatorTestCase = new OperationsTestCase<RTO_PQ_PQ>(
			"validateDenominator", operationsForOCL.getOCLValue("VALIDATE_DENOMINATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(RTO_PQ_PQ target) {
				PQ pq = DatatypesFactory.eINSTANCE.createPQ();
				pq.setValue(new BigDecimal(0));
				target.setDenominator(pq);
			}

			@Override
			protected void updateToPass(RTO_PQ_PQ target) {
				PQ pq = DatatypesFactory.eINSTANCE.createPQ();
				pq.setValue(new BigDecimal(1));
				target.setDenominator(pq);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RTO_PQ_PQOperations.validateDenominator((RTO_PQ_PQ) objectToTest, diagnostician, map);
			}

		};

		validateDenominatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RTO_PQ_PQOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RTO_PQ_PQ> {

		public RTO_PQ_PQ create() {
			return DatatypesFactory.eINSTANCE.createRTO_PQ_PQ();
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
	private static class ConstructorTestClass extends RTO_PQ_PQOperations {
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

} // RTO_PQ_PQOperations
