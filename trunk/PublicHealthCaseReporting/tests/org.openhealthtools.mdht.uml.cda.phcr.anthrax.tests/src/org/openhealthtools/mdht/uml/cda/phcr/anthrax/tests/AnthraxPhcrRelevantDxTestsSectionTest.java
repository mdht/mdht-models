
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxFactory;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxPhcrRelevantDxTestsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Relevant Dx Tests Section Anthrax Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#getAnthraxResultOrganizers() <em>Get Anthrax Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#getAnthraxResultObservations() <em>Get Anthrax Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AnthraxPhcrRelevantDxTestsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer() {
      OperationsTestCase<AnthraxPhcrRelevantDxTestsSection> validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizerTestCase = new OperationsTestCase<AnthraxPhcrRelevantDxTestsSection>(
      "validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrRelevantDxTestsSectionOperations.validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizer(
          (AnthraxPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultOrganizerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation() {
      OperationsTestCase<AnthraxPhcrRelevantDxTestsSection> validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservationTestCase = new OperationsTestCase<AnthraxPhcrRelevantDxTestsSection>(
      "validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION_ANTHRAX_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrRelevantDxTestsSectionOperations.validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservation(
          (AnthraxPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxPhcrRelevantDxTestsSectionAnthraxResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxResultOrganizers() {


AnthraxPhcrRelevantDxTestsSection target = objectFactory.create();
target.getAnthraxResultOrganizers();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxResultObservations() {


AnthraxPhcrRelevantDxTestsSection target = objectFactory.create();
target.getAnthraxResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
      OperationsTestCase<AnthraxPhcrRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<AnthraxPhcrRelevantDxTestsSection>(
      "validateResultsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
          (AnthraxPhcrRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AnthraxPhcrRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnthraxPhcrRelevantDxTestsSection> {
		public AnthraxPhcrRelevantDxTestsSection create() {		
			return AnthraxFactory.eINSTANCE.createAnthraxPhcrRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends AnthraxPhcrRelevantDxTestsSectionOperations {};
	
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
	
	

	
	
} // AnthraxPhcrRelevantDxTestsSectionOperations