
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.cocci.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciFactory;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.operations.CoccidioidesTherapeuticRegimenActOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides Therapeutic Regimen Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides Therapeutic Regimen Act Coccidioides Treatment Not Given Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#getCoccidioidesTreatmentGivenSubstanceAdministrations() <em>Get Coccidioides Treatment Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#getCoccidioidesTreatmentNotGivenSubstanceAdministrations() <em>Get Coccidioides Treatment Not Given Substance Administrations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesTherapeuticRegimenAct#validateTherapeuticRegimenActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Therapeutic Regimen Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class CoccidioidesTherapeuticRegimenActTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration() {
      OperationsTestCase<CoccidioidesTherapeuticRegimenAct> validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministrationTestCase = new OperationsTestCase<CoccidioidesTherapeuticRegimenAct>(
      "validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(CoccidioidesTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesTherapeuticRegimenActOperations.validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministration(
          (CoccidioidesTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentGivenSubstanceAdministrationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration() {
      OperationsTestCase<CoccidioidesTherapeuticRegimenAct> validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministrationTestCase = new OperationsTestCase<CoccidioidesTherapeuticRegimenAct>(
      "validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration",
      operationsForOCL.getOCLValue("VALIDATE_COCCIDIOIDES_THERAPEUTIC_REGIMEN_ACT_COCCIDIOIDES_TREATMENT_NOT_GIVEN_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(CoccidioidesTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesTherapeuticRegimenActOperations.validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministration(
          (CoccidioidesTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateCoccidioidesTherapeuticRegimenActCoccidioidesTreatmentNotGivenSubstanceAdministrationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesTreatmentGivenSubstanceAdministrations() {


CoccidioidesTherapeuticRegimenAct target = objectFactory.create();
target.getCoccidioidesTreatmentGivenSubstanceAdministrations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCoccidioidesTreatmentNotGivenSubstanceAdministrations() {


CoccidioidesTherapeuticRegimenAct target = objectFactory.create();
target.getCoccidioidesTreatmentNotGivenSubstanceAdministrations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTherapeuticRegimenActTemplateId() {
      OperationsTestCase<CoccidioidesTherapeuticRegimenAct> validateTherapeuticRegimenActTemplateIdTestCase = new OperationsTestCase<CoccidioidesTherapeuticRegimenAct>(
      "validateTherapeuticRegimenActTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_THERAPEUTIC_REGIMEN_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(CoccidioidesTherapeuticRegimenAct target) {

      }

      @Override
      protected void updateToPass(CoccidioidesTherapeuticRegimenAct target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return CoccidioidesTherapeuticRegimenActOperations.validateTherapeuticRegimenActTemplateId(
          (CoccidioidesTherapeuticRegimenAct) objectToTest, diagnostician, map);
      }

    };

    validateTherapeuticRegimenActTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends CoccidioidesTherapeuticRegimenActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CoccidioidesTherapeuticRegimenAct> {
		public CoccidioidesTherapeuticRegimenAct create() {		
			return CocciFactory.eINSTANCE.createCoccidioidesTherapeuticRegimenAct();
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
	private static class ConstructorTestClass extends CoccidioidesTherapeuticRegimenActOperations {};
	
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
	
	

	
	
} // CoccidioidesTherapeuticRegimenActOperations