
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
import org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.TobaccoUseOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tobacco Use</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.TobaccoUse#validateTobaccoUseValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TobaccoUseTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTobaccoUseTemplateId() {
			OperationsTestCase<TobaccoUse> validateTobaccoUseTemplateIdTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TobaccoUseOperations.validateTobaccoUseTemplateId(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTobaccoUseClassCode() {
			OperationsTestCase<TobaccoUse> validateTobaccoUseClassCodeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TobaccoUseOperations.validateTobaccoUseClassCode(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTobaccoUseCode() {
			OperationsTestCase<TobaccoUse> validateTobaccoUseCodeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TobaccoUseOperations.validateTobaccoUseCode(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTobaccoUseMoodCode() {
			OperationsTestCase<TobaccoUse> validateTobaccoUseMoodCodeTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TobaccoUseOperations.validateTobaccoUseMoodCode(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTobaccoUseValue() {
			OperationsTestCase<TobaccoUse> validateTobaccoUseValueTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseValue",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TobaccoUseOperations.validateTobaccoUseValue(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTobaccoUseValueP() {
			OperationsTestCase<TobaccoUse> validateTobaccoUseValuePTestCase = new OperationsTestCase<TobaccoUse>(
			"validateTobaccoUseValueP",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(TobaccoUse target) {

			}

			@Override
			protected void updateToPass(TobaccoUse target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return TobaccoUseOperations.validateTobaccoUseValueP(
					(TobaccoUse) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TobaccoUseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TobaccoUse> {
		public TobaccoUse create() {		
			return VsdrFactory.eINSTANCE.createTobaccoUse();
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
	private static class ConstructorTestClass extends TobaccoUseOperations {};
	
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
	
	

	
	
} // TobaccoUseOperations