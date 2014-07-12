
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.cocci.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciFactory;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesPHCRSocialHistorySectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection#validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Social History Section Coccidioides Possible Exposure Location Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection#getCoccidioidesPossibleExposureLocationActs() <em>Get Coccidioides Possible Exposure Location Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesPHCRSocialHistorySectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct() {
      OperationsTestCase<CoccidioidesPHCRSocialHistorySection> validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationActTestCase = new OperationsTestCase<CoccidioidesPHCRSocialHistorySection>(
      "validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesPHCRSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(CoccidioidesPHCRSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesPHCRSocialHistorySectionOperations.validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(
          (CoccidioidesPHCRSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesPossibleExposureLocationActs() {


CoccidioidesPHCRSocialHistorySection target = objectFactory.create();
target.getCoccidioidesPossibleExposureLocationActs();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistorySectionTemplateId() {
      OperationsTestCase<CoccidioidesPHCRSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<CoccidioidesPHCRSocialHistorySection>(
      "validateSocialHistorySectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesPHCRSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(CoccidioidesPHCRSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
          (CoccidioidesPHCRSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesPHCRSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesPHCRSocialHistorySection> {
		public CoccidioidesPHCRSocialHistorySection create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesPHCRSocialHistorySection();
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
	private static class ConstructorTestClass extends CoccidioidesPHCRSocialHistorySectionOperations {};
	
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
	
	

	
	
} // CoccidioidesPHCRSocialHistorySectionOperations