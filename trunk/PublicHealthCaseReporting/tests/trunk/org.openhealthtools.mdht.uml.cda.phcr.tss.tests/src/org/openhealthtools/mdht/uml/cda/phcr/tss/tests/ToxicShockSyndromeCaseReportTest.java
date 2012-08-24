
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tss.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.TssPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.tss.tssFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tss.operations.ToxicShockSyndromeCaseReportOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Toxic Shock Syndrome Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#validateToxicShockSyndromeCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Tss Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Toxic Shock Syndrome Case Report Tss Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#getTssPhcrClinicalInformationSection() <em>Get Tss Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#getTssPhcrRelevantDxTestsSection() <em>Get Tss Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tss.ToxicShockSyndromeCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ToxicShockSyndromeCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateToxicShockSyndromeCaseReportTitle() {
      OperationsTestCase<ToxicShockSyndromeCaseReport> validateToxicShockSyndromeCaseReportTitleTestCase = new OperationsTestCase<ToxicShockSyndromeCaseReport>(
      "validateToxicShockSyndromeCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ToxicShockSyndromeCaseReport target) {

      }

      @Override
      protected void updateToPass(ToxicShockSyndromeCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ToxicShockSyndromeCaseReportOperations.validateToxicShockSyndromeCaseReportTitle(
          (ToxicShockSyndromeCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateToxicShockSyndromeCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection() {
      OperationsTestCase<ToxicShockSyndromeCaseReport> validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSectionTestCase = new OperationsTestCase<ToxicShockSyndromeCaseReport>(
      "validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ToxicShockSyndromeCaseReport target) {

      }

      @Override
      protected void updateToPass(ToxicShockSyndromeCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TssPhcrClinicalInformationSection */ 
        TssPhcrClinicalInformationSection section =
        
        tssFactory.eINSTANCE.createTssPhcrClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ToxicShockSyndromeCaseReportOperations.validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSection(
          (ToxicShockSyndromeCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateToxicShockSyndromeCaseReportTssPhcrClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection() {
      OperationsTestCase<ToxicShockSyndromeCaseReport> validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSectionTestCase = new OperationsTestCase<ToxicShockSyndromeCaseReport>(
      "validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_TOXIC_SHOCK_SYNDROME_CASE_REPORT_TSS_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ToxicShockSyndromeCaseReport target) {

      }

      @Override
      protected void updateToPass(ToxicShockSyndromeCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* TssPhcrRelevantDxTestsSection */ 
        TssPhcrRelevantDxTestsSection section =
        
        tssFactory.eINSTANCE.createTssPhcrRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ToxicShockSyndromeCaseReportOperations.validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSection(
          (ToxicShockSyndromeCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateToxicShockSyndromeCaseReportTssPhcrRelevantDxTestsSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTssPhcrClinicalInformationSection() {


ToxicShockSyndromeCaseReport target = objectFactory.create();
target.getTssPhcrClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTssPhcrRelevantDxTestsSection() {


ToxicShockSyndromeCaseReport target = objectFactory.create();
target.getTssPhcrRelevantDxTestsSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<ToxicShockSyndromeCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<ToxicShockSyndromeCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ToxicShockSyndromeCaseReport target) {

      }

      @Override
      protected void updateToPass(ToxicShockSyndromeCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ToxicShockSyndromeCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (ToxicShockSyndromeCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ToxicShockSyndromeCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ToxicShockSyndromeCaseReport> {
		public ToxicShockSyndromeCaseReport create() {		
			return tssFactory.eINSTANCE.createToxicShockSyndromeCaseReport();
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
	private static class ConstructorTestClass extends ToxicShockSyndromeCaseReportOperations {};
	
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
	
	

	
	
} // ToxicShockSyndromeCaseReportOperations