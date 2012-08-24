
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxFactory;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxCaseReportOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Case Report Anthrax Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#getAnthraxPhcrSocialHistorySection() <em>Get Anthrax Phcr Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#getAnthraxPhcrClinicalInformationSection() <em>Get Anthrax Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#getAnthraxPhcrTreatmentInformationSection() <em>Get Anthrax Phcr Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#getAnthraxPhcrRelevantDxTestsSection() <em>Get Anthrax Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AnthraxCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxCaseReportTitle() {
      OperationsTestCase<AnthraxCaseReport> validateAnthraxCaseReportTitleTestCase = new OperationsTestCase<AnthraxCaseReport>(
      "validateAnthraxCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxCaseReport target) {

      }

      @Override
      protected void updateToPass(AnthraxCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxCaseReportOperations.validateAnthraxCaseReportTitle(
          (AnthraxCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxCaseReportAnthraxPhcrSocialHistorySection() {
      OperationsTestCase<AnthraxCaseReport> validateAnthraxCaseReportAnthraxPhcrSocialHistorySectionTestCase = new OperationsTestCase<AnthraxCaseReport>(
      "validateAnthraxCaseReportAnthraxPhcrSocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxCaseReport target) {

      }

      @Override
      protected void updateToPass(AnthraxCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AnthraxPhcrSocialHistorySection */ 
        AnthraxPhcrSocialHistorySection section =
        
        AnthraxFactory.eINSTANCE.createAnthraxPhcrSocialHistorySection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxCaseReportOperations.validateAnthraxCaseReportAnthraxPhcrSocialHistorySection(
          (AnthraxCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxCaseReportAnthraxPhcrSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxCaseReportAnthraxPhcrClinicalInformationSection() {
      OperationsTestCase<AnthraxCaseReport> validateAnthraxCaseReportAnthraxPhcrClinicalInformationSectionTestCase = new OperationsTestCase<AnthraxCaseReport>(
      "validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxCaseReport target) {

      }

      @Override
      protected void updateToPass(AnthraxCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AnthraxPhcrClinicalInformationSection */ 
        AnthraxPhcrClinicalInformationSection section =
        
        AnthraxFactory.eINSTANCE.createAnthraxPhcrClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxCaseReportOperations.validateAnthraxCaseReportAnthraxPhcrClinicalInformationSection(
          (AnthraxCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxCaseReportAnthraxPhcrClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection() {
      OperationsTestCase<AnthraxCaseReport> validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSectionTestCase = new OperationsTestCase<AnthraxCaseReport>(
      "validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxCaseReport target) {

      }

      @Override
      protected void updateToPass(AnthraxCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AnthraxPhcrTreatmentInformationSection */ 
        AnthraxPhcrTreatmentInformationSection section =
        
        AnthraxFactory.eINSTANCE.createAnthraxPhcrTreatmentInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxCaseReportOperations.validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSection(
          (AnthraxCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxCaseReportAnthraxPhcrTreatmentInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection() {
      OperationsTestCase<AnthraxCaseReport> validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSectionTestCase = new OperationsTestCase<AnthraxCaseReport>(
      "validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_CASE_REPORT_ANTHRAX_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxCaseReport target) {

      }

      @Override
      protected void updateToPass(AnthraxCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AnthraxPhcrRelevantDxTestsSection */ 
        AnthraxPhcrRelevantDxTestsSection section =
        
        AnthraxFactory.eINSTANCE.createAnthraxPhcrRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxCaseReportOperations.validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSection(
          (AnthraxCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxCaseReportAnthraxPhcrRelevantDxTestsSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxPhcrSocialHistorySection() {


AnthraxCaseReport target = objectFactory.create();
target.getAnthraxPhcrSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxPhcrClinicalInformationSection() {


AnthraxCaseReport target = objectFactory.create();
target.getAnthraxPhcrClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxPhcrTreatmentInformationSection() {


AnthraxCaseReport target = objectFactory.create();
target.getAnthraxPhcrTreatmentInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxPhcrRelevantDxTestsSection() {


AnthraxCaseReport target = objectFactory.create();
target.getAnthraxPhcrRelevantDxTestsSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<AnthraxCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<AnthraxCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxCaseReport target) {

      }

      @Override
      protected void updateToPass(AnthraxCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (AnthraxCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AnthraxCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnthraxCaseReport> {
		public AnthraxCaseReport create() {		
			return AnthraxFactory.eINSTANCE.createAnthraxCaseReport();
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
	private static class ConstructorTestClass extends AnthraxCaseReportOperations {};
	
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
	
	

	
	
} // AnthraxCaseReportOperations