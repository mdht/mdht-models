
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
import org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ECGTestResultOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ECG Test Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEcgTestResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultEcgTestResultSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Ecg Test Result Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultAssociatedPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultLeadLocationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Lead Location Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultAssociatedConsciousness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Associated Consciousness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Result Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Associationecg Test Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Category Association Ecg Test Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Associationecg Test Result Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultecg Test Result Sub Category Association Ecg Test Result Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionpositionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionpositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionpositionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionpositionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Positionposition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedPositionPosition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Position Position</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationecgLeadLocationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Associationecg Lead Location Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultleadLocationAssociationEcgLeadLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultlead Location Association Ecg Lead Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessconsciousnessStateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousnessconsciousness State Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousness Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#validateECGTestResultassociatedConsciousnessConsciousnessState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate ECG Test Resultassociated Consciousness Consciousness State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ECGTestResult#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ECGTestResultTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultTemplateId() {
      OperationsTestCase<ECGTestResult> validateECGTestResultTemplateIdTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultTemplateId(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultClassCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultClassCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultClassCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultEffectiveTime() {
      OperationsTestCase<ECGTestResult> validateECGTestResultEffectiveTimeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultEffectiveTime(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultId() {
      OperationsTestCase<ECGTestResult> validateECGTestResultIdTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultId",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultId(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultValue() {
      OperationsTestCase<ECGTestResult> validateECGTestResultValueTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultValue",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultValue(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultMoodCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultMoodCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultMoodCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultStatusCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultStatusCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultStatusCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultMethodCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultMethodCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultMethodCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultMethodCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultMethodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultText() {
      OperationsTestCase<ECGTestResult> validateECGTestResultTextTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultText",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultText(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultInterpretationCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultInterpretationCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultInterpretationCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultGroupIdentifier() {
      OperationsTestCase<ECGTestResult> validateECGTestResultGroupIdentifierTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultGroupIdentifier(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultEcgTestResultCategoryAssociation() {
      OperationsTestCase<ECGTestResult> validateECGTestResultEcgTestResultCategoryAssociationTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultEcgTestResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultEcgTestResultCategoryAssociation(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultEcgTestResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultEcgTestResultSubCategoryAssociation() {
      OperationsTestCase<ECGTestResult> validateECGTestResultEcgTestResultSubCategoryAssociationTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultEcgTestResultSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_ECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultEcgTestResultSubCategoryAssociation(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultEcgTestResultSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultAssociatedPosition() {
      OperationsTestCase<ECGTestResult> validateECGTestResultAssociatedPositionTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultAssociatedPosition",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_ASSOCIATED_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultAssociatedPosition(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultAssociatedPositionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultNonPerformanceReason() {
      OperationsTestCase<ECGTestResult> validateECGTestResultNonPerformanceReasonTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultNonPerformanceReason(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultLeadLocationAssociation() {
      OperationsTestCase<ECGTestResult> validateECGTestResultLeadLocationAssociationTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultLeadLocationAssociation",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_LEAD_LOCATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultLeadLocationAssociation(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultLeadLocationAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultTimingReference() {
      OperationsTestCase<ECGTestResult> validateECGTestResultTimingReferenceTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultTimingReference(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultAssociatedConsciousness() {
      OperationsTestCase<ECGTestResult> validateECGTestResultAssociatedConsciousnessTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultAssociatedConsciousness",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_ASSOCIATED_CONSCIOUSNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultAssociatedConsciousness(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultAssociatedConsciousnessTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultPlannedStudyDay() {
      OperationsTestCase<ECGTestResult> validateECGTestResultPlannedStudyDayTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultPlannedStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultPlannedStudyDay(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultPlannedStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultStudyDayPeriod() {
      OperationsTestCase<ECGTestResult> validateECGTestResultStudyDayPeriodTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULT_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultStudyDayPeriod(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValueTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATIONECG_TEST_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValue(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultCategoryAssociationecgTestResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultCategoryAssociationTypeCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationTypeCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategoryTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategory(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultCategoryAssociationEcgTestResultCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValueTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATIONECG_TEST_RESULT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValue(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultSubCategoryAssociationecgTestResultSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultSubCategoryAssociationTypeCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationTypeCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory() {
      OperationsTestCase<ECGTestResult> validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategoryTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTECG_TEST_RESULT_SUB_CATEGORY_ASSOCIATION_ECG_TEST_RESULT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategory(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultecgTestResultSubCategoryAssociationEcgTestResultSubCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedPositionpositionClassCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedPositionpositionClassCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedPositionpositionClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedPositionpositionClassCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedPositionpositionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedPositionpositionCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedPositionpositionCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedPositionpositionCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedPositionpositionCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedPositionpositionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedPositionpositionMoodCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedPositionpositionMoodCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedPositionpositionMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedPositionpositionMoodCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedPositionpositionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedPositionpositionValue() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedPositionpositionValueTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedPositionpositionValue",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITIONPOSITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedPositionpositionValue(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedPositionpositionValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedPositionTypeCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedPositionTypeCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedPositionTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedPositionTypeCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedPositionTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedPositionPosition() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedPositionPositionTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedPositionPosition",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_POSITION_POSITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedPositionPosition(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedPositionPositionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultleadLocationAssociationecgLeadLocationClassCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultleadLocationAssociationecgLeadLocationClassCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultleadLocationAssociationecgLeadLocationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationClassCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultleadLocationAssociationecgLeadLocationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultleadLocationAssociationecgLeadLocationCodeP() {
      OperationsTestCase<ECGTestResult> validateECGTestResultleadLocationAssociationecgLeadLocationCodePTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultleadLocationAssociationecgLeadLocationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationCodeP(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultleadLocationAssociationecgLeadLocationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultleadLocationAssociationecgLeadLocationCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultleadLocationAssociationecgLeadLocationCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultleadLocationAssociationecgLeadLocationCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultleadLocationAssociationecgLeadLocationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultleadLocationAssociationecgLeadLocationMoodCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultleadLocationAssociationecgLeadLocationMoodCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationMoodCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultleadLocationAssociationecgLeadLocationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultleadLocationAssociationecgLeadLocationValue() {
      OperationsTestCase<ECGTestResult> validateECGTestResultleadLocationAssociationecgLeadLocationValueTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultleadLocationAssociationecgLeadLocationValue",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATIONECG_LEAD_LOCATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultleadLocationAssociationecgLeadLocationValue(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultleadLocationAssociationecgLeadLocationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultleadLocationAssociationTypeCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultleadLocationAssociationTypeCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultleadLocationAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultleadLocationAssociationTypeCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultleadLocationAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultleadLocationAssociationEcgLeadLocation() {
      OperationsTestCase<ECGTestResult> validateECGTestResultleadLocationAssociationEcgLeadLocationTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultleadLocationAssociationEcgLeadLocation",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTLEAD_LOCATION_ASSOCIATION_ECG_LEAD_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultleadLocationAssociationEcgLeadLocation(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultleadLocationAssociationEcgLeadLocationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedConsciousnessconsciousnessStateClassCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedConsciousnessconsciousnessStateClassCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateClassCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedConsciousnessconsciousnessStateClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedConsciousnessconsciousnessStateCodeP() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedConsciousnessconsciousnessStateCodePTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateCodeP(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedConsciousnessconsciousnessStateCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedConsciousnessconsciousnessStateCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedConsciousnessconsciousnessStateCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedConsciousnessconsciousnessStateCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedConsciousnessconsciousnessStateCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedConsciousnessconsciousnessStateMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedConsciousnessconsciousnessStateValue() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedConsciousnessconsciousnessStateValueTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedConsciousnessconsciousnessStateValue",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESSCONSCIOUSNESS_STATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessconsciousnessStateValue(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedConsciousnessconsciousnessStateValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedConsciousnessTypeCode() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedConsciousnessTypeCodeTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedConsciousnessTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessTypeCode(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedConsciousnessTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateECGTestResultassociatedConsciousnessConsciousnessState() {
      OperationsTestCase<ECGTestResult> validateECGTestResultassociatedConsciousnessConsciousnessStateTestCase = new OperationsTestCase<ECGTestResult>(
      "validateECGTestResultassociatedConsciousnessConsciousnessState",
      operationsForOCL.getOCLValue("VALIDATE_ECG_TEST_RESULTASSOCIATED_CONSCIOUSNESS_CONSCIOUSNESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ECGTestResult target) {

      }

      @Override
      protected void updateToPass(ECGTestResult target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ECGTestResultOperations.validateECGTestResultassociatedConsciousnessConsciousnessState(
          (ECGTestResult) objectToTest, diagnostician, map);
      }

    };

    validateECGTestResultassociatedConsciousnessConsciousnessStateTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


ECGTestResult target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


ECGTestResult target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


ECGTestResult target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlannedStudyDay() {


ECGTestResult target = objectFactory.create();
target.getPlannedStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


ECGTestResult target = objectFactory.create();
target.getStudyDayPeriod();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ECGTestResultOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ECGTestResult> {
		public ECGTestResult create() {		
			return SdtmFactory.eINSTANCE.createECGTestResult();
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
	private static class ConstructorTestClass extends ECGTestResultOperations {};
	
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
	
	

	
	
} // ECGTestResultOperations