
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisPHCRImmunizationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Immunization Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection#validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis PHCR Immunization Section Tuberculosis Immunization Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection#getTuberculosisImmunizationActivitySubstanceAdministrations() <em>Get Tuberculosis Immunization Activity Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPHCRImmunizationSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisPHCRImmunizationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration() {
      OperationsTestCase<TuberculosisPHCRImmunizationSection> validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministrationTestCase = new OperationsTestCase<TuberculosisPHCRImmunizationSection>(
      "validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_PHCR_IMMUNIZATION_SECTION_TUBERCULOSIS_IMMUNIZATION_ACTIVITY_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisPHCRImmunizationSection target) {

      }

      @Override
      protected void updateToPass(TuberculosisPHCRImmunizationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisPHCRImmunizationSectionOperations.validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministration(
          (TuberculosisPHCRImmunizationSection) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisPHCRImmunizationSectionTuberculosisImmunizationActivitySubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisImmunizationActivitySubstanceAdministrations() {


TuberculosisPHCRImmunizationSection target = objectFactory.create();
target.getTuberculosisImmunizationActivitySubstanceAdministrations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateImmunizationsSectionTemplateId() {
      OperationsTestCase<TuberculosisPHCRImmunizationSection> validateImmunizationsSectionTemplateIdTestCase = new OperationsTestCase<TuberculosisPHCRImmunizationSection>(
      "validateImmunizationsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisPHCRImmunizationSection target) {

      }

      @Override
      protected void updateToPass(TuberculosisPHCRImmunizationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisPHCRImmunizationSectionOperations.validateImmunizationsSectionTemplateId(
          (TuberculosisPHCRImmunizationSection) objectToTest, diagnostician, map);
      }

    };

    validateImmunizationsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisPHCRImmunizationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisPHCRImmunizationSection> {
		public TuberculosisPHCRImmunizationSection create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisPHCRImmunizationSection();
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
	private static class ConstructorTestClass extends TuberculosisPHCRImmunizationSectionOperations {};
	
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
	
	

	
	
} // TuberculosisPHCRImmunizationSectionOperations