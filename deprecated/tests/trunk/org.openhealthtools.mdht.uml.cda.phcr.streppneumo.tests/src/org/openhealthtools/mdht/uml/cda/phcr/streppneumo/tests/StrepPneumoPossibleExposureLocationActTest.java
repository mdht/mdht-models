
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoFactory;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoPossibleExposureLocationActOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Exposure Location Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct#validateStrepPneumoPossibleExposureLocationActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Possible Exposure Location Act Status Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoPossibleExposureLocationActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoPossibleExposureLocationActTemplateId() {
      OperationsTestCase<StrepPneumoPossibleExposureLocationAct> validateStrepPneumoPossibleExposureLocationActTemplateIdTestCase = new OperationsTestCase<StrepPneumoPossibleExposureLocationAct>(
      "validateStrepPneumoPossibleExposureLocationActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPossibleExposureLocationAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPossibleExposureLocationAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActTemplateId(
          (StrepPneumoPossibleExposureLocationAct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoPossibleExposureLocationActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoPossibleExposureLocationActClassCode() {
      OperationsTestCase<StrepPneumoPossibleExposureLocationAct> validateStrepPneumoPossibleExposureLocationActClassCodeTestCase = new OperationsTestCase<StrepPneumoPossibleExposureLocationAct>(
      "validateStrepPneumoPossibleExposureLocationActClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPossibleExposureLocationAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPossibleExposureLocationAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActClassCode(
          (StrepPneumoPossibleExposureLocationAct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoPossibleExposureLocationActClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoPossibleExposureLocationActCode() {
      OperationsTestCase<StrepPneumoPossibleExposureLocationAct> validateStrepPneumoPossibleExposureLocationActCodeTestCase = new OperationsTestCase<StrepPneumoPossibleExposureLocationAct>(
      "validateStrepPneumoPossibleExposureLocationActCode",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPossibleExposureLocationAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPossibleExposureLocationAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActCode(
          (StrepPneumoPossibleExposureLocationAct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoPossibleExposureLocationActCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoPossibleExposureLocationActMoodCode() {
      OperationsTestCase<StrepPneumoPossibleExposureLocationAct> validateStrepPneumoPossibleExposureLocationActMoodCodeTestCase = new OperationsTestCase<StrepPneumoPossibleExposureLocationAct>(
      "validateStrepPneumoPossibleExposureLocationActMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPossibleExposureLocationAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPossibleExposureLocationAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActMoodCode(
          (StrepPneumoPossibleExposureLocationAct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoPossibleExposureLocationActMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoPossibleExposureLocationActStatusCode() {
      OperationsTestCase<StrepPneumoPossibleExposureLocationAct> validateStrepPneumoPossibleExposureLocationActStatusCodeTestCase = new OperationsTestCase<StrepPneumoPossibleExposureLocationAct>(
      "validateStrepPneumoPossibleExposureLocationActStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPossibleExposureLocationAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPossibleExposureLocationAct target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActStatusCode(
          (StrepPneumoPossibleExposureLocationAct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoPossibleExposureLocationActStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateStrepPneumoPossibleExposureLocationActStatusCodeP() {
      OperationsTestCase<StrepPneumoPossibleExposureLocationAct> validateStrepPneumoPossibleExposureLocationActStatusCodePTestCase = new OperationsTestCase<StrepPneumoPossibleExposureLocationAct>(
      "validateStrepPneumoPossibleExposureLocationActStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPossibleExposureLocationAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPossibleExposureLocationAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPossibleExposureLocationActOperations.validateStrepPneumoPossibleExposureLocationActStatusCodeP(
          (StrepPneumoPossibleExposureLocationAct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoPossibleExposureLocationActStatusCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoPossibleExposureLocationActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoPossibleExposureLocationAct> {
		public StrepPneumoPossibleExposureLocationAct create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoPossibleExposureLocationAct();
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
	private static class ConstructorTestClass extends StrepPneumoPossibleExposureLocationActOperations {};
	
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
	
	

	
	
} // StrepPneumoPossibleExposureLocationActOperations