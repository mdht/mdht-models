
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
import org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MacroscopicFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Macroscopic Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingEventSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#validateMacroscopicFindingDeathRelationshipAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Macroscopic Finding Death Relationship Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getEventSeverity() <em>Get Event Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MacroscopicFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MacroscopicFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingTemplateId() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingTemplateIdTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingTemplateId(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingClassCode() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingClassCodeTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingClassCode",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingClassCode(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingCode() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingCodeTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingCode(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingId() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingIdTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingId",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingId(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingMoodCode() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingMoodCodeTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingMoodCode(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingValue() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingValueTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingValue(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingStatusCode() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingStatusCodeTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingStatusCode(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingMassIdentification() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingMassIdentificationTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingMassIdentification",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingMassIdentification(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingMassIdentificationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingGroupIdentifier() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingGroupIdentifierTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingGroupIdentifier(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingSpecimenInformation() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingSpecimenInformationTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingSpecimenInformation(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingBodySystemorOrganClass() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingBodySystemorOrganClassTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingBodySystemorOrganClass",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingBodySystemorOrganClass(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingBodySystemorOrganClassTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingNonPerformanceReason() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingNonPerformanceReasonTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingNonPerformanceReason(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingEventSeverity() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingEventSeverityTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingEventSeverity",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_EVENT_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingEventSeverity(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingEventSeverityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingEntryRelationship() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingEntryRelationshipTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingEntryRelationship",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingEntryRelationship(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingEntryRelationshipTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingDataCollection() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingDataCollectionTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingDataCollection(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMacroscopicFindingDeathRelationshipAssociation() {
      OperationsTestCase<MacroscopicFinding> validateMacroscopicFindingDeathRelationshipAssociationTestCase = new OperationsTestCase<MacroscopicFinding>(
      "validateMacroscopicFindingDeathRelationshipAssociation",
      operationsForOCL.getOCLValue("VALIDATE_MACROSCOPIC_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MacroscopicFinding target) {

      }

      @Override
      protected void updateToPass(MacroscopicFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MacroscopicFindingOperations.validateMacroscopicFindingDeathRelationshipAssociation(
          (MacroscopicFinding) objectToTest, diagnostician, map);
      }

    };

    validateMacroscopicFindingDeathRelationshipAssociationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


MacroscopicFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


MacroscopicFinding target = objectFactory.create();
target.getSpecimenInformation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodySystemorOrganClass() {


MacroscopicFinding target = objectFactory.create();
target.getBodySystemorOrganClass();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


MacroscopicFinding target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetEventSeverity() {


MacroscopicFinding target = objectFactory.create();
target.getEventSeverity();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


MacroscopicFinding target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends MacroscopicFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MacroscopicFinding> {
		public MacroscopicFinding create() {		
			return SdtmFactory.eINSTANCE.createMacroscopicFinding();
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
	private static class ConstructorTestClass extends MacroscopicFindingOperations {};
	
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
	
	

	
	
} // MacroscopicFindingOperations