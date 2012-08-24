
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
import org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudySubjectFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Subject Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingReferenceRangeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Reference Range Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Finding Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Associationreference Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingreferenceRangeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingreference Range Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationfastingStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Associationfasting Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Associationtoxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingtoxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingtoxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Associationresult Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Associationresult Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Subject Findingresult Sub Category Association Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudySubjectFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StudySubjectFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingTemplateId() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingTemplateIdTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingTemplateId(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingClassCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingClassCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingClassCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingId() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingIdTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingId(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingMoodCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingMoodCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingMoodCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingStatusCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingStatusCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingStatusCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingValue() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingValueTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingValue(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingMethodCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingMethodCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingMethodCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingInterpretationCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingInterpretationCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingInterpretationCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingTargetSiteCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingTargetSiteCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingTargetSiteCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingReferenceRangeAssociation() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingReferenceRangeAssociationTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingReferenceRangeAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingReferenceRangeAssociation(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingReferenceRangeAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingNonPerformanceReason() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingNonPerformanceReasonTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingNonPerformanceReason(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingFastingAssociation() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingFastingAssociationTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingFastingAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingFastingAssociation(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingFastingAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingToxicityAssociation() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingToxicityAssociationTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingToxicityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingToxicityAssociation(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingToxicityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingGroupIdentifier() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingGroupIdentifierTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingGroupIdentifier(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingSpecimenInformation() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingSpecimenInformationTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingSpecimenInformation(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingResultCategoryAssociation() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingResultCategoryAssociationTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingResultCategoryAssociation(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingResultSubCategoryAssociation() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingResultSubCategoryAssociationTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingResultSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDING_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingResultSubCategoryAssociation(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingResultSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingreferenceRangeAssociationreferenceRangeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodePTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodeP(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingreferenceRangeAssociationreferenceRangeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingreferenceRangeAssociationreferenceRangeInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingreferenceRangeAssociationreferenceRangeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValueTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValue(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingreferenceRangeAssociationreferenceRangeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingreferenceRangeAssociationTypeCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingreferenceRangeAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingreferenceRangeAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingreferenceRangeAssociationTypeCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingreferenceRangeAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingfastingAssociationfastingStatusClassCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingfastingAssociationfastingStatusClassCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingfastingAssociationfastingStatusClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusClassCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingfastingAssociationfastingStatusClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingfastingAssociationfastingStatusCodeP() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingfastingAssociationfastingStatusCodePTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingfastingAssociationfastingStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusCodeP(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingfastingAssociationfastingStatusCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingfastingAssociationfastingStatusCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingfastingAssociationfastingStatusCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingfastingAssociationfastingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingfastingAssociationfastingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingfastingAssociationfastingStatusMoodCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingfastingAssociationfastingStatusMoodCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingfastingAssociationfastingStatusMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusMoodCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingfastingAssociationfastingStatusMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingfastingAssociationfastingStatusValue() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingfastingAssociationfastingStatusValueTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingfastingAssociationfastingStatusValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationfastingStatusValue(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingfastingAssociationfastingStatusValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingfastingAssociationTypeCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingfastingAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingfastingAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingfastingAssociationTypeCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingfastingAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingtoxicityAssociationtoxicityGradeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodePTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeP(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingtoxicityAssociationtoxicityGradeCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingtoxicityAssociationtoxicityGradeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingtoxicityAssociationtoxicityGradeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingtoxicityAssociationtoxicityGradeValue() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeValue(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingtoxicityAssociationtoxicityGradeValuePTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATIONTOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationtoxicityGradeValueP(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingtoxicityAssociationtoxicityGradeValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingtoxicityAssociationTypeCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingtoxicityAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingtoxicityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGTOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingtoxicityAssociationTypeCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingtoxicityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultCategoryAssociationresultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultCategoryAssociationresultCategoryCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultCategoryAssociationresultCategoryCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultCategoryAssociationresultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationresultCategoryCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultCategoryAssociationresultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultCategoryAssociationresultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultCategoryAssociationresultCategoryValue() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultCategoryAssociationresultCategoryValueTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultCategoryAssociationresultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATIONRESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationresultCategoryValue(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultCategoryAssociationresultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultCategoryAssociationTypeCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultCategoryAssociationTypeCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValueTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATIONRESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValue(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultSubCategoryAssociationresultSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultSubCategoryAssociationTypeCode() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationTypeCode(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudySubjectFindingresultSubCategoryAssociationResultSubCategory() {
      OperationsTestCase<StudySubjectFinding> validateStudySubjectFindingresultSubCategoryAssociationResultSubCategoryTestCase = new OperationsTestCase<StudySubjectFinding>(
      "validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_SUBJECT_FINDINGRESULT_SUB_CATEGORY_ASSOCIATION_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudySubjectFinding target) {

      }

      @Override
      protected void updateToPass(StudySubjectFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudySubjectFindingOperations.validateStudySubjectFindingresultSubCategoryAssociationResultSubCategory(
          (StudySubjectFinding) objectToTest, diagnostician, map);
      }

    };

    validateStudySubjectFindingresultSubCategoryAssociationResultSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


StudySubjectFinding target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


StudySubjectFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


StudySubjectFinding target = objectFactory.create();
target.getSpecimenInformation();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends StudySubjectFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StudySubjectFinding> {
		public StudySubjectFinding create() {		
			return SdtmFactory.eINSTANCE.createStudySubjectFinding();
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
	private static class ConstructorTestClass extends StudySubjectFindingOperations {};
	
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
	
	

	
	
} // StudySubjectFindingOperations