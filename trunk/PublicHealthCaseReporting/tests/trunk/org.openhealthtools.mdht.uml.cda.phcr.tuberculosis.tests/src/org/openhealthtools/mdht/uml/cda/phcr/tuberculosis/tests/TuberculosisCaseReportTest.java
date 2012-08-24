
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisCaseReportOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Case Report Tuberculosis PHCR Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRSocialHistorySection() <em>Get Tuberculosis PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRClinicalInformationSection() <em>Get Tuberculosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRRelevantDxTestsSection() <em>Get Tuberculosis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRTreatmentInformationSection() <em>Get Tuberculosis PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#getTuberculosisPHCRImmunizationSection() <em>Get Tuberculosis PHCR Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisCaseReportTitle() {
      OperationsTestCase<TuberculosisCaseReport> validateTuberculosisCaseReportTitleTestCase = new OperationsTestCase<TuberculosisCaseReport>(
      "validateTuberculosisCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseReport target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTitle(
          (TuberculosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection() {
      OperationsTestCase<TuberculosisCaseReport> validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySectionTestCase = new OperationsTestCase<TuberculosisCaseReport>(
      "validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseReport target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TuberculosisPHCRSocialHistorySection */ 
        TuberculosisPHCRSocialHistorySection section =
        
        TuberculosisFactory.eINSTANCE.createTuberculosisPHCRSocialHistorySection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySection(
          (TuberculosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseReportTuberculosisPHCRSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection() {
      OperationsTestCase<TuberculosisCaseReport> validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSectionTestCase = new OperationsTestCase<TuberculosisCaseReport>(
      "validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseReport target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TuberculosisPHCRClinicalInformationSection */ 
        TuberculosisPHCRClinicalInformationSection section =
        
        TuberculosisFactory.eINSTANCE.createTuberculosisPHCRClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSection(
          (TuberculosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseReportTuberculosisPHCRClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection() {
      OperationsTestCase<TuberculosisCaseReport> validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSectionTestCase = new OperationsTestCase<TuberculosisCaseReport>(
      "validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseReport target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TuberculosisPHCRRelevantDxTestsSection */ 
        TuberculosisPHCRRelevantDxTestsSection section =
        
        TuberculosisFactory.eINSTANCE.createTuberculosisPHCRRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSection(
          (TuberculosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseReportTuberculosisPHCRRelevantDxTestsSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection() {
      OperationsTestCase<TuberculosisCaseReport> validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSectionTestCase = new OperationsTestCase<TuberculosisCaseReport>(
      "validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseReport target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TuberculosisPHCRTreatmentInformationSection */ 
        TuberculosisPHCRTreatmentInformationSection section =
        
        TuberculosisFactory.eINSTANCE.createTuberculosisPHCRTreatmentInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSection(
          (TuberculosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseReportTuberculosisPHCRTreatmentInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisCaseReportTuberculosisPHCRImmunizationSection() {
      OperationsTestCase<TuberculosisCaseReport> validateTuberculosisCaseReportTuberculosisPHCRImmunizationSectionTestCase = new OperationsTestCase<TuberculosisCaseReport>(
      "validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_CASE_REPORT_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseReport target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TuberculosisPHCRImmunizationSection */ 
        TuberculosisPHCRImmunizationSection section =
        
        TuberculosisFactory.eINSTANCE.createTuberculosisPHCRImmunizationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseReportOperations.validateTuberculosisCaseReportTuberculosisPHCRImmunizationSection(
          (TuberculosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisCaseReportTuberculosisPHCRImmunizationSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisPHCRSocialHistorySection() {


TuberculosisCaseReport target = objectFactory.create();
target.getTuberculosisPHCRSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisPHCRClinicalInformationSection() {


TuberculosisCaseReport target = objectFactory.create();
target.getTuberculosisPHCRClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisPHCRRelevantDxTestsSection() {


TuberculosisCaseReport target = objectFactory.create();
target.getTuberculosisPHCRRelevantDxTestsSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisPHCRTreatmentInformationSection() {


TuberculosisCaseReport target = objectFactory.create();
target.getTuberculosisPHCRTreatmentInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisPHCRImmunizationSection() {


TuberculosisCaseReport target = objectFactory.create();
target.getTuberculosisPHCRImmunizationSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<TuberculosisCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<TuberculosisCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisCaseReport target) {

      }

      @Override
      protected void updateToPass(TuberculosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (TuberculosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisCaseReport> {
		public TuberculosisCaseReport create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisCaseReport();
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
	private static class ConstructorTestClass extends TuberculosisCaseReportOperations {};
	
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
	
	

	
	
} // TuberculosisCaseReportOperations