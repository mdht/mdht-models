
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
import org.openhealthtools.mdht.uml.cda.vsdr.Injury;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrFactory;
import org.openhealthtools.mdht.uml.cda.vsdr.operations.InjuryOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Injury</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury Desc</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Injury Location Role Place Of Injury</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Injury Information Location Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentInjuryInformationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Injury Information Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentWorkAssociationWorkAssociation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Work Association Work Association</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTransportationAssociationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Transportation Association Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.Injury#validateInjuryComponentTransportationRelationshipTransportationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Injury Component Transportation Relationship Transportation Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class InjuryTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryTemplateId() {
			OperationsTestCase<Injury> validateInjuryTemplateIdTestCase = new OperationsTestCase<Injury>(
			"validateInjuryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryTemplateId(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryClassCode() {
			OperationsTestCase<Injury> validateInjuryClassCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryClassCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryCode() {
			OperationsTestCase<Injury> validateInjuryCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryCodeP() {
			OperationsTestCase<Injury> validateInjuryCodePTestCase = new OperationsTestCase<Injury>(
			"validateInjuryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryCodeP(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryMoodCode() {
			OperationsTestCase<Injury> validateInjuryMoodCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryMoodCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryStatusCode() {
			OperationsTestCase<Injury> validateInjuryStatusCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
			
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryStatusCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryStatusCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformation() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformation",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformation(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentWorkAssociation() {
			OperationsTestCase<Injury> validateInjuryComponentWorkAssociationTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentWorkAssociation",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentWorkAssociation(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentWorkAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationAssociation() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationAssociationTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationAssociation",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationAssociation(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationRelationship() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationRelationshipTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationRelationship(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationRelationshipTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDescTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY_DESC__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDesc(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryDescTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddrTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddr(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleAddrTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRoleClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_INJURY_LOCATION_ROLE_PLACE_OF_INJURY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjury(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationInjuryLocationRolePlaceOfInjuryTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationClassCode() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationClassCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationClassCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationCodeP() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationCodePTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationCodeP(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationCode() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationMoodCode() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationMoodCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationMoodCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationText() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationTextTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationText",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
		ED text = DatatypesFactory.eINSTANCE.createED();
		
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationText(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationTextTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationValue() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationValueTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationValue",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
			
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationValue(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationEffectiveTime() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationEffectiveTimeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
					IVL_TS ts = DatatypesFactory .eINSTANCE.createIVL_TS();
					target.setEffectiveTime(ts );								
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationEffectiveTime(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationEffectiveTimeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationInjuryInformationLocationParticipation() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_INJURY_INFORMATION_LOCATION_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationInjuryInformationLocationParticipation(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationInjuryInformationLocationParticipationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentInjuryInformationTypeCode() {
			OperationsTestCase<Injury> validateInjuryComponentInjuryInformationTypeCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentInjuryInformationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_INJURY_INFORMATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentInjuryInformationTypeCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentInjuryInformationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentWorkAssociationWorkAssociationClassCode() {
			OperationsTestCase<Injury> validateInjuryComponentWorkAssociationWorkAssociationClassCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentWorkAssociationWorkAssociationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationClassCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentWorkAssociationWorkAssociationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentWorkAssociationWorkAssociationCodeP() {
			OperationsTestCase<Injury> validateInjuryComponentWorkAssociationWorkAssociationCodePTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentWorkAssociationWorkAssociationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationCodeP(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentWorkAssociationWorkAssociationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentWorkAssociationWorkAssociationCode() {
			OperationsTestCase<Injury> validateInjuryComponentWorkAssociationWorkAssociationCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentWorkAssociationWorkAssociationCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentWorkAssociationWorkAssociationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentWorkAssociationWorkAssociationMoodCode() {
			OperationsTestCase<Injury> validateInjuryComponentWorkAssociationWorkAssociationMoodCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentWorkAssociationWorkAssociationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationMoodCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentWorkAssociationWorkAssociationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateInjuryComponentWorkAssociationWorkAssociationValue() {
			OperationsTestCase<Injury> validateInjuryComponentWorkAssociationWorkAssociationValueTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentWorkAssociationWorkAssociationValue",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociationValue(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentWorkAssociationWorkAssociationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentWorkAssociationTypeCode() {
			OperationsTestCase<Injury> validateInjuryComponentWorkAssociationTypeCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentWorkAssociationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentWorkAssociationTypeCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentWorkAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentWorkAssociationWorkAssociation() {
			OperationsTestCase<Injury> validateInjuryComponentWorkAssociationWorkAssociationTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentWorkAssociationWorkAssociation",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_WORK_ASSOCIATION_WORK_ASSOCIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentWorkAssociationWorkAssociation(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentWorkAssociationWorkAssociationTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationAssociationTransportationAssociationClassCode() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationAssociationTransportationAssociationClassCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationAssociationTransportationAssociationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationClassCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationAssociationTransportationAssociationClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationAssociationTransportationAssociationCodeP() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationAssociationTransportationAssociationCodePTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationAssociationTransportationAssociationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationCodeP(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationAssociationTransportationAssociationCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationAssociationTransportationAssociationCode() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationAssociationTransportationAssociationCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationAssociationTransportationAssociationCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationAssociationTransportationAssociationCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationAssociationTransportationAssociationMoodCode() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationAssociationTransportationAssociationMoodCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationMoodCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationAssociationTransportationAssociationMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateInjuryComponentTransportationAssociationTransportationAssociationValue() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationAssociationTransportationAssociationValueTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationAssociationTransportationAssociationValue",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TRANSPORTATION_ASSOCIATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
			
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationAssociationTransportationAssociationValue(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationAssociationTransportationAssociationValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationAssociationTypeCode() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationAssociationTypeCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationAssociationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationAssociationTypeCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationAssociationTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationRelationshipTransportationRelationshipClassCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationRelationshipTransportationRelationshipCodePTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeP(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationRelationshipTransportationRelationshipCodePTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationRelationshipTransportationRelationshipCode() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationRelationshipTransportationRelationshipCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationRelationshipTransportationRelationshipCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationRelationshipTransportationRelationshipMoodCodeTestCase.doValidationTest();
}		




/**
*
* @generated not
*/
@Test

 
									
public void testValidateInjuryComponentTransportationRelationshipTransportationRelationshipValue() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationRelationshipTransportationRelationshipValueTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationRelationshipTransportationRelationshipValue",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
			
				CD value = DatatypesFactory.eINSTANCE.createCD();
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationshipValue(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationRelationshipTransportationRelationshipValueTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationRelationshipTypeCode() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationRelationshipTypeCodeTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationRelationshipTypeCode(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationRelationshipTypeCodeTestCase.doValidationTest();
}		




/**
*
* @generated
*/
@Test

 
									
public void testValidateInjuryComponentTransportationRelationshipTransportationRelationship() {
			OperationsTestCase<Injury> validateInjuryComponentTransportationRelationshipTransportationRelationshipTestCase = new OperationsTestCase<Injury>(
			"validateInjuryComponentTransportationRelationshipTransportationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_INJURY_COMPONENT_TRANSPORTATION_RELATIONSHIP_TRANSPORTATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Injury target) {

			}

			@Override
			protected void updateToPass(Injury target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return InjuryOperations.validateInjuryComponentTransportationRelationshipTransportationRelationship(
					(Injury) objectToTest, diagnostician, map);
			}

		};

		validateInjuryComponentTransportationRelationshipTransportationRelationshipTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends InjuryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Injury> {
		public Injury create() {		
			return VsdrFactory.eINSTANCE.createInjury();
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
	private static class ConstructorTestClass extends InjuryOperations {};
	
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
	
	

	
	
} // InjuryOperations