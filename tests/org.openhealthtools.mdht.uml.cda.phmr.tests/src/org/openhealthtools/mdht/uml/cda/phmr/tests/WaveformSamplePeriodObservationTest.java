
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
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation;
import org.openhealthtools.mdht.uml.cda.phmr.operations.WaveformSamplePeriodObservationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Waveform Sample Period Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSamplePeriodObservation#validateWaveformSamplePeriodObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Sample Period Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WaveformSamplePeriodObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSamplePeriodObservationTemplateId() {
			OperationsTestCase<WaveformSamplePeriodObservation> validateWaveformSamplePeriodObservationTemplateIdTestCase = new OperationsTestCase<WaveformSamplePeriodObservation>(
			"validateWaveformSamplePeriodObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSamplePeriodObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSamplePeriodObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationTemplateId(
					(WaveformSamplePeriodObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSamplePeriodObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSamplePeriodObservationClassCode() {
			OperationsTestCase<WaveformSamplePeriodObservation> validateWaveformSamplePeriodObservationClassCodeTestCase = new OperationsTestCase<WaveformSamplePeriodObservation>(
			"validateWaveformSamplePeriodObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSamplePeriodObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSamplePeriodObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationClassCode(
					(WaveformSamplePeriodObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSamplePeriodObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSamplePeriodObservationCode() {
			OperationsTestCase<WaveformSamplePeriodObservation> validateWaveformSamplePeriodObservationCodeTestCase = new OperationsTestCase<WaveformSamplePeriodObservation>(
			"validateWaveformSamplePeriodObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSamplePeriodObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSamplePeriodObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationCode(
					(WaveformSamplePeriodObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSamplePeriodObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSamplePeriodObservationMoodCode() {
			OperationsTestCase<WaveformSamplePeriodObservation> validateWaveformSamplePeriodObservationMoodCodeTestCase = new OperationsTestCase<WaveformSamplePeriodObservation>(
			"validateWaveformSamplePeriodObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSamplePeriodObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSamplePeriodObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationMoodCode(
					(WaveformSamplePeriodObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSamplePeriodObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSamplePeriodObservationValue() {
			OperationsTestCase<WaveformSamplePeriodObservation> validateWaveformSamplePeriodObservationValueTestCase = new OperationsTestCase<WaveformSamplePeriodObservation>(
			"validateWaveformSamplePeriodObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SAMPLE_PERIOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSamplePeriodObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSamplePeriodObservation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSamplePeriodObservationOperations.validateWaveformSamplePeriodObservationValue(
					(WaveformSamplePeriodObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSamplePeriodObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends WaveformSamplePeriodObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WaveformSamplePeriodObservation> {
		@Override
		public WaveformSamplePeriodObservation create() {		
			return PhmrFactory.eINSTANCE.createWaveformSamplePeriodObservation();
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
	private static class ConstructorTestClass extends WaveformSamplePeriodObservationOperations {};
	
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
	
	

	
	
} // WaveformSamplePeriodObservationOperations