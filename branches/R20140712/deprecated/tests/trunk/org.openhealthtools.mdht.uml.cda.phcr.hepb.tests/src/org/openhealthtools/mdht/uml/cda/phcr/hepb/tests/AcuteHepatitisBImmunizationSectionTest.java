
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.hepb.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBImmunizationSectionOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BImmunization Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection#validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BImmunization Section Acute Hepatitis BImmunization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection#getAcuteHepatitisBImmunizationActivities() <em>Get Acute Hepatitis BImmunization Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationSection#validateImmunizationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBImmunizationSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity() {
      OperationsTestCase<AcuteHepatitisBImmunizationSection> validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivityTestCase = new OperationsTestCase<AcuteHepatitisBImmunizationSection>(
      "validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity",
      operationsForOCL.getOCLValue("VALIDATE_ACUTE_HEPATITIS_BIMMUNIZATION_SECTION_ACUTE_HEPATITIS_BIMMUNIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBImmunizationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBImmunizationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBImmunizationSectionOperations.validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivity(
          (AcuteHepatitisBImmunizationSection) objectToTest, diagnostician, map);
      }

    };

    validateAcuteHepatitisBImmunizationSectionAcuteHepatitisBImmunizationActivityTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetAcuteHepatitisBImmunizationActivities() {


AcuteHepatitisBImmunizationSection target = objectFactory.create();
target.getAcuteHepatitisBImmunizationActivities();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateImmunizationsSectionTemplateId() {
      OperationsTestCase<AcuteHepatitisBImmunizationSection> validateImmunizationsSectionTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBImmunizationSection>(
      "validateImmunizationsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBImmunizationSection target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBImmunizationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBImmunizationSectionOperations.validateImmunizationsSectionTemplateId(
          (AcuteHepatitisBImmunizationSection) objectToTest, diagnostician, map);
      }

    };

    validateImmunizationsSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBImmunizationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBImmunizationSection> {
		public AcuteHepatitisBImmunizationSection create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBImmunizationSection();
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
	private static class ConstructorTestClass extends AcuteHepatitisBImmunizationSectionOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBImmunizationSectionOperations