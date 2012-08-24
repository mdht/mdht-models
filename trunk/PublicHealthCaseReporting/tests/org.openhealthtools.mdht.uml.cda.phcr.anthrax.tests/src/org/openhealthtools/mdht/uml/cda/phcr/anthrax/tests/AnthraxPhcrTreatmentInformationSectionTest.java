
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
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxPhcrTreatmentInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection#validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Treatment Information Section Anthrax Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection#getAnthraxTherapeuticRegimenAct() <em>Get Anthrax Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AnthraxPhcrTreatmentInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct() {
      OperationsTestCase<AnthraxPhcrTreatmentInformationSection> validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenActTestCase = new OperationsTestCase<AnthraxPhcrTreatmentInformationSection>(
      "validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_PHCR_TREATMENT_INFORMATION_SECTION_ANTHRAX_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrTreatmentInformationSectionOperations.validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenAct(
          (AnthraxPhcrTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxPhcrTreatmentInformationSectionAnthraxTherapeuticRegimenActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxTherapeuticRegimenAct() {


AnthraxPhcrTreatmentInformationSection target = objectFactory.create();
target.getAnthraxTherapeuticRegimenAct();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrTreatmentInformationSectionTemplateId() {
      OperationsTestCase<AnthraxPhcrTreatmentInformationSection> validatePhcrTreatmentInformationSectionTemplateIdTestCase = new OperationsTestCase<AnthraxPhcrTreatmentInformationSection>(
      "validatePhcrTreatmentInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxPhcrTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(AnthraxPhcrTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxPhcrTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(
          (AnthraxPhcrTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrTreatmentInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AnthraxPhcrTreatmentInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnthraxPhcrTreatmentInformationSection> {
		public AnthraxPhcrTreatmentInformationSection create() {		
			return AnthraxFactory.eINSTANCE.createAnthraxPhcrTreatmentInformationSection();
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
	private static class ConstructorTestClass extends AnthraxPhcrTreatmentInformationSectionOperations {};
	
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
	
	

	
	
} // AnthraxPhcrTreatmentInformationSectionOperations