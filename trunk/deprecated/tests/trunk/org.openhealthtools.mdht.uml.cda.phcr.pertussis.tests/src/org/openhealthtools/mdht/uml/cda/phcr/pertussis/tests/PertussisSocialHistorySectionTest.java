
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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisSocialHistorySectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Social History Section Pertussis Possible Exposure Location Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Social History Section Pertussis Possible Case Contact Location Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#getPertussisPossibleExposureLocationActs() <em>Get Pertussis Possible Exposure Location Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#getPertussisPossibleCaseContactLocationActs() <em>Get Pertussis Possible Case Contact Location Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisSocialHistorySectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct() {
      OperationsTestCase<PertussisSocialHistorySection> validatePertussisSocialHistorySectionPertussisPossibleExposureLocationActTestCase = new OperationsTestCase<PertussisSocialHistorySection>(
      "validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(PertussisSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisSocialHistorySectionOperations.validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(
          (PertussisSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validatePertussisSocialHistorySectionPertussisPossibleExposureLocationActTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct() {
      OperationsTestCase<PertussisSocialHistorySection> validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationActTestCase = new OperationsTestCase<PertussisSocialHistorySection>(
      "validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(PertussisSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisSocialHistorySectionOperations.validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(
          (PertussisSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisPossibleExposureLocationActs() {


PertussisSocialHistorySection target = objectFactory.create();
target.getPertussisPossibleExposureLocationActs();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisPossibleCaseContactLocationActs() {


PertussisSocialHistorySection target = objectFactory.create();
target.getPertussisPossibleCaseContactLocationActs();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistorySectionTemplateId() {
      OperationsTestCase<PertussisSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<PertussisSocialHistorySection>(
      "validateSocialHistorySectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(PertussisSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
          (PertussisSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisSocialHistorySection> {
		public PertussisSocialHistorySection create() {		
			return PertussisFactory.eINSTANCE.createPertussisSocialHistorySection();
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
	private static class ConstructorTestClass extends PertussisSocialHistorySectionOperations {};
	
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
	
	

	
	
} // PertussisSocialHistorySectionOperations