
/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  Myriam Lipprandt <myriam.lipprandt@offis.de>, OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsSetIdAndIdAreUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Set Id And Id Are Unique</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCopyTimeNotPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Copy Time Not Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Record Target Patient Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasProviderOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Provider Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Assigned Author Person Or Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasDataEntererTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Data Enterer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasInformant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Has Informant Assigned Person Or Related Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Legal Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Authenticator Has Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Type Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class GeneralHeaderConstraintsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsTypeIdExtension() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTypeIdExtensionTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsTypeIdExtension",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeIdExtension(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsTypeIdExtensionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsSetIdAndVersionNumber() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsSetIdAndVersionNumberTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsSetIdAndVersionNumber",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetIdAndVersionNumber(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsSetIdAndVersionNumberTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsSetIdAndIdAreUnique() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsSetIdAndIdAreUniqueTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsSetIdAndIdAreUnique",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_SET_ID_AND_ID_ARE_UNIQUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsSetIdAndIdAreUnique(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsSetIdAndIdAreUniqueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsCopyTimeNotPresent() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCopyTimeNotPresentTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsCopyTimeNotPresent",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_COPY_TIME_NOT_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCopyTimeNotPresent(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsCopyTimeNotPresentTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasRecordTargetPatientRole() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasRecordTargetPatientRoleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasRecordTargetPatientRole",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasRecordTargetPatientRole(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasRecordTargetPatientRoleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasPatientBirthTime() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasPatientBirthTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasPatientBirthTime",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasPatientBirthTime(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasPatientBirthTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasAdministrativeGenderCode() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasAdministrativeGenderCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasAdministrativeGenderCode",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAdministrativeGenderCode(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasAdministrativeGenderCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasProviderOrganization() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasProviderOrganizationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasProviderOrganization",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_PROVIDER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasProviderOrganization(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasProviderOrganizationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasAuthorTime() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasAuthorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasAuthorTime",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAuthorTime(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasAuthorTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasAssignedAuthorId() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasAssignedAuthorIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasAssignedAuthorId",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAssignedAuthorId(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasAssignedAuthorIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDeviceTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_ASSIGNED_AUTHOR_PERSON_OR_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDevice(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasAssignedAuthorPersonOrDeviceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasDataEntererAssignedPerson() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasDataEntererAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasDataEntererAssignedPerson",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasDataEntererAssignedPerson(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasDataEntererAssignedPersonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasDataEntererTime() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasDataEntererTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasDataEntererTime",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_DATA_ENTERER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasDataEntererTime(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasDataEntererTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasInformant() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasInformantTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasInformant",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasInformant(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasInformantTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_HAS_INFORMANT_ASSIGNED_PERSON_OR_RELATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPerson(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsHasInformantAssignedPersonOrRelatedPersonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LEGAL_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPerson(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsLegalAuthenticatorHasAssignedPersonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsAuthenticatorHasAssignedPersonTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_AUTHENTICATOR_HAS_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsAuthenticatorHasAssignedPerson(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsAuthenticatorHasAssignedPersonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsTemplateId() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTemplateId(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsCodeP() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsCodeP",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCodeP(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsCode() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsCode",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsConfidentialityCode() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsConfidentialityCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsConfidentialityCode",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsConfidentialityCode(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsConfidentialityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsEffectiveTime() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsEffectiveTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsEffectiveTime(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsId() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsId",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsId(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsLanguageCode() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsLanguageCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsLanguageCode",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsLanguageCode(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsLanguageCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsTitle() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTitleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsTitle",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTitle(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsTypeId() {
      OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTypeIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
      "validateGeneralHeaderConstraintsTypeId",
      operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GeneralHeaderConstraints target) {

      }

      @Override
      protected void updateToPass(GeneralHeaderConstraints target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTypeId(
          (GeneralHeaderConstraints) objectToTest, diagnostician, map);
      }

    };

    validateGeneralHeaderConstraintsTypeIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends GeneralHeaderConstraintsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints> {
		public GeneralHeaderConstraints create() {		
			return PhmrFactory.eINSTANCE.createGeneralHeaderConstraints();
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
	private static class ConstructorTestClass extends GeneralHeaderConstraintsOperations {};
	
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
	
	

	
	
} // GeneralHeaderConstraintsOperations