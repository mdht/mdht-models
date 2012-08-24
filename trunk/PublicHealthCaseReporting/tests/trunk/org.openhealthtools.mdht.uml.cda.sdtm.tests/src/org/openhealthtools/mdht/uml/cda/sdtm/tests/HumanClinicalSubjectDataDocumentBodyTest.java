
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
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalSubjectDataDocumentBodyOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Subject Data Document Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Human Clinical Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyStudyArm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Study Arm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodySubjectElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Subject Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodySubstanceUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Substance Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyDisposition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Disposition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Medical History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Protocol Deviation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Clinical Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyECGTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body ECG Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Subject Characteristic</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Body Pharmacokinetic Parameter Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Bodyexposure Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Data Document Bodyexposure Association Exposure Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getHumanClinicalSubjectDemographics() <em>Get Human Clinical Subject Demographics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getHumanClinicalVisits() <em>Get Human Clinical Visits</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getStudyArm() <em>Get Study Arm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getSubjectElements() <em>Get Subject Elements</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getSubstanceUses() <em>Get Substance Uses</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getDispositions() <em>Get Dispositions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getMedicalHistories() <em>Get Medical Histories</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getProtocolDeviations() <em>Get Protocol Deviations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getClinicalEvents() <em>Get Clinical Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getECGTestResults() <em>Get ECG Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getSubjectCharacteristic() <em>Get Subject Characteristic</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDataDocumentBody#getPharmacokineticParameterFinding() <em>Get Pharmacokinetic Parameter Finding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HumanClinicalSubjectDataDocumentBodyTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyTemplateId() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyTemplateIdTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyTemplateId(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyClassCode() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyClassCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyClassCode(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyCode() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyCode(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyCodeP() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyCodePTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyCodeP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyCodeP(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyMoodCode() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyMoodCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyMoodCode(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographicsTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographics(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyHumanClinicalSubjectDemographicsTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisitTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_HUMAN_CLINICAL_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisit(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyHumanClinicalVisitTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyStudyArm() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyStudyArmTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyStudyArm",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyStudyArm(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyStudyArmTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodySubjectElement() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodySubjectElementTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodySubjectElement",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodySubjectElement(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodySubjectElementTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodySubstanceUse() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodySubstanceUseTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodySubstanceUse",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBSTANCE_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodySubstanceUse(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodySubstanceUseTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyDisposition() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyDispositionTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyDisposition",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_DISPOSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyDisposition(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyDispositionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyMedicalHistory() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyMedicalHistoryTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyMedicalHistory",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_MEDICAL_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyMedicalHistory(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyMedicalHistoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyProtocolDeviation() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyProtocolDeviationTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PROTOCOL_DEVIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyProtocolDeviation(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyProtocolDeviationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyClinicalEvent() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyClinicalEventTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyClinicalEvent",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_CLINICAL_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyClinicalEvent(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyClinicalEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyECGTestResult() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyECGTestResultTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyECGTestResult",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyECGTestResult(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyECGTestResultTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristicTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_SUBJECT_CHARACTERISTIC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristic(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodySubjectCharacteristicTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFindingTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY_PHARMACOKINETIC_PARAMETER_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFinding(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyPharmacokineticParameterFindingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCode(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyexposureAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration() {
      OperationsTestCase<HumanClinicalSubjectDataDocumentBody> validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministrationTestCase = new OperationsTestCase<HumanClinicalSubjectDataDocumentBody>(
      "validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODYEXPOSURE_ASSOCIATION_EXPOSURE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDataDocumentBody target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDataDocumentBody target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDataDocumentBodyOperations.validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministration(
          (HumanClinicalSubjectDataDocumentBody) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDataDocumentBodyexposureAssociationExposureSubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetHumanClinicalSubjectDemographics() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getHumanClinicalSubjectDemographics();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHumanClinicalVisits() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getHumanClinicalVisits();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyArm() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getStudyArm();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSubjectElements() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getSubjectElements();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSubstanceUses() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getSubstanceUses();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDispositions() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getDispositions();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMedicalHistories() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getMedicalHistories();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetProtocolDeviations() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getProtocolDeviations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetClinicalEvents() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getClinicalEvents();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetECGTestResults() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getECGTestResults();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSubjectCharacteristic() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getSubjectCharacteristic();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPharmacokineticParameterFinding() {


HumanClinicalSubjectDataDocumentBody target = objectFactory.create();
target.getPharmacokineticParameterFinding();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends HumanClinicalSubjectDataDocumentBodyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HumanClinicalSubjectDataDocumentBody> {
		public HumanClinicalSubjectDataDocumentBody create() {		
			return SdtmFactory.eINSTANCE.createHumanClinicalSubjectDataDocumentBody();
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
	private static class ConstructorTestClass extends HumanClinicalSubjectDataDocumentBodyOperations {};
	
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
	
	

	
	
} // HumanClinicalSubjectDataDocumentBodyOperations