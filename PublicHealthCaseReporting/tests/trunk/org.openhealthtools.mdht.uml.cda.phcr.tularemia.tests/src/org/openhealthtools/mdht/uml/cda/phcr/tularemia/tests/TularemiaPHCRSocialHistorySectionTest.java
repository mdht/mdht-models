
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaPHCRSocialHistorySectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection#validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Social History Section Tularemia Possible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection#getTularemiaPossibleExposureLocationAndTypeActs() <em>Get Tularemia Possible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TularemiaPHCRSocialHistorySectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct() {
      OperationsTestCase<TularemiaPHCRSocialHistorySection> validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeActTestCase = new OperationsTestCase<TularemiaPHCRSocialHistorySection>(
      "validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaPHCRSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(TularemiaPHCRSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaPHCRSocialHistorySectionOperations.validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(
          (TularemiaPHCRSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaPossibleExposureLocationAndTypeActs() {


TularemiaPHCRSocialHistorySection target = objectFactory.create();
target.getTularemiaPossibleExposureLocationAndTypeActs();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistorySectionTemplateId() {
      OperationsTestCase<TularemiaPHCRSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<TularemiaPHCRSocialHistorySection>(
      "validateSocialHistorySectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaPHCRSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(TularemiaPHCRSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
          (TularemiaPHCRSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TularemiaPHCRSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TularemiaPHCRSocialHistorySection> {
		public TularemiaPHCRSocialHistorySection create() {		
			return TularemiaFactory.eINSTANCE.createTularemiaPHCRSocialHistorySection();
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
	private static class ConstructorTestClass extends TularemiaPHCRSocialHistorySectionOperations {};
	
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
	
	

	
	
} // TularemiaPHCRSocialHistorySectionOperations