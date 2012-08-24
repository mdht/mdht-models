
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
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations.ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection#validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis PHCR Treatment Information Section Chlamydiatrachomatis Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection#getChlamydiatrachomatisTherapeuticRegimenAct() <em>Get Chlamydiatrachomatis Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ChlamydiatrachomatisPHCRTreatmentInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct() {
      OperationsTestCase<ChlamydiatrachomatisPHCRTreatmentInformationSection> validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenActTestCase = new OperationsTestCase<ChlamydiatrachomatisPHCRTreatmentInformationSection>(
      "validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct",
      operationsForOCL.getOCLValue("VALIDATE_CHLAMYDIATRACHOMATIS_PHCR_TREATMENT_INFORMATION_SECTION_CHLAMYDIATRACHOMATIS_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPHCRTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPHCRTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations.validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenAct(
          (ChlamydiatrachomatisPHCRTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateChlamydiatrachomatisPHCRTreatmentInformationSectionChlamydiatrachomatisTherapeuticRegimenActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetChlamydiatrachomatisTherapeuticRegimenAct() {


ChlamydiatrachomatisPHCRTreatmentInformationSection target = objectFactory.create();
target.getChlamydiatrachomatisTherapeuticRegimenAct();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrTreatmentInformationSectionTemplateId() {
      OperationsTestCase<ChlamydiatrachomatisPHCRTreatmentInformationSection> validatePhcrTreatmentInformationSectionTemplateIdTestCase = new OperationsTestCase<ChlamydiatrachomatisPHCRTreatmentInformationSection>(
      "validatePhcrTreatmentInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(ChlamydiatrachomatisPHCRTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(ChlamydiatrachomatisPHCRTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(
          (ChlamydiatrachomatisPHCRTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrTreatmentInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChlamydiatrachomatisPHCRTreatmentInformationSection> {
		public ChlamydiatrachomatisPHCRTreatmentInformationSection create() {		
			return ChlamydiatrachomatisFactory.eINSTANCE.createChlamydiatrachomatisPHCRTreatmentInformationSection();
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
	private static class ConstructorTestClass extends ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations {};
	
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
	
	

	
	
} // ChlamydiatrachomatisPHCRTreatmentInformationSectionOperations