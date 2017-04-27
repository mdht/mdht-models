
/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.datatypes.ST;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reporting Death Informationfroma Clinical Settingto Vital Records</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Realm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Death Report Document Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reporting Death Informationfroma Clinical Settingto Vital Records Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.ReportingDeathInformationfromaClinicalSettingtoVitalRecords#getDeathReportDocumentBody() <em>Get Death Report Document Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ReportingDeathInformationfromaClinicalSettingtoVitalRecordsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateIdTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateId(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCodeTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCode(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCodeTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCode(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodePTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeP(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCode(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodePTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeP(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCode(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsConfidentialityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsIdTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsId(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCodeTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCode(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsLanguageCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCode(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodePTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodeP(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRealmCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitleTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitle(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTimeTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTime(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodian(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBodyTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBody(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsDeathReportDocumentBodyTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthor(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsAuthorTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTarget(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsRecordTargetTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationNameTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationName(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationIdTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationId(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianCustodianOrganizationIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian() {
			OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianTestCase = new OperationsTestCase<ReportingDeathInformationfromaClinicalSettingtoVitalRecords>(
			"validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian",
			operationsForOCL.getOCLValue("VALIDATE_REPORTING_DEATH_INFORMATIONFROMA_CLINICAL_SETTINGTO_VITAL_RECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {

			}

			@Override
			protected void updateToPass(ReportingDeathInformationfromaClinicalSettingtoVitalRecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations.validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodian(
					(ReportingDeathInformationfromaClinicalSettingtoVitalRecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingDeathInformationfromaClinicalSettingtoVitalRecordsCustodianAssignedCustodianTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetDeathReportDocumentBody() {


ReportingDeathInformationfromaClinicalSettingtoVitalRecords target = objectFactory.create();
target.getDeathReportDocumentBody();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReportingDeathInformationfromaClinicalSettingtoVitalRecords> {
		@Override
		public ReportingDeathInformationfromaClinicalSettingtoVitalRecords create() {		
			return VsdrFactory.eINSTANCE.createReportingDeathInformationfromaClinicalSettingtoVitalRecords();
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
	private static class ConstructorTestClass extends ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations {};
	
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
	
	

	
	
} // ReportingDeathInformationfromaClinicalSettingtoVitalRecordsOperations