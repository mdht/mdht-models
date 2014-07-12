
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisTreatmentInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection#validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Treatment Information Section Pertussis Therapeutic Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection#getPertussisTherapeuticRegimen() <em>Get Pertussis Therapeutic Regimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisTreatmentInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen() {
      OperationsTestCase<PertussisTreatmentInformationSection> validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimenTestCase = new OperationsTestCase<PertussisTreatmentInformationSection>(
      "validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_TREATMENT_INFORMATION_SECTION_PERTUSSIS_THERAPEUTIC_REGIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(PertussisTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisTreatmentInformationSectionOperations.validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimen(
          (PertussisTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePertussisTreatmentInformationSectionPertussisTherapeuticRegimenTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisTherapeuticRegimen() {


PertussisTreatmentInformationSection target = objectFactory.create();
target.getPertussisTherapeuticRegimen();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrTreatmentInformationSectionTemplateId() {
      OperationsTestCase<PertussisTreatmentInformationSection> validatePhcrTreatmentInformationSectionTemplateIdTestCase = new OperationsTestCase<PertussisTreatmentInformationSection>(
      "validatePhcrTreatmentInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(PertussisTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(
          (PertussisTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrTreatmentInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisTreatmentInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisTreatmentInformationSection> {
		public PertussisTreatmentInformationSection create() {		
			return PertussisFactory.eINSTANCE.createPertussisTreatmentInformationSection();
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
	private static class ConstructorTestClass extends PertussisTreatmentInformationSectionOperations {};
	
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
	
	

	
	
} // PertussisTreatmentInformationSectionOperations