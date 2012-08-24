
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
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.OrganMeasurementOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Organ Measurement</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementExclusionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getExclusionIndicator() <em>Get Exclusion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getDataCollection() <em>Get Data Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class OrganMeasurementTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementTemplateId() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementTemplateIdTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementTemplateId(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementClassCode() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementClassCodeTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementClassCode",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementClassCode(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementCode() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementCodeTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementCode",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementCode(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementId() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementIdTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementId",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementId(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementMoodCode() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementMoodCodeTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementMoodCode(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementValue() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementValueTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementValue",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementValue(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementStatusCode() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementStatusCodeTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementStatusCode(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementInterpretationCode() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementInterpretationCodeTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementInterpretationCode(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementNonPerformanceReason() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementNonPerformanceReasonTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementNonPerformanceReason(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementSpecimenInformation() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementSpecimenInformationTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementSpecimenInformation",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementSpecimenInformation(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementSpecimenInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementExclusionIndicator() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementExclusionIndicatorTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementExclusionIndicator",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementExclusionIndicator(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementExclusionIndicatorTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateOrganMeasurementDataCollection() {
      OperationsTestCase<OrganMeasurement> validateOrganMeasurementDataCollectionTestCase = new OperationsTestCase<OrganMeasurement>(
      "validateOrganMeasurementDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(OrganMeasurement target) {

      }

      @Override
      protected void updateToPass(OrganMeasurement target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return OrganMeasurementOperations.validateOrganMeasurementDataCollection(
          (OrganMeasurement) objectToTest, diagnostician, map);
      }

    };

    validateOrganMeasurementDataCollectionTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


OrganMeasurement target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetSpecimenInformation() {


OrganMeasurement target = objectFactory.create();
target.getSpecimenInformation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetExclusionIndicator() {


OrganMeasurement target = objectFactory.create();
target.getExclusionIndicator();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


OrganMeasurement target = objectFactory.create();
target.getDataCollection();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends OrganMeasurementOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OrganMeasurement> {
		public OrganMeasurement create() {		
			return SdtmFactory.eINSTANCE.createOrganMeasurement();
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
	private static class ConstructorTestClass extends OrganMeasurementOperations {};
	
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
	
	

	
	
} // OrganMeasurementOperations