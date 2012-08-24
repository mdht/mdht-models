
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
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectCharacteristicOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Characteristic</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Subject Charateristic Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicSubjectCharateristicSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristic Subject Charateristic Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Associationsubject Characteristic Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Associationsubject Characteristic Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Associationsubject Characteristic Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Associationsubject Characteristic Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicCategoryAssociationSubjectCharacteristicCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Category Association Subject Characteristic Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Associationsubject Charateristic Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Associationsubject Charateristic Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Associationsubject Charateristic Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Associationsubject Charateristic Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationSubjectCharateristicSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Characteristicsubject Charateristic Sub Category Association Subject Charateristic Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectCharacteristic#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SubjectCharacteristicTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicTemplateId() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicTemplateIdTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicTemplateId(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicClassCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicClassCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicClassCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicId() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicIdTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicId(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicMoodCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicMoodCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicMoodCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicValue() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicValueTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicValue",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicValue(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicStatusCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicStatusCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicStatusCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicDataCollection() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicDataCollectionTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicDataCollection(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicNonPerformanceReason() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicNonPerformanceReasonTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicNonPerformanceReason(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicGroupIdentifier() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicGroupIdentifierTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicGroupIdentifier(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicSubjectCharateristicCategoryAssociation() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicSubjectCharateristicCategoryAssociationTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicSubjectCharateristicCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicSubjectCharateristicCategoryAssociation(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicSubjectCharateristicCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicSubjectCharateristicSubCategoryAssociation() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicSubjectCharateristicSubCategoryAssociationTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicSubjectCharateristicSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTIC_SUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicSubjectCharateristicSubCategoryAssociation(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicSubjectCharateristicSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryClassCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryClassCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATIONSUBJECT_CHARACTERISTIC_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryClassCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATIONSUBJECT_CHARACTERISTIC_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryMoodCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryMoodCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATIONSUBJECT_CHARACTERISTIC_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryMoodCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryValue() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryValueTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATIONSUBJECT_CHARACTERISTIC_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryValue(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicCategoryAssociationsubjectCharacteristicCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateIdTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateId(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicCategoryAssociationSubjectCharacteristicCategory() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicCategoryAssociationSubjectCharacteristicCategoryTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicCategoryAssociationSubjectCharacteristicCategory",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_CATEGORY_ASSOCIATION_SUBJECT_CHARACTERISTIC_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicCategoryAssociationSubjectCharacteristicCategory(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicCategoryAssociationSubjectCharacteristicCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryClassCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryClassCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATIONSUBJECT_CHARATERISTIC_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryClassCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATIONSUBJECT_CHARATERISTIC_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryMoodCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryMoodCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATIONSUBJECT_CHARATERISTIC_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryMoodCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryValue() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryValueTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATIONSUBJECT_CHARATERISTIC_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryValue(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationsubjectCharateristicSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCode(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationSubjectCharateristicSubCategory() {
      OperationsTestCase<SubjectCharacteristic> validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationSubjectCharateristicSubCategoryTestCase = new OperationsTestCase<SubjectCharacteristic>(
      "validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationSubjectCharateristicSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_CHARACTERISTICSUBJECT_CHARATERISTIC_SUB_CATEGORY_ASSOCIATION_SUBJECT_CHARATERISTIC_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectCharacteristic target) {

      }

      @Override
      protected void updateToPass(SubjectCharacteristic target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectCharacteristicOperations.validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationSubjectCharateristicSubCategory(
          (SubjectCharacteristic) objectToTest, diagnostician, map);
      }

    };

    validateSubjectCharacteristicsubjectCharateristicSubCategoryAssociationSubjectCharateristicSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


SubjectCharacteristic target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


SubjectCharacteristic target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


SubjectCharacteristic target = objectFactory.create();
target.getGroupIdentifier();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends SubjectCharacteristicOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubjectCharacteristic> {
		public SubjectCharacteristic create() {		
			return SdtmFactory.eINSTANCE.createSubjectCharacteristic();
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
	private static class ConstructorTestClass extends SubjectCharacteristicOperations {};
	
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
	
	

	
	
} // SubjectCharacteristicOperations