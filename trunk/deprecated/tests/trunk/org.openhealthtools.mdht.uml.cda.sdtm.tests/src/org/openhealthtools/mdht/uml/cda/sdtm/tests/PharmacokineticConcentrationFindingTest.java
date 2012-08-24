
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
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PharmacokineticConcentrationFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pharmacokinetic Concentration Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Pharmacokinetics Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Pharmacokinetics Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Assay Quantitation Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Associationpharmacokinetics Test Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Category Association Pharmacokinetics Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Associationpharmacokinetics Test Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingpharmacokinetics Test Result Sub Category Association Pharmacokinetics Test Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Associationfasting Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingfasting Association Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Associationassay Quantitation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Association Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Findingassay Quantitation Association Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PharmacokineticConcentrationFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingTemplateId() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingTemplateIdTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingTemplateId(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingClassCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingClassCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingClassCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingId() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingIdTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingId",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingId(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingMoodCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingMoodCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingMoodCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingStatusCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingStatusCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingStatusCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingValue() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingValueTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingValue(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingMethodCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingMethodCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingMethodCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingInterpretationCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingInterpretationCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingInterpretationCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingGroupIdentifier() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingGroupIdentifierTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingGroupIdentifier(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociationTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociation(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingPharmacokineticsTestResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociationTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociation(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingPharmacokineticsTestResultSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingFastingAssociation() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingFastingAssociationTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingFastingAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingFastingAssociation(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingFastingAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingSpecimenInformation() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingSpecimenInformationTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingSpecimenInformation(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingNonPerformanceReason() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingNonPerformanceReasonTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingNonPerformanceReason(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingAssayQuantitationAssociation() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingAssayQuantitationAssociationTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingAssayQuantitationAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingAssayQuantitationAssociation(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingAssayQuantitationAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingPlannedStudyDay() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingPlannedStudyDayTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingPlannedStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingPlannedStudyDay(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingPlannedStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingExclusionReason() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingExclusionReasonTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingExclusionReason",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingExclusionReason(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingExclusionReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValueTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValue(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationpharmacokineticsTestResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategoryTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategory(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultCategoryAssociationPharmacokineticsTestResultCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValueTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValue(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationpharmacokineticsTestResultSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategoryTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGPHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategory(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingpharmacokineticsTestResultSubCategoryAssociationPharmacokineticsTestResultSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodePTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeP(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValueTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATIONFASTING_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValue(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingfastingAssociationfastingStatusValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingfastingAssociationTypeCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingfastingAssociationTypeCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingfastingAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationTypeCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingfastingAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingfastingAssociationFastingStatus() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingfastingAssociationFastingStatusTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGFASTING_ASSOCIATION_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingfastingAssociationFastingStatus(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingfastingAssociationFastingStatusTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodePTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeP(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCodeTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCode(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValueTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATIONASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValue(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingassayQuantitationAssociationassayQuantitationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeIdTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeId(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingassayQuantitationAssociationTypeIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation() {
      OperationsTestCase<PharmacokineticConcentrationFinding> validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservationTestCase = new OperationsTestCase<PharmacokineticConcentrationFinding>(
      "validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDINGASSAY_QUANTITATION_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticConcentrationFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticConcentrationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticConcentrationFindingOperations.validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservation(
          (PharmacokineticConcentrationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticConcentrationFindingassayQuantitationAssociationObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


PharmacokineticConcentrationFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


PharmacokineticConcentrationFinding target = objectFactory.create();
target.getSpecimenInformation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


PharmacokineticConcentrationFinding target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlannedStudyDay() {


PharmacokineticConcentrationFinding target = objectFactory.create();
target.getPlannedStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetExclusionReason() {


PharmacokineticConcentrationFinding target = objectFactory.create();
target.getExclusionReason();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends PharmacokineticConcentrationFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PharmacokineticConcentrationFinding> {
		public PharmacokineticConcentrationFinding create() {		
			return SdtmFactory.eINSTANCE.createPharmacokineticConcentrationFinding();
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
	private static class ConstructorTestClass extends PharmacokineticConcentrationFindingOperations {};
	
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
	
	

	
	
} // PharmacokineticConcentrationFindingOperations