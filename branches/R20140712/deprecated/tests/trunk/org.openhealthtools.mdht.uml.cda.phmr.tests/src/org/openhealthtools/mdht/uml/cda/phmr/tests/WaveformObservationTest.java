
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
import org.openhealthtools.mdht.uml.cda.phmr.WaveformObservation;
import org.openhealthtools.mdht.uml.cda.phmr.operations.WaveformObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Waveform Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformObservation#validateWaveformObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformObservation#validateWaveformObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformObservation#validateWaveformObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformObservation#validateWaveformObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformObservation#validateWaveformObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WaveformObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformObservationTemplateId() {
      OperationsTestCase<WaveformObservation> validateWaveformObservationTemplateIdTestCase = new OperationsTestCase<WaveformObservation>(
      "validateWaveformObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WaveformObservation target) {

      }

      @Override
      protected void updateToPass(WaveformObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WaveformObservationOperations.validateWaveformObservationTemplateId(
          (WaveformObservation) objectToTest, diagnostician, map);
      }

    };

    validateWaveformObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformObservationClassCode() {
      OperationsTestCase<WaveformObservation> validateWaveformObservationClassCodeTestCase = new OperationsTestCase<WaveformObservation>(
      "validateWaveformObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WaveformObservation target) {

      }

      @Override
      protected void updateToPass(WaveformObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WaveformObservationOperations.validateWaveformObservationClassCode(
          (WaveformObservation) objectToTest, diagnostician, map);
      }

    };

    validateWaveformObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformObservationCode() {
      OperationsTestCase<WaveformObservation> validateWaveformObservationCodeTestCase = new OperationsTestCase<WaveformObservation>(
      "validateWaveformObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WaveformObservation target) {

      }

      @Override
      protected void updateToPass(WaveformObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WaveformObservationOperations.validateWaveformObservationCode(
          (WaveformObservation) objectToTest, diagnostician, map);
      }

    };

    validateWaveformObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformObservationMoodCode() {
      OperationsTestCase<WaveformObservation> validateWaveformObservationMoodCodeTestCase = new OperationsTestCase<WaveformObservation>(
      "validateWaveformObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WaveformObservation target) {

      }

      @Override
      protected void updateToPass(WaveformObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WaveformObservationOperations.validateWaveformObservationMoodCode(
          (WaveformObservation) objectToTest, diagnostician, map);
      }

    };

    validateWaveformObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformObservationValue() {
      OperationsTestCase<WaveformObservation> validateWaveformObservationValueTestCase = new OperationsTestCase<WaveformObservation>(
      "validateWaveformObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(WaveformObservation target) {

      }

      @Override
      protected void updateToPass(WaveformObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return WaveformObservationOperations.validateWaveformObservationValue(
          (WaveformObservation) objectToTest, diagnostician, map);
      }

    };

    validateWaveformObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends WaveformObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WaveformObservation> {
		public WaveformObservation create() {		
			return PhmrFactory.eINSTANCE.createWaveformObservation();
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
	private static class ConstructorTestClass extends WaveformObservationOperations {};
	
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
	
	

	
	
} // WaveformObservationOperations