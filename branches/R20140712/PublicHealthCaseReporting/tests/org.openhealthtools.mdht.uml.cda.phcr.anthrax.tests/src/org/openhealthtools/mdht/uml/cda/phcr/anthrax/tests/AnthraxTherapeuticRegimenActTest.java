
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
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations.AnthraxTherapeuticRegimenActOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Therapeutic Regimen Act Anthrax Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#getAnthraxTreatmentGivenSubstanceAdministrations() <em>Get Anthrax Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#getAnthraxTreatmentNotGivenSubstanceAdministrations() <em>Get Anthrax Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AnthraxTherapeuticRegimenActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration() {
      OperationsTestCase<AnthraxTherapeuticRegimenAct> validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministrationTestCase = new OperationsTestCase<AnthraxTherapeuticRegimenAct>(
      "validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(AnthraxTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxTherapeuticRegimenActOperations.validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministration(
          (AnthraxTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxTherapeuticRegimenActAnthraxTreatmentGivenSubstanceAdministrationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration() {
      OperationsTestCase<AnthraxTherapeuticRegimenAct> validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministrationTestCase = new OperationsTestCase<AnthraxTherapeuticRegimenAct>(
      "validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_ANTHRAX_THERAPEUTIC_REGIMEN_ACT_ANTHRAX_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(AnthraxTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxTherapeuticRegimenActOperations.validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministration(
          (AnthraxTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateAnthraxTherapeuticRegimenActAnthraxTreatmentNotGivenSubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxTreatmentGivenSubstanceAdministrations() {


AnthraxTherapeuticRegimenAct target = objectFactory.create();
target.getAnthraxTreatmentGivenSubstanceAdministrations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAnthraxTreatmentNotGivenSubstanceAdministrations() {


AnthraxTherapeuticRegimenAct target = objectFactory.create();
target.getAnthraxTreatmentNotGivenSubstanceAdministrations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTherapeuticRegimenActTemplateId() {
      OperationsTestCase<AnthraxTherapeuticRegimenAct> validateTherapeuticRegimenActTemplateIdTestCase = new OperationsTestCase<AnthraxTherapeuticRegimenAct>(
      "validateTherapeuticRegimenActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AnthraxTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(AnthraxTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AnthraxTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(
          (AnthraxTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTherapeuticRegimenActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AnthraxTherapeuticRegimenActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AnthraxTherapeuticRegimenAct> {
		public AnthraxTherapeuticRegimenAct create() {		
			return AnthraxFactory.eINSTANCE.createAnthraxTherapeuticRegimenAct();
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
	private static class ConstructorTestClass extends AnthraxTherapeuticRegimenActOperations {};
	
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
	
	

	
	
} // AnthraxTherapeuticRegimenActOperations