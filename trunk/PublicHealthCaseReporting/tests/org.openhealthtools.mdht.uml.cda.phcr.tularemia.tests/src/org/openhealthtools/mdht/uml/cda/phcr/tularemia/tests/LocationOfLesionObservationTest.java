
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
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaFactory;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations.LocationOfLesionObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Location Of Lesion Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation#validateLocationOfLesionObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Location Of Lesion Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class LocationOfLesionObservationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationTemplateId() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationTemplateIdTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationTemplateId(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationClassCode() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationClassCodeTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationClassCode",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationClassCode(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationMoodCode() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationMoodCodeTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationMoodCode(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationCodeP() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationCodePTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationCodeP",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationCodeP(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationCode() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationCodeTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationCode",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
      
        CD cd  = DatatypesFactory.eINSTANCE.createCD();
        target.setCode(cd);
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationCode(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationStatusCode() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationStatusCodeTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationStatusCode(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationStatusCodeP() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationStatusCodePTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationStatusCodeP",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationStatusCodeP(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationStatusCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationEffectiveTime() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationEffectiveTimeTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationEffectiveTime(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationValue() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationValueTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationValue",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationValue(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLocationOfLesionObservationTargetSiteCode() {
      OperationsTestCase<LocationOfLesionObservation> validateLocationOfLesionObservationTargetSiteCodeTestCase = new OperationsTestCase<LocationOfLesionObservation>(
      "validateLocationOfLesionObservationTargetSiteCode",
      operationsForOCL.getOCLValue("VALIDATE_LOCATION_OF_LESION_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(LocationOfLesionObservation target) {

      }

      @Override
      protected void updateToPass(LocationOfLesionObservation target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return LocationOfLesionObservationOperations.validateLocationOfLesionObservationTargetSiteCode(
          (LocationOfLesionObservation) objectToTest, diagnostician, map);
      }

    };

    validateLocationOfLesionObservationTargetSiteCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends LocationOfLesionObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LocationOfLesionObservation> {
		public LocationOfLesionObservation create() {		
			return TularemiaFactory.eINSTANCE.createLocationOfLesionObservation();
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
	private static class ConstructorTestClass extends LocationOfLesionObservationOperations {};
	
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
	
	

	
	
} // LocationOfLesionObservationOperations