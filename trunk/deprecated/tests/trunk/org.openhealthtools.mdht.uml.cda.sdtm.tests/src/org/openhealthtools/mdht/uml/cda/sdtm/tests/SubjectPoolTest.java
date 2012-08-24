
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectPoolOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Pool</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectPool#validateSubjectPoolTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Pool Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SubjectPoolTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectPoolTemplateId() {
      OperationsTestCase<SubjectPool> validateSubjectPoolTemplateIdTestCase = new OperationsTestCase<SubjectPool>(
      "validateSubjectPoolTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_POOL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectPool target) {

      }

      @Override
      protected void updateToPass(SubjectPool target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectPoolOperations.validateSubjectPoolTemplateId(
          (SubjectPool) objectToTest, diagnostician, map);
      }

    };

    validateSubjectPoolTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SubjectPoolOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubjectPool> {
		public SubjectPool create() {		
			return SdtmFactory.eINSTANCE.createSubjectPool();
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
	private static class ConstructorTestClass extends SubjectPoolOperations {};
	
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
	
	

	
	
} // SubjectPoolOperations