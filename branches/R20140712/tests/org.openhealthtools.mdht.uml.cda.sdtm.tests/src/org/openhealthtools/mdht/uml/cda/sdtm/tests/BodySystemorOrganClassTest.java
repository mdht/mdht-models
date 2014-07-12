
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
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.BodySystemorOrganClassOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Systemor Organ Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass#validateBodySystemorOrganClassValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Systemor Organ Class Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class BodySystemorOrganClassTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateBodySystemorOrganClassTemplateId() {
      OperationsTestCase<BodySystemorOrganClass> validateBodySystemorOrganClassTemplateIdTestCase = new OperationsTestCase<BodySystemorOrganClass>(
      "validateBodySystemorOrganClassTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodySystemorOrganClass target) {

      }

      @Override
      protected void updateToPass(BodySystemorOrganClass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodySystemorOrganClassOperations.validateBodySystemorOrganClassTemplateId(
          (BodySystemorOrganClass) objectToTest, diagnostician, map);
      }

    };

    validateBodySystemorOrganClassTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodySystemorOrganClassClassCode() {
      OperationsTestCase<BodySystemorOrganClass> validateBodySystemorOrganClassClassCodeTestCase = new OperationsTestCase<BodySystemorOrganClass>(
      "validateBodySystemorOrganClassClassCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodySystemorOrganClass target) {

      }

      @Override
      protected void updateToPass(BodySystemorOrganClass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodySystemorOrganClassOperations.validateBodySystemorOrganClassClassCode(
          (BodySystemorOrganClass) objectToTest, diagnostician, map);
      }

    };

    validateBodySystemorOrganClassClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodySystemorOrganClassCodeP() {
      OperationsTestCase<BodySystemorOrganClass> validateBodySystemorOrganClassCodePTestCase = new OperationsTestCase<BodySystemorOrganClass>(
      "validateBodySystemorOrganClassCodeP",
      operationsForOCL.getOCLValue("VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodySystemorOrganClass target) {

      }

      @Override
      protected void updateToPass(BodySystemorOrganClass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodySystemorOrganClassOperations.validateBodySystemorOrganClassCodeP(
          (BodySystemorOrganClass) objectToTest, diagnostician, map);
      }

    };

    validateBodySystemorOrganClassCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodySystemorOrganClassCode() {
      OperationsTestCase<BodySystemorOrganClass> validateBodySystemorOrganClassCodeTestCase = new OperationsTestCase<BodySystemorOrganClass>(
      "validateBodySystemorOrganClassCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodySystemorOrganClass target) {

      }

      @Override
      protected void updateToPass(BodySystemorOrganClass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodySystemorOrganClassOperations.validateBodySystemorOrganClassCode(
          (BodySystemorOrganClass) objectToTest, diagnostician, map);
      }

    };

    validateBodySystemorOrganClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodySystemorOrganClassMoodCode() {
      OperationsTestCase<BodySystemorOrganClass> validateBodySystemorOrganClassMoodCodeTestCase = new OperationsTestCase<BodySystemorOrganClass>(
      "validateBodySystemorOrganClassMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodySystemorOrganClass target) {

      }

      @Override
      protected void updateToPass(BodySystemorOrganClass target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodySystemorOrganClassOperations.validateBodySystemorOrganClassMoodCode(
          (BodySystemorOrganClass) objectToTest, diagnostician, map);
      }

    };

    validateBodySystemorOrganClassMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodySystemorOrganClassValue() {
      OperationsTestCase<BodySystemorOrganClass> validateBodySystemorOrganClassValueTestCase = new OperationsTestCase<BodySystemorOrganClass>(
      "validateBodySystemorOrganClassValue",
      operationsForOCL.getOCLValue("VALIDATE_BODY_SYSTEMOR_ORGAN_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodySystemorOrganClass target) {

      }

      @Override
      protected void updateToPass(BodySystemorOrganClass target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodySystemorOrganClassOperations.validateBodySystemorOrganClassValue(
          (BodySystemorOrganClass) objectToTest, diagnostician, map);
      }

    };

    validateBodySystemorOrganClassValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends BodySystemorOrganClassOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BodySystemorOrganClass> {
		public BodySystemorOrganClass create() {		
			return SdtmFactory.eINSTANCE.createBodySystemorOrganClass();
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
	private static class ConstructorTestClass extends BodySystemorOrganClassOperations {};
	
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
	
	

	
	
} // BodySystemorOrganClassOperations