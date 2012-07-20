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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNoteOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History And Physical Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalNoteImpl extends GeneralHeaderConstraintsImpl implements HistoryAndPhysicalNote {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HistoryAndPhysicalNoteImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteDoesNotHaveIndividualAssementAndPlanSectionsWhenAssementAndPlanSectionPresent(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteInFulfillmentOf(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOf(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteAllergiesSectionEntriesOptional(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteAssessmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteAssessmentSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNotePlanOfCareSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNotePlanOfCareSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteAssessmentAndPlanSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteAssessmentAndPlanSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteChiefComplaintSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteChiefComplaintAndReasonForVisitSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteFamilyHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteFamilyHistorySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteGeneralStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteGeneralStatusSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHistoryOfPastIllnessSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteMedicationsSectionEntriesOptional(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNotePhysicalExamSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNotePhysicalExamSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteReasonForVisitSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteResultsSectionEntriesOptional(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteReviewOfSystemsSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteSocialHistorySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteSocialHistorySection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteHistoryOfPresentIllnessSection(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteImmunizationsSectionEntriesOptional(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteProblemSectionEntriesOptional(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteProceduresSectionEntriesOptional(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteVitalSignsSectionEntriesOptional(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsiblePartyAssignedEntity(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntityHasPersonOrOrganization(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipantAssignedEntity(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EffectiveTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Id(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4Location(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4ResponsibleParty(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter4EncounterParticipant(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateHistoryAndPhysicalNoteComponentOfEncompassingEncounter(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional() {
    return HistoryAndPhysicalNoteOperations.getAllergiesSectionEntriesOptional(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssessmentSection getAssessmentSection() {
    return HistoryAndPhysicalNoteOperations.getAssessmentSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PlanOfCareSection getPlanOfCareSection() {
    return HistoryAndPhysicalNoteOperations.getPlanOfCareSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssessmentAndPlanSection getAssessmentAndPlanSection() {
    return HistoryAndPhysicalNoteOperations.getAssessmentAndPlanSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChiefComplaintSection getChiefComplaintSection() {
    return HistoryAndPhysicalNoteOperations.getChiefComplaintSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
    return HistoryAndPhysicalNoteOperations.getChiefComplaintAndReasonForVisitSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FamilyHistorySection getFamilyHistorySection() {
    return HistoryAndPhysicalNoteOperations.getFamilyHistorySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public GeneralStatusSection getGeneralStatusSection() {
    return HistoryAndPhysicalNoteOperations.getGeneralStatusSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
    return HistoryAndPhysicalNoteOperations.getHistoryOfPastIllnessSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationsSectionEntriesOptional getMedicationsSectionEntriesOptional() {
    return HistoryAndPhysicalNoteOperations.getMedicationsSectionEntriesOptional(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PhysicalExamSection getPhysicalExamSection() {
    return HistoryAndPhysicalNoteOperations.getPhysicalExamSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReasonForVisitSection getReasonForVisitSection() {
    return HistoryAndPhysicalNoteOperations.getReasonForVisitSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ResultsSectionEntriesOptional getResultsSectionEntriesOptional() {
    return HistoryAndPhysicalNoteOperations.getResultsSectionEntriesOptional(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
    return HistoryAndPhysicalNoteOperations.getReviewOfSystemsSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SocialHistorySection getSocialHistorySection() {
    return HistoryAndPhysicalNoteOperations.getSocialHistorySection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection() {
    return HistoryAndPhysicalNoteOperations.getHistoryOfPresentIllnessSection(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional() {
    return HistoryAndPhysicalNoteOperations.getImmunizationsSectionEntriesOptional(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProblemSectionEntriesOptional getProblemSectionEntriesOptional() {
    return HistoryAndPhysicalNoteOperations.getProblemSectionEntriesOptional(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional() {
    return HistoryAndPhysicalNoteOperations.getProceduresSectionEntriesOptional(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional() {
    return HistoryAndPhysicalNoteOperations.getVitalSignsSectionEntriesOptional(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return HistoryAndPhysicalNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public HistoryAndPhysicalNote init() {
    	CDAUtil.init(this);
    	return this;
  }
} // HistoryAndPhysicalNoteImpl
