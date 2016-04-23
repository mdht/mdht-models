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
import org.eclipse.mdht.uml.hl7.datatypes.TEL;
import org.eclipse.mdht.uml.hl7.vocab.EntityClassRoot;
import org.eclipse.mdht.uml.hl7.vocab.ParticipationType;
import org.eclipse.mdht.uml.hl7.vocab.RoleClassRoot;
import org.junit.Test;
import org.eclipse.mdht.uml.hl7.vocab.*;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SubstanceOrDeviceAllergyObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Or Device Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity CE Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code Terminology Value Set Group SRFI</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#getAllergyStatusObservation() <em>Get Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#getReactionObservations() <em>Get Reaction Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation#getSeverityObservation() <em>Get Severity Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SubstanceOrDeviceAllergyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicatorTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyStatusObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getEntryRelationships().get(0).setInversionInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationAllergyStatusInversionIndicator(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationReactionInversionIndicatorTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getEntryRelationships().get(0).setInversionInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationReactionInversionIndicator(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicatorTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getEntryRelationships().get(0).setInversionInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationSeverityInversionIndicator(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationTemplateId",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationTemplateId(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationClassCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationClassCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationClassCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationMoodCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationMoodCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationMoodCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationMoodCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationId() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationIdTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationId", operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationId(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationCodeP() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationCodePTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationCodeP(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getCode().setCode("ASSERTION");
				target.getCode().setCodeSystem("2.16.840.1.113883.5.4");
			}

			@Override
			protected void setDependency(SubstanceOrDeviceAllergyObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationStatusCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationStatusCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationStatusCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationStatusCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationStatusCodeP() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationStatusCodePTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationStatusCodeP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationStatusCodeP(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationEffectiveTime() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationEffectiveTimeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationEffectiveTime",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationEffectiveTime(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationValueTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("420134006", SNOMEDCT_ID));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationValue(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationValueP() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationValuePTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationValueP",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationValueP(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationAllergyStatusObservation() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationAllergyStatusObservationTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyStatusObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationAllergyStatusObservation(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationAllergyStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationReactionObservation() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationReactionObservationTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationReactionObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationReactionObservation(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationReactionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationSeverityObservation() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationSeverityObservationTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationSeverityObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationSeverityObservation(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationSeverityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipant() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipant",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipant(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalTextTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p.setParticipantRole(pr);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().getCode().setOriginalText(
					DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalText(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCEOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslationTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p.setParticipantRole(pr);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().getCode().getTranslations().add(
					DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslation(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCETranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase = new NarrativeReferenceTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
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
				// Note: A blank string is sent for content/@ID so that there is no match
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValueTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p.setParticipantRole(pr);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				ED originalText = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(originalText);
				TEL reference = DatatypesFactory.eINSTANCE.createTEL();
				originalText.setReference(reference);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				final String value = "(555) 555-5555";
				target.getParticipants().get(
					0).getParticipantRole().getPlayingEntity().getCode().getOriginalText().getReference().setValue(
						value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValue(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p.setParticipantRole(pr);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				ED originalText = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(originalText);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				TEL reference = DatatypesFactory.eINSTANCE.createTEL();
				target.getParticipants().get(
					0).getParticipantRole().getPlayingEntity().getCode().getOriginalText().setReference(reference);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReference(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFITestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE_TERMINOLOGY_VALUE_SET_GROUP_SRFI__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			private static final String CS_OID_NDF_RT = "2.16.840.1.113883.3.26.1.5";

			private static final String CS_OID_RXNORM = "2.16.840.1.113883.6.88";

			private static final String CS_OID_USED_BY_UNIQUE_INGREDIENT_IDENTIFIER_VALUE_SET = "2.16.840.1.113883.4.9";

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(SubstanceOrDeviceAllergyObservation target) {
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
					public void updateToFail(SubstanceOrDeviceAllergyObservation target) {
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
					public void updateToPass(SubstanceOrDeviceAllergyObservation target) {
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
					public void updateToPass(SubstanceOrDeviceAllergyObservation target) {
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
					public void updateToPass(SubstanceOrDeviceAllergyObservation target) {
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
					public void updateToPass(SubstanceOrDeviceAllergyObservation target) {
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

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFI(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTerminologyValueSetGroupSRFITestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p.setParticipantRole(pr);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().setClassCode(
					EntityClassRoot.MMAT);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p.setParticipantRole(pr);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pr.setPlayingEntity(pe);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				CE code = DatatypesFactory.eINSTANCE.createCE();
				target.getParticipants().get(0).getParticipantRole().getPlayingEntity().setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getParticipants().get(0).getParticipantRole().setClassCode(RoleClassRoot.MANU);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p.setParticipantRole(pr);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				target.getParticipants().get(0).getParticipantRole().setPlayingEntity(pe);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantTypeCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantTypeCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantTypeCode",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				target.getParticipants().get(0).setTypeCode(ParticipationType.CSM);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantTypeCode(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipantParticipantRole() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation> validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation>(
			"validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole",
			operationsForOCL.getOCLValue(
				"VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation target) {
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				target.getParticipants().get(0).setParticipantRole(pr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservationOperations.validateSubstanceOrDeviceAllergyObservationParticipantParticipantRole(
					(SubstanceOrDeviceAllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergyStatusObservation() {

		SubstanceOrDeviceAllergyObservation target = objectFactory.create();
		target.getAllergyStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReactionObservations() {

		SubstanceOrDeviceAllergyObservation target = objectFactory.create();
		target.getReactionObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverityObservation() {

		SubstanceOrDeviceAllergyObservation target = objectFactory.create();
		target.getSeverityObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SubstanceOrDeviceAllergyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SubstanceOrDeviceAllergyObservation> {
		@Override
		public SubstanceOrDeviceAllergyObservation create() {
			return ConsolFactory.eINSTANCE.createSubstanceOrDeviceAllergyObservation();
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
	private static class ConstructorTestClass extends SubstanceOrDeviceAllergyObservationOperations {
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

} // SubstanceOrDeviceAllergyObservationOperations
