
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
import org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ActivityEndTimingReferenceOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Activity End Timing Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ActivityEndTimingReference#validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Activity End Timing Reference Activity End Anchor Association Activity End Anchor Time Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ActivityEndTimingReferenceTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceTemplateId() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceTemplateIdTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceTemplateId(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceClassCode() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceClassCodeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceClassCode(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceCodeP() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceCodePTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceCodeP(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceCode() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceCodeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceCode(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceEffectiveTime() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceEffectiveTimeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceEffectiveTime(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceId() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceIdTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceId",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceId(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceMoodCode() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceMoodCodeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceMoodCode(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceActivityEndAnchorAssociation() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceActivityEndAnchorAssociationTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceActivityEndAnchorAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociation(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceActivityEndAnchorAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCodeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCode(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodePTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeP(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCode(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTimeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTime(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCodeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCode(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCodeTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCode(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceActivityEndAnchorAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint() {
      OperationsTestCase<ActivityEndTimingReference> validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointTestCase = new OperationsTestCase<ActivityEndTimingReference>(
      "validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint",
      operationsForOCL.getOCLValue("VALIDATE_ACTIVITY_END_TIMING_REFERENCE_ACTIVITY_END_ANCHOR_ASSOCIATION_ACTIVITY_END_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ActivityEndTimingReference target) {

      }

      @Override
      protected void updateToPass(ActivityEndTimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ActivityEndTimingReferenceOperations.validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePoint(
          (ActivityEndTimingReference) objectToTest, diagnostician, map);
      }

    };

    validateActivityEndTimingReferenceActivityEndAnchorAssociationActivityEndAnchorTimePointTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ActivityEndTimingReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ActivityEndTimingReference> {
		public ActivityEndTimingReference create() {		
			return SdtmFactory.eINSTANCE.createActivityEndTimingReference();
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
	private static class ConstructorTestClass extends ActivityEndTimingReferenceOperations {};
	
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
	
	

	
	
} // ActivityEndTimingReferenceOperations