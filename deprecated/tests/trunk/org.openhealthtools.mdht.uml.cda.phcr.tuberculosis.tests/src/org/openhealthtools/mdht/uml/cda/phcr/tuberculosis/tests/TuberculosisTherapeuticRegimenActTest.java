
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisTherapeuticRegimenActOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Therapeutic Regimen Act Tuberculosis Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#getTuberculosisTreatmentGivenSubstanceAdministrations() <em>Get Tuberculosis Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#getTuberculosisTreatmentNotGivenSubstanceAdministrations() <em>Get Tuberculosis Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisTherapeuticRegimenActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration() {
      OperationsTestCase<TuberculosisTherapeuticRegimenAct> validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministrationTestCase = new OperationsTestCase<TuberculosisTherapeuticRegimenAct>(
      "validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(TuberculosisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisTherapeuticRegimenActOperations.validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministration(
          (TuberculosisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentGivenSubstanceAdministrationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration() {
      OperationsTestCase<TuberculosisTherapeuticRegimenAct> validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministrationTestCase = new OperationsTestCase<TuberculosisTherapeuticRegimenAct>(
      "validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_THERAPEUTIC_REGIMEN_ACT_TUBERCULOSIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(TuberculosisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisTherapeuticRegimenActOperations.validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministration(
          (TuberculosisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisTherapeuticRegimenActTuberculosisTreatmentNotGivenSubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisTreatmentGivenSubstanceAdministrations() {


TuberculosisTherapeuticRegimenAct target = objectFactory.create();
target.getTuberculosisTreatmentGivenSubstanceAdministrations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTuberculosisTreatmentNotGivenSubstanceAdministrations() {


TuberculosisTherapeuticRegimenAct target = objectFactory.create();
target.getTuberculosisTreatmentNotGivenSubstanceAdministrations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTherapeuticRegimenActTemplateId() {
      OperationsTestCase<TuberculosisTherapeuticRegimenAct> validateTherapeuticRegimenActTemplateIdTestCase = new OperationsTestCase<TuberculosisTherapeuticRegimenAct>(
      "validateTherapeuticRegimenActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(TuberculosisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(
          (TuberculosisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTherapeuticRegimenActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisTherapeuticRegimenActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisTherapeuticRegimenAct> {
		public TuberculosisTherapeuticRegimenAct create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisTherapeuticRegimenAct();
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
	private static class ConstructorTestClass extends TuberculosisTherapeuticRegimenActOperations {};
	
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
	
	

	
	
} // TuberculosisTherapeuticRegimenActOperations