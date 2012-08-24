
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.hepb.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBSocialHistorySectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BSocial History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Job Related Body Fluid Exposure Risk Frequency Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BPossible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocial History Section Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#getJobRelatedBodyFluidExposureRiskFrequencyObservations() <em>Get Job Related Body Fluid Exposure Risk Frequency Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#getAcuteHepatitisBPossibleExposureLocationAndTypeActs() <em>Get Acute Hepatitis BPossible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations() <em>Get Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations() <em>Get Acute Hepatitis BActual Blood And Or Body Fluid Exposure Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBSocialHistorySectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation() {
      OperationsTestCase<AcuteHepatitisBSocialHistorySection> validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservationTestCase = new OperationsTestCase<AcuteHepatitisBSocialHistorySection>(
      "validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocialHistorySectionOperations.validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservation(
          (AcuteHepatitisBSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocialHistorySectionJobRelatedBodyFluidExposureRiskFrequencyObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct() {
      OperationsTestCase<AcuteHepatitisBSocialHistorySection> validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeActTestCase = new OperationsTestCase<AcuteHepatitisBSocialHistorySection>(
      "validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BPOSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocialHistorySectionOperations.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeAct(
          (AcuteHepatitisBSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBPossibleExposureLocationAndTypeActTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation() {
      OperationsTestCase<AcuteHepatitisBSocialHistorySection> validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationTestCase = new OperationsTestCase<AcuteHepatitisBSocialHistorySection>(
      "validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocialHistorySectionOperations.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation(
          (AcuteHepatitisBSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation() {
      OperationsTestCase<AcuteHepatitisBSocialHistorySection> validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTestCase = new OperationsTestCase<AcuteHepatitisBSocialHistorySection>(
      "validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION_ACUTE_HEPATITIS_BACTUAL_BLOOD_AND_OR_BODY_FLUID_EXPOSURE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocialHistorySectionOperations.validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservation(
          (AcuteHepatitisBSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocialHistorySectionAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetJobRelatedBodyFluidExposureRiskFrequencyObservations() {


AcuteHepatitisBSocialHistorySection target = objectFactory.create();
target.getJobRelatedBodyFluidExposureRiskFrequencyObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBPossibleExposureLocationAndTypeActs() {


AcuteHepatitisBSocialHistorySection target = objectFactory.create();
target.getAcuteHepatitisBPossibleExposureLocationAndTypeActs();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations() {


AcuteHepatitisBSocialHistorySection target = objectFactory.create();
target.getAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations() {


AcuteHepatitisBSocialHistorySection target = objectFactory.create();
target.getAcuteHepatitisBActualBloodAndOrBodyFluidExposureObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistorySectionTemplateId() {
      OperationsTestCase<AcuteHepatitisBSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBSocialHistorySection>(
      "validateSocialHistorySectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocialHistorySection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocialHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
          (AcuteHepatitisBSocialHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBSocialHistorySection> {
		public AcuteHepatitisBSocialHistorySection create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBSocialHistorySection();
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
	private static class ConstructorTestClass extends AcuteHepatitisBSocialHistorySectionOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBSocialHistorySectionOperations