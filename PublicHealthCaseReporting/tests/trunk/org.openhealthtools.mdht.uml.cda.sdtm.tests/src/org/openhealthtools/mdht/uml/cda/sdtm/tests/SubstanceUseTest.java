
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
import org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.SubstanceUseOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseConsumableMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Consumable Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseSubstanceUseCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Substance Use Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseSubstanceUseSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Substance Use Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsePreSpecifiedEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseActivityStartTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseActivityEndTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUseStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Use Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Associationsubstance Use Category Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Category Association Substance Use Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Associationsubstance Use Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Usesubstance Use Sub Category Association Substance Use Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getPreSpecifiedEvent() <em>Get Pre Specified Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getActivityStartTimingReference() <em>Get Activity Start Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getActivityEndTimingReference() <em>Get Activity End Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.SubstanceUse#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SubstanceUseTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseTemplateId() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseTemplateIdTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseTemplateId(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseClassCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseClassCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseClassCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseDoseQuantity() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseDoseQuantityTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseDoseQuantity(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateSubstanceUseEffectiveTime() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseEffectiveTimeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
       						
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseEffectiveTime(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseId() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseIdTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseId",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseId(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseMaxDoseQuantity() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseMaxDoseQuantityTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseMaxDoseQuantity",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseMaxDoseQuantity(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseMaxDoseQuantityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseMoodCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseMoodCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseMoodCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseRouteCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseRouteCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseRouteCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseRouteCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseRouteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseStatusCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseStatusCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseStatusCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseText() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseTextTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseText",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseText(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseConsumableMaterial() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseConsumableMaterialTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseConsumableMaterial",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_CONSUMABLE_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseConsumableMaterial(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseConsumableMaterialTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseSubstanceUseCategoryAssociation() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseSubstanceUseCategoryAssociationTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseSubstanceUseCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseSubstanceUseCategoryAssociation(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseSubstanceUseCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseSubstanceUseSubCategoryAssociation() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseSubstanceUseSubCategoryAssociationTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseSubstanceUseSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_SUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseSubstanceUseSubCategoryAssociation(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseSubstanceUseSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsePreSpecifiedEvent() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsePreSpecifiedEventTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsePreSpecifiedEvent",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_PRE_SPECIFIED_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsePreSpecifiedEvent(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsePreSpecifiedEventTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseNonPerformanceReason() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseNonPerformanceReasonTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseNonPerformanceReason(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseActivityStartTimingReference() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseActivityStartTimingReferenceTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseActivityStartTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_ACTIVITY_START_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseActivityStartTimingReference(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseActivityStartTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseActivityEndTimingReference() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseActivityEndTimingReferenceTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseActivityEndTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_ACTIVITY_END_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseActivityEndTimingReference(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseActivityEndTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseDataCollection() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseDataCollectionTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseDataCollection(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUseStudyDayPeriod() {
      OperationsTestCase<SubstanceUse> validateSubstanceUseStudyDayPeriodTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUseStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USE_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUseStudyDayPeriod(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUseStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValue(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValuePTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATIONSUBSTANCE_USE_CATEGORY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValueP(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseCategoryAssociationsubstanceUseCategoryValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseCategoryAssociationTypeCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseCategoryAssociationTypeCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseCategoryAssociationTypeCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategoryTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_CATEGORY_ASSOCIATION_SUBSTANCE_USE_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategory(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseCategoryAssociationSubstanceUseCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValueTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATIONSUBSTANCE_USE_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
       
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValue(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseSubCategoryAssociationsubstanceUseSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCode(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory() {
      OperationsTestCase<SubstanceUse> validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategoryTestCase = new OperationsTestCase<SubstanceUse>(
      "validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_USESUBSTANCE_USE_SUB_CATEGORY_ASSOCIATION_SUBSTANCE_USE_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SubstanceUse target) {

      }

      @Override
      protected void updateToPass(SubstanceUse target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SubstanceUseOperations.validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategory(
          (SubstanceUse) objectToTest, diagnostician, map);
      }

    };

    validateSubstanceUsesubstanceUseSubCategoryAssociationSubstanceUseSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPreSpecifiedEvent() {


SubstanceUse target = objectFactory.create();
target.getPreSpecifiedEvent();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


SubstanceUse target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetActivityStartTimingReference() {


SubstanceUse target = objectFactory.create();
target.getActivityStartTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetActivityEndTimingReference() {


SubstanceUse target = objectFactory.create();
target.getActivityEndTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


SubstanceUse target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


SubstanceUse target = objectFactory.create();
target.getStudyDayPeriod();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends SubstanceUseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubstanceUse> {
		public SubstanceUse create() {		
			return SdtmFactory.eINSTANCE.createSubstanceUse();
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
	private static class ConstructorTestClass extends SubstanceUseOperations {};
	
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
	
	

	
	
} // SubstanceUseOperations