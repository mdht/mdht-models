
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisSiteOfTBDiseaseObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Site Of TB Disease Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation#validateTuberculosisSiteOfTBDiseaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Site Of TB Disease Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisSiteOfTBDiseaseObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSiteOfTBDiseaseObservationTemplateId() {
      OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation> validateTuberculosisSiteOfTBDiseaseObservationTemplateIdTestCase = new OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation>(
      "validateTuberculosisSiteOfTBDiseaseObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSiteOfTBDiseaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSiteOfTBDiseaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationTemplateId(
          (TuberculosisSiteOfTBDiseaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSiteOfTBDiseaseObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSiteOfTBDiseaseObservationClassCode() {
      OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation> validateTuberculosisSiteOfTBDiseaseObservationClassCodeTestCase = new OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation>(
      "validateTuberculosisSiteOfTBDiseaseObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSiteOfTBDiseaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSiteOfTBDiseaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationClassCode(
          (TuberculosisSiteOfTBDiseaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSiteOfTBDiseaseObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSiteOfTBDiseaseObservationCode() {
      OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation> validateTuberculosisSiteOfTBDiseaseObservationCodeTestCase = new OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation>(
      "validateTuberculosisSiteOfTBDiseaseObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSiteOfTBDiseaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSiteOfTBDiseaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationCode(
          (TuberculosisSiteOfTBDiseaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSiteOfTBDiseaseObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSiteOfTBDiseaseObservationEffectiveTime() {
      OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation> validateTuberculosisSiteOfTBDiseaseObservationEffectiveTimeTestCase = new OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation>(
      "validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSiteOfTBDiseaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSiteOfTBDiseaseObservation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationEffectiveTime(
          (TuberculosisSiteOfTBDiseaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSiteOfTBDiseaseObservationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSiteOfTBDiseaseObservationMoodCode() {
      OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation> validateTuberculosisSiteOfTBDiseaseObservationMoodCodeTestCase = new OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation>(
      "validateTuberculosisSiteOfTBDiseaseObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSiteOfTBDiseaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSiteOfTBDiseaseObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationMoodCode(
          (TuberculosisSiteOfTBDiseaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSiteOfTBDiseaseObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSiteOfTBDiseaseObservationStatusCode() {
      OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation> validateTuberculosisSiteOfTBDiseaseObservationStatusCodeTestCase = new OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation>(
      "validateTuberculosisSiteOfTBDiseaseObservationStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSiteOfTBDiseaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSiteOfTBDiseaseObservation target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationStatusCode(
          (TuberculosisSiteOfTBDiseaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSiteOfTBDiseaseObservationStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSiteOfTBDiseaseObservationValue() {
      OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation> validateTuberculosisSiteOfTBDiseaseObservationValueTestCase = new OperationsTestCase<TuberculosisSiteOfTBDiseaseObservation>(
      "validateTuberculosisSiteOfTBDiseaseObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SITE_OF_TB_DISEASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSiteOfTBDiseaseObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSiteOfTBDiseaseObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSiteOfTBDiseaseObservationOperations.validateTuberculosisSiteOfTBDiseaseObservationValue(
          (TuberculosisSiteOfTBDiseaseObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSiteOfTBDiseaseObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisSiteOfTBDiseaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisSiteOfTBDiseaseObservation> {
		public TuberculosisSiteOfTBDiseaseObservation create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisSiteOfTBDiseaseObservation();
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
	private static class ConstructorTestClass extends TuberculosisSiteOfTBDiseaseObservationOperations {};
	
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
	
	

	
	
} // TuberculosisSiteOfTBDiseaseObservationOperations