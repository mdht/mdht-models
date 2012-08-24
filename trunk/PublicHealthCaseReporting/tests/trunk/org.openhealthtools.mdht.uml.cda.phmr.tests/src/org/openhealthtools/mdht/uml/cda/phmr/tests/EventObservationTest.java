
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
import org.openhealthtools.mdht.uml.cda.phmr.EventObservation;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.EventObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Event Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.EventObservation#validateEventObservationPHMRProductInstanceReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Event Observation PHMR Product Instance Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class EventObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateEventObservationTemplateId() {
      OperationsTestCase<EventObservation> validateEventObservationTemplateIdTestCase = new OperationsTestCase<EventObservation>(
      "validateEventObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventObservation target) {

      }

      @Override
      protected void updateToPass(EventObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventObservationOperations.validateEventObservationTemplateId(
          (EventObservation) objectToTest, diagnostician, map);
      }

    };

    validateEventObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventObservationClassCode() {
      OperationsTestCase<EventObservation> validateEventObservationClassCodeTestCase = new OperationsTestCase<EventObservation>(
      "validateEventObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventObservation target) {

      }

      @Override
      protected void updateToPass(EventObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventObservationOperations.validateEventObservationClassCode(
          (EventObservation) objectToTest, diagnostician, map);
      }

    };

    validateEventObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventObservationCode() {
      OperationsTestCase<EventObservation> validateEventObservationCodeTestCase = new OperationsTestCase<EventObservation>(
      "validateEventObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventObservation target) {

      }

      @Override
      protected void updateToPass(EventObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventObservationOperations.validateEventObservationCode(
          (EventObservation) objectToTest, diagnostician, map);
      }

    };

    validateEventObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventObservationMoodCode() {
      OperationsTestCase<EventObservation> validateEventObservationMoodCodeTestCase = new OperationsTestCase<EventObservation>(
      "validateEventObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventObservation target) {

      }

      @Override
      protected void updateToPass(EventObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventObservationOperations.validateEventObservationMoodCode(
          (EventObservation) objectToTest, diagnostician, map);
      }

    };

    validateEventObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventObservationValue() {
      OperationsTestCase<EventObservation> validateEventObservationValueTestCase = new OperationsTestCase<EventObservation>(
      "validateEventObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventObservation target) {

      }

      @Override
      protected void updateToPass(EventObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventObservationOperations.validateEventObservationValue(
          (EventObservation) objectToTest, diagnostician, map);
      }

    };

    validateEventObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateEventObservationPHMRProductInstanceReference() {
      OperationsTestCase<EventObservation> validateEventObservationPHMRProductInstanceReferenceTestCase = new OperationsTestCase<EventObservation>(
      "validateEventObservationPHMRProductInstanceReference",
      operationsForOCL.getOCLValue("VALIDATE_EVENT_OBSERVATION_PHMR_PRODUCT_INSTANCE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EventObservation target) {

      }

      @Override
      protected void updateToPass(EventObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EventObservationOperations.validateEventObservationPHMRProductInstanceReference(
          (EventObservation) objectToTest, diagnostician, map);
      }

    };

    validateEventObservationPHMRProductInstanceReferenceTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends EventObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EventObservation> {
		public EventObservation create() {		
			return PhmrFactory.eINSTANCE.createEventObservation();
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
	private static class ConstructorTestClass extends EventObservationOperations {};
	
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
	
	

	
	
} // EventObservationOperations