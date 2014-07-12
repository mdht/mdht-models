
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
import org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubjectElementOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Subject Element</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementStudyEpoch(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Study Epoch</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementElementOrderAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Element Element Order Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationElementOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Association Element Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Class Code Subject Elementelement Order Associationelement Order Class Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code PSubject Elementelement Order Associationelement Order Code P1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Code Subject Elementelement Order Associationelement Order Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Mood Code Subject Elementelement Order Associationelement Order Mood Code1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Subject Elementelement Order Associationelement Order Value Subject Elementelement Order Associationelement Order Value1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubjectElement#getStudyEpoch() <em>Get Study Epoch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SubjectElementTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementTemplateId() {
      OperationsTestCase<SubjectElement> validateSubjectElementTemplateIdTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementTemplateId(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementClassCode() {
      OperationsTestCase<SubjectElement> validateSubjectElementClassCodeTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementClassCode(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementCodeP() {
      OperationsTestCase<SubjectElement> validateSubjectElementCodePTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementCodeP(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementCode() {
      OperationsTestCase<SubjectElement> validateSubjectElementCodeTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementCode(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementEffectiveTime() {
      OperationsTestCase<SubjectElement> validateSubjectElementEffectiveTimeTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementEffectiveTime(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementId() {
      OperationsTestCase<SubjectElement> validateSubjectElementIdTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementId",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementId(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementMoodCode() {
      OperationsTestCase<SubjectElement> validateSubjectElementMoodCodeTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementMoodCode(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementStudyEpoch() {
      OperationsTestCase<SubjectElement> validateSubjectElementStudyEpochTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementStudyEpoch",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_STUDY_EPOCH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementStudyEpoch(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementStudyEpochTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementElementOrderAssociation() {
      OperationsTestCase<SubjectElement> validateSubjectElementElementOrderAssociationTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementElementOrderAssociation",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENT_ELEMENT_ORDER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementElementOrderAssociation(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementElementOrderAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderClassCode() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderClassCodeTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderClassCode(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderCodeP() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderCodePTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderCodeP(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderCode() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderCodeTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderCode(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderMoodCode() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderMoodCodeTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderMoodCode(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderValue() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderValueTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderValue",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderValue(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationTypeCode() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationTypeCodeTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationTypeCode(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationElementOrder() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationElementOrderTestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationElementOrder",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATION_ELEMENT_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationElementOrder(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationElementOrderTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1TestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CLASS_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderClassCodeSubjectElementelementOrderAssociationelementOrderClassCode1TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1TestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_PSUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_P1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderCodePSubjectElementelementOrderAssociationelementOrderCodeP1TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1TestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderCodeSubjectElementelementOrderAssociationelementOrderCode1TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1TestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_MOOD_CODE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderMoodCodeSubjectElementelementOrderAssociationelementOrderMoodCode1TestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1() {
      OperationsTestCase<SubjectElement> validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1TestCase = new OperationsTestCase<SubjectElement>(
      "validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1",
      operationsForOCL.getOCLValue("VALIDATE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE_SUBJECT_ELEMENTELEMENT_ORDER_ASSOCIATIONELEMENT_ORDER_VALUE1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubjectElement target) {

      }

      @Override
      protected void updateToPass(SubjectElement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubjectElementOperations.validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1(
          (SubjectElement) objectToTest, diagnostician, map);
      }

    };

    validateSubjectElementelementOrderAssociationelementOrderValueSubjectElementelementOrderAssociationelementOrderValue1TestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyEpoch() {


SubjectElement target = objectFactory.create();
target.getStudyEpoch();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends SubjectElementOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubjectElement> {
		public SubjectElement create() {		
			return SdtmFactory.eINSTANCE.createSubjectElement();
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
	private static class ConstructorTestClass extends SubjectElementOperations {};
	
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
	
	

	
	
} // SubjectElementOperations