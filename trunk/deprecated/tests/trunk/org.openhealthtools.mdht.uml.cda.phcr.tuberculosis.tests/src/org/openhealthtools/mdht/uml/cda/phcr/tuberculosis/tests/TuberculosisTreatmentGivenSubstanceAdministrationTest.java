
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisTreatmentGivenSubstanceAdministrationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Treatment Given Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTreatmentGivenSubstanceAdministration#validateTreatmentGivenSubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Treatment Given Substance Administration Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisTreatmentGivenSubstanceAdministrationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTreatmentGivenSubstanceAdministrationTemplateId() {
      OperationsTestCase<TuberculosisTreatmentGivenSubstanceAdministration> validateTreatmentGivenSubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<TuberculosisTreatmentGivenSubstanceAdministration>(
      "validateTreatmentGivenSubstanceAdministrationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisTreatmentGivenSubstanceAdministration target) {

      }

      @Override
      protected void updateToPass(TuberculosisTreatmentGivenSubstanceAdministration target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisTreatmentGivenSubstanceAdministrationOperations.validateTreatmentGivenSubstanceAdministrationTemplateId(
          (TuberculosisTreatmentGivenSubstanceAdministration) objectToTest, diagnostician, map);
      }

    };

    validateTreatmentGivenSubstanceAdministrationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisTreatmentGivenSubstanceAdministrationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisTreatmentGivenSubstanceAdministration> {
		public TuberculosisTreatmentGivenSubstanceAdministration create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisTreatmentGivenSubstanceAdministration();
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
	private static class ConstructorTestClass extends TuberculosisTreatmentGivenSubstanceAdministrationOperations {};
	
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
	
	

	
	
} // TuberculosisTreatmentGivenSubstanceAdministrationOperations