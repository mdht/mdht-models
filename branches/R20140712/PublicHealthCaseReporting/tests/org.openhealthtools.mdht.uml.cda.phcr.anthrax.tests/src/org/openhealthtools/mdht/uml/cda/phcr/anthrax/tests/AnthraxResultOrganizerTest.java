
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
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxResultOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer#validateAnthraxResultOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Result Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer#validateAnthraxResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer#validateAnthraxResultOrganizerAnthraxResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Result Organizer Anthrax Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer#getAnthraxResultObservations() <em>Get Anthrax Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AnthraxResultOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateAnthraxResultOrganizerCodeP() {
      OperationsTestCase<AnthraxResultOrganizer> validateAnthraxResultOrganizerCodePTestCase = new OperationsTestCase<AnthraxResultOrganizer>(
      "validateAnthraxResultOrganizerCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxResultOrganizer target) {

      }

      @Override
      protected void updateToPass(AnthraxResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxResultOrganizerOperations.validateAnthraxResultOrganizerCodeP(
          (AnthraxResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxResultOrganizerCodePTestCase.doValidationTest();
}






  /**
*
* @generated
*/
@Test

 
                  
public void testValidateAnthraxResultOrganizerCode() {
      OperationsTestCase<AnthraxResultOrganizer> validateAnthraxResultOrganizerCodeTestCase = new OperationsTestCase<AnthraxResultOrganizer>(
      "validateAnthraxResultOrganizerCode",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxResultOrganizer target) {

      }

      @Override
      protected void updateToPass(AnthraxResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxResultOrganizerOperations.validateAnthraxResultOrganizerCode(
          (AnthraxResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxResultOrganizerCodeTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxResultOrganizerAnthraxResultObservation() {
      OperationsTestCase<AnthraxResultOrganizer> validateAnthraxResultOrganizerAnthraxResultObservationTestCase = new OperationsTestCase<AnthraxResultOrganizer>(
      "validateAnthraxResultOrganizerAnthraxResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_RESULT_ORGANIZER_ANTHRAX_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxResultOrganizer target) {

      }

      @Override
      protected void updateToPass(AnthraxResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxResultOrganizerOperations.validateAnthraxResultOrganizerAnthraxResultObservation(
          (AnthraxResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxResultOrganizerAnthraxResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxResultObservations() {


AnthraxResultOrganizer target = objectFactory.create();
target.getAnthraxResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultOrganizerTemplateId() {
      OperationsTestCase<AnthraxResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<AnthraxResultOrganizer>(
      "validateResultOrganizerTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxResultOrganizer target) {

      }

      @Override
      protected void updateToPass(AnthraxResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxResultOrganizerOperations.validateResultOrganizerTemplateId(
          (AnthraxResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateResultOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AnthraxResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnthraxResultOrganizer> {
		public AnthraxResultOrganizer create() {		
			return AnthraxFactory.eINSTANCE.createAnthraxResultOrganizer();
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
	private static class ConstructorTestClass extends AnthraxResultOrganizerOperations {};
	
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
	
	

	
	
} // AnthraxResultOrganizerOperations