
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
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalDispositionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionDispositionCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Disposition Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionDispositionSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Disposition Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Disposition Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Associationdisposition Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Category Association Disposition Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Associationdisposition Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Dispositiondisposition Sub Category Association Disposition Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalDisposition#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HumanClinicalDispositionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionTemplateId() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionTemplateIdTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionTemplateId(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionClassCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionClassCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionClassCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionEffectiveTime() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionEffectiveTimeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionEffectiveTime(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionId() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionIdTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionId",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionId(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionMoodCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionMoodCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionMoodCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionDispositionCategoryAssociation() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionDispositionCategoryAssociationTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionDispositionCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionDispositionCategoryAssociation(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionDispositionCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionDispositionSubCategoryAssociation() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionDispositionSubCategoryAssociationTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionDispositionSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_DISPOSITION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionDispositionSubCategoryAssociation(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionDispositionSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionStudyEpoch() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionStudyEpochTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionStudyEpoch",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionStudyEpoch(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionStudyEpochTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionDataCollection() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionDataCollectionTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionDataCollection(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionGroupIdentifier() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionGroupIdentifierTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionGroupIdentifier(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositionStudyDayPeriod() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositionStudyDayPeriodTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositionStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositionStudyDayPeriod(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositionStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValueTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATIONDISPOSITION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
     
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValue(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionCategoryAssociationdispositionCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionCategoryAssociationTypeCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionCategoryAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionCategoryAssociationTypeCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategoryTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_CATEGORY_ASSOCIATION_DISPOSITION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategory(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionCategoryAssociationDispositionCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValueTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATIONDISPOSITION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
    
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValue(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionSubCategoryAssociationdispositionSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCode(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory() {
      OperationsTestCase<HumanClinicalDisposition> validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategoryTestCase = new OperationsTestCase<HumanClinicalDisposition>(
      "validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_DISPOSITIONDISPOSITION_SUB_CATEGORY_ASSOCIATION_DISPOSITION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalDisposition target) {

      }

      @Override
      protected void updateToPass(HumanClinicalDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalDispositionOperations.validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategory(
          (HumanClinicalDisposition) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalDispositiondispositionSubCategoryAssociationDispositionSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyEpoch() {


HumanClinicalDisposition target = objectFactory.create();
target.getStudyEpoch();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


HumanClinicalDisposition target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


HumanClinicalDisposition target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


HumanClinicalDisposition target = objectFactory.create();
target.getStudyDayPeriod();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends HumanClinicalDispositionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HumanClinicalDisposition> {
		public HumanClinicalDisposition create() {		
			return SdtmFactory.eINSTANCE.createHumanClinicalDisposition();
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
	private static class ConstructorTestClass extends HumanClinicalDispositionOperations {};
	
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
	
	

	
	
} // HumanClinicalDispositionOperations