
/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;

import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;

import org.openhealthtools.mdht.uml.cda.vsdr.operations.PronouncingDeathOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pronouncing Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role Pronouncing Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.PronouncingDeath#validatePronouncingDeathPronouncerPronouncerRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pronouncing Death Pronouncer Pronouncer Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PronouncingDeathTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathTemplateId() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathTemplateIdTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathTemplateId(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathClassCode() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathClassCodeTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathClassCode(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathMoodCode() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathMoodCodeTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathMoodCode(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathCode() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathCodeTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathCode",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathCode(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathEffectiveTime() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathEffectiveTimeTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathEffectiveTime(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncer() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncer",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncer(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCodeTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCode(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCodeTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCode(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyDeterminerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyNameTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyName(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncerPronouncerRoleClassCode() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerPronouncerRoleClassCodeTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncerPronouncerRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRoleClassCode(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerPronouncerRoleClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncerPronouncerRoleId() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerPronouncerRoleIdTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncerPronouncerRoleId",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRoleId(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerPronouncerRoleIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncerPronouncerRolePronouncingParty() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncerPronouncerRolePronouncingParty",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE_PRONOUNCING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRolePronouncingParty(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerPronouncerRolePronouncingPartyTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncerTypeCode() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerTypeCodeTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncerTypeCode(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidatePronouncingDeathPronouncerPronouncerRole() {
			OperationsTestCase<PronouncingDeath> validatePronouncingDeathPronouncerPronouncerRoleTestCase = new OperationsTestCase<PronouncingDeath>(
			"validatePronouncingDeathPronouncerPronouncerRole",
			operationsForOCL.getOCLValue("VALIDATE_PRONOUNCING_DEATH_PRONOUNCER_PRONOUNCER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PronouncingDeath target) {

			}

			@Override
			protected void updateToPass(PronouncingDeath target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}
			
		 
			

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PronouncingDeathOperations.validatePronouncingDeathPronouncerPronouncerRole(
					(PronouncingDeath) objectToTest, diagnostician, map);
			}

		};

		validatePronouncingDeathPronouncerPronouncerRoleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends PronouncingDeathOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PronouncingDeath> {
		@Override
		public PronouncingDeath create() {		
			return VsdrFactory.eINSTANCE.createPronouncingDeath();
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
	private static class ConstructorTestClass extends PronouncingDeathOperations {};
	
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
	
	

	
	
} // PronouncingDeathOperations