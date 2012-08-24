
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.hepb.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBRiskAssociatedProcedureOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BRisk Associated Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure#validateAcuteHepatitisBRiskAssociatedProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BRisk Associated Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure#validateAcuteHepatitisBRiskAssociatedProcedureClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BRisk Associated Procedure Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure#validateAcuteHepatitisBRiskAssociatedProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BRisk Associated Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure#validateAcuteHepatitisBRiskAssociatedProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BRisk Associated Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure#validateAcuteHepatitisBRiskAssociatedProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BRisk Associated Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure#validateAcuteHepatitisBRiskAssociatedProcedureStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BRisk Associated Procedure Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure#validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BRisk Associated Procedure Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBRiskAssociatedProcedureTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBRiskAssociatedProcedureTemplateId() {
      OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure> validateAcuteHepatitisBRiskAssociatedProcedureTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure>(
      "validateAcuteHepatitisBRiskAssociatedProcedureTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBRiskAssociatedProcedure target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBRiskAssociatedProcedure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBRiskAssociatedProcedureOperations.validateAcuteHepatitisBRiskAssociatedProcedureTemplateId(
          (AcuteHepatitisBRiskAssociatedProcedure) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBRiskAssociatedProcedureTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBRiskAssociatedProcedureClassCode() {
      OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure> validateAcuteHepatitisBRiskAssociatedProcedureClassCodeTestCase = new OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure>(
      "validateAcuteHepatitisBRiskAssociatedProcedureClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBRiskAssociatedProcedure target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBRiskAssociatedProcedure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBRiskAssociatedProcedureOperations.validateAcuteHepatitisBRiskAssociatedProcedureClassCode(
          (AcuteHepatitisBRiskAssociatedProcedure) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBRiskAssociatedProcedureClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBRiskAssociatedProcedureCode() {
      OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure> validateAcuteHepatitisBRiskAssociatedProcedureCodeTestCase = new OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure>(
      "validateAcuteHepatitisBRiskAssociatedProcedureCode",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBRiskAssociatedProcedure target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBRiskAssociatedProcedure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBRiskAssociatedProcedureOperations.validateAcuteHepatitisBRiskAssociatedProcedureCode(
          (AcuteHepatitisBRiskAssociatedProcedure) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBRiskAssociatedProcedureCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBRiskAssociatedProcedureMoodCode() {
      OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure> validateAcuteHepatitisBRiskAssociatedProcedureMoodCodeTestCase = new OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure>(
      "validateAcuteHepatitisBRiskAssociatedProcedureMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBRiskAssociatedProcedure target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBRiskAssociatedProcedure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBRiskAssociatedProcedureOperations.validateAcuteHepatitisBRiskAssociatedProcedureMoodCode(
          (AcuteHepatitisBRiskAssociatedProcedure) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBRiskAssociatedProcedureMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBRiskAssociatedProcedureStatusCode() {
      OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure> validateAcuteHepatitisBRiskAssociatedProcedureStatusCodeTestCase = new OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure>(
      "validateAcuteHepatitisBRiskAssociatedProcedureStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBRiskAssociatedProcedure target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBRiskAssociatedProcedure target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBRiskAssociatedProcedureOperations.validateAcuteHepatitisBRiskAssociatedProcedureStatusCode(
          (AcuteHepatitisBRiskAssociatedProcedure) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBRiskAssociatedProcedureStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBRiskAssociatedProcedureStatusCodeP() {
      OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure> validateAcuteHepatitisBRiskAssociatedProcedureStatusCodePTestCase = new OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure>(
      "validateAcuteHepatitisBRiskAssociatedProcedureStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBRiskAssociatedProcedure target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBRiskAssociatedProcedure target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBRiskAssociatedProcedureOperations.validateAcuteHepatitisBRiskAssociatedProcedureStatusCodeP(
          (AcuteHepatitisBRiskAssociatedProcedure) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBRiskAssociatedProcedureStatusCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime() {
      OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure> validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTimeTestCase = new OperationsTestCase<AcuteHepatitisBRiskAssociatedProcedure>(
      "validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBRiskAssociatedProcedure target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBRiskAssociatedProcedure target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBRiskAssociatedProcedureOperations.validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTime(
          (AcuteHepatitisBRiskAssociatedProcedure) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBRiskAssociatedProcedureEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBRiskAssociatedProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBRiskAssociatedProcedure> {
		public AcuteHepatitisBRiskAssociatedProcedure create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBRiskAssociatedProcedure();
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
	private static class ConstructorTestClass extends AcuteHepatitisBRiskAssociatedProcedureOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBRiskAssociatedProcedureOperations