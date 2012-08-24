
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisResultOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#validateTuberculosisResultOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#validateTuberculosisResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#validateTuberculosisResultOrganizerTuberculosisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Organizer Tuberculosis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#getTuberculosisResultObservations() <em>Get Tuberculosis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisResultOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisResultOrganizerCodeP() {
      OperationsTestCase<TuberculosisResultOrganizer> validateTuberculosisResultOrganizerCodePTestCase = new OperationsTestCase<TuberculosisResultOrganizer>(
      "validateTuberculosisResultOrganizerCodeP",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisResultOrganizer target) {

      }

      @Override
      protected void updateToPass(TuberculosisResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisResultOrganizerOperations.validateTuberculosisResultOrganizerCodeP(
          (TuberculosisResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisResultOrganizerCodePTestCase.doValidationTest();
}






  /**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisResultOrganizerCode() {
      OperationsTestCase<TuberculosisResultOrganizer> validateTuberculosisResultOrganizerCodeTestCase = new OperationsTestCase<TuberculosisResultOrganizer>(
      "validateTuberculosisResultOrganizerCode",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisResultOrganizer target) {

      }

      @Override
      protected void updateToPass(TuberculosisResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisResultOrganizerOperations.validateTuberculosisResultOrganizerCode(
          (TuberculosisResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisResultOrganizerCodeTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisResultOrganizerTuberculosisResultObservation() {
      OperationsTestCase<TuberculosisResultOrganizer> validateTuberculosisResultOrganizerTuberculosisResultObservationTestCase = new OperationsTestCase<TuberculosisResultOrganizer>(
      "validateTuberculosisResultOrganizerTuberculosisResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RESULT_ORGANIZER_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisResultOrganizer target) {

      }

      @Override
      protected void updateToPass(TuberculosisResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisResultOrganizerOperations.validateTuberculosisResultOrganizerTuberculosisResultObservation(
          (TuberculosisResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisResultOrganizerTuberculosisResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisResultObservations() {


TuberculosisResultOrganizer target = objectFactory.create();
target.getTuberculosisResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultOrganizerTemplateId() {
      OperationsTestCase<TuberculosisResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<TuberculosisResultOrganizer>(
      "validateResultOrganizerTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisResultOrganizer target) {

      }

      @Override
      protected void updateToPass(TuberculosisResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisResultOrganizerOperations.validateResultOrganizerTemplateId(
          (TuberculosisResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateResultOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisResultOrganizer> {
		public TuberculosisResultOrganizer create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisResultOrganizer();
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
	private static class ConstructorTestClass extends TuberculosisResultOrganizerOperations {};
	
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
	
	

	
	
} // TuberculosisResultOrganizerOperations