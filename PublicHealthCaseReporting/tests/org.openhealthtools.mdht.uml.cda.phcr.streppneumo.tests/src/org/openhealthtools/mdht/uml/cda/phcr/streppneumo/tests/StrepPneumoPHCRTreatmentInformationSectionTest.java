
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoFactory;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoPHCRTreatmentInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection#validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo PHCR Treatment Information Section Strep Pneumo Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection#getStrepPneumoTherapeuticRegimenAct() <em>Get Strep Pneumo Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoPHCRTreatmentInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct() {
      OperationsTestCase<StrepPneumoPHCRTreatmentInformationSection> validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenActTestCase = new OperationsTestCase<StrepPneumoPHCRTreatmentInformationSection>(
      "validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_PHCR_TREATMENT_INFORMATION_SECTION_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPHCRTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPHCRTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPHCRTreatmentInformationSectionOperations.validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenAct(
          (StrepPneumoPHCRTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoPHCRTreatmentInformationSectionStrepPneumoTherapeuticRegimenActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoTherapeuticRegimenAct() {


StrepPneumoPHCRTreatmentInformationSection target = objectFactory.create();
target.getStrepPneumoTherapeuticRegimenAct();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrTreatmentInformationSectionTemplateId() {
      OperationsTestCase<StrepPneumoPHCRTreatmentInformationSection> validatePhcrTreatmentInformationSectionTemplateIdTestCase = new OperationsTestCase<StrepPneumoPHCRTreatmentInformationSection>(
      "validatePhcrTreatmentInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPHCRTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPHCRTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(
          (StrepPneumoPHCRTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrTreatmentInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoPHCRTreatmentInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoPHCRTreatmentInformationSection> {
		public StrepPneumoPHCRTreatmentInformationSection create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoPHCRTreatmentInformationSection();
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
	private static class ConstructorTestClass extends StrepPneumoPHCRTreatmentInformationSectionOperations {};
	
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
	
	

	
	
} // StrepPneumoPHCRTreatmentInformationSectionOperations