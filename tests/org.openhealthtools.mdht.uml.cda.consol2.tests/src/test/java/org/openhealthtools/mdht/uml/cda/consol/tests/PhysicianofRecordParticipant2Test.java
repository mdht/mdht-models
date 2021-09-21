/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.AssignedEntity;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Organization;
import org.eclipse.mdht.uml.cda.Person;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianofRecordParticipant2Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physicianof Record Participant2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2TemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name US Realm Person Name Mixed Content</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name Family</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name Given</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name Prefix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Assigned Person General Header Constraints US Realm Person Name Suffix</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has National Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicianofRecordParticipant2Test extends CDAValidationTest {

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidatePhysicianofRecordParticipant2AssignedEntity() {
	// OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityTestCase = new
	// OperationsTestCase<PhysicianofRecordParticipant2>(
	// "validatePhysicianofRecordParticipant2AssignedEntity",
	// operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(PhysicianofRecordParticipant2 target) {
	// target.init();
	//
	// }
	//
	// @Override
	// protected void updateToPass(PhysicianofRecordParticipant2 target) {
	// AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
	// target.setAssignedEntity(ae);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntity(
	// (PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validatePhysicianofRecordParticipant2AssignedEntityTestCase.doValidationTest();
	// }

	/**
	*
	* @generated
	*/
	@Test

	public void testValidatePhysicianofRecordParticipant2TemplateId() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2TemplateIdTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2TemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2TemplateId(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2TemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContentTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_US_REALM_PERSON_NAME_MIXED_CONTENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person p = CDAFactory.eINSTANCE.createPerson();
				PN pn = DatatypesFactory.eINSTANCE.createPN();
				// pn.addGiven("GIVEN");
				p.getNames().add(pn);
				ae.setAssignedPerson(p);
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getAssignedPerson().getNames().get(0).addText("PERSON NAME");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContent(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUSRealmPersonNameMixedContentTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUseTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person p = CDAFactory.eINSTANCE.createPerson();
				PN pn = DatatypesFactory.eINSTANCE.createPN();
				pn.addGiven("GIVEN");
				pn.getUses().add(null);
				p.getNames().add(pn);
				ae.setAssignedPerson(p);
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getAssignedPerson().getNames().get(0).getUses().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUse(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamilyTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_FAMILY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person p = CDAFactory.eINSTANCE.createPerson();
				PN pn = DatatypesFactory.eINSTANCE.createPN();
				pn.addFamily("FAMILY");
				p.getNames().add(pn);
				ae.setAssignedPerson(p);
				target.setAssignedEntity(ae);

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getAssignedPerson().getNames().get(0).getFamilies().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamily(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameFamilyTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGivenTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_GIVEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person p = CDAFactory.eINSTANCE.createPerson();
				PN pn = DatatypesFactory.eINSTANCE.createPN();
				pn.addGiven("GIVEN");
				p.getNames().add(pn);
				ae.setAssignedPerson(p);
				target.setAssignedEntity(ae);

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getAssignedPerson().getNames().get(0).getGivens().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGiven(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameGivenTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test

	public void testValidatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefixTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_PREFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person p = CDAFactory.eINSTANCE.createPerson();
				PN pn = DatatypesFactory.eINSTANCE.createPN();
				pn.addPrefix("PREFIX");
				p.getNames().add(pn);
				ae.setAssignedPerson(p);
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getAssignedPerson().getNames().get(0).getPrefixes().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefix(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNamePrefixTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test

	public void testValidatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffixTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_ASSIGNED_PERSON_GENERAL_HEADER_CONSTRAINTS_US_REALM_PERSON_NAME_SUFFIX__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person p = CDAFactory.eINSTANCE.createPerson();
				PN pn = DatatypesFactory.eINSTANCE.createPN();
				pn.addSuffix("SUFFIX");
				p.getNames().add(pn);
				ae.setAssignedPerson(p);
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getAssignedPerson().getNames().get(0).getSuffixes().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffix(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityAssignedPersonGeneralHeaderConstraintsUSRealmPersonNameSuffixTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationNameTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
				Organization o = CDAFactory.eINSTANCE.createOrganization();
				ae.getRepresentedOrganizations().add(o);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getRepresentedOrganizations().get(0).getNames().add(
					DatatypesFactory.eINSTANCE.createON());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				Organization ro = CDAFactory.eINSTANCE.createOrganization();
				AssignedEntity ae = target.getAssignedEntity();
				ae.getRepresentedOrganizations().add(ro);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntity() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipantAssignedEntityTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipantAssignedEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantAssignedEntity(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityAssignedPersonName() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipantAssignedEntityAssignedPersonNameTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
				Person p = CDAFactory.eINSTANCE.createPerson();
				ae.setAssignedPerson(p);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getAssignedPerson().getNames().add(DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderIdTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				target.getAssignedEntity().getIds().add(DatatypesFactory.eINSTANCE.createII("2.16.840.1.113883.4.6"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityAssignedPerson() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipantAssignedEntityAssignedPersonTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipantAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue(
				"VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant2 target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant2 target) {
				Person ap = CDAFactory.eINSTANCE.createPerson();
				target.getAssignedEntity().setAssignedPerson(ap);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicianofRecordParticipant2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicianofRecordParticipant2> {
		@Override
		public PhysicianofRecordParticipant2 create() {
			return ConsolFactory.eINSTANCE.createPhysicianofRecordParticipant2();
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
	private static class ConstructorTestClass extends PhysicianofRecordParticipant2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PhysicianofRecordParticipant2Operations
