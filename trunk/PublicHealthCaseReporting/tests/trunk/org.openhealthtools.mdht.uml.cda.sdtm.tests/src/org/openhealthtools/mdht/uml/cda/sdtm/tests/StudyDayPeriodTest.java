
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
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyDayPeriodOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Day Period</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod#validateStudyDayPeriodValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Day Period Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StudyDayPeriodTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyDayPeriodTemplateId() {
      OperationsTestCase<StudyDayPeriod> validateStudyDayPeriodTemplateIdTestCase = new OperationsTestCase<StudyDayPeriod>(
      "validateStudyDayPeriodTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_DAY_PERIOD_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyDayPeriod target) {

      }

      @Override
      protected void updateToPass(StudyDayPeriod target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyDayPeriodOperations.validateStudyDayPeriodTemplateId(
          (StudyDayPeriod) objectToTest, diagnostician, map);
      }

    };

    validateStudyDayPeriodTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyDayPeriodClassCode() {
      OperationsTestCase<StudyDayPeriod> validateStudyDayPeriodClassCodeTestCase = new OperationsTestCase<StudyDayPeriod>(
      "validateStudyDayPeriodClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_DAY_PERIOD_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyDayPeriod target) {

      }

      @Override
      protected void updateToPass(StudyDayPeriod target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyDayPeriodOperations.validateStudyDayPeriodClassCode(
          (StudyDayPeriod) objectToTest, diagnostician, map);
      }

    };

    validateStudyDayPeriodClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyDayPeriodCodeP() {
      OperationsTestCase<StudyDayPeriod> validateStudyDayPeriodCodePTestCase = new OperationsTestCase<StudyDayPeriod>(
      "validateStudyDayPeriodCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_DAY_PERIOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyDayPeriod target) {

      }

      @Override
      protected void updateToPass(StudyDayPeriod target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyDayPeriodOperations.validateStudyDayPeriodCodeP(
          (StudyDayPeriod) objectToTest, diagnostician, map);
      }

    };

    validateStudyDayPeriodCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyDayPeriodCode() {
      OperationsTestCase<StudyDayPeriod> validateStudyDayPeriodCodeTestCase = new OperationsTestCase<StudyDayPeriod>(
      "validateStudyDayPeriodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_DAY_PERIOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyDayPeriod target) {

      }

      @Override
      protected void updateToPass(StudyDayPeriod target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyDayPeriodOperations.validateStudyDayPeriodCode(
          (StudyDayPeriod) objectToTest, diagnostician, map);
      }

    };

    validateStudyDayPeriodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyDayPeriodMoodCode() {
      OperationsTestCase<StudyDayPeriod> validateStudyDayPeriodMoodCodeTestCase = new OperationsTestCase<StudyDayPeriod>(
      "validateStudyDayPeriodMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_DAY_PERIOD_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyDayPeriod target) {

      }

      @Override
      protected void updateToPass(StudyDayPeriod target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyDayPeriodOperations.validateStudyDayPeriodMoodCode(
          (StudyDayPeriod) objectToTest, diagnostician, map);
      }

    };

    validateStudyDayPeriodMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyDayPeriodValue() {
      OperationsTestCase<StudyDayPeriod> validateStudyDayPeriodValueTestCase = new OperationsTestCase<StudyDayPeriod>(
      "validateStudyDayPeriodValue",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_DAY_PERIOD_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyDayPeriod target) {

      }

      @Override
      protected void updateToPass(StudyDayPeriod target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyDayPeriodOperations.validateStudyDayPeriodValue(
          (StudyDayPeriod) objectToTest, diagnostician, map);
      }

    };

    validateStudyDayPeriodValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StudyDayPeriodOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StudyDayPeriod> {
		public StudyDayPeriod create() {		
			return SdtmFactory.eINSTANCE.createStudyDayPeriod();
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
	private static class ConstructorTestClass extends StudyDayPeriodOperations {};
	
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
	
	

	
	
} // StudyDayPeriodOperations