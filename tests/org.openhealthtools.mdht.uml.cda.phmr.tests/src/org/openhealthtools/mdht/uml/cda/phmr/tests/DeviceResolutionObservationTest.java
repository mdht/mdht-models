
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
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.phmr.DeviceResolutionObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.DeviceResolutionObservationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Resolution Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceResolutionObservation#validateDeviceResolutionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Resolution Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceResolutionObservation#validateDeviceResolutionObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Resolution Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceResolutionObservation#validateDeviceResolutionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Resolution Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceResolutionObservation#validateDeviceResolutionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Resolution Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceResolutionObservation#validateDeviceResolutionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Resolution Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeviceResolutionObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceResolutionObservationTemplateId() {
			OperationsTestCase<DeviceResolutionObservation> validateDeviceResolutionObservationTemplateIdTestCase = new OperationsTestCase<DeviceResolutionObservation>(
			"validateDeviceResolutionObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_RESOLUTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceResolutionObservation target) {

			}

			@Override
			protected void updateToPass(DeviceResolutionObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceResolutionObservationOperations.validateDeviceResolutionObservationTemplateId(
					(DeviceResolutionObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceResolutionObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceResolutionObservationClassCode() {
			OperationsTestCase<DeviceResolutionObservation> validateDeviceResolutionObservationClassCodeTestCase = new OperationsTestCase<DeviceResolutionObservation>(
			"validateDeviceResolutionObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_RESOLUTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceResolutionObservation target) {

			}

			@Override
			protected void updateToPass(DeviceResolutionObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceResolutionObservationOperations.validateDeviceResolutionObservationClassCode(
					(DeviceResolutionObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceResolutionObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceResolutionObservationCode() {
			OperationsTestCase<DeviceResolutionObservation> validateDeviceResolutionObservationCodeTestCase = new OperationsTestCase<DeviceResolutionObservation>(
			"validateDeviceResolutionObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_RESOLUTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceResolutionObservation target) {

			}

			@Override
			protected void updateToPass(DeviceResolutionObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceResolutionObservationOperations.validateDeviceResolutionObservationCode(
					(DeviceResolutionObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceResolutionObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceResolutionObservationMoodCode() {
			OperationsTestCase<DeviceResolutionObservation> validateDeviceResolutionObservationMoodCodeTestCase = new OperationsTestCase<DeviceResolutionObservation>(
			"validateDeviceResolutionObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_RESOLUTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceResolutionObservation target) {

			}

			@Override
			protected void updateToPass(DeviceResolutionObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceResolutionObservationOperations.validateDeviceResolutionObservationMoodCode(
					(DeviceResolutionObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceResolutionObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceResolutionObservationValue() {
			OperationsTestCase<DeviceResolutionObservation> validateDeviceResolutionObservationValueTestCase = new OperationsTestCase<DeviceResolutionObservation>(
			"validateDeviceResolutionObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_RESOLUTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceResolutionObservation target) {

			}

			@Override
			protected void updateToPass(DeviceResolutionObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceResolutionObservationOperations.validateDeviceResolutionObservationValue(
					(DeviceResolutionObservation) objectToTest, diagnostician, map);
			}

		};

		validateDeviceResolutionObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeviceResolutionObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeviceResolutionObservation> {
		@Override
		public DeviceResolutionObservation create() {		
			return PhmrFactory.eINSTANCE.createDeviceResolutionObservation();
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
	private static class ConstructorTestClass extends DeviceResolutionObservationOperations {};
	
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
	
	

	
	
} // DeviceResolutionObservationOperations