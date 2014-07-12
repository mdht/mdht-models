
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisResultObservationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation#validateChlamydiatrachomatisResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ChlamydiatrachomatisResultObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateChlamydiatrachomatisResultObservationCode() {
      OperationsTestCase<ChlamydiatrachomatisResultObservation> validateChlamydiatrachomatisResultObservationCodeTestCase = new OperationsTestCase<ChlamydiatrachomatisResultObservation>(
      "validateChlamydiatrachomatisResultObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisResultObservation target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisResultObservationOperations.validateChlamydiatrachomatisResultObservationCode(
          (ChlamydiatrachomatisResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisResultObservationCodeTestCase.doValidationTest();
}



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationTemplateId() {
      OperationsTestCase<ChlamydiatrachomatisResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<ChlamydiatrachomatisResultObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisResultObservation target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisResultObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisResultObservationOperations.validateResultObservationTemplateId(
          (ChlamydiatrachomatisResultObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ChlamydiatrachomatisResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChlamydiatrachomatisResultObservation> {
		public ChlamydiatrachomatisResultObservation create() {		
			return ChlamydiatrachomatisFactory.eINSTANCE.createChlamydiatrachomatisResultObservation();
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
	private static class ConstructorTestClass extends ChlamydiatrachomatisResultObservationOperations {};
	
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
	
	

	
	
} // ChlamydiatrachomatisResultObservationOperations