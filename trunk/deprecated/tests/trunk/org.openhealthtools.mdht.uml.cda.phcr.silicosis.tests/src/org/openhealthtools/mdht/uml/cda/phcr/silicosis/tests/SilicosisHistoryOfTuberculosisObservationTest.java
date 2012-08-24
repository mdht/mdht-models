
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
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisHistoryOfTuberculosisObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Tuberculosis Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation#validateSilicosisHistoryOfTuberculosisObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation#validateSilicosisHistoryOfTuberculosisObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation#validateSilicosisHistoryOfTuberculosisObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis History Of Tuberculosis Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisHistoryOfTuberculosisObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SilicosisHistoryOfTuberculosisObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisHistoryOfTuberculosisObservationClassCode() {
      OperationsTestCase<SilicosisHistoryOfTuberculosisObservation> validateSilicosisHistoryOfTuberculosisObservationClassCodeTestCase = new OperationsTestCase<SilicosisHistoryOfTuberculosisObservation>(
      "validateSilicosisHistoryOfTuberculosisObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisHistoryOfTuberculosisObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisHistoryOfTuberculosisObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisHistoryOfTuberculosisObservationOperations.validateSilicosisHistoryOfTuberculosisObservationClassCode(
          (SilicosisHistoryOfTuberculosisObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisHistoryOfTuberculosisObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisHistoryOfTuberculosisObservationValue() {
      OperationsTestCase<SilicosisHistoryOfTuberculosisObservation> validateSilicosisHistoryOfTuberculosisObservationValueTestCase = new OperationsTestCase<SilicosisHistoryOfTuberculosisObservation>(
      "validateSilicosisHistoryOfTuberculosisObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisHistoryOfTuberculosisObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisHistoryOfTuberculosisObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisHistoryOfTuberculosisObservationOperations.validateSilicosisHistoryOfTuberculosisObservationValue(
          (SilicosisHistoryOfTuberculosisObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisHistoryOfTuberculosisObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateSilicosisHistoryOfTuberculosisObservationValueP() {
      OperationsTestCase<SilicosisHistoryOfTuberculosisObservation> validateSilicosisHistoryOfTuberculosisObservationValuePTestCase = new OperationsTestCase<SilicosisHistoryOfTuberculosisObservation>(
      "validateSilicosisHistoryOfTuberculosisObservationValueP",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisHistoryOfTuberculosisObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisHistoryOfTuberculosisObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisHistoryOfTuberculosisObservationOperations.validateSilicosisHistoryOfTuberculosisObservationValueP(
          (SilicosisHistoryOfTuberculosisObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisHistoryOfTuberculosisObservationValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<SilicosisHistoryOfTuberculosisObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<SilicosisHistoryOfTuberculosisObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisHistoryOfTuberculosisObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisHistoryOfTuberculosisObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisHistoryOfTuberculosisObservationOperations.validateProblemObservationTemplateId(
          (SilicosisHistoryOfTuberculosisObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SilicosisHistoryOfTuberculosisObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SilicosisHistoryOfTuberculosisObservation> {
		public SilicosisHistoryOfTuberculosisObservation create() {		
			return SilicosisFactory.eINSTANCE.createSilicosisHistoryOfTuberculosisObservation();
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
	private static class ConstructorTestClass extends SilicosisHistoryOfTuberculosisObservationOperations {};
	
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
	
	

	
	
} // SilicosisHistoryOfTuberculosisObservationOperations