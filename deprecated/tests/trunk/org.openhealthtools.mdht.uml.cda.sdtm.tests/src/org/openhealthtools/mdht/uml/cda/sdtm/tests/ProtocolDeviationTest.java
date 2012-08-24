
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
import org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ProtocolDeviationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Deviation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationProtocolDeviationCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Protocol Deviation Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationProtocolDeviationSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Protocol Deviation Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviation Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Associationprotocol Deviation Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Associationprotocol Deviation Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Associationprotocol Deviation Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Associationprotocol Deviation Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Category Association Protocol Deviation Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Associationprotocol Deviation Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Associationprotocol Deviation Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Associationprotocol Deviation Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Associationprotocol Deviation Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#validateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Deviationprotocol Deviation Sub Category Association Protocol Deviation Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ProtocolDeviation#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ProtocolDeviationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationTemplateId() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationTemplateIdTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationTemplateId(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationClassCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationClassCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationClassCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationEffectiveTime() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationEffectiveTimeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationEffectiveTime(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationId() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationIdTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationId",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationId(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationMoodCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationMoodCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationMoodCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationValue() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationValueTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationValue",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationValue(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationProtocolDeviationCategoryAssociation() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationProtocolDeviationCategoryAssociationTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationProtocolDeviationCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationProtocolDeviationCategoryAssociation(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationProtocolDeviationCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationProtocolDeviationSubCategoryAssociation() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationProtocolDeviationSubCategoryAssociationTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationProtocolDeviationSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_PROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationProtocolDeviationSubCategoryAssociation(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationProtocolDeviationSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationStudyEpoch() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationStudyEpochTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationStudyEpoch",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATION_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationStudyEpoch(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationStudyEpochTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATIONPROTOCOL_DEVIATION_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATIONPROTOCOL_DEVIATION_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATIONPROTOCOL_DEVIATION_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValueTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATIONPROTOCOL_DEVIATION_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValue(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationCategoryAssociationprotocolDeviationCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategoryTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_CATEGORY_ASSOCIATION_PROTOCOL_DEVIATION_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategory(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationCategoryAssociationProtocolDeviationCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValueTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValue(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationSubCategoryAssociationprotocolDeviationSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCode(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory() {
      OperationsTestCase<ProtocolDeviation> validateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategoryTestCase = new OperationsTestCase<ProtocolDeviation>(
      "validateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_DEVIATIONPROTOCOL_DEVIATION_SUB_CATEGORY_ASSOCIATION_PROTOCOL_DEVIATION_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ProtocolDeviation target) {

      }

      @Override
      protected void updateToPass(ProtocolDeviation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ProtocolDeviationOperations.validateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategory(
          (ProtocolDeviation) objectToTest, diagnostician, map);
      }

    };

    validateProtocolDeviationprotocolDeviationSubCategoryAssociationProtocolDeviationSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyEpoch() {


ProtocolDeviation target = objectFactory.create();
target.getStudyEpoch();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ProtocolDeviationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProtocolDeviation> {
		public ProtocolDeviation create() {		
			return SdtmFactory.eINSTANCE.createProtocolDeviation();
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
	private static class ConstructorTestClass extends ProtocolDeviationOperations {};
	
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
	
	

	
	
} // ProtocolDeviationOperations