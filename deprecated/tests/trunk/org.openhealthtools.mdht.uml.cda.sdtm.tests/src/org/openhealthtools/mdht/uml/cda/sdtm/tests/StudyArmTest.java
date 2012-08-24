
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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyArmOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Arm</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm#validateStudyArmTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Arm Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm#validateStudyArmClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Arm Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm#validateStudyArmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Arm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm#validateStudyArmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Arm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm#validateStudyArmText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Arm Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm#validateStudyArmMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Arm Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyArm#validateStudyArmEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Arm Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StudyArmTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyArmTemplateId() {
      OperationsTestCase<StudyArm> validateStudyArmTemplateIdTestCase = new OperationsTestCase<StudyArm>(
      "validateStudyArmTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_ARM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyArm target) {

      }

      @Override
      protected void updateToPass(StudyArm target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyArmOperations.validateStudyArmTemplateId(
          (StudyArm) objectToTest, diagnostician, map);
      }

    };

    validateStudyArmTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyArmClassCode() {
      OperationsTestCase<StudyArm> validateStudyArmClassCodeTestCase = new OperationsTestCase<StudyArm>(
      "validateStudyArmClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_ARM_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyArm target) {

      }

      @Override
      protected void updateToPass(StudyArm target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyArmOperations.validateStudyArmClassCode(
          (StudyArm) objectToTest, diagnostician, map);
      }

    };

    validateStudyArmClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyArmCodeP() {
      OperationsTestCase<StudyArm> validateStudyArmCodePTestCase = new OperationsTestCase<StudyArm>(
      "validateStudyArmCodeP",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_ARM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyArm target) {

      }

      @Override
      protected void updateToPass(StudyArm target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyArmOperations.validateStudyArmCodeP(
          (StudyArm) objectToTest, diagnostician, map);
      }

    };

    validateStudyArmCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyArmCode() {
      OperationsTestCase<StudyArm> validateStudyArmCodeTestCase = new OperationsTestCase<StudyArm>(
      "validateStudyArmCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_ARM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyArm target) {

      }

      @Override
      protected void updateToPass(StudyArm target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyArmOperations.validateStudyArmCode(
          (StudyArm) objectToTest, diagnostician, map);
      }

    };

    validateStudyArmCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyArmText() {
      OperationsTestCase<StudyArm> validateStudyArmTextTestCase = new OperationsTestCase<StudyArm>(
      "validateStudyArmText",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_ARM_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyArm target) {

      }

      @Override
      protected void updateToPass(StudyArm target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
    target.setText(text );	
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyArmOperations.validateStudyArmText(
          (StudyArm) objectToTest, diagnostician, map);
      }

    };

    validateStudyArmTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyArmMoodCode() {
      OperationsTestCase<StudyArm> validateStudyArmMoodCodeTestCase = new OperationsTestCase<StudyArm>(
      "validateStudyArmMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_ARM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyArm target) {

      }

      @Override
      protected void updateToPass(StudyArm target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyArmOperations.validateStudyArmMoodCode(
          (StudyArm) objectToTest, diagnostician, map);
      }

    };

    validateStudyArmMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyArmEffectiveTime() {
      OperationsTestCase<StudyArm> validateStudyArmEffectiveTimeTestCase = new OperationsTestCase<StudyArm>(
      "validateStudyArmEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_ARM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyArm target) {

      }

      @Override
      protected void updateToPass(StudyArm target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyArmOperations.validateStudyArmEffectiveTime(
          (StudyArm) objectToTest, diagnostician, map);
      }

    };

    validateStudyArmEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StudyArmOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StudyArm> {
		public StudyArm create() {		
			return SdtmFactory.eINSTANCE.createStudyArm();
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
	private static class ConstructorTestClass extends StudyArmOperations {};
	
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
	
	

	
	
} // StudyArmOperations