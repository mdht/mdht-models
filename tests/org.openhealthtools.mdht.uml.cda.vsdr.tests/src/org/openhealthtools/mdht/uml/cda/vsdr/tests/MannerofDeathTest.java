
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
import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.MannerofDeathOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mannerof Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MannerofDeathTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMannerofDeathTemplateId() {
			OperationsTestCase<MannerofDeath> validateMannerofDeathTemplateIdTestCase = new OperationsTestCase<MannerofDeath>(
			"validateMannerofDeathTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MANNEROF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MannerofDeath target) {

			}

			@Override
			protected void updateToPass(MannerofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MannerofDeathOperations.validateMannerofDeathTemplateId(
					(MannerofDeath) objectToTest, diagnostician, map);
			}

		};

		validateMannerofDeathTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMannerofDeathClassCode() {
			OperationsTestCase<MannerofDeath> validateMannerofDeathClassCodeTestCase = new OperationsTestCase<MannerofDeath>(
			"validateMannerofDeathClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MANNEROF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MannerofDeath target) {

			}

			@Override
			protected void updateToPass(MannerofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MannerofDeathOperations.validateMannerofDeathClassCode(
					(MannerofDeath) objectToTest, diagnostician, map);
			}

		};

		validateMannerofDeathClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMannerofDeathCodeP() {
			OperationsTestCase<MannerofDeath> validateMannerofDeathCodePTestCase = new OperationsTestCase<MannerofDeath>(
			"validateMannerofDeathCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MANNEROF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MannerofDeath target) {

			}

			@Override
			protected void updateToPass(MannerofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MannerofDeathOperations.validateMannerofDeathCodeP(
					(MannerofDeath) objectToTest, diagnostician, map);
			}

		};

		validateMannerofDeathCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMannerofDeathCode() {
			OperationsTestCase<MannerofDeath> validateMannerofDeathCodeTestCase = new OperationsTestCase<MannerofDeath>(
			"validateMannerofDeathCode",
			operationsForOCL.getOCLValue("VALIDATE_MANNEROF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MannerofDeath target) {

			}

			@Override
			protected void updateToPass(MannerofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MannerofDeathOperations.validateMannerofDeathCode(
					(MannerofDeath) objectToTest, diagnostician, map);
			}

		};

		validateMannerofDeathCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMannerofDeathMoodCode() {
			OperationsTestCase<MannerofDeath> validateMannerofDeathMoodCodeTestCase = new OperationsTestCase<MannerofDeath>(
			"validateMannerofDeathMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MANNEROF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MannerofDeath target) {

			}

			@Override
			protected void updateToPass(MannerofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MannerofDeathOperations.validateMannerofDeathMoodCode(
					(MannerofDeath) objectToTest, diagnostician, map);
			}

		};

		validateMannerofDeathMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMannerofDeathValue() {
			OperationsTestCase<MannerofDeath> validateMannerofDeathValueTestCase = new OperationsTestCase<MannerofDeath>(
			"validateMannerofDeathValue",
			operationsForOCL.getOCLValue("VALIDATE_MANNEROF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MannerofDeath target) {

			}

			@Override
			protected void updateToPass(MannerofDeath target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MannerofDeathOperations.validateMannerofDeathValue(
					(MannerofDeath) objectToTest, diagnostician, map);
			}

		};

		validateMannerofDeathValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMannerofDeathValueP() {
			OperationsTestCase<MannerofDeath> validateMannerofDeathValuePTestCase = new OperationsTestCase<MannerofDeath>(
			"validateMannerofDeathValueP",
			operationsForOCL.getOCLValue("VALIDATE_MANNEROF_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MannerofDeath target) {

			}

			@Override
			protected void updateToPass(MannerofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MannerofDeathOperations.validateMannerofDeathValueP(
					(MannerofDeath) objectToTest, diagnostician, map);
			}

		};

		validateMannerofDeathValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends MannerofDeathOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MannerofDeath> {
		public MannerofDeath create() {		
			return VsdrFactory.eINSTANCE.createMannerofDeath();
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
	private static class ConstructorTestClass extends MannerofDeathOperations {};
	
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
	
	

	
	
} // MannerofDeathOperations