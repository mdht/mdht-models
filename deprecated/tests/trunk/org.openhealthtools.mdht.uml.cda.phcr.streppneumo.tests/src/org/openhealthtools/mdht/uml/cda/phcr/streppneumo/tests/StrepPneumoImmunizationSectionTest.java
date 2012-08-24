
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
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoImmunizationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection#validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Immunization Section Strep Pneumo Immunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection#getStrepPneumoImmunizationActivities() <em>Get Strep Pneumo Immunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoImmunizationSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoImmunizationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity() {
      OperationsTestCase<StrepPneumoImmunizationSection> validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivityTestCase = new OperationsTestCase<StrepPneumoImmunizationSection>(
      "validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_IMMUNIZATION_SECTION_STREP_PNEUMO_IMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoImmunizationSection target) {

      }

      @Override
      protected void updateToPass(StrepPneumoImmunizationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoImmunizationSectionOperations.validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivity(
          (StrepPneumoImmunizationSection) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoImmunizationSectionStrepPneumoImmunizationActivityTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoImmunizationActivities() {


StrepPneumoImmunizationSection target = objectFactory.create();
target.getStrepPneumoImmunizationActivities();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateImmunizationsSectionTemplateId() {
      OperationsTestCase<StrepPneumoImmunizationSection> validateImmunizationsSectionTemplateIdTestCase = new OperationsTestCase<StrepPneumoImmunizationSection>(
      "validateImmunizationsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoImmunizationSection target) {

      }

      @Override
      protected void updateToPass(StrepPneumoImmunizationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoImmunizationSectionOperations.validateImmunizationsSectionTemplateId(
          (StrepPneumoImmunizationSection) objectToTest, diagnostician, map);
      }

    };

    validateImmunizationsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoImmunizationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoImmunizationSection> {
		public StrepPneumoImmunizationSection create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoImmunizationSection();
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
	private static class ConstructorTestClass extends StrepPneumoImmunizationSectionOperations {};
	
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
	
	

	
	
} // StrepPneumoImmunizationSectionOperations