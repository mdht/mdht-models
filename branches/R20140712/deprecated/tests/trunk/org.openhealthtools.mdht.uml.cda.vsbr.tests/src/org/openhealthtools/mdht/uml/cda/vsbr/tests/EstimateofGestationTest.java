
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
import org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.EstimateofGestationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Estimateof Gestation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.EstimateofGestation#validateEstimateofGestationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimateof Gestation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class EstimateofGestationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateEstimateofGestationTemplateId() {
			OperationsTestCase<EstimateofGestation> validateEstimateofGestationTemplateIdTestCase = new OperationsTestCase<EstimateofGestation>(
			"validateEstimateofGestationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATEOF_GESTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EstimateofGestation target) {

			}

			@Override
			protected void updateToPass(EstimateofGestation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EstimateofGestationOperations.validateEstimateofGestationTemplateId(
					(EstimateofGestation) objectToTest, diagnostician, map);
			}

		};

		validateEstimateofGestationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEstimateofGestationClassCode() {
			OperationsTestCase<EstimateofGestation> validateEstimateofGestationClassCodeTestCase = new OperationsTestCase<EstimateofGestation>(
			"validateEstimateofGestationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATEOF_GESTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EstimateofGestation target) {

			}

			@Override
			protected void updateToPass(EstimateofGestation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EstimateofGestationOperations.validateEstimateofGestationClassCode(
					(EstimateofGestation) objectToTest, diagnostician, map);
			}

		};

		validateEstimateofGestationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEstimateofGestationCode() {
			OperationsTestCase<EstimateofGestation> validateEstimateofGestationCodeTestCase = new OperationsTestCase<EstimateofGestation>(
			"validateEstimateofGestationCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATEOF_GESTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EstimateofGestation target) {

			}

			@Override
			protected void updateToPass(EstimateofGestation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EstimateofGestationOperations.validateEstimateofGestationCode(
					(EstimateofGestation) objectToTest, diagnostician, map);
			}

		};

		validateEstimateofGestationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEstimateofGestationMoodCode() {
			OperationsTestCase<EstimateofGestation> validateEstimateofGestationMoodCodeTestCase = new OperationsTestCase<EstimateofGestation>(
			"validateEstimateofGestationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATEOF_GESTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EstimateofGestation target) {

			}

			@Override
			protected void updateToPass(EstimateofGestation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EstimateofGestationOperations.validateEstimateofGestationMoodCode(
					(EstimateofGestation) objectToTest, diagnostician, map);
			}

		};

		validateEstimateofGestationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEstimateofGestationValue() {
			OperationsTestCase<EstimateofGestation> validateEstimateofGestationValueTestCase = new OperationsTestCase<EstimateofGestation>(
			"validateEstimateofGestationValue",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATEOF_GESTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EstimateofGestation target) {

			}

			@Override
			protected void updateToPass(EstimateofGestation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EstimateofGestationOperations.validateEstimateofGestationValue(
					(EstimateofGestation) objectToTest, diagnostician, map);
			}

		};

		validateEstimateofGestationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends EstimateofGestationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EstimateofGestation> {
		public EstimateofGestation create() {		
			return VsbrFactory.eINSTANCE.createEstimateofGestation();
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
	private static class ConstructorTestClass extends EstimateofGestationOperations {};
	
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
	
	

	
	
} // EstimateofGestationOperations