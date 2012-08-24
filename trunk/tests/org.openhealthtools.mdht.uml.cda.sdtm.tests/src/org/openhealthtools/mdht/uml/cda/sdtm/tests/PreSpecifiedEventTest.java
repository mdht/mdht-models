
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
import org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PreSpecifiedEventOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pre Specified Event</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PreSpecifiedEvent#validatePreSpecifiedEventValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pre Specified Event Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PreSpecifiedEventTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePreSpecifiedEventTemplateId() {
      OperationsTestCase<PreSpecifiedEvent> validatePreSpecifiedEventTemplateIdTestCase = new OperationsTestCase<PreSpecifiedEvent>(
      "validatePreSpecifiedEventTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PRE_SPECIFIED_EVENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PreSpecifiedEvent target) {

      }

      @Override
      protected void updateToPass(PreSpecifiedEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PreSpecifiedEventOperations.validatePreSpecifiedEventTemplateId(
          (PreSpecifiedEvent) objectToTest, diagnostician, map);
      }

    };

    validatePreSpecifiedEventTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreSpecifiedEventClassCode() {
      OperationsTestCase<PreSpecifiedEvent> validatePreSpecifiedEventClassCodeTestCase = new OperationsTestCase<PreSpecifiedEvent>(
      "validatePreSpecifiedEventClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PRE_SPECIFIED_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PreSpecifiedEvent target) {

      }

      @Override
      protected void updateToPass(PreSpecifiedEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PreSpecifiedEventOperations.validatePreSpecifiedEventClassCode(
          (PreSpecifiedEvent) objectToTest, diagnostician, map);
      }

    };

    validatePreSpecifiedEventClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreSpecifiedEventCodeP() {
      OperationsTestCase<PreSpecifiedEvent> validatePreSpecifiedEventCodePTestCase = new OperationsTestCase<PreSpecifiedEvent>(
      "validatePreSpecifiedEventCodeP",
      operationsForOCL.getOCLValue("VALIDATE_PRE_SPECIFIED_EVENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PreSpecifiedEvent target) {

      }

      @Override
      protected void updateToPass(PreSpecifiedEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PreSpecifiedEventOperations.validatePreSpecifiedEventCodeP(
          (PreSpecifiedEvent) objectToTest, diagnostician, map);
      }

    };

    validatePreSpecifiedEventCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreSpecifiedEventCode() {
      OperationsTestCase<PreSpecifiedEvent> validatePreSpecifiedEventCodeTestCase = new OperationsTestCase<PreSpecifiedEvent>(
      "validatePreSpecifiedEventCode",
      operationsForOCL.getOCLValue("VALIDATE_PRE_SPECIFIED_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PreSpecifiedEvent target) {

      }

      @Override
      protected void updateToPass(PreSpecifiedEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PreSpecifiedEventOperations.validatePreSpecifiedEventCode(
          (PreSpecifiedEvent) objectToTest, diagnostician, map);
      }

    };

    validatePreSpecifiedEventCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreSpecifiedEventMoodCode() {
      OperationsTestCase<PreSpecifiedEvent> validatePreSpecifiedEventMoodCodeTestCase = new OperationsTestCase<PreSpecifiedEvent>(
      "validatePreSpecifiedEventMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PRE_SPECIFIED_EVENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PreSpecifiedEvent target) {

      }

      @Override
      protected void updateToPass(PreSpecifiedEvent target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PreSpecifiedEventOperations.validatePreSpecifiedEventMoodCode(
          (PreSpecifiedEvent) objectToTest, diagnostician, map);
      }

    };

    validatePreSpecifiedEventMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePreSpecifiedEventValue() {
      OperationsTestCase<PreSpecifiedEvent> validatePreSpecifiedEventValueTestCase = new OperationsTestCase<PreSpecifiedEvent>(
      "validatePreSpecifiedEventValue",
      operationsForOCL.getOCLValue("VALIDATE_PRE_SPECIFIED_EVENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PreSpecifiedEvent target) {

      }

      @Override
      protected void updateToPass(PreSpecifiedEvent target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PreSpecifiedEventOperations.validatePreSpecifiedEventValue(
          (PreSpecifiedEvent) objectToTest, diagnostician, map);
      }

    };

    validatePreSpecifiedEventValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PreSpecifiedEventOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PreSpecifiedEvent> {
		public PreSpecifiedEvent create() {		
			return SdtmFactory.eINSTANCE.createPreSpecifiedEvent();
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
	private static class ConstructorTestClass extends PreSpecifiedEventOperations {};
	
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
	
	

	
	
} // PreSpecifiedEventOperations