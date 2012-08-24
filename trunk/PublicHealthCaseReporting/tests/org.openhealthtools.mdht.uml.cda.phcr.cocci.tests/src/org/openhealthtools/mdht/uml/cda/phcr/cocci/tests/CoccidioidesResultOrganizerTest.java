
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.cocci.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciFactory;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesResultOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer#validateCoccidioidesResultOrganizerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Organizer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer#validateCoccidioidesResultOrganizerCoccidioidesResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Organizer Coccidioides Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer#getCoccidioidesResultObservations() <em>Get Coccidioides Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesResultOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesResultOrganizerCode() {
      OperationsTestCase<CoccidioidesResultOrganizer> validateCoccidioidesResultOrganizerCodeTestCase = new OperationsTestCase<CoccidioidesResultOrganizer>(
      "validateCoccidioidesResultOrganizerCode",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesResultOrganizer target) {

      }

      @Override
      protected void updateToPass(CoccidioidesResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesResultOrganizerOperations.validateCoccidioidesResultOrganizerCode(
          (CoccidioidesResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesResultOrganizerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesResultOrganizerCoccidioidesResultObservation() {
      OperationsTestCase<CoccidioidesResultOrganizer> validateCoccidioidesResultOrganizerCoccidioidesResultObservationTestCase = new OperationsTestCase<CoccidioidesResultOrganizer>(
      "validateCoccidioidesResultOrganizerCoccidioidesResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_RESULT_ORGANIZER_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesResultOrganizer target) {

      }

      @Override
      protected void updateToPass(CoccidioidesResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesResultOrganizerOperations.validateCoccidioidesResultOrganizerCoccidioidesResultObservation(
          (CoccidioidesResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesResultOrganizerCoccidioidesResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesResultObservations() {


CoccidioidesResultOrganizer target = objectFactory.create();
target.getCoccidioidesResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultOrganizerTemplateId() {
      OperationsTestCase<CoccidioidesResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<CoccidioidesResultOrganizer>(
      "validateResultOrganizerTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesResultOrganizer target) {

      }

      @Override
      protected void updateToPass(CoccidioidesResultOrganizer target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesResultOrganizerOperations.validateResultOrganizerTemplateId(
          (CoccidioidesResultOrganizer) objectToTest, diagnostician, map);
      }

    };

    validateResultOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesResultOrganizer> {
		public CoccidioidesResultOrganizer create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesResultOrganizer();
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
	private static class ConstructorTestClass extends CoccidioidesResultOrganizerOperations {};
	
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
	
	

	
	
} // CoccidioidesResultOrganizerOperations