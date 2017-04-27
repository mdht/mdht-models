
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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phmr.operations.ResultOrganizerOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#validatePHMRResultOrganizerNumericObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Result Organizer Numeric Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#validatePHMRResultOrganizerWaveformSeriesObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Result Organizer Waveform Series Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#getNumericObservations() <em>Get Numeric Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#getWaveformSeriesObservations() <em>Get Waveform Series Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ResultOrganizerTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRResultOrganizerNumericObservation() {
			OperationsTestCase<ResultOrganizer> validatePHMRResultOrganizerNumericObservationTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHMRResultOrganizerNumericObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHMR_RESULT_ORGANIZER_NUMERIC_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ResultOrganizerOperations.validatePHMRResultOrganizerNumericObservation(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHMRResultOrganizerNumericObservationTestCase.doValidationTest();
}




	/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRResultOrganizerWaveformSeriesObservation() {
			OperationsTestCase<ResultOrganizer> validatePHMRResultOrganizerWaveformSeriesObservationTestCase = new OperationsTestCase<ResultOrganizer>(
			"validatePHMRResultOrganizerWaveformSeriesObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHMR_RESULT_ORGANIZER_WAVEFORM_SERIES_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ResultOrganizerOperations.validatePHMRResultOrganizerWaveformSeriesObservation(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validatePHMRResultOrganizerWaveformSeriesObservationTestCase.doValidationTest();
}




/**
*
* @generated
*/
@Test

 
									
public void testGetNumericObservations() {


ResultOrganizer target = objectFactory.create();
target.getNumericObservations();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetWaveformSeriesObservations() {


ResultOrganizer target = objectFactory.create();
target.getWaveformSeriesObservations();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultOrganizerTemplateId() {
			OperationsTestCase<ResultOrganizer> validateResultOrganizerTemplateIdTestCase = new OperationsTestCase<ResultOrganizer>(
			"validateResultOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ResultOrganizer target) {

			}

			@Override
			protected void updateToPass(ResultOrganizer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ResultOrganizerOperations.validateResultOrganizerTemplateId(
					(ResultOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResultOrganizerTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ResultOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultOrganizer> {
		@Override
		public ResultOrganizer create() {		
			return PhmrFactory.eINSTANCE.createResultOrganizer();
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
	private static class ConstructorTestClass extends ResultOrganizerOperations {};
	
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
	
	

	
	
} // ResultOrganizerOperations