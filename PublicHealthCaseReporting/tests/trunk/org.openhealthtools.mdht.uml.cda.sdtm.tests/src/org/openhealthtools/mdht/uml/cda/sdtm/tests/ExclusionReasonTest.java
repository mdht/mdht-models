
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
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ExclusionReasonOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Exclusion Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason#validateExclusionReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Exclusion Reason Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ExclusionReasonTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateExclusionReasonTemplateId() {
      OperationsTestCase<ExclusionReason> validateExclusionReasonTemplateIdTestCase = new OperationsTestCase<ExclusionReason>(
      "validateExclusionReasonTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EXCLUSION_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ExclusionReason target) {

      }

      @Override
      protected void updateToPass(ExclusionReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ExclusionReasonOperations.validateExclusionReasonTemplateId(
          (ExclusionReason) objectToTest, diagnostician, map);
      }

    };

    validateExclusionReasonTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateExclusionReasonCodeP() {
      OperationsTestCase<ExclusionReason> validateExclusionReasonCodePTestCase = new OperationsTestCase<ExclusionReason>(
      "validateExclusionReasonCodeP",
      operationsForOCL.getOCLValue("VALIDATE_EXCLUSION_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ExclusionReason target) {

      }

      @Override
      protected void updateToPass(ExclusionReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ExclusionReasonOperations.validateExclusionReasonCodeP(
          (ExclusionReason) objectToTest, diagnostician, map);
      }

    };

    validateExclusionReasonCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateExclusionReasonCode() {
      OperationsTestCase<ExclusionReason> validateExclusionReasonCodeTestCase = new OperationsTestCase<ExclusionReason>(
      "validateExclusionReasonCode",
      operationsForOCL.getOCLValue("VALIDATE_EXCLUSION_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ExclusionReason target) {

      }

      @Override
      protected void updateToPass(ExclusionReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ExclusionReasonOperations.validateExclusionReasonCode(
          (ExclusionReason) objectToTest, diagnostician, map);
      }

    };

    validateExclusionReasonCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateExclusionReasonMoodCode() {
      OperationsTestCase<ExclusionReason> validateExclusionReasonMoodCodeTestCase = new OperationsTestCase<ExclusionReason>(
      "validateExclusionReasonMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_EXCLUSION_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ExclusionReason target) {

      }

      @Override
      protected void updateToPass(ExclusionReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ExclusionReasonOperations.validateExclusionReasonMoodCode(
          (ExclusionReason) objectToTest, diagnostician, map);
      }

    };

    validateExclusionReasonMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateExclusionReasonValue() {
      OperationsTestCase<ExclusionReason> validateExclusionReasonValueTestCase = new OperationsTestCase<ExclusionReason>(
      "validateExclusionReasonValue",
      operationsForOCL.getOCLValue("VALIDATE_EXCLUSION_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ExclusionReason target) {

      }

      @Override
      protected void updateToPass(ExclusionReason target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ExclusionReasonOperations.validateExclusionReasonValue(
          (ExclusionReason) objectToTest, diagnostician, map);
      }

    };

    validateExclusionReasonValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ExclusionReasonOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExclusionReason> {
		public ExclusionReason create() {		
			return SdtmFactory.eINSTANCE.createExclusionReason();
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
	private static class ConstructorTestClass extends ExclusionReasonOperations {};
	
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
	
	

	
	
} // ExclusionReasonOperations