
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.wnv.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvFactory;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.operations.WnvSignsAndSymptomsObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signs And Symptoms Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation#validateWnvSignsAndSymptomsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Signs And Symptoms Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvSignsAndSymptomsObservation#validateSignsAndSymptomsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WnvSignsAndSymptomsObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateWnvSignsAndSymptomsObservationValue() {
      OperationsTestCase<WnvSignsAndSymptomsObservation> validateWnvSignsAndSymptomsObservationValueTestCase = new OperationsTestCase<WnvSignsAndSymptomsObservation>(
      "validateWnvSignsAndSymptomsObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_WNV_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(WnvSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvSignsAndSymptomsObservationOperations.validateWnvSignsAndSymptomsObservationValue(
          (WnvSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateWnvSignsAndSymptomsObservationValueTestCase.doValidationTest();
}



/**
*
* @generated
*/
@Test

 
									
public void testValidateSignsAndSymptomsObservationTemplateId() {
      OperationsTestCase<WnvSignsAndSymptomsObservation> validateSignsAndSymptomsObservationTemplateIdTestCase = new OperationsTestCase<WnvSignsAndSymptomsObservation>(
      "validateSignsAndSymptomsObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(WnvSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvSignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(
          (WnvSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateSignsAndSymptomsObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends WnvSignsAndSymptomsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WnvSignsAndSymptomsObservation> {
		public WnvSignsAndSymptomsObservation create() {		
			return WnvFactory.eINSTANCE.createWnvSignsAndSymptomsObservation();
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
	private static class ConstructorTestClass extends WnvSignsAndSymptomsObservationOperations {};
	
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
	
	

	
	
} // WnvSignsAndSymptomsObservationOperations