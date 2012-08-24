
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
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.PluralityOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plurality</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.Plurality#validatePluralityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plurality Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PluralityTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePluralityTemplateId() {
			OperationsTestCase<Plurality> validatePluralityTemplateIdTestCase = new OperationsTestCase<Plurality>(
			"validatePluralityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLURALITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Plurality target) {

			}

			@Override
			protected void updateToPass(Plurality target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PluralityOperations.validatePluralityTemplateId(
					(Plurality) objectToTest, diagnostician, map);
			}

		};

		validatePluralityTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePluralityClassCode() {
			OperationsTestCase<Plurality> validatePluralityClassCodeTestCase = new OperationsTestCase<Plurality>(
			"validatePluralityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PLURALITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Plurality target) {

			}

			@Override
			protected void updateToPass(Plurality target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PluralityOperations.validatePluralityClassCode(
					(Plurality) objectToTest, diagnostician, map);
			}

		};

		validatePluralityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePluralityCode() {
			OperationsTestCase<Plurality> validatePluralityCodeTestCase = new OperationsTestCase<Plurality>(
			"validatePluralityCode",
			operationsForOCL.getOCLValue("VALIDATE_PLURALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Plurality target) {

			}

			@Override
			protected void updateToPass(Plurality target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PluralityOperations.validatePluralityCode(
					(Plurality) objectToTest, diagnostician, map);
			}

		};

		validatePluralityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePluralityMoodCode() {
			OperationsTestCase<Plurality> validatePluralityMoodCodeTestCase = new OperationsTestCase<Plurality>(
			"validatePluralityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PLURALITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Plurality target) {

			}

			@Override
			protected void updateToPass(Plurality target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PluralityOperations.validatePluralityMoodCode(
					(Plurality) objectToTest, diagnostician, map);
			}

		};

		validatePluralityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePluralityValue() {
			OperationsTestCase<Plurality> validatePluralityValueTestCase = new OperationsTestCase<Plurality>(
			"validatePluralityValue",
			operationsForOCL.getOCLValue("VALIDATE_PLURALITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Plurality target) {

			}

			@Override
			protected void updateToPass(Plurality target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PluralityOperations.validatePluralityValue(
					(Plurality) objectToTest, diagnostician, map);
			}

		};

		validatePluralityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PluralityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Plurality> {
		public Plurality create() {		
			return VsbrFactory.eINSTANCE.createPlurality();
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
	private static class ConstructorTestClass extends PluralityOperations {};
	
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
	
	

	
	
} // PluralityOperations