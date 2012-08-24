
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisCaseReportOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisTreatmentInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePertussisCaseReportPertussisImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Case Report Pertussis Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisSocialHistorySection() <em>Get Pertussis Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisClinicalInformationSection() <em>Get Pertussis Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisTreatmentInformationSection() <em>Get Pertussis Treatment Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisRelevantDxTestsSection() <em>Get Pertussis Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#getPertussisImmunizationsSection() <em>Get Pertussis Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisCaseReportTitle() {
      OperationsTestCase<PertussisCaseReport> validatePertussisCaseReportTitleTestCase = new OperationsTestCase<PertussisCaseReport>(
      "validatePertussisCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseReport target) {

      }

      @Override
      protected void updateToPass(PertussisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseReportOperations.validatePertussisCaseReportTitle(
          (PertussisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisCaseReportPertussisSocialHistorySection() {
      OperationsTestCase<PertussisCaseReport> validatePertussisCaseReportPertussisSocialHistorySectionTestCase = new OperationsTestCase<PertussisCaseReport>(
      "validatePertussisCaseReportPertussisSocialHistorySection",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseReport target) {

      }

      @Override
      protected void updateToPass(PertussisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* PertussisSocialHistorySection */ 
        PertussisSocialHistorySection section =
        
        PertussisFactory.eINSTANCE.createPertussisSocialHistorySection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseReportOperations.validatePertussisCaseReportPertussisSocialHistorySection(
          (PertussisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseReportPertussisSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisCaseReportPertussisClinicalInformationSection() {
      OperationsTestCase<PertussisCaseReport> validatePertussisCaseReportPertussisClinicalInformationSectionTestCase = new OperationsTestCase<PertussisCaseReport>(
      "validatePertussisCaseReportPertussisClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseReport target) {

      }

      @Override
      protected void updateToPass(PertussisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* PertussisClinicalInformationSection */ 
        PertussisClinicalInformationSection section =
        
        PertussisFactory.eINSTANCE.createPertussisClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseReportOperations.validatePertussisCaseReportPertussisClinicalInformationSection(
          (PertussisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseReportPertussisClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisCaseReportPertussisTreatmentInformationSection() {
      OperationsTestCase<PertussisCaseReport> validatePertussisCaseReportPertussisTreatmentInformationSectionTestCase = new OperationsTestCase<PertussisCaseReport>(
      "validatePertussisCaseReportPertussisTreatmentInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_TREATMENT_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseReport target) {

      }

      @Override
      protected void updateToPass(PertussisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* PertussisTreatmentInformationSection */ 
        PertussisTreatmentInformationSection section =
        
        PertussisFactory.eINSTANCE.createPertussisTreatmentInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseReportOperations.validatePertussisCaseReportPertussisTreatmentInformationSection(
          (PertussisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseReportPertussisTreatmentInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisCaseReportPertussisRelevantDxTestsSection() {
      OperationsTestCase<PertussisCaseReport> validatePertussisCaseReportPertussisRelevantDxTestsSectionTestCase = new OperationsTestCase<PertussisCaseReport>(
      "validatePertussisCaseReportPertussisRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseReport target) {

      }

      @Override
      protected void updateToPass(PertussisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* PertussisRelevantDxTestsSection */ 
        PertussisRelevantDxTestsSection section =
        
        PertussisFactory.eINSTANCE.createPertussisRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseReportOperations.validatePertussisCaseReportPertussisRelevantDxTestsSection(
          (PertussisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseReportPertussisRelevantDxTestsSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisCaseReportPertussisImmunizationsSection() {
      OperationsTestCase<PertussisCaseReport> validatePertussisCaseReportPertussisImmunizationsSectionTestCase = new OperationsTestCase<PertussisCaseReport>(
      "validatePertussisCaseReportPertussisImmunizationsSection",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_CASE_REPORT_PERTUSSIS_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseReport target) {

      }

      @Override
      protected void updateToPass(PertussisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* PertussisImmunizationsSection */ 
        PertussisImmunizationsSection section =
        
        PertussisFactory.eINSTANCE.createPertussisImmunizationsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseReportOperations.validatePertussisCaseReportPertussisImmunizationsSection(
          (PertussisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePertussisCaseReportPertussisImmunizationsSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisSocialHistorySection() {


PertussisCaseReport target = objectFactory.create();
target.getPertussisSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisClinicalInformationSection() {


PertussisCaseReport target = objectFactory.create();
target.getPertussisClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisTreatmentInformationSection() {


PertussisCaseReport target = objectFactory.create();
target.getPertussisTreatmentInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisRelevantDxTestsSection() {


PertussisCaseReport target = objectFactory.create();
target.getPertussisRelevantDxTestsSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisImmunizationsSection() {


PertussisCaseReport target = objectFactory.create();
target.getPertussisImmunizationsSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<PertussisCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<PertussisCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisCaseReport target) {

      }

      @Override
      protected void updateToPass(PertussisCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (PertussisCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisCaseReport> {
		public PertussisCaseReport create() {		
			return PertussisFactory.eINSTANCE.createPertussisCaseReport();
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
	private static class ConstructorTestClass extends PertussisCaseReportOperations {};
	
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
	
	

	
	
} // PertussisCaseReportOperations