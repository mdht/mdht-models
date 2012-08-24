
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
import org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ClinicalEventOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventClinicalEventCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Clinical Event Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventClinicalEventSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Clinical Event Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventPreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventActivityStartTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventActivityEndTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Event Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Associationclinical Event Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Associationclinical Event Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Associationclinical Event Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Associationclinical Event Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventCategoryAssociationClinicalEventCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Category Association Clinical Event Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Associationclinical Event Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Associationclinical Event Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Associationclinical Event Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Associationclinical Event Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#validateClinicalEventclinicalEventSubCategoryAssociationClinicalEventSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Eventclinical Event Sub Category Association Clinical Event Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getActivityStartTimingReference() <em>Get Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ClinicalEvent#getActivityEndTimingReference() <em>Get Activity End Timing Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ClinicalEventTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventTemplateId() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventTemplateIdTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventTemplateId(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventClassCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventClassCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventClassCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventEffectiveTime() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventEffectiveTimeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventEffectiveTime(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventId() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventIdTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventId",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventId(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventMoodCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventMoodCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventMoodCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventStatusCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventStatusCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventStatusCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventValue() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventValueTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventValue",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventValue(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventClinicalEventCategoryAssociation() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventClinicalEventCategoryAssociationTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventClinicalEventCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventClinicalEventCategoryAssociation(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventClinicalEventCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventClinicalEventSubCategoryAssociation() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventClinicalEventSubCategoryAssociationTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventClinicalEventSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_CLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventClinicalEventSubCategoryAssociation(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventClinicalEventSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventPreSpecifiedEvent() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventPreSpecifiedEventTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventPreSpecifiedEvent",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventPreSpecifiedEvent(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventPreSpecifiedEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventNonPerformanceReason() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventNonPerformanceReasonTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventNonPerformanceReason(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventBodySystemorOrganClass() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventBodySystemorOrganClassTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventBodySystemorOrganClass",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventBodySystemorOrganClass(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventBodySystemorOrganClassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventDataCollection() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventDataCollectionTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventDataCollection(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventEventSeverity() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventEventSeverityTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventEventSeverity",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventEventSeverity(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventEventSeverityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventActivityStartTimingReference() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventActivityStartTimingReferenceTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventActivityStartTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventActivityStartTimingReference(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventActivityStartTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventActivityEndTimingReference() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventActivityEndTimingReferenceTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventActivityEndTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENT_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventActivityEndTimingReference(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventActivityEndTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryClassCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryClassCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATIONCLINICAL_EVENT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryClassCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATIONCLINICAL_EVENT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryMoodCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryMoodCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATIONCLINICAL_EVENT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryMoodCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryValue() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryValueTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATIONCLINICAL_EVENT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryValue(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventCategoryAssociationclinicalEventCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventCategoryAssociationTypeCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventCategoryAssociationTypeCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventCategoryAssociationClinicalEventCategory() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventCategoryAssociationClinicalEventCategoryTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventCategoryAssociationClinicalEventCategory",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_CATEGORY_ASSOCIATION_CLINICAL_EVENT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventCategoryAssociationClinicalEventCategory(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventCategoryAssociationClinicalEventCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryClassCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryClassCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATIONCLINICAL_EVENT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryClassCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATIONCLINICAL_EVENT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryMoodCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryMoodCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATIONCLINICAL_EVENT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryMoodCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryValue() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryValueTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATIONCLINICAL_EVENT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryValue(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventSubCategoryAssociationclinicalEventSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventSubCategoryAssociationTypeCode() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventSubCategoryAssociationTypeCode(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateClinicalEventclinicalEventSubCategoryAssociationClinicalEventSubCategory() {
      OperationsTestCase<ClinicalEvent> validateClinicalEventclinicalEventSubCategoryAssociationClinicalEventSubCategoryTestCase = new OperationsTestCase<ClinicalEvent>(
      "validateClinicalEventclinicalEventSubCategoryAssociationClinicalEventSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_CLINICAL_EVENTCLINICAL_EVENT_SUB_CATEGORY_ASSOCIATION_CLINICAL_EVENT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ClinicalEvent target) {

      }

      @Override
      protected void updateToPass(ClinicalEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ClinicalEventOperations.validateClinicalEventclinicalEventSubCategoryAssociationClinicalEventSubCategory(
          (ClinicalEvent) objectToTest, diagnostician, map);
      }

    };

    validateClinicalEventclinicalEventSubCategoryAssociationClinicalEventSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPreSpecifiedEvent() {


ClinicalEvent target = objectFactory.create();
target.getPreSpecifiedEvent();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


ClinicalEvent target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodySystemorOrganClass() {


ClinicalEvent target = objectFactory.create();
target.getBodySystemorOrganClass();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


ClinicalEvent target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetEventSeverity() {


ClinicalEvent target = objectFactory.create();
target.getEventSeverity();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetActivityStartTimingReference() {


ClinicalEvent target = objectFactory.create();
target.getActivityStartTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetActivityEndTimingReference() {


ClinicalEvent target = objectFactory.create();
target.getActivityEndTimingReference();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ClinicalEventOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ClinicalEvent> {
		public ClinicalEvent create() {		
			return SdtmFactory.eINSTANCE.createClinicalEvent();
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
	private static class ConstructorTestClass extends ClinicalEventOperations {};
	
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
	
	

	
	
} // ClinicalEventOperations