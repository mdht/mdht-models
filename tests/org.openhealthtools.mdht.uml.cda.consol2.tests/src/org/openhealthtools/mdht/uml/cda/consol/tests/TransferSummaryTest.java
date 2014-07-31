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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;
import org.openhealthtools.mdht.uml.cda.consol.operations.TransferSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassAssociative;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transfer Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupport(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContact(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryIIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantSupportAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Support Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Associated Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity Scoping Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryParticipantCallbackContactAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Participant Callback Contact Associated Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEventPerformer1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event Performer1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateTransferSummaryDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transfer Summary Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.TransferSummary#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransferSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryId() {
		OperationsTestCase<TransferSummary> validateTransferSummaryIdTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryId",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.setId(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryId(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryCodeP() {
		OperationsTestCase<TransferSummary> validateTransferSummaryCodePTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryCodeP(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE("NotCurrentlyChecked", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected void setDependency(TransferSummary target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.TransferSummaryCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransferSummaryTitle() {
		OperationsTestCase<TransferSummary> validateTransferSummaryTitleTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryTitle",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryTitle(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupport() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupport",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupport(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContact() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContact",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContact(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOf() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOf(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* modified VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP due to inline datatype OCL generation issue
	*/
	@Test
	public void testValidateTransferSummaryIIRoot() {
		OperationsTestCase<TransferSummary> validateTransferSummaryIIRootTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryIIRoot",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.setId(DatatypesFactory.eINSTANCE.createII()); // no root set
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getId().setRoot("HasARoot");
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryIIRoot(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryIIRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityClassCodeP() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityClassCodePTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				// ACCESS is not in the valueSet but we are only checking that the code exists in this specific test
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.ACCESS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.PRS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).setTypeCode(ParticipationType.IND);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantSupportAssociatedEntity() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantSupportAssociatedEntityTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantSupportAssociatedEntity",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_SUPPORT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntity(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantSupportAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getAssociatedPerson().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setClassCode(RoleClassAssociative.ASSIGNED);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityId() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityIdTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityId(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAddr() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAddrTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecomTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setAssociatedPerson(
					CDAFactory.eINSTANCE.createPerson());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY_SCOPING_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).getAssociatedEntity().setScopingOrganization(
					CDAFactory.eINSTANCE.createOrganization());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).setTypeCode(ParticipationType.CALLBCK);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryParticipantCallbackContactAssociatedEntity() {
		OperationsTestCase<TransferSummary> validateTransferSummaryParticipantCallbackContactAssociatedEntityTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryParticipantCallbackContactAssociatedEntity",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_PARTICIPANT_CALLBACK_CONTACT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant1());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getParticipants().get(0).setAssociatedEntity(CDAFactory.eINSTANCE.createAssociatedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntity(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryParticipantCallbackContactAssociatedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityIdTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).getAssignedEntity().getIds().add(
					DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).getAssignedEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerTypeCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerTypeCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setTypeCode(
					x_ServiceEventPerformer.SPRF);
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setTypeCode(
					x_ServiceEventPerformer.PRF);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().get(0).setAssignedEntity(
					CDAFactory.eINSTANCE.createAssignedEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventClassCode() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventClassCodeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventClassCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().setClassCode(ActClassRoot.PCPR);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventClassCode(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().setEffectiveTime(
					DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventEffectiveTime(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEventPerformer1() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventPerformer1TestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEventPerformer1",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT_PERFORMER1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getPerformers().add(
					CDAFactory.eINSTANCE.createPerformer1());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformer1(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventPerformer1TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateTransferSummaryDocumentationOfServiceEvent() {
		OperationsTestCase<TransferSummary> validateTransferSummaryDocumentationOfServiceEventTestCase = new OperationsTestCase<TransferSummary>(
			"validateTransferSummaryDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue("VALIDATE_TRANSFER_SUMMARY_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {
				target.init();
				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());
			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.getDocumentationOfs().get(0).setServiceEvent(CDAFactory.eINSTANCE.createServiceEvent());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEvent(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateTransferSummaryDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<TransferSummary> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<TransferSummary>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransferSummary target) {

			}

			@Override
			protected void updateToPass(TransferSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransferSummaryOperations.validateGeneralHeaderConstraintsTemplateId(
					(TransferSummary) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TransferSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransferSummary> {
		public TransferSummary create() {
			return ConsolFactory.eINSTANCE.createTransferSummary();
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
	private static class ConstructorTestClass extends TransferSummaryOperations {
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

} // TransferSummaryOperations
