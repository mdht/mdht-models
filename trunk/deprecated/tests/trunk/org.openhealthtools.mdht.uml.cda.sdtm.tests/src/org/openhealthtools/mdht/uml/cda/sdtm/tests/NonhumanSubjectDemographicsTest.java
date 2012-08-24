
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
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanSubjectDemographicsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Subject Demographics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Associationsubject Species Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsspecies Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Associationsubject Strain Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicsstrainAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsstrain Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Associationset Membership Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanSubjectDemographics#validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Subject Demographicsset Membership Association Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class NonhumanSubjectDemographicsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsTemplateId() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsTemplateIdTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsTemplateId(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsClassCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsClassCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsClassCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsCodeP() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsCodePTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsCodeP(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsMoodCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsMoodCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsMoodCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodePTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeP(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATIONSUBJECT_SPECIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      ;
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValue(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsspeciesAssociationsubjectSpeciesValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsspeciesAssociationTypeCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsspeciesAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsspeciesAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSPECIES_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsspeciesAssociationTypeCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsspeciesAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodePTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeP(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
     
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValue(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainValueTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainTextTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATIONSUBJECT_STRAIN_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
   
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainText(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsstrainAssociationsubjectStrainTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicsstrainAssociationTypeCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicsstrainAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicsstrainAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSTRAIN_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicsstrainAssociationTypeCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicsstrainAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodePTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeP(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValueTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATIONSET_MEMBERSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
      
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValue(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicssetMembershipAssociationsetMembershipValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanSubjectDemographicssetMembershipAssociationTypeCode() {
      OperationsTestCase<NonhumanSubjectDemographics> validateNonhumanSubjectDemographicssetMembershipAssociationTypeCodeTestCase = new OperationsTestCase<NonhumanSubjectDemographics>(
      "validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_SUBJECT_DEMOGRAPHICSSET_MEMBERSHIP_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanSubjectDemographics target) {

      }

      @Override
      protected void updateToPass(NonhumanSubjectDemographics target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanSubjectDemographicsOperations.validateNonhumanSubjectDemographicssetMembershipAssociationTypeCode(
          (NonhumanSubjectDemographics) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanSubjectDemographicssetMembershipAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends NonhumanSubjectDemographicsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonhumanSubjectDemographics> {
		public NonhumanSubjectDemographics create() {		
			return SdtmFactory.eINSTANCE.createNonhumanSubjectDemographics();
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
	private static class ConstructorTestClass extends NonhumanSubjectDemographicsOperations {};
	
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
	
	

	
	
} // NonhumanSubjectDemographicsOperations