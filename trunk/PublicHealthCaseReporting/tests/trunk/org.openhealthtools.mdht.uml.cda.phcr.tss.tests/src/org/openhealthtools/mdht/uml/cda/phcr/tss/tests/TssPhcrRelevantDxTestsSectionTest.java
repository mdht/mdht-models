
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
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tss.operations.TssPhcrRelevantDxTestsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tss Phcr Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Relevant Dx Tests Section Tss Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#validateTssPhcrRelevantDxTestsSectionTssResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tss Phcr Relevant Dx Tests Section Tss Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#getTssResultOrganizers() <em>Get Tss Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#getTssResultObservations() <em>Get Tss Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TssPhcrRelevantDxTestsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTssPhcrRelevantDxTestsSectionTssResultOrganizer() {
      OperationsTestCase<TssPhcrRelevantDxTestsSection> validateTssPhcrRelevantDxTestsSectionTssResultOrganizerTestCase = new OperationsTestCase<TssPhcrRelevantDxTestsSection>(
      "validateTssPhcrRelevantDxTestsSectionTssResultOrganizer",
      operationsForOCL.getOCLValue("VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TssPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(TssPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TssPhcrRelevantDxTestsSectionOperations.validateTssPhcrRelevantDxTestsSectionTssResultOrganizer(
          (TssPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateTssPhcrRelevantDxTestsSectionTssResultOrganizerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTssPhcrRelevantDxTestsSectionTssResultObservation() {
      OperationsTestCase<TssPhcrRelevantDxTestsSection> validateTssPhcrRelevantDxTestsSectionTssResultObservationTestCase = new OperationsTestCase<TssPhcrRelevantDxTestsSection>(
      "validateTssPhcrRelevantDxTestsSectionTssResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_TSS_PHCR_RELEVANT_DX_TESTS_SECTION_TSS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TssPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(TssPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TssPhcrRelevantDxTestsSectionOperations.validateTssPhcrRelevantDxTestsSectionTssResultObservation(
          (TssPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateTssPhcrRelevantDxTestsSectionTssResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTssResultOrganizers() {


TssPhcrRelevantDxTestsSection target = objectFactory.create();
target.getTssResultOrganizers();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTssResultObservations() {


TssPhcrRelevantDxTestsSection target = objectFactory.create();
target.getTssResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
      OperationsTestCase<TssPhcrRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<TssPhcrRelevantDxTestsSection>(
      "validateResultsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TssPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(TssPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TssPhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
          (TssPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TssPhcrRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TssPhcrRelevantDxTestsSection> {
		public TssPhcrRelevantDxTestsSection create() {		
			return tssFactory.eINSTANCE.createTssPhcrRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends TssPhcrRelevantDxTestsSectionOperations {};
	
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
	
	

	
	
} // TssPhcrRelevantDxTestsSectionOperations