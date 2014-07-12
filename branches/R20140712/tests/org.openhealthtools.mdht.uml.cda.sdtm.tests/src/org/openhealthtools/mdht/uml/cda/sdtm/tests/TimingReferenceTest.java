
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
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmFactory;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.operations.TimingReferenceOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Timing Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.TimingReference#validateTimingReferenceAnchorAssociationAnchorTimePoint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Timing Reference Anchor Association Anchor Time Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class TimingReferenceTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceTemplateId() {
      OperationsTestCase<TimingReference> validateTimingReferenceTemplateIdTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceTemplateId(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceClassCode() {
      OperationsTestCase<TimingReference> validateTimingReferenceClassCodeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceClassCode",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceClassCode(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceCodeP() {
      OperationsTestCase<TimingReference> validateTimingReferenceCodePTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceCodeP",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceCodeP(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceCode() {
      OperationsTestCase<TimingReference> validateTimingReferenceCodeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceCode",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceCode(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceEffectiveTime() {
      OperationsTestCase<TimingReference> validateTimingReferenceEffectiveTimeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceEffectiveTime(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceId() {
      OperationsTestCase<TimingReference> validateTimingReferenceIdTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceId",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceId(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceMoodCode() {
      OperationsTestCase<TimingReference> validateTimingReferenceMoodCodeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceMoodCode(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceAnchorAssociation() {
      OperationsTestCase<TimingReference> validateTimingReferenceAnchorAssociationTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceAnchorAssociation",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceAnchorAssociation(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceAnchorAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceAnchorAssociationAnchorTimePointClassCode() {
      OperationsTestCase<TimingReference> validateTimingReferenceAnchorAssociationAnchorTimePointClassCodeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceAnchorAssociationAnchorTimePointClassCode",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePointClassCode(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceAnchorAssociationAnchorTimePointClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceAnchorAssociationAnchorTimePointCode() {
      OperationsTestCase<TimingReference> validateTimingReferenceAnchorAssociationAnchorTimePointCodeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceAnchorAssociationAnchorTimePointCode",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePointCode(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceAnchorAssociationAnchorTimePointCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime() {
      OperationsTestCase<TimingReference> validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTimeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
          IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
          target.setEffectiveTime(ts );								
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTime(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceAnchorAssociationAnchorTimePointEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceAnchorAssociationAnchorTimePointMoodCode() {
      OperationsTestCase<TimingReference> validateTimingReferenceAnchorAssociationAnchorTimePointMoodCodeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePointMoodCode(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceAnchorAssociationAnchorTimePointMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceAnchorAssociationTypeCode() {
      OperationsTestCase<TimingReference> validateTimingReferenceAnchorAssociationTypeCodeTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceAnchorAssociationTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceAnchorAssociationTypeCode(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceAnchorAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateTimingReferenceAnchorAssociationAnchorTimePoint() {
      OperationsTestCase<TimingReference> validateTimingReferenceAnchorAssociationAnchorTimePointTestCase = new OperationsTestCase<TimingReference>(
      "validateTimingReferenceAnchorAssociationAnchorTimePoint",
      operationsForOCL.getOCLValue("VALIDATE_TIMING_REFERENCE_ANCHOR_ASSOCIATION_ANCHOR_TIME_POINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(TimingReference target) {

      }

      @Override
      protected void updateToPass(TimingReference target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return TimingReferenceOperations.validateTimingReferenceAnchorAssociationAnchorTimePoint(
          (TimingReference) objectToTest, diagnostician, map);
      }

    };

    validateTimingReferenceAnchorAssociationAnchorTimePointTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends TimingReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TimingReference> {
		public TimingReference create() {		
			return SdtmFactory.eINSTANCE.createTimingReference();
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
	private static class ConstructorTestClass extends TimingReferenceOperations {};
	
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
	
	

	
	
} // TimingReferenceOperations