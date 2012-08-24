
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalPresentationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Presentation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalPresentation#validateFetalPresentationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Presentation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class FetalPresentationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalPresentationTemplateId() {
			OperationsTestCase<FetalPresentation> validateFetalPresentationTemplateIdTestCase = new OperationsTestCase<FetalPresentation>(
			"validateFetalPresentationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_PRESENTATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalPresentation target) {

			}

			@Override
			protected void updateToPass(FetalPresentation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalPresentationOperations.validateFetalPresentationTemplateId(
					(FetalPresentation) objectToTest, diagnostician, map);
			}

		};

		validateFetalPresentationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalPresentationClassCode() {
			OperationsTestCase<FetalPresentation> validateFetalPresentationClassCodeTestCase = new OperationsTestCase<FetalPresentation>(
			"validateFetalPresentationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_PRESENTATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalPresentation target) {

			}

			@Override
			protected void updateToPass(FetalPresentation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalPresentationOperations.validateFetalPresentationClassCode(
					(FetalPresentation) objectToTest, diagnostician, map);
			}

		};

		validateFetalPresentationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalPresentationCode() {
			OperationsTestCase<FetalPresentation> validateFetalPresentationCodeTestCase = new OperationsTestCase<FetalPresentation>(
			"validateFetalPresentationCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_PRESENTATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalPresentation target) {

			}

			@Override
			protected void updateToPass(FetalPresentation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalPresentationOperations.validateFetalPresentationCode(
					(FetalPresentation) objectToTest, diagnostician, map);
			}

		};

		validateFetalPresentationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalPresentationMoodCode() {
			OperationsTestCase<FetalPresentation> validateFetalPresentationMoodCodeTestCase = new OperationsTestCase<FetalPresentation>(
			"validateFetalPresentationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_PRESENTATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalPresentation target) {

			}

			@Override
			protected void updateToPass(FetalPresentation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalPresentationOperations.validateFetalPresentationMoodCode(
					(FetalPresentation) objectToTest, diagnostician, map);
			}

		};

		validateFetalPresentationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateFetalPresentationValue() {
			OperationsTestCase<FetalPresentation> validateFetalPresentationValueTestCase = new OperationsTestCase<FetalPresentation>(
			"validateFetalPresentationValue",
			operationsForOCL.getOCLValue("VALIDATE_FETAL_PRESENTATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(FetalPresentation target) {

			}

			@Override
			protected void updateToPass(FetalPresentation target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return FetalPresentationOperations.validateFetalPresentationValue(
					(FetalPresentation) objectToTest, diagnostician, map);
			}

		};

		validateFetalPresentationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends FetalPresentationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FetalPresentation> {
		public FetalPresentation create() {		
			return VsbrFactory.eINSTANCE.createFetalPresentation();
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
	private static class ConstructorTestClass extends FetalPresentationOperations {};
	
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
	
	

	
	
} // FetalPresentationOperations