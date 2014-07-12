
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
import org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.DeviceAccuracyObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Accuracy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation#validateDeviceAccuracyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Accuracy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation#validateDeviceAccuracyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Accuracy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation#validateDeviceAccuracyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Accuracy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation#validateDeviceAccuracyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Accuracy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation#validateDeviceAccuracyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Accuracy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceAccuracyObservation#validateDeviceAccuracyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Accuracy Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeviceAccuracyObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceAccuracyObservationTemplateId() {
      OperationsTestCase<DeviceAccuracyObservation> validateDeviceAccuracyObservationTemplateIdTestCase = new OperationsTestCase<DeviceAccuracyObservation>(
      "validateDeviceAccuracyObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_ACCURACY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceAccuracyObservation target) {

      }

      @Override
      protected void updateToPass(DeviceAccuracyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceAccuracyObservationOperations.validateDeviceAccuracyObservationTemplateId(
          (DeviceAccuracyObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceAccuracyObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceAccuracyObservationClassCode() {
      OperationsTestCase<DeviceAccuracyObservation> validateDeviceAccuracyObservationClassCodeTestCase = new OperationsTestCase<DeviceAccuracyObservation>(
      "validateDeviceAccuracyObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_ACCURACY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceAccuracyObservation target) {

      }

      @Override
      protected void updateToPass(DeviceAccuracyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceAccuracyObservationOperations.validateDeviceAccuracyObservationClassCode(
          (DeviceAccuracyObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceAccuracyObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceAccuracyObservationCodeP() {
      OperationsTestCase<DeviceAccuracyObservation> validateDeviceAccuracyObservationCodePTestCase = new OperationsTestCase<DeviceAccuracyObservation>(
      "validateDeviceAccuracyObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_ACCURACY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceAccuracyObservation target) {

      }

      @Override
      protected void updateToPass(DeviceAccuracyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceAccuracyObservationOperations.validateDeviceAccuracyObservationCodeP(
          (DeviceAccuracyObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceAccuracyObservationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceAccuracyObservationCode() {
      OperationsTestCase<DeviceAccuracyObservation> validateDeviceAccuracyObservationCodeTestCase = new OperationsTestCase<DeviceAccuracyObservation>(
      "validateDeviceAccuracyObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_ACCURACY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceAccuracyObservation target) {

      }

      @Override
      protected void updateToPass(DeviceAccuracyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceAccuracyObservationOperations.validateDeviceAccuracyObservationCode(
          (DeviceAccuracyObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceAccuracyObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceAccuracyObservationMoodCode() {
      OperationsTestCase<DeviceAccuracyObservation> validateDeviceAccuracyObservationMoodCodeTestCase = new OperationsTestCase<DeviceAccuracyObservation>(
      "validateDeviceAccuracyObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_ACCURACY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceAccuracyObservation target) {

      }

      @Override
      protected void updateToPass(DeviceAccuracyObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceAccuracyObservationOperations.validateDeviceAccuracyObservationMoodCode(
          (DeviceAccuracyObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceAccuracyObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceAccuracyObservationValue() {
      OperationsTestCase<DeviceAccuracyObservation> validateDeviceAccuracyObservationValueTestCase = new OperationsTestCase<DeviceAccuracyObservation>(
      "validateDeviceAccuracyObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_ACCURACY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceAccuracyObservation target) {

      }

      @Override
      protected void updateToPass(DeviceAccuracyObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceAccuracyObservationOperations.validateDeviceAccuracyObservationValue(
          (DeviceAccuracyObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceAccuracyObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeviceAccuracyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeviceAccuracyObservation> {
		public DeviceAccuracyObservation create() {		
			return PhmrFactory.eINSTANCE.createDeviceAccuracyObservation();
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
	private static class ConstructorTestClass extends DeviceAccuracyObservationOperations {};
	
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
	
	

	
	
} // DeviceAccuracyObservationOperations