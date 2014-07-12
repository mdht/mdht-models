
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
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanLaboratoryTestResultOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Laboratory Test Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Laboratory Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Laboratory Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultReferenceRangeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Reference Range Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultLabToxicityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Lab Toxicity Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultExclusionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Result Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Associationlaboratory Test Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Category Association Laboratory Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Associationlaboratory Test Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlaboratory Test Result Sub Category Association Laboratory Test Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Associationreference Range Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultreference Range Association Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Associationfasting Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultfasting Association Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Associationlab Toxicity Grade Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Laboratory Test Resultlab Toxicity Association Lab Toxicity Grade</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getExclusionIndicator() <em>Get Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanLaboratoryTestResult#getTimingReference() <em>Get Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class NonhumanLaboratoryTestResultTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultTemplateId() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultTemplateIdTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultTemplateId(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultClassCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultClassCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultClassCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultId() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultIdTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultId",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultId(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultMoodCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultMoodCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultMoodCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultStatusCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultStatusCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultStatusCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultValue() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultValueTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultValue(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultMethodCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultMethodCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultMethodCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultInterpretationCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultInterpretationCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultInterpretationCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultGroupIdentifier() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultGroupIdentifierTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultGroupIdentifier(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultSpecimenInformation() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultSpecimenInformationTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultSpecimenInformation(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociationTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociation(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultLaboratoryTestResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociationTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociation(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultLaboratoryTestResultSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultReferenceRangeAssociation() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultReferenceRangeAssociationTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultReferenceRangeAssociation",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_REFERENCE_RANGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultReferenceRangeAssociation(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultReferenceRangeAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultNonPerformanceReason() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultNonPerformanceReasonTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultNonPerformanceReason(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultFastingAssociation() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultFastingAssociationTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultFastingAssociation",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultFastingAssociation(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultFastingAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultLabToxicityAssociation() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultLabToxicityAssociationTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultLabToxicityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_LAB_TOXICITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultLabToxicityAssociation(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultLabToxicityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultExclusionIndicator() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultExclusionIndicatorTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultExclusionIndicator",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultExclusionIndicator(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultExclusionIndicatorTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultPlannedStudyDay() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultPlannedStudyDayTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultPlannedStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultPlannedStudyDay(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultPlannedStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultStudyDayPeriod() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultStudyDayPeriodTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultStudyDayPeriod(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultTimingReference() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultTimingReferenceTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultTimingReference(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValueTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValue(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationlaboratoryTestResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategoryTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategory(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultCategoryAssociationLaboratoryTestResultCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValueTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONLABORATORY_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValue(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationlaboratoryTestResultSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategoryTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLABORATORY_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_LABORATORY_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategory(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlaboratoryTestResultSubCategoryAssociationLaboratoryTestResultSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodePTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodeP(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValueTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATIONREFERENCE_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValue(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultreferenceRangeAssociationreferenceRangeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultreferenceRangeAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRangeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTREFERENCE_RANGE_ASSOCIATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRange(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultreferenceRangeAssociationReferenceRangeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodePTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeP(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValueTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValue(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultfastingAssociationfastingStatusValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultfastingAssociationTypeCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultfastingAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultfastingAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationTypeCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultfastingAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultfastingAssociationFastingStatus() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultfastingAssociationFastingStatusTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultfastingAssociationFastingStatus(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultfastingAssociationFastingStatusTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodePTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeP(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValue(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValuePTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATIONLAB_TOXICITY_GRADE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValueP(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlabToxicityAssociationlabToxicityGradeValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCode(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlabToxicityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade() {
      OperationsTestCase<NonhumanLaboratoryTestResult> validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGradeTestCase = new OperationsTestCase<NonhumanLaboratoryTestResult>(
      "validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_LABORATORY_TEST_RESULTLAB_TOXICITY_ASSOCIATION_LAB_TOXICITY_GRADE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanLaboratoryTestResult target) {

      }

      @Override
      protected void updateToPass(NonhumanLaboratoryTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanLaboratoryTestResultOperations.validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGrade(
          (NonhumanLaboratoryTestResult) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanLaboratoryTestResultlabToxicityAssociationLabToxicityGradeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


NonhumanLaboratoryTestResult target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


NonhumanLaboratoryTestResult target = objectFactory.create();
target.getSpecimenInformation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


NonhumanLaboratoryTestResult target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetExclusionIndicator() {


NonhumanLaboratoryTestResult target = objectFactory.create();
target.getExclusionIndicator();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlannedStudyDay() {


NonhumanLaboratoryTestResult target = objectFactory.create();
target.getPlannedStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


NonhumanLaboratoryTestResult target = objectFactory.create();
target.getStudyDayPeriod();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


NonhumanLaboratoryTestResult target = objectFactory.create();
target.getTimingReference();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends NonhumanLaboratoryTestResultOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonhumanLaboratoryTestResult> {
		public NonhumanLaboratoryTestResult create() {		
			return SdtmFactory.eINSTANCE.createNonhumanLaboratoryTestResult();
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
	private static class ConstructorTestClass extends NonhumanLaboratoryTestResultOperations {};
	
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
	
	

	
	
} // NonhumanLaboratoryTestResultOperations