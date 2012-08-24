
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
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyTestOrganizationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Study Test Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization#validateStudyTestOrganizationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization#validateStudyTestOrganizationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Study Test Organization Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StudyTestOrganizationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyTestOrganizationTemplateId() {
      OperationsTestCase<StudyTestOrganization> validateStudyTestOrganizationTemplateIdTestCase = new OperationsTestCase<StudyTestOrganization>(
      "validateStudyTestOrganizationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_TEST_ORGANIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyTestOrganization target) {

      }

      @Override
      protected void updateToPass(StudyTestOrganization target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyTestOrganizationOperations.validateStudyTestOrganizationTemplateId(
          (StudyTestOrganization) objectToTest, diagnostician, map);
      }

    };

    validateStudyTestOrganizationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStudyTestOrganizationTypeCode() {
      OperationsTestCase<StudyTestOrganization> validateStudyTestOrganizationTypeCodeTestCase = new OperationsTestCase<StudyTestOrganization>(
      "validateStudyTestOrganizationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_STUDY_TEST_ORGANIZATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StudyTestOrganization target) {

      }

      @Override
      protected void updateToPass(StudyTestOrganization target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StudyTestOrganizationOperations.validateStudyTestOrganizationTypeCode(
          (StudyTestOrganization) objectToTest, diagnostician, map);
      }

    };

    validateStudyTestOrganizationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StudyTestOrganizationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StudyTestOrganization> {
		public StudyTestOrganization create() {		
			return SdtmFactory.eINSTANCE.createStudyTestOrganization();
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
	private static class ConstructorTestClass extends StudyTestOrganizationOperations {};
	
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
	
	

	
	
} // StudyTestOrganizationOperations