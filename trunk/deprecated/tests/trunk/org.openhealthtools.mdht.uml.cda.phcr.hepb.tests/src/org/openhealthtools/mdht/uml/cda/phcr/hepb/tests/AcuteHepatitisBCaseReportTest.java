
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.hepb.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBCaseReportOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BCase Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BSocial History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BImmunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BCase Report Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBSocialHistorySection() <em>Get Acute Hepatitis BSocial History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBPHCRClinicalInformationSection() <em>Get Acute Hepatitis BPHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBImmunizationSection() <em>Get Acute Hepatitis BImmunization Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBPHCRTreatmentInformationSection() <em>Get Acute Hepatitis BPHCR Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() <em>Get Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBCaseReportTitle() {
      OperationsTestCase<AcuteHepatitisBCaseReport> validateAcuteHepatitisBCaseReportTitleTestCase = new OperationsTestCase<AcuteHepatitisBCaseReport>(
      "validateAcuteHepatitisBCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseReport target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportTitle(
          (AcuteHepatitisBCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection() {
      OperationsTestCase<AcuteHepatitisBCaseReport> validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySectionTestCase = new OperationsTestCase<AcuteHepatitisBCaseReport>(
      "validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BSOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseReport target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AcuteHepatitisBSocialHistorySection */ 
        AcuteHepatitisBSocialHistorySection section =
        
        HepbFactory.eINSTANCE.createAcuteHepatitisBSocialHistorySection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySection(
          (AcuteHepatitisBCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseReportAcuteHepatitisBSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection() {
      OperationsTestCase<AcuteHepatitisBCaseReport> validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSectionTestCase = new OperationsTestCase<AcuteHepatitisBCaseReport>(
      "validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseReport target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AcuteHepatitisBPHCRClinicalInformationSection */ 
        AcuteHepatitisBPHCRClinicalInformationSection section =
        
        HepbFactory.eINSTANCE.createAcuteHepatitisBPHCRClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSection(
          (AcuteHepatitisBCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection() {
      OperationsTestCase<AcuteHepatitisBCaseReport> validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSectionTestCase = new OperationsTestCase<AcuteHepatitisBCaseReport>(
      "validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseReport target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AcuteHepatitisBImmunizationSection */ 
        AcuteHepatitisBImmunizationSection section =
        
        HepbFactory.eINSTANCE.createAcuteHepatitisBImmunizationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSection(
          (AcuteHepatitisBCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseReportAcuteHepatitisBImmunizationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection() {
      OperationsTestCase<AcuteHepatitisBCaseReport> validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSectionTestCase = new OperationsTestCase<AcuteHepatitisBCaseReport>(
      "validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseReport target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AcuteHepatitisBPHCRTreatmentInformationSection */ 
        AcuteHepatitisBPHCRTreatmentInformationSection section =
        
        HepbFactory.eINSTANCE.createAcuteHepatitisBPHCRTreatmentInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSection(
          (AcuteHepatitisBCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRTreatmentInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() {
      OperationsTestCase<AcuteHepatitisBCaseReport> validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionTestCase = new OperationsTestCase<AcuteHepatitisBCaseReport>(
      "validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BCASE_REPORT_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseReport target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection */ 
        AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection section =
        
        HepbFactory.eINSTANCE.createAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseReportOperations.validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection(
          (AcuteHepatitisBCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBCaseReportAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBSocialHistorySection() {


AcuteHepatitisBCaseReport target = objectFactory.create();
target.getAcuteHepatitisBSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBPHCRClinicalInformationSection() {


AcuteHepatitisBCaseReport target = objectFactory.create();
target.getAcuteHepatitisBPHCRClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBImmunizationSection() {


AcuteHepatitisBCaseReport target = objectFactory.create();
target.getAcuteHepatitisBImmunizationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBPHCRTreatmentInformationSection() {


AcuteHepatitisBCaseReport target = objectFactory.create();
target.getAcuteHepatitisBPHCRTreatmentInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection() {


AcuteHepatitisBCaseReport target = objectFactory.create();
target.getAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<AcuteHepatitisBCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBCaseReport target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (AcuteHepatitisBCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBCaseReport> {
		public AcuteHepatitisBCaseReport create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBCaseReport();
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
	private static class ConstructorTestClass extends AcuteHepatitisBCaseReportOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBCaseReportOperations