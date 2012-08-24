
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
import org.openhealthtools.mdht.uml.cda.vsbr.Height;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.HeightOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Height</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Height#validateHeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Height Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HeightTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHeightTemplateId() {
			OperationsTestCase<Height> validateHeightTemplateIdTestCase = new OperationsTestCase<Height>(
			"validateHeightTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Height target) {

			}

			@Override
			protected void updateToPass(Height target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HeightOperations.validateHeightTemplateId(
					(Height) objectToTest, diagnostician, map);
			}

		};

		validateHeightTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHeightClassCode() {
			OperationsTestCase<Height> validateHeightClassCodeTestCase = new OperationsTestCase<Height>(
			"validateHeightClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Height target) {

			}

			@Override
			protected void updateToPass(Height target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HeightOperations.validateHeightClassCode(
					(Height) objectToTest, diagnostician, map);
			}

		};

		validateHeightClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHeightCode() {
			OperationsTestCase<Height> validateHeightCodeTestCase = new OperationsTestCase<Height>(
			"validateHeightCode",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Height target) {

			}

			@Override
			protected void updateToPass(Height target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HeightOperations.validateHeightCode(
					(Height) objectToTest, diagnostician, map);
			}

		};

		validateHeightCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHeightMoodCode() {
			OperationsTestCase<Height> validateHeightMoodCodeTestCase = new OperationsTestCase<Height>(
			"validateHeightMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Height target) {

			}

			@Override
			protected void updateToPass(Height target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HeightOperations.validateHeightMoodCode(
					(Height) objectToTest, diagnostician, map);
			}

		};

		validateHeightMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHeightValue() {
			OperationsTestCase<Height> validateHeightValueTestCase = new OperationsTestCase<Height>(
			"validateHeightValue",
			operationsForOCL.getOCLValue("VALIDATE_HEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Height target) {

			}

			@Override
			protected void updateToPass(Height target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HeightOperations.validateHeightValue(
					(Height) objectToTest, diagnostician, map);
			}

		};

		validateHeightValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends HeightOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Height> {
		public Height create() {		
			return VsbrFactory.eINSTANCE.createHeight();
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
	private static class ConstructorTestClass extends HeightOperations {};
	
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
	
	

	
	
} // HeightOperations