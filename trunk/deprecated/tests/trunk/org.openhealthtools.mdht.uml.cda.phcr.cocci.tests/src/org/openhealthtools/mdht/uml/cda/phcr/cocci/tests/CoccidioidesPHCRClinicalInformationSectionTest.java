
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.cocci.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciFactory;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesPHCRClinicalInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Clinical Information Section Coccidioides Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Clinical Information Section Coccidioides Immunosuppressed Medical Condition History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#getCoccidioidesCaseObservation() <em>Get Coccidioides Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations() <em>Get Coccidioides Immunosuppressed Medical Condition History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesPHCRClinicalInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation() {
      OperationsTestCase<CoccidioidesPHCRClinicalInformationSection> validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservationTestCase = new OperationsTestCase<CoccidioidesPHCRClinicalInformationSection>(
      "validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(CoccidioidesPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesPHCRClinicalInformationSectionOperations.validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(
          (CoccidioidesPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation() {
      OperationsTestCase<CoccidioidesPHCRClinicalInformationSection> validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservationTestCase = new OperationsTestCase<CoccidioidesPHCRClinicalInformationSection>(
      "validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(CoccidioidesPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesPHCRClinicalInformationSectionOperations.validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(
          (CoccidioidesPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesCaseObservation() {


CoccidioidesPHCRClinicalInformationSection target = objectFactory.create();
target.getCoccidioidesCaseObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesImmunosuppressedMedicalConditionHistoryObservations() {


CoccidioidesPHCRClinicalInformationSection target = objectFactory.create();
target.getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrClinicalInformationSectionTemplateId() {
      OperationsTestCase<CoccidioidesPHCRClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<CoccidioidesPHCRClinicalInformationSection>(
      "validatePhcrClinicalInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(CoccidioidesPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
          (CoccidioidesPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesPHCRClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesPHCRClinicalInformationSection> {
		public CoccidioidesPHCRClinicalInformationSection create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesPHCRClinicalInformationSection();
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
	private static class ConstructorTestClass extends CoccidioidesPHCRClinicalInformationSectionOperations {};
	
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
	
	

	
	
} // CoccidioidesPHCRClinicalInformationSectionOperations