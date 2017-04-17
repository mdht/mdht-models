
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


import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation;
import org.openhealthtools.mdht.uml.cda.phmr.operations.WaveformSeriesObservationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Waveform Series Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationPHMRProductInstanceReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation PHMR Product Instance Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationObservationMediaJPG(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Observation Media JPG</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#validateWaveformSeriesObservationObservationNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Waveform Series Observation Observation Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#getObservationMediaJPG() <em>Get Observation Media JPG</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservation#getObservationNullFlavor() <em>Get Observation Null Flavor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class WaveformSeriesObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationTemplateId() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationTemplateIdTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationTemplateId(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationClassCode() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationClassCodeTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationClassCode(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationCodeP() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationCodePTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationCodeP(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationCode() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationCodeTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
			
			
					
			
				
			}
			
		
        
        @Override
            protected void setDependency(WaveformSeriesObservation target) {
                Collection<Object> passToken = new java.util.ArrayList<Object>(3);
                passToken.add(target);
                map.put("org.openhealthtools.mdht.uml.cda.phmr.WaveformSeriesObservationCodeP", passToken);
            }
         
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationCode(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationEffectiveTime() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationEffectiveTimeTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationEffectiveTime(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationMoodCode() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationMoodCodeTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationMoodCode(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationPHMRProductInstanceReference() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationPHMRProductInstanceReferenceTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationPHMRProductInstanceReference",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationPHMRProductInstanceReference(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationPHMRProductInstanceReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationObservationMediaJPG() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationObservationMediaJPGTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationObservationMediaJPG",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_MEDIA_JPG__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationObservationMediaJPG(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationObservationMediaJPGTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateWaveformSeriesObservationObservationNullFlavor() {
			OperationsTestCase<WaveformSeriesObservation> validateWaveformSeriesObservationObservationNullFlavorTestCase = new OperationsTestCase<WaveformSeriesObservation>(
			"validateWaveformSeriesObservationObservationNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_WAVEFORM_SERIES_OBSERVATION_OBSERVATION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(WaveformSeriesObservation target) {

			}

			@Override
			protected void updateToPass(WaveformSeriesObservation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return WaveformSeriesObservationOperations.validateWaveformSeriesObservationObservationNullFlavor(
					(WaveformSeriesObservation) objectToTest, diagnostician, map);
			}

		};

		validateWaveformSeriesObservationObservationNullFlavorTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetObservationMediaJPG() {


WaveformSeriesObservation target = objectFactory.create();
target.getObservationMediaJPG();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetObservationNullFlavor() {


WaveformSeriesObservation target = objectFactory.create();
target.getObservationNullFlavor();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends WaveformSeriesObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<WaveformSeriesObservation> {
		@Override
		public WaveformSeriesObservation create() {		
			return PhmrFactory.eINSTANCE.createWaveformSeriesObservation();
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
	private static class ConstructorTestClass extends WaveformSeriesObservationOperations {};
	
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
	
	

	
	
} // WaveformSeriesObservationOperations