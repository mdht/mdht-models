
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBResultObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BResult Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation#validateAcuteHepatitisBResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BResult Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation#validateAcuteHepatitisBResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BResult Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBResultObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBResultObservationCode() {
      OperationsTestCase<AcuteHepatitisBResultObservation> validateAcuteHepatitisBResultObservationCodeTestCase = new OperationsTestCase<AcuteHepatitisBResultObservation>(
      "validateAcuteHepatitisBResultObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBResultObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBResultObservationOperations.validateAcuteHepatitisBResultObservationCode(
          (AcuteHepatitisBResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBResultObservationCodeTestCase.doValidationTest();
}



  /**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBResultObservationInterpretationCode() {
      OperationsTestCase<AcuteHepatitisBResultObservation> validateAcuteHepatitisBResultObservationInterpretationCodeTestCase = new OperationsTestCase<AcuteHepatitisBResultObservation>(
      "validateAcuteHepatitisBResultObservationInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBResultObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBResultObservationOperations.validateAcuteHepatitisBResultObservationInterpretationCode(
          (AcuteHepatitisBResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBResultObservationInterpretationCodeTestCase.doValidationTest();
}



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationTemplateId() {
      OperationsTestCase<AcuteHepatitisBResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBResultObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBResultObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBResultObservationOperations.validateResultObservationTemplateId(
          (AcuteHepatitisBResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBResultObservation> {
		public AcuteHepatitisBResultObservation create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBResultObservation();
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
	private static class ConstructorTestClass extends AcuteHepatitisBResultObservationOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBResultObservationOperations