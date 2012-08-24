
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
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectDataHumanClinicalTrialsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Data Human Clinical Trials</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Human Clinical Subject Data Document Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsStudyRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Study Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#validateSubjectDataHumanClinicalTrialsSubjectParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Human Clinical Trials Subject Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataHumanClinicalTrials#getHumanClinicalSubjectDataDocumentBody() <em>Get Human Clinical Subject Data Document Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SubjectDataHumanClinicalTrialsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsTemplateId() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsTemplateIdTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsTemplateId(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsClassCode() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsClassCodeTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsClassCode(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsCodeP() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsCodePTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsCodeP(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsCode() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsCodeTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsCode(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsConfidentialityCodeP() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsConfidentialityCodePTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsConfidentialityCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsConfidentialityCodeP(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsConfidentialityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsConfidentialityCode() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsConfidentialityCodeTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsConfidentialityCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsConfidentialityCode(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsConfidentialityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsEffectiveTime() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsEffectiveTimeTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsEffectiveTime(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsId() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsIdTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsId(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsLanguageCode() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsLanguageCodeTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsLanguageCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsLanguageCode(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsLanguageCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsMoodCode() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsMoodCodeTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsMoodCode(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsRealmCode() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsRealmCodeTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsRealmCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsRealmCode(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsRealmCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsSetId() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsSetIdTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsSetId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsSetId(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsSetIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsVersionNumber() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsVersionNumberTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsVersionNumber",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsVersionNumber(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsVersionNumberTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBodyTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_HUMAN_CLINICAL_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBody(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsHumanClinicalSubjectDataDocumentBodyTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsAuthorParticipation() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsAuthorParticipationTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsAuthorParticipation",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsAuthorParticipation(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsAuthorParticipationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsStudyRelationship() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsStudyRelationshipTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsStudyRelationship",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_STUDY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsStudyRelationship(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsStudyRelationshipTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataHumanClinicalTrialsSubjectParticipation() {
      OperationsTestCase<SubjectDataHumanClinicalTrials> validateSubjectDataHumanClinicalTrialsSubjectParticipationTestCase = new OperationsTestCase<SubjectDataHumanClinicalTrials>(
      "validateSubjectDataHumanClinicalTrialsSubjectParticipation",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_HUMAN_CLINICAL_TRIALS_SUBJECT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataHumanClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataHumanClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataHumanClinicalTrialsOperations.validateSubjectDataHumanClinicalTrialsSubjectParticipation(
          (SubjectDataHumanClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataHumanClinicalTrialsSubjectParticipationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetHumanClinicalSubjectDataDocumentBody() {


SubjectDataHumanClinicalTrials target = objectFactory.create();
target.getHumanClinicalSubjectDataDocumentBody();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends SubjectDataHumanClinicalTrialsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubjectDataHumanClinicalTrials> {
		public SubjectDataHumanClinicalTrials create() {		
			return SdtmFactory.eINSTANCE.createSubjectDataHumanClinicalTrials();
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
	private static class ConstructorTestClass extends SubjectDataHumanClinicalTrialsOperations {};
	
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
	
	

	
	
} // SubjectDataHumanClinicalTrialsOperations