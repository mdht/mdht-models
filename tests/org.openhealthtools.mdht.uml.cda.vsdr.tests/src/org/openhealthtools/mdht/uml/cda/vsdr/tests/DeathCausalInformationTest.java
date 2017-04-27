
/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathCausalInformationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Causal Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCause(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Component Death Cause Interval Death Cause Interval</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCauseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentCauseDeathCause(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Cause Death Cause</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCausalInformation#validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Causal Information Component Other Significant Condition Other Significant Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeathCausalInformationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationTemplateId() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationTemplateIdTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationTemplateId(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationClassCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationClassCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationClassCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationMoodCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationMoodCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationMoodCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationStatusCodeP() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationStatusCodePTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationStatusCodeP(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationStatusCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationStatusCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationStatusCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
			
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationStatusCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCause() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCause",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCause(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentOtherSignificantCondition() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentOtherSignificantConditionTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentOtherSignificantCondition",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantCondition(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentOtherSignificantConditionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodePTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeP(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValueTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
			
//				CD value = DatatypesFactory.eINSTANCE.createCD();
//				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValue(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_COMPONENT_DEATH_CAUSE_INTERVAL_DEATH_CAUSE_INTERVAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseInterval(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseComponentDeathCauseIntervalDeathCauseIntervalTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseClassCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseClassCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseClassCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseCodeP() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseCodePTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseCodeP(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseMoodCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseMoodCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseMoodCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCauseValue() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseValueTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCauseValue",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
			
//				CD value = DatatypesFactory.eINSTANCE.createCD();
//				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCauseValue(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseSequenceNumber() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseSequenceNumberTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseSequenceNumber",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseSequenceNumber(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseSequenceNumberTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseTypeCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseTypeCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseTypeCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentCauseDeathCause() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentCauseDeathCauseTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentCauseDeathCause",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_CAUSE_DEATH_CAUSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentCauseDeathCause(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentCauseDeathCauseTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeP(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
			
//				CD value = DatatypesFactory.eINSTANCE.createCD();
//				target.getValues().add(value);
//				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValue(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentOtherSignificantConditionTypeCode() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentOtherSignificantConditionTypeCodeTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentOtherSignificantConditionTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionTypeCode(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentOtherSignificantConditionTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition() {
			OperationsTestCase<DeathCausalInformation> validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionTestCase = new OperationsTestCase<DeathCausalInformation>(
			"validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CAUSAL_INFORMATION_COMPONENT_OTHER_SIGNIFICANT_CONDITION_OTHER_SIGNIFICANT_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCausalInformation target) {

			}

			@Override
			protected void updateToPass(DeathCausalInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCausalInformationOperations.validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantCondition(
					(DeathCausalInformation) objectToTest, diagnostician, map);
			}

		};

		validateDeathCausalInformationComponentOtherSignificantConditionOtherSignificantConditionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeathCausalInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeathCausalInformation> {
		@Override
		public DeathCausalInformation create() {		
			return VsdrFactory.eINSTANCE.createDeathCausalInformation();
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
	private static class ConstructorTestClass extends DeathCausalInformationOperations {};
	
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
	
	

	
	
} // DeathCausalInformationOperations