
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.wnv.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvFactory;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.operations.WnvResultOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer#validateWnvResultOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Result Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer#validateWnvResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer#validateWnvResultOrganizerWnvResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Result Organizer Wnv Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer#getWnvResultObservations() <em>Get Wnv Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WnvResultOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateWnvResultOrganizerCodeP() {
      OperationsTestCase<WnvResultOrganizer> validateWnvResultOrganizerCodePTestCase = new OperationsTestCase<WnvResultOrganizer>(
      "validateWnvResultOrganizerCodeP",
      operationsForOCL.getOCLValue("VALIDATE_WNV_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvResultOrganizer target) {

      }

      @Override
      protected void updateToPass(WnvResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvResultOrganizerOperations.validateWnvResultOrganizerCodeP(
          (WnvResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateWnvResultOrganizerCodePTestCase.doValidationTest();
}






  /**
*
* @generated
*/
@Test

 
                  
public void testValidateWnvResultOrganizerCode() {
      OperationsTestCase<WnvResultOrganizer> validateWnvResultOrganizerCodeTestCase = new OperationsTestCase<WnvResultOrganizer>(
      "validateWnvResultOrganizerCode",
      operationsForOCL.getOCLValue("VALIDATE_WNV_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvResultOrganizer target) {

      }

      @Override
      protected void updateToPass(WnvResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvResultOrganizerOperations.validateWnvResultOrganizerCode(
          (WnvResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateWnvResultOrganizerCodeTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testValidateWnvResultOrganizerWnvResultObservation() {
      OperationsTestCase<WnvResultOrganizer> validateWnvResultOrganizerWnvResultObservationTestCase = new OperationsTestCase<WnvResultOrganizer>(
      "validateWnvResultOrganizerWnvResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_WNV_RESULT_ORGANIZER_WNV_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvResultOrganizer target) {

      }

      @Override
      protected void updateToPass(WnvResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvResultOrganizerOperations.validateWnvResultOrganizerWnvResultObservation(
          (WnvResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateWnvResultOrganizerWnvResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetWnvResultObservations() {


WnvResultOrganizer target = objectFactory.create();
target.getWnvResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultOrganizerTemplateId() {
      OperationsTestCase<WnvResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<WnvResultOrganizer>(
      "validateResultOrganizerTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvResultOrganizer target) {

      }

      @Override
      protected void updateToPass(WnvResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvResultOrganizerOperations.validateResultOrganizerTemplateId(
          (WnvResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateResultOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends WnvResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WnvResultOrganizer> {
		public WnvResultOrganizer create() {		
			return WnvFactory.eINSTANCE.createWnvResultOrganizer();
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
	private static class ConstructorTestClass extends WnvResultOrganizerOperations {};
	
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
	
	

	
	
} // WnvResultOrganizerOperations