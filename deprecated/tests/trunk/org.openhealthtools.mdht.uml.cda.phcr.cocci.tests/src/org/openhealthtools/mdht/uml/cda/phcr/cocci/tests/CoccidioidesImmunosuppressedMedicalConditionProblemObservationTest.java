
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
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionProblemObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesImmunosuppressedMedicalConditionProblemObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Immunosuppressed Medical Condition Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionProblemObservation#validateCoccidioidesImmunosuppressedMedicalConditionProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Immunosuppressed Medical Condition Problem Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesImmunosuppressedMedicalConditionProblemObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateCoccidioidesImmunosuppressedMedicalConditionProblemObservationValue() {
      OperationsTestCase<CoccidioidesImmunosuppressedMedicalConditionProblemObservation> validateCoccidioidesImmunosuppressedMedicalConditionProblemObservationValueTestCase = new OperationsTestCase<CoccidioidesImmunosuppressedMedicalConditionProblemObservation>(
      "validateCoccidioidesImmunosuppressedMedicalConditionProblemObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesImmunosuppressedMedicalConditionProblemObservation target) {

      }

      @Override
      protected void updateToPass(CoccidioidesImmunosuppressedMedicalConditionProblemObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesImmunosuppressedMedicalConditionProblemObservationOperations.validateCoccidioidesImmunosuppressedMedicalConditionProblemObservationValue(
          (CoccidioidesImmunosuppressedMedicalConditionProblemObservation) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesImmunosuppressedMedicalConditionProblemObservationValueTestCase.doValidationTest();
}



/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<CoccidioidesImmunosuppressedMedicalConditionProblemObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<CoccidioidesImmunosuppressedMedicalConditionProblemObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesImmunosuppressedMedicalConditionProblemObservation target) {

      }

      @Override
      protected void updateToPass(CoccidioidesImmunosuppressedMedicalConditionProblemObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesImmunosuppressedMedicalConditionProblemObservationOperations.validateProblemObservationTemplateId(
          (CoccidioidesImmunosuppressedMedicalConditionProblemObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesImmunosuppressedMedicalConditionProblemObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesImmunosuppressedMedicalConditionProblemObservation> {
		public CoccidioidesImmunosuppressedMedicalConditionProblemObservation create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesImmunosuppressedMedicalConditionProblemObservation();
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
	private static class ConstructorTestClass extends CoccidioidesImmunosuppressedMedicalConditionProblemObservationOperations {};
	
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
	
	

	
	
} // CoccidioidesImmunosuppressedMedicalConditionProblemObservationOperations