
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.wnv.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvFactory;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.operations.WnvPhcrRelevantDxTestsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Relevant Dx Tests Section Wnv Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#getWnvResultObservations() <em>Get Wnv Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#getWnvResultOrganizers() <em>Get Wnv Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WnvPhcrRelevantDxTestsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateWnvPhcrRelevantDxTestsSectionWnvResultObservation() {
      OperationsTestCase<WnvPhcrRelevantDxTestsSection> validateWnvPhcrRelevantDxTestsSectionWnvResultObservationTestCase = new OperationsTestCase<WnvPhcrRelevantDxTestsSection>(
      "validateWnvPhcrRelevantDxTestsSectionWnvResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(WnvPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvPhcrRelevantDxTestsSectionOperations.validateWnvPhcrRelevantDxTestsSectionWnvResultObservation(
          (WnvPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateWnvPhcrRelevantDxTestsSectionWnvResultObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer() {
      OperationsTestCase<WnvPhcrRelevantDxTestsSection> validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizerTestCase = new OperationsTestCase<WnvPhcrRelevantDxTestsSection>(
      "validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer",
      operationsForOCL.getOCLValue("VALIDATE_WNV_PHCR_RELEVANT_DX_TESTS_SECTION_WNV_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(WnvPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvPhcrRelevantDxTestsSectionOperations.validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizer(
          (WnvPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateWnvPhcrRelevantDxTestsSectionWnvResultOrganizerTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetWnvResultObservations() {


WnvPhcrRelevantDxTestsSection target = objectFactory.create();
target.getWnvResultObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetWnvResultOrganizers() {


WnvPhcrRelevantDxTestsSection target = objectFactory.create();
target.getWnvResultOrganizers();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
      OperationsTestCase<WnvPhcrRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<WnvPhcrRelevantDxTestsSection>(
      "validateResultsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(WnvPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvPhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
          (WnvPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends WnvPhcrRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WnvPhcrRelevantDxTestsSection> {
		public WnvPhcrRelevantDxTestsSection create() {		
			return WnvFactory.eINSTANCE.createWnvPhcrRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends WnvPhcrRelevantDxTestsSectionOperations {};
	
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
	
	

	
	
} // WnvPhcrRelevantDxTestsSectionOperations