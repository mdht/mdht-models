
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisPHCRClinicalInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Clinical Information Section Tuberculosis Relevant Medical Condition History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#getTuberculosisCaseObservation() <em>Get Tuberculosis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#getTuberculosisRelevantMedicalConditionHistoryObservations() <em>Get Tuberculosis Relevant Medical Condition History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisPHCRClinicalInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation() {
      OperationsTestCase<TuberculosisPHCRClinicalInformationSection> validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservationTestCase = new OperationsTestCase<TuberculosisPHCRClinicalInformationSection>(
      "validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(TuberculosisPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisPHCRClinicalInformationSectionOperations.validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservation(
          (TuberculosisPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisPHCRClinicalInformationSectionTuberculosisCaseObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation() {
      OperationsTestCase<TuberculosisPHCRClinicalInformationSection> validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservationTestCase = new OperationsTestCase<TuberculosisPHCRClinicalInformationSection>(
      "validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION_TUBERCULOSIS_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(TuberculosisPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisPHCRClinicalInformationSectionOperations.validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservation(
          (TuberculosisPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisPHCRClinicalInformationSectionTuberculosisRelevantMedicalConditionHistoryObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisCaseObservation() {


TuberculosisPHCRClinicalInformationSection target = objectFactory.create();
target.getTuberculosisCaseObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisRelevantMedicalConditionHistoryObservations() {


TuberculosisPHCRClinicalInformationSection target = objectFactory.create();
target.getTuberculosisRelevantMedicalConditionHistoryObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrClinicalInformationSectionTemplateId() {
      OperationsTestCase<TuberculosisPHCRClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<TuberculosisPHCRClinicalInformationSection>(
      "validatePhcrClinicalInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(TuberculosisPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
          (TuberculosisPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisPHCRClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisPHCRClinicalInformationSection> {
		public TuberculosisPHCRClinicalInformationSection create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisPHCRClinicalInformationSection();
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
	private static class ConstructorTestClass extends TuberculosisPHCRClinicalInformationSectionOperations {};
	
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
	
	

	
	
} // TuberculosisPHCRClinicalInformationSectionOperations