
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.HIVStatusObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>HIV Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation#validateHIVStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIV Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation#validateHIVStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIV Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation#validateHIVStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIV Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation#validateHIVStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIV Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation#validateHIVStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIV Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation#validateHIVStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIV Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.HIVStatusObservation#validateHIVStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HIV Status Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HIVStatusObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHIVStatusObservationTemplateId() {
			OperationsTestCase<HIVStatusObservation> validateHIVStatusObservationTemplateIdTestCase = new OperationsTestCase<HIVStatusObservation>(
			"validateHIVStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HIV_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HIVStatusObservation target) {

			}

			@Override
			protected void updateToPass(HIVStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HIVStatusObservationOperations.validateHIVStatusObservationTemplateId(
					(HIVStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHIVStatusObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateHIVStatusObservationCodeP() {
			OperationsTestCase<HIVStatusObservation> validateHIVStatusObservationCodePTestCase = new OperationsTestCase<HIVStatusObservation>(
			"validateHIVStatusObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HIV_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HIVStatusObservation target) {

			}

			@Override
			protected void updateToPass(HIVStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HIVStatusObservationOperations.validateHIVStatusObservationCodeP(
					(HIVStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHIVStatusObservationCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateHIVStatusObservationCode() {
			OperationsTestCase<HIVStatusObservation> validateHIVStatusObservationCodeTestCase = new OperationsTestCase<HIVStatusObservation>(
			"validateHIVStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_HIV_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HIVStatusObservation target) {

			}

			@Override
			protected void updateToPass(HIVStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HIVStatusObservationOperations.validateHIVStatusObservationCode(
					(HIVStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHIVStatusObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHIVStatusObservationStatusCode() {
			OperationsTestCase<HIVStatusObservation> validateHIVStatusObservationStatusCodeTestCase = new OperationsTestCase<HIVStatusObservation>(
			"validateHIVStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_HIV_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HIVStatusObservation target) {

			}

			@Override
			protected void updateToPass(HIVStatusObservation target) {
				target.init();
				
				
				
				
			
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HIVStatusObservationOperations.validateHIVStatusObservationStatusCode(
					(HIVStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHIVStatusObservationStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateHIVStatusObservationValue() {
			OperationsTestCase<HIVStatusObservation> validateHIVStatusObservationValueTestCase = new OperationsTestCase<HIVStatusObservation>(
			"validateHIVStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_HIV_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HIVStatusObservation target) {

			}

			@Override
			protected void updateToPass(HIVStatusObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HIVStatusObservationOperations.validateHIVStatusObservationValue(
					(HIVStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHIVStatusObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateHIVStatusObservationClassCode() {
			OperationsTestCase<HIVStatusObservation> validateHIVStatusObservationClassCodeTestCase = new OperationsTestCase<HIVStatusObservation>(
			"validateHIVStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HIV_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HIVStatusObservation target) {

			}

			@Override
			protected void updateToPass(HIVStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HIVStatusObservationOperations.validateHIVStatusObservationClassCode(
					(HIVStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHIVStatusObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateHIVStatusObservationMoodCode() {
			OperationsTestCase<HIVStatusObservation> validateHIVStatusObservationMoodCodeTestCase = new OperationsTestCase<HIVStatusObservation>(
			"validateHIVStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HIV_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HIVStatusObservation target) {

			}

			@Override
			protected void updateToPass(HIVStatusObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HIVStatusObservationOperations.validateHIVStatusObservationMoodCode(
					(HIVStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHIVStatusObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends HIVStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HIVStatusObservation> {
		public HIVStatusObservation create() {		
			return SalmonellosisFactory.eINSTANCE.createHIVStatusObservation();
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
	private static class ConstructorTestClass extends HIVStatusObservationOperations {};
	
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
	
	

	
	
} // HIVStatusObservationOperations