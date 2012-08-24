
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBPHCRTreatmentInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BPHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection#validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Treatment Information Section Acute Hepatitis BTherapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection#getAcuteHepatitisBTherapeuticRegimenAct() <em>Get Acute Hepatitis BTherapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBPHCRTreatmentInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct() {
      OperationsTestCase<AcuteHepatitisBPHCRTreatmentInformationSection> validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenActTestCase = new OperationsTestCase<AcuteHepatitisBPHCRTreatmentInformationSection>(
      "validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BPHCR_TREATMENT_INFORMATION_SECTION_ACUTE_HEPATITIS_BTHERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRTreatmentInformationSectionOperations.validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenAct(
          (AcuteHepatitisBPHCRTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBPHCRTreatmentInformationSectionAcuteHepatitisBTherapeuticRegimenActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBTherapeuticRegimenAct() {


AcuteHepatitisBPHCRTreatmentInformationSection target = objectFactory.create();
target.getAcuteHepatitisBTherapeuticRegimenAct();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrTreatmentInformationSectionTemplateId() {
      OperationsTestCase<AcuteHepatitisBPHCRTreatmentInformationSection> validatePhcrTreatmentInformationSectionTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBPHCRTreatmentInformationSection>(
      "validatePhcrTreatmentInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBPHCRTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBPHCRTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(
          (AcuteHepatitisBPHCRTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrTreatmentInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBPHCRTreatmentInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBPHCRTreatmentInformationSection> {
		public AcuteHepatitisBPHCRTreatmentInformationSection create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBPHCRTreatmentInformationSection();
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
	private static class ConstructorTestClass extends AcuteHepatitisBPHCRTreatmentInformationSectionOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBPHCRTreatmentInformationSectionOperations