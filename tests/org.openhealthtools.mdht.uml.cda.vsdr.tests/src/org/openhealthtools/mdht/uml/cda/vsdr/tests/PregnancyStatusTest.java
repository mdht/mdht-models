
/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.PregnancyStatusOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Status</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PregnancyStatus#validatePregnancyStatusValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Status Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PregnancyStatusTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePregnancyStatusTemplateId() {
			OperationsTestCase<PregnancyStatus> validatePregnancyStatusTemplateIdTestCase = new OperationsTestCase<PregnancyStatus>(
			"validatePregnancyStatusTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_STATUS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PregnancyStatus target) {

			}

			@Override
			protected void updateToPass(PregnancyStatus target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PregnancyStatusOperations.validatePregnancyStatusTemplateId(
					(PregnancyStatus) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyStatusTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePregnancyStatusClassCode() {
			OperationsTestCase<PregnancyStatus> validatePregnancyStatusClassCodeTestCase = new OperationsTestCase<PregnancyStatus>(
			"validatePregnancyStatusClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_STATUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PregnancyStatus target) {

			}

			@Override
			protected void updateToPass(PregnancyStatus target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PregnancyStatusOperations.validatePregnancyStatusClassCode(
					(PregnancyStatus) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyStatusClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePregnancyStatusMoodCode() {
			OperationsTestCase<PregnancyStatus> validatePregnancyStatusMoodCodeTestCase = new OperationsTestCase<PregnancyStatus>(
			"validatePregnancyStatusMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_STATUS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PregnancyStatus target) {

			}

			@Override
			protected void updateToPass(PregnancyStatus target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PregnancyStatusOperations.validatePregnancyStatusMoodCode(
					(PregnancyStatus) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyStatusMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePregnancyStatusCodeP() {
			OperationsTestCase<PregnancyStatus> validatePregnancyStatusCodePTestCase = new OperationsTestCase<PregnancyStatus>(
			"validatePregnancyStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PregnancyStatus target) {

			}

			@Override
			protected void updateToPass(PregnancyStatus target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PregnancyStatusOperations.validatePregnancyStatusCodeP(
					(PregnancyStatus) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyStatusCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePregnancyStatusCode() {
			OperationsTestCase<PregnancyStatus> validatePregnancyStatusCodeTestCase = new OperationsTestCase<PregnancyStatus>(
			"validatePregnancyStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PregnancyStatus target) {

			}

			@Override
			protected void updateToPass(PregnancyStatus target) {
				target.init();
				
				
				
				
			
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PregnancyStatusOperations.validatePregnancyStatusCode(
					(PregnancyStatus) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePregnancyStatusValue() {
			OperationsTestCase<PregnancyStatus> validatePregnancyStatusValueTestCase = new OperationsTestCase<PregnancyStatus>(
			"validatePregnancyStatusValue",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_STATUS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PregnancyStatus target) {

			}

			@Override
			protected void updateToPass(PregnancyStatus target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PregnancyStatusOperations.validatePregnancyStatusValue(
					(PregnancyStatus) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyStatusValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePregnancyStatusValueP() {
			OperationsTestCase<PregnancyStatus> validatePregnancyStatusValuePTestCase = new OperationsTestCase<PregnancyStatus>(
			"validatePregnancyStatusValueP",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_STATUS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PregnancyStatus target) {

			}

			@Override
			protected void updateToPass(PregnancyStatus target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PregnancyStatusOperations.validatePregnancyStatusValueP(
					(PregnancyStatus) objectToTest, diagnostician, map);
			}

		};

		validatePregnancyStatusValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PregnancyStatusOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PregnancyStatus> {
		@Override
		public PregnancyStatus create() {		
			return VsdrFactory.eINSTANCE.createPregnancyStatus();
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
	private static class ConstructorTestClass extends PregnancyStatusOperations {};
	
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
	
	

	
	
} // PregnancyStatusOperations