
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaPHCRTreatmentInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Treatment Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection#validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Treatment Information Section Tularemia Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection#getTularemiaTherapeuticRegimenAct() <em>Get Tularemia Therapeutic Regimen Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection#validatePhcrTreatmentInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Treatment Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TularemiaPHCRTreatmentInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct() {
      OperationsTestCase<TularemiaPHCRTreatmentInformationSection> validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenActTestCase = new OperationsTestCase<TularemiaPHCRTreatmentInformationSection>(
      "validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_PHCR_TREATMENT_INFORMATION_SECTION_TULAREMIA_THERAPEUTIC_REGIMEN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaPHCRTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(TularemiaPHCRTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaPHCRTreatmentInformationSectionOperations.validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenAct(
          (TularemiaPHCRTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaPHCRTreatmentInformationSectionTularemiaTherapeuticRegimenActTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaTherapeuticRegimenAct() {


TularemiaPHCRTreatmentInformationSection target = objectFactory.create();
target.getTularemiaTherapeuticRegimenAct();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrTreatmentInformationSectionTemplateId() {
      OperationsTestCase<TularemiaPHCRTreatmentInformationSection> validatePhcrTreatmentInformationSectionTemplateIdTestCase = new OperationsTestCase<TularemiaPHCRTreatmentInformationSection>(
      "validatePhcrTreatmentInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_TREATMENT_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaPHCRTreatmentInformationSection target) {

      }

      @Override
      protected void updateToPass(TularemiaPHCRTreatmentInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaPHCRTreatmentInformationSectionOperations.validatePhcrTreatmentInformationSectionTemplateId(
          (TularemiaPHCRTreatmentInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrTreatmentInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TularemiaPHCRTreatmentInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TularemiaPHCRTreatmentInformationSection> {
		public TularemiaPHCRTreatmentInformationSection create() {		
			return TularemiaFactory.eINSTANCE.createTularemiaPHCRTreatmentInformationSection();
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
	private static class ConstructorTestClass extends TularemiaPHCRTreatmentInformationSectionOperations {};
	
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
	
	

	
	
} // TularemiaPHCRTreatmentInformationSectionOperations