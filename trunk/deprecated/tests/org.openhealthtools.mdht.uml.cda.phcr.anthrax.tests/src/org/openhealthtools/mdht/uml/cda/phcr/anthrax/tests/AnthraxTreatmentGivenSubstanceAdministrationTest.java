
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
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxTreatmentGivenSubstanceAdministrationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Given Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AnthraxTreatmentGivenSubstanceAdministrationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTreatmentGivenSubstanceAdministrationTemplateId() {
      OperationsTestCase<AnthraxTreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<AnthraxTreatmentGivenSubstanceAdministration>(
      "validateTreatmentGivenSubstanceAdministrationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxTreatmentGivenSubstanceAdministration target) {

      }

      @Override
      protected void updateToPass(AnthraxTreatmentGivenSubstanceAdministration target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxTreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationTemplateId(
          (AnthraxTreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
      }

    };

    validateTreatmentGivenSubstanceAdministrationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AnthraxTreatmentGivenSubstanceAdministrationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnthraxTreatmentGivenSubstanceAdministration> {
		public AnthraxTreatmentGivenSubstanceAdministration create() {		
			return AnthraxFactory.eINSTANCE.createAnthraxTreatmentGivenSubstanceAdministration();
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
	private static class ConstructorTestClass extends AnthraxTreatmentGivenSubstanceAdministrationOperations {};
	
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
	
	

	
	
} // AnthraxTreatmentGivenSubstanceAdministrationOperations