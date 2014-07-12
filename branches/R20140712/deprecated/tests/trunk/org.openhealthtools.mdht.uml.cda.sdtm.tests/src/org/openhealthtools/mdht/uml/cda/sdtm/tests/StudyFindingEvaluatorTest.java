
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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyFindingEvaluatorOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Finding Evaluator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator#validateStudyFindingEvaluatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyFindingEvaluator#validateStudyFindingEvaluatorTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Finding Evaluator Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StudyFindingEvaluatorTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyFindingEvaluatorTemplateId() {
      OperationsTestCase<StudyFindingEvaluator> validateStudyFindingEvaluatorTemplateIdTestCase = new OperationsTestCase<StudyFindingEvaluator>(
      "validateStudyFindingEvaluatorTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_FINDING_EVALUATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyFindingEvaluator target) {

      }

      @Override
      protected void updateToPass(StudyFindingEvaluator target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyFindingEvaluatorOperations.validateStudyFindingEvaluatorTemplateId(
          (StudyFindingEvaluator) objectToTest, diagnostician, map);
      }

    };

    validateStudyFindingEvaluatorTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyFindingEvaluatorTypeCode() {
      OperationsTestCase<StudyFindingEvaluator> validateStudyFindingEvaluatorTypeCodeTestCase = new OperationsTestCase<StudyFindingEvaluator>(
      "validateStudyFindingEvaluatorTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_FINDING_EVALUATOR_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyFindingEvaluator target) {

      }

      @Override
      protected void updateToPass(StudyFindingEvaluator target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyFindingEvaluatorOperations.validateStudyFindingEvaluatorTypeCode(
          (StudyFindingEvaluator) objectToTest, diagnostician, map);
      }

    };

    validateStudyFindingEvaluatorTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StudyFindingEvaluatorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StudyFindingEvaluator> {
		public StudyFindingEvaluator create() {		
			return SdtmFactory.eINSTANCE.createStudyFindingEvaluator();
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
	private static class ConstructorTestClass extends StudyFindingEvaluatorOperations {};
	
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
	
	

	
	
} // StudyFindingEvaluatorOperations