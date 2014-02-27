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
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.DrugMonitoringActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Monitoring Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActParticipantParticipantRolePlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Participant Participant Role Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActParticipantParticipantRolePlayingEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Participant Participant Role Playing Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActParticipantParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Participant Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActParticipantParticipantRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Participant Participant Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringAct#validateDrugMonitoringActParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Monitoring Act Participant Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DrugMonitoringActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugMonitoringActTemplateId() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActTemplateIdTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActTemplateId(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugMonitoringActClassCode() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActClassCodeTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActClassCode(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugMonitoringActMoodCode() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActMoodCodeTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActMoodCode(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActId() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActIdTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActId",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();
				II iiID = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(iiID);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActId(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugMonitoringActCodeP() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActCodePTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActCodeP(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugMonitoringActCode() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActCodeTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();

			}

			@Override
			protected void setDependency(DrugMonitoringAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.DrugMonitoringActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActCode(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugMonitoringActStatusCode() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActStatusCodeTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActStatusCode(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugMonitoringActEffectiveTime() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActEffectiveTimeTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActEffectiveTime(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActParticipant() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActParticipantTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActParticipant",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {

			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActParticipant(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActParticipantParticipantRolePlayingEntityClassCode() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActParticipantParticipantRolePlayingEntityClassCodeTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActParticipantParticipantRolePlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pRole.setPlayingEntity(pe);
			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.getTemplateIds().clear();
				target.getParticipants().clear();
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pRole.setPlayingEntity(pe);
				pe.setClassCode(EntityClassRoot.PSN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRolePlayingEntityClassCode(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActParticipantParticipantRolePlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActParticipantParticipantRolePlayingEntityName() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActParticipantParticipantRolePlayingEntityNameTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActParticipantParticipantRolePlayingEntityName",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pRole.setPlayingEntity(pe);
			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.getTemplateIds().clear();
				target.getParticipants().clear();
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pRole.setPlayingEntity(pe);
				PN namePN = DatatypesFactory.eINSTANCE.createPN();
				pe.getNames().add(namePN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRolePlayingEntityName(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActParticipantParticipantRolePlayingEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActParticipantParticipantRoleClassCode() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActParticipantParticipantRoleClassCodeTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActParticipantParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.getTemplateIds().clear();
				target.getParticipants().clear();
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
				pRole.setClassCode(RoleClassRoot.ASSIGNED);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRoleClassCode(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActParticipantParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActParticipantParticipantRoleId() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActParticipantParticipantRoleIdTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActParticipantParticipantRoleId",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_PARTICIPANT_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.getTemplateIds().clear();
				target.getParticipants().clear();
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
				II idII = DatatypesFactory.eINSTANCE.createII();
				pRole.getIds().add(idII);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRoleId(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActParticipantParticipantRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActParticipantParticipantRolePlayingEntity() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActParticipantParticipantRolePlayingEntityTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActParticipantParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.getTemplateIds().clear();
				target.getParticipants().clear();
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pRole.setPlayingEntity(pe);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRolePlayingEntity(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActParticipantParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActParticipantTypeCode() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActParticipantTypeCodeTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.getTemplateIds().clear();
				target.getParticipants().clear();
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				par.setTypeCode(ParticipationType.RESP);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActParticipantTypeCode(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDrugMonitoringActParticipantParticipantRole() {
		OperationsTestCase<DrugMonitoringAct> validateDrugMonitoringActParticipantParticipantRoleTestCase = new OperationsTestCase<DrugMonitoringAct>(
			"validateDrugMonitoringActParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_MONITORING_ACT_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugMonitoringAct target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(DrugMonitoringAct target) {
				target.getTemplateIds().clear();
				target.getParticipants().clear();
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole pRole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pRole);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugMonitoringActOperations.validateDrugMonitoringActParticipantParticipantRole(
					(DrugMonitoringAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugMonitoringActParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DrugMonitoringActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DrugMonitoringAct> {
		public DrugMonitoringAct create() {
			return ConsolFactory.eINSTANCE.createDrugMonitoringAct();
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
	private static class ConstructorTestClass extends DrugMonitoringActOperations {
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

} // DrugMonitoringActOperations
