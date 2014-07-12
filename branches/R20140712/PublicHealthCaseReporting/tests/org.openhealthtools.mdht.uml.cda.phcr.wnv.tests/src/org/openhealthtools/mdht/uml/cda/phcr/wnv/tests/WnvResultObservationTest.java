
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.wnv.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvFactory;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.operations.WnvResultObservationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation#validateWnvResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation#validateWnvResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WnvResultObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateWnvResultObservationCodeP() {
      OperationsTestCase<WnvResultObservation> validateWnvResultObservationCodePTestCase = new OperationsTestCase<WnvResultObservation>(
      "validateWnvResultObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_WNV_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvResultObservation target) {

      }

      @Override
      protected void updateToPass(WnvResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvResultObservationOperations.validateWnvResultObservationCodeP(
          (WnvResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateWnvResultObservationCodePTestCase.doValidationTest();
}




  /**
*
* @generated
*/
@Test

 
                  
public void testValidateWnvResultObservationCode() {
      OperationsTestCase<WnvResultObservation> validateWnvResultObservationCodeTestCase = new OperationsTestCase<WnvResultObservation>(
      "validateWnvResultObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_WNV_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvResultObservation target) {

      }

      @Override
      protected void updateToPass(WnvResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvResultObservationOperations.validateWnvResultObservationCode(
          (WnvResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateWnvResultObservationCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationTemplateId() {
      OperationsTestCase<WnvResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<WnvResultObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WnvResultObservation target) {

      }

      @Override
      protected void updateToPass(WnvResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WnvResultObservationOperations.validateResultObservationTemplateId(
          (WnvResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends WnvResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WnvResultObservation> {
		public WnvResultObservation create() {		
			return WnvFactory.eINSTANCE.createWnvResultObservation();
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
	private static class ConstructorTestClass extends WnvResultObservationOperations {};
	
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
	
	

	
	
} // WnvResultObservationOperations