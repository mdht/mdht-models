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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianofRecordParticipant2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physicianof Record Participant2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Physicianof Record Participant Assigned Entity Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityHasNationalProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Has National Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Physicianof Record Participant Assigned Entity Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant2 Assigned Entity Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant2#validatePhysicianofRecordParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicianofRecordParticipant2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipant2AssignedEntity() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntity(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonName() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonNameTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonName",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonName(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityPhysicianofRecordParticipantAssignedEntityAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationNameTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	public void testValidatePhysicianofRecordParticipant2AssignedEntityHasNationalProviderId() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityHasNationalProviderIdTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityHasNationalProviderId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2AssignedEntityHasNationalProviderId(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2AssignedEntityHasNationalProviderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPersonTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPerson(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipant2PhysicianofRecordParticipantAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganizationTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipant2AssignedEntityRepresentedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT2_ASSIGNED_ENTITY_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	* @generated
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantTemplateId() {
		OperationsTestCase<PhysicianofRecordParticipant2> validatePhysicianofRecordParticipantTemplateIdTestCase = new OperationsTestCase<PhysicianofRecordParticipant2>(
			"validatePhysicianofRecordParticipantTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return PhysicianofRecordParticipant2Operations.validatePhysicianofRecordParticipantTemplateId(
					(PhysicianofRecordParticipant2) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantTemplateIdTestCase.doValidationTest();
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

} // PhysicianofRecordParticipant2Operations
