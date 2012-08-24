
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
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisPHCRClinicalInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Clinical Information Section Silicosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Clinical Information Section Silicosis History Of Tuberculosis Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#getSilicosisCaseObservation() <em>Get Silicosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#getSilicosisHistoryOfTuberculosisObservation() <em>Get Silicosis History Of Tuberculosis Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SilicosisPHCRClinicalInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation() {
      OperationsTestCase<SilicosisPHCRClinicalInformationSection> validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservationTestCase = new OperationsTestCase<SilicosisPHCRClinicalInformationSection>(
      "validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(SilicosisPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPHCRClinicalInformationSectionOperations.validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservation(
          (SilicosisPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPHCRClinicalInformationSectionSilicosisCaseObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation() {
      OperationsTestCase<SilicosisPHCRClinicalInformationSection> validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservationTestCase = new OperationsTestCase<SilicosisPHCRClinicalInformationSection>(
      "validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION_SILICOSIS_HISTORY_OF_TUBERCULOSIS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(SilicosisPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPHCRClinicalInformationSectionOperations.validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservation(
          (SilicosisPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPHCRClinicalInformationSectionSilicosisHistoryOfTuberculosisObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisCaseObservation() {


SilicosisPHCRClinicalInformationSection target = objectFactory.create();
target.getSilicosisCaseObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisHistoryOfTuberculosisObservation() {


SilicosisPHCRClinicalInformationSection target = objectFactory.create();
target.getSilicosisHistoryOfTuberculosisObservation();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrClinicalInformationSectionTemplateId() {
      OperationsTestCase<SilicosisPHCRClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<SilicosisPHCRClinicalInformationSection>(
      "validatePhcrClinicalInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(SilicosisPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
          (SilicosisPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SilicosisPHCRClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SilicosisPHCRClinicalInformationSection> {
		public SilicosisPHCRClinicalInformationSection create() {		
			return SilicosisFactory.eINSTANCE.createSilicosisPHCRClinicalInformationSection();
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
	private static class ConstructorTestClass extends SilicosisPHCRClinicalInformationSectionOperations {};
	
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
	
	

	
	
} // SilicosisPHCRClinicalInformationSectionOperations