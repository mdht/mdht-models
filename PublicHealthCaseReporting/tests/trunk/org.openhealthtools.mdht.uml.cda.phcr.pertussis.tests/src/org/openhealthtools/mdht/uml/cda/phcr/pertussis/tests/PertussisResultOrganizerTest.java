
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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisResultOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer#validatePertussisResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer#validatePertussisResultOrganizerPertussisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Result Organizer Pertussis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer#getPertussisResultObservations() <em>Get Pertussis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisResultOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisResultOrganizerCode() {
      OperationsTestCase<PertussisResultOrganizer> validatePertussisResultOrganizerCodeTestCase = new OperationsTestCase<PertussisResultOrganizer>(
      "validatePertussisResultOrganizerCode",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisResultOrganizer target) {

      }

      @Override
      protected void updateToPass(PertussisResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisResultOrganizerOperations.validatePertussisResultOrganizerCode(
          (PertussisResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validatePertussisResultOrganizerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisResultOrganizerPertussisResultObservation() {
      OperationsTestCase<PertussisResultOrganizer> validatePertussisResultOrganizerPertussisResultObservationTestCase = new OperationsTestCase<PertussisResultOrganizer>(
      "validatePertussisResultOrganizerPertussisResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_RESULT_ORGANIZER_PERTUSSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisResultOrganizer target) {

      }

      @Override
      protected void updateToPass(PertussisResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisResultOrganizerOperations.validatePertussisResultOrganizerPertussisResultObservation(
          (PertussisResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validatePertussisResultOrganizerPertussisResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisResultObservations() {


PertussisResultOrganizer target = objectFactory.create();
target.getPertussisResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultOrganizerTemplateId() {
      OperationsTestCase<PertussisResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<PertussisResultOrganizer>(
      "validateResultOrganizerTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisResultOrganizer target) {

      }

      @Override
      protected void updateToPass(PertussisResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisResultOrganizerOperations.validateResultOrganizerTemplateId(
          (PertussisResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateResultOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisResultOrganizer> {
		public PertussisResultOrganizer create() {		
			return PertussisFactory.eINSTANCE.createPertussisResultOrganizer();
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
	private static class ConstructorTestClass extends PertussisResultOrganizerOperations {};
	
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
	
	

	
	
} // PertussisResultOrganizerOperations