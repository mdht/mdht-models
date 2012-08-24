
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.DataCollectionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Data Collection</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#validateDataCollectionEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Data Collection Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.DataCollection#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DataCollectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDataCollectionTemplateId() {
      OperationsTestCase<DataCollection> validateDataCollectionTemplateIdTestCase = new OperationsTestCase<DataCollection>(
      "validateDataCollectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_DATA_COLLECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DataCollection target) {

      }

      @Override
      protected void updateToPass(DataCollection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DataCollectionOperations.validateDataCollectionTemplateId(
          (DataCollection) objectToTest, diagnostician, map);
      }

    };

    validateDataCollectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDataCollectionClassCode() {
      OperationsTestCase<DataCollection> validateDataCollectionClassCodeTestCase = new OperationsTestCase<DataCollection>(
      "validateDataCollectionClassCode",
      operationsForOCL.getOCLValue("VALIDATE_DATA_COLLECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DataCollection target) {

      }

      @Override
      protected void updateToPass(DataCollection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DataCollectionOperations.validateDataCollectionClassCode(
          (DataCollection) objectToTest, diagnostician, map);
      }

    };

    validateDataCollectionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDataCollectionCodeP() {
      OperationsTestCase<DataCollection> validateDataCollectionCodePTestCase = new OperationsTestCase<DataCollection>(
      "validateDataCollectionCodeP",
      operationsForOCL.getOCLValue("VALIDATE_DATA_COLLECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DataCollection target) {

      }

      @Override
      protected void updateToPass(DataCollection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DataCollectionOperations.validateDataCollectionCodeP(
          (DataCollection) objectToTest, diagnostician, map);
      }

    };

    validateDataCollectionCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDataCollectionCode() {
      OperationsTestCase<DataCollection> validateDataCollectionCodeTestCase = new OperationsTestCase<DataCollection>(
      "validateDataCollectionCode",
      operationsForOCL.getOCLValue("VALIDATE_DATA_COLLECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DataCollection target) {

      }

      @Override
      protected void updateToPass(DataCollection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DataCollectionOperations.validateDataCollectionCode(
          (DataCollection) objectToTest, diagnostician, map);
      }

    };

    validateDataCollectionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDataCollectionEffectiveTime() {
      OperationsTestCase<DataCollection> validateDataCollectionEffectiveTimeTestCase = new OperationsTestCase<DataCollection>(
      "validateDataCollectionEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_DATA_COLLECTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DataCollection target) {

      }

      @Override
      protected void updateToPass(DataCollection target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DataCollectionOperations.validateDataCollectionEffectiveTime(
          (DataCollection) objectToTest, diagnostician, map);
      }

    };

    validateDataCollectionEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDataCollectionMoodCode() {
      OperationsTestCase<DataCollection> validateDataCollectionMoodCodeTestCase = new OperationsTestCase<DataCollection>(
      "validateDataCollectionMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_DATA_COLLECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DataCollection target) {

      }

      @Override
      protected void updateToPass(DataCollection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DataCollectionOperations.validateDataCollectionMoodCode(
          (DataCollection) objectToTest, diagnostician, map);
      }

    };

    validateDataCollectionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDataCollectionNegationInd() {
      OperationsTestCase<DataCollection> validateDataCollectionNegationIndTestCase = new OperationsTestCase<DataCollection>(
      "validateDataCollectionNegationInd",
      operationsForOCL.getOCLValue("VALIDATE_DATA_COLLECTION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DataCollection target) {

      }

      @Override
      protected void updateToPass(DataCollection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DataCollectionOperations.validateDataCollectionNegationInd(
          (DataCollection) objectToTest, diagnostician, map);
      }

    };

    validateDataCollectionNegationIndTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDataCollectionEventStudyDay() {
      OperationsTestCase<DataCollection> validateDataCollectionEventStudyDayTestCase = new OperationsTestCase<DataCollection>(
      "validateDataCollectionEventStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_DATA_COLLECTION_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DataCollection target) {

      }

      @Override
      protected void updateToPass(DataCollection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DataCollectionOperations.validateDataCollectionEventStudyDay(
          (DataCollection) objectToTest, diagnostician, map);
      }

    };

    validateDataCollectionEventStudyDayTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetEventStudyDay() {


DataCollection target = objectFactory.create();
target.getEventStudyDay();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DataCollectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DataCollection> {
		public DataCollection create() {		
			return SdtmFactory.eINSTANCE.createDataCollection();
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
	private static class ConstructorTestClass extends DataCollectionOperations {};
	
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
	
	

	
	
} // DataCollectionOperations