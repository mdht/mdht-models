
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisPHCRRelevantDxTestsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection#validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Relevant Dx Tests Section Silicosis Imaging Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection#getSilicosisImagingObservations() <em>Get Silicosis Imaging Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SilicosisPHCRRelevantDxTestsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation() {
      OperationsTestCase<SilicosisPHCRRelevantDxTestsSection> validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservationTestCase = new OperationsTestCase<SilicosisPHCRRelevantDxTestsSection>(
      "validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SILICOSIS_IMAGING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPHCRRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(SilicosisPHCRRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPHCRRelevantDxTestsSectionOperations.validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservation(
          (SilicosisPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPHCRRelevantDxTestsSectionSilicosisImagingObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisImagingObservations() {


SilicosisPHCRRelevantDxTestsSection target = objectFactory.create();
target.getSilicosisImagingObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
      OperationsTestCase<SilicosisPHCRRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<SilicosisPHCRRelevantDxTestsSection>(
      "validateResultsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPHCRRelevantDxTestsSection target) {

      }

      @Override
      protected void updateToPass(SilicosisPHCRRelevantDxTestsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
          (SilicosisPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
      }

    };

    validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SilicosisPHCRRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SilicosisPHCRRelevantDxTestsSection> {
		public SilicosisPHCRRelevantDxTestsSection create() {		
			return SilicosisFactory.eINSTANCE.createSilicosisPHCRRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends SilicosisPHCRRelevantDxTestsSectionOperations {};
	
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
	
	

	
	
} // SilicosisPHCRRelevantDxTestsSectionOperations