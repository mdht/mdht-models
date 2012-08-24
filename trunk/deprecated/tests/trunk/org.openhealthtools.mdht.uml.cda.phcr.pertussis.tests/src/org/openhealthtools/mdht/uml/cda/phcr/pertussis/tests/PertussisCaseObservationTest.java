
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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisCaseObservationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation#validatePertussisCaseObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation#validatePertussisCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation#validatePertussisCaseObservationPertussisSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Observation Pertussis Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation#getPertussisSignsAndSymptomsObservations() <em>Get Pertussis Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisCaseObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidatePertussisCaseObservationValueP() {
      OperationsTestCase<PertussisCaseObservation> validatePertussisCaseObservationValuePTestCase = new OperationsTestCase<PertussisCaseObservation>(
      "validatePertussisCaseObservationValueP",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseObservation target) {

      }

      @Override
      protected void updateToPass(PertussisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseObservationOperations.validatePertussisCaseObservationValueP(
          (PertussisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseObservationValuePTestCase.doValidationTest();
}






  /**
*
* @generated
*/
@Test

 
                  
public void testValidatePertussisCaseObservationValue() {
      OperationsTestCase<PertussisCaseObservation> validatePertussisCaseObservationValueTestCase = new OperationsTestCase<PertussisCaseObservation>(
      "validatePertussisCaseObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseObservation target) {

      }

      @Override
      protected void updateToPass(PertussisCaseObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseObservationOperations.validatePertussisCaseObservationValue(
          (PertussisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseObservationValueTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisCaseObservationPertussisSignsAndSymptomsObservation() {
      OperationsTestCase<PertussisCaseObservation> validatePertussisCaseObservationPertussisSignsAndSymptomsObservationTestCase = new OperationsTestCase<PertussisCaseObservation>(
      "validatePertussisCaseObservationPertussisSignsAndSymptomsObservation",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_OBSERVATION_PERTUSSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseObservation target) {

      }

      @Override
      protected void updateToPass(PertussisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseObservationOperations.validatePertussisCaseObservationPertussisSignsAndSymptomsObservation(
          (PertussisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseObservationPertussisSignsAndSymptomsObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisSignsAndSymptomsObservations() {


PertussisCaseObservation target = objectFactory.create();
target.getPertussisSignsAndSymptomsObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<PertussisCaseObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<PertussisCaseObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseObservation target) {

      }

      @Override
      protected void updateToPass(PertussisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseObservationOperations.validateProblemObservationTemplateId(
          (PertussisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisCaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisCaseObservation> {
		public PertussisCaseObservation create() {		
			return PertussisFactory.eINSTANCE.createPertussisCaseObservation();
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
	private static class ConstructorTestClass extends PertussisCaseObservationOperations {};
	
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
	
	

	
	
} // PertussisCaseObservationOperations