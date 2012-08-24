
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
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Socio Behavioral Boolean Risk Factor Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation#validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Socio Behavioral Boolean Risk Factor Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation#validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Socio Behavioral Boolean Risk Factor Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation#validateTuberculosisSocioBehavioralBooleanRiskFactorObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Socio Behavioral Boolean Risk Factor Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation#validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Socio Behavioral Boolean Risk Factor Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation#validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tuberculosis Socio Behavioral Boolean Risk Factor Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSocioBehavioralBooleanRiskFactorObservation#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TuberculosisSocioBehavioralBooleanRiskFactorObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime() {
      OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation> validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTimeTestCase = new OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(
          (TuberculosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSocioBehavioralBooleanRiskFactorObservationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd() {
      OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation> validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationIndTestCase = new OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationInd(
          (TuberculosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSocioBehavioralBooleanRiskFactorObservationNegationIndTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisSocioBehavioralBooleanRiskFactorObservationValue() {
      OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation> validateTuberculosisSocioBehavioralBooleanRiskFactorObservationValueTestCase = new OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateTuberculosisSocioBehavioralBooleanRiskFactorObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationValue(
          (TuberculosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSocioBehavioralBooleanRiskFactorObservationValueTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
                  
public void testValidateTuberculosisSocioBehavioralBooleanRiskFactorObservationCodeP() {
      OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation> validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCodePTestCase = new OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCodeP(
          (TuberculosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode() {
      OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation> validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCodeTestCase = new OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_TUBERCULOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCode(
          (TuberculosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateTuberculosisSocioBehavioralBooleanRiskFactorObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistoryObservationTemplateId() {
      OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation> validateSocialHistoryObservationTemplateIdTestCase = new OperationsTestCase<TuberculosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateSocialHistoryObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(TuberculosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSocialHistoryObservationTemplateId(
          (TuberculosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistoryObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TuberculosisSocioBehavioralBooleanRiskFactorObservation> {
		public TuberculosisSocioBehavioralBooleanRiskFactorObservation create() {		
			return TuberculosisFactory.eINSTANCE.createTuberculosisSocioBehavioralBooleanRiskFactorObservation();
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
	private static class ConstructorTestClass extends TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations {};
	
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
	
	

	
	
} // TuberculosisSocioBehavioralBooleanRiskFactorObservationOperations