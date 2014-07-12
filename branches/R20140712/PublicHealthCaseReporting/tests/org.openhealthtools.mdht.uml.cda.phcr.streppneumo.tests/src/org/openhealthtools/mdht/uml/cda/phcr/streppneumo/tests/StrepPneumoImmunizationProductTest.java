
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoFactory;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationProduct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoImmunizationProductOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Product</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationProduct#validateStrepPneumoImmunizationProductTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Immunization Product Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoImmunizationProductTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoImmunizationProductTemplateId() {
      OperationsTestCase<StrepPneumoImmunizationProduct> validateStrepPneumoImmunizationProductTemplateIdTestCase = new OperationsTestCase<StrepPneumoImmunizationProduct>(
      "validateStrepPneumoImmunizationProductTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_IMMUNIZATION_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoImmunizationProduct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoImmunizationProduct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoImmunizationProductOperations.validateStrepPneumoImmunizationProductTemplateId(
          (StrepPneumoImmunizationProduct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoImmunizationProductTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoImmunizationProductOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoImmunizationProduct> {
		public StrepPneumoImmunizationProduct create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoImmunizationProduct();
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
	private static class ConstructorTestClass extends StrepPneumoImmunizationProductOperations {};
	
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
	
	

	
	
} // StrepPneumoImmunizationProductOperations