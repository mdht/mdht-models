
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBSignsAndSymptomsObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BSigns And Symptoms Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation#validateAcuteHepatitisBSignsAndSymptomsObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSigns And Symptoms Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation#validateAcuteHepatitisBSignsAndSymptomsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSigns And Symptoms Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSignsAndSymptomsObservation#validateSignsAndSymptomsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBSignsAndSymptomsObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBSignsAndSymptomsObservationValueP() {
      OperationsTestCase<AcuteHepatitisBSignsAndSymptomsObservation> validateAcuteHepatitisBSignsAndSymptomsObservationValuePTestCase = new OperationsTestCase<AcuteHepatitisBSignsAndSymptomsObservation>(
      "validateAcuteHepatitisBSignsAndSymptomsObservationValueP",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSignsAndSymptomsObservationOperations.validateAcuteHepatitisBSignsAndSymptomsObservationValueP(
          (AcuteHepatitisBSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSignsAndSymptomsObservationValuePTestCase.doValidationTest();
}




  /**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBSignsAndSymptomsObservationValue() {
      OperationsTestCase<AcuteHepatitisBSignsAndSymptomsObservation> validateAcuteHepatitisBSignsAndSymptomsObservationValueTestCase = new OperationsTestCase<AcuteHepatitisBSignsAndSymptomsObservation>(
      "validateAcuteHepatitisBSignsAndSymptomsObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSignsAndSymptomsObservationOperations.validateAcuteHepatitisBSignsAndSymptomsObservationValue(
          (AcuteHepatitisBSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSignsAndSymptomsObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSignsAndSymptomsObservationTemplateId() {
      OperationsTestCase<AcuteHepatitisBSignsAndSymptomsObservation> validateSignsAndSymptomsObservationTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBSignsAndSymptomsObservation>(
      "validateSignsAndSymptomsObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSignsAndSymptomsObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSignsAndSymptomsObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(
          (AcuteHepatitisBSignsAndSymptomsObservation) objectToTest, diagnostician, map);
      }

    };

    validateSignsAndSymptomsObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBSignsAndSymptomsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBSignsAndSymptomsObservation> {
		public AcuteHepatitisBSignsAndSymptomsObservation create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBSignsAndSymptomsObservation();
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
	private static class ConstructorTestClass extends AcuteHepatitisBSignsAndSymptomsObservationOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBSignsAndSymptomsObservationOperations