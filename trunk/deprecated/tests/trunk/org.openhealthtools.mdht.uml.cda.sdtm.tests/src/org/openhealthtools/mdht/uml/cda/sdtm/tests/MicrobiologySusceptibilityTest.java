
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
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicrobiologySusceptibilityOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Microbiology Susceptibility</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Microbiology Susceptibility Finding Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Microbiology Susceptibility Finding Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Associationmicrobiology Susceptibility Finding Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Associationmicrobiology Susceptibility Finding Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Associationmicrobiology Susceptibility Finding Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Associationmicrobiology Susceptibility Finding Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Category Association Microbiology Susceptibility Finding Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Associationmicrobiology Susceptibility Finding Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Associationmicrobiology Susceptibility Finding Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Associationmicrobiology Susceptibility Finding Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Associationmicrobiology Susceptibility Finding Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibilitymicrobiology Susceptibility Finding Sub Category Association Microbiology Susceptibility Finding Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MicrobiologySusceptibilityTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityTemplateId() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityTemplateIdTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityTemplateId(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityClassCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityClassCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityClassCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityId() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityIdTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityId",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityId(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityMethodCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityMethodCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMethodCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityMoodCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityMoodCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMoodCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityStatusCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityStatusCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityStatusCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityValue() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityValueTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityValue(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityEffectiveTime() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityEffectiveTimeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityEffectiveTime(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityInterpretationCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityInterpretationCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityInterpretationCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityEventStudyDay() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityEventStudyDayTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityEventStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityEventStudyDay(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityEventStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityTimingReference() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityTimingReferenceTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityTimingReference(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityGroupIdentifier() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityGroupIdentifierTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityGroupIdentifier(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociationTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociation(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociationTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociation(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityMicrobiologySusceptibilityFindingSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilityNonPerformanceReason() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilityNonPerformanceReasonTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilityNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilityNonPerformanceReason(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilityNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATIONMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATIONMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATIONMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValueTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATIONMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValue(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationmicrobiologySusceptibilityFindingCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategoryTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY_ASSOCIATION_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategory(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingCategoryAssociationMicrobiologySusceptibilityFindingCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATIONMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATIONMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATIONMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValueTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATIONMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValue(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationmicrobiologySusceptibilityFindingSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCode(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory() {
      OperationsTestCase<MicrobiologySusceptibility> validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategoryTestCase = new OperationsTestCase<MicrobiologySusceptibility>(
      "validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_MICROBIOLOGY_SUSCEPTIBILITYMICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY_ASSOCIATION_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicrobiologySusceptibility target) {

      }

      @Override
      protected void updateToPass(MicrobiologySusceptibility target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicrobiologySusceptibilityOperations.validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategory(
          (MicrobiologySusceptibility) objectToTest, diagnostician, map);
      }

    };

    validateMicrobiologySusceptibilitymicrobiologySusceptibilityFindingSubCategoryAssociationMicrobiologySusceptibilityFindingSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetEventStudyDay() {


MicrobiologySusceptibility target = objectFactory.create();
target.getEventStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


MicrobiologySusceptibility target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


MicrobiologySusceptibility target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


MicrobiologySusceptibility target = objectFactory.create();
target.getNonPerformanceReason();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends MicrobiologySusceptibilityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MicrobiologySusceptibility> {
		public MicrobiologySusceptibility create() {		
			return SdtmFactory.eINSTANCE.createMicrobiologySusceptibility();
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
	private static class ConstructorTestClass extends MicrobiologySusceptibilityOperations {};
	
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
	
	

	
	
} // MicrobiologySusceptibilityOperations