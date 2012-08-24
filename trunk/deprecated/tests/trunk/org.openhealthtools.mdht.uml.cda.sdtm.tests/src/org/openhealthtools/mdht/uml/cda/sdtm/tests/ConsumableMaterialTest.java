
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.ConsumableMaterialOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Consumable Material</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kindsubstance Class Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Materialas Specialized Kind Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationMedicationMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Medication Material Lot Number Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConsumableMaterial#validateConsumableMaterialMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consumable Material Medication Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ConsumableMaterialTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialTemplateId() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialTemplateIdTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialTemplateId(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialTypeCode() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialTypeCodeTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialTypeCode(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedication() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedication",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedication(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCodeTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCode(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCodeTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCode(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassDeterminerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassNameTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KINDSUBSTANCE_CLASS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassName(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindsubstanceClassNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCodeTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCode(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCode(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganizationTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIALAS_SPECIALIZED_KIND_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganization(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialasSpecializedKindRepresentedOrganizationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialClassCode() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialClassCodeTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialClassCode(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialCode() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialCodeTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialCode",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialCode(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationMedicationMaterialLotNumberText() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationMedicationMaterialLotNumberTextTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationMedicationMaterialLotNumberText",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_MEDICATION_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
    ED text = DatatypesFactory.eINSTANCE.createED();
   
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationMedicationMaterialLotNumberText(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationMedicationMaterialLotNumberTextTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateConsumableMaterialMedicationClassCode() {
      OperationsTestCase<ConsumableMaterial> validateConsumableMaterialMedicationClassCodeTestCase = new OperationsTestCase<ConsumableMaterial>(
      "validateConsumableMaterialMedicationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_CONSUMABLE_MATERIAL_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ConsumableMaterial target) {

      }

      @Override
      protected void updateToPass(ConsumableMaterial target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ConsumableMaterialOperations.validateConsumableMaterialMedicationClassCode(
          (ConsumableMaterial) objectToTest, diagnostician, map);
      }

    };

    validateConsumableMaterialMedicationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ConsumableMaterialOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConsumableMaterial> {
		public ConsumableMaterial create() {		
			return SdtmFactory.eINSTANCE.createConsumableMaterial();
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
	private static class ConstructorTestClass extends ConsumableMaterialOperations {};
	
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
	
	

	
	
} // ConsumableMaterialOperations