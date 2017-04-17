
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

import org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.AutopsyResultsOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Autopsy Results</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.AutopsyResults#validateAutopsyResultsAutopsyReportRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Autopsy Results Autopsy Report Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AutopsyResultsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyResultsTemplateId() {
			OperationsTestCase<AutopsyResults> validateAutopsyResultsTemplateIdTestCase = new OperationsTestCase<AutopsyResults>(
			"validateAutopsyResultsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_RESULTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyResults target) {

			}

			@Override
			protected void updateToPass(AutopsyResults target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyResultsOperations.validateAutopsyResultsTemplateId(
					(AutopsyResults) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyResultsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyResultsClassCode() {
			OperationsTestCase<AutopsyResults> validateAutopsyResultsClassCodeTestCase = new OperationsTestCase<AutopsyResults>(
			"validateAutopsyResultsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_RESULTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyResults target) {

			}

			@Override
			protected void updateToPass(AutopsyResults target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyResultsOperations.validateAutopsyResultsClassCode(
					(AutopsyResults) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyResultsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyResultsMoodCode() {
			OperationsTestCase<AutopsyResults> validateAutopsyResultsMoodCodeTestCase = new OperationsTestCase<AutopsyResults>(
			"validateAutopsyResultsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_RESULTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyResults target) {

			}

			@Override
			protected void updateToPass(AutopsyResults target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyResultsOperations.validateAutopsyResultsMoodCode(
					(AutopsyResults) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyResultsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyResultsCodeP() {
			OperationsTestCase<AutopsyResults> validateAutopsyResultsCodePTestCase = new OperationsTestCase<AutopsyResults>(
			"validateAutopsyResultsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_RESULTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyResults target) {

			}

			@Override
			protected void updateToPass(AutopsyResults target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyResultsOperations.validateAutopsyResultsCodeP(
					(AutopsyResults) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyResultsCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyResultsCode() {
			OperationsTestCase<AutopsyResults> validateAutopsyResultsCodeTestCase = new OperationsTestCase<AutopsyResults>(
			"validateAutopsyResultsCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_RESULTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyResults target) {

			}

			@Override
			protected void updateToPass(AutopsyResults target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyResultsOperations.validateAutopsyResultsCode(
					(AutopsyResults) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyResultsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyResultsValue() {
			OperationsTestCase<AutopsyResults> validateAutopsyResultsValueTestCase = new OperationsTestCase<AutopsyResults>(
			"validateAutopsyResultsValue",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_RESULTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyResults target) {

			}

			@Override
			protected void updateToPass(AutopsyResults target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyResultsOperations.validateAutopsyResultsValue(
					(AutopsyResults) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyResultsValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAutopsyResultsAutopsyReportRelationship() {
			OperationsTestCase<AutopsyResults> validateAutopsyResultsAutopsyReportRelationshipTestCase = new OperationsTestCase<AutopsyResults>(
			"validateAutopsyResultsAutopsyReportRelationship",
			operationsForOCL.getOCLValue("VALIDATE_AUTOPSY_RESULTS_AUTOPSY_REPORT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AutopsyResults target) {

			}

			@Override
			protected void updateToPass(AutopsyResults target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AutopsyResultsOperations.validateAutopsyResultsAutopsyReportRelationship(
					(AutopsyResults) objectToTest, diagnostician, map);
			}

		};

		validateAutopsyResultsAutopsyReportRelationshipTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AutopsyResultsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AutopsyResults> {
		@Override
		public AutopsyResults create() {		
			return VsdrFactory.eINSTANCE.createAutopsyResults();
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
	private static class ConstructorTestClass extends AutopsyResultsOperations {};
	
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
	
	

	
	
} // AutopsyResultsOperations