
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
import org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.ObservationNullFlavorOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Observation Null Flavor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorWaveformObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Waveform Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#validateObservationNullFlavorWaveformSamplePeriodObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Null Flavor Waveform Sample Period Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#getWaveformObservation() <em>Get Waveform Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationNullFlavor#getWaveformSamplePeriodObservation() <em>Get Waveform Sample Period Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ObservationNullFlavorTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateObservationNullFlavorTemplateId() {
      OperationsTestCase<ObservationNullFlavor> validateObservationNullFlavorTemplateIdTestCase = new OperationsTestCase<ObservationNullFlavor>(
      "validateObservationNullFlavorTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_NULL_FLAVOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ObservationNullFlavor target) {

      }

      @Override
      protected void updateToPass(ObservationNullFlavor target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ObservationNullFlavorOperations.validateObservationNullFlavorTemplateId(
          (ObservationNullFlavor) objectToTest, diagnostician, map);
      }

    };

    validateObservationNullFlavorTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObservationNullFlavorClassCode() {
      OperationsTestCase<ObservationNullFlavor> validateObservationNullFlavorClassCodeTestCase = new OperationsTestCase<ObservationNullFlavor>(
      "validateObservationNullFlavorClassCode",
      operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_NULL_FLAVOR_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ObservationNullFlavor target) {

      }

      @Override
      protected void updateToPass(ObservationNullFlavor target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ObservationNullFlavorOperations.validateObservationNullFlavorClassCode(
          (ObservationNullFlavor) objectToTest, diagnostician, map);
      }

    };

    validateObservationNullFlavorClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObservationNullFlavorMoodCode() {
      OperationsTestCase<ObservationNullFlavor> validateObservationNullFlavorMoodCodeTestCase = new OperationsTestCase<ObservationNullFlavor>(
      "validateObservationNullFlavorMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_NULL_FLAVOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ObservationNullFlavor target) {

      }

      @Override
      protected void updateToPass(ObservationNullFlavor target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ObservationNullFlavorOperations.validateObservationNullFlavorMoodCode(
          (ObservationNullFlavor) objectToTest, diagnostician, map);
      }

    };

    validateObservationNullFlavorMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObservationNullFlavorWaveformObservation() {
      OperationsTestCase<ObservationNullFlavor> validateObservationNullFlavorWaveformObservationTestCase = new OperationsTestCase<ObservationNullFlavor>(
      "validateObservationNullFlavorWaveformObservation",
      operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ObservationNullFlavor target) {

      }

      @Override
      protected void updateToPass(ObservationNullFlavor target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ObservationNullFlavorOperations.validateObservationNullFlavorWaveformObservation(
          (ObservationNullFlavor) objectToTest, diagnostician, map);
      }

    };

    validateObservationNullFlavorWaveformObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObservationNullFlavorWaveformSamplePeriodObservation() {
      OperationsTestCase<ObservationNullFlavor> validateObservationNullFlavorWaveformSamplePeriodObservationTestCase = new OperationsTestCase<ObservationNullFlavor>(
      "validateObservationNullFlavorWaveformSamplePeriodObservation",
      operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_NULL_FLAVOR_WAVEFORM_SAMPLE_PERIOD_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ObservationNullFlavor target) {

      }

      @Override
      protected void updateToPass(ObservationNullFlavor target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ObservationNullFlavorOperations.validateObservationNullFlavorWaveformSamplePeriodObservation(
          (ObservationNullFlavor) objectToTest, diagnostician, map);
      }

    };

    validateObservationNullFlavorWaveformSamplePeriodObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetWaveformObservation() {


ObservationNullFlavor target = objectFactory.create();
target.getWaveformObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetWaveformSamplePeriodObservation() {


ObservationNullFlavor target = objectFactory.create();
target.getWaveformSamplePeriodObservation();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends ObservationNullFlavorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ObservationNullFlavor> {
		public ObservationNullFlavor create() {		
			return PhmrFactory.eINSTANCE.createObservationNullFlavor();
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
	private static class ConstructorTestClass extends ObservationNullFlavorOperations {};
	
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
	
	

	
	
} // ObservationNullFlavorOperations