
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
import org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.PrepregnancyBodyWeightOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prepregnancy Body Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PrepregnancyBodyWeight#validatePrepregnancyBodyWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prepregnancy Body Weight Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PrepregnancyBodyWeightTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePrepregnancyBodyWeightTemplateId() {
			OperationsTestCase<PrepregnancyBodyWeight> validatePrepregnancyBodyWeightTemplateIdTestCase = new OperationsTestCase<PrepregnancyBodyWeight>(
			"validatePrepregnancyBodyWeightTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREPREGNANCY_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrepregnancyBodyWeight target) {

			}

			@Override
			protected void updateToPass(PrepregnancyBodyWeight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightTemplateId(
					(PrepregnancyBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePrepregnancyBodyWeightTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePrepregnancyBodyWeightClassCode() {
			OperationsTestCase<PrepregnancyBodyWeight> validatePrepregnancyBodyWeightClassCodeTestCase = new OperationsTestCase<PrepregnancyBodyWeight>(
			"validatePrepregnancyBodyWeightClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PREPREGNANCY_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrepregnancyBodyWeight target) {

			}

			@Override
			protected void updateToPass(PrepregnancyBodyWeight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightClassCode(
					(PrepregnancyBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePrepregnancyBodyWeightClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePrepregnancyBodyWeightCode() {
			OperationsTestCase<PrepregnancyBodyWeight> validatePrepregnancyBodyWeightCodeTestCase = new OperationsTestCase<PrepregnancyBodyWeight>(
			"validatePrepregnancyBodyWeightCode",
			operationsForOCL.getOCLValue("VALIDATE_PREPREGNANCY_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrepregnancyBodyWeight target) {

			}

			@Override
			protected void updateToPass(PrepregnancyBodyWeight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightCode(
					(PrepregnancyBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePrepregnancyBodyWeightCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePrepregnancyBodyWeightMoodCode() {
			OperationsTestCase<PrepregnancyBodyWeight> validatePrepregnancyBodyWeightMoodCodeTestCase = new OperationsTestCase<PrepregnancyBodyWeight>(
			"validatePrepregnancyBodyWeightMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREPREGNANCY_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrepregnancyBodyWeight target) {

			}

			@Override
			protected void updateToPass(PrepregnancyBodyWeight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightMoodCode(
					(PrepregnancyBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePrepregnancyBodyWeightMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePrepregnancyBodyWeightValue() {
			OperationsTestCase<PrepregnancyBodyWeight> validatePrepregnancyBodyWeightValueTestCase = new OperationsTestCase<PrepregnancyBodyWeight>(
			"validatePrepregnancyBodyWeightValue",
			operationsForOCL.getOCLValue("VALIDATE_PREPREGNANCY_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrepregnancyBodyWeight target) {

			}

			@Override
			protected void updateToPass(PrepregnancyBodyWeight target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrepregnancyBodyWeightOperations.validatePrepregnancyBodyWeightValue(
					(PrepregnancyBodyWeight) objectToTest, diagnostician, map);
			}

		};

		validatePrepregnancyBodyWeightValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PrepregnancyBodyWeightOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrepregnancyBodyWeight> {
		public PrepregnancyBodyWeight create() {		
			return VsbrFactory.eINSTANCE.createPrepregnancyBodyWeight();
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
	private static class ConstructorTestClass extends PrepregnancyBodyWeightOperations {};
	
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
	
	

	
	
} // PrepregnancyBodyWeightOperations