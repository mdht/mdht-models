
/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.junit.Test;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTimeofDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Timeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyLocationOfDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Location Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCertifyingDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Certifying Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyMannerOfDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Manner Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyPregnancyStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pregnancy Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyTobaccoUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCauseOfDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Cause Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyAutopsyPerformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyAutopsyResults(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Autopsy Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCoronerReferral(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyCoronerCaseTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Coroner Case Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyDeathLocationType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Death Location Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#validateDeathReportDocumentBodyPronouncingDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Report Document Body Pronouncing Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getTimeofDeath() <em>Get Timeof Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getLocationOfDeath() <em>Get Location Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCertifyingDeath() <em>Get Certifying Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getMannerOfDeath() <em>Get Manner Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getPregnancyStatus() <em>Get Pregnancy Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getTobaccoUse() <em>Get Tobacco Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getInjury() <em>Get Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCauseOfDeath() <em>Get Cause Of Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getAutopsyPerformance() <em>Get Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getAutopsyResults() <em>Get Autopsy Results</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCoronerReferral() <em>Get Coroner Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getCoronerCaseTransfer() <em>Get Coroner Case Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getDeathLocationType() <em>Get Death Location Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathReportDocumentBody#getPronouncingDeath() <em>Get Pronouncing Death</em>}</li>
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

 
									
public void testValidateDeathReportDocumentBodyText() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyTextTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyText",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathReportDocumentBody target) {

			}

			@Override
			protected void updateToPass(DeathReportDocumentBody target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
//		ED text = DatatypesFactory.eINSTANCE.createED();
//		target.setText(text );	
//				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyText(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyTextTestCase.doValidationTest();
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

 
									
public void testValidateDeathReportDocumentBodyLocationOfDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyLocationOfDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyLocationOfDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_LOCATION_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
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
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyLocationOfDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyLocationOfDeathTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyCertifyingDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyCertifyingDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyCertifyingDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CERTIFYING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
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
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCertifyingDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyCertifyingDeathTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathReportDocumentBodyMannerOfDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyMannerOfDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyMannerOfDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_MANNER_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
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
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyMannerOfDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyMannerOfDeathTestCase.doValidationTest();
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

 
									
public void testValidateDeathReportDocumentBodyCauseOfDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyCauseOfDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyCauseOfDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_CAUSE_OF_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
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
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyCauseOfDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyCauseOfDeathTestCase.doValidationTest();
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

 
									
public void testValidateDeathReportDocumentBodyPronouncingDeath() {
			OperationsTestCase<DeathReportDocumentBody> validateDeathReportDocumentBodyPronouncingDeathTestCase = new OperationsTestCase<DeathReportDocumentBody>(
			"validateDeathReportDocumentBodyPronouncingDeath",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_REPORT_DOCUMENT_BODY_PRONOUNCING_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
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
			
			
			
				return DeathReportDocumentBodyOperations.validateDeathReportDocumentBodyPronouncingDeath(
					(DeathReportDocumentBody) objectToTest, diagnostician, map);
			}

		};

		validateDeathReportDocumentBodyPronouncingDeathTestCase.doValidationTest();
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

 
									
public void testGetLocationOfDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getLocationOfDeath();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCertifyingDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getCertifyingDeath();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMannerOfDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getMannerOfDeath();



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

 
									
public void testGetCauseOfDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getCauseOfDeath();



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
@Test

 
									
public void testGetPronouncingDeath() {


DeathReportDocumentBody target = objectFactory.create();
target.getPronouncingDeath();



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
		@Override
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