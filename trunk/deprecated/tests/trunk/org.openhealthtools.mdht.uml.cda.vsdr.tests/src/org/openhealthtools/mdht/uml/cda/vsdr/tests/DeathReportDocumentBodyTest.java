
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
import org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathReportDocumentBodyOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Report Document Body</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTimeofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Timeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyLocationofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Locationof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyDeathCertification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Certification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyMannerofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Mannerof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyPregnancyStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pregnancy Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTobaccoUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCauseofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Causeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyAutopsyPerformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyAutopsyResults(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCoronerReferral(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCoronerCaseTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Case Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyDeathLocationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Location Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getTimeofDeath() <em>Get Timeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getLocationofDeath() <em>Get Locationof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getDeathCertification() <em>Get Death Certification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getMannerofDeath() <em>Get Mannerof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getPregnancyStatus() <em>Get Pregnancy Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getTobaccoUse() <em>Get Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getInjury() <em>Get Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCauseofDeath() <em>Get Causeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getAutopsyPerformance() <em>Get Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getAutopsyResults() <em>Get Autopsy Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCoronerReferral() <em>Get Coroner Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCoronerCaseTransfer() <em>Get Coroner Case Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getDeathLocationType() <em>Get Death Location Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeathReportDocumentBodyTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyTemplateId() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyTemplateIdTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTemplateId(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyCodeP() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyCodePTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCodeP(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyCode() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyCodeTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCode(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyTimeofDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyTimeofDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyTimeofDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TIMEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTimeofDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyTimeofDeathTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyLocationofDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyLocationofDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyLocationofDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATIONOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyLocationofDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyLocationofDeathTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyDeathCertification() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyDeathCertificationTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyDeathCertification",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_CERTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyDeathCertification(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyDeathCertificationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyMannerofDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyMannerofDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyMannerofDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNEROF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyMannerofDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyMannerofDeathTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyPregnancyStatus() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyPregnancyStatusTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyPregnancyStatus",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PREGNANCY_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyPregnancyStatus(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyPregnancyStatusTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyTobaccoUse() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyTobaccoUseTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyTobaccoUse",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TOBACCO_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyTobaccoUse(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyTobaccoUseTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyInjury() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyInjuryTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyInjury",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyInjury(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyInjuryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyCauseofDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyCauseofDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyCauseofDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSEOF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCauseofDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyCauseofDeathTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyAutopsyPerformance() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyAutopsyPerformanceTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyAutopsyPerformance",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyAutopsyPerformance(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyAutopsyPerformanceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyAutopsyResults() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyAutopsyResultsTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyAutopsyResults",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_AUTOPSY_RESULTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyAutopsyResults(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyAutopsyResultsTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyCoronerReferral() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyCoronerReferralTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyCoronerReferral",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCoronerReferral(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyCoronerReferralTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyCoronerCaseTransfer() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyCoronerCaseTransferTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyCoronerCaseTransfer",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CORONER_CASE_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCoronerCaseTransfer(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyCoronerCaseTransferTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyDeathLocationType() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyDeathLocationTypeTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyDeathLocationType",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_DEATH_LOCATION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyDeathLocationType(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyDeathLocationTypeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTimeofDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getTimeofDeath();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetLocationofDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getLocationofDeath();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDeathCertification() {


DeathReportDocumentBody target = objectFactory.create();
target.getDeathCertification();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMannerofDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getMannerofDeath();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPregnancyStatus() {


DeathReportDocumentBody target = objectFactory.create();
target.getPregnancyStatus();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTobaccoUse() {


DeathReportDocumentBody target = objectFactory.create();
target.getTobaccoUse();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetInjury() {


DeathReportDocumentBody target = objectFactory.create();
target.getInjury();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCauseofDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getCauseofDeath();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAutopsyPerformance() {


DeathReportDocumentBody target = objectFactory.create();
target.getAutopsyPerformance();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAutopsyResults() {


DeathReportDocumentBody target = objectFactory.create();
target.getAutopsyResults();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCoronerReferral() {


DeathReportDocumentBody target = objectFactory.create();
target.getCoronerReferral();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCoronerCaseTransfer() {


DeathReportDocumentBody target = objectFactory.create();
target.getCoronerCaseTransfer();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDeathLocationType() {


DeathReportDocumentBody target = objectFactory.create();
target.getDeathLocationType();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeathReportDocumentBodyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeathReportDocumentBody> {
		public DeathReportDocumentBody create() {		
			return VsdrFactory.eINSTANCE.createDeathReportDocumentBody();
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
	private static class ConstructorTestClass extends DeathReportDocumentBodyOperations {};
	
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
	
	

	
	
} // DeathReportDocumentBodyOperations