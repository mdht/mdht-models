
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.operations.SalmonellosisCaseReportOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validateSalmonellosisCaseReportTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Salmonellosis Case Report Salmonellosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#getSalmonellosisSocialHistorySection() <em>Get Salmonellosis Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#getSalmonellosisRelevantDxTestsSection() <em>Get Salmonellosis Relevant Dx Tests Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#getSalmonellosisPHCRClinicalInformationSection() <em>Get Salmonellosis PHCR Clinical Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.salmonellosis.SalmonellosisCaseReport#validatePublicHealthCaseReportTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Public Health Case Report Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SalmonellosisCaseReportTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSalmonellosisCaseReportTitle() {
			OperationsTestCase<SalmonellosisCaseReport> validateSalmonellosisCaseReportTitleTestCase = new OperationsTestCase<SalmonellosisCaseReport>(
			"validateSalmonellosisCaseReportTitle",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_CASE_REPORT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseReport target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseReport target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseReportOperations.validateSalmonellosisCaseReportTitle(
					(SalmonellosisCaseReport) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisCaseReportTitleTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateSalmonellosisCaseReportSalmonellosisSocialHistorySection() {
			OperationsTestCase<SalmonellosisCaseReport> validateSalmonellosisCaseReportSalmonellosisSocialHistorySectionTestCase = new OperationsTestCase<SalmonellosisCaseReport>(
			"validateSalmonellosisCaseReportSalmonellosisSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseReport target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* SalmonellosisSocialHistorySection */ 
			
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseReportOperations.validateSalmonellosisCaseReportSalmonellosisSocialHistorySection(
					(SalmonellosisCaseReport) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisCaseReportSalmonellosisSocialHistorySectionTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection() {
			OperationsTestCase<SalmonellosisCaseReport> validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSectionTestCase = new OperationsTestCase<SalmonellosisCaseReport>(
			"validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_RELEVANT_DX_TESTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseReport target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseReportOperations.validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSection(
					(SalmonellosisCaseReport) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisCaseReportSalmonellosisRelevantDxTestsSectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection() {
			OperationsTestCase<SalmonellosisCaseReport> validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSectionTestCase = new OperationsTestCase<SalmonellosisCaseReport>(
			"validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection",
			operationsForOCL.getOCLValue("VALIDATE_SALMONELLOSIS_CASE_REPORT_SALMONELLOSIS_PHCR_CLINICAL_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseReport target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
			
				
				/* SalmonellosisPHCRClinicalInformationSection */ 
				SalmonellosisPHCRClinicalInformationSection section =
				
				SalmonellosisFactory.eINSTANCE.createSalmonellosisPHCRClinicalInformationSection().init(); 
					
			
			target.addSection(section);
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseReportOperations.validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSection(
					(SalmonellosisCaseReport) objectToTest, diagnostician, map);
			}

		};

		validateSalmonellosisCaseReportSalmonellosisPHCRClinicalInformationSectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSalmonellosisSocialHistorySection() {


SalmonellosisCaseReport target = objectFactory.create();
target.getSalmonellosisSocialHistorySection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSalmonellosisRelevantDxTestsSection() {


SalmonellosisCaseReport target = objectFactory.create();
target.getSalmonellosisRelevantDxTestsSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSalmonellosisPHCRClinicalInformationSection() {


SalmonellosisCaseReport target = objectFactory.create();
target.getSalmonellosisPHCRClinicalInformationSection();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePublicHealthCaseReportTemplateId() {
			OperationsTestCase<SalmonellosisCaseReport> validatePublicHealthCaseReportTemplateIdTestCase = new OperationsTestCase<SalmonellosisCaseReport>(
			"validatePublicHealthCaseReportTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PUBLIC_HEALTH_CASE_REPORT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SalmonellosisCaseReport target) {

			}

			@Override
			protected void updateToPass(SalmonellosisCaseReport target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SalmonellosisCaseReportOperations.validatePublicHealthCaseReportTemplateId(
					(SalmonellosisCaseReport) objectToTest, diagnostician, map);
			}

		};

		validatePublicHealthCaseReportTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SalmonellosisCaseReportOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SalmonellosisCaseReport> {
		public SalmonellosisCaseReport create() {		
			return SalmonellosisFactory.eINSTANCE.createSalmonellosisCaseReport();
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
	private static class ConstructorTestClass extends SalmonellosisCaseReportOperations {};
	
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
	
	

	
	
} // SalmonellosisCaseReportOperations