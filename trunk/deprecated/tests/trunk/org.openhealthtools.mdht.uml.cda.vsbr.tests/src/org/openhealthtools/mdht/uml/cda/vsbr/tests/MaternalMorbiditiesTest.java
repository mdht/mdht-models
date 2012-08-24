
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
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.MaternalMorbiditiesOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Maternal Morbidities</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidities#validateMaternalMorbiditiesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Maternal Morbidities Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MaternalMorbiditiesTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMaternalMorbiditiesTemplateId() {
			OperationsTestCase<MaternalMorbidities> validateMaternalMorbiditiesTemplateIdTestCase = new OperationsTestCase<MaternalMorbidities>(
			"validateMaternalMorbiditiesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidities target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidities target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MaternalMorbiditiesOperations.validateMaternalMorbiditiesTemplateId(
					(MaternalMorbidities) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbiditiesTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMaternalMorbiditiesClassCode() {
			OperationsTestCase<MaternalMorbidities> validateMaternalMorbiditiesClassCodeTestCase = new OperationsTestCase<MaternalMorbidities>(
			"validateMaternalMorbiditiesClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidities target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidities target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MaternalMorbiditiesOperations.validateMaternalMorbiditiesClassCode(
					(MaternalMorbidities) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbiditiesClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMaternalMorbiditiesCode() {
			OperationsTestCase<MaternalMorbidities> validateMaternalMorbiditiesCodeTestCase = new OperationsTestCase<MaternalMorbidities>(
			"validateMaternalMorbiditiesCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidities target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidities target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MaternalMorbiditiesOperations.validateMaternalMorbiditiesCode(
					(MaternalMorbidities) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbiditiesCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMaternalMorbiditiesMoodCode() {
			OperationsTestCase<MaternalMorbidities> validateMaternalMorbiditiesMoodCodeTestCase = new OperationsTestCase<MaternalMorbidities>(
			"validateMaternalMorbiditiesMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidities target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidities target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MaternalMorbiditiesOperations.validateMaternalMorbiditiesMoodCode(
					(MaternalMorbidities) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbiditiesMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateMaternalMorbiditiesValue() {
			OperationsTestCase<MaternalMorbidities> validateMaternalMorbiditiesValueTestCase = new OperationsTestCase<MaternalMorbidities>(
			"validateMaternalMorbiditiesValue",
			operationsForOCL.getOCLValue("VALIDATE_MATERNAL_MORBIDITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MaternalMorbidities target) {

			}

			@Override
			protected void updateToPass(MaternalMorbidities target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MaternalMorbiditiesOperations.validateMaternalMorbiditiesValue(
					(MaternalMorbidities) objectToTest, diagnostician, map);
			}

		};

		validateMaternalMorbiditiesValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends MaternalMorbiditiesOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MaternalMorbidities> {
		public MaternalMorbidities create() {		
			return VsbrFactory.eINSTANCE.createMaternalMorbidities();
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
	private static class ConstructorTestClass extends MaternalMorbiditiesOperations {};
	
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
	
	

	
	
} // MaternalMorbiditiesOperations