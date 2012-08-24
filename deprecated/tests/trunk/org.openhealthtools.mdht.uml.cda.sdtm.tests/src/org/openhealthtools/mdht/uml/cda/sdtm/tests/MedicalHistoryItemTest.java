
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
import org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MedicalHistoryItemOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical History Item</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemMedicalHistoryCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Medical History Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Medical History Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemActivityEndTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Item Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Associationmedical History Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Category Association Medical History Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Associationmedical History Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical History Itemmedical History Sub Category Association Medical History Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getActivityEndTimingReference() <em>Get Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MedicalHistoryItem#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MedicalHistoryItemTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemTemplateId() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemTemplateIdTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemTemplateId(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemClassCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemClassCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemClassCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemEffectiveTime() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemEffectiveTimeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemEffectiveTime(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemId() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemIdTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemId",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemId(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemMoodCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemMoodCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemMoodCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemStatusCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemStatusCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemStatusCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemValue() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemValueTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemValue",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemValue(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemGroupIdentifier() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemGroupIdentifierTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemGroupIdentifier(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemMedicalHistoryCategoryAssociation() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemMedicalHistoryCategoryAssociationTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemMedicalHistoryCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemMedicalHistoryCategoryAssociation(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemMedicalHistoryCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemMedicalHistorySubCategoryAssociation() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemMedicalHistorySubCategoryAssociationTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemMedicalHistorySubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_MEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemMedicalHistorySubCategoryAssociation(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemMedicalHistorySubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemPreSpecifiedEvent() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemPreSpecifiedEventTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemPreSpecifiedEvent",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemPreSpecifiedEvent(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemPreSpecifiedEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemNonPerformanceReason() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemNonPerformanceReasonTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemNonPerformanceReason(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemBodySystemorOrganClass() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemBodySystemorOrganClassTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemBodySystemorOrganClass",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemBodySystemorOrganClass(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemBodySystemorOrganClassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemActivityEndTimingReference() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemActivityEndTimingReferenceTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemActivityEndTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemActivityEndTimingReference(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemActivityEndTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemDataCollection() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemDataCollectionTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEM_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemDataCollection(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValueTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValue(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistoryCategoryAssociationmedicalHistoryCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistoryCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategoryTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategory(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistoryCategoryAssociationMedicalHistoryCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValueTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATIONMEDICAL_HISTORY_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValue(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistorySubCategoryAssociationmedicalHistorySubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCode(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistorySubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory() {
      OperationsTestCase<MedicalHistoryItem> validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategoryTestCase = new OperationsTestCase<MedicalHistoryItem>(
      "validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_HISTORY_ITEMMEDICAL_HISTORY_SUB_CATEGORY_ASSOCIATION_MEDICAL_HISTORY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalHistoryItem target) {

      }

      @Override
      protected void updateToPass(MedicalHistoryItem target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalHistoryItemOperations.validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategory(
          (MedicalHistoryItem) objectToTest, diagnostician, map);
      }

    };

    validateMedicalHistoryItemmedicalHistorySubCategoryAssociationMedicalHistorySubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


MedicalHistoryItem target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPreSpecifiedEvent() {


MedicalHistoryItem target = objectFactory.create();
target.getPreSpecifiedEvent();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


MedicalHistoryItem target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodySystemorOrganClass() {


MedicalHistoryItem target = objectFactory.create();
target.getBodySystemorOrganClass();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetActivityEndTimingReference() {


MedicalHistoryItem target = objectFactory.create();
target.getActivityEndTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


MedicalHistoryItem target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends MedicalHistoryItemOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalHistoryItem> {
		public MedicalHistoryItem create() {		
			return SdtmFactory.eINSTANCE.createMedicalHistoryItem();
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
	private static class ConstructorTestClass extends MedicalHistoryItemOperations {};
	
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
	
	

	
	
} // MedicalHistoryItemOperations