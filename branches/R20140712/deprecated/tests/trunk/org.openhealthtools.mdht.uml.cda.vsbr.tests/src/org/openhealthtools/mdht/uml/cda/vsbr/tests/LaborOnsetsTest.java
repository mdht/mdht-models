
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
import org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborOnsetsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Labor Onsets</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborOnsets#validateLaborOnsetsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Labor Onsets Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class LaborOnsetsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborOnsetsTemplateId() {
			OperationsTestCase<LaborOnsets> validateLaborOnsetsTemplateIdTestCase = new OperationsTestCase<LaborOnsets>(
			"validateLaborOnsetsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LABOR_ONSETS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborOnsets target) {

			}

			@Override
			protected void updateToPass(LaborOnsets target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborOnsetsOperations.validateLaborOnsetsTemplateId(
					(LaborOnsets) objectToTest, diagnostician, map);
			}

		};

		validateLaborOnsetsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborOnsetsClassCode() {
			OperationsTestCase<LaborOnsets> validateLaborOnsetsClassCodeTestCase = new OperationsTestCase<LaborOnsets>(
			"validateLaborOnsetsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_LABOR_ONSETS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborOnsets target) {

			}

			@Override
			protected void updateToPass(LaborOnsets target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborOnsetsOperations.validateLaborOnsetsClassCode(
					(LaborOnsets) objectToTest, diagnostician, map);
			}

		};

		validateLaborOnsetsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborOnsetsCode() {
			OperationsTestCase<LaborOnsets> validateLaborOnsetsCodeTestCase = new OperationsTestCase<LaborOnsets>(
			"validateLaborOnsetsCode",
			operationsForOCL.getOCLValue("VALIDATE_LABOR_ONSETS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborOnsets target) {

			}

			@Override
			protected void updateToPass(LaborOnsets target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborOnsetsOperations.validateLaborOnsetsCode(
					(LaborOnsets) objectToTest, diagnostician, map);
			}

		};

		validateLaborOnsetsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborOnsetsMoodCode() {
			OperationsTestCase<LaborOnsets> validateLaborOnsetsMoodCodeTestCase = new OperationsTestCase<LaborOnsets>(
			"validateLaborOnsetsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_LABOR_ONSETS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborOnsets target) {

			}

			@Override
			protected void updateToPass(LaborOnsets target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborOnsetsOperations.validateLaborOnsetsMoodCode(
					(LaborOnsets) objectToTest, diagnostician, map);
			}

		};

		validateLaborOnsetsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborOnsetsValue() {
			OperationsTestCase<LaborOnsets> validateLaborOnsetsValueTestCase = new OperationsTestCase<LaborOnsets>(
			"validateLaborOnsetsValue",
			operationsForOCL.getOCLValue("VALIDATE_LABOR_ONSETS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborOnsets target) {

			}

			@Override
			protected void updateToPass(LaborOnsets target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborOnsetsOperations.validateLaborOnsetsValue(
					(LaborOnsets) objectToTest, diagnostician, map);
			}

		};

		validateLaborOnsetsValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends LaborOnsetsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LaborOnsets> {
		public LaborOnsets create() {		
			return VsbrFactory.eINSTANCE.createLaborOnsets();
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
	private static class ConstructorTestClass extends LaborOnsetsOperations {};
	
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
	
	

	
	
} // LaborOnsetsOperations