
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
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaCaseObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#validateTularemiaCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Tularemia Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#validateTularemiaCaseObservationLocationOfLesionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Observation Location Of Lesion Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#getTularemiaSignsAndSymptomsObservations() <em>Get Tularemia Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#getLocationOfLesionObservations() <em>Get Location Of Lesion Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TularemiaCaseObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaCaseObservationValue() {
      OperationsTestCase<TularemiaCaseObservation> validateTularemiaCaseObservationValueTestCase = new OperationsTestCase<TularemiaCaseObservation>(
      "validateTularemiaCaseObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseObservationOperations.validateTularemiaCaseObservationValue(
          (TularemiaCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation() {
      OperationsTestCase<TularemiaCaseObservation> validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservationTestCase = new OperationsTestCase<TularemiaCaseObservation>(
      "validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_OBSERVATION_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseObservationOperations.validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservation(
          (TularemiaCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseObservationTularemiaSignsAndSymptomsObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaCaseObservationLocationOfLesionObservation() {
      OperationsTestCase<TularemiaCaseObservation> validateTularemiaCaseObservationLocationOfLesionObservationTestCase = new OperationsTestCase<TularemiaCaseObservation>(
      "validateTularemiaCaseObservationLocationOfLesionObservation",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_OBSERVATION_LOCATION_OF_LESION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseObservationOperations.validateTularemiaCaseObservationLocationOfLesionObservation(
          (TularemiaCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseObservationLocationOfLesionObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaSignsAndSymptomsObservations() {


TularemiaCaseObservation target = objectFactory.create();
target.getTularemiaSignsAndSymptomsObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetLocationOfLesionObservations() {


TularemiaCaseObservation target = objectFactory.create();
target.getLocationOfLesionObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<TularemiaCaseObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<TularemiaCaseObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseObservationOperations.validateProblemObservationTemplateId(
          (TularemiaCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TularemiaCaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TularemiaCaseObservation> {
		public TularemiaCaseObservation create() {		
			return TularemiaFactory.eINSTANCE.createTularemiaCaseObservation();
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
	private static class ConstructorTestClass extends TularemiaCaseObservationOperations {};
	
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
	
	

	
	
} // TularemiaCaseObservationOperations