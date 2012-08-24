
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
import org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.MassIdentificationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mass Identification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification#validateMassIdentificationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification#validateMassIdentificationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MassIdentification#validateMassIdentificationParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mass Identification Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MassIdentificationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMassIdentificationTemplateId() {
      OperationsTestCase<MassIdentification> validateMassIdentificationTemplateIdTestCase = new OperationsTestCase<MassIdentification>(
      "validateMassIdentificationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_MASS_IDENTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MassIdentification target) {

      }

      @Override
      protected void updateToPass(MassIdentification target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MassIdentificationOperations.validateMassIdentificationTemplateId(
          (MassIdentification) objectToTest, diagnostician, map);
      }

    };

    validateMassIdentificationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMassIdentificationTypeCode() {
      OperationsTestCase<MassIdentification> validateMassIdentificationTypeCodeTestCase = new OperationsTestCase<MassIdentification>(
      "validateMassIdentificationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_MASS_IDENTIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MassIdentification target) {

      }

      @Override
      protected void updateToPass(MassIdentification target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MassIdentificationOperations.validateMassIdentificationTypeCode(
          (MassIdentification) objectToTest, diagnostician, map);
      }

    };

    validateMassIdentificationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMassIdentificationParticipantRole() {
      OperationsTestCase<MassIdentification> validateMassIdentificationParticipantRoleTestCase = new OperationsTestCase<MassIdentification>(
      "validateMassIdentificationParticipantRole",
      operationsForOCL.getOCLValue("VALIDATE_MASS_IDENTIFICATION_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(MassIdentification target) {

      }

      @Override
      protected void updateToPass(MassIdentification target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return MassIdentificationOperations.validateMassIdentificationParticipantRole(
          (MassIdentification) objectToTest, diagnostician, map);
      }

    };

    validateMassIdentificationParticipantRoleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends MassIdentificationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MassIdentification> {
		public MassIdentification create() {		
			return SdtmFactory.eINSTANCE.createMassIdentification();
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
	private static class ConstructorTestClass extends MassIdentificationOperations {};
	
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
	
	

	
	
} // MassIdentificationOperations