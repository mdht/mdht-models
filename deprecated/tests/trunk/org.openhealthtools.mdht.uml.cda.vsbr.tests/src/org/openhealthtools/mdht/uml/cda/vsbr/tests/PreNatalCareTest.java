
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
import org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.PreNatalCareOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pre Natal Care</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.PreNatalCare#validatePreNatalCareEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Natal Care Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PreNatalCareTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePreNatalCareTemplateId() {
			OperationsTestCase<PreNatalCare> validatePreNatalCareTemplateIdTestCase = new OperationsTestCase<PreNatalCare>(
			"validatePreNatalCareTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRE_NATAL_CARE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PreNatalCare target) {

			}

			@Override
			protected void updateToPass(PreNatalCare target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PreNatalCareOperations.validatePreNatalCareTemplateId(
					(PreNatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePreNatalCareTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreNatalCareClassCode() {
			OperationsTestCase<PreNatalCare> validatePreNatalCareClassCodeTestCase = new OperationsTestCase<PreNatalCare>(
			"validatePreNatalCareClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRE_NATAL_CARE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PreNatalCare target) {

			}

			@Override
			protected void updateToPass(PreNatalCare target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PreNatalCareOperations.validatePreNatalCareClassCode(
					(PreNatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePreNatalCareClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreNatalCareCode() {
			OperationsTestCase<PreNatalCare> validatePreNatalCareCodeTestCase = new OperationsTestCase<PreNatalCare>(
			"validatePreNatalCareCode",
			operationsForOCL.getOCLValue("VALIDATE_PRE_NATAL_CARE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PreNatalCare target) {

			}

			@Override
			protected void updateToPass(PreNatalCare target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PreNatalCareOperations.validatePreNatalCareCode(
					(PreNatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePreNatalCareCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreNatalCareEffectiveTime() {
			OperationsTestCase<PreNatalCare> validatePreNatalCareEffectiveTimeTestCase = new OperationsTestCase<PreNatalCare>(
			"validatePreNatalCareEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PRE_NATAL_CARE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PreNatalCare target) {

			}

			@Override
			protected void updateToPass(PreNatalCare target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PreNatalCareOperations.validatePreNatalCareEffectiveTime(
					(PreNatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePreNatalCareEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreNatalCareMoodCode() {
			OperationsTestCase<PreNatalCare> validatePreNatalCareMoodCodeTestCase = new OperationsTestCase<PreNatalCare>(
			"validatePreNatalCareMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRE_NATAL_CARE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PreNatalCare target) {

			}

			@Override
			protected void updateToPass(PreNatalCare target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PreNatalCareOperations.validatePreNatalCareMoodCode(
					(PreNatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePreNatalCareMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreNatalCareNegationInd() {
			OperationsTestCase<PreNatalCare> validatePreNatalCareNegationIndTestCase = new OperationsTestCase<PreNatalCare>(
			"validatePreNatalCareNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PRE_NATAL_CARE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PreNatalCare target) {

			}

			@Override
			protected void updateToPass(PreNatalCare target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PreNatalCareOperations.validatePreNatalCareNegationInd(
					(PreNatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePreNatalCareNegationIndTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreNatalCareEntryRelationship() {
			OperationsTestCase<PreNatalCare> validatePreNatalCareEntryRelationshipTestCase = new OperationsTestCase<PreNatalCare>(
			"validatePreNatalCareEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PRE_NATAL_CARE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PreNatalCare target) {

			}

			@Override
			protected void updateToPass(PreNatalCare target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PreNatalCareOperations.validatePreNatalCareEntryRelationship(
					(PreNatalCare) objectToTest, diagnostician, map);
			}

		};

		validatePreNatalCareEntryRelationshipTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PreNatalCareOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PreNatalCare> {
		public PreNatalCare create() {		
			return VsbrFactory.eINSTANCE.createPreNatalCare();
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
	private static class ConstructorTestClass extends PreNatalCareOperations {};
	
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
	
	

	
	
} // PreNatalCareOperations