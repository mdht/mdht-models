
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
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalLaboratoryTestResultOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Laboratory Test Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Laboratory Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Laboratory Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Reference Range Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Lab Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Result Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Category Association Laboratory Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Associationreference Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultreference Range Association Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Associationfasting Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultfasting Association Fasting</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Laboratory Test Resultlab Toxicity Association Toxicity Grade</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalLaboratoryTestResult#getTimingReference() <em>Get Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HumanClinicalLaboratoryTestResultTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultTemplateId() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultTemplateIdTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultTemplateId(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultClassCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultClassCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultClassCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultId() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultIdTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultId",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultId(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultMoodCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultMoodCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMoodCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultStatusCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultStatusCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultStatusCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultValue() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultValueTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultValue(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultMethodCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultMethodCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultMethodCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultInterpretationCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultInterpretationCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultInterpretationCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultGroupIdentifier() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultGroupIdentifierTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultGroupIdentifier(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultSpecimenInformation() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultSpecimenInformationTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultSpecimenInformation(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociationTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociation(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultLaboratoryTestResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociationTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultLaboratoryTestResultSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultReferenceRangeAssociation() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultReferenceRangeAssociationTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultReferenceRangeAssociation(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultReferenceRangeAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultNonPerformanceReason() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultNonPerformanceReasonTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultNonPerformanceReason(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultFastingAssociation() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultFastingAssociationTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultFastingAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultFastingAssociation(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultFastingAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultLabToxicityAssociation() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultLabToxicityAssociationTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultLabToxicityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultLabToxicityAssociation(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultLabToxicityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultTimingReference() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultTimingReferenceTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultTimingReference(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValueTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategoryTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValueTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodePTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValueTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationreferenceRangeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRangeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRange(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultreferenceRangeAssociationReferenceRangeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultfastingAssociationfastingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodePTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeP(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultfastingAssociationfastingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultfastingAssociationfastingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValueTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValue(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultfastingAssociationfastingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultfastingAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultfastingAssociationFasting() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultfastingAssociationFastingTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultfastingAssociationFasting",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultfastingAssociationFasting(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultfastingAssociationFastingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodePTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeP(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValue(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValuePTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValueP(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCode(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlabToxicityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade() {
      OperationsTestCase<HumanClinicalLaboratoryTestResult> validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeTestCase = new OperationsTestCase<HumanClinicalLaboratoryTestResult>(
      "validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(HumanClinicalLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalLaboratoryTestResultOperations.validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGrade(
          (HumanClinicalLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalLaboratoryTestResultlabToxicityAssociationToxicityGradeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


HumanClinicalLaboratoryTestResult target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


HumanClinicalLaboratoryTestResult target = objectFactory.create();
target.getSpecimenInformation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


HumanClinicalLaboratoryTestResult target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


HumanClinicalLaboratoryTestResult target = objectFactory.create();
target.getTimingReference();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends HumanClinicalLaboratoryTestResultOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HumanClinicalLaboratoryTestResult> {
		public HumanClinicalLaboratoryTestResult create() {		
			return SdtmFactory.eINSTANCE.createHumanClinicalLaboratoryTestResult();
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
	private static class ConstructorTestClass extends HumanClinicalLaboratoryTestResultOperations {};
	
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
	
	

	
	
} // HumanClinicalLaboratoryTestResultOperations