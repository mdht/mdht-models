
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.JobRelatedBodyFluidExposureRiskFrequencyObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Job Related Body Fluid Exposure Risk Frequency Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation#validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Job Related Body Fluid Exposure Risk Frequency Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation#validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Job Related Body Fluid Exposure Risk Frequency Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation#validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Job Related Body Fluid Exposure Risk Frequency Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation#validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Job Related Body Fluid Exposure Risk Frequency Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation#validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Job Related Body Fluid Exposure Risk Frequency Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation#validateJobRelatedBodyFluidExposureRiskFrequencyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Job Related Body Fluid Exposure Risk Frequency Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation#validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Job Related Body Fluid Exposure Risk Frequency Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.JobRelatedBodyFluidExposureRiskFrequencyObservation#validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Job Related Body Fluid Exposure Risk Frequency Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class JobRelatedBodyFluidExposureRiskFrequencyObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId() {
      OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation> validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateIdTestCase = new OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation>(
      "validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateId(
          (JobRelatedBodyFluidExposureRiskFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateJobRelatedBodyFluidExposureRiskFrequencyObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateJobRelatedBodyFluidExposureRiskFrequencyObservationCode() {
      OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation> validateJobRelatedBodyFluidExposureRiskFrequencyObservationCodeTestCase = new OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation>(
      "validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationCode(
          (JobRelatedBodyFluidExposureRiskFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateJobRelatedBodyFluidExposureRiskFrequencyObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode() {
      OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation> validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCodeTestCase = new OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation>(
      "validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCode(
          (JobRelatedBodyFluidExposureRiskFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCodeP() {
      OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation> validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCodePTestCase = new OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation>(
      "validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCodeP(
          (JobRelatedBodyFluidExposureRiskFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateJobRelatedBodyFluidExposureRiskFrequencyObservationStatusCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateJobRelatedBodyFluidExposureRiskFrequencyObservationValue() {
      OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation> validateJobRelatedBodyFluidExposureRiskFrequencyObservationValueTestCase = new OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation>(
      "validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationValue(
          (JobRelatedBodyFluidExposureRiskFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateJobRelatedBodyFluidExposureRiskFrequencyObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateJobRelatedBodyFluidExposureRiskFrequencyObservationValueP() {
      OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation> validateJobRelatedBodyFluidExposureRiskFrequencyObservationValuePTestCase = new OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation>(
      "validateJobRelatedBodyFluidExposureRiskFrequencyObservationValueP",
      operationsForOCL.getOCLValue("VALIDATE_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationValueP(
          (JobRelatedBodyFluidExposureRiskFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateJobRelatedBodyFluidExposureRiskFrequencyObservationValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode() {
      OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation> validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCodeTestCase = new OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation>(
      "validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCode(
          (JobRelatedBodyFluidExposureRiskFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateJobRelatedBodyFluidExposureRiskFrequencyObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode() {
      OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation> validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCodeTestCase = new OperationsTestCase<JobRelatedBodyFluidExposureRiskFrequencyObservation>(
      "validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_JOB_RELATED_BODY_FLUID_EXPOSURE_RISK_FREQUENCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(JobRelatedBodyFluidExposureRiskFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return JobRelatedBodyFluidExposureRiskFrequencyObservationOperations.validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCode(
          (JobRelatedBodyFluidExposureRiskFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateJobRelatedBodyFluidExposureRiskFrequencyObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends JobRelatedBodyFluidExposureRiskFrequencyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<JobRelatedBodyFluidExposureRiskFrequencyObservation> {
		public JobRelatedBodyFluidExposureRiskFrequencyObservation create() {		
			return HepbFactory.eINSTANCE.createJobRelatedBodyFluidExposureRiskFrequencyObservation();
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
	private static class ConstructorTestClass extends JobRelatedBodyFluidExposureRiskFrequencyObservationOperations {};
	
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
	
	

	
	
} // JobRelatedBodyFluidExposureRiskFrequencyObservationOperations