
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
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisPHCRSocialHistorySectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Social History Section Salmonellosis Possible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis PHCR Social History Section HIV Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#getSalmonellosisPossibleExposureLocationAndTypeActs() <em>Get Salmonellosis Possible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#getHIVStatusObservation() <em>Get HIV Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SalmonellosisPHCRSocialHistorySectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct() {
			OperationsTestCase<SalmonellosisPHCRSocialHistorySection> validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeActTestCase = new OperationsTestCase<SalmonellosisPHCRSocialHistorySection>(
			"validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_SALMONELLOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisPHCRSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SalmonellosisPHCRSocialHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisPHCRSocialHistorySectionOperations.validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeAct(
					(SalmonellosisPHCRSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisPHCRSocialHistorySectionSalmonellosisPossibleExposureLocationAndTypeActTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation() {
			OperationsTestCase<SalmonellosisPHCRSocialHistorySection> validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservationTestCase = new OperationsTestCase<SalmonellosisPHCRSocialHistorySection>(
			"validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_PHCR_SOCIAL_HISTORY_SECTION_HIV_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisPHCRSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SalmonellosisPHCRSocialHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisPHCRSocialHistorySectionOperations.validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservation(
					(SalmonellosisPHCRSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisPHCRSocialHistorySectionHIVStatusObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSalmonellosisPossibleExposureLocationAndTypeActs() {


SalmonellosisPHCRSocialHistorySection target = objectFactory.create();
target.getSalmonellosisPossibleExposureLocationAndTypeActs();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHIVStatusObservation() {


SalmonellosisPHCRSocialHistorySection target = objectFactory.create();
target.getHIVStatusObservation();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistorySectionTemplateId() {
			OperationsTestCase<SalmonellosisPHCRSocialHistorySection> validateSocialHistorySectionTemplateIdTestCase = new OperationsTestCase<SalmonellosisPHCRSocialHistorySection>(
			"validateSocialHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisPHCRSocialHistorySection target) {

			}

			@Override
			protected void updateToPass(SalmonellosisPHCRSocialHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisPHCRSocialHistorySectionOperations.validateSocialHistorySectionTemplateId(
					(SalmonellosisPHCRSocialHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistorySectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SalmonellosisPHCRSocialHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SalmonellosisPHCRSocialHistorySection> {
		public SalmonellosisPHCRSocialHistorySection create() {		
			return SalmonellosisFactory.eINSTANCE.createSalmonellosisPHCRSocialHistorySection();
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
	private static class ConstructorTestClass extends SalmonellosisPHCRSocialHistorySectionOperations {};
	
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
	
	

	
	
} // SalmonellosisPHCRSocialHistorySectionOperations