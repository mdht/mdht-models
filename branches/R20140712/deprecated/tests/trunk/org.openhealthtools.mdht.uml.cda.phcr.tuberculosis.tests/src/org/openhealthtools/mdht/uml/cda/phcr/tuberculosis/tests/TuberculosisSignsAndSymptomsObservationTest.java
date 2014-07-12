
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisSignsAndSymptomsObservationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSignsAndSymptomsObservation#validateTuberculosisSignsAndSymptomsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Signs And Symptoms Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSignsAndSymptomsObservation#validateSignsAndSymptomsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisSignsAndSymptomsObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisSignsAndSymptomsObservationValue() {
      OperationsTestCase<TuberculosisSignsAndSymptomsObservation> validateTuberculosisSignsAndSymptomsObservationValueTestCase = new OperationsTestCase<TuberculosisSignsAndSymptomsObservation>(
      "validateTuberculosisSignsAndSymptomsObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSignsAndSymptomsObservationOperations.validateTuberculosisSignsAndSymptomsObservationValue(
          (TuberculosisSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSignsAndSymptomsObservationValueTestCase.doValidationTest();
}



/**
*
* @generated
*/
@Test

 
									
public void testValidateSignsAndSymptomsObservationTemplateId() {
      OperationsTestCase<TuberculosisSignsAndSymptomsObservation> validateSignsAndSymptomsObservationTemplateIdTestCase = new OperationsTestCase<TuberculosisSignsAndSymptomsObservation>(
      "validateSignsAndSymptomsObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(
          (TuberculosisSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateSignsAndSymptomsObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisSignsAndSymptomsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisSignsAndSymptomsObservation> {
		public TuberculosisSignsAndSymptomsObservation create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisSignsAndSymptomsObservation();
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
	private static class ConstructorTestClass extends TuberculosisSignsAndSymptomsObservationOperations {};
	
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
	
	

	
	
} // TuberculosisSignsAndSymptomsObservationOperations