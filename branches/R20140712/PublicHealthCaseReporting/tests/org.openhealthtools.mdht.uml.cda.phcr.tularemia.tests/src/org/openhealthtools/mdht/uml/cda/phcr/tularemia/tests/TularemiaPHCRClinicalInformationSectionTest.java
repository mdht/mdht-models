
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
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.TularemiaPHCRClinicalInformationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection#validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Clinical Information Section Tularemia Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection#getTularemiaCaseObservation() <em>Get Tularemia Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TularemiaPHCRClinicalInformationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation() {
      OperationsTestCase<TularemiaPHCRClinicalInformationSection> validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservationTestCase = new OperationsTestCase<TularemiaPHCRClinicalInformationSection>(
      "validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation",
      operationsForOCL.getOCLValue("VALIDATE_TULAREMIA_PHCR_CLINICAL_INFORMATION_SECTION_TULAREMIA_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(TularemiaPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaPHCRClinicalInformationSectionOperations.validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservation(
          (TularemiaPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validateTularemiaPHCRClinicalInformationSectionTularemiaCaseObservationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetTularemiaCaseObservation() {


TularemiaPHCRClinicalInformationSection target = objectFactory.create();
target.getTularemiaCaseObservation();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidatePhcrClinicalInformationSectionTemplateId() {
      OperationsTestCase<TularemiaPHCRClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<TularemiaPHCRClinicalInformationSection>(
      "validatePhcrClinicalInformationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TularemiaPHCRClinicalInformationSection target) {

      }

      @Override
      protected void updateToPass(TularemiaPHCRClinicalInformationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TularemiaPHCRClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
          (TularemiaPHCRClinicalInformationSection) objectToTest, diagnostician, map);
      }

    };

    validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TularemiaPHCRClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TularemiaPHCRClinicalInformationSection> {
		public TularemiaPHCRClinicalInformationSection create() {		
			return TularemiaFactory.eINSTANCE.createTularemiaPHCRClinicalInformationSection();
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
	private static class ConstructorTestClass extends TularemiaPHCRClinicalInformationSectionOperations {};
	
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
	
	

	
	
} // TularemiaPHCRClinicalInformationSectionOperations