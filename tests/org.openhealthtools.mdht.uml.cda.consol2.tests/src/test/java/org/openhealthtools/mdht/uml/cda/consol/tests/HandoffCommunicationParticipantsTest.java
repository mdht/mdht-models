/*******************************************************************************
 * Copyright (c) 2014, 2015 Dan Brown and others.
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
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.Participant2;
import org.eclipse.mdht.uml.cda.ParticipantRole;
import org.eclipse.mdht.uml.cda.PlayingEntity;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.AD;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.operations.HandoffCommunicationParticipantsOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Handoff Communication Participants</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants#validateHandoffCommunicationParticipantsParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Handoff Communication Participants Participant Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HandoffCommunicationParticipantsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsTemplateId() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsTemplateIdTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsTemplateId(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsClassCode() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsClassCodeTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsClassCode(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsMoodCode() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsMoodCodeTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsMoodCode(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsCodeP() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsCodePTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsCodeP", operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsCodeP(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsCode() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsCodeTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsCode", operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();

			}

			@Override
			protected void setDependency(HandoffCommunicationParticipants target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipantsCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsCode(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsStatusCode() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsStatusCodeTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsStatusCode(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsStatusCodeP() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsStatusCodePTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsStatusCodeP(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsEffectiveTime() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsEffectiveTimeTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsEffectiveTime(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipant() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {

			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipant(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsAuthorParticipation() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsAuthorParticipationTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsAuthorParticipation",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsAuthorParticipation(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityNameTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityName(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipantParticipantRoleId() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantParticipantRoleIdTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipantParticipantRoleId",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getParticipants().get(0).getParticipantRole().getIds().add(id);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipantParticipantRoleId(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantParticipantRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantParticipantRoleCodePTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.getParticipants().get(0).getParticipantRole().setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeP(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantParticipantRoleCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipantParticipantRoleCode() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipantParticipantRoleCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCode("163W00000X");
				ce.setCodeSystem("2.16.840.1.113883.6.101");
				target.getParticipants().get(0).getParticipantRole().setCode(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipantParticipantRoleCode(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantParticipantRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipantParticipantRoleAddr() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantParticipantRoleAddrTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				AD addr = DatatypesFactory.eINSTANCE.createAD();
				target.getParticipants().get(0).getParticipantRole().getAddrs().add(addr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipantParticipantRoleAddr(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantParticipantRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(pe);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntity(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipantTypeCode() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantTypeCodeTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipantTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				target.getParticipants().get(0).setTypeCode(ParticipationType.IRCP);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipantTypeCode(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHandoffCommunicationParticipantsParticipantParticipantRole() {
		OperationsTestCase<HandoffCommunicationParticipants> validateHandoffCommunicationParticipantsParticipantParticipantRoleTestCase = new OperationsTestCase<HandoffCommunicationParticipants>(
			"validateHandoffCommunicationParticipantsParticipantParticipantRole",
			operationsForOCL.getOCLValue(
				"VALIDATE_HANDOFF_COMMUNICATION_PARTICIPANTS_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HandoffCommunicationParticipants target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(HandoffCommunicationParticipants target) {
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				target.getParticipants().get(0).setParticipantRole(pr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HandoffCommunicationParticipantsOperations.validateHandoffCommunicationParticipantsParticipantParticipantRole(
					(HandoffCommunicationParticipants) objectToTest, diagnostician, map);
			}

		};

		validateHandoffCommunicationParticipantsParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HandoffCommunicationParticipantsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HandoffCommunicationParticipants> {
		public HandoffCommunicationParticipants create() {
			return ConsolFactory.eINSTANCE.createHandoffCommunicationParticipants();
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
	private static class ConstructorTestClass extends HandoffCommunicationParticipantsOperations {
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

} // HandoffCommunicationParticipantsOperations
