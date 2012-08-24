
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
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SpecimenInformationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Specimen Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationParticipatingSpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Participating Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationPortionAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Portion Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationUsabilityAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Usability Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationConditionAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Information Condition Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimenspecimen Entity Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimen Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimenrole Of Specimen Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationparticipating Specimen Role Of Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationportionOrTotalityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Associationportion Or Totality Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationportionAssociationSpecimenCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationportion Association Specimen Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Associationspecimen Usability Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationusabilityAssociationSpecimenUsability(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationusability Association Specimen Usability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationspecimenConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Associationspecimen Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#validateSpecimenInformationconditionAssociationSpecimenCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Specimen Informationcondition Association Specimen Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation#getTimingReference() <em>Get Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SpecimenInformationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationTemplateId() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationTemplateIdTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationTemplateId(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationClassCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationClassCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationClassCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationEffectiveTime() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationEffectiveTimeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationEffectiveTime(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationMoodCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationMoodCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationMoodCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationCodeP() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationCodePTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationCodeP(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationParticipatingSpecimen() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationParticipatingSpecimenTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationParticipatingSpecimen",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_PARTICIPATING_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationParticipatingSpecimen(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationParticipatingSpecimenTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationEventStudyDay() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationEventStudyDayTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationEventStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationEventStudyDay(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationEventStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationTimingReference() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationTimingReferenceTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationTimingReference(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationPortionAssociation() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationPortionAssociationTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationPortionAssociation",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_PORTION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationPortionAssociation(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationPortionAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationUsabilityAssociation() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationUsabilityAssociationTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationUsabilityAssociation",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_USABILITY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationUsabilityAssociation(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationUsabilityAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationConditionAssociation() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationConditionAssociationTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationConditionAssociation",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATION_CONDITION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationConditionAssociation(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationConditionAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMENSPECIMEN_ENTITY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationparticipatingSpecimenroleOfSpecimenspecimenEntityDeterminerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationparticipatingSpecimenroleOfSpecimenClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationparticipatingSpecimenroleOfSpecimenId() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationparticipatingSpecimenroleOfSpecimenIdTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMENROLE_OF_SPECIMEN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenroleOfSpecimenId(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationparticipatingSpecimenroleOfSpecimenIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationparticipatingSpecimenTemplateId() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationparticipatingSpecimenTemplateIdTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationparticipatingSpecimenTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenTemplateId(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationparticipatingSpecimenTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationparticipatingSpecimenTypeCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationparticipatingSpecimenTypeCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationparticipatingSpecimenTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenTypeCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationparticipatingSpecimenTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationparticipatingSpecimenRoleOfSpecimen() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationparticipatingSpecimenRoleOfSpecimenTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPARTICIPATING_SPECIMEN_ROLE_OF_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationparticipatingSpecimenRoleOfSpecimen(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationparticipatingSpecimenRoleOfSpecimenTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationportionAssociationportionOrTotalityCodeP() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationportionAssociationportionOrTotalityCodePTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationportionAssociationportionOrTotalityCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityCodeP(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationportionAssociationportionOrTotalityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationportionAssociationportionOrTotalityCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationportionAssociationportionOrTotalityCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationportionAssociationportionOrTotalityCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationportionAssociationportionOrTotalityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationportionAssociationportionOrTotalityMoodCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationportionAssociationportionOrTotalityMoodCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationportionAssociationportionOrTotalityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityMoodCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationportionAssociationportionOrTotalityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateSpecimenInformationportionAssociationportionOrTotalityValue() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationportionAssociationportionOrTotalityValueTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationportionAssociationportionOrTotalityValue",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATIONPORTION_OR_TOTALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationportionAssociationportionOrTotalityValue(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationportionAssociationportionOrTotalityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationportionAssociationTypeCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationportionAssociationTypeCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationportionAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationportionAssociationTypeCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationportionAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationportionAssociationSpecimenCondition() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationportionAssociationSpecimenConditionTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationportionAssociationSpecimenCondition",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONPORTION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationportionAssociationSpecimenCondition(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationportionAssociationSpecimenConditionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationusabilityAssociationspecimenUsabilityCodePTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeP(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationusabilityAssociationspecimenUsabilityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationusabilityAssociationspecimenUsabilityCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationusabilityAssociationspecimenUsabilityCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationspecimenUsabilityCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationusabilityAssociationspecimenUsabilityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationusabilityAssociationspecimenUsabilityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateSpecimenInformationusabilityAssociationspecimenUsabilityValue() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationusabilityAssociationspecimenUsabilityValueTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationusabilityAssociationspecimenUsabilityValue",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATIONSPECIMEN_USABILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
     
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationspecimenUsabilityValue(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationusabilityAssociationspecimenUsabilityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationusabilityAssociationTypeCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationusabilityAssociationTypeCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationusabilityAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationTypeCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationusabilityAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationusabilityAssociationSpecimenUsability() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationusabilityAssociationSpecimenUsabilityTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationusabilityAssociationSpecimenUsability",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONUSABILITY_ASSOCIATION_SPECIMEN_USABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationusabilityAssociationSpecimenUsability(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationusabilityAssociationSpecimenUsabilityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationconditionAssociationspecimenConditionCodeP() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationconditionAssociationspecimenConditionCodePTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationconditionAssociationspecimenConditionCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionCodeP(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationconditionAssociationspecimenConditionCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationconditionAssociationspecimenConditionCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationconditionAssociationspecimenConditionCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationconditionAssociationspecimenConditionCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationconditionAssociationspecimenConditionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationconditionAssociationspecimenConditionMoodCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationconditionAssociationspecimenConditionMoodCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationconditionAssociationspecimenConditionMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionMoodCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationconditionAssociationspecimenConditionMoodCodeTestCase.doValidationTest();
}		




/**
* 
* @generated not
*/
@Test

 
									
public void testValidateSpecimenInformationconditionAssociationspecimenConditionValue() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationconditionAssociationspecimenConditionValueTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationconditionAssociationspecimenConditionValue",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATIONSPECIMEN_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationspecimenConditionValue(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationconditionAssociationspecimenConditionValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationconditionAssociationTypeCode() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationconditionAssociationTypeCodeTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationconditionAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationTypeCode(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationconditionAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSpecimenInformationconditionAssociationSpecimenCondition() {
      OperationsTestCase<SpecimenInformation> validateSpecimenInformationconditionAssociationSpecimenConditionTestCase = new OperationsTestCase<SpecimenInformation>(
      "validateSpecimenInformationconditionAssociationSpecimenCondition",
      operationsForOCL.getOCLValue("VALIDATE_SPECIMEN_INFORMATIONCONDITION_ASSOCIATION_SPECIMEN_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SpecimenInformation target) {

      }

      @Override
      protected void updateToPass(SpecimenInformation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SpecimenInformationOperations.validateSpecimenInformationconditionAssociationSpecimenCondition(
          (SpecimenInformation) objectToTest, diagnostician, map);
      }

    };

    validateSpecimenInformationconditionAssociationSpecimenConditionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetEventStudyDay() {


SpecimenInformation target = objectFactory.create();
target.getEventStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


SpecimenInformation target = objectFactory.create();
target.getTimingReference();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends SpecimenInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SpecimenInformation> {
		public SpecimenInformation create() {		
			return SdtmFactory.eINSTANCE.createSpecimenInformation();
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
	private static class ConstructorTestClass extends SpecimenInformationOperations {};
	
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
	
	

	
	
} // SpecimenInformationOperations