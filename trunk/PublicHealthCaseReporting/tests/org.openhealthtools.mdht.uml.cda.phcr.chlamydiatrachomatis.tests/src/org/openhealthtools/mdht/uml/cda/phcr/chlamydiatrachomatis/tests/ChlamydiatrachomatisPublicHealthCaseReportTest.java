
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisPublicHealthCaseReportOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Public Health Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validateChlamydiatrachomatisPublicHealthCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Public Health Case Report Chlamydiatrachomatis PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#getChlamydiatrachomatisPHCRClinicalInformationSection() <em>Get Chlamydiatrachomatis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#getChlamydiatrachomatisPHCRRelevantDxTestsSection() <em>Get Chlamydiatrachomatis PHCR Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#getChlamydiatrachomatisPHCRTreatmentInformationSection() <em>Get Chlamydiatrachomatis PHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPublicHealthCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ChlamydiatrachomatisPublicHealthCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateChlamydiatrachomatisPublicHealthCaseReportTitle() {
      OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport> validateChlamydiatrachomatisPublicHealthCaseReportTitleTestCase = new OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport>(
      "validateChlamydiatrachomatisPublicHealthCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPublicHealthCaseReport target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPublicHealthCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPublicHealthCaseReportOperations.validateChlamydiatrachomatisPublicHealthCaseReportTitle(
          (ChlamydiatrachomatisPublicHealthCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisPublicHealthCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection() {
      OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport> validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSectionTestCase = new OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport>(
      "validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPublicHealthCaseReport target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPublicHealthCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* ChlamydiatrachomatisPHCRClinicalInformationSection */ 
        ChlamydiatrachomatisPHCRClinicalInformationSection section =
        
        ChlamydiatrachomatisFactory.eINSTANCE.createChlamydiatrachomatisPHCRClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPublicHealthCaseReportOperations.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSection(
          (ChlamydiatrachomatisPublicHealthCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection() {
      OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport> validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSectionTestCase = new OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport>(
      "validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPublicHealthCaseReport target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPublicHealthCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* ChlamydiatrachomatisPHCRRelevantDxTestsSection */ 
        ChlamydiatrachomatisPHCRRelevantDxTestsSection section =
        
        ChlamydiatrachomatisFactory.eINSTANCE.createChlamydiatrachomatisPHCRRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPublicHealthCaseReportOperations.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSection(
          (ChlamydiatrachomatisPublicHealthCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRRelevantDxTestsSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection() {
      OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport> validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSectionTestCase = new OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport>(
      "validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_PUBLIC_HEALTH_CASE_REPORT_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPublicHealthCaseReport target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPublicHealthCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* ChlamydiatrachomatisPHCRTreatmentInformationSection */ 
        ChlamydiatrachomatisPHCRTreatmentInformationSection section =
        
        ChlamydiatrachomatisFactory.eINSTANCE.createChlamydiatrachomatisPHCRTreatmentInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPublicHealthCaseReportOperations.validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSection(
          (ChlamydiatrachomatisPublicHealthCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisPublicHealthCaseReportChlamydiatrachomatisPHCRTreatmentInformationSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetChlamydiatrachomatisPHCRClinicalInformationSection() {


ChlamydiatrachomatisPublicHealthCaseReport target = objectFactory.create();
target.getChlamydiatrachomatisPHCRClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetChlamydiatrachomatisPHCRRelevantDxTestsSection() {


ChlamydiatrachomatisPublicHealthCaseReport target = objectFactory.create();
target.getChlamydiatrachomatisPHCRRelevantDxTestsSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetChlamydiatrachomatisPHCRTreatmentInformationSection() {


ChlamydiatrachomatisPublicHealthCaseReport target = objectFactory.create();
target.getChlamydiatrachomatisPHCRTreatmentInformationSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<ChlamydiatrachomatisPublicHealthCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPublicHealthCaseReport target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPublicHealthCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPublicHealthCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (ChlamydiatrachomatisPublicHealthCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ChlamydiatrachomatisPublicHealthCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChlamydiatrachomatisPublicHealthCaseReport> {
		public ChlamydiatrachomatisPublicHealthCaseReport create() {		
			return ChlamydiatrachomatisFactory.eINSTANCE.createChlamydiatrachomatisPublicHealthCaseReport();
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
	private static class ConstructorTestClass extends ChlamydiatrachomatisPublicHealthCaseReportOperations {};
	
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
	
	

	
	
} // ChlamydiatrachomatisPublicHealthCaseReportOperations