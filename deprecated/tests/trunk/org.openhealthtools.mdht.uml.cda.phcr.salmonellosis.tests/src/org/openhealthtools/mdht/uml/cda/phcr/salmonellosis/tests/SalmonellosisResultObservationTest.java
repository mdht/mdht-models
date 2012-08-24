
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
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisResultObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation#validateSalmonellosisResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SalmonellosisResultObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateSalmonellosisResultObservationCode() {
			OperationsTestCase<SalmonellosisResultObservation> validateSalmonellosisResultObservationCodeTestCase = new OperationsTestCase<SalmonellosisResultObservation>(
			"validateSalmonellosisResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisResultObservation target) {

			}

			@Override
			protected void updateToPass(SalmonellosisResultObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisResultObservationOperations.validateSalmonellosisResultObservationCode(
					(SalmonellosisResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisResultObservationCodeTestCase.doValidationTest();
}



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationTemplateId() {
			OperationsTestCase<SalmonellosisResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<SalmonellosisResultObservation>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisResultObservation target) {

			}

			@Override
			protected void updateToPass(SalmonellosisResultObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisResultObservationOperations.validateResultObservationTemplateId(
					(SalmonellosisResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SalmonellosisResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SalmonellosisResultObservation> {
		public SalmonellosisResultObservation create() {		
			return SalmonellosisFactory.eINSTANCE.createSalmonellosisResultObservation();
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
	private static class ConstructorTestClass extends SalmonellosisResultObservationOperations {};
	
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
	
	

	
	
} // SalmonellosisResultObservationOperations