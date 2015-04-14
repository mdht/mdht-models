/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectivesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentAndPlanSection2;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DischargeDiagnosisSection2;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection2;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPresentIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSectionEntriesOptional2;
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.NutritionSection;
import org.openhealthtools.mdht.uml.cda.consol.PayersSection2;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection2;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfTreatmentSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReasonForReferralSection2;
import org.openhealthtools.mdht.uml.cda.consol.ResultsSection2;
import org.openhealthtools.mdht.uml.cda.consol.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.consol.SocialHistorySection2;
import org.openhealthtools.mdht.uml.cda.consol.TransferSummary;

import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.TransferSummaryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TransferSummaryImpl extends USRealmHeader2Impl implements TransferSummary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.TRANSFER_SUMMARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryHasAnAssementAndPlanSection2OrBothAssementSectionAndPlanOfTreatmentSection2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDoesNotHaveAssementAndPlanSection2WhenAssementAndPlanOfTreatment2ArePresent(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupport(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupport(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContact(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContact(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOf(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryAdvanceDirectivesSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryAdvanceDirectivesSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryAllergiesSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryAllergiesSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryPhysicalExamSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryPhysicalExamSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryEncountersSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryEncountersSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryFunctionalStatusSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryFunctionalStatusSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryHospitalDischargeDiagnosis2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryHospitalDischargeDiagnosis2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryImmunizationsSectionEntriesOptional2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryImmunizationsSectionEntriesOptional2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryMedicalEquipmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryMedicalEquipmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryMedicationsSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryMedicationsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryPayersSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryPayersSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryPlanOfTreatmentSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryPlanOfTreatmentSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryProblemSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryProblemSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryProceduresSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryProceduresSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryResultsSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryResultsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummarySocialHistorySection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummarySocialHistorySection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryVitalSignsSection2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryVitalSignsSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryMentalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryMentalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryGeneralStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryGeneralStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryReviewOfSystemsSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryReviewOfSystemsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryNutritionSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryNutritionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryReasonForReferralSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryReasonForReferralSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryHistoryOfPastIllnessSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryHistoryOfPastIllnessSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryHistoryOfPresentIllnessSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryHistoryOfPresentIllnessSection(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryAssessmentAndPlanSection2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryAssessmentAndPlanSection2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferSummaryAssessmentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryAssessmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryIIRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryIIRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantSupportAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantSupportAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPersonName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityAssociatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntityScopingOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryParticipantCallbackContactAssociatedEntity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryParticipantCallbackContactAssociatedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerTypeCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformerAssignedEntity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventClassCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEventPerformer1(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEventPerformer1(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTransferSummaryDocumentationOfServiceEvent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TransferSummaryOperations.validateTransferSummaryDocumentationOfServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection2 getAdvanceDirectivesSection2() {
		return TransferSummaryOperations.getAdvanceDirectivesSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergiesSection2 getAllergiesSection2() {
		return TransferSummaryOperations.getAllergiesSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExamSection2 getPhysicalExamSection2() {
		return TransferSummaryOperations.getPhysicalExamSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection2 getEncountersSection2() {
		return TransferSummaryOperations.getEncountersSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return TransferSummaryOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection2 getFunctionalStatusSection2() {
		return TransferSummaryOperations.getFunctionalStatusSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeDiagnosisSection2 getHospitalDischargeDiagnosis2() {
		return TransferSummaryOperations.getHospitalDischargeDiagnosis2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSectionEntriesOptional2 getImmunizationsSectionEntriesOptional2() {
		return TransferSummaryOperations.getImmunizationsSectionEntriesOptional2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection2 getMedicalEquipmentSection2() {
		return TransferSummaryOperations.getMedicalEquipmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection2 getMedicationsSection2() {
		return TransferSummaryOperations.getMedicationsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection2 getPayersSection2() {
		return TransferSummaryOperations.getPayersSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfTreatmentSection2 getPlanOfTreatmentSection2() {
		return TransferSummaryOperations.getPlanOfTreatmentSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection2 getProblemSection2() {
		return TransferSummaryOperations.getProblemSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection2 getProceduresSection2() {
		return TransferSummaryOperations.getProceduresSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection2 getResultsSection2() {
		return TransferSummaryOperations.getResultsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection2 getSocialHistorySection2() {
		return TransferSummaryOperations.getSocialHistorySection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection2 getVitalSignsSection2() {
		return TransferSummaryOperations.getVitalSignsSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusSection getMentalStatusSection() {
		return TransferSummaryOperations.getMentalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection getGeneralStatusSection() {
		return TransferSummaryOperations.getGeneralStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSection getReviewOfSystemsSection() {
		return TransferSummaryOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionSection getNutritionSection() {
		return TransferSummaryOperations.getNutritionSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonForReferralSection2 getReasonForReferralSection2() {
		return TransferSummaryOperations.getReasonForReferralSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPastIllnessSection2 getHistoryOfPastIllnessSection2() {
		return TransferSummaryOperations.getHistoryOfPastIllnessSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllnessSection getHistoryOfPresentIllnessSection() {
		return TransferSummaryOperations.getHistoryOfPresentIllnessSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection2 getAssessmentAndPlanSection2() {
		return TransferSummaryOperations.getAssessmentAndPlanSection2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSection getAssessmentSection() {
		return TransferSummaryOperations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TransferSummaryOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferSummary init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferSummary init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // TransferSummaryImpl
