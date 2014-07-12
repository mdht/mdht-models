
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
import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanDispositionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Nonhuman Disposition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#validateNonhumanDispositionPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Nonhuman Disposition Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class NonhumanDispositionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanDispositionTemplateId() {
      OperationsTestCase<NonhumanDisposition> validateNonhumanDispositionTemplateIdTestCase = new OperationsTestCase<NonhumanDisposition>(
      "validateNonhumanDispositionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_DISPOSITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanDisposition target) {

      }

      @Override
      protected void updateToPass(NonhumanDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanDispositionOperations.validateNonhumanDispositionTemplateId(
          (NonhumanDisposition) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanDispositionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanDispositionClassCode() {
      OperationsTestCase<NonhumanDisposition> validateNonhumanDispositionClassCodeTestCase = new OperationsTestCase<NonhumanDisposition>(
      "validateNonhumanDispositionClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_DISPOSITION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanDisposition target) {

      }

      @Override
      protected void updateToPass(NonhumanDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanDispositionOperations.validateNonhumanDispositionClassCode(
          (NonhumanDisposition) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanDispositionClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanDispositionCode() {
      OperationsTestCase<NonhumanDisposition> validateNonhumanDispositionCodeTestCase = new OperationsTestCase<NonhumanDisposition>(
      "validateNonhumanDispositionCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_DISPOSITION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanDisposition target) {

      }

      @Override
      protected void updateToPass(NonhumanDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanDispositionOperations.validateNonhumanDispositionCode(
          (NonhumanDisposition) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanDispositionCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanDispositionEffectiveTime() {
      OperationsTestCase<NonhumanDisposition> validateNonhumanDispositionEffectiveTimeTestCase = new OperationsTestCase<NonhumanDisposition>(
      "validateNonhumanDispositionEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_DISPOSITION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanDisposition target) {

      }

      @Override
      protected void updateToPass(NonhumanDisposition target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanDispositionOperations.validateNonhumanDispositionEffectiveTime(
          (NonhumanDisposition) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanDispositionEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanDispositionId() {
      OperationsTestCase<NonhumanDisposition> validateNonhumanDispositionIdTestCase = new OperationsTestCase<NonhumanDisposition>(
      "validateNonhumanDispositionId",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_DISPOSITION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanDisposition target) {

      }

      @Override
      protected void updateToPass(NonhumanDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanDispositionOperations.validateNonhumanDispositionId(
          (NonhumanDisposition) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanDispositionIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanDispositionMoodCode() {
      OperationsTestCase<NonhumanDisposition> validateNonhumanDispositionMoodCodeTestCase = new OperationsTestCase<NonhumanDisposition>(
      "validateNonhumanDispositionMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_DISPOSITION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanDisposition target) {

      }

      @Override
      protected void updateToPass(NonhumanDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanDispositionOperations.validateNonhumanDispositionMoodCode(
          (NonhumanDisposition) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanDispositionMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanDispositionStudyDayPeriod() {
      OperationsTestCase<NonhumanDisposition> validateNonhumanDispositionStudyDayPeriodTestCase = new OperationsTestCase<NonhumanDisposition>(
      "validateNonhumanDispositionStudyDayPeriod",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_DISPOSITION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanDisposition target) {

      }

      @Override
      protected void updateToPass(NonhumanDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanDispositionOperations.validateNonhumanDispositionStudyDayPeriod(
          (NonhumanDisposition) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanDispositionStudyDayPeriodTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNonhumanDispositionPlannedStudyDay() {
      OperationsTestCase<NonhumanDisposition> validateNonhumanDispositionPlannedStudyDayTestCase = new OperationsTestCase<NonhumanDisposition>(
      "validateNonhumanDispositionPlannedStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_NONHUMAN_DISPOSITION_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NonhumanDisposition target) {

      }

      @Override
      protected void updateToPass(NonhumanDisposition target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NonhumanDispositionOperations.validateNonhumanDispositionPlannedStudyDay(
          (NonhumanDisposition) objectToTest, diagnostician, map);
      }

    };

    validateNonhumanDispositionPlannedStudyDayTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStudyDayPeriod() {


NonhumanDisposition target = objectFactory.create();
target.getStudyDayPeriod();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlannedStudyDay() {


NonhumanDisposition target = objectFactory.create();
target.getPlannedStudyDay();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends NonhumanDispositionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonhumanDisposition> {
		public NonhumanDisposition create() {		
			return SdtmFactory.eINSTANCE.createNonhumanDisposition();
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
	private static class ConstructorTestClass extends NonhumanDispositionOperations {};
	
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
	
	

	
	
} // NonhumanDispositionOperations