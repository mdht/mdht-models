
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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisImmunizationsSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection#validatePertussisImmunizationsSectionPertussisImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Immunizations Section Pertussis Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection#getPertussisImmunizationActivities() <em>Get Pertussis Immunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisImmunizationsSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisImmunizationsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisImmunizationsSectionPertussisImmunizationActivity() {
      OperationsTestCase<PertussisImmunizationsSection> validatePertussisImmunizationsSectionPertussisImmunizationActivityTestCase = new OperationsTestCase<PertussisImmunizationsSection>(
      "validatePertussisImmunizationsSectionPertussisImmunizationActivity",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_IMMUNIZATIONS_SECTION_PERTUSSIS_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisImmunizationsSection target) {

      }

      @Override
      protected void updateToPass(PertussisImmunizationsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisImmunizationsSectionOperations.validatePertussisImmunizationsSectionPertussisImmunizationActivity(
          (PertussisImmunizationsSection) objectToTest, diagnostician, map);
      }

    };

    validatePertussisImmunizationsSectionPertussisImmunizationActivityTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisImmunizationActivities() {


PertussisImmunizationsSection target = objectFactory.create();
target.getPertussisImmunizationActivities();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateImmunizationsSectionTemplateId() {
      OperationsTestCase<PertussisImmunizationsSection> validateImmunizationsSectionTemplateIdTestCase = new OperationsTestCase<PertussisImmunizationsSection>(
      "validateImmunizationsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisImmunizationsSection target) {

      }

      @Override
      protected void updateToPass(PertussisImmunizationsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisImmunizationsSectionOperations.validateImmunizationsSectionTemplateId(
          (PertussisImmunizationsSection) objectToTest, diagnostician, map);
      }

    };

    validateImmunizationsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisImmunizationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisImmunizationsSection> {
		public PertussisImmunizationsSection create() {		
			return PertussisFactory.eINSTANCE.createPertussisImmunizationsSection();
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
	private static class ConstructorTestClass extends PertussisImmunizationsSectionOperations {};
	
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
	
	

	
	
} // PertussisImmunizationsSectionOperations