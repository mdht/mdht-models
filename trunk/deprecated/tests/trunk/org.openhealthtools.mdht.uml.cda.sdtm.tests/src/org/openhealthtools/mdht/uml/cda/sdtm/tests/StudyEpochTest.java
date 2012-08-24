
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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyEpochOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Epoch</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyEpoch#validateStudyEpochMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Epoch Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StudyEpochTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyEpochTemplateId() {
      OperationsTestCase<StudyEpoch> validateStudyEpochTemplateIdTestCase = new OperationsTestCase<StudyEpoch>(
      "validateStudyEpochTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_EPOCH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyEpoch target) {

      }

      @Override
      protected void updateToPass(StudyEpoch target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyEpochOperations.validateStudyEpochTemplateId(
          (StudyEpoch) objectToTest, diagnostician, map);
      }

    };

    validateStudyEpochTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyEpochClassCode() {
      OperationsTestCase<StudyEpoch> validateStudyEpochClassCodeTestCase = new OperationsTestCase<StudyEpoch>(
      "validateStudyEpochClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_EPOCH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyEpoch target) {

      }

      @Override
      protected void updateToPass(StudyEpoch target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyEpochOperations.validateStudyEpochClassCode(
          (StudyEpoch) objectToTest, diagnostician, map);
      }

    };

    validateStudyEpochClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyEpochCodeP() {
      OperationsTestCase<StudyEpoch> validateStudyEpochCodePTestCase = new OperationsTestCase<StudyEpoch>(
      "validateStudyEpochCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_EPOCH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyEpoch target) {

      }

      @Override
      protected void updateToPass(StudyEpoch target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyEpochOperations.validateStudyEpochCodeP(
          (StudyEpoch) objectToTest, diagnostician, map);
      }

    };

    validateStudyEpochCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyEpochCode() {
      OperationsTestCase<StudyEpoch> validateStudyEpochCodeTestCase = new OperationsTestCase<StudyEpoch>(
      "validateStudyEpochCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_EPOCH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyEpoch target) {

      }

      @Override
      protected void updateToPass(StudyEpoch target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyEpochOperations.validateStudyEpochCode(
          (StudyEpoch) objectToTest, diagnostician, map);
      }

    };

    validateStudyEpochCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyEpochText() {
      OperationsTestCase<StudyEpoch> validateStudyEpochTextTestCase = new OperationsTestCase<StudyEpoch>(
      "validateStudyEpochText",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_EPOCH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyEpoch target) {

      }

      @Override
      protected void updateToPass(StudyEpoch target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyEpochOperations.validateStudyEpochText(
          (StudyEpoch) objectToTest, diagnostician, map);
      }

    };

    validateStudyEpochTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyEpochMoodCode() {
      OperationsTestCase<StudyEpoch> validateStudyEpochMoodCodeTestCase = new OperationsTestCase<StudyEpoch>(
      "validateStudyEpochMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_EPOCH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyEpoch target) {

      }

      @Override
      protected void updateToPass(StudyEpoch target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyEpochOperations.validateStudyEpochMoodCode(
          (StudyEpoch) objectToTest, diagnostician, map);
      }

    };

    validateStudyEpochMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StudyEpochOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StudyEpoch> {
		public StudyEpoch create() {		
			return SdtmFactory.eINSTANCE.createStudyEpoch();
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
	private static class ConstructorTestClass extends StudyEpochOperations {};
	
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
	
	

	
	
} // StudyEpochOperations