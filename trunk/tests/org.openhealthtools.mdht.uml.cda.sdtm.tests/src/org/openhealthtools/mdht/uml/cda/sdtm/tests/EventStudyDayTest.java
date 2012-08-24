
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
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.EventStudyDayOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Event Study Day</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay#validateEventStudyDayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Study Day Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class EventStudyDayTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateEventStudyDayTemplateId() {
      OperationsTestCase<EventStudyDay> validateEventStudyDayTemplateIdTestCase = new OperationsTestCase<EventStudyDay>(
      "validateEventStudyDayTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventStudyDay target) {

      }

      @Override
      protected void updateToPass(EventStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventStudyDayOperations.validateEventStudyDayTemplateId(
          (EventStudyDay) objectToTest, diagnostician, map);
      }

    };

    validateEventStudyDayTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventStudyDayClassCode() {
      OperationsTestCase<EventStudyDay> validateEventStudyDayClassCodeTestCase = new OperationsTestCase<EventStudyDay>(
      "validateEventStudyDayClassCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventStudyDay target) {

      }

      @Override
      protected void updateToPass(EventStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventStudyDayOperations.validateEventStudyDayClassCode(
          (EventStudyDay) objectToTest, diagnostician, map);
      }

    };

    validateEventStudyDayClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventStudyDayCodeP() {
      OperationsTestCase<EventStudyDay> validateEventStudyDayCodePTestCase = new OperationsTestCase<EventStudyDay>(
      "validateEventStudyDayCodeP",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventStudyDay target) {

      }

      @Override
      protected void updateToPass(EventStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventStudyDayOperations.validateEventStudyDayCodeP(
          (EventStudyDay) objectToTest, diagnostician, map);
      }

    };

    validateEventStudyDayCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventStudyDayCode() {
      OperationsTestCase<EventStudyDay> validateEventStudyDayCodeTestCase = new OperationsTestCase<EventStudyDay>(
      "validateEventStudyDayCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventStudyDay target) {

      }

      @Override
      protected void updateToPass(EventStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventStudyDayOperations.validateEventStudyDayCode(
          (EventStudyDay) objectToTest, diagnostician, map);
      }

    };

    validateEventStudyDayCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventStudyDayMoodCode() {
      OperationsTestCase<EventStudyDay> validateEventStudyDayMoodCodeTestCase = new OperationsTestCase<EventStudyDay>(
      "validateEventStudyDayMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventStudyDay target) {

      }

      @Override
      protected void updateToPass(EventStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventStudyDayOperations.validateEventStudyDayMoodCode(
          (EventStudyDay) objectToTest, diagnostician, map);
      }

    };

    validateEventStudyDayMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventStudyDayValue() {
      OperationsTestCase<EventStudyDay> validateEventStudyDayValueTestCase = new OperationsTestCase<EventStudyDay>(
      "validateEventStudyDayValue",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventStudyDay target) {

      }

      @Override
      protected void updateToPass(EventStudyDay target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventStudyDayOperations.validateEventStudyDayValue(
          (EventStudyDay) objectToTest, diagnostician, map);
      }

    };

    validateEventStudyDayValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends EventStudyDayOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EventStudyDay> {
		public EventStudyDay create() {		
			return SdtmFactory.eINSTANCE.createEventStudyDay();
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
	private static class ConstructorTestClass extends EventStudyDayOperations {};
	
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
	
	

	
	
} // EventStudyDayOperations