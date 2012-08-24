
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisRelevantMedicalConditionHistoryObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Medical Condition History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation#validateTuberculosisRelevantMedicalConditionHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Relevant Medical Condition History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation#validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Relevant Medical Condition History Observation Tuberculosis Relevant Medical Condition Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation#getTuberculosisRelevantMedicalConditionProblemObservation() <em>Get Tuberculosis Relevant Medical Condition Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisRelevantMedicalConditionHistoryObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisRelevantMedicalConditionHistoryObservationValue() {
      OperationsTestCase<TuberculosisRelevantMedicalConditionHistoryObservation> validateTuberculosisRelevantMedicalConditionHistoryObservationValueTestCase = new OperationsTestCase<TuberculosisRelevantMedicalConditionHistoryObservation>(
      "validateTuberculosisRelevantMedicalConditionHistoryObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisRelevantMedicalConditionHistoryObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisRelevantMedicalConditionHistoryObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisRelevantMedicalConditionHistoryObservationOperations.validateTuberculosisRelevantMedicalConditionHistoryObservationValue(
          (TuberculosisRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisRelevantMedicalConditionHistoryObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation() {
      OperationsTestCase<TuberculosisRelevantMedicalConditionHistoryObservation> validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservationTestCase = new OperationsTestCase<TuberculosisRelevantMedicalConditionHistoryObservation>(
      "validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisRelevantMedicalConditionHistoryObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisRelevantMedicalConditionHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisRelevantMedicalConditionHistoryObservationOperations.validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservation(
          (TuberculosisRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisRelevantMedicalConditionHistoryObservationTuberculosisRelevantMedicalConditionProblemObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisRelevantMedicalConditionProblemObservation() {


TuberculosisRelevantMedicalConditionHistoryObservation target = objectFactory.create();
target.getTuberculosisRelevantMedicalConditionProblemObservation();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrRelevantMedicalConditionHistoryObservationTemplateId() {
      OperationsTestCase<TuberculosisRelevantMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationTemplateIdTestCase = new OperationsTestCase<TuberculosisRelevantMedicalConditionHistoryObservation>(
      "validatePhcrRelevantMedicalConditionHistoryObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisRelevantMedicalConditionHistoryObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisRelevantMedicalConditionHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisRelevantMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(
          (TuberculosisRelevantMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validatePhcrRelevantMedicalConditionHistoryObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisRelevantMedicalConditionHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisRelevantMedicalConditionHistoryObservation> {
		public TuberculosisRelevantMedicalConditionHistoryObservation create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisRelevantMedicalConditionHistoryObservation();
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
	private static class ConstructorTestClass extends TuberculosisRelevantMedicalConditionHistoryObservationOperations {};
	
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
	
	

	
	
} // TuberculosisRelevantMedicalConditionHistoryObservationOperations