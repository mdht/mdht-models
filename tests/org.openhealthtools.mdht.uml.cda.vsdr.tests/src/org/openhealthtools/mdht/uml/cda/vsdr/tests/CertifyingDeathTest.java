
/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.CertifyingDeathOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Certifying Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath#validateCertifyingDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Certifying Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath#validateCertifyingDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Certifying Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath#validateCertifyingDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Certifying Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath#validateCertifyingDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Certifying Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath#validateCertifyingDeathEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Certifying Death Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.CertifyingDeath#validateCertifyingDeathCertificationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Certifying Death Certification Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CertifyingDeathTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCertifyingDeathTemplateId() {
			OperationsTestCase<CertifyingDeath> validateCertifyingDeathTemplateIdTestCase = new OperationsTestCase<CertifyingDeath>(
			"validateCertifyingDeathTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CERTIFYING_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CertifyingDeath target) {

			}

			@Override
			protected void updateToPass(CertifyingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CertifyingDeathOperations.validateCertifyingDeathTemplateId(
					(CertifyingDeath) objectToTest, diagnostician, map);
			}

		};

		validateCertifyingDeathTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCertifyingDeathClassCode() {
			OperationsTestCase<CertifyingDeath> validateCertifyingDeathClassCodeTestCase = new OperationsTestCase<CertifyingDeath>(
			"validateCertifyingDeathClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CERTIFYING_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CertifyingDeath target) {

			}

			@Override
			protected void updateToPass(CertifyingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CertifyingDeathOperations.validateCertifyingDeathClassCode(
					(CertifyingDeath) objectToTest, diagnostician, map);
			}

		};

		validateCertifyingDeathClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCertifyingDeathMoodCode() {
			OperationsTestCase<CertifyingDeath> validateCertifyingDeathMoodCodeTestCase = new OperationsTestCase<CertifyingDeath>(
			"validateCertifyingDeathMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CERTIFYING_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CertifyingDeath target) {

			}

			@Override
			protected void updateToPass(CertifyingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CertifyingDeathOperations.validateCertifyingDeathMoodCode(
					(CertifyingDeath) objectToTest, diagnostician, map);
			}

		};

		validateCertifyingDeathMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCertifyingDeathCode() {
			OperationsTestCase<CertifyingDeath> validateCertifyingDeathCodeTestCase = new OperationsTestCase<CertifyingDeath>(
			"validateCertifyingDeathCode",
			operationsForOCL.getOCLValue("VALIDATE_CERTIFYING_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CertifyingDeath target) {

			}

			@Override
			protected void updateToPass(CertifyingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CertifyingDeathOperations.validateCertifyingDeathCode(
					(CertifyingDeath) objectToTest, diagnostician, map);
			}

		};

		validateCertifyingDeathCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCertifyingDeathEffectiveTime() {
			OperationsTestCase<CertifyingDeath> validateCertifyingDeathEffectiveTimeTestCase = new OperationsTestCase<CertifyingDeath>(
			"validateCertifyingDeathEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CERTIFYING_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CertifyingDeath target) {

			}

			@Override
			protected void updateToPass(CertifyingDeath target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CertifyingDeathOperations.validateCertifyingDeathEffectiveTime(
					(CertifyingDeath) objectToTest, diagnostician, map);
			}

		};

		validateCertifyingDeathEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCertifyingDeathCertificationPerformer() {
			OperationsTestCase<CertifyingDeath> validateCertifyingDeathCertificationPerformerTestCase = new OperationsTestCase<CertifyingDeath>(
			"validateCertifyingDeathCertificationPerformer",
			operationsForOCL.getOCLValue("VALIDATE_CERTIFYING_DEATH_CERTIFICATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(CertifyingDeath target) {

			}

			@Override
			protected void updateToPass(CertifyingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CertifyingDeathOperations.validateCertifyingDeathCertificationPerformer(
					(CertifyingDeath) objectToTest, diagnostician, map);
			}

		};

		validateCertifyingDeathCertificationPerformerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CertifyingDeathOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CertifyingDeath> {
		@Override
		public CertifyingDeath create() {		
			return VsdrFactory.eINSTANCE.createCertifyingDeath();
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
	private static class ConstructorTestClass extends CertifyingDeathOperations {};
	
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
	
	

	
	
} // CertifyingDeathOperations