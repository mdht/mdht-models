
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.wnv.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvFactory;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.operations.WestNileVirusCaseReportOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>West Nile Virus Case Report</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#validateWestNileVirusCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Wnv Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate West Nile Virus Case Report Wnv Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#getWnvPhcrClinicalInformationSection() <em>Get Wnv Phcr Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#getWnvPhcrRelevantDxTestsSection() <em>Get Wnv Phcr Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WestNileVirusCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WestNileVirusCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateWestNileVirusCaseReportTitle() {
      OperationsTestCase<WestNileVirusCaseReport> validateWestNileVirusCaseReportTitleTestCase = new OperationsTestCase<WestNileVirusCaseReport>(
      "validateWestNileVirusCaseReportTitle",
      operationsForOCL.getOCLValue("VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WestNileVirusCaseReport target) {

      }

      @Override
      protected void updateToPass(WestNileVirusCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WestNileVirusCaseReportOperations.validateWestNileVirusCaseReportTitle(
          (WestNileVirusCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateWestNileVirusCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWestNileVirusCaseReportWnvPhcrClinicalInformationSection() {
      OperationsTestCase<WestNileVirusCaseReport> validateWestNileVirusCaseReportWnvPhcrClinicalInformationSectionTestCase = new OperationsTestCase<WestNileVirusCaseReport>(
      "validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection",
      operationsForOCL.getOCLValue("VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WestNileVirusCaseReport target) {

      }

      @Override
      protected void updateToPass(WestNileVirusCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* WnvPhcrClinicalInformationSection */ 
        WnvPhcrClinicalInformationSection section =
        
        WnvFactory.eINSTANCE.createWnvPhcrClinicalInformationSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WestNileVirusCaseReportOperations.validateWestNileVirusCaseReportWnvPhcrClinicalInformationSection(
          (WestNileVirusCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateWestNileVirusCaseReportWnvPhcrClinicalInformationSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection() {
      OperationsTestCase<WestNileVirusCaseReport> validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSectionTestCase = new OperationsTestCase<WestNileVirusCaseReport>(
      "validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection",
      operationsForOCL.getOCLValue("VALIDATE_WEST_NILE_VIRUS_CASE_REPORT_WNV_PHCR_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WestNileVirusCaseReport target) {

      }

      @Override
      protected void updateToPass(WestNileVirusCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
      
        
        /* WnvPhcrRelevantDxTestsSection */ 
        WnvPhcrRelevantDxTestsSection section =
        
        WnvFactory.eINSTANCE.createWnvPhcrRelevantDxTestsSection().init(); 
          
      
      target.addSection(section);
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WestNileVirusCaseReportOperations.validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSection(
          (WestNileVirusCaseReport) objectToTest, diagnostician, map);
      }

    };

    validateWestNileVirusCaseReportWnvPhcrRelevantDxTestsSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetWnvPhcrClinicalInformationSection() {


WestNileVirusCaseReport target = objectFactory.create();
target.getWnvPhcrClinicalInformationSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetWnvPhcrRelevantDxTestsSection() {


WestNileVirusCaseReport target = objectFactory.create();
target.getWnvPhcrRelevantDxTestsSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
      OperationsTestCase<WestNileVirusCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<WestNileVirusCaseReport>(
      "validatePublicHealthCaseReportTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WestNileVirusCaseReport target) {

      }

      @Override
      protected void updateToPass(WestNileVirusCaseReport target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WestNileVirusCaseReportOperations.validatePublicHealthCaseReportTemplateId(
          (WestNileVirusCaseReport) objectToTest, diagnostician, map);
      }

    };

    validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends WestNileVirusCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WestNileVirusCaseReport> {
		public WestNileVirusCaseReport create() {		
			return WnvFactory.eINSTANCE.createWestNileVirusCaseReport();
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
	private static class ConstructorTestClass extends WestNileVirusCaseReportOperations {};
	
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
	
	

	
	
} // WestNileVirusCaseReportOperations