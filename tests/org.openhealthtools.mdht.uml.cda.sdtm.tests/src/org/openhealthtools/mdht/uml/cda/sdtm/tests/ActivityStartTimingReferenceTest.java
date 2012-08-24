
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
import org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ActivityStartTimingReferenceOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity Start Timing Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityStartTimingReference#validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity Start Timing Reference Activity Start Anchor Association Activity Start Anchor Time Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ActivityStartTimingReferenceTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceTemplateId() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceTemplateIdTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceTemplateId(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceClassCode() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceClassCodeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceClassCode(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceCodeP() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceCodePTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceCodeP(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceCode() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceCodeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceCode(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceEffectiveTime() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceEffectiveTimeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceEffectiveTime(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceId() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceIdTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceId",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceId(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceMoodCode() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceMoodCodeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceMoodCode(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceActivityStartAnchorAssociation() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceActivityStartAnchorAssociationTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceActivityStartAnchorAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceActivityStartAnchorAssociation(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceActivityStartAnchorAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCodeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCode(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodePTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeP(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCode(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTimeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTime(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCodeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCode(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCodeTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCode(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceActivityStartAnchorAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint() {
      OperationsTestCase<ActivityStartTimingReference> validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointTestCase = new OperationsTestCase<ActivityStartTimingReference>(
      "validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_START_TIMING_REFERENCE_ACTIVITY_START_ANCHOR_ASSOCIATION_ACTIVITY_START_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityStartTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityStartTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityStartTimingReferenceOperations.validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePoint(
          (ActivityStartTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityStartTimingReferenceActivityStartAnchorAssociationActivityStartAnchorTimePointTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ActivityStartTimingReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ActivityStartTimingReference> {
		public ActivityStartTimingReference create() {		
			return SdtmFactory.eINSTANCE.createActivityStartTimingReference();
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
	private static class ConstructorTestClass extends ActivityStartTimingReferenceOperations {};
	
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
	
	

	
	
} // ActivityStartTimingReferenceOperations