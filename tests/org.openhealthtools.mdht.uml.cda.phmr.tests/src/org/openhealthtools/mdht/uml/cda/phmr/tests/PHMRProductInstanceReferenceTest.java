
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
import org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstanceReference;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.PHMRProductInstanceReferenceOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHMR Product Instance Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstanceReference#validatePHMRProductInstanceReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstanceReference#validatePHMRProductInstanceReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstanceReference#validatePHMRProductInstanceReferenceParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PHMRProductInstanceReferenceTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRProductInstanceReferenceTemplateId() {
			OperationsTestCase<PHMRProductInstanceReference> validatePHMRProductInstanceReferenceTemplateIdTestCase = new OperationsTestCase<PHMRProductInstanceReference>(
			"validatePHMRProductInstanceReferenceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PHMRProductInstanceReference target) {

			}

			@Override
			protected void updateToPass(PHMRProductInstanceReference target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PHMRProductInstanceReferenceOperations.validatePHMRProductInstanceReferenceTemplateId(
					(PHMRProductInstanceReference) objectToTest, diagnostician, map);
			}

		};

		validatePHMRProductInstanceReferenceTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRProductInstanceReferenceTypeCode() {
			OperationsTestCase<PHMRProductInstanceReference> validatePHMRProductInstanceReferenceTypeCodeTestCase = new OperationsTestCase<PHMRProductInstanceReference>(
			"validatePHMRProductInstanceReferenceTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PHMRProductInstanceReference target) {

			}

			@Override
			protected void updateToPass(PHMRProductInstanceReference target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PHMRProductInstanceReferenceOperations.validatePHMRProductInstanceReferenceTypeCode(
					(PHMRProductInstanceReference) objectToTest, diagnostician, map);
			}

		};

		validatePHMRProductInstanceReferenceTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRProductInstanceReferenceParticipantRole() {
			OperationsTestCase<PHMRProductInstanceReference> validatePHMRProductInstanceReferenceParticipantRoleTestCase = new OperationsTestCase<PHMRProductInstanceReference>(
			"validatePHMRProductInstanceReferenceParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PHMRProductInstanceReference target) {

			}

			@Override
			protected void updateToPass(PHMRProductInstanceReference target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PHMRProductInstanceReferenceOperations.validatePHMRProductInstanceReferenceParticipantRole(
					(PHMRProductInstanceReference) objectToTest, diagnostician, map);
			}

		};

		validatePHMRProductInstanceReferenceParticipantRoleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PHMRProductInstanceReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PHMRProductInstanceReference> {
		@Override
		public PHMRProductInstanceReference create() {		
			return PhmrFactory.eINSTANCE.createPHMRProductInstanceReference();
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
	private static class ConstructorTestClass extends PHMRProductInstanceReferenceOperations {};
	
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
	
	

	
	
} // PHMRProductInstanceReferenceOperations