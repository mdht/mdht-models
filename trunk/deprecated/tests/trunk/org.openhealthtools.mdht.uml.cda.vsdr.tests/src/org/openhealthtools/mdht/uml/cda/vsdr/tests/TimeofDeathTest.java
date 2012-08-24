
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
import org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.TimeofDeathOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Timeof Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TimeofDeath#validateTimeofDeathText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timeof Death Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TimeofDeathTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTimeofDeathTemplateId() {
			OperationsTestCase<TimeofDeath> validateTimeofDeathTemplateIdTestCase = new OperationsTestCase<TimeofDeath>(
			"validateTimeofDeathTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TimeofDeath target) {

			}

			@Override
			protected void updateToPass(TimeofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TimeofDeathOperations.validateTimeofDeathTemplateId(
					(TimeofDeath) objectToTest, diagnostician, map);
			}

		};

		validateTimeofDeathTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimeofDeathClassCode() {
			OperationsTestCase<TimeofDeath> validateTimeofDeathClassCodeTestCase = new OperationsTestCase<TimeofDeath>(
			"validateTimeofDeathClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TimeofDeath target) {

			}

			@Override
			protected void updateToPass(TimeofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TimeofDeathOperations.validateTimeofDeathClassCode(
					(TimeofDeath) objectToTest, diagnostician, map);
			}

		};

		validateTimeofDeathClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimeofDeathCodeP() {
			OperationsTestCase<TimeofDeath> validateTimeofDeathCodePTestCase = new OperationsTestCase<TimeofDeath>(
			"validateTimeofDeathCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TimeofDeath target) {

			}

			@Override
			protected void updateToPass(TimeofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TimeofDeathOperations.validateTimeofDeathCodeP(
					(TimeofDeath) objectToTest, diagnostician, map);
			}

		};

		validateTimeofDeathCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimeofDeathCode() {
			OperationsTestCase<TimeofDeath> validateTimeofDeathCodeTestCase = new OperationsTestCase<TimeofDeath>(
			"validateTimeofDeathCode",
			operationsForOCL.getOCLValue("VALIDATE_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TimeofDeath target) {

			}

			@Override
			protected void updateToPass(TimeofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TimeofDeathOperations.validateTimeofDeathCode(
					(TimeofDeath) objectToTest, diagnostician, map);
			}

		};

		validateTimeofDeathCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimeofDeathEffectiveTime() {
			OperationsTestCase<TimeofDeath> validateTimeofDeathEffectiveTimeTestCase = new OperationsTestCase<TimeofDeath>(
			"validateTimeofDeathEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TimeofDeath target) {

			}

			@Override
			protected void updateToPass(TimeofDeath target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TimeofDeathOperations.validateTimeofDeathEffectiveTime(
					(TimeofDeath) objectToTest, diagnostician, map);
			}

		};

		validateTimeofDeathEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimeofDeathMoodCode() {
			OperationsTestCase<TimeofDeath> validateTimeofDeathMoodCodeTestCase = new OperationsTestCase<TimeofDeath>(
			"validateTimeofDeathMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TimeofDeath target) {

			}

			@Override
			protected void updateToPass(TimeofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TimeofDeathOperations.validateTimeofDeathMoodCode(
					(TimeofDeath) objectToTest, diagnostician, map);
			}

		};

		validateTimeofDeathMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimeofDeathText() {
			OperationsTestCase<TimeofDeath> validateTimeofDeathTextTestCase = new OperationsTestCase<TimeofDeath>(
			"validateTimeofDeathText",
			operationsForOCL.getOCLValue("VALIDATE_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TimeofDeath target) {

			}

			@Override
			protected void updateToPass(TimeofDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
		ED text = DatatypesFactory.eINSTANCE.createED();
		target.setText(text );	
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TimeofDeathOperations.validateTimeofDeathText(
					(TimeofDeath) objectToTest, diagnostician, map);
			}

		};

		validateTimeofDeathTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TimeofDeathOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TimeofDeath> {
		public TimeofDeath create() {		
			return VsdrFactory.eINSTANCE.createTimeofDeath();
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
	private static class ConstructorTestClass extends TimeofDeathOperations {};
	
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
	
	

	
	
} // TimeofDeathOperations