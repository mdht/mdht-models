
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaTherapeuticRegimenActOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia Therapeutic Regimen Act Tularemia Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#getTularemiaTreatmentGivenSubstanceAdministrations() <em>Get Tularemia Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#getTularemiaTreatmentNotGivenSubstanceAdministrations() <em>Get Tularemia Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TularemiaTherapeuticRegimenActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration() {
      OperationsTestCase<TularemiaTherapeuticRegimenAct> validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministrationTestCase = new OperationsTestCase<TularemiaTherapeuticRegimenAct>(
      "validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(TularemiaTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaTherapeuticRegimenActOperations.validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministration(
          (TularemiaTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaTherapeuticRegimenActTularemiaTreatmentGivenSubstanceAdministrationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration() {
      OperationsTestCase<TularemiaTherapeuticRegimenAct> validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministrationTestCase = new OperationsTestCase<TularemiaTherapeuticRegimenAct>(
      "validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_THERAPEUTIC_REGIMEN_ACT_TULAREMIA_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(TularemiaTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaTherapeuticRegimenActOperations.validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministration(
          (TularemiaTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaTherapeuticRegimenActTularemiaTreatmentNotGivenSubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaTreatmentGivenSubstanceAdministrations() {


TularemiaTherapeuticRegimenAct target = objectFactory.create();
target.getTularemiaTreatmentGivenSubstanceAdministrations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaTreatmentNotGivenSubstanceAdministrations() {


TularemiaTherapeuticRegimenAct target = objectFactory.create();
target.getTularemiaTreatmentNotGivenSubstanceAdministrations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTherapeuticRegimenActTemplateId() {
      OperationsTestCase<TularemiaTherapeuticRegimenAct> validateTherapeuticRegimenActTemplateIdTestCase = new OperationsTestCase<TularemiaTherapeuticRegimenAct>(
      "validateTherapeuticRegimenActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(TularemiaTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(
          (TularemiaTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTherapeuticRegimenActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TularemiaTherapeuticRegimenActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TularemiaTherapeuticRegimenAct> {
		public TularemiaTherapeuticRegimenAct create() {		
			return TularemiaFactory.eINSTANCE.createTularemiaTherapeuticRegimenAct();
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
	private static class ConstructorTestClass extends TularemiaTherapeuticRegimenActOperations {};
	
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
	
	

	
	
} // TularemiaTherapeuticRegimenActOperations