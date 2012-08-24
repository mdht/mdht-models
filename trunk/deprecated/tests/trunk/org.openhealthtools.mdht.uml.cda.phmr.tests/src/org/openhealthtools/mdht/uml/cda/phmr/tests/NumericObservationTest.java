
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
import org.openhealthtools.mdht.uml.cda.phmr.NumericObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.NumericObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Numeric Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.NumericObservation#validateNumericObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.NumericObservation#validateNumericObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.NumericObservation#validateNumericObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.NumericObservation#validateNumericObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.NumericObservation#validateNumericObservationPHMRProductInstanceReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Numeric Observation PHMR Product Instance Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.NumericObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class NumericObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateNumericObservationClassCode() {
      OperationsTestCase<NumericObservation> validateNumericObservationClassCodeTestCase = new OperationsTestCase<NumericObservation>(
      "validateNumericObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_NUMERIC_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NumericObservation target) {

      }

      @Override
      protected void updateToPass(NumericObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NumericObservationOperations.validateNumericObservationClassCode(
          (NumericObservation) objectToTest, diagnostician, map);
      }

    };

    validateNumericObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNumericObservationCode() {
      OperationsTestCase<NumericObservation> validateNumericObservationCodeTestCase = new OperationsTestCase<NumericObservation>(
      "validateNumericObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_NUMERIC_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NumericObservation target) {

      }

      @Override
      protected void updateToPass(NumericObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NumericObservationOperations.validateNumericObservationCode(
          (NumericObservation) objectToTest, diagnostician, map);
      }

    };

    validateNumericObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNumericObservationMoodCode() {
      OperationsTestCase<NumericObservation> validateNumericObservationMoodCodeTestCase = new OperationsTestCase<NumericObservation>(
      "validateNumericObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_NUMERIC_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NumericObservation target) {

      }

      @Override
      protected void updateToPass(NumericObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NumericObservationOperations.validateNumericObservationMoodCode(
          (NumericObservation) objectToTest, diagnostician, map);
      }

    };

    validateNumericObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNumericObservationValue() {
      OperationsTestCase<NumericObservation> validateNumericObservationValueTestCase = new OperationsTestCase<NumericObservation>(
      "validateNumericObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_NUMERIC_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NumericObservation target) {

      }

      @Override
      protected void updateToPass(NumericObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NumericObservationOperations.validateNumericObservationValue(
          (NumericObservation) objectToTest, diagnostician, map);
      }

    };

    validateNumericObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateNumericObservationPHMRProductInstanceReference() {
      OperationsTestCase<NumericObservation> validateNumericObservationPHMRProductInstanceReferenceTestCase = new OperationsTestCase<NumericObservation>(
      "validateNumericObservationPHMRProductInstanceReference",
      operationsForOCL.getOCLValue("VALIDATE_NUMERIC_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NumericObservation target) {

      }

      @Override
      protected void updateToPass(NumericObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NumericObservationOperations.validateNumericObservationPHMRProductInstanceReference(
          (NumericObservation) objectToTest, diagnostician, map);
      }

    };

    validateNumericObservationPHMRProductInstanceReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationTemplateId() {
      OperationsTestCase<NumericObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<NumericObservation>(
      "validateResultObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(NumericObservation target) {

      }

      @Override
      protected void updateToPass(NumericObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return NumericObservationOperations.validateResultObservationTemplateId(
          (NumericObservation) objectToTest, diagnostician, map);
      }

    };

    validateResultObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends NumericObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NumericObservation> {
		public NumericObservation create() {		
			return PhmrFactory.eINSTANCE.createNumericObservation();
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
	private static class ConstructorTestClass extends NumericObservationOperations {};
	
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
	
	

	
	
} // NumericObservationOperations