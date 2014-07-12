
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.OtherPregnancyOutcomesOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Other Pregnancy Outcomes</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.OtherPregnancyOutcomes#validateOtherPregnancyOutcomesEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Pregnancy Outcomes Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class OtherPregnancyOutcomesTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateOtherPregnancyOutcomesTemplateId() {
			OperationsTestCase<OtherPregnancyOutcomes> validateOtherPregnancyOutcomesTemplateIdTestCase = new OperationsTestCase<OtherPregnancyOutcomes>(
			"validateOtherPregnancyOutcomesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOMES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcomes target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcomes target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesTemplateId(
					(OtherPregnancyOutcomes) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomesTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOtherPregnancyOutcomesClassCode() {
			OperationsTestCase<OtherPregnancyOutcomes> validateOtherPregnancyOutcomesClassCodeTestCase = new OperationsTestCase<OtherPregnancyOutcomes>(
			"validateOtherPregnancyOutcomesClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOMES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcomes target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcomes target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesClassCode(
					(OtherPregnancyOutcomes) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomesClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOtherPregnancyOutcomesCode() {
			OperationsTestCase<OtherPregnancyOutcomes> validateOtherPregnancyOutcomesCodeTestCase = new OperationsTestCase<OtherPregnancyOutcomes>(
			"validateOtherPregnancyOutcomesCode",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOMES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcomes target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcomes target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesCode(
					(OtherPregnancyOutcomes) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomesCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOtherPregnancyOutcomesMoodCode() {
			OperationsTestCase<OtherPregnancyOutcomes> validateOtherPregnancyOutcomesMoodCodeTestCase = new OperationsTestCase<OtherPregnancyOutcomes>(
			"validateOtherPregnancyOutcomesMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOMES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcomes target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcomes target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesMoodCode(
					(OtherPregnancyOutcomes) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomesMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOtherPregnancyOutcomesValue() {
			OperationsTestCase<OtherPregnancyOutcomes> validateOtherPregnancyOutcomesValueTestCase = new OperationsTestCase<OtherPregnancyOutcomes>(
			"validateOtherPregnancyOutcomesValue",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOMES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcomes target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcomes target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesValue(
					(OtherPregnancyOutcomes) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomesValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOtherPregnancyOutcomesEffectiveTime() {
			OperationsTestCase<OtherPregnancyOutcomes> validateOtherPregnancyOutcomesEffectiveTimeTestCase = new OperationsTestCase<OtherPregnancyOutcomes>(
			"validateOtherPregnancyOutcomesEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_PREGNANCY_OUTCOMES_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(OtherPregnancyOutcomes target) {

			}

			@Override
			protected void updateToPass(OtherPregnancyOutcomes target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return OtherPregnancyOutcomesOperations.validateOtherPregnancyOutcomesEffectiveTime(
					(OtherPregnancyOutcomes) objectToTest, diagnostician, map);
			}

		};

		validateOtherPregnancyOutcomesEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends OtherPregnancyOutcomesOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OtherPregnancyOutcomes> {
		public OtherPregnancyOutcomes create() {		
			return VsbrFactory.eINSTANCE.createOtherPregnancyOutcomes();
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
	private static class ConstructorTestClass extends OtherPregnancyOutcomesOperations {};
	
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
	
	

	
	
} // OtherPregnancyOutcomesOperations