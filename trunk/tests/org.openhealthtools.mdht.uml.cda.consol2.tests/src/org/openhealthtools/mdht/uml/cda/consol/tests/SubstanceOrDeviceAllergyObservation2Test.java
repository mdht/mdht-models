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
import org.junit.Ignore;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.SubstanceOrDeviceAllergyObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Substance Or Device Allergy Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationSeverityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Specific Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Class Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Playing Entity Allergy Food Other Substance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Participant Role Substance Or Device Allergy Observation Participant Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Participant Substance Or Device Allergy Observation Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation2 Substance Or Device Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#getConsolReactionObservation2s() <em>Get Consol Reaction Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#getConsolSeverityObservation2() <em>Get Consol Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservation2#validateSubstanceOrDeviceAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SubstanceOrDeviceAllergyObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicatorTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicator(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ReactionInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicatorTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicator(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2SeverityInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationReactionObservation2() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationReactionObservation2TestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationReactionObservation2",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationReactionObservation2(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationReactionObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationSeverityObservation2() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationSeverityObservation2TestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationSeverityObservation2",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationSeverityObservation2(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationSeverityObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservation2AuthorParticipation() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2AuthorParticipationTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2AuthorParticipation(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservation2IVLTSLow() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2IVLTSLowTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				et.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(et);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2IVLTSLow(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservation2IVLTSHigh() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2IVLTSHighTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(et);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				IVL_TS et = DatatypesFactory.eINSTANCE.createIVL_TS();
				et.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(et);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2IVLTSHigh(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedicationTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValueTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedicationTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstanceTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole prole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(prole);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				prole.setPlayingEntity(pe);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				CE code = DatatypesFactory.eINSTANCE.createCE();
				for (Participant2 par : target.getParticipants()) {
					par.getParticipantRole().getPlayingEntity().setCode(code);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCode(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ParticipantParticipantRoleSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_PARTICIPANT_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
				ParticipantRole prole = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(prole);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				for (Participant2 par : target.getParticipants()) {
					par.getParticipantRole().setPlayingEntity(pe);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntity(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2ParticipantSubstanceOrDeviceAllergyObservationParticipantParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRoleTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION2_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				for (Participant2 par : target.getParticipants()) {
					par.setParticipantRole(pr);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRole(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservation2SubstanceOrDeviceAllergyObservationParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolReactionObservation2s() {

		SubstanceOrDeviceAllergyObservation2 target = objectFactory.create();
		target.getConsolReactionObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolSeverityObservation2() {

		SubstanceOrDeviceAllergyObservation2 target = objectFactory.create();
		target.getConsolSeverityObservation2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationTemplateId() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationTemplateId(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationEffectiveTime() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationEffectiveTimeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationEffectiveTime(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationValueP() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationValuePTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationValueP(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationValue() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationValueTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// possible to access this programmatically from
			// ValueSet Allergy/Adverse Event Type 2.16.840.1.113883.3.88.12.3221.6.2 DYNAMIC in the future?
			private final String[] codes = {
					"420134006", "418038007", "419511003", "418471000", "419199007", "416098002", "414285001",
					"59037007", "235719002" };

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			public void addPassTests() {
				for (int i = 0; i < codes.length; i++) {
					final int finIndex = i;
					addPassTest(new PassTest() {
						@Override
						public void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
							target.getValues().clear();
							target.getValues().add(DatatypesFactory.eINSTANCE.createCD(codes[finIndex], SNOMEDCT_ID));
						}
					});
				}
			}

			@Override
			protected void setDependency(SubstanceOrDeviceAllergyObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationValue(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationCodeP() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationCodePTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationCodeP(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
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
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationCodeTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4"));
			}

			@Override
			protected void setDependency(SubstanceOrDeviceAllergyObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SubstanceOrDeviceAllergyObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationCode(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationParticipant() {
		OperationsTestCase<SubstanceOrDeviceAllergyObservation2> validateSubstanceOrDeviceAllergyObservationParticipantTestCase = new OperationsTestCase<SubstanceOrDeviceAllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationParticipant",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SubstanceOrDeviceAllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(SubstanceOrDeviceAllergyObservation2 target) {
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SubstanceOrDeviceAllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationParticipant(
					(SubstanceOrDeviceAllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SubstanceOrDeviceAllergyObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<SubstanceOrDeviceAllergyObservation2> {
		@Override
		public SubstanceOrDeviceAllergyObservation2 create() {
			return ConsolFactory.eINSTANCE.createSubstanceOrDeviceAllergyObservation2();
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
	private static class ConstructorTestClass extends SubstanceOrDeviceAllergyObservation2Operations {
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

} // SubstanceOrDeviceAllergyObservation2Operations
