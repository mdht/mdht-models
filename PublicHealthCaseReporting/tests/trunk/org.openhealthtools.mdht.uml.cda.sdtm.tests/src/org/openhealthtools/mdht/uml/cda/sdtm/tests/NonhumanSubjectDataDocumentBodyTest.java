
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanSubjectDataDocumentBodyOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Subject Data Document Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodySubjectElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Subject Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyNonhumanExposure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Exposure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyBodyWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Body Weight</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyBodyWeightGain(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Body Weight Gain</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyClinicalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Clinical Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Death Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Foodand Water Consumption</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Nonhuman Laboratory Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Macroscopic Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Microscopic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyOrganMeasurement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Organ Measurement</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyPalpableMass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Palpable Mass</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Pharmacokinetic Parameter Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Subject Characteristic</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyTumorFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Tumor Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyVitalSign(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body Vital Sign</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#validateNonhumanSubjectDataDocumentBodyECGTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Data Document Body ECG Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getNonhumanSubjectDemographics() <em>Get Nonhuman Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getNonhumanDisposition() <em>Get Nonhuman Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getSubjectElements() <em>Get Subject Elements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getNonhumanExposures() <em>Get Nonhuman Exposures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getBodyWeights() <em>Get Body Weights</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getBodyWeightGains() <em>Get Body Weight Gains</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getClinicalObservations() <em>Get Clinical Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getDeathDiagnosis() <em>Get Death Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getFoodandWaterConsumptions() <em>Get Foodand Water Consumptions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getNonhumanLaboratoryTestResults() <em>Get Nonhuman Laboratory Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getMacroscopicFindings() <em>Get Macroscopic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getMicroscopicFindingss() <em>Get Microscopic Findingss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getOrganMeasurements() <em>Get Organ Measurements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getPalpableMasss() <em>Get Palpable Masss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getPharmacokineticConcentrationFindings() <em>Get Pharmacokinetic Concentration Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getPharmacokineticParameterFindings() <em>Get Pharmacokinetic Parameter Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getSubjectCharacteristics() <em>Get Subject Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getTumorFindings() <em>Get Tumor Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getVitalSigns() <em>Get Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDataDocumentBody#getECGTestResults() <em>Get ECG Test Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class NonhumanSubjectDataDocumentBodyTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyTemplateId() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyTemplateIdTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyTemplateId(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyClassCode() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyClassCodeTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyClassCode(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyCodeP() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyCodePTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyCodeP(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyCode() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyCodeTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyCode(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyMoodCode() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyMoodCodeTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyMoodCode(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographicsTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographics(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyNonhumanSubjectDemographicsTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyNonhumanDisposition() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyNonhumanDispositionTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyNonhumanDisposition",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyNonhumanDisposition(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyNonhumanDispositionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodySubjectElement() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodySubjectElementTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodySubjectElement",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodySubjectElement(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodySubjectElementTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyNonhumanExposure() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyNonhumanExposureTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyNonhumanExposure",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_EXPOSURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyNonhumanExposure(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyNonhumanExposureTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyBodyWeight() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyBodyWeightTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyBodyWeight",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyBodyWeight(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyBodyWeightTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyBodyWeightGain() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyBodyWeightGainTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyBodyWeightGain",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_BODY_WEIGHT_GAIN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyBodyWeightGain(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyBodyWeightGainTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyClinicalObservation() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyClinicalObservationTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyClinicalObservation",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyClinicalObservation(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyClinicalObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyDeathDiagnosis() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyDeathDiagnosisTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyDeathDiagnosis",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_DEATH_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyDeathDiagnosis(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyDeathDiagnosisTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumptionTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_FOODAND_WATER_CONSUMPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumption(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyFoodandWaterConsumptionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResultTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_NONHUMAN_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResult(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyNonhumanLaboratoryTestResultTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyMacroscopicFinding() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyMacroscopicFindingTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyMacroscopicFinding",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MACROSCOPIC_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyMacroscopicFinding(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyMacroscopicFindingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyMicroscopicFindings() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyMicroscopicFindingsTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyMicroscopicFindings",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_MICROSCOPIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyMicroscopicFindings(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyMicroscopicFindingsTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyOrganMeasurement() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyOrganMeasurementTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyOrganMeasurement",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ORGAN_MEASUREMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyOrganMeasurement(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyOrganMeasurementTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyPalpableMass() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyPalpableMassTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyPalpableMass",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PALPABLE_MASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyPalpableMass(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyPalpableMassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFindingTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFinding(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyPharmacokineticConcentrationFindingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFindingTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFinding(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyPharmacokineticParameterFindingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodySubjectCharacteristic() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodySubjectCharacteristicTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodySubjectCharacteristic",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodySubjectCharacteristic(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodySubjectCharacteristicTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyTumorFinding() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyTumorFindingTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyTumorFinding",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_TUMOR_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyTumorFinding(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyTumorFindingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyVitalSign() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyVitalSignTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyVitalSign",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyVitalSign(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyVitalSignTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDataDocumentBodyECGTestResult() {
      OperationsTestCase<NonhumanSubjectDataDocumentBody> validateNonhumanSubjectDataDocumentBodyECGTestResultTestCase = new OperationsTestCase<NonhumanSubjectDataDocumentBody>(
      "validateNonhumanSubjectDataDocumentBodyECGTestResult",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDataDocumentBodyOperations.validateNonhumanSubjectDataDocumentBodyECGTestResult(
          (NonhumanSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDataDocumentBodyECGTestResultTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonhumanSubjectDemographics() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getNonhumanSubjectDemographics();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonhumanDisposition() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getNonhumanDisposition();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSubjectElements() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getSubjectElements();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonhumanExposures() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getNonhumanExposures();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodyWeights() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getBodyWeights();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodyWeightGains() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getBodyWeightGains();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetClinicalObservations() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getClinicalObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDeathDiagnosis() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getDeathDiagnosis();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetFoodandWaterConsumptions() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getFoodandWaterConsumptions();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonhumanLaboratoryTestResults() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getNonhumanLaboratoryTestResults();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMacroscopicFindings() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getMacroscopicFindings();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMicroscopicFindingss() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getMicroscopicFindingss();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetOrganMeasurements() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getOrganMeasurements();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPalpableMasss() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getPalpableMasss();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPharmacokineticConcentrationFindings() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getPharmacokineticConcentrationFindings();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPharmacokineticParameterFindings() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getPharmacokineticParameterFindings();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSubjectCharacteristics() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getSubjectCharacteristics();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTumorFindings() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getTumorFindings();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetVitalSigns() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getVitalSigns();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetECGTestResults() {


NonhumanSubjectDataDocumentBody target = objectFactory.create();
target.getECGTestResults();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends NonhumanSubjectDataDocumentBodyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonhumanSubjectDataDocumentBody> {
		public NonhumanSubjectDataDocumentBody create() {		
			return SdtmFactory.eINSTANCE.createNonhumanSubjectDataDocumentBody();
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
	private static class ConstructorTestClass extends NonhumanSubjectDataDocumentBodyOperations {};
	
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
	
	

	
	
} // NonhumanSubjectDataDocumentBodyOperations