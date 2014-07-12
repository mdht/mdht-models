
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsdr.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.DeathCertificationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Death Certification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role Certifying Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DeathCertification#validateDeathCertificationCertificationPerformerCertifierRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Death Certification Certification Performer Certifier Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DeathCertificationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationTemplateId() {
			OperationsTestCase<DeathCertification> validateDeathCertificationTemplateIdTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationTemplateId(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationClassCode() {
			OperationsTestCase<DeathCertification> validateDeathCertificationClassCodeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationClassCode(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCode() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCodeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCode(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationEffectiveTime() {
			OperationsTestCase<DeathCertification> validateDeathCertificationEffectiveTimeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationEffectiveTime(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationMoodCode() {
			OperationsTestCase<DeathCertification> validateDeathCertificationMoodCodeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationMoodCode(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformer() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformer",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformer(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCodeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCode(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCodeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCode(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyDeterminerCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyNameTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyName(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyNameTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleAddr() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleAddrTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleAddr(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleAddrTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleClassCode() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleClassCodeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleClassCode(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleCode() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleCodeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCode(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleCodeP() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleCodePTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCodeP(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleId() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleIdTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleId",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleId(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE_CERTIFYING_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRoleCertifyingParty(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleCertifyingPartyTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerTypeCode() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerTypeCodeTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerTypeCode(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateDeathCertificationCertificationPerformerCertifierRole() {
			OperationsTestCase<DeathCertification> validateDeathCertificationCertificationPerformerCertifierRoleTestCase = new OperationsTestCase<DeathCertification>(
			"validateDeathCertificationCertificationPerformerCertifierRole",
			operationsForOCL.getOCLValue("VALIDATE_DEATH_CERTIFICATION_CERTIFICATION_PERFORMER_CERTIFIER_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DeathCertification target) {

			}

			@Override
			protected void updateToPass(DeathCertification target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DeathCertificationOperations.validateDeathCertificationCertificationPerformerCertifierRole(
					(DeathCertification) objectToTest, diagnostician, map);
			}

		};

		validateDeathCertificationCertificationPerformerCertifierRoleTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends DeathCertificationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DeathCertification> {
		public DeathCertification create() {		
			return VsdrFactory.eINSTANCE.createDeathCertification();
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
	private static class ConstructorTestClass extends DeathCertificationOperations {};
	
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
	
	

	
	
} // DeathCertificationOperations