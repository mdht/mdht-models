
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisFactory;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisPHCRClinicalInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection#validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Clinical Information Section Chlamydiatrachomatis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection#getChlamydiatrachomatisCaseObservation() <em>Get Chlamydiatrachomatis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ChlamydiatrachomatisPHCRClinicalInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation() {
      OperationsTestCase<ChlamydiatrachomatisPHCRClinicalInformationSection> validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservationTestCase = new OperationsTestCase<ChlamydiatrachomatisPHCRClinicalInformationSection>(
      "validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_CLINICAL_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPHCRClinicalInformationSectionOperations.validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservation(
          (ChlamydiatrachomatisPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisPHCRClinicalInformationSectionChlamydiatrachomatisCaseObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetChlamydiatrachomatisCaseObservation() {


ChlamydiatrachomatisPHCRClinicalInformationSection target = objectFactory.create();
target.getChlamydiatrachomatisCaseObservation();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrClinicalInformationSectionTemplateId() {
      OperationsTestCase<ChlamydiatrachomatisPHCRClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<ChlamydiatrachomatisPHCRClinicalInformationSection>(
      "validatePhcrClinicalInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
          (ChlamydiatrachomatisPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ChlamydiatrachomatisPHCRClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChlamydiatrachomatisPHCRClinicalInformationSection> {
		public ChlamydiatrachomatisPHCRClinicalInformationSection create() {		
			return ChlamydiatrachomatisFactory.eINSTANCE.createChlamydiatrachomatisPHCRClinicalInformationSection();
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
	private static class ConstructorTestClass extends ChlamydiatrachomatisPHCRClinicalInformationSectionOperations {};
	
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
	
	

	
	
} // ChlamydiatrachomatisPHCRClinicalInformationSectionOperations