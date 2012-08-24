
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
import org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.RiskFactorsOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Risk Factors</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.RiskFactors#validateRiskFactorsEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Risk Factors Entry Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class RiskFactorsTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateRiskFactorsTemplateId() {
			OperationsTestCase<RiskFactors> validateRiskFactorsTemplateIdTestCase = new OperationsTestCase<RiskFactors>(
			"validateRiskFactorsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RISK_FACTORS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RiskFactors target) {

			}

			@Override
			protected void updateToPass(RiskFactors target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RiskFactorsOperations.validateRiskFactorsTemplateId(
					(RiskFactors) objectToTest, diagnostician, map);
			}

		};

		validateRiskFactorsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateRiskFactorsClassCode() {
			OperationsTestCase<RiskFactors> validateRiskFactorsClassCodeTestCase = new OperationsTestCase<RiskFactors>(
			"validateRiskFactorsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_FACTORS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RiskFactors target) {

			}

			@Override
			protected void updateToPass(RiskFactors target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RiskFactorsOperations.validateRiskFactorsClassCode(
					(RiskFactors) objectToTest, diagnostician, map);
			}

		};

		validateRiskFactorsClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateRiskFactorsCode() {
			OperationsTestCase<RiskFactors> validateRiskFactorsCodeTestCase = new OperationsTestCase<RiskFactors>(
			"validateRiskFactorsCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_FACTORS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RiskFactors target) {

			}

			@Override
			protected void updateToPass(RiskFactors target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RiskFactorsOperations.validateRiskFactorsCode(
					(RiskFactors) objectToTest, diagnostician, map);
			}

		};

		validateRiskFactorsCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateRiskFactorsMoodCode() {
			OperationsTestCase<RiskFactors> validateRiskFactorsMoodCodeTestCase = new OperationsTestCase<RiskFactors>(
			"validateRiskFactorsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RISK_FACTORS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RiskFactors target) {

			}

			@Override
			protected void updateToPass(RiskFactors target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RiskFactorsOperations.validateRiskFactorsMoodCode(
					(RiskFactors) objectToTest, diagnostician, map);
			}

		};

		validateRiskFactorsMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateRiskFactorsValue() {
			OperationsTestCase<RiskFactors> validateRiskFactorsValueTestCase = new OperationsTestCase<RiskFactors>(
			"validateRiskFactorsValue",
			operationsForOCL.getOCLValue("VALIDATE_RISK_FACTORS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RiskFactors target) {

			}

			@Override
			protected void updateToPass(RiskFactors target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RiskFactorsOperations.validateRiskFactorsValue(
					(RiskFactors) objectToTest, diagnostician, map);
			}

		};

		validateRiskFactorsValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateRiskFactorsEntryRelationship() {
			OperationsTestCase<RiskFactors> validateRiskFactorsEntryRelationshipTestCase = new OperationsTestCase<RiskFactors>(
			"validateRiskFactorsEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_RISK_FACTORS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(RiskFactors target) {

			}

			@Override
			protected void updateToPass(RiskFactors target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return RiskFactorsOperations.validateRiskFactorsEntryRelationship(
					(RiskFactors) objectToTest, diagnostician, map);
			}

		};

		validateRiskFactorsEntryRelationshipTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends RiskFactorsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RiskFactors> {
		public RiskFactors create() {		
			return VsbrFactory.eINSTANCE.createRiskFactors();
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
	private static class ConstructorTestClass extends RiskFactorsOperations {};
	
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
	
	

	
	
} // RiskFactorsOperations