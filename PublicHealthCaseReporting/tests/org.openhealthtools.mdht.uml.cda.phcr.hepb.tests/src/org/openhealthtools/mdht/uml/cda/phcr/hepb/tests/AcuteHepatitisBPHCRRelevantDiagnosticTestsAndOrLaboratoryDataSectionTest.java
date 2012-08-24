
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section Acute Hepatitis BResult Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#getAcuteHepatitisBResultObservations() <em>Get Acute Hepatitis BResult Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation() {
      OperationsTestCase<AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection> validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservationTestCase = new OperationsTestCase<AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection>(
      "validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(
          (AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBResultObservations() {


AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection target = objectFactory.create();
target.getAcuteHepatitisBResultObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultsSectionTemplateId() {
      OperationsTestCase<AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection> validateResultsSectionTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection>(
      "validateResultsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations.validateResultsSectionTemplateId(
          (AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) objectToTest, diagnostician, map);
      }

    };

    validateResultsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection> {
		public AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection();
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
	private static class ConstructorTestClass extends AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations