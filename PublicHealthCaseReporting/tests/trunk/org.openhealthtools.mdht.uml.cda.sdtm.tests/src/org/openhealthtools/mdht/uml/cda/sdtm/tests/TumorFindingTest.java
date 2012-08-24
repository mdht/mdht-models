
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
import org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.TumorFindingOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tumor Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingMalignancyStatusAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Malignancy Status Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingDeathRelationshipAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Death Relationship Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingDetectionDelayAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Finding Detection Delay Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingmalignancyStatusAssociationmalignancyStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingmalignancy Status Associationmalignancy Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingmalignancyStatusAssociationmalignancyStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingmalignancy Status Associationmalignancy Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingmalignancyStatusAssociationmalignancyStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingmalignancy Status Associationmalignancy Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingmalignancyStatusAssociationmalignancyStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingmalignancy Status Associationmalignancy Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#validateTumorFindingmalignancyStatusAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tumor Findingmalignancy Status Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TumorFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TumorFindingTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingTemplateId() {
      OperationsTestCase<TumorFinding> validateTumorFindingTemplateIdTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingTemplateId(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingCode() {
      OperationsTestCase<TumorFinding> validateTumorFindingCodeTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingCode",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingCode(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingId() {
      OperationsTestCase<TumorFinding> validateTumorFindingIdTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingId",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingId(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingValue() {
      OperationsTestCase<TumorFinding> validateTumorFindingValueTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingValue",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingValue(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingStatusCode() {
      OperationsTestCase<TumorFinding> validateTumorFindingStatusCodeTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingStatusCode(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingMethodCode() {
      OperationsTestCase<TumorFinding> validateTumorFindingMethodCodeTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingMethodCode(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingGroupIdentifier() {
      OperationsTestCase<TumorFinding> validateTumorFindingGroupIdentifierTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingGroupIdentifier(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingSpecimenInformation() {
      OperationsTestCase<TumorFinding> validateTumorFindingSpecimenInformationTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingSpecimenInformation(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingMassIdentification() {
      OperationsTestCase<TumorFinding> validateTumorFindingMassIdentificationTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingMassIdentification",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingMassIdentification(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingMassIdentificationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingMalignancyStatusAssociation() {
      OperationsTestCase<TumorFinding> validateTumorFindingMalignancyStatusAssociationTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingMalignancyStatusAssociation",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_MALIGNANCY_STATUS_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingMalignancyStatusAssociation(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingMalignancyStatusAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingNonPerformanceReason() {
      OperationsTestCase<TumorFinding> validateTumorFindingNonPerformanceReasonTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingNonPerformanceReason(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingDeathRelationshipAssociation() {
      OperationsTestCase<TumorFinding> validateTumorFindingDeathRelationshipAssociationTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingDeathRelationshipAssociation",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_DEATH_RELATIONSHIP_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingDeathRelationshipAssociation(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingDeathRelationshipAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingDetectionDelayAssociation() {
      OperationsTestCase<TumorFinding> validateTumorFindingDetectionDelayAssociationTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingDetectionDelayAssociation",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDING_DETECTION_DELAY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingDetectionDelayAssociation(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingDetectionDelayAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingmalignancyStatusAssociationmalignancyStatusClassCode() {
      OperationsTestCase<TumorFinding> validateTumorFindingmalignancyStatusAssociationmalignancyStatusClassCodeTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingmalignancyStatusAssociationmalignancyStatusClassCode",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDINGMALIGNANCY_STATUS_ASSOCIATIONMALIGNANCY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationmalignancyStatusClassCode(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingmalignancyStatusAssociationmalignancyStatusClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingmalignancyStatusAssociationmalignancyStatusCode() {
      OperationsTestCase<TumorFinding> validateTumorFindingmalignancyStatusAssociationmalignancyStatusCodeTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingmalignancyStatusAssociationmalignancyStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDINGMALIGNANCY_STATUS_ASSOCIATIONMALIGNANCY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationmalignancyStatusCode(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingmalignancyStatusAssociationmalignancyStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingmalignancyStatusAssociationmalignancyStatusMoodCode() {
      OperationsTestCase<TumorFinding> validateTumorFindingmalignancyStatusAssociationmalignancyStatusMoodCodeTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingmalignancyStatusAssociationmalignancyStatusMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDINGMALIGNANCY_STATUS_ASSOCIATIONMALIGNANCY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationmalignancyStatusMoodCode(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingmalignancyStatusAssociationmalignancyStatusMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingmalignancyStatusAssociationmalignancyStatusValue() {
      OperationsTestCase<TumorFinding> validateTumorFindingmalignancyStatusAssociationmalignancyStatusValueTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingmalignancyStatusAssociationmalignancyStatusValue",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDINGMALIGNANCY_STATUS_ASSOCIATIONMALIGNANCY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationmalignancyStatusValue(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingmalignancyStatusAssociationmalignancyStatusValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTumorFindingmalignancyStatusAssociationTypeCode() {
      OperationsTestCase<TumorFinding> validateTumorFindingmalignancyStatusAssociationTypeCodeTestCase = new OperationsTestCase<TumorFinding>(
      "validateTumorFindingmalignancyStatusAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_TUMOR_FINDINGMALIGNANCY_STATUS_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TumorFinding target) {

      }

      @Override
      protected void updateToPass(TumorFinding target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TumorFindingOperations.validateTumorFindingmalignancyStatusAssociationTypeCode(
          (TumorFinding) objectToTest, diagnostician, map);
      }

    };

    validateTumorFindingmalignancyStatusAssociationTypeCodeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


TumorFinding target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


TumorFinding target = objectFactory.create();
target.getSpecimenInformation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


TumorFinding target = objectFactory.create();
target.getNonPerformanceReason();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends TumorFindingOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TumorFinding> {
		public TumorFinding create() {		
			return SdtmFactory.eINSTANCE.createTumorFinding();
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
	private static class ConstructorTestClass extends TumorFindingOperations {};
	
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
	
	

	
	
} // TumorFindingOperations