
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
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoResultOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer#validateStrepPneumoResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer#validateStrepPneumoResultOrganizerStrepPneumoResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Result Organizer Strep Pneumo Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer#getStrepPneumoResultObservations() <em>Get Strep Pneumo Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoResultOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateStrepPneumoResultOrganizerCode() {
      OperationsTestCase<StrepPneumoResultOrganizer> validateStrepPneumoResultOrganizerCodeTestCase = new OperationsTestCase<StrepPneumoResultOrganizer>(
      "validateStrepPneumoResultOrganizerCode",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoResultOrganizer target) {

      }

      @Override
      protected void updateToPass(StrepPneumoResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoResultOrganizerOperations.validateStrepPneumoResultOrganizerCode(
          (StrepPneumoResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoResultOrganizerCodeTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoResultOrganizerStrepPneumoResultObservation() {
      OperationsTestCase<StrepPneumoResultOrganizer> validateStrepPneumoResultOrganizerStrepPneumoResultObservationTestCase = new OperationsTestCase<StrepPneumoResultOrganizer>(
      "validateStrepPneumoResultOrganizerStrepPneumoResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_RESULT_ORGANIZER_STREP_PNEUMO_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoResultOrganizer target) {

      }

      @Override
      protected void updateToPass(StrepPneumoResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoResultOrganizerOperations.validateStrepPneumoResultOrganizerStrepPneumoResultObservation(
          (StrepPneumoResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoResultOrganizerStrepPneumoResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoResultObservations() {


StrepPneumoResultOrganizer target = objectFactory.create();
target.getStrepPneumoResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultOrganizerTemplateId() {
      OperationsTestCase<StrepPneumoResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<StrepPneumoResultOrganizer>(
      "validateResultOrganizerTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoResultOrganizer target) {

      }

      @Override
      protected void updateToPass(StrepPneumoResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoResultOrganizerOperations.validateResultOrganizerTemplateId(
          (StrepPneumoResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateResultOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoResultOrganizer> {
		public StrepPneumoResultOrganizer create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoResultOrganizer();
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
	private static class ConstructorTestClass extends StrepPneumoResultOrganizerOperations {};
	
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
	
	

	
	
} // StrepPneumoResultOrganizerOperations