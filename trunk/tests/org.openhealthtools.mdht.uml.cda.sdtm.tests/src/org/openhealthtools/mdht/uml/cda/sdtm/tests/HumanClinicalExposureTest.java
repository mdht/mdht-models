
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
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalExposureOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Exposure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureExposureCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureExposureSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureDoseAdjustmentReasonAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Dose Adjustment Reason Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureElementOrderAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Element Order Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureExposureRegimenAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposure Exposure Regimen Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Associationexposure Event Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Category Association Exposure Event Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Associationexposure Event Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Sub Category Association Exposure Event Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Associationdose Adjustment Reason Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposuredose Adjustment Reason Association Dose Adjustment Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureelementOrderAssociationElementOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureelement Order Association Element Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Associationexposure Intended Regimen Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Exposureexposure Regimen Association Exposure Intended Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalExposure#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HumanClinicalExposureTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureTemplateId() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureTemplateIdTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureTemplateId(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureClassCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureClassCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureClassCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureDoseQuantity() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureDoseQuantityTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureDoseQuantity(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateHumanClinicalExposureEffectiveTime() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureEffectiveTimeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
      							
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureEffectiveTime(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureId() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureIdTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureId",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureId(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureMoodCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureMoodCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureMoodCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureRouteCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureRouteCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureRouteCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureRouteCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureRouteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureMaxDoseQuantity() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureMaxDoseQuantityTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureMaxDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureMaxDoseQuantity(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureMaxDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureText() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureTextTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureText",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureText(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureApproachSiteCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureApproachSiteCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureApproachSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureApproachSiteCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureApproachSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureGroupIdentifier() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureGroupIdentifierTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureGroupIdentifier(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureConsumableMaterial() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureConsumableMaterialTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureConsumableMaterial",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureConsumableMaterial(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureConsumableMaterialTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureExposureCategoryAssociation() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureExposureCategoryAssociationTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureExposureCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureExposureCategoryAssociation(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureExposureCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureExposureSubCategoryAssociation() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureExposureSubCategoryAssociationTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureExposureSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureExposureSubCategoryAssociation(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureExposureSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureDoseAdjustmentReasonAssociation() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureDoseAdjustmentReasonAssociationTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureDoseAdjustmentReasonAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureDoseAdjustmentReasonAssociation(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureDoseAdjustmentReasonAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureStudyEpoch() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureStudyEpochTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureStudyEpoch",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureStudyEpoch(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureStudyEpochTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureElementOrderAssociation() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureElementOrderAssociationTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureElementOrderAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureElementOrderAssociation(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureElementOrderAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureTimingReference() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureTimingReferenceTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureTimingReference(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureStudyDayPeriod() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureStudyDayPeriodTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureStudyDayPeriod(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureExposureRegimenAssociation() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureExposureRegimenAssociationTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureExposureRegimenAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSURE_EXPOSURE_REGIMEN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureExposureRegimenAssociation(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureExposureRegimenAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/ 
@Test

 
									
public void testValidateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValueTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValue(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureCategoryAssociationexposureEventCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureCategoryAssociationTypeCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureCategoryAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureCategoryAssociationTypeCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategoryTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategory(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureCategoryAssociationExposureEventCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValueTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATIONEXPOSURE_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValue(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureSubCategoryAssociationexposureEventSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureSubCategoryAssociationTypeCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureSubCategoryAssociationTypeCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategoryTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_SUB_CATEGORY_ASSOCIATION_EXPOSURE_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategory(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureSubCategoryAssociationExposureEventSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodePTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValueTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposuredoseAdjustmentReasonAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReasonTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_DOSE_ADJUSTMENT_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReason(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposuredoseAdjustmentReasonAssociationDoseAdjustmentReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureelementOrderAssociationelementOrderClassCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureelementOrderAssociationelementOrderClassCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderClassCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureelementOrderAssociationelementOrderClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureelementOrderAssociationelementOrderCodeP() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureelementOrderAssociationelementOrderCodePTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderCodeP(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureelementOrderAssociationelementOrderCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureelementOrderAssociationelementOrderCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureelementOrderAssociationelementOrderCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureelementOrderAssociationelementOrderCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureelementOrderAssociationelementOrderCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureelementOrderAssociationelementOrderMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateHumanClinicalExposureelementOrderAssociationelementOrderValue() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureelementOrderAssociationelementOrderValueTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureelementOrderAssociationelementOrderValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationelementOrderValue(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureelementOrderAssociationelementOrderValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureelementOrderAssociationTypeCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureelementOrderAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureelementOrderAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationTypeCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureelementOrderAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureelementOrderAssociationElementOrder() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureelementOrderAssociationElementOrderTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureelementOrderAssociationElementOrder",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureelementOrderAssociationElementOrder(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureelementOrderAssociationElementOrderTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValueTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATIONEXPOSURE_INTENDED_REGIMEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValue(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureRegimenAssociationexposureIntendedRegimenValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureRegimenAssociationTypeCode() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureRegimenAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureRegimenAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureRegimenAssociationTypeCode(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureRegimenAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen() {
      OperationsTestCase<HumanClinicalExposure> validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimenTestCase = new OperationsTestCase<HumanClinicalExposure>(
      "validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_EXPOSUREEXPOSURE_REGIMEN_ASSOCIATION_EXPOSURE_INTENDED_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalExposure target) {

      }

      @Override
      protected void updateToPass(HumanClinicalExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalExposureOperations.validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimen(
          (HumanClinicalExposure) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalExposureexposureRegimenAssociationExposureIntendedRegimenTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


HumanClinicalExposure target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyEpoch() {


HumanClinicalExposure target = objectFactory.create();
target.getStudyEpoch();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


HumanClinicalExposure target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


HumanClinicalExposure target = objectFactory.create();
target.getStudyDayPeriod();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends HumanClinicalExposureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HumanClinicalExposure> {
		public HumanClinicalExposure create() {		
			return SdtmFactory.eINSTANCE.createHumanClinicalExposure();
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
	private static class ConstructorTestClass extends HumanClinicalExposureOperations {};
	
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
	
	

	
	
} // HumanClinicalExposureOperations