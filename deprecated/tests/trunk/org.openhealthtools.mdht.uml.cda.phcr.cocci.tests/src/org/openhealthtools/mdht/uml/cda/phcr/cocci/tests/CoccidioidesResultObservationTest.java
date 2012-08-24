
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.cocci.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciFactory;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesResultObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation#validateCoccidioidesResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation#validateCoccidioidesResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesResultObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateCoccidioidesResultObservationCodeP() {
      OperationsTestCase<CoccidioidesResultObservation> validateCoccidioidesResultObservationCodePTestCase = new OperationsTestCase<CoccidioidesResultObservation>(
      "validateCoccidioidesResultObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesResultObservation target) {

      }

      @Override
      protected void updateToPass(CoccidioidesResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesResultObservationOperations.validateCoccidioidesResultObservationCodeP(
          (CoccidioidesResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesResultObservationCodePTestCase.doValidationTest();
}




  /**
*
* @generated
*/
@Test

 
                  
public void testValidateCoccidioidesResultObservationCode() {
      OperationsTestCase<CoccidioidesResultObservation> validateCoccidioidesResultObservationCodeTestCase = new OperationsTestCase<CoccidioidesResultObservation>(
      "validateCoccidioidesResultObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesResultObservation target) {

      }

      @Override
      protected void updateToPass(CoccidioidesResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesResultObservationOperations.validateCoccidioidesResultObservationCode(
          (CoccidioidesResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesResultObservationCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationTemplateId() {
      OperationsTestCase<CoccidioidesResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<CoccidioidesResultObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesResultObservation target) {

      }

      @Override
      protected void updateToPass(CoccidioidesResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesResultObservationOperations.validateResultObservationTemplateId(
          (CoccidioidesResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesResultObservation> {
		public CoccidioidesResultObservation create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesResultObservation();
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
	private static class ConstructorTestClass extends CoccidioidesResultObservationOperations {};
	
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
	
	

	
	
} // CoccidioidesResultObservationOperations