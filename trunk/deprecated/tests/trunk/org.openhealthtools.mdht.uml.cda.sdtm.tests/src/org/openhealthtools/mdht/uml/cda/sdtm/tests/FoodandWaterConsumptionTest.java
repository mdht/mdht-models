
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
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.FoodandWaterConsumptionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Foodand Water Consumption</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class FoodandWaterConsumptionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionTemplateId() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionTemplateIdTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionTemplateId(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionClassCode() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionClassCodeTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionClassCode",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionClassCode(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionCode() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionCodeTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionCode",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionCode(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionId() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionIdTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionId",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionId(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionMoodCode() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionMoodCodeTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionMoodCode(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionValue() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionValueTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionValue",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionValue(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionStatusCode() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionStatusCodeTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionStatusCode(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionEffectiveTime() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionEffectiveTimeTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionEffectiveTime(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionInterpretationCode() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionInterpretationCodeTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionInterpretationCode(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionNonPerformanceReason() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionNonPerformanceReasonTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionNonPerformanceReason(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionStudyDayPeriod() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionStudyDayPeriodTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionStudyDayPeriod(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionExclusionReason() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionExclusionReasonTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionExclusionReason",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionExclusionReason(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionExclusionReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFoodandWaterConsumptionGroupIdentifier() {
      OperationsTestCase<FoodandWaterConsumption> validateFoodandWaterConsumptionGroupIdentifierTestCase = new OperationsTestCase<FoodandWaterConsumption>(
      "validateFoodandWaterConsumptionGroupIdentifier",
      operationsForOCL.getOCLValue("VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FoodandWaterConsumption target) {

      }

      @Override
      protected void updateToPass(FoodandWaterConsumption target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FoodandWaterConsumptionOperations.validateFoodandWaterConsumptionGroupIdentifier(
          (FoodandWaterConsumption) objectToTest, diagnostician, map);
      }

    };

    validateFoodandWaterConsumptionGroupIdentifierTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


FoodandWaterConsumption target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


FoodandWaterConsumption target = objectFactory.create();
target.getStudyDayPeriod();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetExclusionReason() {


FoodandWaterConsumption target = objectFactory.create();
target.getExclusionReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetGroupIdentifier() {


FoodandWaterConsumption target = objectFactory.create();
target.getGroupIdentifier();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends FoodandWaterConsumptionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FoodandWaterConsumption> {
		public FoodandWaterConsumption create() {		
			return SdtmFactory.eINSTANCE.createFoodandWaterConsumption();
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
	private static class ConstructorTestClass extends FoodandWaterConsumptionOperations {};
	
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
	
	

	
	
} // FoodandWaterConsumptionOperations