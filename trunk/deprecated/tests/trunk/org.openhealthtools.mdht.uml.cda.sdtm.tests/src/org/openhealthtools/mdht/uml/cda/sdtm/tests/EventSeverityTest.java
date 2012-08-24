
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
import org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.EventSeverityOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Event Severity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity#validateEventSeverityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Severity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity#validateEventSeverityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Severity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity#validateEventSeverityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Severity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity#validateEventSeverityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Severity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity#validateEventSeverityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Severity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity#validateEventSeverityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Severity Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventSeverity#validateEventSeverityValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Severity Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class EventSeverityTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateEventSeverityTemplateId() {
      OperationsTestCase<EventSeverity> validateEventSeverityTemplateIdTestCase = new OperationsTestCase<EventSeverity>(
      "validateEventSeverityTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_SEVERITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventSeverity target) {

      }

      @Override
      protected void updateToPass(EventSeverity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventSeverityOperations.validateEventSeverityTemplateId(
          (EventSeverity) objectToTest, diagnostician, map);
      }

    };

    validateEventSeverityTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventSeverityClassCode() {
      OperationsTestCase<EventSeverity> validateEventSeverityClassCodeTestCase = new OperationsTestCase<EventSeverity>(
      "validateEventSeverityClassCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_SEVERITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventSeverity target) {

      }

      @Override
      protected void updateToPass(EventSeverity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventSeverityOperations.validateEventSeverityClassCode(
          (EventSeverity) objectToTest, diagnostician, map);
      }

    };

    validateEventSeverityClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventSeverityCodeP() {
      OperationsTestCase<EventSeverity> validateEventSeverityCodePTestCase = new OperationsTestCase<EventSeverity>(
      "validateEventSeverityCodeP",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_SEVERITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventSeverity target) {

      }

      @Override
      protected void updateToPass(EventSeverity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventSeverityOperations.validateEventSeverityCodeP(
          (EventSeverity) objectToTest, diagnostician, map);
      }

    };

    validateEventSeverityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventSeverityCode() {
      OperationsTestCase<EventSeverity> validateEventSeverityCodeTestCase = new OperationsTestCase<EventSeverity>(
      "validateEventSeverityCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_SEVERITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventSeverity target) {

      }

      @Override
      protected void updateToPass(EventSeverity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventSeverityOperations.validateEventSeverityCode(
          (EventSeverity) objectToTest, diagnostician, map);
      }

    };

    validateEventSeverityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventSeverityMoodCode() {
      OperationsTestCase<EventSeverity> validateEventSeverityMoodCodeTestCase = new OperationsTestCase<EventSeverity>(
      "validateEventSeverityMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_SEVERITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventSeverity target) {

      }

      @Override
      protected void updateToPass(EventSeverity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventSeverityOperations.validateEventSeverityMoodCode(
          (EventSeverity) objectToTest, diagnostician, map);
      }

    };

    validateEventSeverityMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventSeverityValue() {
      OperationsTestCase<EventSeverity> validateEventSeverityValueTestCase = new OperationsTestCase<EventSeverity>(
      "validateEventSeverityValue",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_SEVERITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventSeverity target) {

      }

      @Override
      protected void updateToPass(EventSeverity target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventSeverityOperations.validateEventSeverityValue(
          (EventSeverity) objectToTest, diagnostician, map);
      }

    };

    validateEventSeverityValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventSeverityValueP() {
      OperationsTestCase<EventSeverity> validateEventSeverityValuePTestCase = new OperationsTestCase<EventSeverity>(
      "validateEventSeverityValueP",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_SEVERITY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventSeverity target) {

      }

      @Override
      protected void updateToPass(EventSeverity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventSeverityOperations.validateEventSeverityValueP(
          (EventSeverity) objectToTest, diagnostician, map);
      }

    };

    validateEventSeverityValuePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends EventSeverityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EventSeverity> {
		public EventSeverity create() {		
			return SdtmFactory.eINSTANCE.createEventSeverity();
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
	private static class ConstructorTestClass extends EventSeverityOperations {};
	
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
	
	

	
	
} // EventSeverityOperations