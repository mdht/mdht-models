
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
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisPHCRSocialHistorySectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Social History Section Silicosis Socio Behavioral Boolean Risk Factor Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis PHCR Social History Section Silicosis Possible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#getSilicosisSocioBehavioralBooleanRiskFactorObservation() <em>Get Silicosis Socio Behavioral Boolean Risk Factor Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#getSilicosisPossibleExposureLocationAndTypeActs() <em>Get Silicosis Possible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SilicosisPHCRSocialHistorySectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation() {
      OperationsTestCase<SilicosisPHCRSocialHistorySection> validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservationTestCase = new OperationsTestCase<SilicosisPHCRSocialHistorySection>(
      "validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPHCRSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(SilicosisPHCRSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPHCRSocialHistorySectionOperations.validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservation(
          (SilicosisPHCRSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPHCRSocialHistorySectionSilicosisSocioBehavioralBooleanRiskFactorObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct() {
      OperationsTestCase<SilicosisPHCRSocialHistorySection> validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeActTestCase = new OperationsTestCase<SilicosisPHCRSocialHistorySection>(
      "validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPHCRSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(SilicosisPHCRSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPHCRSocialHistorySectionOperations.validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeAct(
          (SilicosisPHCRSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPHCRSocialHistorySectionSilicosisPossibleExposureLocationAndTypeActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisSocioBehavioralBooleanRiskFactorObservation() {


SilicosisPHCRSocialHistorySection target = objectFactory.create();
target.getSilicosisSocioBehavioralBooleanRiskFactorObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisPossibleExposureLocationAndTypeActs() {


SilicosisPHCRSocialHistorySection target = objectFactory.create();
target.getSilicosisPossibleExposureLocationAndTypeActs();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistorySectionTemplateId() {
      OperationsTestCase<SilicosisPHCRSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SilicosisPHCRSocialHistorySection>(
      "validateSocialHistorySectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPHCRSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(SilicosisPHCRSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
          (SilicosisPHCRSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SilicosisPHCRSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SilicosisPHCRSocialHistorySection> {
		public SilicosisPHCRSocialHistorySection create() {		
			return SilicosisFactory.eINSTANCE.createSilicosisPHCRSocialHistorySection();
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
	private static class ConstructorTestClass extends SilicosisPHCRSocialHistorySectionOperations {};
	
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
	
	

	
	
} // SilicosisPHCRSocialHistorySectionOperations