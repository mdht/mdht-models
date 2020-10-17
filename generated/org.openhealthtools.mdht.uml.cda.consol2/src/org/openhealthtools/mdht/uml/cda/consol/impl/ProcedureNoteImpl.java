/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureNoteImpl extends GeneralHeaderConstraintsImpl implements ProcedureNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteSectionTitles(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteSectionTitles(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateGeneralHeaderConstraintsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteAssessmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNotePlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNotePlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteAssessmentAndPlanSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteAssessmentAndPlanSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComplicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComplicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNotePostprocedureDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNotePostprocedureDiagnosisSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteProcedureDescriptionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteProcedureDescriptionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteProcedureIndicationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteProcedureIndicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteAllergiesSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteAllergiesSectionEntriesOptional(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteAnesthesiaSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteAnesthesiaSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteChiefComplaintAndReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteHistoryOfPastIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteHistoryOfPastIllnessSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteHistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteHistoryOfPresentIllnessSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteMedicalHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteMedicalHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteMedicationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteMedicationsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteMedicationsAdministeredSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteMedicationsAdministeredSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNotePhysicalExamSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNotePhysicalExamSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNotePlannedProcedureSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNotePlannedProcedureSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteProcedureDispositionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteProcedureDispositionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteProcedureEstimatedBloodLossSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteProcedureEstimatedBloodLossSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteProcedureFindingsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteProcedureFindingsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteProcedureImplantsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteProcedureImplantsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteProcedureSpecimensTakenSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteProcedureSpecimensTakenSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteProceduresSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteProceduresSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteReasonForVisitSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteParticipant1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteParticipant1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacilityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5LocationHealthCareFacility(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipantTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5Code(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5Location(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5Location(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5EncounterParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteComponentOfEncompassingEncounter5(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteComponentOfEncompassingEncounter5(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1ProcedureCodes(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeHasHighWhenNoWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTimeNoHighIfWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheDay(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheMinute(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PreciseToTheSecond(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1IfMorePreciseThanDayIncludeTimeZoneOffset(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1Code(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1Code(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1PrimaryPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureNoteDocumentationOfServiceEvent1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateProcedureNoteDocumentationOfServiceEvent1(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentSection getAssessmentSection() {
		return ProcedureNoteOperations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareSection getPlanOfCareSection() {
		return ProcedureNoteOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return ProcedureNoteOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComplicationsSection getComplicationsSection() {
		return ProcedureNoteOperations.getComplicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosisSection getPostprocedureDiagnosisSection() {
		return ProcedureNoteOperations.getPostprocedureDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureDescriptionSection getProcedureDescriptionSection() {
		return ProcedureNoteOperations.getProcedureDescriptionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureIndicationsSection getProcedureIndicationsSection() {
		return ProcedureNoteOperations.getProcedureIndicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional() {
		return ProcedureNoteOperations.getAllergiesSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnesthesiaSection getAnesthesiaSection() {
		return ProcedureNoteOperations.getAnesthesiaSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintSection getChiefComplaintSection() {
		return ProcedureNoteOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return ProcedureNoteOperations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistorySection getFamilyHistorySection() {
		return ProcedureNoteOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
		return ProcedureNoteOperations.getHistoryOfPastIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection() {
		return ProcedureNoteOperations.getHistoryOfPresentIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicalHistorySection getMedicalHistorySection() {
		return ProcedureNoteOperations.getMedicalHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional() {
		return ProcedureNoteOperations.getMedicationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsAdministeredSection getMedicationsAdministeredSection() {
		return ProcedureNoteOperations.getMedicationsAdministeredSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExamSection getPhysicalExamSection() {
		return ProcedureNoteOperations.getPhysicalExamSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlannedProcedureSection getPlannedProcedureSection() {
		return ProcedureNoteOperations.getPlannedProcedureSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureDispositionSection getProcedureDispositionSection() {
		return ProcedureNoteOperations.getProcedureDispositionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureEstimatedBloodLossSection getProcedureEstimatedBloodLossSection() {
		return ProcedureNoteOperations.getProcedureEstimatedBloodLossSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFindingsSection getProcedureFindingsSection() {
		return ProcedureNoteOperations.getProcedureFindingsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureImplantsSection getProcedureImplantsSection() {
		return ProcedureNoteOperations.getProcedureImplantsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureSpecimensTakenSection getProcedureSpecimensTakenSection() {
		return ProcedureNoteOperations.getProcedureSpecimensTakenSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional() {
		return ProcedureNoteOperations.getProceduresSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForVisitSection getReasonForVisitSection() {
		return ProcedureNoteOperations.getReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return ProcedureNoteOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection getSocialHistorySection() {
		return ProcedureNoteOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureNote init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureNoteImpl
