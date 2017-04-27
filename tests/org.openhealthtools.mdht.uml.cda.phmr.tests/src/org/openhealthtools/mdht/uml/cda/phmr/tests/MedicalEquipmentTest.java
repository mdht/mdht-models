
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
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrFactory;
import org.openhealthtools.mdht.uml.cda.phmr.operations.MedicalEquipmentOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment#validateMedicalEquipmentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment#validateMedicalEquipmentDeviceDefinitionOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Device Definition Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment#getDeviceDefinitionOrganizers() <em>Get Device Definition Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.MedicalEquipment#validateMedicalEquipmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MedicalEquipmentTest extends  CDAValidationTest {



/**
*
* @generated not
*/
@Test

 
									
public void testValidateMedicalEquipmentText() {
      OperationsTestCase<MedicalEquipment> validateMedicalEquipmentTextTestCase = new OperationsTestCase<MedicalEquipment>(
      "validateMedicalEquipmentText",
      operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MedicalEquipment target) {

      }

      @Override
      protected void updateToPass(MedicalEquipment target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
 
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MedicalEquipmentOperations.validateMedicalEquipmentText(
          (MedicalEquipment) objectToTest, diagnostician, map);
      }

    };

    validateMedicalEquipmentTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalEquipmentDeviceDefinitionOrganizer() {
			OperationsTestCase<MedicalEquipment> validateMedicalEquipmentDeviceDefinitionOrganizerTestCase = new OperationsTestCase<MedicalEquipment>(
			"validateMedicalEquipmentDeviceDefinitionOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_DEVICE_DEFINITION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipment target) {

			}

			@Override
			protected void updateToPass(MedicalEquipment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalEquipmentOperations.validateMedicalEquipmentDeviceDefinitionOrganizer(
					(MedicalEquipment) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentDeviceDefinitionOrganizerTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetDeviceDefinitionOrganizers() {


MedicalEquipment target = objectFactory.create();
target.getDeviceDefinitionOrganizers();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicalEquipmentSectionTemplateId() {
			OperationsTestCase<MedicalEquipment> validateMedicalEquipmentSectionTemplateIdTestCase = new OperationsTestCase<MedicalEquipment>(
			"validateMedicalEquipmentSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipment target) {

			}

			@Override
			protected void updateToPass(MedicalEquipment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicalEquipmentOperations.validateMedicalEquipmentSectionTemplateId(
					(MedicalEquipment) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends MedicalEquipmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalEquipment> {
		@Override
		public MedicalEquipment create() {		
			return PhmrFactory.eINSTANCE.createMedicalEquipment();
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
	private static class ConstructorTestClass extends MedicalEquipmentOperations {};
	
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
	
	

	
	
} // MedicalEquipmentOperations