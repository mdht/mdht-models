
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisCaseReportOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validateSilicosisCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Case Report Silicosis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#getSilicosisPHCRSocialHistorySection() <em>Get Silicosis PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#getSilicosisPHCRClinicalInformationSection() <em>Get Silicosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#getSilicosisPHCRRelevantDxTestsSection() <em>Get Silicosis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SilicosisCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisCaseReportTitle() {
      OperationsTestCase<SilicosisCaseReport> validateSilicosisCaseReportTitleTestCase = new OperationsTestCase<SilicosisCaseReport>(
      "validateSilicosisCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisCaseReport target) {

      }

      @Override
      protected void updateToPass(SilicosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisCaseReportOperations.validateSilicosisCaseReportTitle(
          (SilicosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisCaseReportSilicosisPHCRSocialHistorySection() {
      OperationsTestCase<SilicosisCaseReport> validateSilicosisCaseReportSilicosisPHCRSocialHistorySectionTestCase = new OperationsTestCase<SilicosisCaseReport>(
      "validateSilicosisCaseReportSilicosisPHCRSocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisCaseReport target) {

      }

      @Override
      protected void updateToPass(SilicosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* SilicosisPHCRSocialHistorySection */ 
        SilicosisPHCRSocialHistorySection section =
        
        SilicosisFactory.eINSTANCE.createSilicosisPHCRSocialHistorySection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisCaseReportOperations.validateSilicosisCaseReportSilicosisPHCRSocialHistorySection(
          (SilicosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisCaseReportSilicosisPHCRSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisCaseReportSilicosisPHCRClinicalInformationSection() {
      OperationsTestCase<SilicosisCaseReport> validateSilicosisCaseReportSilicosisPHCRClinicalInformationSectionTestCase = new OperationsTestCase<SilicosisCaseReport>(
      "validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisCaseReport target) {

      }

      @Override
      protected void updateToPass(SilicosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* SilicosisPHCRClinicalInformationSection */ 
        SilicosisPHCRClinicalInformationSection section =
        
        SilicosisFactory.eINSTANCE.createSilicosisPHCRClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisCaseReportOperations.validateSilicosisCaseReportSilicosisPHCRClinicalInformationSection(
          (SilicosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisCaseReportSilicosisPHCRClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection() {
      OperationsTestCase<SilicosisCaseReport> validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSectionTestCase = new OperationsTestCase<SilicosisCaseReport>(
      "validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_CASE_REPORT_SILICOSIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisCaseReport target) {

      }

      @Override
      protected void updateToPass(SilicosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* SilicosisPHCRRelevantDxTestsSection */ 
        SilicosisPHCRRelevantDxTestsSection section =
        
        SilicosisFactory.eINSTANCE.createSilicosisPHCRRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisCaseReportOperations.validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSection(
          (SilicosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisCaseReportSilicosisPHCRRelevantDxTestsSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisPHCRSocialHistorySection() {


SilicosisCaseReport target = objectFactory.create();
target.getSilicosisPHCRSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisPHCRClinicalInformationSection() {


SilicosisCaseReport target = objectFactory.create();
target.getSilicosisPHCRClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSilicosisPHCRRelevantDxTestsSection() {


SilicosisCaseReport target = objectFactory.create();
target.getSilicosisPHCRRelevantDxTestsSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<SilicosisCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<SilicosisCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisCaseReport target) {

      }

      @Override
      protected void updateToPass(SilicosisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (SilicosisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SilicosisCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SilicosisCaseReport> {
		public SilicosisCaseReport create() {		
			return SilicosisFactory.eINSTANCE.createSilicosisCaseReport();
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
	private static class ConstructorTestClass extends SilicosisCaseReportOperations {};
	
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
	
	

	
	
} // SilicosisCaseReportOperations