
/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathLocationTypeOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Location Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathLocationType#validateDeathLocationTypeValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Location Type Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeathLocationTypeTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathLocationTypeTemplateId() {
			OperationsTestCase<DeathLocationType> validateDeathLocationTypeTemplateIdTestCase = new OperationsTestCase<DeathLocationType>(
			"validateDeathLocationTypeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_LOCATION_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathLocationType target) {

			}

			@Override
			protected void updateToPass(DeathLocationType target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathLocationTypeOperations.validateDeathLocationTypeTemplateId(
					(DeathLocationType) objectToTest, diagnostician, map);
			}

		};

		validateDeathLocationTypeTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathLocationTypeClassCode() {
			OperationsTestCase<DeathLocationType> validateDeathLocationTypeClassCodeTestCase = new OperationsTestCase<DeathLocationType>(
			"validateDeathLocationTypeClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_LOCATION_TYPE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathLocationType target) {

			}

			@Override
			protected void updateToPass(DeathLocationType target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathLocationTypeOperations.validateDeathLocationTypeClassCode(
					(DeathLocationType) objectToTest, diagnostician, map);
			}

		};

		validateDeathLocationTypeClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathLocationTypeMoodCode() {
			OperationsTestCase<DeathLocationType> validateDeathLocationTypeMoodCodeTestCase = new OperationsTestCase<DeathLocationType>(
			"validateDeathLocationTypeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_LOCATION_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathLocationType target) {

			}

			@Override
			protected void updateToPass(DeathLocationType target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathLocationTypeOperations.validateDeathLocationTypeMoodCode(
					(DeathLocationType) objectToTest, diagnostician, map);
			}

		};

		validateDeathLocationTypeMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathLocationTypeCodeP() {
			OperationsTestCase<DeathLocationType> validateDeathLocationTypeCodePTestCase = new OperationsTestCase<DeathLocationType>(
			"validateDeathLocationTypeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_LOCATION_TYPE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathLocationType target) {

			}

			@Override
			protected void updateToPass(DeathLocationType target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathLocationTypeOperations.validateDeathLocationTypeCodeP(
					(DeathLocationType) objectToTest, diagnostician, map);
			}

		};

		validateDeathLocationTypeCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathLocationTypeCode() {
			OperationsTestCase<DeathLocationType> validateDeathLocationTypeCodeTestCase = new OperationsTestCase<DeathLocationType>(
			"validateDeathLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathLocationType target) {

			}

			@Override
			protected void updateToPass(DeathLocationType target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathLocationTypeOperations.validateDeathLocationTypeCode(
					(DeathLocationType) objectToTest, diagnostician, map);
			}

		};

		validateDeathLocationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathLocationTypeValue() {
			OperationsTestCase<DeathLocationType> validateDeathLocationTypeValueTestCase = new OperationsTestCase<DeathLocationType>(
			"validateDeathLocationTypeValue",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_LOCATION_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathLocationType target) {

			}

			@Override
			protected void updateToPass(DeathLocationType target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathLocationTypeOperations.validateDeathLocationTypeValue(
					(DeathLocationType) objectToTest, diagnostician, map);
			}

		};

		validateDeathLocationTypeValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathLocationTypeValueP() {
			OperationsTestCase<DeathLocationType> validateDeathLocationTypeValuePTestCase = new OperationsTestCase<DeathLocationType>(
			"validateDeathLocationTypeValueP",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_LOCATION_TYPE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathLocationType target) {

			}

			@Override
			protected void updateToPass(DeathLocationType target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathLocationTypeOperations.validateDeathLocationTypeValueP(
					(DeathLocationType) objectToTest, diagnostician, map);
			}

		};

		validateDeathLocationTypeValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeathLocationTypeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeathLocationType> {
		@Override
		public DeathLocationType create() {		
			return VsdrFactory.eINSTANCE.createDeathLocationType();
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
	private static class ConstructorTestClass extends DeathLocationTypeOperations {};
	
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
	
	

	
	
} // DeathLocationTypeOperations