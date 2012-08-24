
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
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations.StrepPneumoTherapeuticRegimenActOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Therapeutic Regimen Act Strep Pneumo Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#getStrepPneumoTreatmentGivenSubstanceAdministrations() <em>Get Strep Pneumo Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#getStrepPneumoTreatmentNotGivenSubstanceAdministrations() <em>Get Strep Pneumo Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class StrepPneumoTherapeuticRegimenActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration() {
      OperationsTestCase<StrepPneumoTherapeuticRegimenAct> validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministrationTestCase = new OperationsTestCase<StrepPneumoTherapeuticRegimenAct>(
      "validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoTherapeuticRegimenActOperations.validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministration(
          (StrepPneumoTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentGivenSubstanceAdministrationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration() {
      OperationsTestCase<StrepPneumoTherapeuticRegimenAct> validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministrationTestCase = new OperationsTestCase<StrepPneumoTherapeuticRegimenAct>(
      "validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_STREP_PNEUMO_THERAPEUTIC_REGIMEN_ACT_STREP_PNEUMO_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoTherapeuticRegimenActOperations.validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministration(
          (StrepPneumoTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateStrepPneumoTherapeuticRegimenActStrepPneumoTreatmentNotGivenSubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoTreatmentGivenSubstanceAdministrations() {


StrepPneumoTherapeuticRegimenAct target = objectFactory.create();
target.getStrepPneumoTreatmentGivenSubstanceAdministrations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetStrepPneumoTreatmentNotGivenSubstanceAdministrations() {


StrepPneumoTherapeuticRegimenAct target = objectFactory.create();
target.getStrepPneumoTreatmentNotGivenSubstanceAdministrations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTherapeuticRegimenActTemplateId() {
      OperationsTestCase<StrepPneumoTherapeuticRegimenAct> validateTherapeuticRegimenActTemplateIdTestCase = new OperationsTestCase<StrepPneumoTherapeuticRegimenAct>(
      "validateTherapeuticRegimenActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(StrepPneumoTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(StrepPneumoTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return StrepPneumoTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(
          (StrepPneumoTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTherapeuticRegimenActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends StrepPneumoTherapeuticRegimenActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrepPneumoTherapeuticRegimenAct> {
		public StrepPneumoTherapeuticRegimenAct create() {		
			return StrepPneumoFactory.eINSTANCE.createStrepPneumoTherapeuticRegimenAct();
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
	private static class ConstructorTestClass extends StrepPneumoTherapeuticRegimenActOperations {};
	
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
	
	

	
	
} // StrepPneumoTherapeuticRegimenActOperations