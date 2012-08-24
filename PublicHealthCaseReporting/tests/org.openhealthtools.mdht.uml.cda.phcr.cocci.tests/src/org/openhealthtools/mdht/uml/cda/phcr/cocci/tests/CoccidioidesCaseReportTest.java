
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
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesCaseReportOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Case Report Coccidioides PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#getCoccidioidesPHCRSocialHistorySection() <em>Get Coccidioides PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#getCoccidioidesPHCRClinicalInformationSection() <em>Get Coccidioides PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#getCoccidioidesPHCRTreatmentInformationSection() <em>Get Coccidioides PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#getCoccidioidesPHCRRelevantDxTestsSection() <em>Get Coccidioides PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesCaseReportTitle() {
      OperationsTestCase<CoccidioidesCaseReport> validateCoccidioidesCaseReportTitleTestCase = new OperationsTestCase<CoccidioidesCaseReport>(
      "validateCoccidioidesCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesCaseReport target) {

      }

      @Override
      protected void updateToPass(CoccidioidesCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportTitle(
          (CoccidioidesCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection() {
      OperationsTestCase<CoccidioidesCaseReport> validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySectionTestCase = new OperationsTestCase<CoccidioidesCaseReport>(
      "validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesCaseReport target) {

      }

      @Override
      protected void updateToPass(CoccidioidesCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* CoccidioidesPHCRSocialHistorySection */ 
        CoccidioidesPHCRSocialHistorySection section =
        
        CocciFactory.eINSTANCE.createCoccidioidesPHCRSocialHistorySection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySection(
          (CoccidioidesCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesCaseReportCoccidioidesPHCRSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection() {
      OperationsTestCase<CoccidioidesCaseReport> validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSectionTestCase = new OperationsTestCase<CoccidioidesCaseReport>(
      "validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesCaseReport target) {

      }

      @Override
      protected void updateToPass(CoccidioidesCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* CoccidioidesPHCRClinicalInformationSection */ 
        CoccidioidesPHCRClinicalInformationSection section =
        
        CocciFactory.eINSTANCE.createCoccidioidesPHCRClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSection(
          (CoccidioidesCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesCaseReportCoccidioidesPHCRClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection() {
      OperationsTestCase<CoccidioidesCaseReport> validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSectionTestCase = new OperationsTestCase<CoccidioidesCaseReport>(
      "validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesCaseReport target) {

      }

      @Override
      protected void updateToPass(CoccidioidesCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* CoccidioidesPHCRTreatmentInformationSection */ 
        CoccidioidesPHCRTreatmentInformationSection section =
        
        CocciFactory.eINSTANCE.createCoccidioidesPHCRTreatmentInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSection(
          (CoccidioidesCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesCaseReportCoccidioidesPHCRTreatmentInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection() {
      OperationsTestCase<CoccidioidesCaseReport> validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSectionTestCase = new OperationsTestCase<CoccidioidesCaseReport>(
      "validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_CASE_REPORT_COCCIDIOIDES_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesCaseReport target) {

      }

      @Override
      protected void updateToPass(CoccidioidesCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* CoccidioidesPHCRRelevantDxTestsSection */ 
        CoccidioidesPHCRRelevantDxTestsSection section =
        
        CocciFactory.eINSTANCE.createCoccidioidesPHCRRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesCaseReportOperations.validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSection(
          (CoccidioidesCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesCaseReportCoccidioidesPHCRRelevantDxTestsSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesPHCRSocialHistorySection() {


CoccidioidesCaseReport target = objectFactory.create();
target.getCoccidioidesPHCRSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesPHCRClinicalInformationSection() {


CoccidioidesCaseReport target = objectFactory.create();
target.getCoccidioidesPHCRClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesPHCRTreatmentInformationSection() {


CoccidioidesCaseReport target = objectFactory.create();
target.getCoccidioidesPHCRTreatmentInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesPHCRRelevantDxTestsSection() {


CoccidioidesCaseReport target = objectFactory.create();
target.getCoccidioidesPHCRRelevantDxTestsSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<CoccidioidesCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<CoccidioidesCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesCaseReport target) {

      }

      @Override
      protected void updateToPass(CoccidioidesCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (CoccidioidesCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesCaseReport> {
		public CoccidioidesCaseReport create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesCaseReport();
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
	private static class ConstructorTestClass extends CoccidioidesCaseReportOperations {};
	
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
	
	

	
	
} // CoccidioidesCaseReportOperations