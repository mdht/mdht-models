
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
import org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.DrugAccountabilityOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Accountability</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityDrugAccountabilityCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Drug Accountability Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Drug Accountability Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilityEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountability Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Associationdrug Accountability Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Associationdrug Accountability Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Associationdrug Accountability Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Associationdrug Accountability Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilityCategoryAssociationDrugAccountabilityCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Category Association Drug Accountability Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Sub Category Associationdrug Accountability Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Sub Category Associationdrug Accountability Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Sub Category Associationdrug Accountability Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Sub Category Associationdrug Accountability Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationDrugAccountabilitySubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Accountabilitydrug Accountability Sub Category Association Drug Accountability Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DrugAccountability#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DrugAccountabilityTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityTemplateId() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityTemplateIdTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityTemplateId(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityClassCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityClassCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityClassCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityClassCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityId() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityIdTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityId",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityId(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityMoodCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityMoodCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityMoodCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityValue() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityValueTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityValue",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityValue(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityStatusCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityStatusCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityStatusCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityEffectiveTime() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityEffectiveTimeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityEffectiveTime(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityGroupIdentifier() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityGroupIdentifierTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityGroupIdentifier(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityDrugAccountabilityCategoryAssociation() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityDrugAccountabilityCategoryAssociationTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityDrugAccountabilityCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityDrugAccountabilityCategoryAssociation(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityDrugAccountabilityCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityDrugAccountabilitySubCategoryAssociation() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityDrugAccountabilitySubCategoryAssociationTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_DRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityDrugAccountabilitySubCategoryAssociation(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityDrugAccountabilitySubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityNonPerformanceReason() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityNonPerformanceReasonTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityNonPerformanceReason(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilityEventStudyDay() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilityEventStudyDayTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilityEventStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilityEventStudyDay(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilityEventStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryClassCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryClassCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATIONDRUG_ACCOUNTABILITY_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryClassCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATIONDRUG_ACCOUNTABILITY_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryMoodCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryMoodCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATIONDRUG_ACCOUNTABILITY_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryMoodCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryValue() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryValueTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATIONDRUG_ACCOUNTABILITY_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryValue(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilityCategoryAssociationdrugAccountabilityCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilityCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilityCategoryAssociationDrugAccountabilityCategory() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilityCategoryAssociationDrugAccountabilityCategoryTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilityCategoryAssociationDrugAccountabilityCategory",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_CATEGORY_ASSOCIATION_DRUG_ACCOUNTABILITY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilityCategoryAssociationDrugAccountabilityCategory(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilityCategoryAssociationDrugAccountabilityCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryClassCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryClassCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATIONDRUG_ACCOUNTABILITY_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryClassCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATIONDRUG_ACCOUNTABILITY_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryMoodCode() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryMoodCodeTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATIONDRUG_ACCOUNTABILITY_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryMoodCode(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryValue() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryValueTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATIONDRUG_ACCOUNTABILITY_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryValue(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationdrugAccountabilitySubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDrugAccountabilitydrugAccountabilitySubCategoryAssociationDrugAccountabilitySubCategory() {
      OperationsTestCase<DrugAccountability> validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationDrugAccountabilitySubCategoryTestCase = new OperationsTestCase<DrugAccountability>(
      "validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationDrugAccountabilitySubCategory",
      operationsForOCL.getOCLValue("VALIDATE_DRUG_ACCOUNTABILITYDRUG_ACCOUNTABILITY_SUB_CATEGORY_ASSOCIATION_DRUG_ACCOUNTABILITY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DrugAccountability target) {

      }

      @Override
      protected void updateToPass(DrugAccountability target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DrugAccountabilityOperations.validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationDrugAccountabilitySubCategory(
          (DrugAccountability) objectToTest, diagnostician, map);
      }

    };

    validateDrugAccountabilitydrugAccountabilitySubCategoryAssociationDrugAccountabilitySubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


DrugAccountability target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


DrugAccountability target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetEventStudyDay() {


DrugAccountability target = objectFactory.create();
target.getEventStudyDay();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DrugAccountabilityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DrugAccountability> {
		public DrugAccountability create() {		
			return SdtmFactory.eINSTANCE.createDrugAccountability();
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
	private static class ConstructorTestClass extends DrugAccountabilityOperations {};
	
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
	
	

	
	
} // DrugAccountabilityOperations