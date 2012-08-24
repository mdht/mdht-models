
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation#validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation#validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation#validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation#validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation#validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation#validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BSocio Behavioral Boolean Risk Factor Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd() {
      OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationIndTestCase = new OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>(
      "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationInd(
          (AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationNegationIndTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue() {
      OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValueTestCase = new OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>(
      "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValue(
          (AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValueP() {
      OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValuePTestCase = new OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>(
      "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValueP",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValueP(
          (AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationValuePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
                  
public void testValidateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodeP() {
      OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodePTestCase = new OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>(
      "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodeP(
          (AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodePTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode() {
      OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodeTestCase = new OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>(
      "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCode(
          (AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime() {
      OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTimeTestCase = new OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>(
      "validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BSOCIO_BEHAVIORAL_BOOLEAN_RISK_FACTOR_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTime(
          (AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSocialHistoryObservationTemplateId() {
      OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> validateSocialHistoryObservationTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation>(
      "validateSocialHistoryObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations.validateSocialHistoryObservationTemplateId(
          (AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation) objectToTest, diagnostician, map);
      }

    };

    validateSocialHistoryObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation> {
		public AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBSocioBehavioralBooleanRiskFactorObservation();
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
	private static class ConstructorTestClass extends AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBSocioBehavioralBooleanRiskFactorObservationOperations