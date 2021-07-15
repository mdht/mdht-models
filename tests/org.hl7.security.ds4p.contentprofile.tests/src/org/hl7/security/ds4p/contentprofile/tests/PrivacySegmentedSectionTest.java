
/**
 */
package org.hl7.security.ds4p.contentprofile.tests;


import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.hl7.security.ds4p.contentprofile.CONTENTPROFILEFactory;
import org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection;

import org.hl7.security.ds4p.contentprofile.operations.PrivacySegmentedSectionOperations;

import org.junit.Test;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Privacy Segmented Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection#validatePrivacySegmentedSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Template Id</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection#validatePrivacySegmentedSectionConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Confidentiality Code</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection#validatePrivacySegmentedSectionConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Confidentiality Code P</em>}</li>
 *   <li>{@link org.hl7.security.ds4p.contentprofile.PrivacySegmentedSection#validatePrivacySegmentedSectionAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Privacy Segmented Section Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PrivacySegmentedSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePrivacySegmentedSectionTemplateId() {
			OperationsTestCase<PrivacySegmentedSection> validatePrivacySegmentedSectionTemplateIdTestCase = new OperationsTestCase<PrivacySegmentedSection>(
			"validatePrivacySegmentedSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_SEGMENTED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrivacySegmentedSection target) {

			}

			@Override
			protected void updateToPass(PrivacySegmentedSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrivacySegmentedSectionOperations.validatePrivacySegmentedSectionTemplateId(
					(PrivacySegmentedSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacySegmentedSectionTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePrivacySegmentedSectionConfidentialityCode() {
			OperationsTestCase<PrivacySegmentedSection> validatePrivacySegmentedSectionConfidentialityCodeTestCase = new OperationsTestCase<PrivacySegmentedSection>(
			"validatePrivacySegmentedSectionConfidentialityCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrivacySegmentedSection target) {

			}

			@Override
			protected void updateToPass(PrivacySegmentedSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrivacySegmentedSectionOperations.validatePrivacySegmentedSectionConfidentialityCode(
					(PrivacySegmentedSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacySegmentedSectionConfidentialityCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePrivacySegmentedSectionConfidentialityCodeP() {
			OperationsTestCase<PrivacySegmentedSection> validatePrivacySegmentedSectionConfidentialityCodePTestCase = new OperationsTestCase<PrivacySegmentedSection>(
			"validatePrivacySegmentedSectionConfidentialityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_SEGMENTED_SECTION_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrivacySegmentedSection target) {

			}

			@Override
			protected void updateToPass(PrivacySegmentedSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrivacySegmentedSectionOperations.validatePrivacySegmentedSectionConfidentialityCodeP(
					(PrivacySegmentedSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacySegmentedSectionConfidentialityCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePrivacySegmentedSectionAuthor() {
			OperationsTestCase<PrivacySegmentedSection> validatePrivacySegmentedSectionAuthorTestCase = new OperationsTestCase<PrivacySegmentedSection>(
			"validatePrivacySegmentedSectionAuthor",
			operationsForOCL.getOCLValue("VALIDATE_PRIVACY_SEGMENTED_SECTION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PrivacySegmentedSection target) {

			}

			@Override
			protected void updateToPass(PrivacySegmentedSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PrivacySegmentedSectionOperations.validatePrivacySegmentedSectionAuthor(
					(PrivacySegmentedSection) objectToTest, diagnostician, map);
			}

		};

		validatePrivacySegmentedSectionAuthorTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PrivacySegmentedSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrivacySegmentedSection> {
		public PrivacySegmentedSection create() {		
			return CONTENTPROFILEFactory.eINSTANCE.createPrivacySegmentedSection();
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
	private static class ConstructorTestClass extends PrivacySegmentedSectionOperations {};
	
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
	
	

	
	
} // PrivacySegmentedSectionOperations