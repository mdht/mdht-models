
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisRelevantDxTestsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#validatePertussisRelevantDxTestsSectionPertussisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Relevant Dx Tests Section Pertussis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Relevant Dx Tests Section Pertussis Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#getPertussisResultObservations() <em>Get Pertussis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#getPertussisResultOrganizers() <em>Get Pertussis Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisRelevantDxTestsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisRelevantDxTestsSectionPertussisResultObservation() {
      OperationsTestCase<PertussisRelevantDxTestsSection> validatePertussisRelevantDxTestsSectionPertussisResultObservationTestCase = new OperationsTestCase<PertussisRelevantDxTestsSection>(
      "validatePertussisRelevantDxTestsSectionPertussisResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(PertussisRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisRelevantDxTestsSectionOperations.validatePertussisRelevantDxTestsSectionPertussisResultObservation(
          (PertussisRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validatePertussisRelevantDxTestsSectionPertussisResultObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisRelevantDxTestsSectionPertussisResultOrganizer() {
      OperationsTestCase<PertussisRelevantDxTestsSection> validatePertussisRelevantDxTestsSectionPertussisResultOrganizerTestCase = new OperationsTestCase<PertussisRelevantDxTestsSection>(
      "validatePertussisRelevantDxTestsSectionPertussisResultOrganizer",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_RELEVANT_DX_TESTS_SECTION_PERTUSSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(PertussisRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisRelevantDxTestsSectionOperations.validatePertussisRelevantDxTestsSectionPertussisResultOrganizer(
          (PertussisRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validatePertussisRelevantDxTestsSectionPertussisResultOrganizerTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisResultObservations() {


PertussisRelevantDxTestsSection target = objectFactory.create();
target.getPertussisResultObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisResultOrganizers() {


PertussisRelevantDxTestsSection target = objectFactory.create();
target.getPertussisResultOrganizers();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
      OperationsTestCase<PertussisRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<PertussisRelevantDxTestsSection>(
      "validateResultsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(PertussisRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
          (PertussisRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisRelevantDxTestsSection> {
		public PertussisRelevantDxTestsSection create() {		
			return PertussisFactory.eINSTANCE.createPertussisRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends PertussisRelevantDxTestsSectionOperations {};
	
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
	
	

	
	
} // PertussisRelevantDxTestsSectionOperations