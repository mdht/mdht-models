/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeSummary2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalConsultationsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargePhysicalSection;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeSummary2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Summary2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DischargeSummary2Impl extends USRealmHeader2Impl implements DischargeSummary2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummary2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DISCHARGE_SUMMARY2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2AllergiesSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2AllergiesSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2HospitalCourseSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2HospitalCourseSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2PlanOfTreatmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2PlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ChiefComplaintAndReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2NutritionSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2NutritionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2FunctionalStatusSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2FunctionalStatusSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2HistoryOfPastIllnessSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2HistoryOfPastIllnessSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2HistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2HistoryOfPresentIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2HospitalConsultationsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2HospitalConsultationsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2HospitalDischargeInstructionsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2HospitalDischargeInstructionsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2HospitalDischargePhysicalSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2HospitalDischargePhysicalSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2HospitalDischargeStudiesSummarySection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2HospitalDischargeStudiesSummarySection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ImmunizationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ImmunizationsSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ProblemSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ProblemSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ProceduresSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ProceduresSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ReasonForVisitSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2SocialHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2SocialHistorySection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2VitalSignsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2VitalSignsSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterIVLTSHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterDischargeDispositionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterEncounterParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounterResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDischargeSummary2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DischargeSummary2Operations.validateDischargeSummary2ComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSectionEntriesOptional2 getAllergiesSectionEntriesOptional2() {
		return DischargeSummary2Operations.getAllergiesSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalCourseSection getHospitalCourseSection() {
		return DischargeSummary2Operations.getHospitalCourseSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 getPlanOfTreatmentSection2() {
		return DischargeSummary2Operations.getPlanOfTreatmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection getChiefComplaintSection() {
		return DischargeSummary2Operations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return DischargeSummary2Operations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionSection getNutritionSection() {
		return DischargeSummary2Operations.getNutritionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection2 getFunctionalStatusSection2() {
		return DischargeSummary2Operations.getFunctionalStatusSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2() {
		return DischargeSummary2Operations.getHistoryOfPastIllnessSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection() {
		return DischargeSummary2Operations.getHistoryOfPresentIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalConsultationsSection getHospitalConsultationsSection() {
		return DischargeSummary2Operations.getHospitalConsultationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection() {
		return DischargeSummary2Operations.getHospitalDischargeInstructionsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargePhysicalSection getHospitalDischargePhysicalSection() {
		return DischargeSummary2Operations.getHospitalDischargePhysicalSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalDischargeStudiesSummarySection getHospitalDischargeStudiesSummarySection() {
		return DischargeSummary2Operations.getHospitalDischargeStudiesSummarySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional2 getImmunizationsSectionEntriesOptional2() {
		return DischargeSummary2Operations.getImmunizationsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionEntriesOptional2 getProblemSectionEntriesOptional2() {
		return DischargeSummary2Operations.getProblemSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional2 getProceduresSectionEntriesOptional2() {
		return DischargeSummary2Operations.getProceduresSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection getReasonForVisitSection() {
		return DischargeSummary2Operations.getReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return DischargeSummary2Operations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection2 getSocialHistorySection2() {
		return DischargeSummary2Operations.getSocialHistorySection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional2 getVitalSignsSectionEntriesOptional2() {
		return DischargeSummary2Operations.getVitalSignsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DischargeSummary2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeSummary2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DischargeSummary2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // DischargeSummary2Impl
