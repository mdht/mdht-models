
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisResultObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation#validateTuberculosisResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation#validateTuberculosisResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisResultObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisResultObservationCodeP() {
      OperationsTestCase<TuberculosisResultObservation> validateTuberculosisResultObservationCodePTestCase = new OperationsTestCase<TuberculosisResultObservation>(
      "validateTuberculosisResultObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisResultObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisResultObservationOperations.validateTuberculosisResultObservationCodeP(
          (TuberculosisResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisResultObservationCodePTestCase.doValidationTest();
}




  /**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisResultObservationCode() {
      OperationsTestCase<TuberculosisResultObservation> validateTuberculosisResultObservationCodeTestCase = new OperationsTestCase<TuberculosisResultObservation>(
      "validateTuberculosisResultObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisResultObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisResultObservationOperations.validateTuberculosisResultObservationCode(
          (TuberculosisResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisResultObservationCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationTemplateId() {
      OperationsTestCase<TuberculosisResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<TuberculosisResultObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisResultObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisResultObservationOperations.validateResultObservationTemplateId(
          (TuberculosisResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisResultObservation> {
		public TuberculosisResultObservation create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisResultObservation();
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
	private static class ConstructorTestClass extends TuberculosisResultObservationOperations {};
	
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
	
	

	
	
} // TuberculosisResultObservationOperations