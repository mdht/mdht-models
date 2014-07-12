
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
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoFactory;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoCaseObservationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation#validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Observation Strep Pneumo Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation#getStrepPneumoSignsAndSymptomsObservations() <em>Get Strep Pneumo Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoCaseObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation() {
      OperationsTestCase<StrepPneumoCaseObservation> validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservationTestCase = new OperationsTestCase<StrepPneumoCaseObservation>(
      "validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_CASE_OBSERVATION_STREP_PNEUMO_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseObservation target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseObservationOperations.validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservation(
          (StrepPneumoCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoCaseObservationStrepPneumoSignsAndSymptomsObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoSignsAndSymptomsObservations() {


StrepPneumoCaseObservation target = objectFactory.create();
target.getStrepPneumoSignsAndSymptomsObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<StrepPneumoCaseObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<StrepPneumoCaseObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseObservation target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseObservationOperations.validateProblemObservationTemplateId(
          (StrepPneumoCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoCaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoCaseObservation> {
		public StrepPneumoCaseObservation create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoCaseObservation();
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
	private static class ConstructorTestClass extends StrepPneumoCaseObservationOperations {};
	
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
	
	

	
	
} // StrepPneumoCaseObservationOperations