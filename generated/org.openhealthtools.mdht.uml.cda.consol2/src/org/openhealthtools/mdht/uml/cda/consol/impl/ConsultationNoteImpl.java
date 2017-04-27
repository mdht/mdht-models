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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNoteOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConsultationNoteImpl extends GeneralHeaderConstraintsImpl implements ConsultationNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CONSULTATION_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteHasReasonForReferralOrReasonForVisit(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHasReasonForReferralOrReasonForVisit(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateGeneralHeaderConstraintsCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteInFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsiblePartyAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheDay(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheMinute(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2PreciseToTheSecond(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2IfMorePreciseThanDayIncludeTimeZoneOffset(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2Id(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2Id(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2ResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter2EncounterParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteInFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOfOrderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteInFulfillmentOfOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteInFulfillmentOfOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteAssessmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteAssessmentAndPlanSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteAssessmentAndPlanSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNotePlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNotePlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteHistoryOfPresentIllness(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHistoryOfPresentIllness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNotePhysicalExamSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNotePhysicalExamSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteReasonForReferralSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteReasonForReferralSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteReasonForVisitSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteAllergiesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteAllergiesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteChiefComplaintAndReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteFamilyHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteGeneralStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteGeneralStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteHistoryOfPastIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteHistoryOfPastIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteImmunizationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteMedicationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteMedicationsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteProblemSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteProblemSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteProceduresSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteProceduresSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteResultsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteResultsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteSocialHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsultationNoteVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateConsultationNoteVitalSignsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentSection getAssessmentSection() {
		return ConsultationNoteOperations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
		return ConsultationNoteOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanOfCareSection getPlanOfCareSection() {
		return ConsultationNoteOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPresentIllnessSection getHistoryOfPresentIllness() {
		return ConsultationNoteOperations.getHistoryOfPresentIllness(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhysicalExamSection getPhysicalExamSection() {
		return ConsultationNoteOperations.getPhysicalExamSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForReferralSection getReasonForReferralSection() {
		return ConsultationNoteOperations.getReasonForReferralSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReasonForVisitSection getReasonForVisitSection() {
		return ConsultationNoteOperations.getReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllergiesSectionEntriesOptional getAllergiesSection() {
		return ConsultationNoteOperations.getAllergiesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintSection getChiefComplaintSection() {
		return ConsultationNoteOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return ConsultationNoteOperations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilyHistorySection getFamilyHistorySection() {
		return ConsultationNoteOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralStatusSection getGeneralStatusSection() {
		return ConsultationNoteOperations.getGeneralStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
		return ConsultationNoteOperations.getHistoryOfPastIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImmunizationsSection getImmunizationsSection() {
		return ConsultationNoteOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional() {
		return ConsultationNoteOperations.getMedicationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProblemSectionEntriesOptional getProblemSectionEntriesOptional() {
		return ConsultationNoteOperations.getProblemSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional() {
		return ConsultationNoteOperations.getProceduresSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultsSectionEntriesOptional getResultsSectionEntriesOptional() {
		return ConsultationNoteOperations.getResultsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return ConsultationNoteOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialHistorySection getSocialHistorySection() {
		return ConsultationNoteOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional() {
		return ConsultationNoteOperations.getVitalSignsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationNote init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationNote init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ConsultationNoteImpl
