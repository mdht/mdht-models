
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
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoPHCRClinicalInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection#validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo PHCR Clinical Information Section Strep Pneumo Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection#getStrepPneumoCaseObservation() <em>Get Strep Pneumo Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoPHCRClinicalInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation() {
      OperationsTestCase<StrepPneumoPHCRClinicalInformationSection> validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservationTestCase = new OperationsTestCase<StrepPneumoPHCRClinicalInformationSection>(
      "validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_PHCR_CLINICAL_INFORMATION_SECTION_STREP_PNEUMO_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPHCRClinicalInformationSectionOperations.validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservation(
          (StrepPneumoPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoPHCRClinicalInformationSectionStrepPneumoCaseObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoCaseObservation() {


StrepPneumoPHCRClinicalInformationSection target = objectFactory.create();
target.getStrepPneumoCaseObservation();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrClinicalInformationSectionTemplateId() {
      OperationsTestCase<StrepPneumoPHCRClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<StrepPneumoPHCRClinicalInformationSection>(
      "validatePhcrClinicalInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(StrepPneumoPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
          (StrepPneumoPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoPHCRClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoPHCRClinicalInformationSection> {
		public StrepPneumoPHCRClinicalInformationSection create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoPHCRClinicalInformationSection();
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
	private static class ConstructorTestClass extends StrepPneumoPHCRClinicalInformationSectionOperations {};
	
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
	
	

	
	
} // StrepPneumoPHCRClinicalInformationSectionOperations