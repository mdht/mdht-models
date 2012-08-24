
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
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PhysicalExaminationFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Examination Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Physical Exam Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Physical Exam Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Associationphysical Exam Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Category Association Physical Exam Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Associationphysical Exam Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Findingphysical Exam Result Sub Category Association Physical Exam Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PhysicalExaminationFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingTemplateId() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingTemplateIdTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingTemplateId(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingClassCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingClassCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingClassCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingId() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingIdTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingId",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingId(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingMoodCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingMoodCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingMoodCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingValue() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingValueTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingValue(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingStatusCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingStatusCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingStatusCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingTargetSiteCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingTargetSiteCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingTargetSiteCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingMethodCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingMethodCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingMethodCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingGroupIdentifier() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingGroupIdentifierTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingGroupIdentifier(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociationTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociation(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingPhysicalExamResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociationTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_PHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociation(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingPhysicalExamResultSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingBodySystemorOrganClass() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingBodySystemorOrganClassTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingBodySystemorOrganClass",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingBodySystemorOrganClass(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingBodySystemorOrganClassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingNonPerformanceReason() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingNonPerformanceReasonTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingNonPerformanceReason(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingDataCollection() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingDataCollectionTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingDataCollection(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValueTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValue(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationphysicalExamResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategoryTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategory(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultCategoryAssociationPhysicalExamResultCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValueTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATIONPHYSICAL_EXAM_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValue(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationphysicalExamResultSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCode(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory() {
      OperationsTestCase<PhysicalExaminationFinding> validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategoryTestCase = new OperationsTestCase<PhysicalExaminationFinding>(
      "validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAMINATION_FINDINGPHYSICAL_EXAM_RESULT_SUB_CATEGORY_ASSOCIATION_PHYSICAL_EXAM_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PhysicalExaminationFinding target) {

      }

      @Override
      protected void updateToPass(PhysicalExaminationFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PhysicalExaminationFindingOperations.validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategory(
          (PhysicalExaminationFinding) objectToTest, diagnostician, map);
      }

    };

    validatePhysicalExaminationFindingphysicalExamResultSubCategoryAssociationPhysicalExamResultSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


PhysicalExaminationFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodySystemorOrganClass() {


PhysicalExaminationFinding target = objectFactory.create();
target.getBodySystemorOrganClass();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


PhysicalExaminationFinding target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


PhysicalExaminationFinding target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends PhysicalExaminationFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalExaminationFinding> {
		public PhysicalExaminationFinding create() {		
			return SdtmFactory.eINSTANCE.createPhysicalExaminationFinding();
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
	private static class ConstructorTestClass extends PhysicalExaminationFindingOperations {};
	
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
	
	

	
	
} // PhysicalExaminationFindingOperations