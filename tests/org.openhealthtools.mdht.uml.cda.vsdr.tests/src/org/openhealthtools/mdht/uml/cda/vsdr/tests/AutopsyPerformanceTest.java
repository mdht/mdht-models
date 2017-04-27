
/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.AutopsyPerformanceOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Autopsy Performance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role Autopsy Clinician</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyPerformance#validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Performance Autopsy Performer Autopsy Performer Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AutopsyPerformanceTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceTemplateId() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceTemplateIdTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceTemplateId(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceClassCode() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceClassCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceClassCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceClassCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceMoodCode() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceMoodCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceMoodCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceCodeP() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceCodePTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceCodeP",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceCodeP(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceCode() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceEffectiveTime() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceEffectiveTimeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceEffectiveTime(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceValue() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceValueTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceValue",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceValue(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceAutopsyPerformer() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceAutopsyPerformerTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceAutopsyPerformer",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformer(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceAutopsyPerformerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianDeterminerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianNameTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianName(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE_AUTOPSY_CLINICIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinician(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleAutopsyClinicianTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceAutopsyPerformerTypeCode() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceAutopsyPerformerTypeCodeTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceAutopsyPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerTypeCode(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceAutopsyPerformerTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole() {
			OperationsTestCase<AutopsyPerformance> validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleTestCase = new OperationsTestCase<AutopsyPerformance>(
			"validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_PERFORMANCE_AUTOPSY_PERFORMER_AUTOPSY_PERFORMER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyPerformance target) {

			}

			@Override
			protected void updateToPass(AutopsyPerformance target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyPerformanceOperations.validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRole(
					(AutopsyPerformance) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyPerformanceAutopsyPerformerAutopsyPerformerRoleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AutopsyPerformanceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AutopsyPerformance> {
		@Override
		public AutopsyPerformance create() {		
			return VsdrFactory.eINSTANCE.createAutopsyPerformance();
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
	private static class ConstructorTestClass extends AutopsyPerformanceOperations {};
	
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
	
	

	
	
} // AutopsyPerformanceOperations