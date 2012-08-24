
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
import org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.BodyWeightatDeliveryOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Weightat Delivery</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery#validateBodyWeightatDeliveryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery#validateBodyWeightatDeliveryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery#validateBodyWeightatDeliveryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.BodyWeightatDelivery#validateBodyWeightatDeliveryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightat Delivery Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class BodyWeightatDeliveryTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightatDeliveryTemplateId() {
			OperationsTestCase<BodyWeightatDelivery> validateBodyWeightatDeliveryTemplateIdTestCase = new OperationsTestCase<BodyWeightatDelivery>(
			"validateBodyWeightatDeliveryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHTAT_DELIVERY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BodyWeightatDelivery target) {

			}

			@Override
			protected void updateToPass(BodyWeightatDelivery target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BodyWeightatDeliveryOperations.validateBodyWeightatDeliveryTemplateId(
					(BodyWeightatDelivery) objectToTest, diagnostician, map);
			}

		};

		validateBodyWeightatDeliveryTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightatDeliveryClassCode() {
			OperationsTestCase<BodyWeightatDelivery> validateBodyWeightatDeliveryClassCodeTestCase = new OperationsTestCase<BodyWeightatDelivery>(
			"validateBodyWeightatDeliveryClassCode",
			operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHTAT_DELIVERY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BodyWeightatDelivery target) {

			}

			@Override
			protected void updateToPass(BodyWeightatDelivery target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BodyWeightatDeliveryOperations.validateBodyWeightatDeliveryClassCode(
					(BodyWeightatDelivery) objectToTest, diagnostician, map);
			}

		};

		validateBodyWeightatDeliveryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightatDeliveryCode() {
			OperationsTestCase<BodyWeightatDelivery> validateBodyWeightatDeliveryCodeTestCase = new OperationsTestCase<BodyWeightatDelivery>(
			"validateBodyWeightatDeliveryCode",
			operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHTAT_DELIVERY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BodyWeightatDelivery target) {

			}

			@Override
			protected void updateToPass(BodyWeightatDelivery target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BodyWeightatDeliveryOperations.validateBodyWeightatDeliveryCode(
					(BodyWeightatDelivery) objectToTest, diagnostician, map);
			}

		};

		validateBodyWeightatDeliveryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightatDeliveryValue() {
			OperationsTestCase<BodyWeightatDelivery> validateBodyWeightatDeliveryValueTestCase = new OperationsTestCase<BodyWeightatDelivery>(
			"validateBodyWeightatDeliveryValue",
			operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHTAT_DELIVERY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(BodyWeightatDelivery target) {

			}

			@Override
			protected void updateToPass(BodyWeightatDelivery target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return BodyWeightatDeliveryOperations.validateBodyWeightatDeliveryValue(
					(BodyWeightatDelivery) objectToTest, diagnostician, map);
			}

		};

		validateBodyWeightatDeliveryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends BodyWeightatDeliveryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BodyWeightatDelivery> {
		public BodyWeightatDelivery create() {		
			return VsbrFactory.eINSTANCE.createBodyWeightatDelivery();
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
	private static class ConstructorTestClass extends BodyWeightatDeliveryOperations {};
	
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
	
	

	
	
} // BodyWeightatDeliveryOperations