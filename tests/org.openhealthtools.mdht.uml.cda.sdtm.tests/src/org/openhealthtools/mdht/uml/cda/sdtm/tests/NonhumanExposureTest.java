
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
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanExposureOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Exposure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureDoseAdjustmentReasonAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Dose Adjustment Reason Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposureStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposure Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Associationdose Adjustment Reason Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Exposuredose Adjustment Reason Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanExposure#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class NonhumanExposureTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureTemplateId() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureTemplateIdTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureTemplateId(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureClassCode() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureClassCodeTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureClassCode(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureDoseQuantity() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureDoseQuantityTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureDoseQuantity(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateNonhumanExposureEffectiveTime() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureEffectiveTimeTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
         							
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureEffectiveTime(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureId() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureIdTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureId",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureId(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureMoodCode() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureMoodCodeTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureMoodCode(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureRouteCode() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureRouteCodeTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureRouteCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureRouteCode(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureRouteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureMaxDoseQuantity() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureMaxDoseQuantityTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureMaxDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureMaxDoseQuantity(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureMaxDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureText() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureTextTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureText",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureText(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureApproachSiteCode() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureApproachSiteCodeTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureApproachSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureApproachSiteCode(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureApproachSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureConsumableMaterial() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureConsumableMaterialTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureConsumableMaterial",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureConsumableMaterial(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureConsumableMaterialTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureDoseAdjustmentReasonAssociation() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureDoseAdjustmentReasonAssociationTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureDoseAdjustmentReasonAssociation",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_DOSE_ADJUSTMENT_REASON_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureDoseAdjustmentReasonAssociation(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureDoseAdjustmentReasonAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureTimingReference() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureTimingReferenceTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureTimingReference(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposureStudyDayPeriod() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposureStudyDayPeriodTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposureStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSURE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposureStudyDayPeriod(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposureStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCodeTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCode(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodePTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeP(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCode(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValueTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATIONDOSE_ADJUSTMENT_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValue(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposuredoseAdjustmentReasonAssociationdoseAdjustmentReasonValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode() {
      OperationsTestCase<NonhumanExposure> validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanExposure>(
      "validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_EXPOSUREDOSE_ADJUSTMENT_REASON_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanExposure target) {

      }

      @Override
      protected void updateToPass(NonhumanExposure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanExposureOperations.validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCode(
          (NonhumanExposure) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanExposuredoseAdjustmentReasonAssociationTypeCodeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


NonhumanExposure target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


NonhumanExposure target = objectFactory.create();
target.getStudyDayPeriod();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends NonhumanExposureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonhumanExposure> {
		public NonhumanExposure create() {		
			return SdtmFactory.eINSTANCE.createNonhumanExposure();
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
	private static class ConstructorTestClass extends NonhumanExposureOperations {};
	
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
	
	

	
	
} // NonhumanExposureOperations