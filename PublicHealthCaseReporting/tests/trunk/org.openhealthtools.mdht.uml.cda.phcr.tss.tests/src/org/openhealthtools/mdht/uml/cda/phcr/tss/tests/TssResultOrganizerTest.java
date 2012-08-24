
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tss.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tss.operations.TssResultOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tss Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer#validateTssResultOrganizerCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Result Organizer Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer#validateTssResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer#validateTssResultOrganizerTssResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Result Organizer Tss Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer#getTssResultObservations() <em>Get Tss Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TssResultOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateTssResultOrganizerCodeP() {
      OperationsTestCase<TssResultOrganizer> validateTssResultOrganizerCodePTestCase = new OperationsTestCase<TssResultOrganizer>(
      "validateTssResultOrganizerCodeP",
      operationsForOCL.getOCLValue("VALIDATE_TSS_RESULT_ORGANIZER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TssResultOrganizer target) {

      }

      @Override
      protected void updateToPass(TssResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TssResultOrganizerOperations.validateTssResultOrganizerCodeP(
          (TssResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateTssResultOrganizerCodePTestCase.doValidationTest();
}






  /**
*
* @generated
*/
@Test

 
                  
public void testValidateTssResultOrganizerCode() {
      OperationsTestCase<TssResultOrganizer> validateTssResultOrganizerCodeTestCase = new OperationsTestCase<TssResultOrganizer>(
      "validateTssResultOrganizerCode",
      operationsForOCL.getOCLValue("VALIDATE_TSS_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TssResultOrganizer target) {

      }

      @Override
      protected void updateToPass(TssResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TssResultOrganizerOperations.validateTssResultOrganizerCode(
          (TssResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateTssResultOrganizerCodeTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testValidateTssResultOrganizerTssResultObservation() {
      OperationsTestCase<TssResultOrganizer> validateTssResultOrganizerTssResultObservationTestCase = new OperationsTestCase<TssResultOrganizer>(
      "validateTssResultOrganizerTssResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_TSS_RESULT_ORGANIZER_TSS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TssResultOrganizer target) {

      }

      @Override
      protected void updateToPass(TssResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TssResultOrganizerOperations.validateTssResultOrganizerTssResultObservation(
          (TssResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateTssResultOrganizerTssResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTssResultObservations() {


TssResultOrganizer target = objectFactory.create();
target.getTssResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultOrganizerTemplateId() {
      OperationsTestCase<TssResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<TssResultOrganizer>(
      "validateResultOrganizerTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TssResultOrganizer target) {

      }

      @Override
      protected void updateToPass(TssResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TssResultOrganizerOperations.validateResultOrganizerTemplateId(
          (TssResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateResultOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TssResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TssResultOrganizer> {
		public TssResultOrganizer create() {		
			return tssFactory.eINSTANCE.createTssResultOrganizer();
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
	private static class ConstructorTestClass extends TssResultOrganizerOperations {};
	
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
	
	

	
	
} // TssResultOrganizerOperations