
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisPossibleExposureLocationAndTypeActOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Possible Exposure Location And Type Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPossibleExposureLocationAndTypeAct#validateSilicosisPossibleExposureLocationAndTypeActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Possible Exposure Location And Type Act Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SilicosisPossibleExposureLocationAndTypeActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPossibleExposureLocationAndTypeActTemplateId() {
      OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct> validateSilicosisPossibleExposureLocationAndTypeActTemplateIdTestCase = new OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct>(
      "validateSilicosisPossibleExposureLocationAndTypeActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPossibleExposureLocationAndTypeAct target) {

      }

      @Override
      protected void updateToPass(SilicosisPossibleExposureLocationAndTypeAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActTemplateId(
          (SilicosisPossibleExposureLocationAndTypeAct) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPossibleExposureLocationAndTypeActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPossibleExposureLocationAndTypeActClassCode() {
      OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct> validateSilicosisPossibleExposureLocationAndTypeActClassCodeTestCase = new OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct>(
      "validateSilicosisPossibleExposureLocationAndTypeActClassCode",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPossibleExposureLocationAndTypeAct target) {

      }

      @Override
      protected void updateToPass(SilicosisPossibleExposureLocationAndTypeAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActClassCode(
          (SilicosisPossibleExposureLocationAndTypeAct) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPossibleExposureLocationAndTypeActClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPossibleExposureLocationAndTypeActCode() {
      OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct> validateSilicosisPossibleExposureLocationAndTypeActCodeTestCase = new OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct>(
      "validateSilicosisPossibleExposureLocationAndTypeActCode",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPossibleExposureLocationAndTypeAct target) {

      }

      @Override
      protected void updateToPass(SilicosisPossibleExposureLocationAndTypeAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActCode(
          (SilicosisPossibleExposureLocationAndTypeAct) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPossibleExposureLocationAndTypeActCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPossibleExposureLocationAndTypeActMoodCode() {
      OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct> validateSilicosisPossibleExposureLocationAndTypeActMoodCodeTestCase = new OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct>(
      "validateSilicosisPossibleExposureLocationAndTypeActMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPossibleExposureLocationAndTypeAct target) {

      }

      @Override
      protected void updateToPass(SilicosisPossibleExposureLocationAndTypeAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActMoodCode(
          (SilicosisPossibleExposureLocationAndTypeAct) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPossibleExposureLocationAndTypeActMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisPossibleExposureLocationAndTypeActStatusCode() {
      OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct> validateSilicosisPossibleExposureLocationAndTypeActStatusCodeTestCase = new OperationsTestCase<SilicosisPossibleExposureLocationAndTypeAct>(
      "validateSilicosisPossibleExposureLocationAndTypeActStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisPossibleExposureLocationAndTypeAct target) {

      }

      @Override
      protected void updateToPass(SilicosisPossibleExposureLocationAndTypeAct target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisPossibleExposureLocationAndTypeActOperations.validateSilicosisPossibleExposureLocationAndTypeActStatusCode(
          (SilicosisPossibleExposureLocationAndTypeAct) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisPossibleExposureLocationAndTypeActStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SilicosisPossibleExposureLocationAndTypeActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SilicosisPossibleExposureLocationAndTypeAct> {
		public SilicosisPossibleExposureLocationAndTypeAct create() {		
			return SilicosisFactory.eINSTANCE.createSilicosisPossibleExposureLocationAndTypeAct();
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
	private static class ConstructorTestClass extends SilicosisPossibleExposureLocationAndTypeActOperations {};
	
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
	
	

	
	
} // SilicosisPossibleExposureLocationAndTypeActOperations