
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
import org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.DeviceMeasurementRangeObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Measurement Range Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceMeasurementRangeObservation#validateDeviceMeasurementRangeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Measurement Range Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeviceMeasurementRangeObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceMeasurementRangeObservationTemplateId() {
      OperationsTestCase<DeviceMeasurementRangeObservation> validateDeviceMeasurementRangeObservationTemplateIdTestCase = new OperationsTestCase<DeviceMeasurementRangeObservation>(
      "validateDeviceMeasurementRangeObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceMeasurementRangeObservation target) {

      }

      @Override
      protected void updateToPass(DeviceMeasurementRangeObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceMeasurementRangeObservationOperations.validateDeviceMeasurementRangeObservationTemplateId(
          (DeviceMeasurementRangeObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceMeasurementRangeObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceMeasurementRangeObservationClassCode() {
      OperationsTestCase<DeviceMeasurementRangeObservation> validateDeviceMeasurementRangeObservationClassCodeTestCase = new OperationsTestCase<DeviceMeasurementRangeObservation>(
      "validateDeviceMeasurementRangeObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceMeasurementRangeObservation target) {

      }

      @Override
      protected void updateToPass(DeviceMeasurementRangeObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceMeasurementRangeObservationOperations.validateDeviceMeasurementRangeObservationClassCode(
          (DeviceMeasurementRangeObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceMeasurementRangeObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceMeasurementRangeObservationCodeP() {
      OperationsTestCase<DeviceMeasurementRangeObservation> validateDeviceMeasurementRangeObservationCodePTestCase = new OperationsTestCase<DeviceMeasurementRangeObservation>(
      "validateDeviceMeasurementRangeObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceMeasurementRangeObservation target) {

      }

      @Override
      protected void updateToPass(DeviceMeasurementRangeObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceMeasurementRangeObservationOperations.validateDeviceMeasurementRangeObservationCodeP(
          (DeviceMeasurementRangeObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceMeasurementRangeObservationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceMeasurementRangeObservationCode() {
      OperationsTestCase<DeviceMeasurementRangeObservation> validateDeviceMeasurementRangeObservationCodeTestCase = new OperationsTestCase<DeviceMeasurementRangeObservation>(
      "validateDeviceMeasurementRangeObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceMeasurementRangeObservation target) {

      }

      @Override
      protected void updateToPass(DeviceMeasurementRangeObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceMeasurementRangeObservationOperations.validateDeviceMeasurementRangeObservationCode(
          (DeviceMeasurementRangeObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceMeasurementRangeObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceMeasurementRangeObservationMoodCode() {
      OperationsTestCase<DeviceMeasurementRangeObservation> validateDeviceMeasurementRangeObservationMoodCodeTestCase = new OperationsTestCase<DeviceMeasurementRangeObservation>(
      "validateDeviceMeasurementRangeObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_DEVICE_MEASUREMENT_RANGE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DeviceMeasurementRangeObservation target) {

      }

      @Override
      protected void updateToPass(DeviceMeasurementRangeObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DeviceMeasurementRangeObservationOperations.validateDeviceMeasurementRangeObservationMoodCode(
          (DeviceMeasurementRangeObservation) objectToTest, diagnostician, map);
      }

    };

    validateDeviceMeasurementRangeObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeviceMeasurementRangeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeviceMeasurementRangeObservation> {
		public DeviceMeasurementRangeObservation create() {		
			return PhmrFactory.eINSTANCE.createDeviceMeasurementRangeObservation();
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
	private static class ConstructorTestClass extends DeviceMeasurementRangeObservationOperations {};
	
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
	
	

	
	
} // DeviceMeasurementRangeObservationOperations