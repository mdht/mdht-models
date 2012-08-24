
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
import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.ObstetricProceduresOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Obstetric Procedures</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedures#validateObstetricProceduresValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Obstetric Procedures Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ObstetricProceduresTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateObstetricProceduresTemplateId() {
			OperationsTestCase<ObstetricProcedures> validateObstetricProceduresTemplateIdTestCase = new OperationsTestCase<ObstetricProcedures>(
			"validateObstetricProceduresTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedures target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedures target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ObstetricProceduresOperations.validateObstetricProceduresTemplateId(
					(ObstetricProcedures) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProceduresTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObstetricProceduresClassCode() {
			OperationsTestCase<ObstetricProcedures> validateObstetricProceduresClassCodeTestCase = new OperationsTestCase<ObstetricProcedures>(
			"validateObstetricProceduresClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedures target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedures target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ObstetricProceduresOperations.validateObstetricProceduresClassCode(
					(ObstetricProcedures) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProceduresClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObstetricProceduresCode() {
			OperationsTestCase<ObstetricProcedures> validateObstetricProceduresCodeTestCase = new OperationsTestCase<ObstetricProcedures>(
			"validateObstetricProceduresCode",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedures target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedures target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ObstetricProceduresOperations.validateObstetricProceduresCode(
					(ObstetricProcedures) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProceduresCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObstetricProceduresMoodCode() {
			OperationsTestCase<ObstetricProcedures> validateObstetricProceduresMoodCodeTestCase = new OperationsTestCase<ObstetricProcedures>(
			"validateObstetricProceduresMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedures target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedures target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ObstetricProceduresOperations.validateObstetricProceduresMoodCode(
					(ObstetricProcedures) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProceduresMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateObstetricProceduresValue() {
			OperationsTestCase<ObstetricProcedures> validateObstetricProceduresValueTestCase = new OperationsTestCase<ObstetricProcedures>(
			"validateObstetricProceduresValue",
			operationsForOCL.getOCLValue("VALIDATE_OBSTETRIC_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ObstetricProcedures target) {

			}

			@Override
			protected void updateToPass(ObstetricProcedures target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ObstetricProceduresOperations.validateObstetricProceduresValue(
					(ObstetricProcedures) objectToTest, diagnostician, map);
			}

		};

		validateObstetricProceduresValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends ObstetricProceduresOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ObstetricProcedures> {
		public ObstetricProcedures create() {		
			return VsbrFactory.eINSTANCE.createObstetricProcedures();
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
	private static class ConstructorTestClass extends ObstetricProceduresOperations {};
	
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
	
	

	
	
} // ObstetricProceduresOperations