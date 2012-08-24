
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisTherapeuticRegimenActOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Therapeutic Regimen Act Chlamydiatrachomatis Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations() <em>Get Chlamydiatrachomatis Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations() <em>Get Chlamydiatrachomatis Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ChlamydiatrachomatisTherapeuticRegimenActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration() {
      OperationsTestCase<ChlamydiatrachomatisTherapeuticRegimenAct> validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministrationTestCase = new OperationsTestCase<ChlamydiatrachomatisTherapeuticRegimenAct>(
      "validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisTherapeuticRegimenActOperations.validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministration(
          (ChlamydiatrachomatisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentGivenSubstanceAdministrationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration() {
      OperationsTestCase<ChlamydiatrachomatisTherapeuticRegimenAct> validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationTestCase = new OperationsTestCase<ChlamydiatrachomatisTherapeuticRegimenAct>(
      "validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT_CHLAMYDIATRACHOMATIS_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisTherapeuticRegimenActOperations.validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministration(
          (ChlamydiatrachomatisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisTherapeuticRegimenActChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetChlamydiatrachomatisTreatmentGivenSubstanceAdministrations() {


ChlamydiatrachomatisTherapeuticRegimenAct target = objectFactory.create();
target.getChlamydiatrachomatisTreatmentGivenSubstanceAdministrations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations() {


ChlamydiatrachomatisTherapeuticRegimenAct target = objectFactory.create();
target.getChlamydiatrachomatisTreatmentNotGivenSubstanceAdministrations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTherapeuticRegimenActTemplateId() {
      OperationsTestCase<ChlamydiatrachomatisTherapeuticRegimenAct> validateTherapeuticRegimenActTemplateIdTestCase = new OperationsTestCase<ChlamydiatrachomatisTherapeuticRegimenAct>(
      "validateTherapeuticRegimenActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(
          (ChlamydiatrachomatisTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTherapeuticRegimenActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ChlamydiatrachomatisTherapeuticRegimenActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChlamydiatrachomatisTherapeuticRegimenAct> {
		public ChlamydiatrachomatisTherapeuticRegimenAct create() {		
			return ChlamydiatrachomatisFactory.eINSTANCE.createChlamydiatrachomatisTherapeuticRegimenAct();
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
	private static class ConstructorTestClass extends ChlamydiatrachomatisTherapeuticRegimenActOperations {};
	
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
	
	

	
	
} // ChlamydiatrachomatisTherapeuticRegimenActOperations