
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
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrFactory;
import org.openhealthtools.mdht.uml.cda.vsbr.operations.LaborandDeliveryInformationOperations;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationAttendantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attendant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationHomeBirthPlanAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Home Birth Plan Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationTransferAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Transfer Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMaternalMorbidities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Morbidities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Characteristicsof Laborand Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationLaborOnsets(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Labor Onsets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationObstetricProcedures(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Obstetric Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationAttemptedForcepsDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attempted Forceps Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationAttemptedVacuumExtraction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attempted Vacuum Extraction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationFetalPresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Fetal Presentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationRouteandMethodofDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Routeand Methodof Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationBodyWeightatDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Body Weightat Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Hysterotomy Hysterectomy Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getMaternalMorbiditiess() <em>Get Maternal Morbiditiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getCharacteristicsofLaborandDeliveries() <em>Get Characteristicsof Laborand Deliveries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getLaborOnsetss() <em>Get Labor Onsetss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getObstetricProceduress() <em>Get Obstetric Proceduress</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getAttemptedForcepsDelivery() <em>Get Attempted Forceps Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getAttemptedVacuumExtraction() <em>Get Attempted Vacuum Extraction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getFetalPresentation() <em>Get Fetal Presentation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getRouteandMethodofDelivery() <em>Get Routeand Methodof Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getBodyWeightatDelivery() <em>Get Body Weightat Delivery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class LaborandDeliveryInformationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationTemplateId() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationTemplateIdTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationTemplateId(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationClassCode() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationClassCodeTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationClassCode(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationCode() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationCodeTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationCode",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCode(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationMoodCode() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationMoodCodeTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMoodCode(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationParticipant() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationParticipantTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationParticipant",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationParticipant(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationParticipantTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationPerformer() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationPerformerTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationPerformer",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationPerformer(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationPerformerTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationAttendantParticipation() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationAttendantParticipationTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationAttendantParticipation",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationAttendantParticipation(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationAttendantParticipationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationHomeBirthPlanAssociation() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationHomeBirthPlanAssociationTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationHomeBirthPlanAssociation",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationHomeBirthPlanAssociation(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationHomeBirthPlanAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationTransferAssociation() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationTransferAssociationTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationTransferAssociation",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_TRANSFER_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationTransferAssociation(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationTransferAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationEntryRelationship() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationEntryRelationshipTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationEntryRelationship(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationEntryRelationshipTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationMaternalMorbidities() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationMaternalMorbiditiesTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationMaternalMorbidities",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationMaternalMorbidities(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationMaternalMorbiditiesTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationCharacteristicsofLaborandDelivery() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationCharacteristicsofLaborandDeliveryTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationCharacteristicsofLaborandDeliveryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationLaborOnsets() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationLaborOnsetsTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationLaborOnsets",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationLaborOnsets(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationLaborOnsetsTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationObstetricProcedures() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationObstetricProceduresTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationObstetricProcedures",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_OBSTETRIC_PROCEDURES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationObstetricProcedures(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationObstetricProceduresTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationAttemptedForcepsDelivery() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationAttemptedForcepsDeliveryTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationAttemptedForcepsDelivery",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_FORCEPS_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationAttemptedForcepsDelivery(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationAttemptedForcepsDeliveryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationAttemptedVacuumExtraction() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationAttemptedVacuumExtractionTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationAttemptedVacuumExtraction",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTEMPTED_VACUUM_EXTRACTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationAttemptedVacuumExtraction(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationAttemptedVacuumExtractionTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationFetalPresentation() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationFetalPresentationTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationFetalPresentation",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_FETAL_PRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationFetalPresentation(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationFetalPresentationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationRouteandMethodofDelivery() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationRouteandMethodofDeliveryTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationRouteandMethodofDelivery",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_ROUTEAND_METHODOF_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationRouteandMethodofDelivery(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationRouteandMethodofDeliveryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationBodyWeightatDelivery() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationBodyWeightatDeliveryTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationBodyWeightatDelivery",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_BODY_WEIGHTAT_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationBodyWeightatDelivery(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationBodyWeightatDeliveryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateLaborandDeliveryInformationHysterotomyHysterectomyAssociation() {
			OperationsTestCase<LaborandDeliveryInformation> validateLaborandDeliveryInformationHysterotomyHysterectomyAssociationTestCase = new OperationsTestCase<LaborandDeliveryInformation>(
			"validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation",
			operationsForOCL.getOCLValue("VALIDATE_LABORAND_DELIVERY_INFORMATION_HYSTEROTOMY_HYSTERECTOMY_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(LaborandDeliveryInformation target) {

			}

			@Override
			protected void updateToPass(LaborandDeliveryInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return LaborandDeliveryInformationOperations.validateLaborandDeliveryInformationHysterotomyHysterectomyAssociation(
					(LaborandDeliveryInformation) objectToTest, diagnostician, map);
			}

		};

		validateLaborandDeliveryInformationHysterotomyHysterectomyAssociationTestCase.doValidationTest();
}		






/**
*
* @generated
*/
@Test

 
									
public void testGetMaternalMorbiditiess() {


LaborandDeliveryInformation target = objectFactory.create();
target.getMaternalMorbiditiess();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetCharacteristicsofLaborandDeliveries() {


LaborandDeliveryInformation target = objectFactory.create();
target.getCharacteristicsofLaborandDeliveries();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetLaborOnsetss() {


LaborandDeliveryInformation target = objectFactory.create();
target.getLaborOnsetss();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetObstetricProceduress() {


LaborandDeliveryInformation target = objectFactory.create();
target.getObstetricProceduress();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAttemptedForcepsDelivery() {


LaborandDeliveryInformation target = objectFactory.create();
target.getAttemptedForcepsDelivery();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAttemptedVacuumExtraction() {


LaborandDeliveryInformation target = objectFactory.create();
target.getAttemptedVacuumExtraction();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetFetalPresentation() {


LaborandDeliveryInformation target = objectFactory.create();
target.getFetalPresentation();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetRouteandMethodofDelivery() {


LaborandDeliveryInformation target = objectFactory.create();
target.getRouteandMethodofDelivery();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetBodyWeightatDelivery() {


LaborandDeliveryInformation target = objectFactory.create();
target.getBodyWeightatDelivery();



}




/**
*
* @generated
*/
	private static class OperationsForOCL extends LaborandDeliveryInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LaborandDeliveryInformation> {
		public LaborandDeliveryInformation create() {		
			return VsbrFactory.eINSTANCE.createLaborandDeliveryInformation();
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
	private static class ConstructorTestClass extends LaborandDeliveryInformationOperations {};
	
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
	
	

	
	
} // LaborandDeliveryInformationOperations