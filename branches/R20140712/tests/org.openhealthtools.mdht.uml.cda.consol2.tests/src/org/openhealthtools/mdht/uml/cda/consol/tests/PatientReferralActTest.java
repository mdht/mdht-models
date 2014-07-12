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
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.PatientReferralActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Referral Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActActReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Act Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#validatePatientReferralActEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Referral Act Entry Relationship Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientReferralAct#getActReferences() <em>Get Act References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientReferralActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientReferralActTemplateId() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActTemplateIdTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActTemplateId(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientReferralActClassCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActClassCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActClassCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientReferralActMoodCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActMoodCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActMoodCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActId() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActIdTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActId(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientReferralActCodeP() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActCodePTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActCodeP(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCode("44383000");
				code.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(code);
			}

			@Override
			protected void setDependency(PatientReferralAct target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.PatientReferralActCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActStatusCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActStatusCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS("active");
				cs.setCodeSystem("2.16.840.1.113883.5.14");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActStatusCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientReferralActStatusCodeP() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActStatusCodePTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActStatusCodeP(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientReferralActEffectiveTime() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEffectiveTimeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEffectiveTime(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActActReference() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActActReferenceTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActActReference",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ACT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setAct(ConsolFactory.eINSTANCE.createActReference().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActActReference(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActActReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationship() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {

			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationship(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActAuthorParticipation() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActAuthorParticipationTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActAuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActAuthorParticipation(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservationClassCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationClassCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.getObservations().get(0).setClassCode(ActClassObservation.OBS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationClassCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservationMoodCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationMoodCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.getObservations().get(0).setMoodCode(x_ActMoodDocumentObservation.EVN);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationMoodCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservationCodeP() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationCodePTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				CD code = DatatypesFactory.eINSTANCE.createCD();
				target.getObservations().get(0).setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationCodeP(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservationCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCode("ASSERTION");
				code.setCodeSystem("2.16.840.1.113883.5.4");
				target.getObservations().get(0).setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservationStatusCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationStatusCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.getObservations().get(0).setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationStatusCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservationStatusCodeP() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationStatusCodePTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.getObservations().get(0).setStatusCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationStatusCodeP(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservationValue() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationValueTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCode("268528005");
				value.setCodeSystem("2.16.840.1.113883.6.96");
				target.getObservations().get(0).getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationValue(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservationValueP() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationValuePTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				target.addObservation(obs);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getObservations().get(0).getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservationValueP(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipTypeCode() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipTypeCodeTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.getEntryRelationships().get(0).setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipTypeCode(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientReferralActEntryRelationshipObservation() {
		OperationsTestCase<PatientReferralAct> validatePatientReferralActEntryRelationshipObservationTestCase = new OperationsTestCase<PatientReferralAct>(
			"validatePatientReferralActEntryRelationshipObservation",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_REFERRAL_ACT_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientReferralAct target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(PatientReferralAct target) {
				target.getEntryRelationships().get(0).setObservation(CDAFactory.eINSTANCE.createObservation());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientReferralActOperations.validatePatientReferralActEntryRelationshipObservation(
					(PatientReferralAct) objectToTest, diagnostician, map);
			}

		};

		validatePatientReferralActEntryRelationshipObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetActReferences() {

		PatientReferralAct target = objectFactory.create();
		target.getActReferences();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientReferralActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientReferralAct> {
		public PatientReferralAct create() {
			return ConsolFactory.eINSTANCE.createPatientReferralAct();
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
	private static class ConstructorTestClass extends PatientReferralActOperations {
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

} // PatientReferralActOperations
