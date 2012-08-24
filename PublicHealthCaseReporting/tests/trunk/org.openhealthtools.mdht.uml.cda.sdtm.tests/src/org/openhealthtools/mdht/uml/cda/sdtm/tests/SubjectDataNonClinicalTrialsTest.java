
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
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectDataNonClinicalTrialsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Data Non Clinical Trials</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Nonhuman Subject Data Document Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsAuthorParticipation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Author Participation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsStudyRelationship2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Study Relationship2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#validateSubjectDataNonClinicalTrialsSubjectParticipation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Data Non Clinical Trials Subject Participation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectDataNonClinicalTrials#getNonhumanSubjectDataDocumentBody() <em>Get Nonhuman Subject Data Document Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SubjectDataNonClinicalTrialsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsTemplateId() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsTemplateIdTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsTemplateId(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsClassCode() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsClassCodeTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsClassCode(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsCodeP() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsCodePTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsCodeP(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsCode() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsCodeTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsCode(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsConfidentialityCodeP() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsConfidentialityCodePTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsConfidentialityCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsConfidentialityCodeP(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsConfidentialityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsConfidentialityCode() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsConfidentialityCodeTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsConfidentialityCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsConfidentialityCode(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsConfidentialityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsEffectiveTime() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsEffectiveTimeTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsEffectiveTime(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsId() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsIdTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsId(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsLanguageCode() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsLanguageCodeTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsLanguageCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsLanguageCode(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsLanguageCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsMoodCode() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsMoodCodeTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsMoodCode(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsRealmCode() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsRealmCodeTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsRealmCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsRealmCode(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsRealmCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsSetId() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsSetIdTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsSetId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsSetId(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsSetIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsVersionNumber() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsVersionNumberTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsVersionNumber",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsVersionNumber(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsVersionNumberTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBodyTestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_NONHUMAN_SUBJECT_DATA_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBody(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsNonhumanSubjectDataDocumentBodyTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsAuthorParticipation2() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsAuthorParticipation2TestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsAuthorParticipation2",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_AUTHOR_PARTICIPATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsAuthorParticipation2(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsAuthorParticipation2TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsStudyRelationship2() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsStudyRelationship2TestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsStudyRelationship2",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_STUDY_RELATIONSHIP2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsStudyRelationship2(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsStudyRelationship2TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectDataNonClinicalTrialsSubjectParticipation2() {
      OperationsTestCase<SubjectDataNonClinicalTrials> validateSubjectDataNonClinicalTrialsSubjectParticipation2TestCase = new OperationsTestCase<SubjectDataNonClinicalTrials>(
      "validateSubjectDataNonClinicalTrialsSubjectParticipation2",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_DATA_NON_CLINICAL_TRIALS_SUBJECT_PARTICIPATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectDataNonClinicalTrials target) {

      }

      @Override
      protected void updateToPass(SubjectDataNonClinicalTrials target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectDataNonClinicalTrialsOperations.validateSubjectDataNonClinicalTrialsSubjectParticipation2(
          (SubjectDataNonClinicalTrials) objectToTest, diagnostician, map);
      }

    };

    validateSubjectDataNonClinicalTrialsSubjectParticipation2TestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonhumanSubjectDataDocumentBody() {


SubjectDataNonClinicalTrials target = objectFactory.create();
target.getNonhumanSubjectDataDocumentBody();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends SubjectDataNonClinicalTrialsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubjectDataNonClinicalTrials> {
		public SubjectDataNonClinicalTrials create() {		
			return SdtmFactory.eINSTANCE.createSubjectDataNonClinicalTrials();
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
	private static class ConstructorTestClass extends SubjectDataNonClinicalTrialsOperations {};
	
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
	
	

	
	
} // SubjectDataNonClinicalTrialsOperations