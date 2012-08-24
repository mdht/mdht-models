
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
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoSocialHistorySectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection#validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Social History Section Strep Pneumo Possible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection#getStrepPneumoPossibleExposureLocationAndTypeActs() <em>Get Strep Pneumo Possible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoSocialHistorySectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct() {
      OperationsTestCase<StrepPneumoSocialHistorySection> validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeActTestCase = new OperationsTestCase<StrepPneumoSocialHistorySection>(
      "validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(StrepPneumoSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoSocialHistorySectionOperations.validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(
          (StrepPneumoSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoPossibleExposureLocationAndTypeActs() {


StrepPneumoSocialHistorySection target = objectFactory.create();
target.getStrepPneumoPossibleExposureLocationAndTypeActs();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistorySectionTemplateId() {
      OperationsTestCase<StrepPneumoSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<StrepPneumoSocialHistorySection>(
      "validateSocialHistorySectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(StrepPneumoSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
          (StrepPneumoSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoSocialHistorySection> {
		public StrepPneumoSocialHistorySection create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoSocialHistorySection();
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
	private static class ConstructorTestClass extends StrepPneumoSocialHistorySectionOperations {};
	
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
	
	

	
	
} // StrepPneumoSocialHistorySectionOperations