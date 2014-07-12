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
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDietSection;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummaryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryImpl extends GeneralHeaderConstraintsImpl implements DischargeSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryDoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalAdmissionMedicationsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalAdmissionDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalAdmissionDiagnosisSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalDischargeDiagnosisSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeDiagnosisSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryDischargeDietSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryDischargeDietSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeMedicationsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryFunctionalStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryFunctionalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPresentIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalCourseSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalCourseSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryPlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHistoryOfPastIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHistoryOfPastIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryChiefComplaintAndReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalConsultationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalConsultationsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalDischargeInstructionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeInstructionsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalDischargePhysicalSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargePhysicalSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryHospitalDischargeStudiesSummarySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryHospitalDischargeStudiesSummarySection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryImmunizationsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryImmunizationsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryProblemSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryProblemSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryProceduresSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryProceduresSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryReasonForVisitSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummarySocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummarySocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryAllergiesSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryAllergiesSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryVitalSignsSectionEntriesOptional(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryVitalSignsSectionEntriesOptional(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntityHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsiblePartyAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntityHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeValueSet(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCodeCodeSystem(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3DischargeDispositionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3ResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter3EncounterParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummaryComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummaryOperations.validateDischargeSummaryComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionMedicationsSectionEntriesOptional getHospitalAdmissionMedicationsSectionEntriesOptional() {
		return DischargeSummaryOperations.getHospitalAdmissionMedicationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalAdmissionDiagnosisSection getHospitalAdmissionDiagnosisSection() {
		return DischargeSummaryOperations.getHospitalAdmissionDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeDiagnosisSection getHospitalDischargeDiagnosisSection() {
		return DischargeSummaryOperations.getHospitalDischargeDiagnosisSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDietSection getDischargeDietSection() {
		return DischargeSummaryOperations.getDischargeDietSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeMedicationsSectionEntriesOptional getHospitalDischargeMedicationsSectionEntriesOptional() {
		return DischargeSummaryOperations.getHospitalDischargeMedicationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection getFunctionalStatusSection() {
		return DischargeSummaryOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection() {
		return DischargeSummaryOperations.getHistoryOfPresentIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalCourseSection getHospitalCourseSection() {
		return DischargeSummaryOperations.getHospitalCourseSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return DischargeSummaryOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection getHistoryOfPastIllnessSection() {
		return DischargeSummaryOperations.getHistoryOfPastIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return DischargeSummaryOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return DischargeSummaryOperations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection getChiefComplaintSection() {
		return DischargeSummaryOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return DischargeSummaryOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalConsultationsSection getHospitalConsultationsSection() {
		return DischargeSummaryOperations.getHospitalConsultationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection() {
		return DischargeSummaryOperations.getHospitalDischargeInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargePhysicalSection getHospitalDischargePhysicalSection() {
		return DischargeSummaryOperations.getHospitalDischargePhysicalSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeStudiesSummarySection getHospitalDischargeStudiesSummarySection() {
		return DischargeSummaryOperations.getHospitalDischargeStudiesSummarySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional getImmunizationsSectionEntriesOptional() {
		return DischargeSummaryOperations.getImmunizationsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionEntriesOptional getProblemSectionEntriesOptional() {
		return DischargeSummaryOperations.getProblemSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional getProceduresSectionEntriesOptional() {
		return DischargeSummaryOperations.getProceduresSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection getReasonForVisitSection() {
		return DischargeSummaryOperations.getReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return DischargeSummaryOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSectionEntriesOptional getAllergiesSectionEntriesOptional() {
		return DischargeSummaryOperations.getAllergiesSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional getVitalSignsSectionEntriesOptional() {
		return DischargeSummaryOperations.getVitalSignsSectionEntriesOptional(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummaryOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeSummary init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeSummary init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DischargeSummaryImpl
