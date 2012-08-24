
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
import org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.DeathDiagnosisOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosis Death Diagnosis Result Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Associationdeath Diagnosis Result Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Diagnosisdeath Diagnosis Result Category Association Death Diagnosis Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DeathDiagnosis#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeathDiagnosisTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisTemplateId() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisTemplateIdTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisTemplateId(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisClassCode() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisClassCodeTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisClassCode",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisClassCode(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisCode() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisCodeTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisCode",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisCode(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisId() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisIdTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisId",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSIS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisId(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisMoodCode() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisMoodCodeTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisMoodCode(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisValue() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisValueTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisValue",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSIS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisValue(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisDataCollection() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisDataCollectionTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSIS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisDataCollection(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisDeathDiagnosisResultCategoryAssociation() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisDeathDiagnosisResultCategoryAssociationTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSIS_DEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisDeathDiagnosisResultCategoryAssociation(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisDeathDiagnosisResultCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCodeTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCode(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodePTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeP(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCode(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCodeTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCode(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValueTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATIONDEATH_DIAGNOSIS_RESULT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValue(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationdeathDiagnosisResultCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCodeTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCode(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory() {
      OperationsTestCase<DeathDiagnosis> validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategoryTestCase = new OperationsTestCase<DeathDiagnosis>(
      "validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory",
      operationsForOCL.getOCLValue("VALIDATE_DEATH_DIAGNOSISDEATH_DIAGNOSIS_RESULT_CATEGORY_ASSOCIATION_DEATH_DIAGNOSIS_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeathDiagnosis target) {

      }

      @Override
      protected void updateToPass(DeathDiagnosis target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeathDiagnosisOperations.validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategory(
          (DeathDiagnosis) objectToTest, diagnostician, map);
      }

    };

    validateDeathDiagnosisdeathDiagnosisResultCategoryAssociationDeathDiagnosisResultCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


DeathDiagnosis target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeathDiagnosisOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeathDiagnosis> {
		public DeathDiagnosis create() {		
			return SdtmFactory.eINSTANCE.createDeathDiagnosis();
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
	private static class ConstructorTestClass extends DeathDiagnosisOperations {};
	
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
	
	

	
	
} // DeathDiagnosisOperations