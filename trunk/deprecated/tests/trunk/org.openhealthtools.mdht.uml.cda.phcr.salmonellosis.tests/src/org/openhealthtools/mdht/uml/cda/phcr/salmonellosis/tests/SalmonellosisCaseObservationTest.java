
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
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisCaseObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation#validateSalmonellosisCaseObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation#validateSalmonellosisCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation#validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Observation Salmonellosis Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation#getSalmonellosisSignsAndSymptomsObservations() <em>Get Salmonellosis Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SalmonellosisCaseObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateSalmonellosisCaseObservationTargetSiteCode() {
			OperationsTestCase<SalmonellosisCaseObservation> validateSalmonellosisCaseObservationTargetSiteCodeTestCase = new OperationsTestCase<SalmonellosisCaseObservation>(
			"validateSalmonellosisCaseObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_CASE_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseObservation target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseObservationOperations.validateSalmonellosisCaseObservationTargetSiteCode(
					(SalmonellosisCaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisCaseObservationTargetSiteCodeTestCase.doValidationTest();
}






  /**
*
* @generated
*/
@Test

 
                  
public void testValidateSalmonellosisCaseObservationValue() {
			OperationsTestCase<SalmonellosisCaseObservation> validateSalmonellosisCaseObservationValueTestCase = new OperationsTestCase<SalmonellosisCaseObservation>(
			"validateSalmonellosisCaseObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseObservation target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseObservationOperations.validateSalmonellosisCaseObservationValue(
					(SalmonellosisCaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisCaseObservationValueTestCase.doValidationTest();
}






/**
*
* @generated
*/
@Test

 
									
public void testValidateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation() {
			OperationsTestCase<SalmonellosisCaseObservation> validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservationTestCase = new OperationsTestCase<SalmonellosisCaseObservation>(
			"validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_CASE_OBSERVATION_SALMONELLOSIS_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseObservation target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseObservationOperations.validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservation(
					(SalmonellosisCaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisCaseObservationSalmonellosisSignsAndSymptomsObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSalmonellosisSignsAndSymptomsObservations() {


SalmonellosisCaseObservation target = objectFactory.create();
target.getSalmonellosisSignsAndSymptomsObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
			OperationsTestCase<SalmonellosisCaseObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<SalmonellosisCaseObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseObservation target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseObservationOperations.validateProblemObservationTemplateId(
					(SalmonellosisCaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SalmonellosisCaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SalmonellosisCaseObservation> {
		public SalmonellosisCaseObservation create() {		
			return SalmonellosisFactory.eINSTANCE.createSalmonellosisCaseObservation();
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
	private static class ConstructorTestClass extends SalmonellosisCaseObservationOperations {};
	
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
	
	

	
	
} // SalmonellosisCaseObservationOperations