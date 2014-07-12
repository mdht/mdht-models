
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
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaSignsAndSymptomsObservationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation#validateTularemiaSignsAndSymptomsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Signs And Symptoms Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation#validateSignsAndSymptomsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TularemiaSignsAndSymptomsObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaSignsAndSymptomsObservationValue() {
      OperationsTestCase<TularemiaSignsAndSymptomsObservation> validateTularemiaSignsAndSymptomsObservationValueTestCase = new OperationsTestCase<TularemiaSignsAndSymptomsObservation>(
      "validateTularemiaSignsAndSymptomsObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaSignsAndSymptomsObservationOperations.validateTularemiaSignsAndSymptomsObservationValue(
          (TularemiaSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaSignsAndSymptomsObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSignsAndSymptomsObservationTemplateId() {
      OperationsTestCase<TularemiaSignsAndSymptomsObservation> validateSignsAndSymptomsObservationTemplateIdTestCase = new OperationsTestCase<TularemiaSignsAndSymptomsObservation>(
      "validateSignsAndSymptomsObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaSignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(
          (TularemiaSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateSignsAndSymptomsObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TularemiaSignsAndSymptomsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TularemiaSignsAndSymptomsObservation> {
		public TularemiaSignsAndSymptomsObservation create() {		
			return TularemiaFactory.eINSTANCE.createTularemiaSignsAndSymptomsObservation();
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
	private static class ConstructorTestClass extends TularemiaSignsAndSymptomsObservationOperations {};
	
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
	
	

	
	
} // TularemiaSignsAndSymptomsObservationOperations