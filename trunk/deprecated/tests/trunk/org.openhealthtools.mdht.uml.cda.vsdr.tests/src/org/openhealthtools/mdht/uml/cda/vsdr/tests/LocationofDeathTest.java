
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
import org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.LocationofDeathOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Locationof Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.LocationofDeath#validateLocationofDeathValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Locationof Death Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class LocationofDeathTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationofDeathTemplateId() {
			OperationsTestCase<LocationofDeath> validateLocationofDeathTemplateIdTestCase = new OperationsTestCase<LocationofDeath>(
			"validateLocationofDeathTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LOCATIONOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LocationofDeath target) {

			}

			@Override
			protected void updateToPass(LocationofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LocationofDeathOperations.validateLocationofDeathTemplateId(
					(LocationofDeath) objectToTest, diagnostician, map);
			}

		};

		validateLocationofDeathTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationofDeathClassCode() {
			OperationsTestCase<LocationofDeath> validateLocationofDeathClassCodeTestCase = new OperationsTestCase<LocationofDeath>(
			"validateLocationofDeathClassCode",
			operationsForOCL.getOCLValue("VALIDATE_LOCATIONOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LocationofDeath target) {

			}

			@Override
			protected void updateToPass(LocationofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LocationofDeathOperations.validateLocationofDeathClassCode(
					(LocationofDeath) objectToTest, diagnostician, map);
			}

		};

		validateLocationofDeathClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationofDeathCodeP() {
			OperationsTestCase<LocationofDeath> validateLocationofDeathCodePTestCase = new OperationsTestCase<LocationofDeath>(
			"validateLocationofDeathCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LOCATIONOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LocationofDeath target) {

			}

			@Override
			protected void updateToPass(LocationofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LocationofDeathOperations.validateLocationofDeathCodeP(
					(LocationofDeath) objectToTest, diagnostician, map);
			}

		};

		validateLocationofDeathCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationofDeathCode() {
			OperationsTestCase<LocationofDeath> validateLocationofDeathCodeTestCase = new OperationsTestCase<LocationofDeath>(
			"validateLocationofDeathCode",
			operationsForOCL.getOCLValue("VALIDATE_LOCATIONOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LocationofDeath target) {

			}

			@Override
			protected void updateToPass(LocationofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LocationofDeathOperations.validateLocationofDeathCode(
					(LocationofDeath) objectToTest, diagnostician, map);
			}

		};

		validateLocationofDeathCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationofDeathMoodCode() {
			OperationsTestCase<LocationofDeath> validateLocationofDeathMoodCodeTestCase = new OperationsTestCase<LocationofDeath>(
			"validateLocationofDeathMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_LOCATIONOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LocationofDeath target) {

			}

			@Override
			protected void updateToPass(LocationofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LocationofDeathOperations.validateLocationofDeathMoodCode(
					(LocationofDeath) objectToTest, diagnostician, map);
			}

		};

		validateLocationofDeathMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationofDeathText() {
			OperationsTestCase<LocationofDeath> validateLocationofDeathTextTestCase = new OperationsTestCase<LocationofDeath>(
			"validateLocationofDeathText",
			operationsForOCL.getOCLValue("VALIDATE_LOCATIONOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LocationofDeath target) {

			}

			@Override
			protected void updateToPass(LocationofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
		ED text = DatatypesFactory.eINSTANCE.createED();
		target.setText(text );	
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LocationofDeathOperations.validateLocationofDeathText(
					(LocationofDeath) objectToTest, diagnostician, map);
			}

		};

		validateLocationofDeathTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationofDeathValue() {
			OperationsTestCase<LocationofDeath> validateLocationofDeathValueTestCase = new OperationsTestCase<LocationofDeath>(
			"validateLocationofDeathValue",
			operationsForOCL.getOCLValue("VALIDATE_LOCATIONOF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LocationofDeath target) {

			}

			@Override
			protected void updateToPass(LocationofDeath target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LocationofDeathOperations.validateLocationofDeathValue(
					(LocationofDeath) objectToTest, diagnostician, map);
			}

		};

		validateLocationofDeathValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends LocationofDeathOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LocationofDeath> {
		public LocationofDeath create() {		
			return VsdrFactory.eINSTANCE.createLocationofDeath();
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
	private static class ConstructorTestClass extends LocationofDeathOperations {};
	
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
	
	

	
	
} // LocationofDeathOperations