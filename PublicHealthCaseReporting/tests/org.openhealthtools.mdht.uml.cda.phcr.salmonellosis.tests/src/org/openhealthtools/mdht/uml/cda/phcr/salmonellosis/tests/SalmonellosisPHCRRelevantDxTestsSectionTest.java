
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
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisPHCRRelevantDxTestsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Relevant Dx Tests Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Relevant Dx Tests Section Salmonellosis Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#getSalmonellosisResultOrganizers() <em>Get Salmonellosis Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#getSalmonellosisResultObservations() <em>Get Salmonellosis Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRRelevantDxTestsSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SalmonellosisPHCRRelevantDxTestsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer() {
			OperationsTestCase<SalmonellosisPHCRRelevantDxTestsSection> validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizerTestCase = new OperationsTestCase<SalmonellosisPHCRRelevantDxTestsSection>(
			"validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisPHCRRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(SalmonellosisPHCRRelevantDxTestsSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizer(
					(SalmonellosisPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultOrganizerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation() {
			OperationsTestCase<SalmonellosisPHCRRelevantDxTestsSection> validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservationTestCase = new OperationsTestCase<SalmonellosisPHCRRelevantDxTestsSection>(
			"validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_PHCR_RELEVANT_DX_TESTS_SECTION_SALMONELLOSIS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisPHCRRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(SalmonellosisPHCRRelevantDxTestsSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservation(
					(SalmonellosisPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisPHCRRelevantDxTestsSectionSalmonellosisResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSalmonellosisResultOrganizers() {


SalmonellosisPHCRRelevantDxTestsSection target = objectFactory.create();
target.getSalmonellosisResultOrganizers();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSalmonellosisResultObservations() {


SalmonellosisPHCRRelevantDxTestsSection target = objectFactory.create();
target.getSalmonellosisResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
			OperationsTestCase<SalmonellosisPHCRRelevantDxTestsSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<SalmonellosisPHCRRelevantDxTestsSection>(
			"validateResultsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisPHCRRelevantDxTestsSection target) {

			}

			@Override
			protected void updateToPass(SalmonellosisPHCRRelevantDxTestsSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisPHCRRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(
					(SalmonellosisPHCRRelevantDxTestsSection) objectToTest, diagnostician, map);
			}

		};

		validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SalmonellosisPHCRRelevantDxTestsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SalmonellosisPHCRRelevantDxTestsSection> {
		public SalmonellosisPHCRRelevantDxTestsSection create() {		
			return SalmonellosisFactory.eINSTANCE.createSalmonellosisPHCRRelevantDxTestsSection();
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
	private static class ConstructorTestClass extends SalmonellosisPHCRRelevantDxTestsSectionOperations {};
	
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
	
	

	
	
} // SalmonellosisPHCRRelevantDxTestsSectionOperations