
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
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PharmacokineticParameterFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pharmacokinetic Parameter Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Pharmacokinetics Parameter Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Pharmacokinetics Parameter Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Finding Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Associationpharmacokinetics Parameter Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Associationpharmacokinetics Parameter Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Associationpharmacokinetics Parameter Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Associationpharmacokinetics Parameter Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Category Association Pharmacokinetics Parameter Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Associationpharmacokinetics Parameter Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Associationpharmacokinetics Parameter Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Associationpharmacokinetics Parameter Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Associationpharmacokinetics Parameter Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Parameter Findingpharmacokinetics Parameter Sub Category Association Pharmacokinetics Parameter Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticParameterFinding#getTimingReference() <em>Get Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PharmacokineticParameterFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingTemplateId() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingTemplateIdTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingTemplateId(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingClassCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingClassCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingClassCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingId() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingIdTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingId",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingId(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingMoodCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingMoodCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingMoodCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingStatusCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingStatusCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingStatusCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingValue() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingValueTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingValue(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingGroupIdentifier() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingGroupIdentifierTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingGroupIdentifier(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingSpecimenInformation() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingSpecimenInformationTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingSpecimenInformation(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociationTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociation(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingPharmacokineticsParameterCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociationTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociation(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingPharmacokineticsParameterSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingNonPerformanceReason() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingNonPerformanceReasonTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingNonPerformanceReason(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingTimingReference() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingTimingReferenceTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDING_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingTimingReference(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATIONPHARMACOKINETICS_PARAMETER_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATIONPHARMACOKINETICS_PARAMETER_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATIONPHARMACOKINETICS_PARAMETER_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValueTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATIONPHARMACOKINETICS_PARAMETER_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValue(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationpharmacokineticsParameterCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategory() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategoryTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategory",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_CATEGORY_ASSOCIATION_PHARMACOKINETICS_PARAMETER_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategory(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterCategoryAssociationPharmacokineticsParameterCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValueTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATIONPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValue(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationpharmacokineticsParameterSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCode(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategory() {
      OperationsTestCase<PharmacokineticParameterFinding> validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategoryTestCase = new OperationsTestCase<PharmacokineticParameterFinding>(
      "validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_PHARMACOKINETIC_PARAMETER_FINDINGPHARMACOKINETICS_PARAMETER_SUB_CATEGORY_ASSOCIATION_PHARMACOKINETICS_PARAMETER_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PharmacokineticParameterFinding target) {

      }

      @Override
      protected void updateToPass(PharmacokineticParameterFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PharmacokineticParameterFindingOperations.validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategory(
          (PharmacokineticParameterFinding) objectToTest, diagnostician, map);
      }

    };

    validatePharmacokineticParameterFindingpharmacokineticsParameterSubCategoryAssociationPharmacokineticsParameterSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


PharmacokineticParameterFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


PharmacokineticParameterFinding target = objectFactory.create();
target.getSpecimenInformation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


PharmacokineticParameterFinding target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


PharmacokineticParameterFinding target = objectFactory.create();
target.getTimingReference();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends PharmacokineticParameterFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PharmacokineticParameterFinding> {
		public PharmacokineticParameterFinding create() {		
			return SdtmFactory.eINSTANCE.createPharmacokineticParameterFinding();
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
	private static class ConstructorTestClass extends PharmacokineticParameterFindingOperations {};
	
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
	
	

	
	
} // PharmacokineticParameterFindingOperations