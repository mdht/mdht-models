
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
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbFactory;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.operations.AcuteHepatitisBImmunizationActivityOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BImmunization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBImmunizationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AcuteHepatitisBImmunizationActivityTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationActivityTemplateId() {
      OperationsTestCase<AcuteHepatitisBImmunizationActivity> validateMedicationActivityTemplateIdTestCase = new OperationsTestCase<AcuteHepatitisBImmunizationActivity>(
      "validateMedicationActivityTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(AcuteHepatitisBImmunizationActivity target) {

      }

      @Override
      protected void updateToPass(AcuteHepatitisBImmunizationActivity target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return AcuteHepatitisBImmunizationActivityOperations.validateMedicationActivityTemplateId(
          (AcuteHepatitisBImmunizationActivity) objectToTest, diagnostician, map);
      }

    };

    validateMedicationActivityTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends AcuteHepatitisBImmunizationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AcuteHepatitisBImmunizationActivity> {
		public AcuteHepatitisBImmunizationActivity create() {		
			return HepbFactory.eINSTANCE.createAcuteHepatitisBImmunizationActivity();
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
	private static class ConstructorTestClass extends AcuteHepatitisBImmunizationActivityOperations {};
	
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
	
	

	
	
} // AcuteHepatitisBImmunizationActivityOperations