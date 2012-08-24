
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
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.HumanClinicalSubjectDemographicsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Subject Demographics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsStudyArm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Study Arm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getStudyArms() <em>Get Study Arms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HumanClinicalSubjectDemographicsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsTemplateId() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsTemplateIdTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsTemplateId(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsClassCode() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsClassCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsClassCode(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsCode() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsCode(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsCodeP() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsCodePTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsCodeP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsCodeP(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsMoodCode() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsMoodCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsMoodCode(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsEffectiveTime() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsEffectiveTimeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsEffectiveTime(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsAgeAssociation() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsAgeAssociationTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsAgeAssociation",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociation(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsAgeAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsDataCollection() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsDataCollectionTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsDataCollection(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsStudyArm() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsStudyArmTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsStudyArm",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsStudyArm(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsStudyArmTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsParticipant() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsParticipantTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsParticipant",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsParticipant(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsParticipantTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodePTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValueTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsAgeAssociationTypeCode() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsAgeAssociationTypeCodeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsAgeAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge() {
      OperationsTestCase<HumanClinicalSubjectDemographics> validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeTestCase = new OperationsTestCase<HumanClinicalSubjectDemographics>(
      "validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge",
      operationsForOCL.getOCLValue("VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HumanClinicalSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(HumanClinicalSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HumanClinicalSubjectDemographicsOperations.validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAge(
          (HumanClinicalSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


HumanClinicalSubjectDemographics target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyArms() {


HumanClinicalSubjectDemographics target = objectFactory.create();
target.getStudyArms();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends HumanClinicalSubjectDemographicsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HumanClinicalSubjectDemographics> {
		public HumanClinicalSubjectDemographics create() {		
			return SdtmFactory.eINSTANCE.createHumanClinicalSubjectDemographics();
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
	private static class ConstructorTestClass extends HumanClinicalSubjectDemographicsOperations {};
	
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
	
	

	
	
} // HumanClinicalSubjectDemographicsOperations