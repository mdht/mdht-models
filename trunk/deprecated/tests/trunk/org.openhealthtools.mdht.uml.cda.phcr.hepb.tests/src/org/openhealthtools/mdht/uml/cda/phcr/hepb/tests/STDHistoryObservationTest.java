
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.STDHistoryObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>STD History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateSTDHistoryObservationProblemStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate STD History Observation Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#gethepbProblemStatus() <em>Gethepb Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class STDHistoryObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSTDHistoryObservationClassCode() {
      OperationsTestCase<STDHistoryObservation> validateSTDHistoryObservationClassCodeTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateSTDHistoryObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_STD_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateSTDHistoryObservationClassCode(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateSTDHistoryObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateSTDHistoryObservationCode() {
      OperationsTestCase<STDHistoryObservation> validateSTDHistoryObservationCodeTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateSTDHistoryObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_STD_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateSTDHistoryObservationCode(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateSTDHistoryObservationCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSTDHistoryObservationEffectiveTime() {
      OperationsTestCase<STDHistoryObservation> validateSTDHistoryObservationEffectiveTimeTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateSTDHistoryObservationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_STD_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateSTDHistoryObservationEffectiveTime(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateSTDHistoryObservationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSTDHistoryObservationId() {
      OperationsTestCase<STDHistoryObservation> validateSTDHistoryObservationIdTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateSTDHistoryObservationId",
      operationsForOCL.getOCLValue("VALIDATE_STD_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
      
        II ii  = DatatypesFactory.eINSTANCE.createII();
        target.getIds().add(ii);				
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateSTDHistoryObservationId(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateSTDHistoryObservationIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSTDHistoryObservationMoodCode() {
      OperationsTestCase<STDHistoryObservation> validateSTDHistoryObservationMoodCodeTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateSTDHistoryObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_STD_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateSTDHistoryObservationMoodCode(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateSTDHistoryObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateSTDHistoryObservationStatusCode() {
      OperationsTestCase<STDHistoryObservation> validateSTDHistoryObservationStatusCodeTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateSTDHistoryObservationStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_STD_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateSTDHistoryObservationStatusCode(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateSTDHistoryObservationStatusCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
                  
public void testValidateSTDHistoryObservationValue() {
      OperationsTestCase<STDHistoryObservation> validateSTDHistoryObservationValueTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateSTDHistoryObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_STD_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateSTDHistoryObservationValue(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateSTDHistoryObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateSTDHistoryObservationProblemStatus() {
      OperationsTestCase<STDHistoryObservation> validateSTDHistoryObservationProblemStatusTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateSTDHistoryObservationProblemStatus",
      operationsForOCL.getOCLValue("VALIDATE_STD_HISTORY_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateSTDHistoryObservationProblemStatus(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateSTDHistoryObservationProblemStatusTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGethepbProblemStatus() {


STDHistoryObservation target = objectFactory.create();
target.gethepbProblemStatus();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<STDHistoryObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<STDHistoryObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(STDHistoryObservation target) {

      }

      @Override
      protected void updateToPass(STDHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return STDHistoryObservationOperations.validateProblemObservationTemplateId(
          (STDHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends STDHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<STDHistoryObservation> {
		public STDHistoryObservation create() {		
			return HepbFactory.eINSTANCE.createSTDHistoryObservation();
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
	private static class ConstructorTestClass extends STDHistoryObservationOperations {};
	
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
	
	

	
	
} // STDHistoryObservationOperations