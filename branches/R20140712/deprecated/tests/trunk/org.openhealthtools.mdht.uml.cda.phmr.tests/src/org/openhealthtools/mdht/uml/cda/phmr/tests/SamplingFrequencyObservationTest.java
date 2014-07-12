
/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  Myriam Lipprandt <myriam.lipprandt@offis.de>, OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation;
import org.openhealthtools.mdht.uml.cda.phmr.operations.SamplingFrequencyObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Sampling Frequency Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.SamplingFrequencyObservation#validateSamplingFrequencyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Sampling Frequency Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SamplingFrequencyObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateSamplingFrequencyObservationTemplateId() {
      OperationsTestCase<SamplingFrequencyObservation> validateSamplingFrequencyObservationTemplateIdTestCase = new OperationsTestCase<SamplingFrequencyObservation>(
      "validateSamplingFrequencyObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SamplingFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(SamplingFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SamplingFrequencyObservationOperations.validateSamplingFrequencyObservationTemplateId(
          (SamplingFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateSamplingFrequencyObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSamplingFrequencyObservationCodeP() {
      OperationsTestCase<SamplingFrequencyObservation> validateSamplingFrequencyObservationCodePTestCase = new OperationsTestCase<SamplingFrequencyObservation>(
      "validateSamplingFrequencyObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SamplingFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(SamplingFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SamplingFrequencyObservationOperations.validateSamplingFrequencyObservationCodeP(
          (SamplingFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateSamplingFrequencyObservationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSamplingFrequencyObservationCode() {
      OperationsTestCase<SamplingFrequencyObservation> validateSamplingFrequencyObservationCodeTestCase = new OperationsTestCase<SamplingFrequencyObservation>(
      "validateSamplingFrequencyObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SamplingFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(SamplingFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SamplingFrequencyObservationOperations.validateSamplingFrequencyObservationCode(
          (SamplingFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateSamplingFrequencyObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSamplingFrequencyObservationMoodCode() {
      OperationsTestCase<SamplingFrequencyObservation> validateSamplingFrequencyObservationMoodCodeTestCase = new OperationsTestCase<SamplingFrequencyObservation>(
      "validateSamplingFrequencyObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SamplingFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(SamplingFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SamplingFrequencyObservationOperations.validateSamplingFrequencyObservationMoodCode(
          (SamplingFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateSamplingFrequencyObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateSamplingFrequencyObservationValue() {
      OperationsTestCase<SamplingFrequencyObservation> validateSamplingFrequencyObservationValueTestCase = new OperationsTestCase<SamplingFrequencyObservation>(
      "validateSamplingFrequencyObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_SAMPLING_FREQUENCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(SamplingFrequencyObservation target) {

      }

      @Override
      protected void updateToPass(SamplingFrequencyObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return SamplingFrequencyObservationOperations.validateSamplingFrequencyObservationValue(
          (SamplingFrequencyObservation) objectToTest, diagnostician, map);
      }

    };

    validateSamplingFrequencyObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends SamplingFrequencyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SamplingFrequencyObservation> {
		public SamplingFrequencyObservation create() {		
			return PhmrFactory.eINSTANCE.createSamplingFrequencyObservation();
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
	private static class ConstructorTestClass extends SamplingFrequencyObservationOperations {};
	
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
	
	

	
	
} // SamplingFrequencyObservationOperations