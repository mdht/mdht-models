
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
import org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.ApgarScoreOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Apgar Score</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ApgarScore#validateApgarScoreValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Apgar Score Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ApgarScoreTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateApgarScoreTemplateId() {
			OperationsTestCase<ApgarScore> validateApgarScoreTemplateIdTestCase = new OperationsTestCase<ApgarScore>(
			"validateApgarScoreTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_APGAR_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ApgarScore target) {

			}

			@Override
			protected void updateToPass(ApgarScore target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ApgarScoreOperations.validateApgarScoreTemplateId(
					(ApgarScore) objectToTest, diagnostician, map);
			}

		};

		validateApgarScoreTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateApgarScoreClassCode() {
			OperationsTestCase<ApgarScore> validateApgarScoreClassCodeTestCase = new OperationsTestCase<ApgarScore>(
			"validateApgarScoreClassCode",
			operationsForOCL.getOCLValue("VALIDATE_APGAR_SCORE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ApgarScore target) {

			}

			@Override
			protected void updateToPass(ApgarScore target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ApgarScoreOperations.validateApgarScoreClassCode(
					(ApgarScore) objectToTest, diagnostician, map);
			}

		};

		validateApgarScoreClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateApgarScoreCode() {
			OperationsTestCase<ApgarScore> validateApgarScoreCodeTestCase = new OperationsTestCase<ApgarScore>(
			"validateApgarScoreCode",
			operationsForOCL.getOCLValue("VALIDATE_APGAR_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ApgarScore target) {

			}

			@Override
			protected void updateToPass(ApgarScore target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ApgarScoreOperations.validateApgarScoreCode(
					(ApgarScore) objectToTest, diagnostician, map);
			}

		};

		validateApgarScoreCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateApgarScoreMoodCode() {
			OperationsTestCase<ApgarScore> validateApgarScoreMoodCodeTestCase = new OperationsTestCase<ApgarScore>(
			"validateApgarScoreMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_APGAR_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ApgarScore target) {

			}

			@Override
			protected void updateToPass(ApgarScore target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ApgarScoreOperations.validateApgarScoreMoodCode(
					(ApgarScore) objectToTest, diagnostician, map);
			}

		};

		validateApgarScoreMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateApgarScoreValue() {
			OperationsTestCase<ApgarScore> validateApgarScoreValueTestCase = new OperationsTestCase<ApgarScore>(
			"validateApgarScoreValue",
			operationsForOCL.getOCLValue("VALIDATE_APGAR_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ApgarScore target) {

			}

			@Override
			protected void updateToPass(ApgarScore target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ApgarScoreOperations.validateApgarScoreValue(
					(ApgarScore) objectToTest, diagnostician, map);
			}

		};

		validateApgarScoreValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ApgarScoreOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ApgarScore> {
		public ApgarScore create() {		
			return VsbrFactory.eINSTANCE.createApgarScore();
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
	private static class ConstructorTestClass extends ApgarScoreOperations {};
	
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
	
	

	
	
} // ApgarScoreOperations