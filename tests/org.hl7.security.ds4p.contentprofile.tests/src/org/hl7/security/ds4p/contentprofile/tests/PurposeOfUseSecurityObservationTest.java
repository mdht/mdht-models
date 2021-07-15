
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;


import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation;

import org.hl7.security.ds4p.contentprofile.operations.PurposeOfUseSecurityObservationOperations;

import org.junit.Test;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Purpose Of Use Security Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validateSecurityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validateSecurityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validateSecurityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PurposeOfUseSecurityObservation#validateSecurityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PurposeOfUseSecurityObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSecurityObservationTemplateId() {
			OperationsTestCase<PurposeOfUseSecurityObservation> validateSecurityObservationTemplateIdTestCase = new OperationsTestCase<PurposeOfUseSecurityObservation>(
			"validateSecurityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PurposeOfUseSecurityObservation target) {

			}

			@Override
			protected void updateToPass(PurposeOfUseSecurityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PurposeOfUseSecurityObservationOperations.validateSecurityObservationTemplateId(
					(PurposeOfUseSecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSecurityObservationCodeP() {
			OperationsTestCase<PurposeOfUseSecurityObservation> validateSecurityObservationCodePTestCase = new OperationsTestCase<PurposeOfUseSecurityObservation>(
			"validateSecurityObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PurposeOfUseSecurityObservation target) {

			}

			@Override
			protected void updateToPass(PurposeOfUseSecurityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PurposeOfUseSecurityObservationOperations.validateSecurityObservationCodeP(
					(PurposeOfUseSecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSecurityObservationCode() {
			OperationsTestCase<PurposeOfUseSecurityObservation> validateSecurityObservationCodeTestCase = new OperationsTestCase<PurposeOfUseSecurityObservation>(
			"validateSecurityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PurposeOfUseSecurityObservation target) {

			}

			@Override
			protected void updateToPass(PurposeOfUseSecurityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(PurposeOfUseSecurityObservation target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.hl7.security.ds4p.contentprofile.SecurityObservationCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PurposeOfUseSecurityObservationOperations.validateSecurityObservationCode(
					(PurposeOfUseSecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSecurityObservationValue() {
			OperationsTestCase<PurposeOfUseSecurityObservation> validateSecurityObservationValueTestCase = new OperationsTestCase<PurposeOfUseSecurityObservation>(
			"validateSecurityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PurposeOfUseSecurityObservation target) {

			}

			@Override
			protected void updateToPass(PurposeOfUseSecurityObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PurposeOfUseSecurityObservationOperations.validateSecurityObservationValue(
					(PurposeOfUseSecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PurposeOfUseSecurityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PurposeOfUseSecurityObservation> {
		public PurposeOfUseSecurityObservation create() {		
			return CONTENTPROFILEFactory.eINSTANCE.createPurposeOfUseSecurityObservation();
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
	private static class ConstructorTestClass extends PurposeOfUseSecurityObservationOperations {};
	
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
	
	

	
	
} // PurposeOfUseSecurityObservationOperations