
/**
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivityV4;
import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivityV4Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivityV4#validatePolicyActivity2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity2 Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PolicyActivityV4Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePolicyActivity2TemplateId() {
		OperationsTestCase<PolicyActivityV4> validatePolicyActivity2TemplateIdTestCase = new OperationsTestCase<PolicyActivityV4>(
			"validatePolicyActivity2TemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivityV4 target) {

			}

			@Override
			protected void updateToPass(PolicyActivityV4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityV4Operations.validatePolicyActivity2TemplateId(
					(PolicyActivityV4) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivity2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PolicyActivityV4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PolicyActivityV4> {
		public PolicyActivityV4 create() {
			return ConsolFactory.eINSTANCE.createPolicyActivityV4();
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
	private static class ConstructorTestClass extends PolicyActivityV4Operations {
	}

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

} // PolicyActivityV4Operations
