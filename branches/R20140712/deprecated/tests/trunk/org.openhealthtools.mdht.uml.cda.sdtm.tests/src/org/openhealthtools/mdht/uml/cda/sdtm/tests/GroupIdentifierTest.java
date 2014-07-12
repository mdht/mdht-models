
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
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.GroupIdentifierOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Group Identifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier#validateGroupIdentifierMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Group Identifier Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class GroupIdentifierTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateGroupIdentifierTemplateId() {
      OperationsTestCase<GroupIdentifier> validateGroupIdentifierTemplateIdTestCase = new OperationsTestCase<GroupIdentifier>(
      "validateGroupIdentifierTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_GROUP_IDENTIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GroupIdentifier target) {

      }

      @Override
      protected void updateToPass(GroupIdentifier target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GroupIdentifierOperations.validateGroupIdentifierTemplateId(
          (GroupIdentifier) objectToTest, diagnostician, map);
      }

    };

    validateGroupIdentifierTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGroupIdentifierClassCode() {
      OperationsTestCase<GroupIdentifier> validateGroupIdentifierClassCodeTestCase = new OperationsTestCase<GroupIdentifier>(
      "validateGroupIdentifierClassCode",
      operationsForOCL.getOCLValue("VALIDATE_GROUP_IDENTIFIER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GroupIdentifier target) {

      }

      @Override
      protected void updateToPass(GroupIdentifier target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GroupIdentifierOperations.validateGroupIdentifierClassCode(
          (GroupIdentifier) objectToTest, diagnostician, map);
      }

    };

    validateGroupIdentifierClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGroupIdentifierCodeP() {
      OperationsTestCase<GroupIdentifier> validateGroupIdentifierCodePTestCase = new OperationsTestCase<GroupIdentifier>(
      "validateGroupIdentifierCodeP",
      operationsForOCL.getOCLValue("VALIDATE_GROUP_IDENTIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GroupIdentifier target) {

      }

      @Override
      protected void updateToPass(GroupIdentifier target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GroupIdentifierOperations.validateGroupIdentifierCodeP(
          (GroupIdentifier) objectToTest, diagnostician, map);
      }

    };

    validateGroupIdentifierCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGroupIdentifierCode() {
      OperationsTestCase<GroupIdentifier> validateGroupIdentifierCodeTestCase = new OperationsTestCase<GroupIdentifier>(
      "validateGroupIdentifierCode",
      operationsForOCL.getOCLValue("VALIDATE_GROUP_IDENTIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GroupIdentifier target) {

      }

      @Override
      protected void updateToPass(GroupIdentifier target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GroupIdentifierOperations.validateGroupIdentifierCode(
          (GroupIdentifier) objectToTest, diagnostician, map);
      }

    };

    validateGroupIdentifierCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGroupIdentifierId() {
      OperationsTestCase<GroupIdentifier> validateGroupIdentifierIdTestCase = new OperationsTestCase<GroupIdentifier>(
      "validateGroupIdentifierId",
      operationsForOCL.getOCLValue("VALIDATE_GROUP_IDENTIFIER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GroupIdentifier target) {

      }

      @Override
      protected void updateToPass(GroupIdentifier target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GroupIdentifierOperations.validateGroupIdentifierId(
          (GroupIdentifier) objectToTest, diagnostician, map);
      }

    };

    validateGroupIdentifierIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateGroupIdentifierMoodCode() {
      OperationsTestCase<GroupIdentifier> validateGroupIdentifierMoodCodeTestCase = new OperationsTestCase<GroupIdentifier>(
      "validateGroupIdentifierMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_GROUP_IDENTIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(GroupIdentifier target) {

      }

      @Override
      protected void updateToPass(GroupIdentifier target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return GroupIdentifierOperations.validateGroupIdentifierMoodCode(
          (GroupIdentifier) objectToTest, diagnostician, map);
      }

    };

    validateGroupIdentifierMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends GroupIdentifierOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GroupIdentifier> {
		public GroupIdentifier create() {		
			return SdtmFactory.eINSTANCE.createGroupIdentifier();
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
	private static class ConstructorTestClass extends GroupIdentifierOperations {};
	
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
	
	

	
	
} // GroupIdentifierOperations