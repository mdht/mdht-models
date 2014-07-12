
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.PalpableMassOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Palpable Mass</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#validatePalpableMassMassIdentification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Palpable Mass Mass Identification</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PalpableMass#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PalpableMassTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassTemplateId() {
      OperationsTestCase<PalpableMass> validatePalpableMassTemplateIdTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassTemplateId(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassClassCode() {
      OperationsTestCase<PalpableMass> validatePalpableMassClassCodeTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassClassCode",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassClassCode(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassCode() {
      OperationsTestCase<PalpableMass> validatePalpableMassCodeTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassCode",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassCode(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassId() {
      OperationsTestCase<PalpableMass> validatePalpableMassIdTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassId",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassId(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassMoodCode() {
      OperationsTestCase<PalpableMass> validatePalpableMassMoodCodeTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassMoodCode(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassValue() {
      OperationsTestCase<PalpableMass> validatePalpableMassValueTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassValue",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassValue(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassStatusCode() {
      OperationsTestCase<PalpableMass> validatePalpableMassStatusCodeTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassStatusCode(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassTargetSiteCode() {
      OperationsTestCase<PalpableMass> validatePalpableMassTargetSiteCodeTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassTargetSiteCode(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassNonPerformanceReason() {
      OperationsTestCase<PalpableMass> validatePalpableMassNonPerformanceReasonTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassNonPerformanceReason(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassPlannedStudyDay() {
      OperationsTestCase<PalpableMass> validatePalpableMassPlannedStudyDayTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassPlannedStudyDay",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassPlannedStudyDay(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassPlannedStudyDayTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassDataCollection() {
      OperationsTestCase<PalpableMass> validatePalpableMassDataCollectionTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassDataCollection(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePalpableMassMassIdentification() {
      OperationsTestCase<PalpableMass> validatePalpableMassMassIdentificationTestCase = new OperationsTestCase<PalpableMass>(
      "validatePalpableMassMassIdentification",
      operationsForOCL.getOCLValue("VALIDATE_PALPABLE_MASS_MASS_IDENTIFICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PalpableMass target) {

      }

      @Override
      protected void updateToPass(PalpableMass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PalpableMassOperations.validatePalpableMassMassIdentification(
          (PalpableMass) objectToTest, diagnostician, map);
      }

    };

    validatePalpableMassMassIdentificationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


PalpableMass target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetPlannedStudyDay() {


PalpableMass target = objectFactory.create();
target.getPlannedStudyDay();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


PalpableMass target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends PalpableMassOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PalpableMass> {
		public PalpableMass create() {		
			return SdtmFactory.eINSTANCE.createPalpableMass();
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
	private static class ConstructorTestClass extends PalpableMassOperations {};
	
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
	
	

	
	
} // PalpableMassOperations