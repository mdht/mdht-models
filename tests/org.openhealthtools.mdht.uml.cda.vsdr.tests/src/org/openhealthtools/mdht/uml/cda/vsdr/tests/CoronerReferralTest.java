
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
import org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.CoronerReferralOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coroner Referral</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CoronerReferral#validateCoronerReferralValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coroner Referral Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoronerReferralTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCoronerReferralTemplateId() {
			OperationsTestCase<CoronerReferral> validateCoronerReferralTemplateIdTestCase = new OperationsTestCase<CoronerReferral>(
			"validateCoronerReferralTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CORONER_REFERRAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CoronerReferral target) {

			}

			@Override
			protected void updateToPass(CoronerReferral target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CoronerReferralOperations.validateCoronerReferralTemplateId(
					(CoronerReferral) objectToTest, diagnostician, map);
			}

		};

		validateCoronerReferralTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoronerReferralClassCode() {
			OperationsTestCase<CoronerReferral> validateCoronerReferralClassCodeTestCase = new OperationsTestCase<CoronerReferral>(
			"validateCoronerReferralClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CORONER_REFERRAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CoronerReferral target) {

			}

			@Override
			protected void updateToPass(CoronerReferral target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CoronerReferralOperations.validateCoronerReferralClassCode(
					(CoronerReferral) objectToTest, diagnostician, map);
			}

		};

		validateCoronerReferralClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoronerReferralCodeP() {
			OperationsTestCase<CoronerReferral> validateCoronerReferralCodePTestCase = new OperationsTestCase<CoronerReferral>(
			"validateCoronerReferralCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CORONER_REFERRAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CoronerReferral target) {

			}

			@Override
			protected void updateToPass(CoronerReferral target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CoronerReferralOperations.validateCoronerReferralCodeP(
					(CoronerReferral) objectToTest, diagnostician, map);
			}

		};

		validateCoronerReferralCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoronerReferralCode() {
			OperationsTestCase<CoronerReferral> validateCoronerReferralCodeTestCase = new OperationsTestCase<CoronerReferral>(
			"validateCoronerReferralCode",
			operationsForOCL.getOCLValue("VALIDATE_CORONER_REFERRAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CoronerReferral target) {

			}

			@Override
			protected void updateToPass(CoronerReferral target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CoronerReferralOperations.validateCoronerReferralCode(
					(CoronerReferral) objectToTest, diagnostician, map);
			}

		};

		validateCoronerReferralCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoronerReferralMoodCode() {
			OperationsTestCase<CoronerReferral> validateCoronerReferralMoodCodeTestCase = new OperationsTestCase<CoronerReferral>(
			"validateCoronerReferralMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CORONER_REFERRAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CoronerReferral target) {

			}

			@Override
			protected void updateToPass(CoronerReferral target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CoronerReferralOperations.validateCoronerReferralMoodCode(
					(CoronerReferral) objectToTest, diagnostician, map);
			}

		};

		validateCoronerReferralMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoronerReferralValue() {
			OperationsTestCase<CoronerReferral> validateCoronerReferralValueTestCase = new OperationsTestCase<CoronerReferral>(
			"validateCoronerReferralValue",
			operationsForOCL.getOCLValue("VALIDATE_CORONER_REFERRAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CoronerReferral target) {

			}

			@Override
			protected void updateToPass(CoronerReferral target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CoronerReferralOperations.validateCoronerReferralValue(
					(CoronerReferral) objectToTest, diagnostician, map);
			}

		};

		validateCoronerReferralValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoronerReferralOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoronerReferral> {
		public CoronerReferral create() {		
			return VsdrFactory.eINSTANCE.createCoronerReferral();
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
	private static class ConstructorTestClass extends CoronerReferralOperations {};
	
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
	
	

	
	
} // CoronerReferralOperations