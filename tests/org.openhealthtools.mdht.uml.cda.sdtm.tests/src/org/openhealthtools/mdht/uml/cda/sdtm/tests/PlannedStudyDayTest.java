
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
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PlannedStudyDayOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Study Day</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PlannedStudyDayTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePlannedStudyDayTemplateId() {
      OperationsTestCase<PlannedStudyDay> validatePlannedStudyDayTemplateIdTestCase = new OperationsTestCase<PlannedStudyDay>(
      "validatePlannedStudyDayTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PLANNED_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PlannedStudyDay target) {

      }

      @Override
      protected void updateToPass(PlannedStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PlannedStudyDayOperations.validatePlannedStudyDayTemplateId(
          (PlannedStudyDay) objectToTest, diagnostician, map);
      }

    };

    validatePlannedStudyDayTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePlannedStudyDayClassCode() {
      OperationsTestCase<PlannedStudyDay> validatePlannedStudyDayClassCodeTestCase = new OperationsTestCase<PlannedStudyDay>(
      "validatePlannedStudyDayClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PLANNED_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PlannedStudyDay target) {

      }

      @Override
      protected void updateToPass(PlannedStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PlannedStudyDayOperations.validatePlannedStudyDayClassCode(
          (PlannedStudyDay) objectToTest, diagnostician, map);
      }

    };

    validatePlannedStudyDayClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePlannedStudyDayCodeP() {
      OperationsTestCase<PlannedStudyDay> validatePlannedStudyDayCodePTestCase = new OperationsTestCase<PlannedStudyDay>(
      "validatePlannedStudyDayCodeP",
      operationsForOCL.getOCLValue("VALIDATE_PLANNED_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PlannedStudyDay target) {

      }

      @Override
      protected void updateToPass(PlannedStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PlannedStudyDayOperations.validatePlannedStudyDayCodeP(
          (PlannedStudyDay) objectToTest, diagnostician, map);
      }

    };

    validatePlannedStudyDayCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePlannedStudyDayCode() {
      OperationsTestCase<PlannedStudyDay> validatePlannedStudyDayCodeTestCase = new OperationsTestCase<PlannedStudyDay>(
      "validatePlannedStudyDayCode",
      operationsForOCL.getOCLValue("VALIDATE_PLANNED_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PlannedStudyDay target) {

      }

      @Override
      protected void updateToPass(PlannedStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PlannedStudyDayOperations.validatePlannedStudyDayCode(
          (PlannedStudyDay) objectToTest, diagnostician, map);
      }

    };

    validatePlannedStudyDayCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePlannedStudyDayMoodCode() {
      OperationsTestCase<PlannedStudyDay> validatePlannedStudyDayMoodCodeTestCase = new OperationsTestCase<PlannedStudyDay>(
      "validatePlannedStudyDayMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PLANNED_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PlannedStudyDay target) {

      }

      @Override
      protected void updateToPass(PlannedStudyDay target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PlannedStudyDayOperations.validatePlannedStudyDayMoodCode(
          (PlannedStudyDay) objectToTest, diagnostician, map);
      }

    };

    validatePlannedStudyDayMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePlannedStudyDayValue() {
      OperationsTestCase<PlannedStudyDay> validatePlannedStudyDayValueTestCase = new OperationsTestCase<PlannedStudyDay>(
      "validatePlannedStudyDayValue",
      operationsForOCL.getOCLValue("VALIDATE_PLANNED_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PlannedStudyDay target) {

      }

      @Override
      protected void updateToPass(PlannedStudyDay target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PlannedStudyDayOperations.validatePlannedStudyDayValue(
          (PlannedStudyDay) objectToTest, diagnostician, map);
      }

    };

    validatePlannedStudyDayValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PlannedStudyDayOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlannedStudyDay> {
		public PlannedStudyDay create() {		
			return SdtmFactory.eINSTANCE.createPlannedStudyDay();
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
	private static class ConstructorTestClass extends PlannedStudyDayOperations {};
	
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
	
	

	
	
} // PlannedStudyDayOperations