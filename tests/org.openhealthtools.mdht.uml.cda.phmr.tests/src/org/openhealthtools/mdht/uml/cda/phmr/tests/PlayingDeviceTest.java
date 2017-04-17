
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
import org.openhealthtools.mdht.uml.cda.phmr.PlayingDevice;
import org.openhealthtools.mdht.uml.cda.phmr.operations.PlayingDeviceOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Playing Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PlayingDevice#validatePlayingDeviceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PlayingDevice#validatePlayingDeviceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PlayingDevice#validatePlayingDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Manufacturer Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PlayingDeviceTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePlayingDeviceTemplateId() {
			OperationsTestCase<PlayingDevice> validatePlayingDeviceTemplateIdTestCase = new OperationsTestCase<PlayingDevice>(
			"validatePlayingDeviceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAYING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PlayingDevice target) {

			}

			@Override
			protected void updateToPass(PlayingDevice target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PlayingDeviceOperations.validatePlayingDeviceTemplateId(
					(PlayingDevice) objectToTest, diagnostician, map);
			}

		};

		validatePlayingDeviceTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePlayingDeviceCode() {
			OperationsTestCase<PlayingDevice> validatePlayingDeviceCodeTestCase = new OperationsTestCase<PlayingDevice>(
			"validatePlayingDeviceCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PlayingDevice target) {

			}

			@Override
			protected void updateToPass(PlayingDevice target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PlayingDeviceOperations.validatePlayingDeviceCode(
					(PlayingDevice) objectToTest, diagnostician, map);
			}

		};

		validatePlayingDeviceCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePlayingDeviceManufacturerModelName() {
			OperationsTestCase<PlayingDevice> validatePlayingDeviceManufacturerModelNameTestCase = new OperationsTestCase<PlayingDevice>(
			"validatePlayingDeviceManufacturerModelName",
			operationsForOCL.getOCLValue("VALIDATE_PLAYING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PlayingDevice target) {

			}

			@Override
			protected void updateToPass(PlayingDevice target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PlayingDeviceOperations.validatePlayingDeviceManufacturerModelName(
					(PlayingDevice) objectToTest, diagnostician, map);
			}

		};

		validatePlayingDeviceManufacturerModelNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PlayingDeviceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlayingDevice> {
		@Override
		public PlayingDevice create() {		
			return PhmrFactory.eINSTANCE.createPlayingDevice();
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
	private static class ConstructorTestClass extends PlayingDeviceOperations {};
	
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
	
	

	
	
} // PlayingDeviceOperations