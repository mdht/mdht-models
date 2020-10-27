/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintAndReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsultationNote2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConsultationNote2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consultation Note2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConsultationNote2Impl extends USRealmHeader2Impl implements ConsultationNote2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsultationNote2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.CONSULTATION_NOTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2HasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2DoesNotHaveAssementAndPlanSection2WhenAssementOrPlanOfTreatment2ArePresent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2DoesNotHaveChiefComplaintWithChiefComplaintOrReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2HasAnAssementAndPlanSectionOrIndividualAssementAndPlanSections(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2CodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2CodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2Participant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2Participant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2InFulfillmentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2AssessmentSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2AssessmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2AssessmentAndPlanSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2AssessmentAndPlanSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2PlanOfTreatmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2PlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ReasonForVisitSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2HistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2HistoryOfPresentIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2PhysicalExamSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2PhysicalExamSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2AllergiesSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2AllergiesSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ChiefComplaintSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ChiefComplaintSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ChiefComplaintAndReasonForVisitSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ChiefComplaintAndReasonForVisitSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2GeneralStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2GeneralStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2HistoryOfPastIllnessSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2HistoryOfPastIllnessSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ImmunizationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ImmunizationsSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2MedicationsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2MedicationsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ProblemSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ProblemSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ProceduresSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ProceduresSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ResultsSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ResultsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2SocialHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2SocialHistorySection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2VitalSignsSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2VitalSignsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2AdvanceDirectivesSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2AdvanceDirectivesSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2FunctionalStatusSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2FunctionalStatusSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2MedicalEquipmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2MedicalEquipmentSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2MentalStatusSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2MentalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2NutritionSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2NutritionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2FamilyHistorySection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2FamilyHistorySection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAssociatedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntityScopingOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ParticipantAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ParticipantAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2InFulfillmentOfOrderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOfOrderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2InFulfillmentOfOrder(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2InFulfillmentOfOrder(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheDayIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheMinuteIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTPreciseToTheSecondIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterGeneralHeaderConstraintsUSRealmDateAndTimeDTIfMorePreciseThanDayIncludeTimeZoneOffsetIVLTS(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntityHasPersonOrganizationOrBoth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsiblePartyAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipantAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterResponsibleParty(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounterEncounterParticipant(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote2ComponentOfEncompassingEncounter(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ConsultationNote2Operations.validateConsultationNote2ComponentOfEncompassingEncounter(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection getAssessmentSection() {
		return ConsultationNote2Operations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection2 getAssessmentAndPlanSection2() {
		return ConsultationNote2Operations.getAssessmentAndPlanSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 getPlanOfTreatmentSection2() {
		return ConsultationNote2Operations.getPlanOfTreatmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForVisitSection getReasonForVisitSection() {
		return ConsultationNote2Operations.getReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection() {
		return ConsultationNote2Operations.getHistoryOfPresentIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection2 getPhysicalExamSection2() {
		return ConsultationNote2Operations.getPhysicalExamSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection2 getAllergiesSection2() {
		return ConsultationNote2Operations.getAllergiesSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSection getChiefComplaintSection() {
		return ConsultationNote2Operations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintAndReasonForVisitSection getChiefComplaintAndReasonForVisitSection() {
		return ConsultationNote2Operations.getChiefComplaintAndReasonForVisitSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection getGeneralStatusSection() {
		return ConsultationNote2Operations.getGeneralStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2() {
		return ConsultationNote2Operations.getHistoryOfPastIllnessSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional2 getImmunizationsSectionEntriesOptional2() {
		return ConsultationNote2Operations.getImmunizationsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection2 getMedicationsSection2() {
		return ConsultationNote2Operations.getMedicationsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection2 getProblemSection2() {
		return ConsultationNote2Operations.getProblemSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional2 getProceduresSectionEntriesOptional2() {
		return ConsultationNote2Operations.getProceduresSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection2 getResultsSection2() {
		return ConsultationNote2Operations.getResultsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection2 getSocialHistorySection2() {
		return ConsultationNote2Operations.getSocialHistorySection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection2 getVitalSignsSection2() {
		return ConsultationNote2Operations.getVitalSignsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSectionEntriesOptional2 getAdvanceDirectivesSectionEntriesOptional2() {
		return ConsultationNote2Operations.getAdvanceDirectivesSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection2 getFunctionalStatusSection2() {
		return ConsultationNote2Operations.getFunctionalStatusSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return ConsultationNote2Operations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection2 getMedicalEquipmentSection2() {
		return ConsultationNote2Operations.getMedicalEquipmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusSection getMentalStatusSection() {
		return ConsultationNote2Operations.getMentalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionSection getNutritionSection() {
		return ConsultationNote2Operations.getNutritionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection2 getFamilyHistorySection2() {
		return ConsultationNote2Operations.getFamilyHistorySection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateUSRealmHeader2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsultationNote2Operations.validateUSRealmHeader2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationNote2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsultationNote2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ConsultationNote2Impl
