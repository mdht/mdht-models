
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxFactory;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxPhcrSocialHistorySectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection#validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Social History Section Anthrax Possible Expossure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection#getAnthraxPossibleExpossureLocationAndTypeActs() <em>Get Anthrax Possible Expossure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AnthraxPhcrSocialHistorySectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct() {
      OperationsTestCase<AnthraxPhcrSocialHistorySection> validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeActTestCase = new OperationsTestCase<AnthraxPhcrSocialHistorySection>(
      "validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrSocialHistorySectionOperations.validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(
          (AnthraxPhcrSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxPossibleExpossureLocationAndTypeActs() {


AnthraxPhcrSocialHistorySection target = objectFactory.create();
target.getAnthraxPossibleExpossureLocationAndTypeActs();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistorySectionTemplateId() {
      OperationsTestCase<AnthraxPhcrSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<AnthraxPhcrSocialHistorySection>(
      "validateSocialHistorySectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
          (AnthraxPhcrSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AnthraxPhcrSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnthraxPhcrSocialHistorySection> {
		public AnthraxPhcrSocialHistorySection create() {		
			return AnthraxFactory.eINSTANCE.createAnthraxPhcrSocialHistorySection();
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
	private static class ConstructorTestClass extends AnthraxPhcrSocialHistorySectionOperations {};
	
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
	
	

	
	
} // AnthraxPhcrSocialHistorySectionOperations