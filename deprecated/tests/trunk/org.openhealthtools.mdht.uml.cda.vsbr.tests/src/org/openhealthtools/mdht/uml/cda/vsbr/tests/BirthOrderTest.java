
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.BirthOrderOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Birth Order</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder#validateBirthOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Birth Order Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class BirthOrderTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthOrderTemplateId() {
			OperationsTestCase<BirthOrder> validateBirthOrderTemplateIdTestCase = new OperationsTestCase<BirthOrder>(
			"validateBirthOrderTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthOrder target) {

			}

			@Override
			protected void updateToPass(BirthOrder target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthOrderOperations.validateBirthOrderTemplateId(
					(BirthOrder) objectToTest, diagnostician, map);
			}

		};

		validateBirthOrderTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthOrderClassCode() {
			OperationsTestCase<BirthOrder> validateBirthOrderClassCodeTestCase = new OperationsTestCase<BirthOrder>(
			"validateBirthOrderClassCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthOrder target) {

			}

			@Override
			protected void updateToPass(BirthOrder target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthOrderOperations.validateBirthOrderClassCode(
					(BirthOrder) objectToTest, diagnostician, map);
			}

		};

		validateBirthOrderClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthOrderCodeP() {
			OperationsTestCase<BirthOrder> validateBirthOrderCodePTestCase = new OperationsTestCase<BirthOrder>(
			"validateBirthOrderCodeP",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthOrder target) {

			}

			@Override
			protected void updateToPass(BirthOrder target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthOrderOperations.validateBirthOrderCodeP(
					(BirthOrder) objectToTest, diagnostician, map);
			}

		};

		validateBirthOrderCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthOrderCode() {
			OperationsTestCase<BirthOrder> validateBirthOrderCodeTestCase = new OperationsTestCase<BirthOrder>(
			"validateBirthOrderCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthOrder target) {

			}

			@Override
			protected void updateToPass(BirthOrder target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthOrderOperations.validateBirthOrderCode(
					(BirthOrder) objectToTest, diagnostician, map);
			}

		};

		validateBirthOrderCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthOrderMoodCode() {
			OperationsTestCase<BirthOrder> validateBirthOrderMoodCodeTestCase = new OperationsTestCase<BirthOrder>(
			"validateBirthOrderMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthOrder target) {

			}

			@Override
			protected void updateToPass(BirthOrder target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthOrderOperations.validateBirthOrderMoodCode(
					(BirthOrder) objectToTest, diagnostician, map);
			}

		};

		validateBirthOrderMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBirthOrderValue() {
			OperationsTestCase<BirthOrder> validateBirthOrderValueTestCase = new OperationsTestCase<BirthOrder>(
			"validateBirthOrderValue",
			operationsForOCL.getOCLValue("VALIDATE_BIRTH_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BirthOrder target) {

			}

			@Override
			protected void updateToPass(BirthOrder target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BirthOrderOperations.validateBirthOrderValue(
					(BirthOrder) objectToTest, diagnostician, map);
			}

		};

		validateBirthOrderValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends BirthOrderOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BirthOrder> {
		public BirthOrder create() {		
			return VsbrFactory.eINSTANCE.createBirthOrder();
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
	private static class ConstructorTestClass extends BirthOrderOperations {};
	
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
	
	

	
	
} // BirthOrderOperations