
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBPHCRClinicalInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BCase Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BRisk Associated Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Viral Hepatitis History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section STD History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#getAcuteHepatitisBCaseObservation() <em>Get Acute Hepatitis BCase Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#getAcuteHepatitisBRiskAssociatedProcedures() <em>Get Acute Hepatitis BRisk Associated Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#getViralHepatitisHistoryObservations() <em>Get Viral Hepatitis History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#getSTDHistoryObservations() <em>Get STD History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBPHCRClinicalInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation() {
      OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection> validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservationTestCase = new OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection>(
      "validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(
          (AcuteHepatitisBPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure() {
      OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection> validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedureTestCase = new OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection>(
      "validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(
          (AcuteHepatitisBPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedureTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation() {
      OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection> validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservationTestCase = new OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection>(
      "validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(
          (AcuteHepatitisBPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation() {
      OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection> validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservationTestCase = new OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection>(
      "validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(
          (AcuteHepatitisBPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBCaseObservation() {


AcuteHepatitisBPHCRClinicalInformationSection target = objectFactory.create();
target.getAcuteHepatitisBCaseObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBRiskAssociatedProcedures() {


AcuteHepatitisBPHCRClinicalInformationSection target = objectFactory.create();
target.getAcuteHepatitisBRiskAssociatedProcedures();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetViralHepatitisHistoryObservations() {


AcuteHepatitisBPHCRClinicalInformationSection target = objectFactory.create();
target.getViralHepatitisHistoryObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSTDHistoryObservations() {


AcuteHepatitisBPHCRClinicalInformationSection target = objectFactory.create();
target.getSTDHistoryObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrClinicalInformationSectionTemplateId() {
      OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBPHCRClinicalInformationSection>(
      "validatePhcrClinicalInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
          (AcuteHepatitisBPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBPHCRClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBPHCRClinicalInformationSection> {
		public AcuteHepatitisBPHCRClinicalInformationSection create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBPHCRClinicalInformationSection();
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
	private static class ConstructorTestClass extends AcuteHepatitisBPHCRClinicalInformationSectionOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBPHCRClinicalInformationSectionOperations