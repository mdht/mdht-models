
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.silicosis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.silicosis.operations.SilicosisSocioBehavioralBooleanRiskFactorObservationOperations;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Silicosis Socio Behavioral Boolean Risk Factor Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.silicosis.SilicosisSocioBehavioralBooleanRiskFactorObservation#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SilicosisSocioBehavioralBooleanRiskFactorObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP() {
      OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation> validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodePTestCase = new OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeP(
          (SilicosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisSocioBehavioralBooleanRiskFactorObservationCode() {
      OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation> validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeTestCase = new OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationCode(
          (SilicosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisSocioBehavioralBooleanRiskFactorObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd() {
      OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation> validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationIndTestCase = new OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationInd(
          (SilicosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisSocioBehavioralBooleanRiskFactorObservationNegationIndTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime() {
      OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation> validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTimeTestCase = new OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTime(
          (SilicosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisSocioBehavioralBooleanRiskFactorObservationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSilicosisSocioBehavioralBooleanRiskFactorObservationValue() {
      OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation> validateSilicosisSocioBehavioralBooleanRiskFactorObservationValueTestCase = new OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_SILICOSIS_SOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSilicosisSocioBehavioralBooleanRiskFactorObservationValue(
          (SilicosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateSilicosisSocioBehavioralBooleanRiskFactorObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistoryObservationTemplateId() {
      OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation> validateSocialHistoryObservationTemplateIdTestCase = new OperationsTestCase<SilicosisSocioBehavioralBooleanRiskFactorObservation>(
      "validateSocialHistoryObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(SilicosisSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SilicosisSocioBehavioralBooleanRiskFactorObservationOperations.validateSocialHistoryObservationTemplateId(
          (SilicosisSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistoryObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SilicosisSocioBehavioralBooleanRiskFactorObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SilicosisSocioBehavioralBooleanRiskFactorObservation> {
		public SilicosisSocioBehavioralBooleanRiskFactorObservation create() {		
			return SilicosisFactory.eINSTANCE.createSilicosisSocioBehavioralBooleanRiskFactorObservation();
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
	private static class ConstructorTestClass extends SilicosisSocioBehavioralBooleanRiskFactorObservationOperations {};
	
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
	
	

	
	
} // SilicosisSocioBehavioralBooleanRiskFactorObservationOperations