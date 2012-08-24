
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
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.FindingAboutOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Finding About</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutFindingObservationObjectAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding Observation Object Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutFindingAboutCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding About Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutFindingAboutSubCategoryAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Finding About Sub Category Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding About Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Associationfinding Observation Object Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingObservationObjectAssociationObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding Observation Object Association Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Associationfinding About Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Category Association Finding About Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Associationfinding About Sub Category Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Finding Aboutfinding About Sub Category Association Finding About Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class FindingAboutTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutTemplateId() {
      OperationsTestCase<FindingAbout> validateFindingAboutTemplateIdTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutTemplateId(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutClassCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutClassCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutClassCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutClassCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutId() {
      OperationsTestCase<FindingAbout> validateFindingAboutIdTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutId",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutId(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutMoodCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutMoodCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutMoodCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutStatusCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutStatusCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutStatusCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutTargetSiteCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutTargetSiteCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutTargetSiteCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutValue() {
      OperationsTestCase<FindingAbout> validateFindingAboutValueTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutValue",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutValue(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutInterpretationCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutInterpretationCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutInterpretationCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutGroupIdentifier() {
      OperationsTestCase<FindingAbout> validateFindingAboutGroupIdentifierTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutGroupIdentifier(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutGroupIdentifierTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutFindingObservationObjectAssociation() {
      OperationsTestCase<FindingAbout> validateFindingAboutFindingObservationObjectAssociationTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutFindingObservationObjectAssociation",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_FINDING_OBSERVATION_OBJECT_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutFindingObservationObjectAssociation(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutFindingObservationObjectAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutFindingAboutCategoryAssociation() {
      OperationsTestCase<FindingAbout> validateFindingAboutFindingAboutCategoryAssociationTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutFindingAboutCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_FINDING_ABOUT_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutFindingAboutCategoryAssociation(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutFindingAboutCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutFindingAboutSubCategoryAssociation() {
      OperationsTestCase<FindingAbout> validateFindingAboutFindingAboutSubCategoryAssociationTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutFindingAboutSubCategoryAssociation",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_FINDING_ABOUT_SUB_CATEGORY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutFindingAboutSubCategoryAssociation(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutFindingAboutSubCategoryAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutNonPerformanceReason() {
      OperationsTestCase<FindingAbout> validateFindingAboutNonPerformanceReasonTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutNonPerformanceReason(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutDataCollection() {
      OperationsTestCase<FindingAbout> validateFindingAboutDataCollectionTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutDataCollection(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodePTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeP(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValueTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATIONFINDING_OBSERVATION_OBJECT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValue(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingObservationObjectAssociationfindingObservationObjectValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingObservationObjectAssociationTypeCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingObservationObjectAssociationTypeCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingObservationObjectAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationTypeCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingObservationObjectAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingObservationObjectAssociationObservation() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingObservationObjectAssociationObservationTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingObservationObjectAssociationObservation",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_OBSERVATION_OBJECT_ASSOCIATION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingObservationObjectAssociationObservation(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingObservationObjectAssociationObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValueTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATIONFINDING_ABOUT_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValue(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutCategoryAssociationfindingAboutCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutCategoryAssociationTypeCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutCategoryAssociationTypeCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutCategoryAssociationTypeCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategoryTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_CATEGORY_ASSOCIATION_FINDING_ABOUT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategory(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutCategoryAssociationFindingAboutCategoryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValueTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATIONFINDING_ABOUT_SUB_CATEGORY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValue(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutSubCategoryAssociationfindingAboutSubCategoryValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutSubCategoryAssociationTypeCode() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutSubCategoryAssociationTypeCodeTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutSubCategoryAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutSubCategoryAssociationTypeCode(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutSubCategoryAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory() {
      OperationsTestCase<FindingAbout> validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategoryTestCase = new OperationsTestCase<FindingAbout>(
      "validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory",
      operationsForOCL.getOCLValue("VALIDATE_FINDING_ABOUTFINDING_ABOUT_SUB_CATEGORY_ASSOCIATION_FINDING_ABOUT_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FindingAbout target) {

      }

      @Override
      protected void updateToPass(FindingAbout target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FindingAboutOperations.validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategory(
          (FindingAbout) objectToTest, diagnostician, map);
      }

    };

    validateFindingAboutfindingAboutSubCategoryAssociationFindingAboutSubCategoryTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


FindingAbout target = objectFactory.create();
target.getGroupIdentifier();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


FindingAbout target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


FindingAbout target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends FindingAboutOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FindingAbout> {
		public FindingAbout create() {		
			return SdtmFactory.eINSTANCE.createFindingAbout();
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
	private static class ConstructorTestClass extends FindingAboutOperations {};
	
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
	
	

	
	
} // FindingAboutOperations