
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
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesPHCRRelevantDxTestsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Relevant Dx Tests Section Coccidioides Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#getCoccidioidesResultObservations() <em>Get Coccidioides Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#getCoccidioidesResultOrganizers() <em>Get Coccidioides Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesPHCRRelevantDxTestsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation() {
      OperationsTestCase<CoccidioidesPHCRRelevantDxTestsSection> validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservationTestCase = new OperationsTestCase<CoccidioidesPHCRRelevantDxTestsSection>(
      "validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesPHCRRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(CoccidioidesPHCRRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesPHCRRelevantDxTestsSectionOperations.validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservation(
          (CoccidioidesPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer() {
      OperationsTestCase<CoccidioidesPHCRRelevantDxTestsSection> validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizerTestCase = new OperationsTestCase<CoccidioidesPHCRRelevantDxTestsSection>(
      "validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION_COCCIDIOIDES_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesPHCRRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(CoccidioidesPHCRRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesPHCRRelevantDxTestsSectionOperations.validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizer(
          (CoccidioidesPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesPHCRRelevantDxTestsSectionCoccidioidesResultOrganizerTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesResultObservations() {


CoccidioidesPHCRRelevantDxTestsSection target = objectFactory.create();
target.getCoccidioidesResultObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesResultOrganizers() {


CoccidioidesPHCRRelevantDxTestsSection target = objectFactory.create();
target.getCoccidioidesResultOrganizers();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
      OperationsTestCase<CoccidioidesPHCRRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<CoccidioidesPHCRRelevantDxTestsSection>(
      "validateResultsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesPHCRRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(CoccidioidesPHCRRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
          (CoccidioidesPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesPHCRRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesPHCRRelevantDxTestsSection> {
		public CoccidioidesPHCRRelevantDxTestsSection create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesPHCRRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends CoccidioidesPHCRRelevantDxTestsSectionOperations {};
	
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
	
	

	
	
} // CoccidioidesPHCRRelevantDxTestsSectionOperations