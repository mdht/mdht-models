
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
import org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.PHMRProductInstanceOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHMR Product Instance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validatePHMRProductInstanceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validatePHMRProductInstanceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validatePHMRProductInstanceScopingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Scoping Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validatePHMRProductInstancePlayingDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Playing Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstance#validateProductInstanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PHMRProductInstanceTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRProductInstanceCode() {
      OperationsTestCase<PHMRProductInstance> validatePHMRProductInstanceCodeTestCase = new OperationsTestCase<PHMRProductInstance>(
      "validatePHMRProductInstanceCode",
      operationsForOCL.getOCLValue("VALIDATE_PHMR_PRODUCT_INSTANCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PHMRProductInstance target) {

      }

      @Override
      protected void updateToPass(PHMRProductInstance target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PHMRProductInstanceOperations.validatePHMRProductInstanceCode(
          (PHMRProductInstance) objectToTest, diagnostician, map);
      }

    };

    validatePHMRProductInstanceCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRProductInstanceId() {
      OperationsTestCase<PHMRProductInstance> validatePHMRProductInstanceIdTestCase = new OperationsTestCase<PHMRProductInstance>(
      "validatePHMRProductInstanceId",
      operationsForOCL.getOCLValue("VALIDATE_PHMR_PRODUCT_INSTANCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PHMRProductInstance target) {

      }

      @Override
      protected void updateToPass(PHMRProductInstance target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PHMRProductInstanceOperations.validatePHMRProductInstanceId(
          (PHMRProductInstance) objectToTest, diagnostician, map);
      }

    };

    validatePHMRProductInstanceIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRProductInstanceScopingEntity() {
      OperationsTestCase<PHMRProductInstance> validatePHMRProductInstanceScopingEntityTestCase = new OperationsTestCase<PHMRProductInstance>(
      "validatePHMRProductInstanceScopingEntity",
      operationsForOCL.getOCLValue("VALIDATE_PHMR_PRODUCT_INSTANCE_SCOPING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PHMRProductInstance target) {

      }

      @Override
      protected void updateToPass(PHMRProductInstance target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PHMRProductInstanceOperations.validatePHMRProductInstanceScopingEntity(
          (PHMRProductInstance) objectToTest, diagnostician, map);
      }

    };

    validatePHMRProductInstanceScopingEntityTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePHMRProductInstancePlayingDevice() {
      OperationsTestCase<PHMRProductInstance> validatePHMRProductInstancePlayingDeviceTestCase = new OperationsTestCase<PHMRProductInstance>(
      "validatePHMRProductInstancePlayingDevice",
      operationsForOCL.getOCLValue("VALIDATE_PHMR_PRODUCT_INSTANCE_PLAYING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PHMRProductInstance target) {

      }

      @Override
      protected void updateToPass(PHMRProductInstance target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PHMRProductInstanceOperations.validatePHMRProductInstancePlayingDevice(
          (PHMRProductInstance) objectToTest, diagnostician, map);
      }

    };

    validatePHMRProductInstancePlayingDeviceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateProductInstanceTemplateId() {
      OperationsTestCase<PHMRProductInstance> validateProductInstanceTemplateIdTestCase = new OperationsTestCase<PHMRProductInstance>(
      "validateProductInstanceTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PHMRProductInstance target) {

      }

      @Override
      protected void updateToPass(PHMRProductInstance target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PHMRProductInstanceOperations.validateProductInstanceTemplateId(
          (PHMRProductInstance) objectToTest, diagnostician, map);
      }

    };

    validateProductInstanceTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PHMRProductInstanceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PHMRProductInstance> {
		public PHMRProductInstance create() {		
			return PhmrFactory.eINSTANCE.createPHMRProductInstance();
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
	private static class ConstructorTestClass extends PHMRProductInstanceOperations {};
	
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
	
	

	
	
} // PHMRProductInstanceOperations