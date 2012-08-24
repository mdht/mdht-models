
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionProblemObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisRelevantMedicalConditionProblemObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Medical Condition Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionProblemObservation#validateTuberculosisRelevantMedicalConditionProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Relevant Medical Condition Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionProblemObservation#validateTuberculosisRelevantMedicalConditionProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Relevant Medical Condition Problem Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisRelevantMedicalConditionProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisRelevantMedicalConditionProblemObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisRelevantMedicalConditionProblemObservationCode() {
      OperationsTestCase<TuberculosisRelevantMedicalConditionProblemObservation> validateTuberculosisRelevantMedicalConditionProblemObservationCodeTestCase = new OperationsTestCase<TuberculosisRelevantMedicalConditionProblemObservation>(
      "validateTuberculosisRelevantMedicalConditionProblemObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisRelevantMedicalConditionProblemObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisRelevantMedicalConditionProblemObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisRelevantMedicalConditionProblemObservationOperations.validateTuberculosisRelevantMedicalConditionProblemObservationCode(
          (TuberculosisRelevantMedicalConditionProblemObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisRelevantMedicalConditionProblemObservationCodeTestCase.doValidationTest();
}




  /**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisRelevantMedicalConditionProblemObservationValue() {
      OperationsTestCase<TuberculosisRelevantMedicalConditionProblemObservation> validateTuberculosisRelevantMedicalConditionProblemObservationValueTestCase = new OperationsTestCase<TuberculosisRelevantMedicalConditionProblemObservation>(
      "validateTuberculosisRelevantMedicalConditionProblemObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisRelevantMedicalConditionProblemObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisRelevantMedicalConditionProblemObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisRelevantMedicalConditionProblemObservationOperations.validateTuberculosisRelevantMedicalConditionProblemObservationValue(
          (TuberculosisRelevantMedicalConditionProblemObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisRelevantMedicalConditionProblemObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<TuberculosisRelevantMedicalConditionProblemObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<TuberculosisRelevantMedicalConditionProblemObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisRelevantMedicalConditionProblemObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisRelevantMedicalConditionProblemObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisRelevantMedicalConditionProblemObservationOperations.validateProblemObservationTemplateId(
          (TuberculosisRelevantMedicalConditionProblemObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisRelevantMedicalConditionProblemObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisRelevantMedicalConditionProblemObservation> {
		public TuberculosisRelevantMedicalConditionProblemObservation create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisRelevantMedicalConditionProblemObservation();
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
	private static class ConstructorTestClass extends TuberculosisRelevantMedicalConditionProblemObservationOperations {};
	
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
	
	

	
	
} // TuberculosisRelevantMedicalConditionProblemObservationOperations