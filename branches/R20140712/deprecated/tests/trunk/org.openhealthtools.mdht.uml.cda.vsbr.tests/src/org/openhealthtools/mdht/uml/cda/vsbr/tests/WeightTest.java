
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
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.Weight;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.WeightOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Weight#validateWeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Weight Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Weight#validateWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Weight#validateWeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Weight Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Weight#validateWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Weight#validateWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Weight Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WeightTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateWeightTemplateId() {
			OperationsTestCase<Weight> validateWeightTemplateIdTestCase = new OperationsTestCase<Weight>(
			"validateWeightTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Weight target) {

			}

			@Override
			protected void updateToPass(Weight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WeightOperations.validateWeightTemplateId(
					(Weight) objectToTest, diagnostician, map);
			}

		};

		validateWeightTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWeightClassCode() {
			OperationsTestCase<Weight> validateWeightClassCodeTestCase = new OperationsTestCase<Weight>(
			"validateWeightClassCode",
			operationsForOCL.getOCLValue("VALIDATE_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Weight target) {

			}

			@Override
			protected void updateToPass(Weight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WeightOperations.validateWeightClassCode(
					(Weight) objectToTest, diagnostician, map);
			}

		};

		validateWeightClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWeightCode() {
			OperationsTestCase<Weight> validateWeightCodeTestCase = new OperationsTestCase<Weight>(
			"validateWeightCode",
			operationsForOCL.getOCLValue("VALIDATE_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Weight target) {

			}

			@Override
			protected void updateToPass(Weight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WeightOperations.validateWeightCode(
					(Weight) objectToTest, diagnostician, map);
			}

		};

		validateWeightCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWeightMoodCode() {
			OperationsTestCase<Weight> validateWeightMoodCodeTestCase = new OperationsTestCase<Weight>(
			"validateWeightMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Weight target) {

			}

			@Override
			protected void updateToPass(Weight target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WeightOperations.validateWeightMoodCode(
					(Weight) objectToTest, diagnostician, map);
			}

		};

		validateWeightMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWeightValue() {
			OperationsTestCase<Weight> validateWeightValueTestCase = new OperationsTestCase<Weight>(
			"validateWeightValue",
			operationsForOCL.getOCLValue("VALIDATE_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Weight target) {

			}

			@Override
			protected void updateToPass(Weight target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WeightOperations.validateWeightValue(
					(Weight) objectToTest, diagnostician, map);
			}

		};

		validateWeightValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends WeightOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Weight> {
		public Weight create() {		
			return VsbrFactory.eINSTANCE.createWeight();
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
	private static class ConstructorTestClass extends WeightOperations {};
	
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
	
	

	
	
} // WeightOperations