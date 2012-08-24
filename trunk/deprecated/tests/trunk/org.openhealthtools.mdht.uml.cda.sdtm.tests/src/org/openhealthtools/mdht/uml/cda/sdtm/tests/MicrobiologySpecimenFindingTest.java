
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
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicrobiologySpecimenFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Microbiology Specimen Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Specimen Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Specimen Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Finding Microbiology Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Associationmicrobiology Specimen Finding Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Associationmicrobiology Specimen Finding Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Associationmicrobiology Specimen Finding Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Associationmicrobiology Specimen Finding Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Category Association Microbiology Specimen Finding Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Associationmicrobiology Specimen Finding Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Associationmicrobiology Specimen Finding Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Associationmicrobiology Specimen Finding Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Associationmicrobiology Specimen Finding Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Specimen Finding Sub Category Association Microbiology Specimen Finding Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Associationmicrobiology Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Associationmicrobiology Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Associationmicrobiology Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Associationmicrobiology Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Specimen Findingmicrobiology Result Category Association Microbiology Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySpecimenFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MicrobiologySpecimenFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingTemplateId() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingTemplateIdTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingTemplateId(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingClassCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingClassCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingClassCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingId() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingIdTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingId",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingId(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingMethodCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingMethodCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMethodCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingMoodCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingMoodCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMoodCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingStatusCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingStatusCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingStatusCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingValue() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingValueTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingValue(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingInterpretationCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingInterpretationCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingInterpretationCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingGroupIdentifier() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingGroupIdentifierTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingGroupIdentifier(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociationTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociation(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingMicrobiologySpecimenResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociationTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_SPECIMEN_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociation(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingMicrobiologySpecimenResultSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingNonPerformanceReason() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingNonPerformanceReasonTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingNonPerformanceReason(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingSpecimenInformation() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingSpecimenInformationTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingSpecimenInformation(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociation() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociationTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDING_MICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociation(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingMicrobiologyResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATIONMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATIONMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATIONMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValueTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATIONMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValue(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationmicrobiologySpecimenFindingCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategoryTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_CATEGORY_ASSOCIATION_MICROBIOLOGY_SPECIMEN_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategory(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingCategoryAssociationMicrobiologySpecimenFindingCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATIONMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATIONMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATIONMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValueTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATIONMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValue(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationmicrobiologySpecimenFindingSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategoryTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY_ASSOCIATION_MICROBIOLOGY_SPECIMEN_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategory(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologySpecimenFindingSubCategoryAssociationMicrobiologySpecimenFindingSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATIONMICROBIOLOGY_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATIONMICROBIOLOGY_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATIONMICROBIOLOGY_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValueTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATIONMICROBIOLOGY_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValue(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationmicrobiologyResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCode(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory() {
      OperationsTestCase<MicrobiologySpecimenFinding> validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategoryTestCase = new OperationsTestCase<MicrobiologySpecimenFinding>(
      "validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SPECIMEN_FINDINGMICROBIOLOGY_RESULT_CATEGORY_ASSOCIATION_MICROBIOLOGY_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySpecimenFinding target) {

      }

      @Override
      protected void updateToPass(MicrobiologySpecimenFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySpecimenFindingOperations.validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategory(
          (MicrobiologySpecimenFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySpecimenFindingmicrobiologyResultCategoryAssociationMicrobiologyResultCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


MicrobiologySpecimenFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


MicrobiologySpecimenFinding target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


MicrobiologySpecimenFinding target = objectFactory.create();
target.getSpecimenInformation();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends MicrobiologySpecimenFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MicrobiologySpecimenFinding> {
		public MicrobiologySpecimenFinding create() {		
			return SdtmFactory.eINSTANCE.createMicrobiologySpecimenFinding();
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
	private static class ConstructorTestClass extends MicrobiologySpecimenFindingOperations {};
	
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
	
	

	
	
} // MicrobiologySpecimenFindingOperations