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
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSectionEntriesOptional2;

import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History And Physical Note2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalNote2Impl extends USRealmHeader2Impl implements HistoryAndPhysicalNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HasChiefComplaintAndReasonForVisitChiefComplaintOrReasonForVisit(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2DoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2DoesNotHaveChiefComplaintAndReasonForVisitWithChiefComplaintSectionOrReasonSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2InformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InformationRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2InFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InFulfillmentOf(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2AllergiesSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2AssessmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2AssessmentSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2PlanOfTreatmentSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2AssessmentAndPlanSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ChiefComplaintSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ChiefComplaintAndReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2GeneralStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2GeneralStatusSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HistoryOfPastIllnessSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2HistoryOfPresentIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ImmunizationsSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2InstructionsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InstructionsSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2MedicationsSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2PhysicalExamSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2PhysicalExamSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ProblemSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ProceduresSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ResultsSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ReviewOfSystemsSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2SocialHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2SocialHistorySection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2VitalSignsSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2FamilyHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2FamilyHistorySection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2InformationRecipientIntendedRecipient(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ParticipantIfParTypeCodeINDThenAEClassCodeIND(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterEncounterParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounterLocation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateHistoryAndPhysicalNote2ComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSectionEntriesOptional2 getAllergiesSectionEntriesOptional2() {
		return HistoryAndPhysicalNote2Operations.getAllergiesSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection getAssessmentSection() {
		return HistoryAndPhysicalNote2Operations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 getPlanOfTreatmentSection2() {
		return HistoryAndPhysicalNote2Operations.getPlanOfTreatmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection2 getAssessmentAndPlanSection2() {
		return HistoryAndPhysicalNote2Operations.getAssessmentAndPlanSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection getChiefComplaintSection() {
		return HistoryAndPhysicalNote2Operations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return HistoryAndPhysicalNote2Operations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection getGeneralStatusSection() {
		return HistoryAndPhysicalNote2Operations.getGeneralStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2() {
		return HistoryAndPhysicalNote2Operations.getHistoryOfPastIllnessSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection() {
		return HistoryAndPhysicalNote2Operations.getHistoryOfPresentIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional2 getImmunizationsSectionEntriesOptional2() {
		return HistoryAndPhysicalNote2Operations.getImmunizationsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionsSection2 getInstructionsSection2() {
		return HistoryAndPhysicalNote2Operations.getInstructionsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSectionEntriesOptional2 getMedicationsSectionEntriesOptional2() {
		return HistoryAndPhysicalNote2Operations.getMedicationsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection2 getPhysicalExamSection2() {
		return HistoryAndPhysicalNote2Operations.getPhysicalExamSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSectionEntriesOptional2 getProblemSectionEntriesOptional2() {
		return HistoryAndPhysicalNote2Operations.getProblemSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional2 getProceduresSectionEntriesOptional2() {
		return HistoryAndPhysicalNote2Operations.getProceduresSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection getReasonForVisitSection() {
		return HistoryAndPhysicalNote2Operations.getReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSectionEntriesOptional2 getResultsSectionEntriesOptional2() {
		return HistoryAndPhysicalNote2Operations.getResultsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return HistoryAndPhysicalNote2Operations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection2 getSocialHistorySection2() {
		return HistoryAndPhysicalNote2Operations.getSocialHistorySection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSectionEntriesOptional2 getVitalSignsSectionEntriesOptional2() {
		return HistoryAndPhysicalNote2Operations.getVitalSignsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection2 getFamilyHistorySection2() {
		return HistoryAndPhysicalNote2Operations.getFamilyHistorySection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote2Operations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryAndPhysicalNote2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryAndPhysicalNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HistoryAndPhysicalNote2Impl
