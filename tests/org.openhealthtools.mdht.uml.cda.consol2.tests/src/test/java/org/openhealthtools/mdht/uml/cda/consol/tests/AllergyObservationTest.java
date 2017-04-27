/*******************************************************************************
 * Copyright (c) 2011, 2012, 2014 Sean Muir, Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) and Dan Brown (Audacious Inquiry) - initial API and implementation
 *     Dan Brown - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.CDAFactory;
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.Participant2;
import org.eclipse.mdht.uml.cda.ParticipantRole;
import org.eclipse.mdht.uml.cda.PlayingEntity;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.CE;
import org.eclipse.mdht.uml.hl7.datatypes.CS;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ED;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.datatypes.IVL_TS;
import org.eclipse.mdht.uml.hl7.vocab.EntityClassRoot;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassRoot;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationValueOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyPlayingEntityCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Playing Entity Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationProblemEntryReactionObservationContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Problem Entry Reaction Observation Container</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getProblemEntryReactionObservationContainers() <em>Get Problem Entry Reaction Observation Containers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getAllergyStatusObservation() <em>Get Allergy Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */

public class AllergyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateAllergyObservationValueOriginalText() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationValueOriginalTextTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationValueOriginalText", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationValueOriginalText(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValueOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateAllergyObservationOriginalTextReference() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationOriginalTextReferenceTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationOriginalTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				ED orig = DatatypesFactory.eINSTANCE.createED();
				orig.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				value.setOriginalText(orig);

				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationOriginalTextReference(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateAllergyObservationOriginalTextReferenceValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationOriginalTextReferenceValueTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				ED orig = DatatypesFactory.eINSTANCE.createED();
				orig.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				value.setOriginalText(orig);

				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationOriginalTextReferenceValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not NOT
	*/
	@Test
	public void testValidateAllergyObservationReferenceValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationReferenceValueTestCase = new NarrativeReferenceTestCase<AllergyObservation>(
			"validateAllergyObservationReferenceValue", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				target.setCode(createCDWithOriginalTextReference("Some sample text", "#1.2.3.4"));

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"", "No particular health status observed.");

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationReferenceValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationMoodCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationMoodCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationMoodCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationId() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationIdTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationId(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationCodeP() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationCodePTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationCodeP(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("ASSERTION");
				cd.setCodeSystem("2.16.840.1.113883.5.4");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationStatusCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationStatusCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationStatusCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationEffectiveTime() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationEffectiveTimeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationEffectiveTime(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationValueTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("420134006");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationReactionObservation() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationReactionObservationTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationReactionObservation", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				ReactionObservation observation = ConsolFactory.eINSTANCE.createReactionObservation().init();
				target.addObservation(observation);
				for (org.eclipse.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationReactionObservation(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationReactionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationSeverityObservation() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationSeverityObservationTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationSeverityObservation", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				SeverityObservation observation = ConsolFactory.eINSTANCE.createSeverityObservation().init();
				target.addObservation(observation);
				for (org.eclipse.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationSeverityObservation(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationSeverityObservationTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateAllergyObservationProblemEntryReactionObservationContainer() {
	// OperationsTestCase<AllergyObservation> validateAllergyObservationProblemEntryReactionObservationContainerTestCase = new
	// OperationsTestCase<AllergyObservation>(
	// "validateAllergyObservationProblemEntryReactionObservationContainer",
	// operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AllergyObservation target) {
	//
	// }
	//
	// @Override
	// protected void updateToPass(AllergyObservation target) {
	// target.init();
	// ReactionObservation observation = ConsolFactory.eINSTANCE.createReactionObservation().init();
	// target.addObservation(observation);
	// for (org.eclipse.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
	// er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
	// }
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AllergyObservationOperations.validateAllergyObservationProblemEntryReactionObservationContainer(
	// (AllergyObservation) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAllergyObservationProblemEntryReactionObservationContainerTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyStatusObservation() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyStatusObservationTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyStatusObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				AllergyStatusObservation observation = ConsolFactory.eINSTANCE.createAllergyStatusObservation().init();
				target.addObservation(observation);
				for (org.eclipse.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyStatusObservation(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationParticipant() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipant",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipant(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalTextTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslationTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());

				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityCETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase = new NarrativeReferenceTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(ot);
				pe.setCode(createCEWithOriginalTextReference("Some sample text", "#1.2.3.4"));
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValueTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				ot.setReference(DatatypesFactory.eINSTANCE.createTEL());
				code.setOriginalText(ot);
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				ot.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				code.setOriginalText(ot);
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(ot);
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				ot.setReference(DatatypesFactory.eINSTANCE.createTEL());
				code.setOriginalText(ot);
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFITestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			private static final String CS_OID_NDF_RT = "2.16.840.1.113883.3.26.1.5";

			private static final String CS_OID_RXNORM = "2.16.840.1.113883.6.88";

			private static final String CS_OID_USED_BY_UNIQUE_INGREDIENT_IDENTIFIER_VALUE_SET = "2.16.840.1.113883.4.9";

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyObservation target) {
						target.init();
						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyObservation target) {
						target.getParticipants().clear();

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						pe.setCode(DatatypesFactory.eINSTANCE.createCE("mustExistOnly", BAD_CODESYSTEM_ID));

						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

			};

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyObservation target) {
						target.getParticipants().clear();

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						pe.setCode(DatatypesFactory.eINSTANCE.createCE("mustExistOnly", CS_OID_NDF_RT));

						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyObservation target) {
						target.getParticipants().clear();

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						pe.setCode(DatatypesFactory.eINSTANCE.createCE("mustExistOnly", CS_OID_RXNORM));

						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyObservation target) {
						target.getParticipants().clear();

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						pe.setCode(
							DatatypesFactory.eINSTANCE.createCE(
								"mustExistOnly", CS_OID_USED_BY_UNIQUE_INGREDIENT_IDENTIFIER_VALUE_SET));

						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyObservation target) {
						target.getParticipants().clear();

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						pe.setCode(DatatypesFactory.eINSTANCE.createCE("mustExistOnly", SNOMEDCT_ID));

						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

			};

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFITestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntityClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pe.setClassCode(EntityClassRoot.MMAT);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntityCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pe.setCode(DatatypesFactory.eINSTANCE.createCE());
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntityCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRoleClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRoleClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRoleClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().get(0).getParticipantRole().setClassCode(RoleClassRoot.MANU);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRoleClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRolePlayingEntity() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRolePlayingEntityTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRolePlayingEntity(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantTypeCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantTypeCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();

				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantTypeCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipantParticipantRole() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantParticipantRoleTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipantParticipantRole",
			operationsForOCL.getOCLValue(
				"VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();

				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipantParticipantRole(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolReactionObservations() {

		AllergyObservation target = objectFactory.create();
		target.getConsolReactionObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolSeverityObservation() {

		AllergyObservation target = objectFactory.create();
		target.getConsolSeverityObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAllergyStatusObservation() {

		AllergyObservation target = objectFactory.create();
		target.getConsolAllergyStatusObservation();

	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator() {
		OperationsTestCase<AllergyObservation> validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyStatusObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AllergyObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyStatusObservation().init());
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationReactionInversionIndicator() {
		OperationsTestCase<AllergyObservation> validateSubstanceOrDeviceAllergyObservationReactionInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AllergyObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation().init());
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationReactionInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator() {
		OperationsTestCase<AllergyObservation> validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AllergyObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation().init());
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationTemplateId() {
		OperationsTestCase<AllergyObservation> validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase = new OperationsTestCase<AllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationTemplateId(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyObservation> {
		@Override
		public AllergyObservation create() {
			return ConsolFactory.eINSTANCE.createAllergyObservation();
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
	private static class ConstructorTestClass extends AllergyObservationOperations {
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

} // AllergyObservationOperations
