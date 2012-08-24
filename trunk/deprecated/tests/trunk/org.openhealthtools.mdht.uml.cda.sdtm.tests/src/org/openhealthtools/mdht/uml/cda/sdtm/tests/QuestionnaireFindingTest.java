
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
import org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.QuestionnaireFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionnaire Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingQuestionnaireCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Questionnaire Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Questionnaire Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Associationquestionnaire Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Associationquestionnaire Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Associationquestionnaire Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Associationquestionnaire Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireCategoryAssociationQuestionnaireCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Category Association Questionnaire Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Associationquestionnaire Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Associationquestionnaire Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Associationquestionnaire Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Associationquestionnaire Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#validateQuestionnaireFindingquestionnaireSubCategoryAssociationQuestionnaireSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionnaire Findingquestionnaire Sub Category Association Questionnaire Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.QuestionnaireFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class QuestionnaireFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingTemplateId() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingTemplateIdTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingTemplateId(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingClassCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingClassCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingClassCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingEffectiveTime() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingEffectiveTimeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingEffectiveTime(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingId() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingIdTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingId",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingId(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingMoodCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingMoodCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingMoodCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingValue() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingValueTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingValue(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingStatusCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingStatusCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingStatusCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingInterpretationCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingInterpretationCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingInterpretationCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingGroupIdentifier() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingGroupIdentifierTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingGroupIdentifier(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingQuestionnaireCategoryAssociation() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingQuestionnaireCategoryAssociationTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingQuestionnaireCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingQuestionnaireCategoryAssociation(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingQuestionnaireCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingQuestionnaireSubCategoryAssociation() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingQuestionnaireSubCategoryAssociationTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingQuestionnaireSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_QUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingQuestionnaireSubCategoryAssociation(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingQuestionnaireSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingNonPerformanceReason() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingNonPerformanceReasonTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingNonPerformanceReason(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingTimingReference() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingTimingReferenceTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingTimingReference(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingDataCollection() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingDataCollectionTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingDataCollection(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryClassCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryClassCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATIONQUESTIONNAIRE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryClassCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATIONQUESTIONNAIRE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryMoodCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryMoodCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATIONQUESTIONNAIRE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryMoodCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryValue() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryValueTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATIONQUESTIONNAIRE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryValue(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireCategoryAssociationquestionnaireCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireCategoryAssociationQuestionnaireCategory() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireCategoryAssociationQuestionnaireCategoryTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireCategoryAssociationQuestionnaireCategory",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_CATEGORY_ASSOCIATION_QUESTIONNAIRE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireCategoryAssociationQuestionnaireCategory(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireCategoryAssociationQuestionnaireCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryClassCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryClassCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATIONQUESTIONNAIRE_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryClassCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATIONQUESTIONNAIRE_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryMoodCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryMoodCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATIONQUESTIONNAIRE_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryMoodCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryValue() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryValueTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATIONQUESTIONNAIRE_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryValue(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireSubCategoryAssociationquestionnaireSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCode(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateQuestionnaireFindingquestionnaireSubCategoryAssociationQuestionnaireSubCategory() {
      OperationsTestCase<QuestionnaireFinding> validateQuestionnaireFindingquestionnaireSubCategoryAssociationQuestionnaireSubCategoryTestCase = new OperationsTestCase<QuestionnaireFinding>(
      "validateQuestionnaireFindingquestionnaireSubCategoryAssociationQuestionnaireSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_QUESTIONNAIRE_FINDINGQUESTIONNAIRE_SUB_CATEGORY_ASSOCIATION_QUESTIONNAIRE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(QuestionnaireFinding target) {

      }

      @Override
      protected void updateToPass(QuestionnaireFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return QuestionnaireFindingOperations.validateQuestionnaireFindingquestionnaireSubCategoryAssociationQuestionnaireSubCategory(
          (QuestionnaireFinding) objectToTest, diagnostician, map);
      }

    };

    validateQuestionnaireFindingquestionnaireSubCategoryAssociationQuestionnaireSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


QuestionnaireFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


QuestionnaireFinding target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


QuestionnaireFinding target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


QuestionnaireFinding target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends QuestionnaireFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<QuestionnaireFinding> {
		public QuestionnaireFinding create() {		
			return SdtmFactory.eINSTANCE.createQuestionnaireFinding();
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
	private static class ConstructorTestClass extends QuestionnaireFindingOperations {};
	
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
	
	

	
	
} // QuestionnaireFindingOperations