
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrEncountersSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaCaseReportOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportPhcrEncountersSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Phcr Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Case Report Tularemia PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#getTularemiaPHCRSocialHistorySection() <em>Get Tularemia PHCR Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#getTularemiaPHCRClinicalInformationSection() <em>Get Tularemia PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#getTularemiaPHCRTreatmentInformationSection() <em>Get Tularemia PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#gettularemiaPhcrEncountersSection() <em>Gettularemia Phcr Encounters Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#getTularemiaPHCRRelevantDxTestsSection() <em>Get Tularemia PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TularemiaCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaCaseReportTitle() {
      OperationsTestCase<TularemiaCaseReport> validateTularemiaCaseReportTitleTestCase = new OperationsTestCase<TularemiaCaseReport>(
      "validateTularemiaCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseReport target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseReportOperations.validateTularemiaCaseReportTitle(
          (TularemiaCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaCaseReportTularemiaPHCRSocialHistorySection() {
      OperationsTestCase<TularemiaCaseReport> validateTularemiaCaseReportTularemiaPHCRSocialHistorySectionTestCase = new OperationsTestCase<TularemiaCaseReport>(
      "validateTularemiaCaseReportTularemiaPHCRSocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseReport target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TularemiaPHCRSocialHistorySection */ 
        TularemiaPHCRSocialHistorySection section =
        
        TularemiaFactory.eINSTANCE.createTularemiaPHCRSocialHistorySection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseReportOperations.validateTularemiaCaseReportTularemiaPHCRSocialHistorySection(
          (TularemiaCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseReportTularemiaPHCRSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaCaseReportTularemiaPHCRClinicalInformationSection() {
      OperationsTestCase<TularemiaCaseReport> validateTularemiaCaseReportTularemiaPHCRClinicalInformationSectionTestCase = new OperationsTestCase<TularemiaCaseReport>(
      "validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseReport target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TularemiaPHCRClinicalInformationSection */ 
        TularemiaPHCRClinicalInformationSection section =
        
        TularemiaFactory.eINSTANCE.createTularemiaPHCRClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseReportOperations.validateTularemiaCaseReportTularemiaPHCRClinicalInformationSection(
          (TularemiaCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseReportTularemiaPHCRClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection() {
      OperationsTestCase<TularemiaCaseReport> validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSectionTestCase = new OperationsTestCase<TularemiaCaseReport>(
      "validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseReport target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TularemiaPHCRTreatmentInformationSection */ 
        TularemiaPHCRTreatmentInformationSection section =
        
        TularemiaFactory.eINSTANCE.createTularemiaPHCRTreatmentInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseReportOperations.validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSection(
          (TularemiaCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseReportTularemiaPHCRTreatmentInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateTularemiaCaseReportPhcrEncountersSection() {
      OperationsTestCase<TularemiaCaseReport> validateTularemiaCaseReportPhcrEncountersSectionTestCase = new OperationsTestCase<TularemiaCaseReport>(
      "validateTularemiaCaseReportPhcrEncountersSection",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_REPORT_PHCR_ENCOUNTERS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseReport target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
         
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseReportOperations.validateTularemiaCaseReportPhcrEncountersSection(
          (TularemiaCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseReportPhcrEncountersSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection() {
      OperationsTestCase<TularemiaCaseReport> validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSectionTestCase = new OperationsTestCase<TularemiaCaseReport>(
      "validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_CASE_REPORT_TULAREMIA_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseReport target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TularemiaPHCRRelevantDxTestsSection */ 
        TularemiaPHCRRelevantDxTestsSection section =
        
        TularemiaFactory.eINSTANCE.createTularemiaPHCRRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseReportOperations.validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSection(
          (TularemiaCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaCaseReportTularemiaPHCRRelevantDxTestsSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaPHCRSocialHistorySection() {


TularemiaCaseReport target = objectFactory.create();
target.getTularemiaPHCRSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaPHCRClinicalInformationSection() {


TularemiaCaseReport target = objectFactory.create();
target.getTularemiaPHCRClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaPHCRTreatmentInformationSection() {


TularemiaCaseReport target = objectFactory.create();
target.getTularemiaPHCRTreatmentInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGettularemiaPhcrEncountersSection() {


TularemiaCaseReport target = objectFactory.create();
target.gettularemiaPhcrEncountersSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaPHCRRelevantDxTestsSection() {


TularemiaCaseReport target = objectFactory.create();
target.getTularemiaPHCRRelevantDxTestsSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<TularemiaCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<TularemiaCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaCaseReport target) {

      }

      @Override
      protected void updateToPass(TularemiaCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (TularemiaCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TularemiaCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TularemiaCaseReport> {
		public TularemiaCaseReport create() {		
			return TularemiaFactory.eINSTANCE.createTularemiaCaseReport();
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
	private static class ConstructorTestClass extends TularemiaCaseReportOperations {};
	
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
	
	

	
	
} // TularemiaCaseReportOperations