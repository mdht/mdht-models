
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.hepb.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBCaseObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BCase Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#validateAcuteHepatitisBCaseObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#validateAcuteHepatitisBCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Observation Acute Hepatitis BSigns And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#getAcuteHepatitisBSignsAndSymptomsObservations() <em>Get Acute Hepatitis BSigns And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBCaseObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBCaseObservationValueP() {
      OperationsTestCase<AcuteHepatitisBCaseObservation> validateAcuteHepatitisBCaseObservationValuePTestCase = new OperationsTestCase<AcuteHepatitisBCaseObservation>(
      "validateAcuteHepatitisBCaseObservationValueP",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseObservationOperations.validateAcuteHepatitisBCaseObservationValueP(
          (AcuteHepatitisBCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseObservationValuePTestCase.doValidationTest();
}






  /**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBCaseObservationValue() {
      OperationsTestCase<AcuteHepatitisBCaseObservation> validateAcuteHepatitisBCaseObservationValueTestCase = new OperationsTestCase<AcuteHepatitisBCaseObservation>(
      "validateAcuteHepatitisBCaseObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseObservationOperations.validateAcuteHepatitisBCaseObservationValue(
          (AcuteHepatitisBCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseObservationValueTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation() {
      OperationsTestCase<AcuteHepatitisBCaseObservation> validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservationTestCase = new OperationsTestCase<AcuteHepatitisBCaseObservation>(
      "validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_OBSERVATION_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseObservationOperations.validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservation(
          (AcuteHepatitisBCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseObservationAcuteHepatitisBSignsAndSymptomsObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBSignsAndSymptomsObservations() {


AcuteHepatitisBCaseObservation target = objectFactory.create();
target.getAcuteHepatitisBSignsAndSymptomsObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<AcuteHepatitisBCaseObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBCaseObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseObservationOperations.validateProblemObservationTemplateId(
          (AcuteHepatitisBCaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBCaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBCaseObservation> {
		public AcuteHepatitisBCaseObservation create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBCaseObservation();
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
	private static class ConstructorTestClass extends AcuteHepatitisBCaseObservationOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBCaseObservationOperations