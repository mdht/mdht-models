
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
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.InclusionorExclusionCriteriaNotMetOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Inclusion Exclusion Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Inclusion Exclusion Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Associationinclusion Exclusion Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Category Association Inclusion Exclusion Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Associationinclusion Exclusion Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Metinclusion Exclusion Sub Category Association Inclusion Exclusion Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class InclusionorExclusionCriteriaNotMetTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetTemplateId() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetTemplateIdTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetTemplateId(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetClassCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetClassCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetClassCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetClassCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetCodeP() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetCodePTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetCodeP",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetCodeP(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetId() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetIdTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetId",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetId(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetMoodCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetMoodCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetMoodCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetValue() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetValueTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetValue",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetValue(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociationTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociation(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetInclusionExclusionCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociationTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_INCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociation(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetInclusionExclusionSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetDataCollection() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetDataCollectionTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetDataCollection(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValueTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValue(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationinclusionExclusionCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategoryTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategory(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionCategoryAssociationInclusionExclusionCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValueTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATIONINCLUSION_EXCLUSION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValue(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationinclusionExclusionSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCode(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory() {
      OperationsTestCase<InclusionorExclusionCriteriaNotMet> validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategoryTestCase = new OperationsTestCase<InclusionorExclusionCriteriaNotMet>(
      "validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_METINCLUSION_EXCLUSION_SUB_CATEGORY_ASSOCIATION_INCLUSION_EXCLUSION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(InclusionorExclusionCriteriaNotMet target) {

      }

      @Override
      protected void updateToPass(InclusionorExclusionCriteriaNotMet target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return InclusionorExclusionCriteriaNotMetOperations.validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategory(
          (InclusionorExclusionCriteriaNotMet) objectToTest, diagnostician, map);
      }

    };

    validateInclusionorExclusionCriteriaNotMetinclusionExclusionSubCategoryAssociationInclusionExclusionSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


InclusionorExclusionCriteriaNotMet target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends InclusionorExclusionCriteriaNotMetOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InclusionorExclusionCriteriaNotMet> {
		public InclusionorExclusionCriteriaNotMet create() {		
			return SdtmFactory.eINSTANCE.createInclusionorExclusionCriteriaNotMet();
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
	private static class ConstructorTestClass extends InclusionorExclusionCriteriaNotMetOperations {};
	
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
	
	

	
	
} // InclusionorExclusionCriteriaNotMetOperations