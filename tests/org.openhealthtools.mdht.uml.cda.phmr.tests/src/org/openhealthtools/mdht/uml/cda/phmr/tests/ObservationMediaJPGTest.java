
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
import org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.ObservationMediaJPGOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Observation Media JPG</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG#validateObservationMediaJPGTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG#validateObservationMediaJPGClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG#validateObservationMediaJPGMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.ObservationMediaJPG#validateObservationMediaJPGValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observation Media JPG Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ObservationMediaJPGTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateObservationMediaJPGTemplateId() {
			OperationsTestCase<ObservationMediaJPG> validateObservationMediaJPGTemplateIdTestCase = new OperationsTestCase<ObservationMediaJPG>(
			"validateObservationMediaJPGTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_MEDIA_JPG_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ObservationMediaJPG target) {

			}

			@Override
			protected void updateToPass(ObservationMediaJPG target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ObservationMediaJPGOperations.validateObservationMediaJPGTemplateId(
					(ObservationMediaJPG) objectToTest, diagnostician, map);
			}

		};

		validateObservationMediaJPGTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObservationMediaJPGClassCode() {
			OperationsTestCase<ObservationMediaJPG> validateObservationMediaJPGClassCodeTestCase = new OperationsTestCase<ObservationMediaJPG>(
			"validateObservationMediaJPGClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_MEDIA_JPG_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ObservationMediaJPG target) {

			}

			@Override
			protected void updateToPass(ObservationMediaJPG target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ObservationMediaJPGOperations.validateObservationMediaJPGClassCode(
					(ObservationMediaJPG) objectToTest, diagnostician, map);
			}

		};

		validateObservationMediaJPGClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObservationMediaJPGMoodCode() {
			OperationsTestCase<ObservationMediaJPG> validateObservationMediaJPGMoodCodeTestCase = new OperationsTestCase<ObservationMediaJPG>(
			"validateObservationMediaJPGMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_MEDIA_JPG_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ObservationMediaJPG target) {

			}

			@Override
			protected void updateToPass(ObservationMediaJPG target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ObservationMediaJPGOperations.validateObservationMediaJPGMoodCode(
					(ObservationMediaJPG) objectToTest, diagnostician, map);
			}

		};

		validateObservationMediaJPGMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateObservationMediaJPGValue() {
      OperationsTestCase<ObservationMediaJPG> validateObservationMediaJPGValueTestCase = new OperationsTestCase<ObservationMediaJPG>(
      "validateObservationMediaJPGValue",
      operationsForOCL.getOCLValue("VALIDATE_OBSERVATION_MEDIA_JPG_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ObservationMediaJPG target) {

      }

      @Override
      protected void updateToPass(ObservationMediaJPG target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
     
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ObservationMediaJPGOperations.validateObservationMediaJPGValue(
          (ObservationMediaJPG) objectToTest, diagnostician, map);
      }

    };

    validateObservationMediaJPGValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ObservationMediaJPGOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ObservationMediaJPG> {
		@Override
		public ObservationMediaJPG create() {		
			return PhmrFactory.eINSTANCE.createObservationMediaJPG();
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
	private static class ConstructorTestClass extends ObservationMediaJPGOperations {};
	
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
	
	

	
	
} // ObservationMediaJPGOperations