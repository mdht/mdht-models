
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
import org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MicroscopicFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Microscopic Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Microscopic Finding Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingDeathRelationshipAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Death Relationship Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Associationmicroscopic Finding Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microscopic Findingmicroscopic Finding Result Category Association Microscopic Finding Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicroscopicFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MicroscopicFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingTemplateId() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingTemplateIdTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingTemplateId(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingClassCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingClassCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingClassCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingId() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingIdTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingId",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingId(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingMoodCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingMoodCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingMoodCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingValue() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingValueTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingValue(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingStatusCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingStatusCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingStatusCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingMethodCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingMethodCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingMethodCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingMicroscopicFindingResultCategoryAssociation() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingMicroscopicFindingResultCategoryAssociationTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_MICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingMicroscopicFindingResultCategoryAssociation(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingMicroscopicFindingResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingNonPerformanceReason() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingNonPerformanceReasonTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingNonPerformanceReason(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingSpecimenInformation() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingSpecimenInformationTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingSpecimenInformation(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingEventSeverity() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingEventSeverityTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingEventSeverity",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingEventSeverity(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingEventSeverityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingDeathRelationshipAssociation() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingDeathRelationshipAssociationTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingDeathRelationshipAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingDeathRelationshipAssociation(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingDeathRelationshipAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingDataCollection() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingDataCollectionTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingDataCollection(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingGroupIdentifier() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingGroupIdentifierTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingGroupIdentifier(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingMassIdentification() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingMassIdentificationTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingMassIdentification",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingMassIdentification(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingMassIdentificationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingBodySystemorOrganClass() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingBodySystemorOrganClassTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingBodySystemorOrganClass",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingBodySystemorOrganClass(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingBodySystemorOrganClassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodePTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeP(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValueTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATIONMICROSCOPIC_FINDING_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValue(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationmicroscopicFindingResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCode(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory() {
      OperationsTestCase<MicroscopicFinding> validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategoryTestCase = new OperationsTestCase<MicroscopicFinding>(
      "validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_MICROSCOPIC_FINDINGMICROSCOPIC_FINDING_RESULT_CATEGORY_ASSOCIATION_MICROSCOPIC_FINDING_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MicroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MicroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MicroscopicFindingOperations.validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategory(
          (MicroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMicroscopicFindingmicroscopicFindingResultCategoryAssociationMicroscopicFindingResultCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


MicroscopicFinding target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


MicroscopicFinding target = objectFactory.create();
target.getSpecimenInformation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetEventSeverity() {


MicroscopicFinding target = objectFactory.create();
target.getEventSeverity();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


MicroscopicFinding target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


MicroscopicFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodySystemorOrganClass() {


MicroscopicFinding target = objectFactory.create();
target.getBodySystemorOrganClass();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends MicroscopicFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MicroscopicFinding> {
		public MicroscopicFinding create() {		
			return SdtmFactory.eINSTANCE.createMicroscopicFinding();
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
	private static class ConstructorTestClass extends MicroscopicFindingOperations {};
	
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
	
	

	
	
} // MicroscopicFindingOperations