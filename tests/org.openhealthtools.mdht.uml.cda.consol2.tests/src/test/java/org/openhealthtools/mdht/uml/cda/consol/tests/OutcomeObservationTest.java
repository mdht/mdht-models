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
import org.eclipse.mdht.uml.cda.EntryRelationship;
import org.eclipse.mdht.uml.cda.Reference;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.CD;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.II;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.eclipse.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ExternalDocumentReference;
import org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.OutcomeObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Outcome Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Prog Toward Goal Obs Inversion Ind Is True</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryReferenceGoalObs(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Goal Obs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryReferenceInterventionAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Reference Intervention Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationProgressTowardGoalObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Progress Toward Goal Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#validateOutcomeObservationReferenceExternalDocumentReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Outcome Observation Reference External Document Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getEntryReferenceGoalObss() <em>Get Entry Reference Goal Obss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getEntryReferenceInterventionActs() <em>Get Entry Reference Intervention Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OutcomeObservation#getProgressTowardGoalObservation() <em>Get Progress Toward Goal Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OutcomeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationProgTowardGoalObsInversionIndIsTrue() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationProgTowardGoalObsInversionIndIsTrueTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_PROG_TOWARD_GOAL_OBS_INVERSION_IND_IS_TRUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createProgressTowardGoalObservation().init());
				er.setInversionInd(false);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationProgTowardGoalObsInversionIndIsTrue(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationProgTowardGoalObsInversionIndIsTrueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationTemplateId() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationTemplateIdTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationTemplateId(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationClassCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationClassCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationClassCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationMoodCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationMoodCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationMoodCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationId() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationIdTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationId",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationId(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationCodeP() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationCodePTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationCodeP(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCD("hasCode", LOINC_ID));
			}

			@Override
			protected void setDependency(OutcomeObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.OutcomeObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOutcomeObservationValue() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationValueTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationValue(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationEntryReferenceGoalObs() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryReferenceGoalObsTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryReferenceGoalObs",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_GOAL_OBS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.GEVL);
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryReferenceGoalObs(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryReferenceGoalObsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationEntryReferenceInterventionAct() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryReferenceInterventionActTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryReferenceInterventionAct",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_REFERENCE_INTERVENTION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {

			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setAct(ConsolFactory.eINSTANCE.createEntryReference());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryReferenceInterventionAct(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryReferenceInterventionActTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationAuthorParticipation() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationAuthorParticipationTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationAuthorParticipation", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationAuthorParticipation(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationAuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationProgressTowardGoalObservation() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationProgressTowardGoalObservationTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationProgressTowardGoalObservation",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_PROGRESS_TOWARD_GOAL_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SPRT);
				er.setObservation(ConsolFactory.eINSTANCE.createProgressTowardGoalObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationProgressTowardGoalObservation(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationProgressTowardGoalObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationReference() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationReferenceTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationReference",
			operationsForOCL.getOCLValue("VALIDATE_OUTCOME_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationReference(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationEntryRelationship() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationEntryRelationshipTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationEntryRelationship", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationEntryRelationship(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationReferenceTypeCode() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationReferenceTypeCodeTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationReferenceTypeCode", operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				for (Reference r : target.getReferences()) {
					r.setTypeCode(x_ActRelationshipExternalReference.REFR);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationReferenceTypeCode(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOutcomeObservationReferenceExternalDocumentReference() {
		OperationsTestCase<OutcomeObservation> validateOutcomeObservationReferenceExternalDocumentReferenceTestCase = new OperationsTestCase<OutcomeObservation>(
			"validateOutcomeObservationReferenceExternalDocumentReference",
			operationsForOCL.getOCLValue(
				"VALIDATE_OUTCOME_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OutcomeObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(OutcomeObservation target) {
				ExternalDocumentReference edr = ConsolFactory.eINSTANCE.createExternalDocumentReference().init();
				for (Reference r : target.getReferences()) {
					r.setExternalDocument(edr);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OutcomeObservationOperations.validateOutcomeObservationReferenceExternalDocumentReference(
					(OutcomeObservation) objectToTest, diagnostician, map);
			}

		};

		validateOutcomeObservationReferenceExternalDocumentReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEntryReferenceGoalObss() {

		OutcomeObservation target = objectFactory.create();
		target.getEntryReferenceGoalObss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEntryReferenceInterventionActs() {

		OutcomeObservation target = objectFactory.create();
		target.getEntryReferenceInterventionActs();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProgressTowardGoalObservation() {

		OutcomeObservation target = objectFactory.create();
		target.getProgressTowardGoalObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OutcomeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OutcomeObservation> {
		@Override
		public OutcomeObservation create() {
			return ConsolFactory.eINSTANCE.createOutcomeObservation();
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
	private static class ConstructorTestClass extends OutcomeObservationOperations {
	}

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

} // OutcomeObservationOperations
