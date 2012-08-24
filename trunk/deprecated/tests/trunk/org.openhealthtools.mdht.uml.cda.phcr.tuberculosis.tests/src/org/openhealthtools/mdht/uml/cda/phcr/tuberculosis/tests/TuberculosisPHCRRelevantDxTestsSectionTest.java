
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisPHCRRelevantDxTestsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Relevant Dx Tests Section Tuberculosis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#getTuberculosisResultOrganizers() <em>Get Tuberculosis Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#getTuberculosisResultObservations() <em>Get Tuberculosis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisPHCRRelevantDxTestsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer() {
      OperationsTestCase<TuberculosisPHCRRelevantDxTestsSection> validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizerTestCase = new OperationsTestCase<TuberculosisPHCRRelevantDxTestsSection>(
      "validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisPHCRRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(TuberculosisPHCRRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisPHCRRelevantDxTestsSectionOperations.validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizer(
          (TuberculosisPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultOrganizerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation() {
      OperationsTestCase<TuberculosisPHCRRelevantDxTestsSection> validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservationTestCase = new OperationsTestCase<TuberculosisPHCRRelevantDxTestsSection>(
      "validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_TUBERCULOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisPHCRRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(TuberculosisPHCRRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisPHCRRelevantDxTestsSectionOperations.validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservation(
          (TuberculosisPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisPHCRRelevantDxTestsSectionTuberculosisResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisResultOrganizers() {


TuberculosisPHCRRelevantDxTestsSection target = objectFactory.create();
target.getTuberculosisResultOrganizers();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisResultObservations() {


TuberculosisPHCRRelevantDxTestsSection target = objectFactory.create();
target.getTuberculosisResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
      OperationsTestCase<TuberculosisPHCRRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<TuberculosisPHCRRelevantDxTestsSection>(
      "validateResultsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisPHCRRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(TuberculosisPHCRRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
          (TuberculosisPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisPHCRRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisPHCRRelevantDxTestsSection> {
		public TuberculosisPHCRRelevantDxTestsSection create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisPHCRRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends TuberculosisPHCRRelevantDxTestsSectionOperations {};
	
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
	
	

	
	
} // TuberculosisPHCRRelevantDxTestsSectionOperations