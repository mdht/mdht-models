
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
import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.BodyWeightOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Weight</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightFastingAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Fasting Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weight Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#validateBodyWeightfastingAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Weightfasting Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class BodyWeightTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightTemplateId() {
      OperationsTestCase<BodyWeight> validateBodyWeightTemplateIdTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightTemplateId(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightClassCode() {
      OperationsTestCase<BodyWeight> validateBodyWeightClassCodeTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightClassCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightClassCode(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightCodeP() {
      OperationsTestCase<BodyWeight> validateBodyWeightCodePTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightCodeP",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightCodeP(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightCode() {
      OperationsTestCase<BodyWeight> validateBodyWeightCodeTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightCode(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightId() {
      OperationsTestCase<BodyWeight> validateBodyWeightIdTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightId",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightId(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightMoodCode() {
      OperationsTestCase<BodyWeight> validateBodyWeightMoodCodeTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightMoodCode(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightValue() {
      OperationsTestCase<BodyWeight> validateBodyWeightValueTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightValue",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
      
        CD value = DatatypesFactory.eINSTANCE.createCD();
        target.getValues().add(value);
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightValue(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightStatusCode() {
      OperationsTestCase<BodyWeight> validateBodyWeightStatusCodeTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightStatusCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
      
        CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
        target.setStatusCode(cs);
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightStatusCode(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightInterpretationCode() {
      OperationsTestCase<BodyWeight> validateBodyWeightInterpretationCodeTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightInterpretationCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightInterpretationCode(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightInterpretationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightNonPerformanceReason() {
      OperationsTestCase<BodyWeight> validateBodyWeightNonPerformanceReasonTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightNonPerformanceReason",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightNonPerformanceReason(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightNonPerformanceReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightFastingAssociation() {
      OperationsTestCase<BodyWeight> validateBodyWeightFastingAssociationTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightFastingAssociation",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_FASTING_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightFastingAssociation(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightFastingAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightDataCollection() {
      OperationsTestCase<BodyWeight> validateBodyWeightDataCollectionTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightDataCollection",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightDataCollection(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightDataCollectionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightExclusionReason() {
      OperationsTestCase<BodyWeight> validateBodyWeightExclusionReasonTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightExclusionReason",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightExclusionReason(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightExclusionReasonTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateBodyWeightfastingAssociationTypeCode() {
      OperationsTestCase<BodyWeight> validateBodyWeightfastingAssociationTypeCodeTestCase = new OperationsTestCase<BodyWeight>(
      "validateBodyWeightfastingAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_BODY_WEIGHTFASTING_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(BodyWeight target) {

      }

      @Override
      protected void updateToPass(BodyWeight target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return BodyWeightOperations.validateBodyWeightfastingAssociationTypeCode(
          (BodyWeight) objectToTest, diagnostician, map);
      }

    };

    validateBodyWeightfastingAssociationTypeCodeTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetNonPerformanceReason() {


BodyWeight target = objectFactory.create();
target.getNonPerformanceReason();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetDataCollection() {


BodyWeight target = objectFactory.create();
target.getDataCollection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetExclusionReason() {


BodyWeight target = objectFactory.create();
target.getExclusionReason();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends BodyWeightOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BodyWeight> {
		public BodyWeight create() {		
			return SdtmFactory.eINSTANCE.createBodyWeight();
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
	private static class ConstructorTestClass extends BodyWeightOperations {};
	
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
	
	

	
	
} // BodyWeightOperations