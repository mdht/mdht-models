
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
import org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation;

import org.hl7.security.ds4p.contentprofile.operations.ConfidentialitySecurityObservationOperations;

import org.junit.Test;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Confidentiality Security Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation#validateSecurityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation#validateSecurityObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation#validateSecurityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.ConfidentialitySecurityObservation#validateSecurityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ConfidentialitySecurityObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSecurityObservationTemplateId() {
			OperationsTestCase<ConfidentialitySecurityObservation> validateSecurityObservationTemplateIdTestCase = new OperationsTestCase<ConfidentialitySecurityObservation>(
			"validateSecurityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConfidentialitySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ConfidentialitySecurityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConfidentialitySecurityObservationOperations.validateSecurityObservationTemplateId(
					(ConfidentialitySecurityObservation) objectToTest, diagnostician, map);
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
			OperationsTestCase<ConfidentialitySecurityObservation> validateSecurityObservationCodePTestCase = new OperationsTestCase<ConfidentialitySecurityObservation>(
			"validateSecurityObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConfidentialitySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ConfidentialitySecurityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConfidentialitySecurityObservationOperations.validateSecurityObservationCodeP(
					(ConfidentialitySecurityObservation) objectToTest, diagnostician, map);
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
			OperationsTestCase<ConfidentialitySecurityObservation> validateSecurityObservationCodeTestCase = new OperationsTestCase<ConfidentialitySecurityObservation>(
			"validateSecurityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConfidentialitySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ConfidentialitySecurityObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(ConfidentialitySecurityObservation target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.hl7.security.ds4p.contentprofile.SecurityObservationCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConfidentialitySecurityObservationOperations.validateSecurityObservationCode(
					(ConfidentialitySecurityObservation) objectToTest, diagnostician, map);
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
			OperationsTestCase<ConfidentialitySecurityObservation> validateSecurityObservationValueTestCase = new OperationsTestCase<ConfidentialitySecurityObservation>(
			"validateSecurityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SECURITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConfidentialitySecurityObservation target) {

			}

			@Override
			protected void updateToPass(ConfidentialitySecurityObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConfidentialitySecurityObservationOperations.validateSecurityObservationValue(
					(ConfidentialitySecurityObservation) objectToTest, diagnostician, map);
			}

		};

		validateSecurityObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ConfidentialitySecurityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConfidentialitySecurityObservation> {
		public ConfidentialitySecurityObservation create() {		
			return CONTENTPROFILEFactory.eINSTANCE.createConfidentialitySecurityObservation();
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
	private static class ConstructorTestClass extends ConfidentialitySecurityObservationOperations {};
	
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
	
	

	
	
} // ConfidentialitySecurityObservationOperations