
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
import org.openhealthtools.mdht.uml.cda.sdtm.VitalSign;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.VitalSignOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignAssociatedPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Associated Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignVitalSignCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Vital Sign Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignVitalSignSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Vital Sign Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignConsciousnessState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Consciousness State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionpositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Positionposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Position Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignassociatedPositionPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signassociated Position Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignCategoryAssociationvitalSignCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Category Associationvital Sign Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Category Associationvital Sign Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Category Associationvital Sign Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignCategoryAssociationvitalSignCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Category Associationvital Sign Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Category Associationvital Sign Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Category Associationvital Sign Category Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignCategoryAssociationVitalSignCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Category Association Vital Sign Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Sub Category Associationvital Sign Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Sub Category Associationvital Sign Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Sub Category Associationvital Sign Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Sub Category Associationvital Sign Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Sub Category Associationvital Sign Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignvitalSignSubCategoryAssociationVitalSignSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signvital Sign Sub Category Association Vital Sign Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignconsciousnessStateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signconsciousness State Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignconsciousnessStateCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signconsciousness State Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignconsciousnessStateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signconsciousness State Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignconsciousnessStateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signconsciousness State Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#validateVitalSignconsciousnessStateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signconsciousness State Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.VitalSign#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class VitalSignTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignTemplateId() {
      OperationsTestCase<VitalSign> validateVitalSignTemplateIdTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignTemplateId(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignClassCode() {
      OperationsTestCase<VitalSign> validateVitalSignClassCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignClassCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignClassCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignCode() {
      OperationsTestCase<VitalSign> validateVitalSignCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignMoodCode() {
      OperationsTestCase<VitalSign> validateVitalSignMoodCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignMoodCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignValue() {
      OperationsTestCase<VitalSign> validateVitalSignValueTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignValue",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignValue(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignStatusCode() {
      OperationsTestCase<VitalSign> validateVitalSignStatusCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignStatusCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignInterpretationCodeP() {
      OperationsTestCase<VitalSign> validateVitalSignInterpretationCodePTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignInterpretationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignInterpretationCodeP(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignInterpretationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignInterpretationCode() {
      OperationsTestCase<VitalSign> validateVitalSignInterpretationCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignInterpretationCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignTargetSiteCode() {
      OperationsTestCase<VitalSign> validateVitalSignTargetSiteCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignTargetSiteCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignEffectiveTime() {
      OperationsTestCase<VitalSign> validateVitalSignEffectiveTimeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignEffectiveTime(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignId() {
      OperationsTestCase<VitalSign> validateVitalSignIdTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignId",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignId(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignAssociatedPosition() {
      OperationsTestCase<VitalSign> validateVitalSignAssociatedPositionTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignAssociatedPosition",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignAssociatedPosition(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignAssociatedPositionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignEventStudyDay() {
      OperationsTestCase<VitalSign> validateVitalSignEventStudyDayTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignEventStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignEventStudyDay(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignEventStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignTimingReference() {
      OperationsTestCase<VitalSign> validateVitalSignTimingReferenceTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignTimingReference(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignNonPerformanceReason() {
      OperationsTestCase<VitalSign> validateVitalSignNonPerformanceReasonTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignNonPerformanceReason(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignVitalSignCategoryAssociation() {
      OperationsTestCase<VitalSign> validateVitalSignVitalSignCategoryAssociationTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignVitalSignCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_VITAL_SIGN_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignVitalSignCategoryAssociation(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignVitalSignCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignVitalSignSubCategoryAssociation() {
      OperationsTestCase<VitalSign> validateVitalSignVitalSignSubCategoryAssociationTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignVitalSignSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_VITAL_SIGN_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignVitalSignSubCategoryAssociation(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignVitalSignSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignConsciousnessState() {
      OperationsTestCase<VitalSign> validateVitalSignConsciousnessStateTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignConsciousnessState",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_CONSCIOUSNESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignConsciousnessState(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignConsciousnessStateTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignPlannedStudyDay() {
      OperationsTestCase<VitalSign> validateVitalSignPlannedStudyDayTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignPlannedStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignPlannedStudyDay(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignPlannedStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignStudyDayPeriod() {
      OperationsTestCase<VitalSign> validateVitalSignStudyDayPeriodTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignStudyDayPeriod(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignExclusionReason() {
      OperationsTestCase<VitalSign> validateVitalSignExclusionReasonTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignExclusionReason",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignExclusionReason(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignExclusionReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignGroupIdentifier() {
      OperationsTestCase<VitalSign> validateVitalSignGroupIdentifierTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignGroupIdentifier(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignassociatedPositionpositionClassCode() {
      OperationsTestCase<VitalSign> validateVitalSignassociatedPositionpositionClassCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignassociatedPositionpositionClassCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignassociatedPositionpositionClassCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignassociatedPositionpositionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignassociatedPositionpositionCodeP() {
      OperationsTestCase<VitalSign> validateVitalSignassociatedPositionpositionCodePTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignassociatedPositionpositionCodeP",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignassociatedPositionpositionCodeP(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignassociatedPositionpositionCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignassociatedPositionpositionCode() {
      OperationsTestCase<VitalSign> validateVitalSignassociatedPositionpositionCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignassociatedPositionpositionCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignassociatedPositionpositionCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignassociatedPositionpositionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignassociatedPositionpositionMoodCode() {
      OperationsTestCase<VitalSign> validateVitalSignassociatedPositionpositionMoodCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignassociatedPositionpositionMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignassociatedPositionpositionMoodCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignassociatedPositionpositionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignassociatedPositionpositionValue() {
      OperationsTestCase<VitalSign> validateVitalSignassociatedPositionpositionValueTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignassociatedPositionpositionValue",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignassociatedPositionpositionValue(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignassociatedPositionpositionValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignassociatedPositionTypeCode() {
      OperationsTestCase<VitalSign> validateVitalSignassociatedPositionTypeCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignassociatedPositionTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignassociatedPositionTypeCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignassociatedPositionTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignassociatedPositionPosition() {
      OperationsTestCase<VitalSign> validateVitalSignassociatedPositionPositionTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignassociatedPositionPosition",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignassociatedPositionPosition(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignassociatedPositionPositionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignCategoryAssociationvitalSignCategoryClassCode() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignCategoryAssociationvitalSignCategoryClassCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignCategoryAssociationvitalSignCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_CATEGORY_ASSOCIATIONVITAL_SIGN_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryClassCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignCategoryAssociationvitalSignCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodeP() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodePTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_CATEGORY_ASSOCIATIONVITAL_SIGN_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodeP(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignCategoryAssociationvitalSignCategoryCode() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_CATEGORY_ASSOCIATIONVITAL_SIGN_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignCategoryAssociationvitalSignCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignCategoryAssociationvitalSignCategoryMoodCode() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignCategoryAssociationvitalSignCategoryMoodCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignCategoryAssociationvitalSignCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_CATEGORY_ASSOCIATIONVITAL_SIGN_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryMoodCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignCategoryAssociationvitalSignCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignCategoryAssociationvitalSignCategoryValue() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValueTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_CATEGORY_ASSOCIATIONVITAL_SIGN_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValue(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignCategoryAssociationvitalSignCategoryValueP() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValuePTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValueP",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_CATEGORY_ASSOCIATIONVITAL_SIGN_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValueP(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignCategoryAssociationvitalSignCategoryValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignCategoryAssociationTypeCode() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignCategoryAssociationTypeCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationTypeCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignCategoryAssociationVitalSignCategory() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignCategoryAssociationVitalSignCategoryTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignCategoryAssociationVitalSignCategory",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_CATEGORY_ASSOCIATION_VITAL_SIGN_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignCategoryAssociationVitalSignCategory(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignCategoryAssociationVitalSignCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryClassCode() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryClassCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_SUB_CATEGORY_ASSOCIATIONVITAL_SIGN_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryClassCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodeP() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodePTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_SUB_CATEGORY_ASSOCIATIONVITAL_SIGN_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodeP(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCode() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_SUB_CATEGORY_ASSOCIATIONVITAL_SIGN_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryMoodCode() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryMoodCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_SUB_CATEGORY_ASSOCIATIONVITAL_SIGN_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryMoodCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryValue() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryValueTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_SUB_CATEGORY_ASSOCIATIONVITAL_SIGN_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryValue(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignSubCategoryAssociationvitalSignSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignSubCategoryAssociationTypeCode() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationTypeCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignvitalSignSubCategoryAssociationVitalSignSubCategory() {
      OperationsTestCase<VitalSign> validateVitalSignvitalSignSubCategoryAssociationVitalSignSubCategoryTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignvitalSignSubCategoryAssociationVitalSignSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNVITAL_SIGN_SUB_CATEGORY_ASSOCIATION_VITAL_SIGN_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignvitalSignSubCategoryAssociationVitalSignSubCategory(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignvitalSignSubCategoryAssociationVitalSignSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignconsciousnessStateClassCode() {
      OperationsTestCase<VitalSign> validateVitalSignconsciousnessStateClassCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignconsciousnessStateClassCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNCONSCIOUSNESS_STATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignconsciousnessStateClassCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignconsciousnessStateClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignconsciousnessStateCodeP() {
      OperationsTestCase<VitalSign> validateVitalSignconsciousnessStateCodePTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignconsciousnessStateCodeP",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNCONSCIOUSNESS_STATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignconsciousnessStateCodeP(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignconsciousnessStateCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignconsciousnessStateCode() {
      OperationsTestCase<VitalSign> validateVitalSignconsciousnessStateCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignconsciousnessStateCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNCONSCIOUSNESS_STATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignconsciousnessStateCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignconsciousnessStateCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignconsciousnessStateMoodCode() {
      OperationsTestCase<VitalSign> validateVitalSignconsciousnessStateMoodCodeTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignconsciousnessStateMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNCONSCIOUSNESS_STATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignconsciousnessStateMoodCode(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignconsciousnessStateMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignconsciousnessStateValue() {
      OperationsTestCase<VitalSign> validateVitalSignconsciousnessStateValueTestCase = new OperationsTestCase<VitalSign>(
      "validateVitalSignconsciousnessStateValue",
      operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGNCONSCIOUSNESS_STATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(VitalSign target) {

      }

      @Override
      protected void updateToPass(VitalSign target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VitalSignOperations.validateVitalSignconsciousnessStateValue(
          (VitalSign) objectToTest, diagnostician, map);
      }

    };

    validateVitalSignconsciousnessStateValueTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetEventStudyDay() {


VitalSign target = objectFactory.create();
target.getEventStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


VitalSign target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


VitalSign target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlannedStudyDay() {


VitalSign target = objectFactory.create();
target.getPlannedStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


VitalSign target = objectFactory.create();
target.getStudyDayPeriod();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetExclusionReason() {


VitalSign target = objectFactory.create();
target.getExclusionReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


VitalSign target = objectFactory.create();
target.getGroupIdentifier();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends VitalSignOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSign> {
		public VitalSign create() {		
			return SdtmFactory.eINSTANCE.createVitalSign();
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
	private static class ConstructorTestClass extends VitalSignOperations {};
	
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
	
	

	
	
} // VitalSignOperations