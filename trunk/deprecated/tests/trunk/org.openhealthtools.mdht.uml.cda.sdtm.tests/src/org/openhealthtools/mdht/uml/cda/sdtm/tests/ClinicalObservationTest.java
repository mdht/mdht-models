
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
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ClinicalObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationClinicalObservationCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationClinicalObservationSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationClinicalObservationResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Clinical Observation Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observation Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Associationclinical Observation Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Sub Category Association Clinical Observation Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Associationclinical Observation Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Observationclinical Observation Result Category Association Clinical Observation Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalObservation#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ClinicalObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationTemplateId() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationTemplateIdTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationTemplateId(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationClassCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationClassCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationClassCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationId() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationIdTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationId",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
      
        II ii  = DatatypesFactory.eINSTANCE.createII();
        target.getIds().add(ii);				
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationId(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationMoodCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationMoodCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationMoodCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationValue() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationValueTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationValue(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationStatusCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationStatusCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationStatusCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationTargetSiteCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationTargetSiteCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationTargetSiteCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationInterpretationCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationInterpretationCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationInterpretationCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationGroupIdentifier() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationGroupIdentifierTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationGroupIdentifier(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationClinicalObservationCategoryAssociation() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationClinicalObservationCategoryAssociationTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationClinicalObservationCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationClinicalObservationCategoryAssociation(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationClinicalObservationCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationClinicalObservationSubCategoryAssociation() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationClinicalObservationSubCategoryAssociationTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationClinicalObservationSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationClinicalObservationSubCategoryAssociation(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationClinicalObservationSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationBodySystemorOrganClass() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationBodySystemorOrganClassTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationBodySystemorOrganClass",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationBodySystemorOrganClass(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationBodySystemorOrganClassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationNonPerformanceReason() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationNonPerformanceReasonTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationNonPerformanceReason(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationEventSeverity() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationEventSeverityTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationEventSeverity",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationEventSeverity(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationEventSeverityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationPlannedStudyDay() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationPlannedStudyDayTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationPlannedStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationPlannedStudyDay(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationPlannedStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationDataCollection() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationDataCollectionTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationDataCollection(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationTimingReference() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationTimingReferenceTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationTimingReference(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationClinicalObservationResultCategoryAssociation() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationClinicalObservationResultCategoryAssociationTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationClinicalObservationResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_CLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationClinicalObservationResultCategoryAssociation(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationClinicalObservationResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationMassIdentification() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationMassIdentificationTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationMassIdentification",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationMassIdentification(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationMassIdentificationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationExclusionReason() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationExclusionReasonTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationExclusionReason",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationExclusionReason(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationExclusionReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationCategoryAssociationTypeCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationCategoryAssociationTypeCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodePTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeP(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValueTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValue(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationSubCategoryAssociationclinicalObservationSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategoryTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_SUB_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategory(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationSubCategoryAssociationClinicalObservationSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValueTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValue(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationResultCategoryAssociationclinicalObservationResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCode(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory() {
      OperationsTestCase<ClinicalObservation> validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategoryTestCase = new OperationsTestCase<ClinicalObservation>(
      "validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OBSERVATIONCLINICAL_OBSERVATION_RESULT_CATEGORY_ASSOCIATION_CLINICAL_OBSERVATION_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalObservation target) {

      }

      @Override
      protected void updateToPass(ClinicalObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalObservationOperations.validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategory(
          (ClinicalObservation) objectToTest, diagnostician, map);
      }

    };

    validateClinicalObservationclinicalObservationResultCategoryAssociationClinicalObservationResultCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


ClinicalObservation target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodySystemorOrganClass() {


ClinicalObservation target = objectFactory.create();
target.getBodySystemorOrganClass();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


ClinicalObservation target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetEventSeverity() {


ClinicalObservation target = objectFactory.create();
target.getEventSeverity();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlannedStudyDay() {


ClinicalObservation target = objectFactory.create();
target.getPlannedStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


ClinicalObservation target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


ClinicalObservation target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetExclusionReason() {


ClinicalObservation target = objectFactory.create();
target.getExclusionReason();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ClinicalObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ClinicalObservation> {
		public ClinicalObservation create() {		
			return SdtmFactory.eINSTANCE.createClinicalObservation();
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
	private static class ConstructorTestClass extends ClinicalObservationOperations {};
	
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
	
	

	
	
} // ClinicalObservationOperations