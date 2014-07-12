
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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisImmunizationActivityOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity#validatePertussisImmunizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Immunization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisImmunizationActivityTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisImmunizationActivityMoodCode() {
      OperationsTestCase<PertussisImmunizationActivity> validatePertussisImmunizationActivityMoodCodeTestCase = new OperationsTestCase<PertussisImmunizationActivity>(
      "validatePertussisImmunizationActivityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisImmunizationActivity target) {

      }

      @Override
      protected void updateToPass(PertussisImmunizationActivity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisImmunizationActivityOperations.validatePertussisImmunizationActivityMoodCode(
          (PertussisImmunizationActivity) objectToTest, diagnostician, map);
      }

    };

    validatePertussisImmunizationActivityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationActivityTemplateId() {
      OperationsTestCase<PertussisImmunizationActivity> validateMedicationActivityTemplateIdTestCase = new OperationsTestCase<PertussisImmunizationActivity>(
      "validateMedicationActivityTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisImmunizationActivity target) {

      }

      @Override
      protected void updateToPass(PertussisImmunizationActivity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisImmunizationActivityOperations.validateMedicationActivityTemplateId(
          (PertussisImmunizationActivity) objectToTest, diagnostician, map);
      }

    };

    validateMedicationActivityTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisImmunizationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisImmunizationActivity> {
		public PertussisImmunizationActivity create() {		
			return PertussisFactory.eINSTANCE.createPertussisImmunizationActivity();
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
	private static class ConstructorTestClass extends PertussisImmunizationActivityOperations {};
	
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
	
	

	
	
} // PertussisImmunizationActivityOperations