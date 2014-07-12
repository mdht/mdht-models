
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.ViralHepatitisHistoryObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Viral Hepatitis History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateViralHepatitisHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateViralHepatitisHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateViralHepatitisHistoryObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateViralHepatitisHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Viral Hepatitis History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ViralHepatitisHistoryObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
                  
public void testValidateViralHepatitisHistoryObservationCode() {
      OperationsTestCase<ViralHepatitisHistoryObservation> validateViralHepatitisHistoryObservationCodeTestCase = new OperationsTestCase<ViralHepatitisHistoryObservation>(
      "validateViralHepatitisHistoryObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ViralHepatitisHistoryObservation target) {

      }

      @Override
      protected void updateToPass(ViralHepatitisHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ViralHepatitisHistoryObservationOperations.validateViralHepatitisHistoryObservationCode(
          (ViralHepatitisHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateViralHepatitisHistoryObservationCodeTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateViralHepatitisHistoryObservationValue() {
      OperationsTestCase<ViralHepatitisHistoryObservation> validateViralHepatitisHistoryObservationValueTestCase = new OperationsTestCase<ViralHepatitisHistoryObservation>(
      "validateViralHepatitisHistoryObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ViralHepatitisHistoryObservation target) {

      }

      @Override
      protected void updateToPass(ViralHepatitisHistoryObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ViralHepatitisHistoryObservationOperations.validateViralHepatitisHistoryObservationValue(
          (ViralHepatitisHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateViralHepatitisHistoryObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateViralHepatitisHistoryObservationValueP() {
      OperationsTestCase<ViralHepatitisHistoryObservation> validateViralHepatitisHistoryObservationValuePTestCase = new OperationsTestCase<ViralHepatitisHistoryObservation>(
      "validateViralHepatitisHistoryObservationValueP",
      operationsForOCL.getOCLValue("VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ViralHepatitisHistoryObservation target) {

      }

      @Override
      protected void updateToPass(ViralHepatitisHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ViralHepatitisHistoryObservationOperations.validateViralHepatitisHistoryObservationValueP(
          (ViralHepatitisHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateViralHepatitisHistoryObservationValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateViralHepatitisHistoryObservationId() {
      OperationsTestCase<ViralHepatitisHistoryObservation> validateViralHepatitisHistoryObservationIdTestCase = new OperationsTestCase<ViralHepatitisHistoryObservation>(
      "validateViralHepatitisHistoryObservationId",
      operationsForOCL.getOCLValue("VALIDATE_VIRAL_HEPATITIS_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ViralHepatitisHistoryObservation target) {

      }

      @Override
      protected void updateToPass(ViralHepatitisHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
      
        II ii  = DatatypesFactory.eINSTANCE.createII();
        target.getIds().add(ii);				
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ViralHepatitisHistoryObservationOperations.validateViralHepatitisHistoryObservationId(
          (ViralHepatitisHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateViralHepatitisHistoryObservationIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemObservationTemplateId() {
      OperationsTestCase<ViralHepatitisHistoryObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<ViralHepatitisHistoryObservation>(
      "validateProblemObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ViralHepatitisHistoryObservation target) {

      }

      @Override
      protected void updateToPass(ViralHepatitisHistoryObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ViralHepatitisHistoryObservationOperations.validateProblemObservationTemplateId(
          (ViralHepatitisHistoryObservation) objectToTest, diagnostician, map);
      }

    };

    validateProblemObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ViralHepatitisHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ViralHepatitisHistoryObservation> {
		public ViralHepatitisHistoryObservation create() {		
			return HepbFactory.eINSTANCE.createViralHepatitisHistoryObservation();
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
	private static class ConstructorTestClass extends ViralHepatitisHistoryObservationOperations {};
	
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
	
	

	
	
} // ViralHepatitisHistoryObservationOperations