
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
import org.openhealthtools.mdht.uml.cda.sdtm.Visit;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.VisitOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Visit</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitHumanClinicalAdverseEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Adverse Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitHumanClinicalVitalSign(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Human Clinical Vital Sign</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitConcommitantMedicationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Concommitant Medication Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitECGTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit ECG Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitInclusionorExclusionCriteriaNotMet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Inclusionor Exclusion Criteria Not Met</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitLaboratoryTestResult(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Laboratory Test Result</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPhysicalExamination(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitSubstanceUseAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Substance Use Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMicrobiologySpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitMicrobiologySusceptibility(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Microbiology Susceptibility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitPharmacokineticConcentrationFinding(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitDrugAccountability(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Drug Accountability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#validateVisitStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Visit Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getHumanClinicalAdverseEvents() <em>Get Human Clinical Adverse Events</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getHumanClinicalVitalSigns() <em>Get Human Clinical Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getECGTestResults() <em>Get ECG Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getInclusionorExclusionCriteriaNotMets() <em>Get Inclusionor Exclusion Criteria Not Mets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getLaboratoryTestResults() <em>Get Laboratory Test Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPhysicalExaminations() <em>Get Physical Examinations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getMicrobiologySpecimen() <em>Get Microbiology Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getMicrobiologySusceptibility() <em>Get Microbiology Susceptibility</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getPharmacokineticConcentrationFinding() <em>Get Pharmacokinetic Concentration Finding</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getFindingAbout() <em>Get Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getDrugAccountability() <em>Get Drug Accountability</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.Visit#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class VisitTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitTemplateId() {
      OperationsTestCase<Visit> validateVisitTemplateIdTestCase = new OperationsTestCase<Visit>(
      "validateVisitTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitTemplateId(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitClassCode() {
      OperationsTestCase<Visit> validateVisitClassCodeTestCase = new OperationsTestCase<Visit>(
      "validateVisitClassCode",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitClassCode(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitCode() {
      OperationsTestCase<Visit> validateVisitCodeTestCase = new OperationsTestCase<Visit>(
      "validateVisitCode",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitCode(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitEffectiveTime() {
      OperationsTestCase<Visit> validateVisitEffectiveTimeTestCase = new OperationsTestCase<Visit>(
      "validateVisitEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitEffectiveTime(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitMoodCode() {
      OperationsTestCase<Visit> validateVisitMoodCodeTestCase = new OperationsTestCase<Visit>(
      "validateVisitMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitMoodCode(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitText() {
      OperationsTestCase<Visit> validateVisitTextTestCase = new OperationsTestCase<Visit>(
      "validateVisitText",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitText(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitId() {
      OperationsTestCase<Visit> validateVisitIdTestCase = new OperationsTestCase<Visit>(
      "validateVisitId",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitId(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitHumanClinicalAdverseEvent() {
      OperationsTestCase<Visit> validateVisitHumanClinicalAdverseEventTestCase = new OperationsTestCase<Visit>(
      "validateVisitHumanClinicalAdverseEvent",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_HUMAN_CLINICAL_ADVERSE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitHumanClinicalAdverseEvent(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitHumanClinicalAdverseEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitHumanClinicalVitalSign() {
      OperationsTestCase<Visit> validateVisitHumanClinicalVitalSignTestCase = new OperationsTestCase<Visit>(
      "validateVisitHumanClinicalVitalSign",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_HUMAN_CLINICAL_VITAL_SIGN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitHumanClinicalVitalSign(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitHumanClinicalVitalSignTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitPlannedStudyDay() {
      OperationsTestCase<Visit> validateVisitPlannedStudyDayTestCase = new OperationsTestCase<Visit>(
      "validateVisitPlannedStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitPlannedStudyDay(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitPlannedStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitConcommitantMedicationAssociation() {
      OperationsTestCase<Visit> validateVisitConcommitantMedicationAssociationTestCase = new OperationsTestCase<Visit>(
      "validateVisitConcommitantMedicationAssociation",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_CONCOMMITANT_MEDICATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitConcommitantMedicationAssociation(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitConcommitantMedicationAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitECGTestResult() {
      OperationsTestCase<Visit> validateVisitECGTestResultTestCase = new OperationsTestCase<Visit>(
      "validateVisitECGTestResult",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_ECG_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitECGTestResult(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitECGTestResultTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitInclusionorExclusionCriteriaNotMet() {
      OperationsTestCase<Visit> validateVisitInclusionorExclusionCriteriaNotMetTestCase = new OperationsTestCase<Visit>(
      "validateVisitInclusionorExclusionCriteriaNotMet",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitInclusionorExclusionCriteriaNotMet(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitInclusionorExclusionCriteriaNotMetTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitLaboratoryTestResult() {
      OperationsTestCase<Visit> validateVisitLaboratoryTestResultTestCase = new OperationsTestCase<Visit>(
      "validateVisitLaboratoryTestResult",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_LABORATORY_TEST_RESULT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitLaboratoryTestResult(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitLaboratoryTestResultTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitPhysicalExamination() {
      OperationsTestCase<Visit> validateVisitPhysicalExaminationTestCase = new OperationsTestCase<Visit>(
      "validateVisitPhysicalExamination",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitPhysicalExamination(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitPhysicalExaminationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitSubstanceUseAssociation() {
      OperationsTestCase<Visit> validateVisitSubstanceUseAssociationTestCase = new OperationsTestCase<Visit>(
      "validateVisitSubstanceUseAssociation",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_SUBSTANCE_USE_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitSubstanceUseAssociation(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitSubstanceUseAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitMicrobiologySpecimen() {
      OperationsTestCase<Visit> validateVisitMicrobiologySpecimenTestCase = new OperationsTestCase<Visit>(
      "validateVisitMicrobiologySpecimen",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_MICROBIOLOGY_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitMicrobiologySpecimen(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitMicrobiologySpecimenTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitMicrobiologySusceptibility() {
      OperationsTestCase<Visit> validateVisitMicrobiologySusceptibilityTestCase = new OperationsTestCase<Visit>(
      "validateVisitMicrobiologySusceptibility",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_MICROBIOLOGY_SUSCEPTIBILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitMicrobiologySusceptibility(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitMicrobiologySusceptibilityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitPharmacokineticConcentrationFinding() {
      OperationsTestCase<Visit> validateVisitPharmacokineticConcentrationFindingTestCase = new OperationsTestCase<Visit>(
      "validateVisitPharmacokineticConcentrationFinding",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_PHARMACOKINETIC_CONCENTRATION_FINDING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitPharmacokineticConcentrationFinding(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitPharmacokineticConcentrationFindingTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitFindingAbout() {
      OperationsTestCase<Visit> validateVisitFindingAboutTestCase = new OperationsTestCase<Visit>(
      "validateVisitFindingAbout",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitFindingAbout(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitFindingAboutTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitDrugAccountability() {
      OperationsTestCase<Visit> validateVisitDrugAccountabilityTestCase = new OperationsTestCase<Visit>(
      "validateVisitDrugAccountability",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_DRUG_ACCOUNTABILITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitDrugAccountability(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitDrugAccountabilityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateVisitStudyDayPeriod() {
      OperationsTestCase<Visit> validateVisitStudyDayPeriodTestCase = new OperationsTestCase<Visit>(
      "validateVisitStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_VISIT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(Visit target) {

      }

      @Override
      protected void updateToPass(Visit target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return VisitOperations.validateVisitStudyDayPeriod(
          (Visit) objectToTest, diagnostician, map);
      }

    };

    validateVisitStudyDayPeriodTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetHumanClinicalAdverseEvents() {


Visit target = objectFactory.create();
target.getHumanClinicalAdverseEvents();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHumanClinicalVitalSigns() {


Visit target = objectFactory.create();
target.getHumanClinicalVitalSigns();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlannedStudyDay() {


Visit target = objectFactory.create();
target.getPlannedStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetECGTestResults() {


Visit target = objectFactory.create();
target.getECGTestResults();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetInclusionorExclusionCriteriaNotMets() {


Visit target = objectFactory.create();
target.getInclusionorExclusionCriteriaNotMets();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetLaboratoryTestResults() {


Visit target = objectFactory.create();
target.getLaboratoryTestResults();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPhysicalExaminations() {


Visit target = objectFactory.create();
target.getPhysicalExaminations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMicrobiologySpecimen() {


Visit target = objectFactory.create();
target.getMicrobiologySpecimen();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMicrobiologySusceptibility() {


Visit target = objectFactory.create();
target.getMicrobiologySusceptibility();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPharmacokineticConcentrationFinding() {


Visit target = objectFactory.create();
target.getPharmacokineticConcentrationFinding();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetFindingAbout() {


Visit target = objectFactory.create();
target.getFindingAbout();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDrugAccountability() {


Visit target = objectFactory.create();
target.getDrugAccountability();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


Visit target = objectFactory.create();
target.getStudyDayPeriod();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends VisitOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Visit> {
		public Visit create() {		
			return SdtmFactory.eINSTANCE.createVisit();
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
	private static class ConstructorTestClass extends VisitOperations {};
	
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
	
	

	
	
} // VisitOperations