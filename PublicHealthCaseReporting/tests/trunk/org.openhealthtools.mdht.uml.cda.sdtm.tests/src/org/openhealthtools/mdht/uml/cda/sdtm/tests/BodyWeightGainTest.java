
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
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.BodyWeightGainOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Weight Gain</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#validateBodyWeightGainExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Gain Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeightGain#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class BodyWeightGainTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainTemplateId() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainTemplateIdTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainTemplateId(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainClassCode() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainClassCodeTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainClassCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainClassCode(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainCode() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainCodeTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainCode(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainId() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainIdTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainId",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainId(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainMoodCode() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainMoodCodeTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainMoodCode(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainValue() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainValueTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainValue",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainValue(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainStatusCode() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainStatusCodeTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainStatusCode(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainEffectiveTime() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainEffectiveTimeTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainEffectiveTime(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainInterpretationCode() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainInterpretationCodeTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainInterpretationCode(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainNonPerformanceReason() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainNonPerformanceReasonTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainNonPerformanceReason(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainStudyDayPeriod() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainStudyDayPeriodTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainStudyDayPeriod(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainTimingReference() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainTimingReferenceTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainTimingReference",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainTimingReference(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainTimingReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightGainExclusionReason() {
      OperationsTestCase<BodyWeightGain> validateBodyWeightGainExclusionReasonTestCase = new OperationsTestCase<BodyWeightGain>(
      "validateBodyWeightGainExclusionReason",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_GAIN_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeightGain target) {

      }

      @Override
      protected void updateToPass(BodyWeightGain target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightGainOperations.validateBodyWeightGainExclusionReason(
          (BodyWeightGain) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightGainExclusionReasonTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


BodyWeightGain target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


BodyWeightGain target = objectFactory.create();
target.getStudyDayPeriod();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTimingReference() {


BodyWeightGain target = objectFactory.create();
target.getTimingReference();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetExclusionReason() {


BodyWeightGain target = objectFactory.create();
target.getExclusionReason();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends BodyWeightGainOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BodyWeightGain> {
		public BodyWeightGain create() {		
			return SdtmFactory.eINSTANCE.createBodyWeightGain();
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
	private static class ConstructorTestClass extends BodyWeightGainOperations {};
	
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
	
	

	
	
} // BodyWeightGainOperations