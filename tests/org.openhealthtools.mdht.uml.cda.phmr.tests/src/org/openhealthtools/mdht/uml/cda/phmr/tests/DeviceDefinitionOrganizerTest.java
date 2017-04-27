
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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.DeviceDefinitionOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Definition Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerSamplingFrequencyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Sampling Frequency Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Measurement Range Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerDeviceResolutionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Resolution Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerDeviceAccuracyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Device Accuracy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#validateDeviceDefinitionOrganizerParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Definition Organizer Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#getSamplingFrequencyObservation() <em>Get Sampling Frequency Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#getDeviceMeasurementRangeObservation() <em>Get Device Measurement Range Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#getDeviceResolutionObservation() <em>Get Device Resolution Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.DeviceDefinitionOrganizer#getDeviceAccuracyObservation() <em>Get Device Accuracy Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeviceDefinitionOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerTemplateId() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerTemplateIdTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerTemplateId(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerClassCode() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerClassCodeTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerClassCode(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerEffectiveTime() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerEffectiveTimeTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerEffectiveTime(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerMoodCode() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerMoodCodeTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerMoodCode(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerSamplingFrequencyObservation() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerSamplingFrequencyObservationTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerSamplingFrequencyObservation",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_SAMPLING_FREQUENCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerSamplingFrequencyObservation(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerSamplingFrequencyObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservationTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_MEASUREMENT_RANGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservation(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerDeviceMeasurementRangeObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerDeviceResolutionObservation() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerDeviceResolutionObservationTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerDeviceResolutionObservation",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_RESOLUTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerDeviceResolutionObservation(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerDeviceResolutionObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerDeviceAccuracyObservation() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerDeviceAccuracyObservationTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerDeviceAccuracyObservation",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_DEVICE_ACCURACY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerDeviceAccuracyObservation(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerDeviceAccuracyObservationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeviceDefinitionOrganizerParticipant() {
			OperationsTestCase<DeviceDefinitionOrganizer> validateDeviceDefinitionOrganizerParticipantTestCase = new OperationsTestCase<DeviceDefinitionOrganizer>(
			"validateDeviceDefinitionOrganizerParticipant",
			operationsForOCL.getOCLValue("VALIDATE_DEVICE_DEFINITION_ORGANIZER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeviceDefinitionOrganizer target) {

			}

			@Override
			protected void updateToPass(DeviceDefinitionOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeviceDefinitionOrganizerOperations.validateDeviceDefinitionOrganizerParticipant(
					(DeviceDefinitionOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateDeviceDefinitionOrganizerParticipantTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetSamplingFrequencyObservation() {


DeviceDefinitionOrganizer target = objectFactory.create();
target.getSamplingFrequencyObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDeviceMeasurementRangeObservation() {


DeviceDefinitionOrganizer target = objectFactory.create();
target.getDeviceMeasurementRangeObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDeviceResolutionObservation() {


DeviceDefinitionOrganizer target = objectFactory.create();
target.getDeviceResolutionObservation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDeviceAccuracyObservation() {


DeviceDefinitionOrganizer target = objectFactory.create();
target.getDeviceAccuracyObservation();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeviceDefinitionOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeviceDefinitionOrganizer> {
		@Override
		public DeviceDefinitionOrganizer create() {		
			return PhmrFactory.eINSTANCE.createDeviceDefinitionOrganizer();
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
	private static class ConstructorTestClass extends DeviceDefinitionOrganizerOperations {};
	
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
	
	

	
	
} // DeviceDefinitionOrganizerOperations