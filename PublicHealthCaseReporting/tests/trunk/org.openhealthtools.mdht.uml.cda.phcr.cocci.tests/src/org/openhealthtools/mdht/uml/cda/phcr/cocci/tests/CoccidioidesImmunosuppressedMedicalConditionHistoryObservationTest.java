
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.cocci.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciFactory;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Immunosuppressed Medical Condition History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation#validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Immunosuppressed Medical Condition History Observation Coccidioides Immunosuppressed Medical Condition Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation#getCoccidioidesImmunosuppressedMedicalConditionProblemObservation() <em>Get Coccidioides Immunosuppressed Medical Condition Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation#validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Relevant Medical Condition History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesImmunosuppressedMedicalConditionHistoryObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation() {
      OperationsTestCase<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation> validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservationTestCase = new OperationsTestCase<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation>(
      "validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation target) {

      }

      @Override
      protected void updateToPass(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations.validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservation(
          (CoccidioidesImmunosuppressedMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesImmunosuppressedMedicalConditionHistoryObservationCoccidioidesImmunosuppressedMedicalConditionProblemObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesImmunosuppressedMedicalConditionProblemObservation() {


CoccidioidesImmunosuppressedMedicalConditionHistoryObservation target = objectFactory.create();
target.getCoccidioidesImmunosuppressedMedicalConditionProblemObservation();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrRelevantMedicalConditionHistoryObservationTemplateId() {
      OperationsTestCase<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation> validatePhcrRelevantMedicalConditionHistoryObservationTemplateIdTestCase = new OperationsTestCase<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation>(
      "validatePhcrRelevantMedicalConditionHistoryObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation target) {

      }

      @Override
      protected void updateToPass(CoccidioidesImmunosuppressedMedicalConditionHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations.validatePhcrRelevantMedicalConditionHistoryObservationTemplateId(
          (CoccidioidesImmunosuppressedMedicalConditionHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validatePhcrRelevantMedicalConditionHistoryObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation> {
		public CoccidioidesImmunosuppressedMedicalConditionHistoryObservation create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesImmunosuppressedMedicalConditionHistoryObservation();
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
	private static class ConstructorTestClass extends CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations {};
	
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
	
	

	
	
} // CoccidioidesImmunosuppressedMedicalConditionHistoryObservationOperations