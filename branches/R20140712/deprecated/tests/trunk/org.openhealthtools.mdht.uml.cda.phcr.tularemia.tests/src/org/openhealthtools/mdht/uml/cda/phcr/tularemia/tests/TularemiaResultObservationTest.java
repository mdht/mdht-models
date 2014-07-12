
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaResultObservationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation#validateTularemiaResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation#validateTularemiaResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TularemiaResultObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateTularemiaResultObservationCodeP() {
      OperationsTestCase<TularemiaResultObservation> validateTularemiaResultObservationCodePTestCase = new OperationsTestCase<TularemiaResultObservation>(
      "validateTularemiaResultObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaResultObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaResultObservationOperations.validateTularemiaResultObservationCodeP(
          (TularemiaResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaResultObservationCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaResultObservationCode() {
      OperationsTestCase<TularemiaResultObservation> validateTularemiaResultObservationCodeTestCase = new OperationsTestCase<TularemiaResultObservation>(
      "validateTularemiaResultObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaResultObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaResultObservationOperations.validateTularemiaResultObservationCode(
          (TularemiaResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaResultObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationTemplateId() {
      OperationsTestCase<TularemiaResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<TularemiaResultObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaResultObservation target) {

      }

      @Override
      protected void updateToPass(TularemiaResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaResultObservationOperations.validateResultObservationTemplateId(
          (TularemiaResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TularemiaResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TularemiaResultObservation> {
		public TularemiaResultObservation create() {		
			return TularemiaFactory.eINSTANCE.createTularemiaResultObservation();
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
	private static class ConstructorTestClass extends TularemiaResultObservationOperations {};
	
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
	
	

	
	
} // TularemiaResultObservationOperations