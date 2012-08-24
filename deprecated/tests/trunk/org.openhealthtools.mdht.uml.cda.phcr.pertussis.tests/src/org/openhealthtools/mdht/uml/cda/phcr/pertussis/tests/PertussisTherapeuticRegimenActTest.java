
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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations.PertussisTherapeuticRegimenActOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Therapeutic Regimen Act Pertussis Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#getPertussisTreatmentGivenSubstanceAdministrations() <em>Get Pertussis Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#getPertussisTreatmentNotGivenSubstanceAdministrations() <em>Get Pertussis Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PertussisTherapeuticRegimenActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration() {
      OperationsTestCase<PertussisTherapeuticRegimenAct> validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministrationTestCase = new OperationsTestCase<PertussisTherapeuticRegimenAct>(
      "validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(PertussisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisTherapeuticRegimenActOperations.validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministration(
          (PertussisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validatePertussisTherapeuticRegimenActPertussisTreatmentGivenSubstanceAdministrationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration() {
      OperationsTestCase<PertussisTherapeuticRegimenAct> validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministrationTestCase = new OperationsTestCase<PertussisTherapeuticRegimenAct>(
      "validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_PERTUSSIS_THERAPEUTIC_REGIMEN_ACT_PERTUSSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(PertussisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisTherapeuticRegimenActOperations.validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministration(
          (PertussisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validatePertussisTherapeuticRegimenActPertussisTreatmentNotGivenSubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisTreatmentGivenSubstanceAdministrations() {


PertussisTherapeuticRegimenAct target = objectFactory.create();
target.getPertussisTreatmentGivenSubstanceAdministrations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPertussisTreatmentNotGivenSubstanceAdministrations() {


PertussisTherapeuticRegimenAct target = objectFactory.create();
target.getPertussisTreatmentNotGivenSubstanceAdministrations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTherapeuticRegimenActTemplateId() {
      OperationsTestCase<PertussisTherapeuticRegimenAct> validateTherapeuticRegimenActTemplateIdTestCase = new OperationsTestCase<PertussisTherapeuticRegimenAct>(
      "validateTherapeuticRegimenActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PertussisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(PertussisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PertussisTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(
          (PertussisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTherapeuticRegimenActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PertussisTherapeuticRegimenActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PertussisTherapeuticRegimenAct> {
		public PertussisTherapeuticRegimenAct create() {		
			return PertussisFactory.eINSTANCE.createPertussisTherapeuticRegimenAct();
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
	private static class ConstructorTestClass extends PertussisTherapeuticRegimenActOperations {};
	
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
	
	

	
	
} // PertussisTherapeuticRegimenActOperations