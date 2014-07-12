
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reportingdeathinformationfromaclinicalsettingtovitalrecords</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Death Report Document Body</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author Authoring Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reportingdeathinformationfromaclinicalsettingtovitalrecords Record Target Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Reportingdeathinformationfromaclinicalsettingtovitalrecords#getDeathReportDocumentBody() <em>Get Death Report Document Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ReportingdeathinformationfromaclinicalsettingtovitalrecordsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateIdTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateId(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodePTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeP(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodePTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeP(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsConfidentialityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsId() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsIdTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsId(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsLanguageCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRealmCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitleTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitle(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTimeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTime(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodian(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBodyTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_DEATH_REPORT_DOCUMENT_BODY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBody(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsDeathReportDocumentBodyTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthor(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTarget(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationNameTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationName(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationIdTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationId(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianCustodianOrganizationIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodian(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsCustodianAssignedCustodianTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonDeterminerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonNameTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonName(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorIdTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorId(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPerson(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorAuthoringPersonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTimeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTime(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthor(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsAuthorAssignedAuthorTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodePTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodeP(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonAdministrativeGenderCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTimeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTime(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonBirthTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonDeterminerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonNameTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonName(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientIdTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientId(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddrTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddr(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientAddrTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPerson(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientPersonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCodeTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCode(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient() {
			OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords> validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientTestCase = new OperationsTestCase<Reportingdeathinformationfromaclinicalsettingtovitalrecords>(
			"validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient",
			operationsForOCL.getOCLValue("VALIDATE_REPORTINGDEATHINFORMATIONFROMACLINICALSETTINGTOVITALRECORDS_RECORD_TARGET_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {

			}

			@Override
			protected void updateToPass(Reportingdeathinformationfromaclinicalsettingtovitalrecords target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations.validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatient(
					(Reportingdeathinformationfromaclinicalsettingtovitalrecords) objectToTest, diagnostician, map);
			}

		};

		validateReportingdeathinformationfromaclinicalsettingtovitalrecordsRecordTargetPatientTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetDeathReportDocumentBody() {


Reportingdeathinformationfromaclinicalsettingtovitalrecords target = objectFactory.create();
target.getDeathReportDocumentBody();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Reportingdeathinformationfromaclinicalsettingtovitalrecords> {
		public Reportingdeathinformationfromaclinicalsettingtovitalrecords create() {		
			return VsdrFactory.eINSTANCE.createReportingdeathinformationfromaclinicalsettingtovitalrecords();
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
	private static class ConstructorTestClass extends ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations {};
	
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
	
	

	
	
} // ReportingdeathinformationfromaclinicalsettingtovitalrecordsOperations