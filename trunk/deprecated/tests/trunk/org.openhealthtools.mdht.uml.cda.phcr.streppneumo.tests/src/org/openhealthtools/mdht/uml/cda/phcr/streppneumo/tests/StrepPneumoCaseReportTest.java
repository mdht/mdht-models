
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoFactory;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoCaseReportOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validateStrepPneumoCaseReportStrepPneumoImmunizationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Case Report Strep Pneumo Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoPHCRClinicalInformationSection() <em>Get Strep Pneumo PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoPHCRTreatmentInformationSection() <em>Get Strep Pneumo PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection() <em>Get Strep Pneumo Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoSocialHistorySections() <em>Get Strep Pneumo Social History Sections</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#getStrepPneumoImmunizationSection() <em>Get Strep Pneumo Immunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoCaseReportTitle() {
      OperationsTestCase<StrepPneumoCaseReport> validateStrepPneumoCaseReportTitleTestCase = new OperationsTestCase<StrepPneumoCaseReport>(
      "validateStrepPneumoCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseReport target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportTitle(
          (StrepPneumoCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection() {
      OperationsTestCase<StrepPneumoCaseReport> validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSectionTestCase = new OperationsTestCase<StrepPneumoCaseReport>(
      "validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseReport target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* StrepPneumoPHCRClinicalInformationSection */ 
        StrepPneumoPHCRClinicalInformationSection section =
        
        StrepPneumoFactory.eINSTANCE.createStrepPneumoPHCRClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSection(
          (StrepPneumoCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoCaseReportStrepPneumoPHCRClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection() {
      OperationsTestCase<StrepPneumoCaseReport> validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSectionTestCase = new OperationsTestCase<StrepPneumoCaseReport>(
      "validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseReport target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* StrepPneumoPHCRTreatmentInformationSection */ 
        StrepPneumoPHCRTreatmentInformationSection section =
        
        StrepPneumoFactory.eINSTANCE.createStrepPneumoPHCRTreatmentInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSection(
          (StrepPneumoCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoCaseReportStrepPneumoPHCRTreatmentInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
      OperationsTestCase<StrepPneumoCaseReport> validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionTestCase = new OperationsTestCase<StrepPneumoCaseReport>(
      "validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseReport target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection */ 
        StrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection section =
        
        StrepPneumoFactory.eINSTANCE.createStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection(
          (StrepPneumoCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoCaseReportStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoCaseReportStrepPneumoSocialHistorySection() {
      OperationsTestCase<StrepPneumoCaseReport> validateStrepPneumoCaseReportStrepPneumoSocialHistorySectionTestCase = new OperationsTestCase<StrepPneumoCaseReport>(
      "validateStrepPneumoCaseReportStrepPneumoSocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseReport target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* StrepPneumoSocialHistorySection */ 
        StrepPneumoSocialHistorySection section =
        
        StrepPneumoFactory.eINSTANCE.createStrepPneumoSocialHistorySection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoSocialHistorySection(
          (StrepPneumoCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoCaseReportStrepPneumoSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoCaseReportStrepPneumoImmunizationSection() {
      OperationsTestCase<StrepPneumoCaseReport> validateStrepPneumoCaseReportStrepPneumoImmunizationSectionTestCase = new OperationsTestCase<StrepPneumoCaseReport>(
      "validateStrepPneumoCaseReportStrepPneumoImmunizationSection",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_CASE_REPORT_STREP_PNEUMO_IMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseReport target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* StrepPneumoImmunizationSection */ 
        StrepPneumoImmunizationSection section =
        
        StrepPneumoFactory.eINSTANCE.createStrepPneumoImmunizationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseReportOperations.validateStrepPneumoCaseReportStrepPneumoImmunizationSection(
          (StrepPneumoCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoCaseReportStrepPneumoImmunizationSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoPHCRClinicalInformationSection() {


StrepPneumoCaseReport target = objectFactory.create();
target.getStrepPneumoPHCRClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoPHCRTreatmentInformationSection() {


StrepPneumoCaseReport target = objectFactory.create();
target.getStrepPneumoPHCRTreatmentInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection() {


StrepPneumoCaseReport target = objectFactory.create();
target.getStrepPneumoRelevantDiagnosticTestsAndOrLaboratoryDataSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoSocialHistorySections() {


StrepPneumoCaseReport target = objectFactory.create();
target.getStrepPneumoSocialHistorySections();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoImmunizationSection() {


StrepPneumoCaseReport target = objectFactory.create();
target.getStrepPneumoImmunizationSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<StrepPneumoCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<StrepPneumoCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoCaseReport target) {

      }

      @Override
      protected void updateToPass(StrepPneumoCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (StrepPneumoCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoCaseReport> {
		public StrepPneumoCaseReport create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoCaseReport();
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
	private static class ConstructorTestClass extends StrepPneumoCaseReportOperations {};
	
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
	
	

	
	
} // StrepPneumoCaseReportOperations