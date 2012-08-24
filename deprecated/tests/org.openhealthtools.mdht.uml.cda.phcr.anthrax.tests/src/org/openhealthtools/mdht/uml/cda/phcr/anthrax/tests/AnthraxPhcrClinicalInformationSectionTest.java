
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxFactory;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxPhcrClinicalInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection#validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Clinical Information Section Anthrax Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection#getAnthraxCaseObservation() <em>Get Anthrax Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AnthraxPhcrClinicalInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation() {
      OperationsTestCase<AnthraxPhcrClinicalInformationSection> validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservationTestCase = new OperationsTestCase<AnthraxPhcrClinicalInformationSection>(
      "validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_PHCR_CLINICAL_INFORMATION_SECTION_ANTHRAX_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrClinicalInformationSectionOperations.validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservation(
          (AnthraxPhcrClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxPhcrClinicalInformationSectionAnthraxCaseObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxCaseObservation() {


AnthraxPhcrClinicalInformationSection target = objectFactory.create();
target.getAnthraxCaseObservation();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrClinicalInformationSectionTemplateId() {
      OperationsTestCase<AnthraxPhcrClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<AnthraxPhcrClinicalInformationSection>(
      "validatePhcrClinicalInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
          (AnthraxPhcrClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AnthraxPhcrClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnthraxPhcrClinicalInformationSection> {
		public AnthraxPhcrClinicalInformationSection create() {		
			return AnthraxFactory.eINSTANCE.createAnthraxPhcrClinicalInformationSection();
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
	private static class ConstructorTestClass extends AnthraxPhcrClinicalInformationSectionOperations {};
	
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
	
	

	
	
} // AnthraxPhcrClinicalInformationSectionOperations