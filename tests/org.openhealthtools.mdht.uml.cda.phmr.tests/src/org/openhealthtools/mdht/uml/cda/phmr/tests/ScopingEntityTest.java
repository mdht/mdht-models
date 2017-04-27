
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
import org.openhealthtools.mdht.uml.cda.phmr.ScopingEntity;
import org.openhealthtools.mdht.uml.cda.phmr.operations.ScopingEntityOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scoping Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ScopingEntity#validateScopingEntityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ScopingEntity#validateScopingEntityDesc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Desc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ScopingEntityTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateScopingEntityTemplateId() {
			OperationsTestCase<ScopingEntity> validateScopingEntityTemplateIdTestCase = new OperationsTestCase<ScopingEntity>(
			"validateScopingEntityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCOPING_ENTITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ScopingEntity target) {

			}

			@Override
			protected void updateToPass(ScopingEntity target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ScopingEntityOperations.validateScopingEntityTemplateId(
					(ScopingEntity) objectToTest, diagnostician, map);
			}

		};

		validateScopingEntityTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateScopingEntityDesc() {
			OperationsTestCase<ScopingEntity> validateScopingEntityDescTestCase = new OperationsTestCase<ScopingEntity>(
			"validateScopingEntityDesc",
			operationsForOCL.getOCLValue("VALIDATE_SCOPING_ENTITY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ScopingEntity target) {

			}

			@Override
			protected void updateToPass(ScopingEntity target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ScopingEntityOperations.validateScopingEntityDesc(
					(ScopingEntity) objectToTest, diagnostician, map);
			}

		};

		validateScopingEntityDescTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ScopingEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ScopingEntity> {
		@Override
		public ScopingEntity create() {		
			return PhmrFactory.eINSTANCE.createScopingEntity();
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
	private static class ConstructorTestClass extends ScopingEntityOperations {};
	
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
	
	

	
	
} // ScopingEntityOperations