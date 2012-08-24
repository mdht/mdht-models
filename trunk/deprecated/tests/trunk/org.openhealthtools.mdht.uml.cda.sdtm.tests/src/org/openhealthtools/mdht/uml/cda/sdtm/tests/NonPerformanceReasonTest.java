
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
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonPerformanceReasonOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Performance Reason</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason#validateNonPerformanceReasonValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Performance Reason Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class NonPerformanceReasonTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateNonPerformanceReasonTemplateId() {
      OperationsTestCase<NonPerformanceReason> validateNonPerformanceReasonTemplateIdTestCase = new OperationsTestCase<NonPerformanceReason>(
      "validateNonPerformanceReasonTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_NON_PERFORMANCE_REASON_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonPerformanceReason target) {

      }

      @Override
      protected void updateToPass(NonPerformanceReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonPerformanceReasonOperations.validateNonPerformanceReasonTemplateId(
          (NonPerformanceReason) objectToTest, diagnostician, map);
      }

    };

    validateNonPerformanceReasonTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonPerformanceReasonClassCode() {
      OperationsTestCase<NonPerformanceReason> validateNonPerformanceReasonClassCodeTestCase = new OperationsTestCase<NonPerformanceReason>(
      "validateNonPerformanceReasonClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NON_PERFORMANCE_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonPerformanceReason target) {

      }

      @Override
      protected void updateToPass(NonPerformanceReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonPerformanceReasonOperations.validateNonPerformanceReasonClassCode(
          (NonPerformanceReason) objectToTest, diagnostician, map);
      }

    };

    validateNonPerformanceReasonClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonPerformanceReasonCodeP() {
      OperationsTestCase<NonPerformanceReason> validateNonPerformanceReasonCodePTestCase = new OperationsTestCase<NonPerformanceReason>(
      "validateNonPerformanceReasonCodeP",
      operationsForOCL.getOCLValue("VALIDATE_NON_PERFORMANCE_REASON_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonPerformanceReason target) {

      }

      @Override
      protected void updateToPass(NonPerformanceReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonPerformanceReasonOperations.validateNonPerformanceReasonCodeP(
          (NonPerformanceReason) objectToTest, diagnostician, map);
      }

    };

    validateNonPerformanceReasonCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonPerformanceReasonCode() {
      OperationsTestCase<NonPerformanceReason> validateNonPerformanceReasonCodeTestCase = new OperationsTestCase<NonPerformanceReason>(
      "validateNonPerformanceReasonCode",
      operationsForOCL.getOCLValue("VALIDATE_NON_PERFORMANCE_REASON_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonPerformanceReason target) {

      }

      @Override
      protected void updateToPass(NonPerformanceReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonPerformanceReasonOperations.validateNonPerformanceReasonCode(
          (NonPerformanceReason) objectToTest, diagnostician, map);
      }

    };

    validateNonPerformanceReasonCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonPerformanceReasonMoodCode() {
      OperationsTestCase<NonPerformanceReason> validateNonPerformanceReasonMoodCodeTestCase = new OperationsTestCase<NonPerformanceReason>(
      "validateNonPerformanceReasonMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NON_PERFORMANCE_REASON_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonPerformanceReason target) {

      }

      @Override
      protected void updateToPass(NonPerformanceReason target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonPerformanceReasonOperations.validateNonPerformanceReasonMoodCode(
          (NonPerformanceReason) objectToTest, diagnostician, map);
      }

    };

    validateNonPerformanceReasonMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonPerformanceReasonValue() {
      OperationsTestCase<NonPerformanceReason> validateNonPerformanceReasonValueTestCase = new OperationsTestCase<NonPerformanceReason>(
      "validateNonPerformanceReasonValue",
      operationsForOCL.getOCLValue("VALIDATE_NON_PERFORMANCE_REASON_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonPerformanceReason target) {

      }

      @Override
      protected void updateToPass(NonPerformanceReason target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonPerformanceReasonOperations.validateNonPerformanceReasonValue(
          (NonPerformanceReason) objectToTest, diagnostician, map);
      }

    };

    validateNonPerformanceReasonValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends NonPerformanceReasonOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonPerformanceReason> {
		public NonPerformanceReason create() {		
			return SdtmFactory.eINSTANCE.createNonPerformanceReason();
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
	private static class ConstructorTestClass extends NonPerformanceReasonOperations {};
	
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
	
	

	
	
} // NonPerformanceReasonOperations