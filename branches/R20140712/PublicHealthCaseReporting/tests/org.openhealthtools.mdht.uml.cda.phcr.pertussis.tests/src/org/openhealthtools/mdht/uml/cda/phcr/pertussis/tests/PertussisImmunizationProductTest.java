
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisImmunizationProductOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Product</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationProduct#validateProductTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisImmunizationProductTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateProductTemplateId() {
      OperationsTestCase<PertussisImmunizationProduct> validateProductTemplateIdTestCase = new OperationsTestCase<PertussisImmunizationProduct>(
      "validateProductTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisImmunizationProduct target) {

      }

      @Override
      protected void updateToPass(PertussisImmunizationProduct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisImmunizationProductOperations.validateProductTemplateId(
          (PertussisImmunizationProduct) objectToTest, diagnostician, map);
      }

    };

    validateProductTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisImmunizationProductOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisImmunizationProduct> {
		public PertussisImmunizationProduct create() {		
			return PertussisFactory.eINSTANCE.createPertussisImmunizationProduct();
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
	private static class ConstructorTestClass extends PertussisImmunizationProductOperations {};
	
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
	
	

	
	
} // PertussisImmunizationProductOperations