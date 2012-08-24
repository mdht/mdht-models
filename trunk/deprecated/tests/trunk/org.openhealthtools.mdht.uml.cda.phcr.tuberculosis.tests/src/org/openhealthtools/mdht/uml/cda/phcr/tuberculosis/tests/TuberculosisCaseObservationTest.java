
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisCaseObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateTuberculosisCaseObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateTuberculosisCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Tuberculosis Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Observation Tuberculosis Site Of TB Disease Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#getTuberculosisSignsAndSymptomsObservations() <em>Get Tuberculosis Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#getTuberculosisSiteOfTBDiseaseObservations() <em>Get Tuberculosis Site Of TB Disease Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisCaseObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisCaseObservationValueP() {
      OperationsTestCase<TuberculosisCaseObservation> validateTuberculosisCaseObservationValuePTestCase = new OperationsTestCase<TuberculosisCaseObservation>(
      "validateTuberculosisCaseObservationValueP",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseObservationOperations.validateTuberculosisCaseObservationValueP(
          (TuberculosisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseObservationValuePTestCase.doValidationTest();
}




  /**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisCaseObservationValue() {
      OperationsTestCase<TuberculosisCaseObservation> validateTuberculosisCaseObservationValueTestCase = new OperationsTestCase<TuberculosisCaseObservation>(
      "validateTuberculosisCaseObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseObservationOperations.validateTuberculosisCaseObservationValue(
          (TuberculosisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation() {
      OperationsTestCase<TuberculosisCaseObservation> validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservationTestCase = new OperationsTestCase<TuberculosisCaseObservation>(
      "validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseObservationOperations.validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(
          (TuberculosisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation() {
      OperationsTestCase<TuberculosisCaseObservation> validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservationTestCase = new OperationsTestCase<TuberculosisCaseObservation>(
      "validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_OBSERVATION_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseObservationOperations.validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(
          (TuberculosisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisSignsAndSymptomsObservations() {


TuberculosisCaseObservation target = objectFactory.create();
target.getTuberculosisSignsAndSymptomsObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisSiteOfTBDiseaseObservations() {


TuberculosisCaseObservation target = objectFactory.create();
target.getTuberculosisSiteOfTBDiseaseObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<TuberculosisCaseObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<TuberculosisCaseObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseObservationOperations.validateProblemObservationTemplateId(
          (TuberculosisCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisCaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisCaseObservation> {
		public TuberculosisCaseObservation create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisCaseObservation();
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
	private static class ConstructorTestClass extends TuberculosisCaseObservationOperations {};
	
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
	
	

	
	
} // TuberculosisCaseObservationOperations