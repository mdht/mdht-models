
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisCaseObservationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation#validateSilicosisCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation#validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Observation Silicosis Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation#getSilicosisSignsAndSymptomsObservations() <em>Get Silicosis Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SilicosisCaseObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisCaseObservationValue() {
      OperationsTestCase<SilicosisCaseObservation> validateSilicosisCaseObservationValueTestCase = new OperationsTestCase<SilicosisCaseObservation>(
      "validateSilicosisCaseObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisCaseObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisCaseObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisCaseObservationOperations.validateSilicosisCaseObservationValue(
          (SilicosisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisCaseObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation() {
      OperationsTestCase<SilicosisCaseObservation> validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservationTestCase = new OperationsTestCase<SilicosisCaseObservation>(
      "validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_CASE_OBSERVATION_SILICOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisCaseObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisCaseObservationOperations.validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservation(
          (SilicosisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisCaseObservationSilicosisSignsAndSymptomsObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisSignsAndSymptomsObservations() {


SilicosisCaseObservation target = objectFactory.create();
target.getSilicosisSignsAndSymptomsObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<SilicosisCaseObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<SilicosisCaseObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisCaseObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisCaseObservationOperations.validateProblemObservationTemplateId(
          (SilicosisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SilicosisCaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SilicosisCaseObservation> {
		public SilicosisCaseObservation create() {		
			return SilicosisFactory.eINSTANCE.createSilicosisCaseObservation();
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
	private static class ConstructorTestClass extends SilicosisCaseObservationOperations {};
	
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
	
	

	
	
} // SilicosisCaseObservationOperations