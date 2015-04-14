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
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservation2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ValueOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Value Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2OriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2OriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2SeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2NegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2SeverityObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2IVLTSLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2IVLTSHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 IVLTS High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Participant Participant Role Playing Entity Allergy Specific Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Participant Participant Role Playing Entity Allergy Class Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Participant Participant Role Playing Entity Allergy Food Other Substance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Participant Participant Role Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Participant Participant Role Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ParticipantParticipantRoleAllergyObservationParticipantParticipantRolePlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Participant Participant Role Allergy Observation Participant Participant Role Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2ParticipantAllergyObservationParticipantParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Participant Allergy Observation Participant Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservation2AllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation2 Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#getConsolAllergyStatusObservations() <em>Get Consol Allergy Status Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#getConsolReactionObservation2s() <em>Get Consol Reaction Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#getSeverityObservation2() <em>Get Severity Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateSubstanceOrDeviceAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Substance Or Device Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation2#validateAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyObservation2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ValueOriginalText() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ValueOriginalTextTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ValueOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ValueOriginalText(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ValueOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2OriginalTextReference() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2OriginalTextReferenceTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2OriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2OriginalTextReference(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2OriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2OriginalTextReferenceValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2OriginalTextReferenceValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2OriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2OriginalTextReferenceValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2OriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ReferenceValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ReferenceValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ReferenceValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden with no severity as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2AllergyStatusInversionIndicator() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2AllergyStatusInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2AllergyStatusInversionIndicator",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2AllergyStatusInversionIndicator(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2AllergyStatusInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2ReactionInversionIndicator() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ReactionInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ReactionInversionIndicator",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ReactionInversionIndicator(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ReactionInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2SeverityInversionIndicator() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2SeverityInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2SeverityInversionIndicator",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2SeverityInversionIndicator(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2SeverityInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2NegationInd() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2NegationIndTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2NegationInd",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.setNegationInd(false);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2NegationInd(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2NegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationValueP() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationValuePTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationValueP(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationStatusCodeP() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationStatusCodePTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationStatusCodeP(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2AuthorParticipation() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2AuthorParticipationTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2AuthorParticipation(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationReactionObservation2() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationReactionObservation2TestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationReactionObservation2",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationReactionObservation2(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationReactionObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2SeverityObservation2() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2SeverityObservation2TestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2SeverityObservation2",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_SEVERITY_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2SeverityObservation2(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2SeverityObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2IVLTSLow() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2IVLTSLowTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2IVLTSLow",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_IVLTS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getEffectiveTime().setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2IVLTSLow(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2IVLTSLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2IVLTSHigh() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2IVLTSHighTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2IVLTSHigh",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_IVLTS_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS());
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getEffectiveTime().setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2IVLTSHigh(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2IVLTSHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReference(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedicationTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_CLASS_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedication(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyClassMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstanceTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_FOOD_OTHER_SUBSTANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstance(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergyFoodOtherSubstanceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ParticipantParticipantRolePlayingEntityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ParticipantParticipantRolePlayingEntityOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* This constraint is being overridden as it has been removed in v2 and should never fire
	* It always returns true and there is no reason to test it
	*/
	@Ignore
	public void testValidateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedicationTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_ALLERGY_SPECIFIC_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedication(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ParticipantParticipantRolePlayingEntityAllergySpecificMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2ParticipantParticipantRoleAllergyObservationParticipantParticipantRolePlayingEntityCode() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ParticipantParticipantRoleAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ParticipantParticipantRoleAllergyObservationParticipantParticipantRolePlayingEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_PARTICIPANT_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
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

				return AllergyObservation2Operations.validateAllergyObservation2ParticipantParticipantRoleAllergyObservationParticipantParticipantRolePlayingEntityCode(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ParticipantParticipantRoleAllergyObservationParticipantParticipantRolePlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2ParticipantAllergyObservationParticipantParticipantRolePlayingEntity() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2ParticipantAllergyObservationParticipantParticipantRolePlayingEntityTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2ParticipantAllergyObservationParticipantParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
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

				return AllergyObservation2Operations.validateAllergyObservation2ParticipantAllergyObservationParticipantParticipantRolePlayingEntity(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2ParticipantAllergyObservationParticipantParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservation2AllergyObservationParticipantParticipantRole() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservation2AllergyObservationParticipantParticipantRoleTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservation2AllergyObservationParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION2_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();

				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				target.getParticipants().add(par);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservation2AllergyObservationParticipantParticipantRole(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservation2AllergyObservationParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolAllergyStatusObservations() {

		AllergyObservation2 target = objectFactory.create();
		target.getConsolAllergyStatusObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolReactionObservation2s() {

		AllergyObservation2 target = objectFactory.create();
		target.getConsolReactionObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverityObservation2() {

		AllergyObservation2 target = objectFactory.create();
		target.getSeverityObservation2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSubstanceOrDeviceAllergyObservationTemplateId() {
		OperationsTestCase<AllergyObservation2> validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateSubstanceOrDeviceAllergyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUBSTANCE_OR_DEVICE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateSubstanceOrDeviceAllergyObservationTemplateId(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateSubstanceOrDeviceAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationCodeP() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationCodePTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationCodeP(
					(AllergyObservation2) objectToTest, diagnostician, map);
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
		OperationsTestCase<AllergyObservation2> validateAllergyObservationCodeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				// target.init() happens to, by default, set up the code properly
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("ASSERTION");
				cd.setCodeSystem("2.16.840.1.113883.5.4");
				target.setCode(cd);
			}

			@Override
			protected void setDependency(AllergyObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationCode(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationValue() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationValueTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("420134006");
				target.getValues().add(value);
			}

			@Override
			protected void setDependency(AllergyObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationValue(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationStatusCode() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationStatusCodeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(AllergyObservation2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AllergyObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationStatusCode(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationEffectiveTime() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationEffectiveTimeTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {

			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationEffectiveTime(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationParticipant() {
		OperationsTestCase<AllergyObservation2> validateAllergyObservationParticipantTestCase = new OperationsTestCase<AllergyObservation2>(
			"validateAllergyObservationParticipant",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation2 target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservation2Operations.validateAllergyObservationParticipant(
					(AllergyObservation2) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyObservation2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyObservation2> {
		@Override
		public AllergyObservation2 create() {
			return ConsolFactory.eINSTANCE.createAllergyObservation2();
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
	private static class ConstructorTestClass extends AllergyObservation2Operations {
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

} // AllergyObservation2Operations
