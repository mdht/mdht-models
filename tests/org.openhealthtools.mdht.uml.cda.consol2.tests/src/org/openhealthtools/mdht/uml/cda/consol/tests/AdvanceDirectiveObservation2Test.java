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
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2Value(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Verifier Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Advance Directive Observation Verifier Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Custodian Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Advance Directive Observation Custodian Custodian Role Custodian Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Custodian Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Advance Directive Observation Custodian Custodian Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Advance Directive Observation Custodian Custodian Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Custodian Advance Directive Observation Custodian Custodian Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Advance Directive Observation Custodian Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Advance Directive Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation2 Advance Directive Observation Reference External Document</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationVerifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceExternalDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation2#validateAdvanceDirectiveObservationReferenceExternalDocumentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2Value() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2ValueTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2Value",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2Value(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2ValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2IVLTSLow() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2IVLTSLowTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2IVLTSLow(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);

				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);

				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("63161005", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityNameTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);

				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityName(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRoleCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setCode(DatatypesFactory.eINSTANCE.createCE());

				p2.setParticipantRole(pr);
				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRoleCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRoleCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setCode(DatatypesFactory.eINSTANCE.createCE("notCurrentlyChecked", "2.16.840.1.113883.6.101"));

				p2.setParticipantRole(pr);
				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRoleAddr() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRoleAddrTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				p2.setParticipantRole(pr);
				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRoleAddr(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_VERIFIER_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				p2.setParticipantRole(pr);
				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntity(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2VerifierParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRole() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRole(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2AdvanceDirectiveObservationVerifierParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().setCode(
					DatatypesFactory.eINSTANCE.createCE("63161005", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleCustodianEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityNameTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().getNames().add(
					DatatypesFactory.eINSTANCE.createPN());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().setCode(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianCustodianRoleCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianCustodianRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_CUSTODIAN_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().setCode(
					DatatypesFactory.eINSTANCE.createCE("NotCurrentlyChecked", "2.16.840.1.113883.5.111"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianCustodianRoleCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianCustodianRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleAddr() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleAddrTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().getAddrs().add(
					DatatypesFactory.eINSTANCE.createAD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleAddr(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleTelecom() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleTelecomTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().getTelecoms().add(
					DatatypesFactory.eINSTANCE.createTEL());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleTelecom(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRolePlayingEntityTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(
					CDAFactory.eINSTANCE.createPlayingEntity());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2CustodianAdvanceDirectiveObservationCustodianCustodianRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianRole() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianRole",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianRole(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2AdvanceDirectiveObservationCustodianRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getReferences().clear();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				ref.setTypeCode(x_ActRelationshipExternalReference.REFR);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocumentTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION2_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();

				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getReferences().clear();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocument(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservation2AdvanceDirectiveObservationReferenceExternalDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationTemplateId(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCodeP(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCode() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getCode().setCodeSystem(SNOMEDCT_ID);
				target.getCode().setCode("281789004");
			}

			@Override
			protected void setDependency(AdvanceDirectiveObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCode(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationEffectiveTime() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationEffectiveTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationEffectiveTime(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifier() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationVerifierTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationVerifier",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationVerifier(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodian() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationCustodianTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationCustodian",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationCustodian(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReference() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReference",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReference(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setMediaType(null);
				ed.setText(text);

				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getReferences().clear();

				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setMediaType("JPEG");
				ed.setText(text);
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentTextReference() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceExternalDocumentTextReferenceTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ed.setText(DatatypesFactory.eINSTANCE.createED());
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getReferences().clear();

				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setReference(DatatypesFactory.eINSTANCE.createTEL());
				ed.setText(text);
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentId() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceExternalDocumentIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getReferences().clear();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ed.getIds().add(DatatypesFactory.eINSTANCE.createII());
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentId(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentText() {
		OperationsTestCase<AdvanceDirectiveObservation2> validateAdvanceDirectiveObservationReferenceExternalDocumentTextTestCase = new OperationsTestCase<AdvanceDirectiveObservation2>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentText",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation2 target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation2 target) {
				target.getReferences().clear();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ed.setText(DatatypesFactory.eINSTANCE.createED());
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation2Operations.validateAdvanceDirectiveObservationReferenceExternalDocumentText(
					(AdvanceDirectiveObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservation2> {
		public AdvanceDirectiveObservation2 create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation2();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservation2Operations {
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

} // AdvanceDirectiveObservation2Operations
